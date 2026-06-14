package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.R;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThemeEnforcement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f26870a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f26871b = {com.google.android.material.R.attr.colorPrimaryVariant};

    private static void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ThemeEnforcement, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(com.google.android.material.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    private static void b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean zD;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.ThemeEnforcement, i10, i11);
        if (!typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zD = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zD = d(context, attributeSet, iArr, i10, i11, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zD) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void c(Context context, int[] iArr, String str) {
        if (e(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static void checkAppCompatTheme(@NonNull Context context) {
        c(context, f26870a, "Theme.AppCompat");
    }

    public static void checkMaterialTheme(@NonNull Context context) {
        c(context, f26871b, "Theme.MaterialComponents");
    }

    private static boolean d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i12, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static boolean e(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isAppCompatTheme(@NonNull Context context) {
        return e(context, f26870a);
    }

    public static boolean isMaterial3Theme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@NonNull Context context) {
        return e(context, f26871b);
    }

    @NonNull
    public static TypedArray obtainStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i10, @StyleRes int i11, @StyleableRes int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static TintTypedArray obtainTintedStyledAttributes(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i10, @StyleRes int i11, @StyleableRes int... iArr2) {
        a(context, attributeSet, i10, i11);
        b(context, attributeSet, iArr, i10, i11, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, i11);
    }
}
