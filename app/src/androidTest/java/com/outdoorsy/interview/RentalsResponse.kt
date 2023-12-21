package com.outdoorsy.interview

import com.outdoorsy.interview.rentals.RentAttributes
import com.outdoorsy.interview.rentals.Rental
import com.outdoorsy.interview.rentals.RentalsResponse

val RentalsResponsePage1Stub = RentalsResponse(
    listOf(
        Rental("1", RentAttributes("Rental Name 1"), "Image URL 1"),
        Rental("2", RentAttributes("Rental Name 2"), "Image URL 2"),
        Rental("3", RentAttributes("Rental Name 3"), "Image URL 3"),
        Rental("4", RentAttributes("Rental Name 4"), "Image URL 4"),
        Rental("5", RentAttributes("Rental Name 5"), "Image URL 5"),
        Rental("6", RentAttributes("Rental Name 6"), "Image URL 6"),
//        Rental("7", RentAttributes("Rental Name 7"), "Image URL 7"),
//        Rental("8", RentAttributes("Rental Name 8"), "Image URL 8")
    ),
    emptyList()
)

val RentalsResponsePage2Stub = RentalsResponse(
    listOf(
        Rental("7", RentAttributes("Rental Name 7"), "Image URL 7"),
        Rental("8", RentAttributes("Rental Name 8"), "Image URL 8"),
        Rental("9", RentAttributes("Rental Name 9"), "Image URL 9"),
        Rental("10", RentAttributes("Rental Name 10"), "Image URL 10"),
        Rental("11", RentAttributes("Rental Name 11"), "Image URL 11"),
        Rental("12", RentAttributes("Rental Name 12"), "Image URL 12"),
//        Rental("7", RentAttributes("Rental Name 7"), "Image URL 7"),
//        Rental("8", RentAttributes("Rental Name 8"), "Image URL 8")
    ),
    emptyList()
)

