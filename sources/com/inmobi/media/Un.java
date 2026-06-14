package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Un {
    public static final boolean a(View adView, C4198z5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.f40033a && adView.getHeight() >= minDimension.f40034b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View adView, Rect adViewRect, int i10, C4198z5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) adViewRect.height()) * ((long) adViewRect.width())) >= ((long) (i10 * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(android.view.View r9, android.graphics.Rect r10, int r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Un.a(android.view.View, android.graphics.Rect, int, java.util.List):boolean");
    }
}
