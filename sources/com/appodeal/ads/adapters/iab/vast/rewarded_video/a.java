package com.appodeal.ads.adapters.iab.vast.rewarded_video;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.adapters.iab.vast.unified.e;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedParams f12330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f12331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12332c;

    public a(b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12332c = bVar;
        this.f12330a = unifiedRewardedParams;
        this.f12331b = unifiedRewardedCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12332c;
        UnifiedRewardedParams unifiedRewardedParams = this.f12330a;
        UnifiedRewardedCallback unifiedRewardedCallback = this.f12331b;
        bVar.f12333a.j(context, unifiedRewardedParams, (e) obj, unifiedRewardedCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12331b.onAdLoadFailed(loadingError);
    }
}
