package com.example.chap6top5.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class Worker(val context: Context, val params : WorkerParameters): Worker(context,params) {
    override fun doWork(): Result {
        NotificationHelper(context).createNotif(
            inputData.getString("title").toString(),
            inputData.getString("message").toString())
        return Result.success()
    }
}