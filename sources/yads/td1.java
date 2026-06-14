package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op0 f116206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f116207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f116208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f116209e;

    public td1(List list, op0 op0Var, List list2, String str, long j10) {
        this.f116205a = list;
        this.f116206b = op0Var;
        this.f116207c = list2;
        this.f116208d = str;
        this.f116209e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td1)) {
            return false;
        }
        td1 td1Var = (td1) obj;
        return Intrinsics.areEqual(this.f116205a, td1Var.f116205a) && Intrinsics.areEqual(this.f116206b, td1Var.f116206b) && Intrinsics.areEqual(this.f116207c, td1Var.f116207c) && Intrinsics.areEqual(this.f116208d, td1Var.f116208d) && this.f116209e == td1Var.f116209e;
    }

    public final int hashCode() {
        List list = this.f116205a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        op0 op0Var = this.f116206b;
        int iA = cb.a(this.f116207c, (iHashCode + (op0Var == null ? 0 : op0Var.hashCode())) * 31, 31);
        String str = this.f116208d;
        return androidx.collection.b.a(this.f116209e) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.f116205a + ", falseClick=" + this.f116206b + ", trackingUrls=" + this.f116207c + ", url=" + this.f116208d + ", clickableDelay=" + this.f116209e + ")";
    }
}
