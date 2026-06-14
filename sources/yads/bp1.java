package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bp1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f109076d = "com.yandex.mobile.ads.mediation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tp1 f109078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109079c;

    public bp1(String str, tp1 tp1Var, List list) {
        this.f109077a = str;
        this.f109078b = tp1Var;
        this.f109079c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        return Intrinsics.areEqual(this.f109077a, bp1Var.f109077a) && this.f109078b == bp1Var.f109078b && Intrinsics.areEqual(this.f109079c, bp1Var.f109079c);
    }

    public final int hashCode() {
        return this.f109079c.hashCode() + ((this.f109078b.hashCode() + (this.f109077a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.f109077a + ", id=" + this.f109078b + ", adapters=" + this.f109079c + ")";
    }
}
