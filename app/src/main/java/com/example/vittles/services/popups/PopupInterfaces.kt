package com.example.vittles.services.popups

/**
 * The interface for the base of each popup.
 *
 * @author Arjen Simons
 */
internal interface IPopupBase{
    /** @suppress */
    val header: String
    /** @suppress */
    val subText: String
    /** @suppress */
    val popupDuration: Long?
}

/**
 * The interface for the button on a popup.
 *
 * @author Arjen Simons
 */
internal interface IPopupButton{
    /** @suppress */
    val text: String
    /** @suppress */
    val action: (() -> Unit)?
}