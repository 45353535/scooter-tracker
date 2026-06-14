package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: loaded from: classes11.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f62043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f62044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f62045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f62046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f62047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f62048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f62049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f62050h;

    static class a implements DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f62044b) {
            return;
        }
        if (f62043a == null) {
            f62043a = new a();
        }
        if (f62050h == null) {
            f62050h = (DisplayManager) context.getSystemService("display");
        }
        if (f62050h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f62050h.registerDisplayListener(f62043a, handlerB);
            f62044b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    private static String a(int i10) {
        Display display = f62050h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f62045c)) {
                    return;
                }
                f62045c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f62047e)) {
                        return;
                    }
                    f62047e = strA;
                    return;
                }
                if (strA.equals(f62046d)) {
                    return;
                }
                f62046d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f62044b && (f62045c != null || f62046d != null || f62047e != null)) {
            return true;
        }
        if (f62044b && f62048f) {
            return f62049g;
        }
        int i10 = 0;
        if (context == null) {
            return false;
        }
        if (f62050h == null) {
            f62050h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f62050h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i10 < length) {
                    Display display = displays[i10];
                    if (display != null && display.getDisplayId() != 0) {
                        f62049g = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        f62048f = true;
        return f62049g;
    }
}
