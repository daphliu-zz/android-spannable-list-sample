package com.daphneliu.sample.bulletlistsample

import android.text.SpannableString
import android.text.Spanned
import androidx.core.text.HtmlCompat
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY

object StringUtils {

    const val OL_TAG = "ordered"
    const val UL_TAG = "unordered"
    const val LI_TAG = "listitem"

    fun fromHtml(html: String?): Spanned {
        html ?: return SpannableString("")
        // Replace tags with unknown ones so ListTagHandler will be used
        val formattedHtml = html
            .replace("(?i)<ul[^>]*>".toRegex(), "<$UL_TAG>")
            .replace("(?i)</ul>".toRegex(), "</$UL_TAG>")
            .replace("(?i)<ol[^>]*>".toRegex(), "<$OL_TAG>")
            .replace("(?i)</ol>".toRegex(), "</$OL_TAG>")
            .replace("(?i)<li[^>]*>".toRegex(), "<$LI_TAG>")
            .replace("(?i)</li>".toRegex(), "</$LI_TAG>")

        return HtmlCompat.fromHtml(formattedHtml, FROM_HTML_MODE_LEGACY, null, ListTagHandler())
    }
}
