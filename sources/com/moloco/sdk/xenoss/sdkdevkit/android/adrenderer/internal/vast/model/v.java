package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f57629b;

    public v(String resource, k creativeType) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.f57628a = resource;
        this.f57629b = creativeType;
    }

    public final k a() {
        return this.f57629b;
    }

    public final String b() {
        return this.f57628a;
    }
}
