package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f58891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f58892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f58893c;

    public q(f0 vastOptions, o mraidOptions, o staticOptions) {
        Intrinsics.checkNotNullParameter(vastOptions, "vastOptions");
        Intrinsics.checkNotNullParameter(mraidOptions, "mraidOptions");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        this.f58891a = vastOptions;
        this.f58892b = mraidOptions;
        this.f58893c = staticOptions;
    }

    public final o a() {
        return this.f58892b;
    }

    public final o b() {
        return this.f58893c;
    }

    public final f0 c() {
        return this.f58891a;
    }
}
