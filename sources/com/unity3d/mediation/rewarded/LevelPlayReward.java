package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f67904b;

    public LevelPlayReward(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f67903a = name;
        this.f67904b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f67903a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f67904b;
        }
        return levelPlayReward.copy(str, i10);
    }

    @NotNull
    public final String component1() {
        return this.f67903a;
    }

    public final int component2() {
        return this.f67904b;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.areEqual(this.f67903a, levelPlayReward.f67903a) && this.f67904b == levelPlayReward.f67904b;
    }

    public final int getAmount() {
        return this.f67904b;
    }

    @NotNull
    public final String getName() {
        return this.f67903a;
    }

    public int hashCode() {
        return (this.f67903a.hashCode() * 31) + this.f67904b;
    }

    @NotNull
    public String toString() {
        return "LevelPlayReward(name=" + this.f67903a + ", amount=" + this.f67904b + ")";
    }
}
