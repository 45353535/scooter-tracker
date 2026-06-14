package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3992qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f39410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f39411b;

    public C3992qn(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f39410a = adContext;
        boolean[] zArr = new boolean[5];
        for (int i10 = 0; i10 < 5; i10++) {
            zArr[i10] = false;
        }
        this.f39411b = zArr;
    }
}
