package com.basecamp.turbolinks.demo

import android.os.Bundle
import com.basecamp.turbolinks.TurbolinksNavGraphDestination

@TurbolinksNavGraphDestination(uri = "turbolinks://fragment/web/modal")
class WebModalFragment : WebFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initToolbar()
    }

    override fun shouldEnablePullToRefresh(): Boolean {
        return false
    }

    override fun displaysBottomTabs(): Boolean {
        return false
    }

    private fun initToolbar() {
        toolbarForNavigation()?.navigationIcon = context?.drawable(R.drawable.ic_close)
        toolbarForNavigation()?.navigationContentDescription = getString(R.string.modal_close)
    }
}
