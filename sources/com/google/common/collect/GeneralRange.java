package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator f29504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f29506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BoundType f29507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f29509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BoundType f29510h;

    /* JADX WARN: Multi-variable type inference failed */
    private GeneralRange(Comparator comparator, boolean z10, Object obj, BoundType boundType, boolean z11, Object obj2, BoundType boundType2) {
        this.f29504b = (Comparator) Preconditions.checkNotNull(comparator);
        this.f29505c = z10;
        this.f29508f = z11;
        this.f29506d = obj;
        this.f29507e = (BoundType) Preconditions.checkNotNull(boundType);
        this.f29509g = obj2;
        this.f29510h = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z10) {
            comparator.compare(NullnessCasts.a(obj), NullnessCasts.a(obj));
        }
        if (z11) {
            comparator.compare(NullnessCasts.a(obj2), NullnessCasts.a(obj2));
        }
        if (z10 && z11) {
            int iCompare = comparator.compare(NullnessCasts.a(obj), NullnessCasts.a(obj2));
            Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    static GeneralRange a(Comparator comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange(comparator, false, null, boundType, false, null, boundType);
    }

    static GeneralRange h(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, true, obj, boundType, false, null, BoundType.OPEN);
    }

    static GeneralRange s(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, false, null, BoundType.OPEN, true, obj, boundType);
    }

    Comparator d() {
        return this.f29504b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.f29504b.equals(generalRange.f29504b) && this.f29505c == generalRange.f29505c && this.f29508f == generalRange.f29508f && i().equals(generalRange.i()) && k().equals(generalRange.k()) && Objects.equal(j(), generalRange.j()) && Objects.equal(l(), generalRange.l())) {
                return true;
            }
        }
        return false;
    }

    boolean g(Object obj) {
        return (r(obj) || q(obj)) ? false : true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f29504b, j(), i(), l(), k());
    }

    BoundType i() {
        return this.f29507e;
    }

    Object j() {
        return this.f29506d;
    }

    BoundType k() {
        return this.f29510h;
    }

    Object l() {
        return this.f29509g;
    }

    boolean m() {
        return this.f29505c;
    }

    boolean n() {
        return this.f29508f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    GeneralRange o(GeneralRange generalRange) {
        int iCompare;
        int iCompare2;
        Object obj;
        int iCompare3;
        BoundType boundType;
        Preconditions.checkNotNull(generalRange);
        Preconditions.checkArgument(this.f29504b.equals(generalRange.f29504b));
        boolean z10 = this.f29505c;
        Object objJ = j();
        BoundType boundTypeI = i();
        if (!m()) {
            z10 = generalRange.f29505c;
            objJ = generalRange.j();
            boundTypeI = generalRange.i();
        } else if (generalRange.m() && ((iCompare = this.f29504b.compare(j(), generalRange.j())) < 0 || (iCompare == 0 && generalRange.i() == BoundType.OPEN))) {
            objJ = generalRange.j();
            boundTypeI = generalRange.i();
        }
        boolean z11 = z10;
        boolean z12 = this.f29508f;
        Object objL = l();
        BoundType boundTypeK = k();
        if (!n()) {
            z12 = generalRange.f29508f;
            objL = generalRange.l();
            boundTypeK = generalRange.k();
        } else if (generalRange.n() && ((iCompare2 = this.f29504b.compare(l(), generalRange.l())) > 0 || (iCompare2 == 0 && generalRange.k() == BoundType.OPEN))) {
            objL = generalRange.l();
            boundTypeK = generalRange.k();
        }
        boolean z13 = z12;
        Object obj2 = objL;
        if (z11 && z13 && ((iCompare3 = this.f29504b.compare(objJ, obj2)) > 0 || (iCompare3 == 0 && boundTypeI == (boundType = BoundType.OPEN) && boundTypeK == boundType))) {
            boundTypeI = BoundType.OPEN;
            boundTypeK = BoundType.CLOSED;
            obj = obj2;
        } else {
            obj = objJ;
        }
        return new GeneralRange(this.f29504b, z11, obj, boundTypeI, z13, obj2, boundTypeK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean q(Object obj) {
        if (!n()) {
            return false;
        }
        int iCompare = this.f29504b.compare(obj, NullnessCasts.a(l()));
        return ((iCompare == 0) & (k() == BoundType.OPEN)) | (iCompare > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean r(Object obj) {
        if (!m()) {
            return false;
        }
        int iCompare = this.f29504b.compare(obj, NullnessCasts.a(j()));
        return ((iCompare == 0) & (i() == BoundType.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29504b);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        BoundType boundType = this.f29507e;
        BoundType boundType2 = BoundType.CLOSED;
        sb2.append(boundType == boundType2 ? '[' : '(');
        sb2.append(this.f29505c ? this.f29506d : "-∞");
        sb2.append(',');
        sb2.append(this.f29508f ? this.f29509g : "∞");
        sb2.append(this.f29510h == boundType2 ? ']' : ')');
        return sb2.toString();
    }
}
