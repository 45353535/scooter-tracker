package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class y7 extends com.startapp.sdk.adsbase.d {
    static {
        Intrinsics.checkNotNullExpressionValue(y7.class.getSimpleName(), "getSimpleName(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(Context context, o8 ad2, AdEventListener adEventListener, lb networkApiExecutor, lb eventTracer, lb webViewCacheLoader, String adm) {
        super(ad2, networkApiExecutor, context, adEventListener, adm);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(eventTracer, "eventTracer");
        Intrinsics.checkNotNullParameter(webViewCacheLoader, "webViewCacheLoader");
        Intrinsics.checkNotNullParameter(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public Object a(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            Ad ad2 = this.f64041a;
            Intrinsics.checkNotNull(ad2, "null cannot be cast to non-null type com.startapp.sdk.adsbase.HtmlAd");
            o8 o8Var = (o8) ad2;
            o8Var.d(adm);
            u0.a(o8Var.a(), 0);
            return o8Var;
        } catch (Throwable unused) {
            return null;
        }
    }
}
