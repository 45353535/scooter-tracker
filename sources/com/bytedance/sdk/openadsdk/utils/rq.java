package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private static final Map<String, Pair<? extends Drawable, Integer>> qdl = new HashMap();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static Integer f17886ud = null;

    public static Drawable qdl(Context context, String str) {
        return qdl(context, str, true);
    }

    public static Drawable qdl(Context context, String str, boolean z10) {
        Pair<? extends Drawable, Integer> pair;
        f17886ud = Integer.valueOf(com.bytedance.sdk.openadsdk.core.yt.mml().exu());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = qdl;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            qdl();
            return qdl(str, context, z10);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.drawable.Drawable qdl(java.lang.String r28, android.content.Context r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 3730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.rq.qdl(java.lang.String, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    private static void qdl() {
        Map<String, Pair<? extends Drawable, Integer>> map = qdl;
        if (map.size() < f17886ud.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        qdl.remove(key);
    }

    private static GradientDrawable qdl(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable qdl(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable qdl(Context context, int i10) {
        return qdl(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable qdl(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(ax.ud(context, i11));
        return gradientDrawable;
    }
}
