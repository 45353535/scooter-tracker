package com.appodeal.ads.services.adjust.util;

import com.adjust.sdk.OnAdidReadListener;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements OnAdidReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14564a;

    public b(kotlinx.coroutines.e eVar) {
        this.f14564a = eVar;
    }

    @Override // com.adjust.sdk.OnAdidReadListener
    public final void onAdidRead(String str) {
        this.f14564a.resumeWith(Result.b(str));
    }
}
