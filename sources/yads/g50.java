package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class g50 {

    @NotNull
    public static final f50 Companion = new f50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f111063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f111064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f111065d;

    public /* synthetic */ g50(int i10, boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, e50.f110206a.getDescriptor());
        }
        this.f111062a = z10;
        this.f111063b = bool;
        this.f111064c = bool2;
        this.f111065d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return this.f111062a == g50Var.f111062a && Intrinsics.areEqual(this.f111063b, g50Var.f111063b) && Intrinsics.areEqual(this.f111064c, g50Var.f111064c) && this.f111065d == g50Var.f111065d;
    }

    public final int hashCode() {
        int iA = androidx.compose.foundation.c.a(this.f111062a) * 31;
        Boolean bool = this.f111063b;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f111064c;
        return androidx.compose.foundation.c.a(this.f111065d) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f111062a + ", ageRestrictedUser=" + this.f111063b + ", hasUserConsent=" + this.f111064c + ", hasCmpValue=" + this.f111065d + ")";
    }

    public g50(boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        this.f111062a = z10;
        this.f111063b = bool;
        this.f111064c = bool2;
        this.f111065d = z11;
    }
}
