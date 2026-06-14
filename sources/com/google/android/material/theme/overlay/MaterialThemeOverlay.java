package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialThemeOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f28119a = {R.attr.theme, androidx.appcompat.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f28120b = {com.google.android.material.R.attr.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f28119a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int[] b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr2[i12] = typedArrayObtainStyledAttributes.getResourceId(i12, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    private static int c(Context context, AttributeSet attributeSet, int i10, int i11) {
        return b(context, attributeSet, f28120b, i10, i11)[0];
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        return wrap(context, attributeSet, i10, i11, new int[0]);
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11, @NonNull int[] iArr) {
        int iC = c(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == iC;
        if (iC == 0 || z10) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iC);
        for (int i12 : b(context, attributeSet, iArr, i10, i11)) {
            if (i12 != 0) {
                contextThemeWrapper.getTheme().applyStyle(i12, true);
            }
        }
        int iA = a(context, attributeSet);
        if (iA != 0) {
            contextThemeWrapper.getTheme().applyStyle(iA, true);
        }
        return contextThemeWrapper;
    }
}
