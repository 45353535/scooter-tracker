package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4283dd extends AbstractC4545t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String f42919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4283dd(int i10, @NotNull String placementName, boolean z10, @NotNull String rewardName, int i11, @Nullable C4300ed c4300ed) {
        super(i10, placementName, z10, c4300ed);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f42920f = i11;
        this.f42919e = rewardName;
    }

    public final int e() {
        return this.f42920f;
    }

    @NotNull
    public final String f() {
        return this.f42919e;
    }

    @Override // com.ironsource.AbstractC4545t3
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.f42919e + " , amount: " + this.f42920f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4283dd(@NotNull AbstractC4545t3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f42919e = "";
    }
}
