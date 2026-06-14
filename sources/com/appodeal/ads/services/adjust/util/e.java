package com.appodeal.ads.services.adjust.util;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionReadListener;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements OnAttributionReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14568a;

    public e(kotlinx.coroutines.e eVar) {
        this.f14568a = eVar;
    }

    @Override // com.adjust.sdk.OnAttributionReadListener
    public final void onAttributionRead(AdjustAttribution adjustAttribution) {
        this.f14568a.resumeWith(Result.b(adjustAttribution));
    }
}
