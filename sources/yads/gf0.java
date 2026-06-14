package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f111176d;

    public gf0(String str, String str2, String str3, ArrayList arrayList) {
        this.f111173a = str;
        this.f111174b = str2;
        this.f111175c = str3;
        this.f111176d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        return Intrinsics.areEqual(this.f111173a, gf0Var.f111173a) && Intrinsics.areEqual(this.f111174b, gf0Var.f111174b) && Intrinsics.areEqual(this.f111175c, gf0Var.f111175c) && Intrinsics.areEqual(this.f111176d, gf0Var.f111176d);
    }

    public final int hashCode() {
        int iA = j4.a(this.f111175c, j4.a(this.f111174b, this.f111173a.hashCode() * 31, 31), 31);
        List list = this.f111176d;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Design(type=" + this.f111173a + ", target=" + this.f111174b + ", layout=" + this.f111175c + ", images=" + this.f111176d + ")";
    }
}
