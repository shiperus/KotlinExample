package com.shiperus.ark.kotlinexample.splashscreen

import android.os.Bundle
import com.shiperus.ark.kotlinexample.R
import com.shiperus.ark.kotlinexample.base.BaseView
import kotlinx.android.synthetic.main.activity_splash_screen_view.*

class SplashScreenView : BaseView() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_view)
        btn_login.setOnClickListener({

        })

    }
}
