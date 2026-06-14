package com.appodeal.ads.adapters.iab.mraid.banner;

import android.content.Context;
import com.appodeal.ads.adapters.iab.mraid.unified.c;
import com.appodeal.ads.adapters.iab.unified.r;
import com.appodeal.ads.adapters.iab.unified.x;
import com.appodeal.ads.adapters.iab.utils.f;
import com.appodeal.ads.adapters.iab.utils.n;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import eg.i;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends c {
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.m
    public final void a(Context context, UnifiedAdParams unifiedAdParams, com.appodeal.ads.adapters.iab.mraid.unified.a aVar, UnifiedAdCallback unifiedAdCallback, String str) {
        x runnable = new x(context, str, aVar.f12229a, x.f12298j, new r(aVar), new a(this, (UnifiedBannerParams) unifiedAdParams, (UnifiedBannerCallback) unifiedAdCallback));
        Lazy lazy = n.f12324a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        i.d((CoroutineScope) n.f12325b.getValue(), null, null, new f(runnable, null), 3, null);
    }
}
