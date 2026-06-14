package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class r30 {

    @NotNull
    public static final q30 Companion = new q30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z30 f115292d;

    public /* synthetic */ r30(int i10, String str, String str2, String str3, z30 z30Var) {
        if (7 != (i10 & 7)) {
            yg.e2.a(i10, 7, p30.f114542a.getDescriptor());
        }
        this.f115289a = str;
        this.f115290b = str2;
        this.f115291c = str3;
        if ((i10 & 8) == 0) {
            this.f115292d = null;
        } else {
            this.f115292d = z30Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return Intrinsics.areEqual(this.f115289a, r30Var.f115289a) && Intrinsics.areEqual(this.f115290b, r30Var.f115290b) && Intrinsics.areEqual(this.f115291c, r30Var.f115291c) && Intrinsics.areEqual(this.f115292d, r30Var.f115292d);
    }

    public final int hashCode() {
        int iA = j4.a(this.f115291c, j4.a(this.f115290b, this.f115289a.hashCode() * 31, 31), 31);
        z30 z30Var = this.f115292d;
        return iA + (z30Var == null ? 0 : z30Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.f115289a + ", format=" + this.f115290b + ", adUnitId=" + this.f115291c + ", mediation=" + this.f115292d + ")";
    }
}
