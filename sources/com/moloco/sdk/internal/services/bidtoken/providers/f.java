package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f55398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f55399b;

    public f(j0 j0Var, Integer num) {
        this.f55398a = j0Var;
        this.f55399b = num;
    }

    public final Integer a() {
        return this.f55399b;
    }

    public final j0 b() {
        return this.f55398a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f55398a == fVar.f55398a && Intrinsics.areEqual(this.f55399b, fVar.f55399b);
    }

    public int hashCode() {
        j0 j0Var = this.f55398a;
        int iHashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 31;
        Integer num = this.f55399b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AudioSignal(muteSwitchState=" + this.f55398a + ", mediaVolume=" + this.f55399b + ')';
    }

    public /* synthetic */ f(j0 j0Var, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : j0Var, (i10 & 2) != 0 ? null : num);
    }
}
