package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4394k6 implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f43445a;

    public C4394k6(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f43445a = activity;
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(Tb tb2) {
        ei.a(this, tb2);
    }

    @Override // com.ironsource.I
    public /* synthetic */ void a(C4595w2 c4595w2) {
        ei.c(this, c4595w2);
    }

    @Override // com.ironsource.I
    public void a(@NotNull C4361i6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f43445a);
    }
}
