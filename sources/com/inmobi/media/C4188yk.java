package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4188yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f40015d;

    public C4188yk(int i10, int i11, int i12, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f40012a = i10;
        this.f40013b = i11;
        this.f40014c = i12;
        this.f40015d = action;
    }
}
