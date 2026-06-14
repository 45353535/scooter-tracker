package com.moloco.sdk.internal.publisher.nativead.parser;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f54999c;

    public b(int i10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c errorSubType) {
        Intrinsics.checkNotNullParameter(errorSubType, "errorSubType");
        this.f54998b = i10;
        this.f54999c = errorSubType;
    }

    public final int d() {
        return this.f54998b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c g() {
        return this.f54999c;
    }
}
