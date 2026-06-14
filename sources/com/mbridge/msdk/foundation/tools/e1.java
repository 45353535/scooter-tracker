package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f48989a;

    private static int a(View view, ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    private static boolean a(View view, View view2, float f10) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int iWidth = rect3.width() * rect3.height();
            int iWidth2 = rect.width() * rect.height();
            int measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
            if (f10 == 0.0f) {
                return iWidth2 < measuredWidth || iWidth >= measuredWidth;
            }
            float f11 = measuredWidth * f10;
            float f12 = iWidth;
            if (f12 >= f11) {
                return true;
            }
            int i10 = iWidth2 - iWidth;
            if (iWidth + i10 >= measuredWidth) {
                return f12 > f11;
            }
            if (i10 <= f11) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(View view, ViewGroup viewGroup, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            q0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt, f10)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    q0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f48989a = true;
                }
                if (a(childAt)) {
                    q0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f48989a = true;
                }
                if (f48989a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, f10);
                }
            }
        }
        return f48989a;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.view.View r10, int r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.e1.a(android.view.View, int):boolean");
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
