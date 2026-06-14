package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HarmonizedColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26098a = "HarmonizedColors";

    private static void a(Map map, TypedArray typedArray, TypedArray typedArray2, int i10) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i11 = 0; i11 < typedArray.getIndexCount(); i11++) {
            int resourceId = typedArray2.getResourceId(i11, 0);
            if (resourceId != 0 && typedArray.hasValue(i11) && ResourcesLoaderUtils.b(typedArray.getType(i11))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i11, 0), i10)));
            }
        }
    }

    @NonNull
    public static void applyToContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map mapB = b(context, harmonizedColorsOptions);
            int iA = harmonizedColorsOptions.a(0);
            if (!ResourcesLoaderUtils.a(context, mapB) || iA == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, iA);
        }
    }

    private static Map b(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        HashMap map = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), f26098a);
        for (int i10 : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(Integer.valueOf(i10), Integer.valueOf(MaterialColors.harmonize(ContextCompat.getColor(context, i10), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                a(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, color);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map mapB = b(context, harmonizedColorsOptions);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.a(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (ResourcesLoaderUtils.a(contextThemeWrapper, mapB)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }
}
