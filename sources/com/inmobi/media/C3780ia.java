package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3780ia extends AbstractC3755ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f38753a;

    public C3780ia(InterstitialAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f38753a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f38753a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f38753a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f38753a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f38753a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String data) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f38753a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
