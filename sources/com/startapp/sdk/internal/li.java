package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class li {
    public static int a(Context context, int i10) {
        return Math.round(TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics()));
    }

    public static int b(Context context, int i10) {
        return Math.round(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static void a(TextView textView, Set set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        textView.setTypeface(null, (set.contains("BOLD") && set.contains("ITALIC")) ? 3 : set.contains("BOLD") ? 1 : set.contains("ITALIC") ? 2 : 0);
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] iArr, int[] iArr2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int i10 : iArr2) {
            layoutParams.addRule(i10);
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = i12 == 0 ? 0 : a(context, i12);
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        windowManager.getDefaultDisplay().getSize(point);
        point.x = Math.round(point.x / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(point.y / context.getResources().getDisplayMetrics().density);
    }
}
