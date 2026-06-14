package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tt2 implements ko2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116382b;

    public tt2(int i10, String str) {
        this.f116381a = i10;
        this.f116382b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2)) {
            return false;
        }
        tt2 tt2Var = (tt2) obj;
        return this.f116381a == tt2Var.f116381a && Intrinsics.areEqual(this.f116382b, tt2Var.f116382b);
    }

    public final int hashCode() {
        return this.f116382b.hashCode() + (this.f116381a * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f116381a + ", type=" + this.f116382b + ")";
    }
}
