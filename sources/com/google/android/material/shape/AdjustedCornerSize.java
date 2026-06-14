package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AdjustedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CornerSize f27459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27460b;

    public AdjustedCornerSize(float f10, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f27459a;
            f10 += ((AdjustedCornerSize) cornerSize).f27460b;
        }
        this.f27459a = cornerSize;
        this.f27460b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f27459a.equals(adjustedCornerSize.f27459a) && this.f27460b == adjustedCornerSize.f27460b;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f27459a.getCornerSize(rectF) + this.f27460b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27459a, Float.valueOf(this.f27460b)});
    }
}
