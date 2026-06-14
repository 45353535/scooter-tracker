package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k90 extends o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k80 f112652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d50 f112653c;

    public k90(String str, String str2) {
        this(str, new k80(str2, 0, null, 0, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return Intrinsics.areEqual(this.f112651a, k90Var.f112651a) && Intrinsics.areEqual(this.f112652b, k90Var.f112652b) && Intrinsics.areEqual(this.f112653c, k90Var.f112653c);
    }

    public final int hashCode() {
        String str = this.f112651a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        k80 k80Var = this.f112652b;
        int iHashCode2 = (iHashCode + (k80Var == null ? 0 : k80Var.hashCode())) * 31;
        d50 d50Var = this.f112653c;
        return iHashCode2 + (d50Var != null ? d50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.f112651a + ", subtitle=" + this.f112652b + ", text=" + this.f112653c + ")";
    }

    public /* synthetic */ k90(String str, k80 k80Var) {
        this(str, k80Var, null);
    }

    public k90(String str, k80 k80Var, d50 d50Var) {
        super(0);
        this.f112651a = str;
        this.f112652b = k80Var;
        this.f112653c = d50Var;
    }
}
