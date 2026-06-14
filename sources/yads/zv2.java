package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f118848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f118849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f118850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx2 f118851e;

    public zv2(String str, Long l10, boolean z10, boolean z11, kx2 kx2Var) {
        this.f118847a = str;
        this.f118848b = l10;
        this.f118849c = z10;
        this.f118850d = z11;
        this.f118851e = kx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv2)) {
            return false;
        }
        zv2 zv2Var = (zv2) obj;
        return Intrinsics.areEqual(this.f118847a, zv2Var.f118847a) && Intrinsics.areEqual(this.f118848b, zv2Var.f118848b) && this.f118849c == zv2Var.f118849c && this.f118850d == zv2Var.f118850d && Intrinsics.areEqual(this.f118851e, zv2Var.f118851e);
    }

    public final int hashCode() {
        String str = this.f118847a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f118848b;
        int iA = (androidx.compose.foundation.c.a(this.f118850d) + ((androidx.compose.foundation.c.a(this.f118849c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31;
        kx2 kx2Var = this.f118851e;
        return iA + (kx2Var != null ? kx2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f118847a + ", multiBannerAutoScrollInterval=" + this.f118848b + ", isHighlightingEnabled=" + this.f118849c + ", isLoopingVideo=" + this.f118850d + ", mediaAssetImageFallbackSize=" + this.f118851e + ")";
    }
}
