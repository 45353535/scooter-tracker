package com.appodeal.ads.adapters.iab.mraid.mrec;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecParams f12221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecCallback f12222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12223c;

    public a(b bVar, UnifiedMrecParams unifiedMrecParams, UnifiedMrecCallback unifiedMrecCallback) {
        this.f12223c = bVar;
        this.f12221a = unifiedMrecParams;
        this.f12222b = unifiedMrecCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12223c;
        UnifiedMrecParams unifiedMrecParams = this.f12221a;
        UnifiedMrecCallback unifiedMrecCallback = this.f12222b;
        bVar.f12224a.c(context, unifiedMrecParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) obj, unifiedMrecCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12222b.onAdLoadFailed(loadingError);
    }
}
