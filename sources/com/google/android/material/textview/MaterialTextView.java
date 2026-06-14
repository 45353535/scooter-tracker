package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    private void a(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, R.styleable.MaterialTextAppearance);
        int iE = e(getContext(), typedArrayObtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iE >= 0) {
            setLineHeight(iE);
        }
    }

    private static boolean b(Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int c(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void d(AttributeSet attributeSet, int i10, int i11) {
        int iC;
        Context context = getContext();
        if (b(context)) {
            Resources.Theme theme = context.getTheme();
            if (f(context, theme, attributeSet, i10, i11) || (iC = c(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            a(theme, iC);
        }
    }

    private static int e(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i10 = 0; i10 < iArr.length && dimensionPixelSize < 0; i10++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i10], -1);
        }
        return dimensionPixelSize;
    }

    private static boolean f(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i10, i11);
        int iE = e(context, typedArrayObtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iE != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b(context)) {
            a(context.getTheme(), i10);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        d(attributeSet, i10, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        d(attributeSet, i10, i11);
    }
}
