package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27267d = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[][] f27268e = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f27269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27270c;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f27269b == null) {
            int color = MaterialColors.getColor(this, androidx.appcompat.R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int[][] iArr = f27268e;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = MaterialColors.layer(color3, color2, 0.38f);
            this.f27269b = new ColorStateList(iArr, iArr2);
        }
        return this.f27269b;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f27270c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27270c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f27270c = z10;
        if (z10) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f27267d;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialRadioButton, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialRadioButton_buttonTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            CompoundButtonCompat.setButtonTintList(this, MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i12));
        }
        this.f27270c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
