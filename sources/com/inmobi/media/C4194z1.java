package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4194z1 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4194z1(String str, int i10, String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC3790il.a("reason - " + i10 + " description - " + (str == null ? "ApplicationExit" : str), trace));
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f40026g = i10;
        this.f40027h = trace;
    }
}
