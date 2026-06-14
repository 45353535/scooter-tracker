package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f111215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final td1 f111216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f111217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f111218f;

    public gi(String str, String str2, Object obj, td1 td1Var, boolean z10, boolean z11) {
        this.f111213a = str;
        this.f111214b = str2;
        this.f111215c = obj;
        this.f111216d = td1Var;
        this.f111217e = z10;
        this.f111218f = z11;
    }

    public final td1 a() {
        return this.f111216d;
    }

    public final String b() {
        return this.f111213a;
    }

    public final Object c() {
        return this.f111215c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return Intrinsics.areEqual(this.f111213a, giVar.f111213a) && Intrinsics.areEqual(this.f111214b, giVar.f111214b) && Intrinsics.areEqual(this.f111215c, giVar.f111215c) && Intrinsics.areEqual(this.f111216d, giVar.f111216d) && this.f111217e == giVar.f111217e && this.f111218f == giVar.f111218f;
    }

    public final int hashCode() {
        int iA = j4.a(this.f111214b, this.f111213a.hashCode() * 31, 31);
        Object obj = this.f111215c;
        int iHashCode = (iA + (obj == null ? 0 : obj.hashCode())) * 31;
        td1 td1Var = this.f111216d;
        return androidx.compose.foundation.c.a(this.f111218f) + ((androidx.compose.foundation.c.a(this.f111217e) + ((iHashCode + (td1Var != null ? td1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Asset(name=" + this.f111213a + ", type=" + this.f111214b + ", value=" + this.f111215c + ", link=" + this.f111216d + ", isClickable=" + this.f111217e + ", isRequired=" + this.f111218f + ")";
    }
}
