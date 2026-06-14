package com.moloco.sdk.internal.services.bidtoken;

import android.os.Build;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.b;
import eg.m1;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f55286a = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.a();
        }
    });

    public static final c0 a() {
        String str;
        String str2;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        b.e eVar = b.e.f55808a;
        ie.c cVarA = com.moloco.sdk.internal.http.e.a(eVar.h().invoke(), eVar.l().invoke());
        m mVar = new m(2800L, 3, 200L);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = Build.MODEL;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.HARDWARE;
        if (str5 == null) {
            String str6 = str4;
            str2 = "";
            str = str6;
        } else {
            str = str4;
            str2 = str5;
        }
        return new c0(new g(BuildConfig.SDK_VERSION_NAME, cVarA, mVar, new j(language, RELEASE, str3, str, str2)), kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(com.moloco.sdk.internal.scheduling.c.a().getIo())), y.f55494a.a(new com.moloco.sdk.internal.bidtoken.c(), new com.moloco.sdk.internal.services.j()));
    }

    public static final c0 c() {
        return (c0) f55286a.getValue();
    }
}
