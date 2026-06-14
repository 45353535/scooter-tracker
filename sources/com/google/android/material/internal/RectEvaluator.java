package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RectEvaluator implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f26828a;

    public RectEvaluator(@NonNull Rect rect) {
        this.f26828a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, @NonNull Rect rect, @NonNull Rect rect2) {
        this.f26828a.set(rect.left + ((int) ((rect2.left - r0) * f10)), rect.top + ((int) ((rect2.top - r1) * f10)), rect.right + ((int) ((rect2.right - r2) * f10)), rect.bottom + ((int) ((rect2.bottom - r6) * f10)));
        return this.f26828a;
    }
}
