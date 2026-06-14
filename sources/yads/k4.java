package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112581d;

    public k4(int i10, String str, String str2, String str3) {
        this.f112578a = i10;
        this.f112579b = str;
        this.f112580c = str2;
        this.f112581d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return this.f112578a == k4Var.f112578a && Intrinsics.areEqual(this.f112579b, k4Var.f112579b) && Intrinsics.areEqual(this.f112580c, k4Var.f112580c) && Intrinsics.areEqual(this.f112581d, k4Var.f112581d);
    }

    public final int hashCode() {
        int iA = j4.a(this.f112580c, j4.a(this.f112579b, this.f112578a * 31, 31), 31);
        String str = this.f112581d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f112578a), this.f112579b, this.f112581d, this.f112580c}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
