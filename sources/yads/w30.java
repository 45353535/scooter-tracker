package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e40 f117301d;

    public w30(String str, String str2, String str3, e40 e40Var) {
        this.f117298a = str;
        this.f117299b = str2;
        this.f117300c = str3;
        this.f117301d = e40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w30)) {
            return false;
        }
        w30 w30Var = (w30) obj;
        return Intrinsics.areEqual(this.f117298a, w30Var.f117298a) && Intrinsics.areEqual(this.f117299b, w30Var.f117299b) && Intrinsics.areEqual(this.f117300c, w30Var.f117300c) && Intrinsics.areEqual(this.f117301d, w30Var.f117301d);
    }

    public final int hashCode() {
        return this.f117301d.f110182a.hashCode() + j4.a(this.f117300c, j4.a(this.f117299b, this.f117298a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f117298a + ", format=" + this.f117299b + ", adUnitId=" + this.f117300c + ", mediation=" + this.f117301d + ")";
    }
}
