package com.bkarakoca.githubrepolisting.navigation

import androidx.navigation.NavDirections
import com.bkarakoca.githubrepolisting.internal.popup.PopupListener
import com.bkarakoca.githubrepolisting.internal.popup.PopupModel

sealed class NavigationCommand {
    data class ToDirection(val directions: NavDirections) : NavigationCommand()
    data class Popup(val model: PopupModel, val listener: PopupListener? = null) :
        NavigationCommand()

    object Back : NavigationCommand()
}
