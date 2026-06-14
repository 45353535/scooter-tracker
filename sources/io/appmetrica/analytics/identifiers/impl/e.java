package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f75359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f75360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f75361c = new Object();

    public e(Intent intent, String str) {
        this.f75359a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    public final void a(Context context) {
        synchronized (this.f75361c) {
            this.f75360b = null;
            this.f75361c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f75361c) {
            this.f75360b = null;
            this.f75361c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f75361c) {
            this.f75361c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f75361c) {
            this.f75360b = iBinder;
            this.f75361c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f75361c) {
            this.f75360b = null;
            this.f75361c.notifyAll();
        }
    }
}
