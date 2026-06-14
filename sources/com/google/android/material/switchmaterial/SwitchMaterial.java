package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f27839f = R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[][] f27840g = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ElevationOverlayProvider f27841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f27842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f27843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27844e;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f27842c == null) {
            int color = MaterialColors.getColor(this, R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f27841b.isThemeElevationOverlayEnabled()) {
                dimension += ViewUtils.getParentAbsoluteElevation(this);
            }
            int iCompositeOverlayIfNeeded = this.f27841b.compositeOverlayIfNeeded(color, dimension);
            int[][] iArr = f27840g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color, color2, 1.0f);
            iArr2[1] = iCompositeOverlayIfNeeded;
            iArr2[2] = MaterialColors.layer(color, color2, 0.38f);
            iArr2[3] = iCompositeOverlayIfNeeded;
            this.f27842c = new ColorStateList(iArr, iArr2);
        }
        return this.f27842c;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f27843d == null) {
            int[][] iArr = f27840g;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorControlActivated);
            int color3 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color, color2, 0.54f);
            iArr2[1] = MaterialColors.layer(color, color3, 0.32f);
            iArr2[2] = MaterialColors.layer(color, color2, 0.12f);
            iArr2[3] = MaterialColors.layer(color, color3, 0.12f);
            this.f27843d = new ColorStateList(iArr, iArr2);
        }
        return this.f27843d;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f27844e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27844e && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f27844e && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f27844e = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f27839f;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f27841b = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SwitchMaterial, i10, i11, new int[0]);
        this.f27844e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
