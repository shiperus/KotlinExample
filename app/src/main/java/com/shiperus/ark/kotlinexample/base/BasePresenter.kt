package com.shiperus.ark.kotlinexample.base

/**
 * Created by komputer on 5/20/2018.
 */
abstract class BasePresenter<in V : InterfaceBaseMvp.View > : InterfaceBaseMvp.Presenter<V> {

    override fun onAttach(view: V) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}