package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4525s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4458o0 f44878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdInfo f44879b;

    public C4525s0(@NotNull AbstractC4458o0 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f44878a = adUnit;
        this.f44879b = levelPlayAdInfo;
    }

    @NotNull
    public final AbstractC4458o0 a() {
        return this.f44878a;
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.f44879b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.f44879b;
    }

    @NotNull
    public final AbstractC4458o0 d() {
        return this.f44878a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4525s0)) {
            return false;
        }
        C4525s0 c4525s0 = (C4525s0) obj;
        return Intrinsics.areEqual(this.f44878a, c4525s0.f44878a) && Intrinsics.areEqual(this.f44879b, c4525s0.f44879b);
    }

    public int hashCode() {
        int iHashCode = this.f44878a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f44879b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f44878a + ", adInfo=" + this.f44879b + ")";
    }

    public /* synthetic */ C4525s0(AbstractC4458o0 abstractC4458o0, LevelPlayAdInfo levelPlayAdInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4458o0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    public final C4525s0 a(@NotNull AbstractC4458o0 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C4525s0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C4525s0 a(C4525s0 c4525s0, AbstractC4458o0 abstractC4458o0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC4458o0 = c4525s0.f44878a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c4525s0.f44879b;
        }
        return c4525s0.a(abstractC4458o0, levelPlayAdInfo);
    }
}
