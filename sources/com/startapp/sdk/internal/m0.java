package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f64901a = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64902b = false;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f64901a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
