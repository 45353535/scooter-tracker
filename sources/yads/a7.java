package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108588c;

    public a7(List list, int i10, int i11) {
        this.f108586a = list;
        this.f108587b = i10;
        this.f108588c = i11;
    }

    public final List a() {
        return this.f108586a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return Intrinsics.areEqual(this.f108586a, a7Var.f108586a) && this.f108587b == a7Var.f108587b && this.f108588c == a7Var.f108588c;
    }

    public final int hashCode() {
        return this.f108588c + bb3.a(this.f108587b, this.f108586a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.f108586a + ", closableAdPosition=" + this.f108587b + ", rewardAdPosition=" + this.f108588c + ")";
    }
}
