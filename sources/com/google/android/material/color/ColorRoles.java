package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes9.dex */
public final class ColorRoles {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26075d;

    ColorRoles(int i10, int i11, int i12, int i13) {
        this.f26072a = i10;
        this.f26073b = i11;
        this.f26074c = i12;
        this.f26075d = i13;
    }

    @ColorInt
    public int getAccent() {
        return this.f26072a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.f26074c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.f26073b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.f26075d;
    }
}
