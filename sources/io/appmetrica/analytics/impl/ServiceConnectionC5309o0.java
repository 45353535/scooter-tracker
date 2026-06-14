package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ServiceConnectionC5309o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5334p0 f77875a;

    public ServiceConnectionC5309o0(C5334p0 c5334p0) {
        this.f77875a = c5334p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f77875a) {
            this.f77875a.f77943d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f77875a.f77944e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f77875a) {
            this.f77875a.f77943d = null;
        }
    }
}
