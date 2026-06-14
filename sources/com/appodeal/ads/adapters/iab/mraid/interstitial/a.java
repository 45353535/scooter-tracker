package com.appodeal.ads.adapters.iab.mraid.interstitial;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialParams f12217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f12218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12219c;

    public a(b bVar, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12219c = bVar;
        this.f12217a = unifiedInterstitialParams;
        this.f12218b = unifiedInterstitialCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12219c;
        UnifiedInterstitialParams unifiedInterstitialParams = this.f12217a;
        UnifiedInterstitialCallback unifiedInterstitialCallback = this.f12218b;
        bVar.f12220a.c(context, unifiedInterstitialParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) obj, unifiedInterstitialCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12218b.onAdLoadFailed(loadingError);
    }
}
