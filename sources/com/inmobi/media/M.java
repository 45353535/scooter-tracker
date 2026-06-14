package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f37324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f37325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37327d;

    public M(RectF visibleRect, ArrayList obstructions, int i10, int i11) {
        Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        Intrinsics.checkNotNullParameter(obstructions, "obstructions");
        this.f37324a = visibleRect;
        this.f37325b = obstructions;
        this.f37326c = i10;
        this.f37327d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return Intrinsics.areEqual(this.f37324a, m10.f37324a) && Intrinsics.areEqual(this.f37325b, m10.f37325b) && this.f37326c == m10.f37326c && this.f37327d == m10.f37327d;
    }

    public final int hashCode() {
        return this.f37327d + AbstractC3712fi.a(this.f37326c, (this.f37325b.hashCode() + (this.f37324a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f37324a + ", obstructions=" + this.f37325b + ", screenWidth=" + this.f37326c + ", screenHeight=" + this.f37327d + ")";
    }
}
