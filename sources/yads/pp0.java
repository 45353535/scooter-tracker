package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz f114734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f114736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final op0 f114737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f114738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f114739f;

    public pp0(qz qzVar, long j10, h1 h1Var, op0 op0Var, Map map, c cVar) {
        this.f114734a = qzVar;
        this.f114735b = j10;
        this.f114736c = h1Var;
        this.f114737d = op0Var;
        this.f114738e = map;
        this.f114739f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp0)) {
            return false;
        }
        pp0 pp0Var = (pp0) obj;
        return this.f114734a == pp0Var.f114734a && this.f114735b == pp0Var.f114735b && this.f114736c == pp0Var.f114736c && Intrinsics.areEqual(this.f114737d, pp0Var.f114737d) && Intrinsics.areEqual(this.f114738e, pp0Var.f114738e) && Intrinsics.areEqual(this.f114739f, pp0Var.f114739f);
    }

    public final int hashCode() {
        int iHashCode = (this.f114736c.hashCode() + ((androidx.collection.b.a(this.f114735b) + (this.f114734a.hashCode() * 31)) * 31)) * 31;
        op0 op0Var = this.f114737d;
        int iHashCode2 = (this.f114738e.hashCode() + ((iHashCode + (op0Var == null ? 0 : op0Var.hashCode())) * 31)) * 31;
        c cVar = this.f114739f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f114734a + ", startTime=" + this.f114735b + ", activityInteractionType=" + this.f114736c + ", falseClick=" + this.f114737d + ", reportData=" + this.f114738e + ", abExperiments=" + this.f114739f + ")";
    }
}
