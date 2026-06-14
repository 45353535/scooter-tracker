package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class A2 implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final eg f40175a;

    public A2(@NotNull eg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f40175a = viewBinder;
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(Tb tb2) {
        ei.a(this, tb2);
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(C4361i6 c4361i6) {
        ei.b(this, c4361i6);
    }

    @Override // com.ironsource.I
    public void a(@NotNull C4595w2 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.f40175a);
    }
}
