package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class df2 {

    @NotNull
    public static final cf2 Companion = new cf2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lf2 f109907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg2 f109908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vf2 f109909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f109910e;

    public /* synthetic */ df2(int i10, String str, lf2 lf2Var, bg2 bg2Var, vf2 vf2Var, String str2) {
        if (31 != (i10 & 31)) {
            yg.e2.a(i10, 31, bf2.f108991a.getDescriptor());
        }
        this.f109906a = str;
        this.f109907b = lf2Var;
        this.f109908c = bg2Var;
        this.f109909d = vf2Var;
        this.f109910e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return Intrinsics.areEqual(this.f109906a, df2Var.f109906a) && Intrinsics.areEqual(this.f109907b, df2Var.f109907b) && Intrinsics.areEqual(this.f109908c, df2Var.f109908c) && Intrinsics.areEqual(this.f109909d, df2Var.f109909d) && Intrinsics.areEqual(this.f109910e, df2Var.f109910e);
    }

    public final int hashCode() {
        int iHashCode = this.f109906a.hashCode() * 31;
        lf2 lf2Var = this.f109907b;
        int iHashCode2 = (iHashCode + (lf2Var == null ? 0 : lf2Var.hashCode())) * 31;
        bg2 bg2Var = this.f109908c;
        int iHashCode3 = (this.f109909d.hashCode() + ((iHashCode2 + (bg2Var == null ? 0 : bg2Var.hashCode())) * 31)) * 31;
        String str = this.f109910e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.f109906a + ", networkWinner=" + this.f109907b + ", revenue=" + this.f109908c + ", result=" + this.f109909d + ", networkAdInfo=" + this.f109910e + ")";
    }

    public df2(String str, lf2 lf2Var, bg2 bg2Var, vf2 vf2Var, String str2) {
        this.f109906a = str;
        this.f109907b = lf2Var;
        this.f109908c = bg2Var;
        this.f109909d = vf2Var;
        this.f109910e = str2;
    }
}
