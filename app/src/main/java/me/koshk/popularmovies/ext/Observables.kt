package me.koshk.popularmovies.ext

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *
 *Created by mhabulazm on 5/20/2018.
 *
 */

fun Observable<Any>.subscribeIoObserveMain() {
    subscribeOnIo()
    observeOnMain()
}

fun Observable<Any>.subscribeOnIo(): Observable<Any> = subscribeOn(Schedulers.io())

fun Observable<Any>.observeOnMain(): Observable<Any> = observeOn(AndroidSchedulers.mainThread())
