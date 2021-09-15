package com.jetpack.whatsappclone.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object Constants {
    val _tabCurrentStatus = MutableLiveData(0)
    val tabCurrentStatus: LiveData<Int> = _tabCurrentStatus
}