package com.startapp.sdk.cachedservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes11.dex */
public final class BackgroundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return 3;
    }
}
