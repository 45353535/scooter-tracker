package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HarmonizedColorAttributes {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f26095c = {R.attr.colorError, com.google.android.material.R.attr.colorOnError, com.google.android.material.R.attr.colorErrorContainer, com.google.android.material.R.attr.colorOnErrorContainer};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f26096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26097b;

    private HarmonizedColorAttributes(int[] iArr, int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f26096a = iArr;
        this.f26097b = i10;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(f26095c, com.google.android.material.R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.f26096a;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f26097b;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr, @StyleRes int i10) {
        return new HarmonizedColorAttributes(iArr, i10);
    }
}
