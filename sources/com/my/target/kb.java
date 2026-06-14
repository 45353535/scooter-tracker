package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60007a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisplayMetrics f60008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f60009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f60010c;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            f60008a = displayMetrics;
            f60009b = displayMetrics.density;
            f60010c = displayMetrics.densityDpi;
        }
    }

    public static class b extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60011a;

        public b(String str) {
            this.f60011a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.f60011a);
        }
    }

    public kb(Context context) {
        this.f60007a = context;
    }

    public static int a(int i10, int i11, int i12) {
        return i12 <= i10 ? i10 : i12 > i11 ? i11 : i12;
    }

    public static int b() {
        return a.f60010c;
    }

    public static int c() {
        return View.generateViewId();
    }

    public static void d(View view, int i10, int i11) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i11 - view.getMeasuredWidth(), i10 - view.getMeasuredHeight(), i11, i10);
    }

    public static kb e(Context context) {
        return new kb(context);
    }

    public static float a() {
        return a.f60009b;
    }

    public static void b(View view, int i10, int i11, int i12) {
        a(view, i10, i11, 0, 0, i12);
    }

    public static void c(View view, int i10, int i11) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i11, i10, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i10);
    }

    public static void e(View view, int i10, int i11) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i11, i10 - view.getMeasuredHeight(), view.getMeasuredWidth() + i11, i10);
    }

    public static int a(int i10, Context context) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static void b(View view, String str) {
        view.setAccessibilityDelegate(new b(str));
    }

    public static boolean d() {
        try {
            Class.forName(RecyclerView.class.getName());
            return true;
        } catch (Throwable unused) {
            gb.a("UiUtils: RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            return false;
        }
    }

    public static void b(View view, int i10, int i11) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i11 - view.getMeasuredWidth(), i10, i11, view.getMeasuredHeight() + i10);
    }

    public static int c(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static int a(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    public static String d(Context context) {
        int iC = c(context);
        if (iC == 2) {
            return "landscape";
        }
        if (iC == 1) {
            return "portrait";
        }
        return null;
    }

    public static Point b(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i10 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i11 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                point.y = bounds.height() - i11;
                point.x = bounds.width() - i10;
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(point);
                return point;
            }
        }
        return point;
    }

    public static int c(int i10) {
        return Math.round(i10 / (b() / 160.0f));
    }

    public int d(int i10) {
        return (int) TypedValue.applyDimension(2, i10, this.f60007a.getResources().getDisplayMetrics());
    }

    public static void a(View view, int i10, int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        ColorDrawable colorDrawable2 = new ColorDrawable(i11);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, colorDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, colorDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{a(i11), a(i10)}), stateListDrawable, null));
    }

    public static void a(View view, int i10, int i11, int i12, int i13, int i14) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i10, i10});
        float f10 = i14;
        gradientDrawable.setCornerRadius(f10);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i11, i11});
        gradientDrawable2.setCornerRadius(f10);
        if (i12 != 0) {
            gradientDrawable.setStroke(i13, i12);
            gradientDrawable2.setStroke(i13, i12);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{a(i11), a(i10)}), stateListDrawable, null));
    }

    public int b(int i10) {
        return a(i10);
    }

    public static boolean a(Activity activity, View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    public static boolean a(View view) {
        Window window;
        for (View view2 = view; view2.isHardwareAccelerated() && (view2.getLayerType() & 1) == 0; view2 = (View) view2.getParent()) {
            if (!(view2.getParent() instanceof View)) {
                Context context = view.getContext();
                return ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
        }
        return false;
    }

    public static void a(int i10, int i11, int i12, int i13, View... viewArr) {
        int i14 = i12 - i10;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                c(view, ((i14 - view.getMeasuredHeight()) / 2) + i10, i11);
                if (view.getMeasuredWidth() > 0) {
                    i11 += view.getMeasuredWidth() + i13;
                }
            }
        }
    }

    public static int a(int... iArr) {
        int iMax = 0;
        for (int i10 : iArr) {
            iMax = Math.max(i10, iMax);
        }
        return iMax;
    }

    public static void a(View view, int i10, int i11, int i12) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i11, i12));
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = i10 + (((i12 - i10) - view.getMeasuredWidth()) / 2);
        int measuredHeight = i11 + (((i13 - i11) - view.getMeasuredHeight()) / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    public static void a(View view, String str) {
        view.setContentDescription(str);
        b(view, str);
    }

    public static DisplayMetrics a(Context context) {
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return displayMetrics;
        }
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i10 = activity.getResources().getConfiguration().orientation;
        if (1 == i10) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i10) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        gb.a("UiUtils: Unknown screen orientation. Defaulting to portrait");
        return 9;
    }

    public int a(float f10) {
        return (int) TypedValue.applyDimension(1, f10, this.f60007a.getResources().getDisplayMetrics());
    }
}
