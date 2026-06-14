package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class z40 {

    @NotNull
    public static final y40 Companion = new y40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118540d;

    public /* synthetic */ z40(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, x40.f117698a.getDescriptor());
        }
        this.f118537a = str;
        this.f118538b = str2;
        this.f118539c = str3;
        this.f118540d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        return Intrinsics.areEqual(this.f118537a, z40Var.f118537a) && Intrinsics.areEqual(this.f118538b, z40Var.f118538b) && Intrinsics.areEqual(this.f118539c, z40Var.f118539c) && Intrinsics.areEqual(this.f118540d, z40Var.f118540d);
    }

    public final int hashCode() {
        return this.f118540d.hashCode() + j4.a(this.f118539c, j4.a(this.f118538b, this.f118537a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DebugPanelAppData(appId=" + this.f118537a + ", appVersion=" + this.f118538b + ", system=" + this.f118539c + ", androidApiLevel=" + this.f118540d + ")";
    }

    public z40(String str, String str2, String str3, String str4) {
        this.f118537a = str;
        this.f118538b = str2;
        this.f118539c = str3;
        this.f118540d = str4;
    }
}
