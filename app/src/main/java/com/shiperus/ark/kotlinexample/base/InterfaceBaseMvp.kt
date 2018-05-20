package com.shiperus.ark.kotlinexample.base

/**
 * Created by komputer on 5/20/2018.
 */
interface InterfaceBaseMvp {
    interface View{
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter<in V : View>{
        fun onAttach(view:V)
    }
}