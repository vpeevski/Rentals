package com.outdoorsy.interview.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import com.outdoorsy.interview.navigation.AllRentals
import com.outdoorsy.interview.navigation.Home
import com.outdoorsy.interview.navigation.SingleRentalDetails
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

sealed interface ScreenState {
    val route: String
    val isTopBarVisible: Boolean
    val title: String?
    val navigationAction: ActionMenuItem
    val actions: List<ActionMenuItem>
}

sealed class ScreenWithButtons : ScreenState {
    protected val buttons = MutableSharedFlow<ActionMenuItemType>(replay = 1)
    val buttonsFlow = buttons.asSharedFlow()
}

class HomeScreenState : ScreenWithButtons() {
    override val route: String = Home.route
    override val isTopBarVisible: Boolean = true
    override val navigationAction: ActionMenuItem = ActionMenuItem.None
    override val title: String? = Home.title
    override val actions: List<ActionMenuItem> = listOf(
        ActionMenuItem.AlwaysShown(
            type = ActionMenuItemType.Login,
            title = "Login",
            onClick = {
                buttons.tryEmit(ActionMenuItemType.Login)
            },
            icon = Icons.Filled.Person,
            contentDescription = null,
        )
    )
}

class RentalsScreenState : ScreenWithButtons() {
    override val route: String
        get() = AllRentals.route
    override val isTopBarVisible: Boolean
        get() = true
    override val navigationAction: ActionMenuItem
        get() = ActionMenuItem.Back(
            onClick = {
                buttons.tryEmit(ActionMenuItemType.Back)
            }
        )
    override val title: String?
        get() = AllRentals.title
    override val actions: List<ActionMenuItem>
        get() = listOf(
            ActionMenuItem.AlwaysShown(
                type = ActionMenuItemType.Settings,
                title = "Setting",
                onClick = {
                    buttons.tryEmit(ActionMenuItemType.Settings)
                },
                icon = Icons.Filled.Settings,
                contentDescription = "Settings",
            ),
            ActionMenuItem.AlwaysShown(
                type = ActionMenuItemType.Login,
                title = "Login",
                onClick = {
                    buttons.tryEmit(ActionMenuItemType.Login)
                },
                icon = Icons.Filled.Person,
                contentDescription = null,
            )
        )

}

class RentalDetailsScreenState : ScreenWithButtons() {
    override val route: String
        get() = SingleRentalDetails.route
    override val isTopBarVisible: Boolean
        get() = true
    override val navigationAction: ActionMenuItem
        get() = ActionMenuItem.Back(
            onClick = {
                buttons.tryEmit(ActionMenuItemType.Back)
            }
        )
    override val title: String?
        get() = SingleRentalDetails.title

    private var _favIcon by mutableStateOf(Icons.Default.FavoriteBorder)
    override val actions: List<ActionMenuItem>
        get() = listOf(
            ActionMenuItem.AlwaysShown(
                type = ActionMenuItemType.Favourites,
                title = "Favourites",
                onClick = {
                    buttons.tryEmit(ActionMenuItemType.Favourites)
                },
                icon = _favIcon,
                contentDescription = null,
            ),
            ActionMenuItem.AlwaysShown(
                type = ActionMenuItemType.Login,
                title = "Login",
                onClick = {
                    buttons.tryEmit(ActionMenuItemType.Login)
                },
                icon = Icons.Filled.Person,
                contentDescription = null,
            )
        )

    fun setFavIcon(icon: ImageVector) {
        _favIcon = icon
    }

}

enum class ActionMenuItemType {
    Back, Forward, Login, Settings, Favourites, None
}

sealed interface ActionMenuItem {
    val type: ActionMenuItemType
    val title: String
    val onClick: (() -> Unit)?
    val icon: ImageVector?
    val contentDescription: String?

    data class AlwaysShown(
        override val type: ActionMenuItemType,
        override val title: String,
        override val onClick: (() -> Unit)?,
        override val icon: ImageVector?,
        override val contentDescription: String?
    ) : ActionMenuItem

    data class Back(
        override val type: ActionMenuItemType = ActionMenuItemType.Back,
        override val title: String = "Back",
        override val onClick: (() -> Unit)?,
        override val icon: ImageVector? = Icons.Filled.ArrowBack,
        override val contentDescription: String? = "Go to previous page"
    ) : ActionMenuItem

    object None : ActionMenuItem {
        override val type: ActionMenuItemType
            get() = ActionMenuItemType.None
        override val title: String
            get() = ""
        override val onClick: (() -> Unit)?
            get() = { }
        override val icon: ImageVector?
            get() = null
        override val contentDescription: String?
            get() = ""

    }
}

//fun screenForRoute(route: String?): ScreenState? = ScreenState::class.nestedClasses.map { kClass ->
//    kClass.objectInstance as ScreenState
//}.firstOrNull { screenState -> screenState.route == route }

fun screenForRoute(route: String?): ScreenWithButtons? = route?.let {
    when {
        it == Home.route -> HomeScreenState()
        it == AllRentals.route -> RentalsScreenState()
        it.startsWith(SingleRentalDetails.route) -> RentalDetailsScreenState()
        else -> null
    }
}