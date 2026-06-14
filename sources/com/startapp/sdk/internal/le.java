package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class le implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f64871b;

    public le(String str, CountDownLatch countDownLatch) {
        this.f64870a = str;
        this.f64871b = countDownLatch;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface x8Var;
        try {
            int i10 = y8.f65597a;
            if (iBinder == null) {
                x8Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                x8Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof z8)) ? new x8(iBinder) : (z8) iInterfaceQueryLocalInterface;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f64870a);
            me.f64936a = new te(((x8) x8Var).a(bundle));
        } catch (Throwable unused) {
        }
        this.f64871b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f64871b.countDown();
    }
}
