package yads;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f113567b;

    public mo0(int i10, RectF rectF) {
        this.f113566a = i10;
        this.f113567b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo0)) {
            return false;
        }
        mo0 mo0Var = (mo0) obj;
        return this.f113566a == mo0Var.f113566a && Intrinsics.areEqual(this.f113567b, mo0Var.f113567b);
    }

    public final int hashCode() {
        int i10 = this.f113566a * 31;
        RectF rectF = this.f113567b;
        return i10 + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f113566a + ", visibleRectangle=" + this.f113567b + ")";
    }
}
