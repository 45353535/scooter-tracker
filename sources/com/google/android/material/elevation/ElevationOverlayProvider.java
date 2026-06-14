package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes9.dex */
public class ElevationOverlayProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f26510f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f26515e;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean a(int i10) {
        return ColorUtils.setAlphaComponent(i10, 255) == this.f26514d;
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        if (this.f26515e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f10, @NonNull View view) {
        return compositeOverlay(i10, f10 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f10, @NonNull View view) {
        return compositeOverlayIfNeeded(i10, f10 + getParentAbsoluteElevation(view));
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f10 + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.f26512b;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.f26514d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f26511a;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i10, float f10) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i10);
        int iLayer = MaterialColors.layer(ColorUtils.setAlphaComponent(i10, 255), this.f26512b, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i11 = this.f26513c) != 0) {
            iLayer = MaterialColors.layer(iLayer, ColorUtils.setAlphaComponent(i11, f26510f));
        }
        return ColorUtils.setAlphaComponent(iLayer, iAlpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i10, float f10) {
        return (this.f26511a && a(i10)) ? compositeOverlay(i10, f10) : i10;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.f26514d, f10);
    }

    public ElevationOverlayProvider(boolean z10, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12, float f10) {
        this.f26511a = z10;
        this.f26512b = i10;
        this.f26513c = i11;
        this.f26514d = i12;
        this.f26515e = f10;
    }
}
