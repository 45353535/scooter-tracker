package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ServiceConnectionC2294Nj implements ServiceConnection {
    public final /* synthetic */ HandlerC2295Nk A00;

    public ServiceConnectionC2294Nj(HandlerC2295Nk handlerC2295Nk) {
        this.A00 = handlerC2295Nk;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.A04.removeCallbacks(this.A00.A08);
        this.A00.A00 = new Messenger(iBinder);
        if (!UA.A09(this.A00.A07)) {
            return;
        }
        this.A00.A07(this.A00.A00);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