val RentalsResponseJson = """
    {
        "data": [
            {
                "id": "165446",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 2,
                        "monthly_discount_percentage": 0,
                        "monthly_rate_per_day": 6000,
                        "price_per_day": 6000,
                        "price_per_month": 168000,
                        "price_per_week": 42000,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 0,
                        "weekly_rate_per_day": 6000
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 25,
                    "delivery_usage_item_id": 192049,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "",
                    "description_other": "",
                    "description_recommendations": "",
                    "display_vehicle_type": "",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 0,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "base_weight": 1395,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": false,
                        "carrying_capacity": 3000,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "connector_type": null,
                        "dining_table": false,
                        "extra_storage": false,
                        "festival_friendly": false,
                        "generator": false,
                        "gray_tank": 0,
                        "gross_vehicle_weight": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 130,
                        "hookup_electric": false,
                        "hookup_sewer": false,
                        "hookup_water": false,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": false,
                        "propane_tank": 0,
                        "provides_receivers": false,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": false,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": false,
                        "toilet": false,
                        "tow_hitch": true,
                        "trailer_weight": 1395,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2020-05-28T15:09:23.844568-07:00",
                    "generator_usage_item_id": 192051,
                    "group_on_map": true,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2020-05-28T15:09:23.844511-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Bergenfield",
                        "country": "US",
                        "county": "",
                        "lat": 40.92,
                        "lng": -74.001,
                        "state": "NJ",
                        "zip": "07621"
                    },
                    "mileage_usage_item_id": 192050,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 0,
                    "name": "2019",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 0,
                        "description": ""
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 6000,
                    "price_per_month": 162000,
                    "price_per_week": 36000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1590703516/p/rentals/165446/images/uwmypsci3ltwvftvehle.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.3943,
                        "ranking_score2": 0.3935,
                        "ranking_score3": 0.3943
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": [
                            {
                                "id": 202486,
                                "title": "Utility Trailer rental by location",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental"
                            },
                            {
                                "id": 203894,
                                "title": "New Jersey Utility Trailer rental",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental/NJ"
                            }
                        ]
                    },
                    "settlement_currency": "USD",
                    "sleeps": 0,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/bergenfield_nj/2019___165446-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.576045,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "utility-trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 1395,
                    "vehicle_gvwr": 4395,
                    "vehicle_height": 0,
                    "vehicle_length": 5,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NJ",
                    "vehicle_make": "Carry-on",
                    "vehicle_model": "utility trailer",
                    "vehicle_title": "2019 Carry-on utility trailer",
                    "vehicle_width": 0,
                    "vehicle_year": 2019,
                    "weekly_discount": 0
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "192051",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "1300390",
                                "type": "images"
                            },
                            {
                                "id": "1300391",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "192050",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "1115997",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "1300390",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "384054",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 2,
                        "monthly_discount_percentage": 20,
                        "monthly_rate_per_day": 5200,
                        "price_per_day": 6500,
                        "price_per_month": 145600,
                        "price_per_week": 40950,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 10,
                        "weekly_rate_per_day": 5850
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 100,
                    "delivery_usage_item_id": 487918,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "fresh linens, camping chairs. ",
                    "description_other": "No smoking ",
                    "description_recommendations": "",
                    "display_vehicle_type": "Folding trailer",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 2,
                    "features": {
                        "air_conditioner": true,
                        "audio_inputs": true,
                        "awning": true,
                        "backup_camera": false,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 2,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": true,
                        "cd_player": false,
                        "ceiling_fan": true,
                        "connector_type": null,
                        "dining_table": true,
                        "extra_storage": true,
                        "festival_friendly": false,
                        "generator": true,
                        "gray_tank": 0,
                        "handicap_accessible": false,
                        "heater": true,
                        "hitch_weight": null,
                        "hookup_electric": true,
                        "hookup_sewer": true,
                        "hookup_water": true,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": true,
                        "leveling_jacks": true,
                        "microwave": true,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": true,
                        "oven": false,
                        "pet_friendly": true,
                        "propane_tank": 15,
                        "provides_receivers": false,
                        "radio": true,
                        "refrigerator": true,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": true,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": true,
                        "stove": true,
                        "tailgate_friendly": false,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": null,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 30,
                        "wifi": false
                    },
                    "first_published": "2023-09-11T15:04:51.530602-07:00",
                    "generator_usage_item_id": 487920,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2023-09-11T15:04:51.530544-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Brooklyn",
                        "country": "US",
                        "county": "",
                        "lat": 40.594,
                        "lng": -73.926,
                        "state": "NY",
                        "zip": "11229"
                    },
                    "mileage_usage_item_id": 487921,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 2000,
                    "name": "Cozy, Easy to Towing, Lovely Pop Up Camper in Brooklyn",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 5000,
                        "description": "This fee will cover preparing and sanitizing the unit prior to each rental."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 6500,
                    "price_per_month": 157950,
                    "price_per_week": 39000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469620/p/rentals/384054/images/xrkwyplzdalexmtnsvcs.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.231,
                        "ranking_score2": 0.522,
                        "ranking_score3": 0.231
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 4,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": []
                    },
                    "settlement_currency": "USD",
                    "sleeps": 4,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/brooklyn_ny/2005_1pac56r145m028597_palomino-pony_384054-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.5419297,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "folding-trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 0,
                    "vehicle_height": 0,
                    "vehicle_length": 16,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NY",
                    "vehicle_make": "1PAC56R145M028597",
                    "vehicle_model": "Palomino Pony",
                    "vehicle_title": "2005 1PAC56R145M028597 Palomino Pony",
                    "vehicle_width": 0,
                    "vehicle_year": 2005,
                    "weekly_discount": 1000
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "487920",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "3244499",
                                "type": "images"
                            },
                            {
                                "id": "3244501",
                                "type": "images"
                            },
                            {
                                "id": "3244498",
                                "type": "images"
                            },
                            {
                                "id": "3244500",
                                "type": "images"
                            },
                            {
                                "id": "3244503",
                                "type": "images"
                            },
                            {
                                "id": "3244504",
                                "type": "images"
                            },
                            {
                                "id": "3244505",
                                "type": "images"
                            },
                            {
                                "id": "3244506",
                                "type": "images"
                            },
                            {
                                "id": "3244507",
                                "type": "images"
                            },
                            {
                                "id": "3244508",
                                "type": "images"
                            },
                            {
                                "id": "3244509",
                                "type": "images"
                            },
                            {
                                "id": "3244510",
                                "type": "images"
                            },
                            {
                                "id": "3244511",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "487921",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "2221265",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "3244499",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "174763",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 2,
                        "monthly_discount_percentage": 0,
                        "monthly_rate_per_day": 5400,
                        "price_per_day": 5400,
                        "price_per_month": 151200,
                        "price_per_week": 37800,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 0,
                        "weekly_rate_per_day": 5400
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": false,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": false,
                    "delivery_radius": 0,
                    "delivery_usage_item_id": 206073,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "",
                    "description_other": "",
                    "description_recommendations": "",
                    "display_vehicle_type": "",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 1,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "base_weight": 1395,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "burning_man_friendly": true,
                        "carrying_capacity": 3000,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "dining_table": false,
                        "extra_storage": false,
                        "festival_friendly": true,
                        "generator": false,
                        "gray_tank": 0,
                        "gross_vehicle_weight": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 130,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": true,
                        "propane_tank": 0,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": false,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": true,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 1395,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2020-07-11T20:37:56.451199-07:00",
                    "generator_usage_item_id": 0,
                    "group_on_map": true,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": false,
                    "insurance_renter_adjustable": false,
                    "insurance_state": "",
                    "last_published": "2020-07-11T20:37:56.45117-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "SUCCASUNNA",
                        "country": "US",
                        "county": "",
                        "lat": 40.866,
                        "lng": -74.635,
                        "state": "NJ",
                        "zip": "07876"
                    },
                    "mileage_usage_item_id": 206071,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 0,
                    "name": "2018  Enclosed Trailer with man door",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 0,
                        "description": ""
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 5400,
                    "price_per_month": 145800,
                    "price_per_week": 32400,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1594524993/p/rentals/174763/images/eubalpa3ri23qnuhholk.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.549,
                        "ranking_score2": 0.5821,
                        "ranking_score3": 0.549
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": [
                            {
                                "id": 202486,
                                "title": "Utility Trailer rental by location",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental"
                            },
                            {
                                "id": 203894,
                                "title": "New Jersey Utility Trailer rental",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental/NJ"
                            }
                        ]
                    },
                    "settlement_currency": "USD",
                    "sleeps": 0,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/succasunna_nj/2018___174763-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.4736276,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "utility-trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 1395,
                    "vehicle_gvwr": 4395,
                    "vehicle_height": 0,
                    "vehicle_length": 15,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "",
                    "vehicle_make": "",
                    "vehicle_model": "",
                    "vehicle_title": "2018 Vehicle",
                    "vehicle_width": 0,
                    "vehicle_year": 2018,
                    "weekly_discount": 0
                },
                "relationships": {
                    "images": {
                        "data": [
                            {
                                "id": "1376814",
                                "type": "images"
                            },
                            {
                                "id": "1376813",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "206071",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "1423109",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "1376814",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "264037",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "moderate",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 2,
                        "monthly_discount_percentage": 20,
                        "monthly_rate_per_day": 4000,
                        "price_per_day": 5000,
                        "price_per_month": 112000,
                        "price_per_week": 31500,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 10,
                        "weekly_rate_per_day": 4500
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "moderate",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 25,
                    "delivery_usage_item_id": 323945,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "Trailer is empty with the exception of shelving for smaller items.",
                    "description_other": "Any questions?,.. just ask ! ",
                    "description_recommendations": "-Daytona International Speedway.🏎🏁\n-Pocono Raceway 🏎🏁\n-Dover International Speedway 🏎🏁\n-Giants stadium 🏈\n-Rutgers college \n-Ramapo college \n- Plus more ! ",
                    "display_vehicle_type": "",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 0,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": true,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "connector_type": "4pin",
                        "dining_table": false,
                        "extra_storage": true,
                        "festival_friendly": false,
                        "generator": false,
                        "gray_tank": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 100,
                        "hookup_electric": false,
                        "hookup_sewer": false,
                        "hookup_water": false,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": true,
                        "propane_tank": 0,
                        "provides_receivers": false,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": true,
                        "slide_outs": 0,
                        "smoking_allowed": true,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": true,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 1200,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2021-09-30T12:19:57.496806-07:00",
                    "generator_usage_item_id": 0,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "No climbing on the Roof.\nDrive safely in accordance with local and state laws. ",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2021-09-30T12:19:57.496751-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Woodcliff Lake",
                        "country": "US",
                        "county": "",
                        "lat": 41.019,
                        "lng": -74.035,
                        "state": "NJ",
                        "zip": "07677"
                    },
                    "mileage_usage_item_id": 323947,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 2000,
                    "name": "2011 Pace American 6X10 Enclosed trailer. 2inch ball. Great for tailgating",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 0,
                        "description": ""
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 5000,
                    "price_per_month": 121500,
                    "price_per_week": 30000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296479/undefined/rentals/264037/images/ludrrgfcokazg27krg4u.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.4745,
                        "ranking_score2": 0.5936,
                        "ranking_score3": 0.4745
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": [
                            {
                                "id": 202486,
                                "title": "Utility Trailer rental by location",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental"
                            },
                            {
                                "id": 203894,
                                "title": "New Jersey Utility Trailer rental",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental/NJ"
                            }
                        ]
                    },
                    "settlement_currency": "USD",
                    "sleeps": 0,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/woodcliff-lake_nj/2011_pace-american_enclosed-trailer_264037-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.440976,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "utility-trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 3200,
                    "vehicle_height": 0,
                    "vehicle_length": 10,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NJ",
                    "vehicle_make": "Pace American",
                    "vehicle_model": "Other",
                    "vehicle_title": "2011 Pace American Other",
                    "vehicle_width": 0,
                    "vehicle_year": 2011,
                    "weekly_discount": 1000
                },
                "relationships": {
                    "images": {
                        "data": [
                            {
                                "id": "2159333",
                                "type": "images"
                            },
                            {
                                "id": "2155830",
                                "type": "images"
                            },
                            {
                                "id": "2159328",
                                "type": "images"
                            },
                            {
                                "id": "2159329",
                                "type": "images"
                            },
                            {
                                "id": "2159330",
                                "type": "images"
                            },
                            {
                                "id": "2159331",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "323947",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "2459751",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "2159333",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "174761",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 1,
                        "monthly_discount_percentage": 18,
                        "monthly_rate_per_day": 4280,
                        "price_per_day": 5220,
                        "price_per_month": 119840,
                        "price_per_week": 36540,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 0,
                        "weekly_rate_per_day": 5220
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": false,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": false,
                    "delivery_radius": 0,
                    "delivery_usage_item_id": 206070,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "",
                    "description_other": "",
                    "description_recommendations": "",
                    "display_vehicle_type": "",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 0,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "base_weight": 1200,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "burning_man_friendly": false,
                        "carrying_capacity": 3000,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "dining_table": false,
                        "extra_storage": false,
                        "generator": false,
                        "gray_tank": 0,
                        "gross_vehicle_weight": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 150,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": false,
                        "propane_tank": 0,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": false,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": false,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 1200,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 11,
                        "wifi": false
                    },
                    "first_published": "2020-07-11T20:31:14.292265-07:00",
                    "generator_usage_item_id": 0,
                    "group_on_map": true,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": false,
                    "insurance_renter_adjustable": false,
                    "insurance_state": "",
                    "last_published": "2020-07-11T20:31:14.292241-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "SUCCASUNNA",
                        "country": "US",
                        "county": "",
                        "lat": 40.866,
                        "lng": -74.635,
                        "state": "NJ",
                        "zip": "07876"
                    },
                    "mileage_usage_item_id": 206069,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 0,
                    "name": "2015  Flat bed 6x8 wood deck.",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 0,
                        "description": ""
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 5220,
                    "price_per_month": 140940,
                    "price_per_week": 31320,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1594523936/p/rentals/174761/images/tfovsbyhal6igipgm6kb.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.5318,
                        "ranking_score2": 0.58,
                        "ranking_score3": 0.5318
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": [
                            {
                                "id": 202486,
                                "title": "Utility Trailer rental by location",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental"
                            },
                            {
                                "id": 203894,
                                "title": "New Jersey Utility Trailer rental",
                                "url": "https://www.outdoorsy.com/rv-makes-types/utility-trailer-rental/NJ"
                            }
                        ]
                    },
                    "settlement_currency": "USD",
                    "sleeps": 0,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/succasunna_nj/2015___174761-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.41763,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "utility-trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 1200,
                    "vehicle_gvwr": 4200,
                    "vehicle_height": 0,
                    "vehicle_length": 8,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "",
                    "vehicle_make": "",
                    "vehicle_model": "",
                    "vehicle_title": "2015 Vehicle",
                    "vehicle_width": 0,
                    "vehicle_year": 2015,
                    "weekly_discount": 0
                },
                "relationships": {
                    "images": {
                        "data": [
                            {
                                "id": "1376807",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "206069",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "1423109",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "1376807",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "309796",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 1,
                        "monthly_discount_percentage": 2,
                        "monthly_rate_per_day": 12250,
                        "price_per_day": 12500,
                        "price_per_month": 343000,
                        "price_per_week": 85750,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 2,
                        "weekly_rate_per_day": 12250
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": false,
                    "delivery_radius": 0,
                    "delivery_usage_item_id": 0,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "Straps For Rent\nTow Hitch\n",
                    "description_other": "This Is 17ft Car Hauler. Local and long distance transport \nI take a deposit and also CC on file with proof of insurance. ",
                    "description_recommendations": "Local Transport \nBut Willing To Work Out Special Pricing.",
                    "display_vehicle_type": "Other",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 0,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "base_weight": 0,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": false,
                        "carrying_capacity": 0,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "connector_type": null,
                        "dining_table": false,
                        "extra_storage": false,
                        "festival_friendly": false,
                        "fuel_tank": 0,
                        "fuel_type": "",
                        "generator": false,
                        "gray_tank": 0,
                        "gross_vehicle_weight": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 0,
                        "hookup_electric": false,
                        "hookup_sewer": false,
                        "hookup_water": false,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": false,
                        "propane_tank": 0,
                        "provides_receivers": false,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": false,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": false,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 0,
                        "transmission": "",
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2022-06-20T04:12:53.382159-07:00",
                    "generator_usage_item_id": 382726,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": false,
                    "insurance_plan": {
                        "id": 96,
                        "label": "Outdoorsy Drivable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2022-06-20T04:12:53.382106-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Lindenhurst",
                        "country": "US",
                        "county": "",
                        "lat": 40.666,
                        "lng": -73.384,
                        "state": "NY",
                        "zip": "11757"
                    },
                    "mileage_usage_item_id": 382727,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 200,
                    "name": "Beast Car Hauler",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 12500,
                        "description": "This fee will cover preparing and sanitizing the unit prior to each rental."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 12500,
                    "price_per_month": 330750,
                    "price_per_week": 75000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1655722379/p/rentals/309796/images/hlfe5cccvasxwmwqcnzb.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.5147,
                        "ranking_score2": 0.5064,
                        "ranking_score3": 0.5147
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 1,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": []
                    },
                    "settlement_currency": "USD",
                    "sleeps": 1,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/lindenhurst_ny/2022_beast_beast_309796-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.3755822,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "other",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 0,
                    "vehicle_height": 0,
                    "vehicle_length": 17,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NY",
                    "vehicle_make": "Beast",
                    "vehicle_model": "Beast",
                    "vehicle_title": "2022 Beast Beast",
                    "vehicle_width": 0,
                    "vehicle_year": 2022,
                    "weekly_discount": 200
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "382726",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "2558586",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "382727",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "2893806",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "2558586",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "378653",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "moderate",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 1,
                        "monthly_discount_percentage": 20,
                        "monthly_rate_per_day": 7600,
                        "price_per_day": 9500,
                        "price_per_month": 212800,
                        "price_per_week": 59850,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 10,
                        "weekly_rate_per_day": 8550
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "moderate",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": false,
                    "delivery_radius": 0,
                    "delivery_usage_item_id": 0,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "All you need to bring is your bathing suit and stuff to throw on the grill.\n\nWe've got you covered on linens, towels, everything for the kitchen and bathroom, bikes, paddles board, BBQ, hot tub, fire pit. ",
                    "description_other": "We welcome your pets upon approval.\n\nLong & short term stays available. \n\nPlease no smoking in or near the trailer. Smoking permitted only on the patio with an ashtray.\n\nNo candles or any open flame beside the ethanol fire pit. \n\nAny use of the waterfront is exclusively at your own risk. \n\n",
                    "description_recommendations": "The hiking & biking trails around City Island are phenomenal. Same with the seafood! \n\nThere are art galleries & performance spots which always have stuff going on. There's eclectic shopping, boating, fishing, paddle boarding, kayaking, horseback riding, golf (mini & full size), sunning and swimming at Orchard Beach, and the list goes on. We're a tiny island with lots of life! \n\nThere's also our favorite activity: sitting on the patio and watching the water. ",
                    "display_vehicle_type": "Travel trailer",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 5,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": false,
                        "cd_player": false,
                        "ceiling_fan": true,
                        "connector_type": null,
                        "dining_table": true,
                        "extra_storage": false,
                        "festival_friendly": false,
                        "generator": false,
                        "gray_tank": 0,
                        "handicap_accessible": false,
                        "heater": true,
                        "hitch_weight": 0,
                        "hookup_electric": false,
                        "hookup_sewer": false,
                        "hookup_water": false,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": true,
                        "leveling_jacks": false,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": true,
                        "propane_tank": 0,
                        "provides_receivers": false,
                        "radio": false,
                        "refrigerator": true,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": true,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": true,
                        "tailgate_friendly": false,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 0,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2023-08-07T15:41:04.084212-07:00",
                    "generator_usage_item_id": 480488,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2023-08-07T15:41:04.08417-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Bronx",
                        "country": "US",
                        "county": "",
                        "lat": 40.854,
                        "lng": -73.789,
                        "state": "NY",
                        "zip": "10464"
                    },
                    "mileage_usage_item_id": 480487,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 2000,
                    "name": "Vintage Airstream Glamping in NYC!",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 10000,
                        "description": "This fee will cover preparing and sanitizing the unit prior to each rental."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 9500,
                    "price_per_month": 230850,
                    "price_per_week": 57000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447169/p/rentals/378653/images/nnzz6jumtdskcpwytkqe.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.3235,
                        "ranking_score2": 0.2137,
                        "ranking_score3": 0.3235
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": [
                            {
                                "id": 199664,
                                "title": "Airstream RV rental by model",
                                "url": "https://www.outdoorsy.com/rv-makes-types/airstream-m"
                            },
                            {
                                "id": 199756,
                                "title": "Airstream Land RV rental",
                                "url": "https://www.outdoorsy.com/rv-makes-types/airstream-m/land"
                            }
                        ]
                    },
                    "settlement_currency": "USD",
                    "sleeps": 4,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/bronx_ny/1971_airstream_land-yacht_378653-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.3034694,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 0,
                    "vehicle_height": 0,
                    "vehicle_length": 32,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NY",
                    "vehicle_make": "Airstream",
                    "vehicle_model": "Land Yacht",
                    "vehicle_title": "1971 Airstream Land Yacht",
                    "vehicle_width": 0,
                    "vehicle_year": 1971,
                    "weekly_discount": 1000
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "480488",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "3196847",
                                "type": "images"
                            },
                            {
                                "id": "3196848",
                                "type": "images"
                            },
                            {
                                "id": "3196859",
                                "type": "images"
                            },
                            {
                                "id": "3196860",
                                "type": "images"
                            },
                            {
                                "id": "3196861",
                                "type": "images"
                            },
                            {
                                "id": "3196864",
                                "type": "images"
                            },
                            {
                                "id": "3196865",
                                "type": "images"
                            },
                            {
                                "id": "3196866",
                                "type": "images"
                            },
                            {
                                "id": "3196867",
                                "type": "images"
                            },
                            {
                                "id": "3196868",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "480487",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "3608586",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "3196847",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "285497",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "strict",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": true,
                        "minimum_days": 3,
                        "monthly_discount_percentage": 0,
                        "monthly_rate_per_day": 19995,
                        "price_per_day": 19995,
                        "price_per_month": 559860,
                        "price_per_week": 139965,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 0,
                        "weekly_rate_per_day": 19995
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "strict",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 30,
                    "delivery_usage_item_id": 350664,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "Includes: \n- Basic Kitchen Accessories (Pots & Pans, Plates, Cups, Silverware, etc.)\n- 3 Heated Queen mattresses\n- Hammock\nAvailable upon request:\n- Linens, Blankets, Pillows, Towels,\n- Paper Towels\n- Inflatable Rowboat\n- Kayaks\n- jump starter\n- Power supply/USB charger \n- Generator\n- Propane tanks\n- Flashlights\n- Kites\n- Life jackets\n- Outdoor chairs \n& many more t\n* Call to discuss when booking we can help you plan & prepare for your trip to take the stress away.",
                    "description_other": "Inspection before and after is mandatory.\nDelivery to you available upon request for a fee.\nEverything is working perfectly & you’ll receive full instructions before you leave how to operate & keep it so. Please bring camper back all clean and ready to go for the next renters to enjoy this includes removal of all trash and debris, sweep/vacuum floors,  and  awaysand mud \nIn the unfortunatIf you bring back the camper unclean there’s a fee to cover the Cleaning as well as the cost of taking it out of service for others. This rule includes any and all damages as well. If unit is damaged to the point repairs are necessary said cost will be the responsibility of the renter/s as well as any ancillary costs or out of service fees for canceling on others. ",
                    "description_recommendations": "Take your family up to the Adirondacks or Vermont State Parks, New Hampshire, Martha’s Vineyard, even Disney FL has camper sites with full hookups, we’ve been to Florida and all the way up to the Vermont/Canadian border. There’s no better vacation than taking your family camping! Try it out today! Reconnect with Nature, make a fire, catch some fish, hike up mountains, hit the bike trails, lakes and beaches.",
                    "display_vehicle_type": "Travel trailer",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 6,
                    "features": {
                        "air_conditioner": true,
                        "audio_inputs": true,
                        "awning": true,
                        "backup_camera": false,
                        "beds_bunk": null,
                        "beds_dinette_conversion": 1,
                        "beds_fold_out_sofa": 1,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 3,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": true,
                        "burning_man_friendly": true,
                        "cd_player": false,
                        "ceiling_fan": true,
                        "connector_type": "7pin",
                        "dining_table": true,
                        "extra_storage": true,
                        "festival_friendly": false,
                        "generator": false,
                        "gray_tank": 0,
                        "handicap_accessible": false,
                        "heater": true,
                        "hitch_weight": 0,
                        "hookup_electric": true,
                        "hookup_sewer": true,
                        "hookup_water": true,
                        "hot_water_tank": false,
                        "inside_shower": true,
                        "international_travel_allowed": false,
                        "inverter": true,
                        "kitchen_sink": true,
                        "leveling_jacks": true,
                        "microwave": true,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": true,
                        "oven": true,
                        "pet_friendly": false,
                        "propane_tank": 0,
                        "provides_receivers": true,
                        "radio": true,
                        "refrigerator": true,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": true,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": true,
                        "tailgate_friendly": false,
                        "toilet": true,
                        "tow_hitch": false,
                        "trailer_weight": 3400,
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2022-03-11T07:56:56.747691-08:00",
                    "generator_usage_item_id": 0,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "no climbing on the roof, no smoking",
                    "instant_book": true,
                    "instant_book_leeway": 7,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2022-03-11T07:56:56.747608-08:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "East Rutherford",
                        "country": "US",
                        "county": "",
                        "lat": 40.84,
                        "lng": -74.109,
                        "state": "NJ",
                        "zip": "07073"
                    },
                    "mileage_usage_item_id": 350667,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 0,
                    "name": "Forest River Shamrock sleep 10ppl 3 Queen Bedrooms & so more",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 9500,
                        "description": "This fee will cover preparing the unit prior to each rental."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 19995,
                    "price_per_month": 539865,
                    "price_per_week": 119970,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005126/p/rentals/285497/images/lx8bhebmlbdll9v4w8a3.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.1415,
                        "ranking_score2": 0.286,
                        "ranking_score3": 0.1415
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 30,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 75000,
                    "seo_content": {
                        "category": []
                    },
                    "settlement_currency": "USD",
                    "sleeps": 10,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/east-rutherford_nj/2005_forest-river_flagstaff-shamrock_285497-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.2022483,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 5000,
                    "vehicle_height": 0,
                    "vehicle_length": 23,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NJ",
                    "vehicle_make": "Forest River",
                    "vehicle_model": "Flagstaff Shamrock",
                    "vehicle_title": "2006 Forest River Flagstaff Shamrock",
                    "vehicle_width": 0,
                    "vehicle_year": 2006,
                    "weekly_discount": 0
                },
                "relationships": {
                    "images": {
                        "data": [
                            {
                                "id": "2349236",
                                "type": "images"
                            },
                            {
                                "id": "2349241",
                                "type": "images"
                            },
                            {
                                "id": "2349231",
                                "type": "images"
                            },
                            {
                                "id": "2349239",
                                "type": "images"
                            },
                            {
                                "id": "2349238",
                                "type": "images"
                            },
                            {
                                "id": "2349235",
                                "type": "images"
                            },
                            {
                                "id": "2349244",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "350667",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "2671747",
                            "type": "users"
                        }
                    }
                }
            },
            {
                "id": "347204",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 1,
                        "monthly_discount_percentage": 25,
                        "monthly_rate_per_day": 6375,
                        "price_per_day": 8500,
                        "price_per_month": 178500,
                        "price_per_week": 53550,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 10,
                        "weekly_rate_per_day": 7650
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 75,
                    "delivery_usage_item_id": 435862,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "8 E-Track rails, and a bag of accessories and straps. Two hitches available, one is a Weigh Safe with a scale built in, and the other is an Anderson No Sway load distribution system.",
                    "description_other": "",
                    "description_recommendations": "",
                    "display_vehicle_type": "Other",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 1,
                    "features": {
                        "air_conditioner": false,
                        "audio_inputs": false,
                        "awning": false,
                        "backup_camera": false,
                        "beds_bunk": null,
                        "beds_dinette_conversion": null,
                        "beds_fold_out_sofa": null,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 0,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": true,
                        "cd_player": false,
                        "ceiling_fan": false,
                        "connector_type": null,
                        "dining_table": false,
                        "extra_storage": false,
                        "festival_friendly": false,
                        "fuel_tank": 0,
                        "fuel_type": "",
                        "generator": false,
                        "gray_tank": 0,
                        "handicap_accessible": false,
                        "heater": false,
                        "hitch_weight": 0,
                        "hookup_electric": false,
                        "hookup_sewer": false,
                        "hookup_water": false,
                        "hot_water_tank": false,
                        "inside_shower": false,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": false,
                        "leveling_jacks": true,
                        "microwave": false,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": false,
                        "oven": false,
                        "pet_friendly": true,
                        "propane_tank": 0,
                        "provides_receivers": false,
                        "radio": false,
                        "refrigerator": false,
                        "satellite": false,
                        "sewage_tank": 0,
                        "skylight": false,
                        "slide_outs": 0,
                        "smoking_allowed": true,
                        "solar": false,
                        "stove": false,
                        "tailgate_friendly": true,
                        "toilet": false,
                        "tow_hitch": false,
                        "trailer_weight": 0,
                        "transmission": "",
                        "tv_dvd": false,
                        "washer_dryer": false,
                        "water_tank": 0,
                        "wifi": false
                    },
                    "first_published": "2023-02-27T12:05:22.419793-08:00",
                    "generator_usage_item_id": 435864,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": false,
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2023-02-27T12:05:22.419714-08:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "Stratford",
                        "country": "US",
                        "county": "",
                        "lat": 41.212,
                        "lng": -73.132,
                        "state": "CT",
                        "zip": "06614"
                    },
                    "mileage_usage_item_id": 435863,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 2500,
                    "name": "2023 J&C 8.5 x 18 Cargo Trailer - Enclosed - V Nose",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 0,
                        "description": "This fee will cover preparing and sanitizing the unit prior to each rental."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 8500,
                    "price_per_month": 206550,
                    "price_per_week": 51000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528082/p/rentals/347204/images/tcx1cmdhd1rgeabtwctk.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.6319,
                        "ranking_score2": 0.5225,
                        "ranking_score3": 0.6319
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 1,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": []
                    },
                    "settlement_currency": "USD",
                    "sleeps": 1,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/stratford_ct/2023_j-c_8-5x18ta_347204-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.1614556,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "other",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 0,
                    "vehicle_gvwr": 0,
                    "vehicle_height": 0,
                    "vehicle_length": 21.5,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "ME",
                    "vehicle_make": "J&C",
                    "vehicle_model": "8.5x18TA",
                    "vehicle_title": "2023 J&C 8.5x18TA",
                    "vehicle_width": 0,
                    "vehicle_year": 2023,
                    "weekly_discount": 1000
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "435864",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "2902488",
                                "type": "images"
                            },
                            {
                                "id": "2902497",
                                "type": "images"
                            },
                            {
                                "id": "2902499",
                                "type": "images"
                            },
                            {
                                "id": "2902500",
                                "type": "images"
                            },
                            {
                                "id": "2902501",
                                "type": "images"
                            },
                            {
                                "id": "2902505",
                                "type": "images"
                            },
                            {
                                "id": "2902506",
                                "type": "images"
                            },
                            {
                                "id": "2902503",
                                "type": "images"
                            },
                            {
                                "id": "2902502",
                                "type": "images"
                            },
                            {
                                "id": "2902507",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "435863",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "2719335",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "2902488",
                            "type": "images"
                        }
                    }
                }
            },
            {
                "id": "349329",
                "type": "rentals",
                "attributes": {
                    "Explanation": null,
                    "FeaturesMap": null,
                    "active_options": {
                        "cancel_policy": "flexible",
                        "cancel_policy_combo_bookings": "",
                        "date": "2023-12-18",
                        "instant_book": false,
                        "minimum_days": 1,
                        "monthly_discount_percentage": 20,
                        "monthly_rate_per_day": 10400,
                        "price_per_day": 13000,
                        "price_per_month": 291200,
                        "price_per_week": 81900,
                        "tax": 0,
                        "use_day_pricing": false,
                        "use_tax_inclusive_pricing": false,
                        "weekly_discount_percentage": 10,
                        "weekly_rate_per_day": 11700
                    },
                    "availability_set": false,
                    "average_ratings": null,
                    "average_reviews": null,
                    "campsite_category": null,
                    "cancel_policy": "flexible",
                    "cancel_policy_combo_bookings": "",
                    "cancel_text": "",
                    "catalog": null,
                    "check_in": 0,
                    "check_out": 0,
                    "children_count": 0,
                    "coachnet_ready": true,
                    "coachnet_required": false,
                    "combined_special_hours": [],
                    "created": "0001-01-01T00:00:00Z",
                    "current_location_id": 0,
                    "custom_insurance_text": "",
                    "dealer": false,
                    "delivery": true,
                    "delivery_radius": 50,
                    "delivery_usage_item_id": 441810,
                    "deposit_percentage": 0,
                    "description": "",
                    "description_included": "",
                    "description_other": "",
                    "description_recommendations": "",
                    "display_vehicle_type": "Travel trailer",
                    "distributed_ratings": null,
                    "education": [],
                    "external": false,
                    "favorite": false,
                    "favorite_count": 11,
                    "features": {
                        "air_conditioner": true,
                        "audio_inputs": true,
                        "awning": true,
                        "backup_camera": false,
                        "base_weight": 3739,
                        "beds_bunk": 4,
                        "beds_dinette_conversion": 1,
                        "beds_fold_out_sofa": 1,
                        "beds_full": 0,
                        "beds_king": 0,
                        "beds_other": null,
                        "beds_queen": 1,
                        "beds_twin": 0,
                        "bike_rack": false,
                        "brake_controller": false,
                        "burning_man_friendly": true,
                        "carrying_capacity": 2191,
                        "cd_player": true,
                        "ceiling_fan": true,
                        "connector_type": "7pin",
                        "dining_table": true,
                        "extra_storage": true,
                        "festival_friendly": false,
                        "generator": false,
                        "gray_tank": 30,
                        "gross_vehicle_weight": 0,
                        "handicap_accessible": false,
                        "heater": true,
                        "hitch_weight": 500,
                        "hookup_electric": true,
                        "hookup_sewer": true,
                        "hookup_water": true,
                        "hot_water_tank": false,
                        "inside_shower": true,
                        "international_travel_allowed": false,
                        "inverter": false,
                        "kitchen_sink": true,
                        "leveling_jacks": true,
                        "microwave": true,
                        "minimum_age": 0,
                        "mpg": 0,
                        "one_way_rentals": false,
                        "outside_shower": true,
                        "oven": true,
                        "pet_friendly": false,
                        "propane_tank": 9,
                        "provides_receivers": false,
                        "radio": true,
                        "refrigerator": true,
                        "satellite": false,
                        "sewage_tank": 30,
                        "skylight": true,
                        "slide_outs": 0,
                        "smoking_allowed": false,
                        "solar": false,
                        "stove": true,
                        "tailgate_friendly": true,
                        "toilet": true,
                        "tow_hitch": false,
                        "trailer_weight": 1380,
                        "tv_dvd": true,
                        "washer_dryer": false,
                        "water_tank": 30,
                        "wifi": false
                    },
                    "first_published": "2023-03-27T19:50:21.645526-07:00",
                    "generator_usage_item_id": 441812,
                    "group_on_map": false,
                    "group_reviews_num": 0,
                    "group_reviews_score": 0,
                    "group_score": 0,
                    "has_been_published": true,
                    "has_checkout_questions": false,
                    "hidden": false,
                    "host_notes": "",
                    "house_rules": "",
                    "instant_book": false,
                    "instant_book_leeway": 0,
                    "insurance_coverage": "",
                    "insurance_eligible": true,
                    "insurance_plan": {
                        "id": 97,
                        "label": "Outdoorsy Towable Protection",
                        "renter_body": "",
                        "renter_headline": "",
                        "requires_driver_verification": false
                    },
                    "insurance_renter_adjustable": false,
                    "insurance_state": "approved",
                    "last_published": "2023-03-27T19:50:21.645426-07:00",
                    "listing_questions": [],
                    "locale": {
                        "base_currency": "USD",
                        "distance_unit": "miles",
                        "length_unit": "feet",
                        "liquid_unit": "gallons",
                        "weight_unit": "lbs"
                    },
                    "location": {
                        "city": "West Orange",
                        "country": "US",
                        "county": "",
                        "lat": 40.815,
                        "lng": -74.256,
                        "state": "NJ",
                        "zip": "07052"
                    },
                    "mileage_usage_item_id": 441811,
                    "minimum_days": 0,
                    "minimum_deposit": 0,
                    "monthly_discount": 2000,
                    "name": "2012 Keystone RV Passport Ultra Lite 32-foot with Bunkhouse",
                    "nearby_content": [],
                    "original_url": "",
                    "owner_score": 0,
                    "parent_id": 0,
                    "position": 0,
                    "preferred_primary_image": {
                        "amenity": null,
                        "best": false,
                        "category": null,
                        "description": "",
                        "position": 0,
                        "primary": false,
                        "rental_id": 0,
                        "review": null,
                        "skip_enhance": false,
                        "status": "",
                        "tags": "",
                        "url": "",
                        "video": false
                    },
                    "prep_fee": {
                        "amount": 6000,
                        "description": "This fee will cover preparing and sanitizing the unit prior to each rental.  We will orient each renter to the camper trailer prior to their use at pick up."
                    },
                    "presentment_currency": "USD",
                    "price_per_day": 13000,
                    "price_per_month": 315900,
                    "price_per_week": 78000,
                    "primary_image_url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970907/p/rentals/349329/images/jfrmgemtnc6ebvkknchj.jpg",
                    "pro": false,
                    "published": true,
                    "ranking": {
                        "distance_weight": {
                            "control": 0.35,
                            "test_1": 0.6,
                            "test_2": 0.35,
                            "test_3": 0.35
                        },
                        "distance_weight_prod": 0.35,
                        "is_new_listing": 0,
                        "model_name": "model_gbt_web_072522",
                        "original_score": 0,
                        "ranking_score": 0.2505,
                        "ranking_score2": 0.3619,
                        "ranking_score3": 0.2505
                    },
                    "rental_category": "rv",
                    "rental_score": 0,
                    "request_less_than_minimum_days": 0,
                    "review_scores": null,
                    "reviews_num": 0,
                    "score": 0,
                    "seatbelts": 0,
                    "security_deposit": 50000,
                    "seo_content": {
                        "category": []
                    },
                    "settlement_currency": "USD",
                    "sleeps": 10,
                    "sleeps_adults": 0,
                    "sleeps_kids": 0,
                    "slug": "/rv-rental/west-orange_nj/2012_keystone-rv_passport-ultra-lite_349329-listing",
                    "smart_photo_score": 0,
                    "sort_score": 3.028196,
                    "stay": null,
                    "stay_catalog": null,
                    "summary": "",
                    "tags": [],
                    "tax_rates": [],
                    "type": "trailer",
                    "unavailable": false,
                    "updated": "0001-01-01T00:00:00Z",
                    "use_day_pricing": false,
                    "use_tax_inclusive_pricing": false,
                    "user_slug": "",
                    "vehicle_amps": 0,
                    "vehicle_box_length": 0,
                    "vehicle_class": "",
                    "vehicle_dry_weight": 3739,
                    "vehicle_gvwr": 7500,
                    "vehicle_height": 0,
                    "vehicle_length": 32,
                    "vehicle_length_with_hitch": 0,
                    "vehicle_license_plate_state": "NJ",
                    "vehicle_make": "Keystone RV",
                    "vehicle_model": "Passport Ultra Lite",
                    "vehicle_title": "2012 Keystone RV Passport Ultra Lite",
                    "vehicle_width": 0,
                    "vehicle_year": 2012,
                    "weekly_discount": 1000
                },
                "relationships": {
                    "generator_usage_item": {
                        "data": {
                            "id": "441812",
                            "type": "usage_based_item"
                        }
                    },
                    "images": {
                        "data": [
                            {
                                "id": "2944881",
                                "type": "images"
                            },
                            {
                                "id": "2944884",
                                "type": "images"
                            },
                            {
                                "id": "2944885",
                                "type": "images"
                            },
                            {
                                "id": "2944886",
                                "type": "images"
                            },
                            {
                                "id": "2944888",
                                "type": "images"
                            },
                            {
                                "id": "2944889",
                                "type": "images"
                            },
                            {
                                "id": "2944890",
                                "type": "images"
                            },
                            {
                                "id": "2944891",
                                "type": "images"
                            },
                            {
                                "id": "2944892",
                                "type": "images"
                            },
                            {
                                "id": "2944893",
                                "type": "images"
                            },
                            {
                                "id": "2944894",
                                "type": "images"
                            },
                            {
                                "id": "2944895",
                                "type": "images"
                            },
                            {
                                "id": "2944896",
                                "type": "images"
                            }
                        ]
                    },
                    "mileage_usage_item": {
                        "data": {
                            "id": "441811",
                            "type": "usage_based_item"
                        }
                    },
                    "owner": {
                        "data": {
                            "id": "3273977",
                            "type": "users"
                        }
                    },
                    "primary_image": {
                        "data": {
                            "id": "2944881",
                            "type": "images"
                        }
                    }
                }
            }
        ],
        "included": [
            {
                "id": "1300390",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 165446,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1590703516/p/rentals/165446/images/uwmypsci3ltwvftvehle.jpg",
                    "video": false
                }
            },
            {
                "id": "1300391",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 165446,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1590703559/p/rentals/165446/images/gjzuw1qdgknvke98zzt9.jpg",
                    "video": false
                }
            },
            {
                "id": "3244499",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469620/p/rentals/384054/images/xrkwyplzdalexmtnsvcs.jpg",
                    "video": false
                }
            },
            {
                "id": "3244501",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469620/p/rentals/384054/images/iy7f9x8su03b7kmgrfsv.jpg",
                    "video": false
                }
            },
            {
                "id": "3244498",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 3,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469618/p/rentals/384054/images/w0jdjejsboizqpsqna5g.jpg",
                    "video": false
                }
            },
            {
                "id": "3244500",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 4,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469619/p/rentals/384054/images/odlfgjrwusop2dx03met.jpg",
                    "video": false
                }
            },
            {
                "id": "3244503",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 5,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694469618/p/rentals/384054/images/dgnvsfx3heojfrlsjyde.jpg",
                    "video": false
                }
            },
            {
                "id": "3244504",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 6,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470379/p/rentals/384054/images/lp4u3iypefzs2mwdzq3n.jpg",
                    "video": false
                }
            },
            {
                "id": "3244505",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 7,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470379/p/rentals/384054/images/p9uajjsfe7xypj7q4xkl.jpg",
                    "video": false
                }
            },
            {
                "id": "3244506",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 8,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470378/p/rentals/384054/images/h6titk63ef0pfqmnkmbg.jpg",
                    "video": false
                }
            },
            {
                "id": "3244507",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 9,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470379/p/rentals/384054/images/vsbnnrx2kjyiv2v2fma9.jpg",
                    "video": false
                }
            },
            {
                "id": "3244508",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 10,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470379/p/rentals/384054/images/jsz2wmhjaenoxxjkkams.jpg",
                    "video": false
                }
            },
            {
                "id": "3244509",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 11,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470379/p/rentals/384054/images/azl4nc4lwqqu1lnlx4du.jpg",
                    "video": false
                }
            },
            {
                "id": "3244510",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 12,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470381/p/rentals/384054/images/xqcvmo82ne3bayugfs7f.jpg",
                    "video": false
                }
            },
            {
                "id": "3244511",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 13,
                    "primary": false,
                    "rental_id": 384054,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1694470380/p/rentals/384054/images/q0k8z2bmqmcuxidthzxl.jpg",
                    "video": false
                }
            },
            {
                "id": "1376814",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 174763,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1594524993/p/rentals/174763/images/eubalpa3ri23qnuhholk.jpg",
                    "video": false
                }
            },
            {
                "id": "1376813",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 174763,
                    "review": null,
                    "skip_enhance": false,
                    "status": "rejected",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1594524987/p/rentals/174763/images/ccxvj7ou8axpefqv6occ.jpg",
                    "video": false
                }
            },
            {
                "id": "2159333",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "exterior"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296479/undefined/rentals/264037/images/ludrrgfcokazg27krg4u.jpg",
                    "video": false
                }
            },
            {
                "id": "2155830",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "floorplan"
                    },
                    "description": "Side door and rear door access ",
                    "position": 2,
                    "primary": false,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633028627/p/rentals/264037/images/yuiuisrknysuffyfyy16.jpg",
                    "video": false
                }
            },
            {
                "id": "2159328",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 3,
                    "primary": false,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296089/undefined/rentals/264037/images/fqh66lfj5vfedyswho4b.jpg",
                    "video": false
                }
            },
            {
                "id": "2159329",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 4,
                    "primary": false,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296098/undefined/rentals/264037/images/nfoi6ch6ydvmrbw2zshn.jpg",
                    "video": false
                }
            },
            {
                "id": "2159330",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 5,
                    "primary": false,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296105/undefined/rentals/264037/images/kc7prnxzlx2en1hduc7j.jpg",
                    "video": false
                }
            },
            {
                "id": "2159331",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 6,
                    "primary": false,
                    "rental_id": 264037,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1633296112/undefined/rentals/264037/images/j1dhacbsovqgd0hhtyne.jpg",
                    "video": false
                }
            },
            {
                "id": "1376807",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 174761,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1594523936/p/rentals/174761/images/tfovsbyhal6igipgm6kb.jpg",
                    "video": false
                }
            },
            {
                "id": "2558586",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 309796,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1655722379/p/rentals/309796/images/hlfe5cccvasxwmwqcnzb.jpg",
                    "video": false
                }
            },
            {
                "id": "3196847",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447169/p/rentals/378653/images/nnzz6jumtdskcpwytkqe.jpg",
                    "video": false
                }
            },
            {
                "id": "3196848",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447216/p/rentals/378653/images/ey6y1kca8qdgqkm4xhka.jpg",
                    "video": false
                }
            },
            {
                "id": "3196859",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 3,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447559/p/rentals/378653/images/gnchrhuls92iuqzki2sn.jpg",
                    "video": false
                }
            },
            {
                "id": "3196860",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 4,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447548/p/rentals/378653/images/gdgmzaw7iwff4gxyaamj.jpg",
                    "video": false
                }
            },
            {
                "id": "3196861",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 5,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447556/p/rentals/378653/images/snvr9oipyxxayjsnzszf.jpg",
                    "video": false
                }
            },
            {
                "id": "3196864",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 6,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447664/p/rentals/378653/images/qmghwmqzzncb5gkawlpp.jpg",
                    "video": false
                }
            },
            {
                "id": "3196865",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 7,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447676/p/rentals/378653/images/xmtubcz3tvnr561xwnc5.jpg",
                    "video": false
                }
            },
            {
                "id": "3196866",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 8,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447684/p/rentals/378653/images/nundqwl5farhj5bxgj35.jpg",
                    "video": false
                }
            },
            {
                "id": "3196867",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 9,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447751/p/rentals/378653/images/ewi9zesylphjexgf9z4v.jpg",
                    "video": false
                }
            },
            {
                "id": "3196868",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 10,
                    "primary": false,
                    "rental_id": 378653,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1691447753/p/rentals/378653/images/bukpowfqctpfncnurisj.jpg",
                    "video": false
                }
            },
            {
                "id": "2349236",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005126/p/rentals/285497/images/js0kxusxxxb2ensco1yi.jpg",
                    "video": false
                }
            },
            {
                "id": "2349241",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005130/p/rentals/285497/images/zhbsbqnd4fydbinuiefm.jpg",
                    "video": false
                }
            },
            {
                "id": "2349231",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005128/p/rentals/285497/images/pxpf5s7s5igf5gbdhmin.jpg",
                    "video": false
                }
            },
            {
                "id": "2349239",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005129/p/rentals/285497/images/hyqy5tyy9tna74f38xxr.jpg",
                    "video": false
                }
            },
            {
                "id": "2349238",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005130/p/rentals/285497/images/jhlxckhsmn5jxxu3ljqo.jpg",
                    "video": false
                }
            },
            {
                "id": "2349235",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005129/p/rentals/285497/images/mm4yohatpewffxsipxwv.jpg",
                    "video": false
                }
            },
            {
                "id": "2349244",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 7,
                    "primary": false,
                    "rental_id": 285497,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1647005129/p/rentals/285497/images/ivux7rmalz0qycyzkxla.jpg",
                    "video": false
                }
            },
            {
                "id": "2902488",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528082/p/rentals/347204/images/tcx1cmdhd1rgeabtwctk.jpg",
                    "video": false
                }
            },
            {
                "id": "2902497",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528389/p/rentals/347204/images/jpi1m2oub8x1jy93yatt.jpg",
                    "video": false
                }
            },
            {
                "id": "2902499",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 3,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "rejected",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528393/p/rentals/347204/images/ncesogausb9cwzcmfotl.jpg",
                    "video": false
                }
            },
            {
                "id": "2902500",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 4,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528401/p/rentals/347204/images/rd08lpb5ewcabyspsl9y.jpg",
                    "video": false
                }
            },
            {
                "id": "2902501",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 5,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528550/p/rentals/347204/images/tq0zyt5mflsaqsduep2g.jpg",
                    "video": false
                }
            },
            {
                "id": "2902505",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 6,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528571/p/rentals/347204/images/e5nfe8xcfpju5jajifzm.jpg",
                    "video": false
                }
            },
            {
                "id": "2902506",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 7,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528582/p/rentals/347204/images/cueqmt3udroij5kk3ndo.jpg",
                    "video": false
                }
            },
            {
                "id": "2902503",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 8,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528558/p/rentals/347204/images/db8dxltimpk4kwcxhjdv.jpg",
                    "video": false
                }
            },
            {
                "id": "2902502",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 9,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528554/p/rentals/347204/images/i8n5t58vur4wje2mf3so.jpg",
                    "video": false
                }
            },
            {
                "id": "2902507",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "other"
                    },
                    "description": "",
                    "position": 10,
                    "primary": false,
                    "rental_id": 347204,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1677528671/p/rentals/347204/images/ply3rwgxswbixqriqscg.jpg",
                    "video": false
                }
            },
            {
                "id": "2944881",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "exterior"
                    },
                    "description": "",
                    "position": 1,
                    "primary": true,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970907/p/rentals/349329/images/jfrmgemtnc6ebvkknchj.jpg",
                    "video": false
                }
            },
            {
                "id": "2944884",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "bedroom"
                    },
                    "description": "",
                    "position": 2,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970944/p/rentals/349329/images/laqkdnfyzxjzpiw5plwc.jpg",
                    "video": false
                }
            },
            {
                "id": "2944885",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "bedroom"
                    },
                    "description": "",
                    "position": 3,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970948/p/rentals/349329/images/v0tdoh0mjk5szuajjoxn.jpg",
                    "video": false
                }
            },
            {
                "id": "2944886",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "travel"
                    },
                    "description": "",
                    "position": 4,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970957/p/rentals/349329/images/lmd3xk0nm5qcbc1rus8o.jpg",
                    "video": false
                }
            },
            {
                "id": "2944888",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "dining"
                    },
                    "description": "",
                    "position": 5,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970979/p/rentals/349329/images/bhaqwliygriejsyzhkow.jpg",
                    "video": false
                }
            },
            {
                "id": "2944889",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "dining"
                    },
                    "description": "",
                    "position": 6,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679970990/p/rentals/349329/images/ysvfornrczfbtkaanzdb.jpg",
                    "video": false
                }
            },
            {
                "id": "2944890",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "kitchen"
                    },
                    "description": "",
                    "position": 7,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971005/p/rentals/349329/images/nu9bzbzqifykncbj1yrk.jpg",
                    "video": false
                }
            },
            {
                "id": "2944891",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "travel"
                    },
                    "description": "",
                    "position": 8,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971029/p/rentals/349329/images/xhz7qqdrb79syzzgwzpu.jpg",
                    "video": false
                }
            },
            {
                "id": "2944892",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "travel"
                    },
                    "description": "",
                    "position": 9,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971034/p/rentals/349329/images/fy3dyqiigxrmp6ttl6us.jpg",
                    "video": false
                }
            },
            {
                "id": "2944893",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "bathroom"
                    },
                    "description": "",
                    "position": 10,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971041/p/rentals/349329/images/mbdhgqnl5fggpjqpagph.jpg",
                    "video": false
                }
            },
            {
                "id": "2944894",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "kitchen"
                    },
                    "description": "",
                    "position": 11,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971060/p/rentals/349329/images/dlktcalesrksg04yoeq0.jpg",
                    "video": false
                }
            },
            {
                "id": "2944895",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "bedroom"
                    },
                    "description": "",
                    "position": 12,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971075/p/rentals/349329/images/u8ixg6x0dsh3ndswhzhy.jpg",
                    "video": false
                }
            },
            {
                "id": "2944896",
                "type": "images",
                "attributes": {
                    "amenity": null,
                    "best": false,
                    "category": {
                        "name": "",
                        "slug": "floorplan"
                    },
                    "description": "",
                    "position": 13,
                    "primary": false,
                    "rental_id": 349329,
                    "review": null,
                    "skip_enhance": false,
                    "status": "approved",
                    "tags": "",
                    "url": "https://res.cloudinary.com/outdoorsy/image/upload/v1679971084/p/rentals/349329/images/oe6xw5kfd7jnppjbwn8b.jpg",
                    "video": false
                }
            }
        ],
        "meta": {
            "radius": 100,
            "lat": 40.7157,
            "lng": -74,
            "city": "New York",
            "state": "NY",
            "country": "US",
            "country_code": "US",
            "country_name": "United States",
            "total": 190,
            "total_unavailable": 0,
            "start_position": 1,
            "stop_position": 10,
            "price_max": 37500,
            "price_min": 4500,
            "price_average": 13595,
            "price_median": 13000,
            "price_histogram": {
                "data": [
                    0,
                    1,
                    17,
                    16,
                    32,
                    65,
                    27,
                    14,
                    5,
                    6,
                    2,
                    2,
                    2,
                    0,
                    0,
                    1,
                    0,
                    0,
                    0,
                    0,
                    0
                ],
                "max_value": 50000
            },
            "vehicle_types": [
                {
                    "type": "a",
                    "label": "Class A",
                    "style": "drivable"
                },
                {
                    "type": "folding-trailer",
                    "label": "Folding trailer",
                    "style": "towable"
                },
                {
                    "type": "toy-hauler",
                    "label": "Toy hauler",
                    "style": "towable"
                },
                {
                    "type": "trailer",
                    "label": "Travel trailer",
                    "style": "towable"
                },
                {
                    "type": "b",
                    "label": "Class B",
                    "style": "drivable"
                },
                {
                    "type": "c",
                    "label": "Class C",
                    "style": "drivable"
                },
                {
                    "type": "camper-van",
                    "label": "Camper van",
                    "style": "drivable"
                },
                {
                    "type": "fifth-wheel",
                    "label": "Fifth-wheel",
                    "style": "towable"
                },
                {
                    "type": "other",
                    "label": "Other",
                    "style": "both"
                },
                {
                    "type": "tow-vehicle",
                    "label": "Tow Vehicle",
                    "style": "drivable"
                },
                {
                    "type": "truck-camper",
                    "label": "Truck Camper",
                    "style": "drivable"
                }
            ],
            "locale": "en-us",
            "suggested": false,
            "experiments": {},
            "experiments_data": {},
            "request": {},
            "flexible_dates": null,
            "is_blended": false
        },
        "suggestions": null
    }
""".trimIndent()