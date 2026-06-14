package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class lf2 {

    @NotNull
    public static final kf2 Companion = new kf2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113085b;

    public /* synthetic */ lf2(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, jf2.f112332a.getDescriptor());
        }
        this.f113084a = str;
        this.f113085b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf2)) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return Intrinsics.areEqual(this.f113084a, lf2Var.f113084a) && Intrinsics.areEqual(this.f113085b, lf2Var.f113085b);
    }

    public final int hashCode() {
        return this.f113085b.hashCode() + (this.f113084a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchedMediationNetworkWinner(networkName=" + this.f113084a + ", networkAdUnit=" + this.f113085b + ")";
    }
}
