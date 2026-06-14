package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.amazon.device.ads.DtbConstants;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f9929a = DesugarCollections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9930b = DesugarCollections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f9931c = DesugarCollections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f9932d = new HashMap(2);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9936d;

        public a(int i10, int i11, int i12, int i13) {
            this.f9933a = i10;
            this.f9934b = i11;
            this.f9935c = i12;
            this.f9936d = i13;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f9933a;
        }

        public int c() {
            return this.f9935c;
        }

        public int d() {
            return this.f9934b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f9933a));
            map.put("top", Integer.valueOf(this.f9934b));
            map.put("right", Integer.valueOf(this.f9935c));
            map.put("bottom", Integer.valueOf(this.f9936d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.f9936d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9940d;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f9941a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f9942b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f9943c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f9944d;

            a() {
            }

            public a a(int i10) {
                this.f9943c = i10;
                return this;
            }

            public a b(int i10) {
                this.f9944d = i10;
                return this;
            }

            public a c(int i10) {
                this.f9941a = i10;
                return this;
            }

            public a d(int i10) {
                this.f9942b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f9941a + ", topRight=" + this.f9942b + ", bottomLeft=" + this.f9943c + ", bottomRight=" + this.f9944d + ")";
            }

            public b a() {
                return new b(this.f9941a, this.f9942b, this.f9943c, this.f9944d);
            }
        }

        b(int i10, int i11, int i12, int i13) {
            this.f9937a = i10;
            this.f9938b = i11;
            this.f9939c = i12;
            this.f9940d = i13;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f9940d;
        }

        public int c() {
            return this.f9937a;
        }

        public int d() {
            return this.f9938b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f9939c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        boolean z10 = kVar == null || ((Boolean) kVar.a(x4.E6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f9932d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        point.y = 320;
        WindowManager windowManagerF = n7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f9932d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = n7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f9930b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f9930b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f9929a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f9929a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager windowManagerF;
        if (((Boolean) kVar.a(x4.Y3)).booleanValue() && k() && (windowManagerF = n7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f9931c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f9931c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
