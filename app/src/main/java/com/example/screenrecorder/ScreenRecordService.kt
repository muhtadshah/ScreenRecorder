package com.example.screenrecorder

import android.app.Service
import android.content.Intent
import android.os.IBinder

class ScreenRecordService : Service() {
    override fun onBind(intent: Intent): IBinder {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Start your recording here
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Stop your recording here
    }
}