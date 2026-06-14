package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class mp1 {

    @NotNull
    public static final lp1 Companion = new lp1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113581c;

    public /* synthetic */ mp1(int i10, String str, String str2, boolean z10) {
        if (7 != (i10 & 7)) {
            yg.e2.a(i10, 7, kp1.f112800a.getDescriptor());
        }
        this.f113579a = str;
        this.f113580b = str2;
        this.f113581c = z10;
    }

    public final String a() {
        return this.f113579a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp1)) {
            return false;
        }
        mp1 mp1Var = (mp1) obj;
        return Intrinsics.areEqual(this.f113579a, mp1Var.f113579a) && Intrinsics.areEqual(this.f113580b, mp1Var.f113580b) && this.f113581c == mp1Var.f113581c;
    }

    public final int hashCode() {
        int iHashCode = this.f113579a.hashCode() * 31;
        String str = this.f113580b;
        return androidx.compose.foundation.c.a(this.f113581c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationAdapterData(format=" + this.f113579a + ", version=" + this.f113580b + ", isIntegrated=" + this.f113581c + ")";
    }

    public mp1(String str, String str2, boolean z10) {
        this.f113579a = str;
        this.f113580b = str2;
        this.f113581c = z10;
    }
}
