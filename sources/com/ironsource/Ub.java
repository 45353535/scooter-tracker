package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Ub implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Mb f41844a;

    public Ub(@NotNull Mb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        this.f41844a = nativeAdBinder;
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(C4361i6 c4361i6) {
        ei.b(this, c4361i6);
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(C4595w2 c4595w2) {
        ei.c(this, c4595w2);
    }

    @Override // com.ironsource.I
    public void a(@NotNull Tb nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
        nativeAdInstance.a(this.f41844a);
    }
}
