package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s7 implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f65244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f65247e;

    public s7(Context context, AdUnitConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f65243a = context;
        this.f65244b = config;
        this.f65245c = -1;
        this.f65246d = -1;
    }

    public final void a() {
        int i10 = this.f65245c;
        if (i10 == -1) {
            i10 = (int) (this.f65243a.getResources().getDisplayMetrics().widthPixels / this.f65243a.getResources().getDisplayMetrics().density);
        }
        int i11 = this.f65246d;
        AdSize inlineAdaptiveBannerAdSize = i11 != -1 ? AdSize.getInlineAdaptiveBannerAdSize(i10, i11) : AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.f65243a, i10);
        Intrinsics.checkNotNull(inlineAdaptiveBannerAdSize);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : this.f65244b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(adManagerAdRequestBuild, "build(...)");
        AdManagerAdView adManagerAdView = new AdManagerAdView(this.f65243a);
        adManagerAdView.setAdSizes(inlineAdaptiveBannerAdSize, AdSize.BANNER);
        adManagerAdView.setAdUnitId(this.f65244b.getAdUnitId());
        adManagerAdView.setAdListener(new r7(this, adManagerAdView));
        adManagerAdView.loadAd(adManagerAdRequestBuild);
    }
}
