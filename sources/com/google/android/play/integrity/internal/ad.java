package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes9.dex */
final class ad implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f28760b;

    /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f28760b = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f28760b.f28763b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f28760b.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f28760b.f28763b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f28760b.c().post(new ab(this));
    }
}
