package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f36777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f36778c;

    public E6(float f10, F6 f62, ArrayList arrayList) {
        this.f36776a = f10;
        this.f36777b = f62;
        this.f36778c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e62 = (E6) obj;
        return Float.compare(this.f36776a, e62.f36776a) == 0 && Intrinsics.areEqual(this.f36777b, e62.f36777b) && Intrinsics.areEqual(this.f36778c, e62.f36778c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f36776a) * 31;
        F6 f62 = this.f36777b;
        int iHashCode = (iFloatToIntBits + (f62 == null ? 0 : f62.hashCode())) * 31;
        ArrayList arrayList = this.f36778c;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f36776a + ", visibleRectangle=" + this.f36777b + ", occlusionRectangles=" + this.f36778c + ")";
    }
}
