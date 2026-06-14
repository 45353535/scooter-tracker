package com.appodeal.ads.adapters.iab.mraid.mrec;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.iab.mraid.unified.j;
import com.appodeal.ads.adapters.iab.mraid.unified.p;
import com.appodeal.ads.adapters.iab.mraid.unified.q;
import com.appodeal.ads.adapters.iab.mraid.unified.s;
import com.appodeal.ads.adapters.iab.unified.r;
import com.appodeal.ads.adapters.iab.unified.x;
import com.appodeal.ads.adapters.iab.utils.f;
import com.appodeal.ads.adapters.iab.utils.n;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;
import eg.i;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f12224a = new p(this);

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.m
    public final void a(Context context, UnifiedAdParams unifiedAdParams, com.appodeal.ads.adapters.iab.mraid.unified.a aVar, UnifiedAdCallback unifiedAdCallback, String str) {
        x runnable = new x(context, str, aVar.f12229a, x.f12298j, new r(aVar), new a(this, (UnifiedMrecParams) unifiedAdParams, (UnifiedMrecCallback) unifiedAdCallback));
        Lazy lazy = n.f12324a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        i.d((CoroutineScope) n.f12325b.getValue(), null, null, new f(runnable, null), 3, null);
    }

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.q
    public final s i(UnifiedViewAdParams unifiedViewAdParams, com.appodeal.ads.adapters.iab.mraid.unified.a aVar, UnifiedViewAdCallback unifiedViewAdCallback) {
        return new j((UnifiedMrecCallback) unifiedViewAdCallback, aVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        p pVar = this.f12224a;
        pVar.getClass();
        Context applicationContext = contextProvider.getApplicationContext();
        com.appodeal.ads.adapters.iab.mraid.unified.r.a(applicationContext, (UnifiedMrecParams) unifiedAdParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) adUnitParams, (UnifiedMrecCallback) unifiedAdCallback, pVar);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onClicked() {
        super.onClicked();
        this.f12224a.onClicked();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        this.f12224a.onDestroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onFinished() {
        super.onFinished();
        this.f12224a.onFinished();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        super.onPrepareToShow(activity, unifiedMrecParams);
        this.f12224a.onPrepareToShow(activity, unifiedMrecParams);
    }
}
