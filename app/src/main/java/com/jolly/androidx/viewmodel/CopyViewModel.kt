package com.jolly.androidx.viewmodel

import androidx.lifecycle.ViewModel
import com.jolly.androidx.room.CopyRepository

class CopyViewModel internal constructor(copyRepository: CopyRepository): ViewModel() {


       val allData = copyRepository.getAllData()


}