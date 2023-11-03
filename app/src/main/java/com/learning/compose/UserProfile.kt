package com.learning.compose

/**
 * Created by: VIJIL DHAS AS
 * @Date: 03-11-2023
 */
data class UserProfile constructor(val name: String, val onlineStatus: Boolean, val drawableId: Int)

val userProfileList = arrayListOf(
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),
    UserProfile("John", true, R.drawable.ic_default_profile),
    UserProfile("Miller", false, R.drawable.ic_profile_miller),


    )