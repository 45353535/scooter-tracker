package com.taurusx.tax.g;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes11.dex */
public class k0 {

    public class z implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Runnable f66148w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ View f66149z;

        public z(View view, Runnable runnable) {
            this.f66149z = view;
            this.f66148w = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f66149z.isShown()) {
                this.f66149z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f66148w.run();
            }
        }
    }

    public static void z(View view, Runnable runnable) {
        if (view == null || runnable == null) {
            return;
        }
        if (view.isShown()) {
            runnable.run();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new z(view, runnable));
        }
    }

    public static Boolean z(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                if (width < displayMetrics.widthPixels / 2) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
