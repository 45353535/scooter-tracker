package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5 f116068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f116069b;

    public t5(u5 u5Var, Map map) {
        this.f116068a = u5Var;
        this.f116069b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return this.f116068a == t5Var.f116068a && Intrinsics.areEqual(this.f116069b, t5Var.f116069b);
    }

    public final int hashCode() {
        return this.f116069b.hashCode() + (this.f116068a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f116068a + ", reportParameters=" + this.f116069b + ")";
    }
}
