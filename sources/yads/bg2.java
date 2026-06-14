package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class bg2 {

    @NotNull
    public static final ag2 Companion = new ag2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f108998a;

    public /* synthetic */ bg2(int i10, double d10) {
        if (1 != (i10 & 1)) {
            yg.e2.a(i10, 1, zf2.f118654a.getDescriptor());
        }
        this.f108998a = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg2) && Double.compare(this.f108998a, ((bg2) obj).f108998a) == 0;
    }

    public final int hashCode() {
        return androidx.collection.a.a(this.f108998a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f108998a + ")";
    }
}
