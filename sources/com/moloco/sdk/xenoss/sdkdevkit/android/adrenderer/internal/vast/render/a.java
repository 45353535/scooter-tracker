package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f57671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f57672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f57674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f57675e;

    public a(f linear, c cVar, List impressionTracking, List errorTracking, k0 k0Var) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        this.f57671a = linear;
        this.f57672b = cVar;
        this.f57673c = impressionTracking;
        this.f57674d = errorTracking;
        this.f57675e = k0Var;
    }

    public static /* synthetic */ a a(a aVar, f fVar, c cVar, List list, List list2, k0 k0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = aVar.f57671a;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f57672b;
        }
        if ((i10 & 4) != 0) {
            list = aVar.f57673c;
        }
        if ((i10 & 8) != 0) {
            list2 = aVar.f57674d;
        }
        if ((i10 & 16) != 0) {
            k0Var = aVar.f57675e;
        }
        k0 k0Var2 = k0Var;
        List list3 = list;
        return aVar.b(fVar, cVar, list3, list2, k0Var2);
    }

    public final a b(f linear, c cVar, List impressionTracking, List errorTracking, k0 k0Var) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        return new a(linear, cVar, impressionTracking, errorTracking, k0Var);
    }

    public final c c() {
        return this.f57672b;
    }

    public final k0 d() {
        return this.f57675e;
    }

    public final List e() {
        return this.f57674d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f57671a, aVar.f57671a) && Intrinsics.areEqual(this.f57672b, aVar.f57672b) && Intrinsics.areEqual(this.f57673c, aVar.f57673c) && Intrinsics.areEqual(this.f57674d, aVar.f57674d) && Intrinsics.areEqual(this.f57675e, aVar.f57675e);
    }

    public final List f() {
        return this.f57673c;
    }

    public final f g() {
        return this.f57671a;
    }

    public int hashCode() {
        int iHashCode = this.f57671a.hashCode() * 31;
        c cVar = this.f57672b;
        int iHashCode2 = (((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f57673c.hashCode()) * 31) + this.f57674d.hashCode()) * 31;
        k0 k0Var = this.f57675e;
        return iHashCode2 + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public String toString() {
        return "Ad(linear=" + this.f57671a + ", companion=" + this.f57672b + ", impressionTracking=" + this.f57673c + ", errorTracking=" + this.f57674d + ", dec=" + this.f57675e + ')';
    }

    public /* synthetic */ a(f fVar, c cVar, List list, List list2, k0 k0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, cVar, list, list2, (i10 & 16) != 0 ? null : k0Var);
    }
}
