package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class pv0 {

    @NotNull
    public static final ov0 Companion = new ov0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f114798d;

    public /* synthetic */ pv0(int i10, String str, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            yg.e2.a(i10, 15, nv0.f114054a.getDescriptor());
        }
        this.f114795a = str;
        this.f114796b = str2;
        this.f114797c = str3;
        this.f114798d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0)) {
            return false;
        }
        pv0 pv0Var = (pv0) obj;
        return Intrinsics.areEqual(this.f114795a, pv0Var.f114795a) && Intrinsics.areEqual(this.f114796b, pv0Var.f114796b) && Intrinsics.areEqual(this.f114797c, pv0Var.f114797c) && Intrinsics.areEqual(this.f114798d, pv0Var.f114798d);
    }

    public final int hashCode() {
        return this.f114798d.hashCode() + j4.a(this.f114797c, j4.a(this.f114796b, this.f114795a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FontUrls(regular=" + this.f114795a + ", bold=" + this.f114796b + ", light=" + this.f114797c + ", medium=" + this.f114798d + ")";
    }
}
