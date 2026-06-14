package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ClampedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f27461a;

    public ClampedCornerSize(float f10) {
        this.f27461a = f10;
    }

    private static float a(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @NonNull
    public static ClampedCornerSize createFromCornerSize(@NonNull AbsoluteCornerSize absoluteCornerSize) {
        return new ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.f27461a == ((ClampedCornerSize) obj).f27461a;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return MathUtils.clamp(this.f27461a, 0.0f, a(rectF));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f27461a)});
    }
}
