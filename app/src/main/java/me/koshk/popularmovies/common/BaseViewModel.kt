package me.koshk.popularmovies.common

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 *
 *Created by mhabulazm on 5/20/2018.
 *
 */
class BaseViewModel : ViewModel() {
    private val disposables: CompositeDisposable = CompositeDisposable()

    fun addObservable(disposable: Disposable) = disposables.add(disposable)

}