package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f75742a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C5124gj c5124gj;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f75742a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Gf.f75823c).build());
        C5186j4 c5186j4L = C5186j4.l();
        synchronized (c5186j4L) {
            try {
                if (c5186j4L.f77479o == null) {
                    C5124gj c5124gj2 = new C5124gj();
                    c5186j4L.f77479o = c5124gj2;
                    c5186j4L.f77472h.a(c5124gj2);
                }
                c5124gj = c5186j4L.f77479o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScreenInfo screenInfoA = c5124gj.a(context);
        intentPutExtras.putExtra("screen_size", screenInfoA == null ? null : AbstractC5295nb.a(screenInfoA));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
