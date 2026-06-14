package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Wn extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f37977g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wn(StackTraceElement[] stackTrace) {
        super("ANRWatchDog", "ANRWatchDogEvent", AbstractC3790il.a(stackTrace));
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.f37977g = stackTrace;
    }
}
