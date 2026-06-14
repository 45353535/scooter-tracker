package com.appodeal.ads.adapters.iab.vast.interstitial;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.adapters.iab.vast.unified.e;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialParams f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f12327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12328c;

    public a(b bVar, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12328c = bVar;
        this.f12326a = unifiedInterstitialParams;
        this.f12327b = unifiedInterstitialCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12328c;
        UnifiedInterstitialParams unifiedInterstitialParams = this.f12326a;
        UnifiedInterstitialCallback unifiedInterstitialCallback = this.f12327b;
        bVar.f12329a.j(context, unifiedInterstitialParams, (e) obj, unifiedInterstitialCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12327b.onAdLoadFailed(loadingError);
    }
}
