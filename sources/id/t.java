package id;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f74621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f74622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f74624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f74625e;

    public t(double d10, int i10, String adElementName, long j10, List algorithmResults) {
        Intrinsics.checkNotNullParameter(adElementName, "adElementName");
        Intrinsics.checkNotNullParameter(algorithmResults, "algorithmResults");
        this.f74621a = d10;
        this.f74622b = i10;
        this.f74623c = adElementName;
        this.f74624d = j10;
        this.f74625e = algorithmResults;
    }

    public final String a() {
        return this.f74623c;
    }

    public final int b() {
        return this.f74622b;
    }

    public final List c() {
        return this.f74625e;
    }

    public final long d() {
        return this.f74624d;
    }

    public final double e() {
        return this.f74621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.bidmachine.rendering.model.BrokenCreativeEvent");
        t tVar = (t) obj;
        return this.f74621a == tVar.f74621a && this.f74622b == tVar.f74622b && Intrinsics.areEqual(this.f74623c, tVar.f74623c);
    }

    public int hashCode() {
        return (((androidx.collection.a.a(this.f74621a) * 31) + this.f74622b) * 31) + this.f74623c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isBroken - ");
        sb2.append(this.f74621a);
        sb2.append(" (");
        sb2.append(this.f74621a == 1.0d);
        sb2.append("), adPhaseSequence - ");
        sb2.append(this.f74622b);
        sb2.append(", adElementName - ");
        sb2.append(this.f74623c);
        sb2.append(", durationMs - ");
        sb2.append(this.f74624d);
        return sb2.toString();
    }
}
