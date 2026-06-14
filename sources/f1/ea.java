package f1;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ea {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69712a;

        static {
            int[] iArr = new int[p9.values().length];
            try {
                iArr[p9.f70767b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p9.f70772g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p9.f70769d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p9.f70771f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p9.f70768c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p9.f70773h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p9.f70770e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p9.f70774i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f69712a = iArr;
        }
    }

    public static final int a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r5 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final f1.p9 b(android.content.Context r5, f1.r2 r6) {
        /*
            if (r5 != 0) goto L5
            f1.p9 r5 = f1.p9.f70767b
            return r5
        L5:
            f1.i3 r6 = r6.a()     // Catch: java.lang.Exception -> L6b
            int r0 = a(r5)     // Catch: java.lang.Exception -> L6b
            int r1 = r6.b()     // Catch: java.lang.Exception -> L6b
            int r2 = r6.a()     // Catch: java.lang.Exception -> L6b
            r3 = 1
            r4 = 2
            if (r1 != r2) goto L26
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> L6b
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Exception -> L6b
            int r5 = r5.orientation     // Catch: java.lang.Exception -> L6b
            if (r5 == r4) goto L32
            goto L30
        L26:
            int r5 = r6.b()     // Catch: java.lang.Exception -> L6b
            int r6 = r6.a()     // Catch: java.lang.Exception -> L6b
            if (r5 >= r6) goto L32
        L30:
            r5 = r3
            goto L33
        L32:
            r5 = 0
        L33:
            r6 = 3
            if (r0 == 0) goto L3b
            if (r0 == r4) goto L3b
            if (r5 != 0) goto L54
            goto L3d
        L3b:
            if (r5 == 0) goto L54
        L3d:
            if (r0 == 0) goto L51
            if (r0 == r3) goto L4e
            if (r0 == r4) goto L4b
            if (r0 == r6) goto L48
            f1.p9 r5 = f1.p9.f70767b     // Catch: java.lang.Exception -> L6b
            return r5
        L48:
            f1.p9 r5 = f1.p9.f70774i     // Catch: java.lang.Exception -> L6b
            return r5
        L4b:
            f1.p9 r5 = f1.p9.f70769d     // Catch: java.lang.Exception -> L6b
            return r5
        L4e:
            f1.p9 r5 = f1.p9.f70773h     // Catch: java.lang.Exception -> L6b
            return r5
        L51:
            f1.p9 r5 = f1.p9.f70767b     // Catch: java.lang.Exception -> L6b
            return r5
        L54:
            if (r0 == 0) goto L68
            if (r0 == r3) goto L65
            if (r0 == r4) goto L62
            if (r0 == r6) goto L5f
            f1.p9 r5 = f1.p9.f70768c     // Catch: java.lang.Exception -> L6b
            return r5
        L5f:
            f1.p9 r5 = f1.p9.f70772g     // Catch: java.lang.Exception -> L6b
            return r5
        L62:
            f1.p9 r5 = f1.p9.f70770e     // Catch: java.lang.Exception -> L6b
            return r5
        L65:
            f1.p9 r5 = f1.p9.f70771f     // Catch: java.lang.Exception -> L6b
            return r5
        L68:
            f1.p9 r5 = f1.p9.f70768c     // Catch: java.lang.Exception -> L6b
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r6 = "Cannot getOrientation"
            f1.eg.i(r6, r5)
            f1.p9 r5 = f1.p9.f70768c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.ea.b(android.content.Context, f1.r2):f1.p9");
    }

    public static final void c(Activity activity, ga gaVar) {
        if (activity == null || e(activity) || gaVar == null || !gaVar.h() || !gaVar.j()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    public static final void d(Activity activity, ga gaVar, r2 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        if (activity == null || e(activity) || gaVar == null) {
            return;
        }
        int i10 = 1;
        if (gaVar.h() && gaVar.j()) {
            switch (a.f69712a[b(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i10 = 9;
                    break;
                case 5:
                case 6:
                    i10 = 0;
                    break;
                default:
                    i10 = 8;
                    break;
            }
            activity.setRequestedOrientation(i10);
        }
    }

    public static final boolean e(Activity activity) {
        View decorView;
        Drawable background;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26) {
            return false;
        }
        Window window = activity.getWindow();
        return window == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255;
    }

    public static final String f(Context context, r2 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        switch (a.f69712a[b(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "portrait";
            case 5:
            case 6:
            case 7:
            case 8:
                return "landscape";
            default:
                throw new lf.m();
        }
    }

    public static final boolean g(Context context, r2 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        p9 p9VarB = b(context, displayMeasurement);
        return p9VarB == p9.f70767b || p9VarB == p9.f70769d || p9VarB == p9.f70771f || p9VarB == p9.f70772g;
    }
}
