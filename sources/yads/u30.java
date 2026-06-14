package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class u30 {

    @NotNull
    public static final t30 Companion = new t30();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KSerializer[] f116472f = {null, null, new yg.f(a50.f108557a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f116475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f116476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f116477e;

    public /* synthetic */ u30(int i10, String str, String str2, List list, String str3, String str4) {
        if (6 != (i10 & 6)) {
            yg.e2.a(i10, 6, s30.f115677a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f116473a = null;
        } else {
            this.f116473a = str;
        }
        this.f116474b = str2;
        this.f116475c = list;
        if ((i10 & 8) == 0) {
            this.f116476d = null;
        } else {
            this.f116476d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f116477e = null;
        } else {
            this.f116477e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return Intrinsics.areEqual(this.f116473a, u30Var.f116473a) && Intrinsics.areEqual(this.f116474b, u30Var.f116474b) && Intrinsics.areEqual(this.f116475c, u30Var.f116475c) && Intrinsics.areEqual(this.f116476d, u30Var.f116476d) && Intrinsics.areEqual(this.f116477e, u30Var.f116477e);
    }

    public final int hashCode() {
        String str = this.f116473a;
        int iA = cb.a(this.f116475c, j4.a(this.f116474b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f116476d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f116477e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.f116473a + ", networkName=" + this.f116474b + ", biddingParameters=" + this.f116475c + ", adUnitId=" + this.f116476d + ", networkAdUnitIdName=" + this.f116477e + ")";
    }
}
