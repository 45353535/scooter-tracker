package com.appodeal.ads.utils.tracker;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15132b;

    public c(f fVar) {
        this.f15132b = fVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f15132b.getClass();
        f.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f15132b.getClass();
        f.b(i10);
    }
}
