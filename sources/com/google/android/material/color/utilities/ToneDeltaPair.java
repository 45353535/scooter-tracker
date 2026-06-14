package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ToneDeltaPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DynamicColor f26206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DynamicColor f26207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f26208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TonePolarity f26209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26210e;

    public ToneDeltaPair(@NonNull DynamicColor dynamicColor, @NonNull DynamicColor dynamicColor2, double d10, @NonNull TonePolarity tonePolarity, boolean z10) {
        this.f26206a = dynamicColor;
        this.f26207b = dynamicColor2;
        this.f26208c = d10;
        this.f26209d = tonePolarity;
        this.f26210e = z10;
    }

    public double getDelta() {
        return this.f26208c;
    }

    @NonNull
    public TonePolarity getPolarity() {
        return this.f26209d;
    }

    @NonNull
    public DynamicColor getRoleA() {
        return this.f26206a;
    }

    @NonNull
    public DynamicColor getRoleB() {
        return this.f26207b;
    }

    public boolean getStayTogether() {
        return this.f26210e;
    }
}
