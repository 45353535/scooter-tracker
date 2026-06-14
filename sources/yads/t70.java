package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class t70 {

    @NotNull
    public static final s70 Companion = new s70();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f116094g = {null, null, null, null, new yg.f(yg.y2.f119104a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f116098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f116099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f116100f;

    public /* synthetic */ t70(int i10, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i10 & 18)) {
            yg.e2.a(i10, 18, r70.f115355a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f116095a = null;
        } else {
            this.f116095a = str;
        }
        this.f116096b = str2;
        if ((i10 & 4) == 0) {
            this.f116097c = null;
        } else {
            this.f116097c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f116098d = null;
        } else {
            this.f116098d = str4;
        }
        this.f116099e = list;
        if ((i10 & 32) == 0) {
            this.f116100f = null;
        } else {
            this.f116100f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return Intrinsics.areEqual(this.f116095a, t70Var.f116095a) && Intrinsics.areEqual(this.f116096b, t70Var.f116096b) && Intrinsics.areEqual(this.f116097c, t70Var.f116097c) && Intrinsics.areEqual(this.f116098d, t70Var.f116098d) && Intrinsics.areEqual(this.f116099e, t70Var.f116099e) && Intrinsics.areEqual(this.f116100f, t70Var.f116100f);
    }

    public final int hashCode() {
        String str = this.f116095a;
        int iA = j4.a(this.f116096b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f116097c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f116098d;
        int iA2 = cb.a(this.f116099e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f116100f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.f116095a + ", name=" + this.f116096b + ", logoUrl=" + this.f116097c + ", adapterStatus=" + this.f116098d + ", adapters=" + this.f116099e + ", latestAdapterVersion=" + this.f116100f + ")";
    }
}
