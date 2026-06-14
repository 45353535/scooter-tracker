package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36820d;

    public F(byte b10, String impressionId, int i10, int i11, int[] viewableFrameArray) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(viewableFrameArray, "viewableFrameArray");
        this.f36817a = b10;
        this.f36818b = impressionId;
        this.f36819c = i10;
        this.f36820d = i11;
    }
}
