package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class hzv {
    private static int lnr(View view, int i10) {
        if (i10 == 3) {
            return ax.mzz(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean qdl(View view, int i10) {
        float fQdl = qdl(view);
        return fQdl > 0.0f && fQdl >= ((float) i10) / 100.0f;
    }

    private static boolean ud(View view) {
        return view != null && view.isShown();
    }

    public static float qdl(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int ud(View view, int i10) {
        if (i10 == 3) {
            return (int) (((double) ax.lnr(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int ud(View view, int i10, int i11, boolean z10) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!ud(view)) {
            return 1;
        }
        if (qdl(view, i11, z10)) {
            return !qdl(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean qdl(View view, int i10, boolean z10) {
        return (i10 == 1 && z10) ? view.getWidth() > 0 && view.getHeight() > 0 : view.getWidth() >= ud(view, i10) && view.getHeight() >= lnr(view, i10);
    }

    public static boolean qdl(View view, int i10, int i11, boolean z10) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.tvp.aaj) || (view instanceof com.bytedance.sdk.openadsdk.core.mml.mml)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        return ud(view, i10, i11, z10) == 0;
    }
}
