package com.jolly.androidx.utilities

import android.content.Context
import com.jolly.androidx.room.CopyRepository
import com.jolly.androidx.room.CopyRoomDatabase
import com.jolly.androidx.viewmodel.CopyModelRepoFactory

object InjectUtil {


    fun provideAllDataViewModelFactory(context: Context):CopyModelRepoFactory{
        val repo= getCopyModelRespository(context)
        return CopyModelRepoFactory(repo)
    }

    private fun getCopyModelRespository(context: Context): CopyRepository {
        return CopyRepository.getInstance(CopyRoomDatabase.getInstance(context).copyDao())
    }

}