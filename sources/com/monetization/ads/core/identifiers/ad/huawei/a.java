package com.monetization.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import com.taurusx.tax.g.q0.c.w;
import java.util.concurrent.LinkedBlockingQueue;
import yads.lb1;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f58979a = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface proxy;
        try {
            int i10 = OpenDeviceIdentifierService.Stub.f58977b;
            if (iBinder == null) {
                proxy = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w.AbstractBinderC0801w.f66300z);
                proxy = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OpenDeviceIdentifierService)) ? new OpenDeviceIdentifierService.Stub.Proxy(iBinder) : (OpenDeviceIdentifierService) iInterfaceQueryLocalInterface;
            }
            this.f58979a.put(proxy);
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f58979a.clear();
        } catch (UnsupportedOperationException unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
