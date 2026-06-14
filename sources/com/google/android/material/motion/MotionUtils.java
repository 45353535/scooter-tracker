package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes9.dex */
public class MotionUtils {
    private static float a(String[] strArr, int i10) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator c(String str) {
        if (!e(str, "cubic-bezier")) {
            if (e(str, "path")) {
                return new PathInterpolator(PathParser.createPathFromPathData(b(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = b(str, "cubic-bezier").split(StringUtils.COMMA);
        if (strArrSplit.length == 4) {
            return new PathInterpolator(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean d(String str) {
        return e(str, "cubic-bezier") || e(str, "path");
    }

    private static boolean e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i10, int i11) {
        return MaterialAttributes.resolveInteger(context, i10, i11);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i10, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return d(strValueOf) ? c(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    @NonNull
    public static SpringForce resolveThemeSpringForce(@NonNull Context context, @AttrRes int i10, @StyleRes int i11) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        TypedArray typedArrayObtainStyledAttributes = typedValueResolve == null ? context.obtainStyledAttributes(null, R.styleable.MaterialSpring, 0, i11) : context.obtainStyledAttributes(typedValueResolve.resourceId, R.styleable.MaterialSpring);
        SpringForce springForce = new SpringForce();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(R.styleable.MaterialSpring_damping, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            springForce.setStiffness(f10);
            springForce.setDampingRatio(f11);
            return springForce;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
