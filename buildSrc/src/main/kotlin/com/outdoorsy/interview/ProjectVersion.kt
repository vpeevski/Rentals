package com.outdoorsy.interview

data class ProjectVersion(
    val major: Int,
    val minor: Int,
    var release: Boolean = true
) {
    override fun toString(): String = "$major.$minor${if (release) "" else "-SNAPSHOT"}"
}