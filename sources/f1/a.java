package f1;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f69345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69347c;

    public a(ViewGroup bannerView, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f69345a = bannerView;
        this.f69346b = i10;
        this.f69347c = i11;
    }

    public final int a() {
        return this.f69347c;
    }

    public final ViewGroup b() {
        return this.f69345a;
    }

    public final int c() {
        return this.f69346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f69345a, aVar.f69345a) && this.f69346b == aVar.f69346b && this.f69347c == aVar.f69347c;
    }

    public int hashCode() {
        return (((this.f69345a.hashCode() * 31) + this.f69346b) * 31) + this.f69347c;
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.f69345a + ", bannerWidth=" + this.f69346b + ", bannerHeight=" + this.f69347c + ")";
    }
}
