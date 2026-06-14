package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleUtils {

    @Deprecated
    public static final boolean USE_FRAMEWORK_RIPPLE = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27290a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27291b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27292c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f27293d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f27294e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f27295f = RippleUtils.class.getSimpleName();

    private static class RippleUtilsLollipop {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static Drawable b(@NonNull Context context, @Px int i10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(MaterialColors.getColorStateList(context, androidx.appcompat.R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10));
        }
    }

    private static int a(int i10) {
        return ColorUtils.setAlphaComponent(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int b(ColorStateList colorStateList, int[] iArr) {
        return a(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        int[] iArr = f27291b;
        return new ColorStateList(new int[][]{f27293d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f27292c), b(colorStateList, iArr), b(colorStateList, f27290a)});
    }

    @NonNull
    public static Drawable createOvalRippleLollipop(@NonNull Context context, @Px int i10) {
        return RippleUtilsLollipop.b(context, i10);
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f27294e, 0)) != 0) {
            Log.w(f27295f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
