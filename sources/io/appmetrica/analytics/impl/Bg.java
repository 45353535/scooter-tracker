package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class Bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f75586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ya f75587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Kc f75588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f75589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75591g;

    public Bg(Context context, SafePackageManager safePackageManager, Ya ya2) {
        this.f75585a = context;
        this.f75586b = safePackageManager;
        this.f75587c = ya2;
        Kc kc2 = new Kc(0);
        kc2.a(EnumC5399rg.f78154d, 1);
        kc2.a(EnumC5399rg.f78153c, 2);
        this.f75588d = kc2;
        this.f75589e = TimeUnit.DAYS.toSeconds(1L);
        this.f75590f = "com.android.vending";
        this.f75591g = "com.huawei.appmarket";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5424sg a(java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Bg.a(java.util.List):io.appmetrica.analytics.impl.sg");
    }

    public /* synthetic */ Bg(Context context) {
        this(context, new SafePackageManager(), AbstractC5509w1.a());
    }

    public static final int a(Bg bg2, C5424sg c5424sg, C5424sg c5424sg2) {
        int iB = zf.a.b(c5424sg.f78238c - c5424sg2.f78238c);
        return iB == 0 ? ((Number) bg2.f75588d.a(c5424sg.f78239d)).intValue() - ((Number) bg2.f75588d.a(c5424sg2.f78239d)).intValue() : iB;
    }
}
