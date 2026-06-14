package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Z1 extends Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f38088a;

    public Z1(BannerAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f38088a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map params) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f38088a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f38088a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f38088a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(Y1.class.getSimpleName(), "getSimpleName(...)");
        this.f38088a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String data) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f38088a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
