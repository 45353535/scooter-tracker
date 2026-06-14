package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class RelativeCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27531a;

    public RelativeCornerSize(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f27531a = f10;
    }

    private static float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / a(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f27531a == ((RelativeCornerSize) obj).f27531a;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f27531a * a(rectF);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getRelativePercent() {
        return this.f27531a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27531a)});
    }

    public String toString() {
        return ((int) (getRelativePercent() * 100.0f)) + "%";
    }
}
