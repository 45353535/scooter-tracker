package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.inmobi.media.AbstractC4061ti;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4061ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f39603a = lf.i.a(new Function0() { // from class: w3.qa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC4061ti.a();
        }
    });

    public static final JSONObject a(String str, int i10) throws JSONException {
        JSONObject jSONObjectA = Si.a(str, "targetViewId", "id", str);
        jSONObjectA.put("errorCode", i10);
        return jSONObjectA;
    }

    public static final vo b(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        vo voVarE = e(windowInsets);
        vo voVarC = c(windowInsets);
        vo voVarD = d(windowInsets);
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return a(voVarE, voVarC, voVarD, new vo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final vo c(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C4148x5.f39893a.getClass();
        if (C4148x5.r()) {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            return new vo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!C4148x5.p()) {
            return (vo) f39603a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new vo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final vo d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C4148x5.f39893a.getClass();
        if (!C4148x5.s()) {
            return (vo) f39603a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner.getRadius()));
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner2.getRadius()));
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner3.getRadius()));
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner4.getRadius()));
        }
        return new vo(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final vo e(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C4148x5.f39893a.getClass();
        if (!C4148x5.r()) {
            return C4148x5.q() ? new vo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (vo) f39603a.getValue();
        }
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return new vo(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final vo a() {
        return new vo(0, 0, 0, 0);
    }

    public static final vo a(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (vo) f39603a.getValue());
    }

    public static final vo a(vo area, vo display, vo roundedCorner, vo navigationBar) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(roundedCorner, "roundedCorner");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        return new vo(mf.a.j(area.f39803a, display.f39803a, roundedCorner.f39803a, navigationBar.f39803a), mf.a.j(area.f39804b, display.f39804b, roundedCorner.f39804b, navigationBar.f39804b), mf.a.j(area.f39805c, display.f39805c, roundedCorner.f39805c, navigationBar.f39805c), mf.a.j(area.f39806d, display.f39806d, roundedCorner.f39806d, navigationBar.f39806d));
    }
}
