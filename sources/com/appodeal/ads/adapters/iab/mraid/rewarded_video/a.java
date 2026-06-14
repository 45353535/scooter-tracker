package com.appodeal.ads.adapters.iab.mraid.rewarded_video;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedParams f12225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f12226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12227c;

    public a(b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12227c = bVar;
        this.f12225a = unifiedRewardedParams;
        this.f12226b = unifiedRewardedCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12227c;
        UnifiedRewardedParams unifiedRewardedParams = this.f12225a;
        UnifiedRewardedCallback unifiedRewardedCallback = this.f12226b;
        bVar.f12228a.c(context, unifiedRewardedParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) obj, unifiedRewardedCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12226b.onAdLoadFailed(loadingError);
    }
}
