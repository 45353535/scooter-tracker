package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f109886b = ExtendedNativeAdView.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hf0 f109887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final if0 f109888d;

    public dd1(int i10, sx sxVar, if0 if0Var) {
        this.f109885a = i10;
        this.f109887c = sxVar;
        this.f109888d = if0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd1)) {
            return false;
        }
        dd1 dd1Var = (dd1) obj;
        return this.f109885a == dd1Var.f109885a && Intrinsics.areEqual(this.f109886b, dd1Var.f109886b) && Intrinsics.areEqual(this.f109887c, dd1Var.f109887c) && Intrinsics.areEqual(this.f109888d, dd1Var.f109888d);
    }

    public final int hashCode() {
        return this.f109888d.hashCode() + ((this.f109887c.hashCode() + ((this.f109886b.hashCode() + (this.f109885a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f109885a + ", layoutViewClass=" + this.f109886b + ", designComponentBinder=" + this.f109887c + ", designConstraint=" + this.f109888d + ")";
    }
}
