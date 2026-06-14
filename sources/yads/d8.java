package yads;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f109822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f109827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f109828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f109829h;

    public d8(boolean z10, boolean z11, String str, long j10, int i10, boolean z12, Set set, Map map) {
        this.f109822a = z10;
        this.f109823b = z11;
        this.f109824c = str;
        this.f109825d = j10;
        this.f109826e = i10;
        this.f109827f = z12;
        this.f109828g = set;
        this.f109829h = map;
    }

    public final boolean a() {
        return this.f109822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return this.f109822a == d8Var.f109822a && this.f109823b == d8Var.f109823b && Intrinsics.areEqual(this.f109824c, d8Var.f109824c) && this.f109825d == d8Var.f109825d && this.f109826e == d8Var.f109826e && this.f109827f == d8Var.f109827f && Intrinsics.areEqual(this.f109828g, d8Var.f109828g) && Intrinsics.areEqual(this.f109829h, d8Var.f109829h);
    }

    public final int hashCode() {
        return this.f109829h.hashCode() + ((this.f109828g.hashCode() + ((androidx.compose.foundation.c.a(this.f109827f) + bb3.a(this.f109826e, (androidx.collection.b.a(this.f109825d) + j4.a(this.f109824c, (androidx.compose.foundation.c.a(this.f109823b) + (androidx.compose.foundation.c.a(this.f109822a) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f109822a + ", debug=" + this.f109823b + ", apiKey=" + this.f109824c + ", validationTimeoutInSec=" + this.f109825d + ", usagePercent=" + this.f109826e + ", blockAdOnInternalError=" + this.f109827f + ", enabledAdUnits=" + this.f109828g + ", adNetworksCustomParameters=" + this.f109829h + ")";
    }
}
