package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.AbstractC4213zk;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4213zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C4044t1 f40073a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void b() {
        String str;
        try {
            C4044t1 c4044t1 = f40073a;
            if (c4044t1 == null || (str = c4044t1.f39572b) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            Kb.a((byte) 2, "zk", "Publisher device Id is " + str);
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void c() throws Throwable {
        Context context;
        boolean z10;
        boolean zBooleanValue;
        C4044t1 c4044t1;
        try {
            context = Ji.f37157a;
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e10.getMessage();
        }
        if (context != null) {
            C4044t1 c4044t12 = new C4044t1();
            try {
                kotlin.jvm.internal.v0.b(AdvertisingIdClient.class).getSimpleName();
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                    c4044t12.f39572b = advertisingIdInfo.getId();
                    c4044t12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                    f40073a = c4044t12;
                    Boolean bool = Tg.f37771b;
                    if (bool == null) {
                        Context context2 = Ji.f37157a;
                        z10 = false;
                        if (context2 != null) {
                            ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                            Ea eaA = Da.a(context2, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", C4240b4.i.W);
                            Tg.f37771b = Boolean.valueOf(eaA.f36783a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = Tg.f37771b;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        }
                        if (z10 || (c4044t1 = f40073a) == null) {
                            return;
                        }
                        c4044t1.f39572b = null;
                        return;
                        Intrinsics.checkNotNullExpressionValue("zk", "TAG");
                        e10.getMessage();
                    }
                    zBooleanValue = bool.booleanValue();
                    z10 = zBooleanValue;
                    if (z10) {
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e11) {
                    Intrinsics.checkNotNullExpressionValue("zk", "TAG");
                    e11.getMessage();
                    return;
                }
            } catch (NoClassDefFoundError unused) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("zk", "TAG");
            e10.getMessage();
        }
    }

    public static final void d() throws Throwable {
        c();
    }

    public static void a(boolean z10) {
        C4044t1 c4044t1 = f40073a;
        if (c4044t1 == null) {
            return;
        }
        if (z10) {
            c4044t1.f39572b = null;
        } else if (c4044t1.f39572b == null) {
            Runnable runnable = new Runnable() { // from class: w3.pd
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    AbstractC4213zk.d();
                }
            };
            Context context = Ji.f37157a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Ji.f37163g.submit(runnable);
        }
    }
}
