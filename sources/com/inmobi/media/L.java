package com.inmobi.media;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f37237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f37238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f37239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f37240d;

    public L(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f37237a = rectF;
        this.f37238b = rectF2;
        this.f37239c = rectF3;
        this.f37240d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return Intrinsics.areEqual(this.f37237a, l10.f37237a) && Intrinsics.areEqual(this.f37238b, l10.f37238b) && Intrinsics.areEqual(this.f37239c, l10.f37239c) && Intrinsics.areEqual(this.f37240d, l10.f37240d);
    }

    public final int hashCode() {
        RectF rectF = this.f37237a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f37238b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f37239c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f37240d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f37237a + ", topRight=" + this.f37238b + ", bottomLeft=" + this.f37239c + ", bottomRight=" + this.f37240d + ")";
    }
}
