package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5376qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W5 f78086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f78087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5161i4 f78088d;

    public RunnableC5376qh(Context context, W5 w52, Bundle bundle, C5161i4 c5161i4) {
        this.f78085a = context;
        this.f78086b = w52;
        this.f78087c = bundle;
        this.f78088d = c5161i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P3 p3A = P3.a(this.f78085a, this.f78087c);
            if (p3A == null) {
                return;
            }
            X3 x3A = X3.a(p3A);
            C5201jj c5201jjV = C5468ua.H.v();
            c5201jjV.a(p3A.f76218b.getAppVersion(), p3A.f76218b.getAppBuildNumber());
            c5201jjV.a(p3A.f76218b.getDeviceType());
            C5512w4 c5512w4 = new C5512w4(new C5050dm(p3A), new C5487v4(p3A.f76218b, AbstractC5295nb.c(p3A.f76217a.f75824a.getAsString("PROCESS_CFG_CLIDS"))), p3A.f76217a.f75825b);
            this.f78088d.a(x3A, c5512w4).a(this.f78086b, c5512w4);
        } catch (Throwable th2) {
            Vj vj = AbstractC5452tj.f78304a;
            String str = "Exception during processing event with type: " + this.f78086b.f76617d + " (" + this.f78086b.f76618e + "): " + th2.getMessage();
            vj.getClass();
            vj.a(new C5477uj(str, th2));
        }
    }
}
