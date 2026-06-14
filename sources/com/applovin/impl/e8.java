package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e8 {

    class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8797b;

        a(View view, Runnable runnable) {
            this.f8796a = view;
            this.f8797b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f8797b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f8796a.setVisibility(0);
        }
    }

    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8799b;

        b(View view, Runnable runnable) {
            this.f8798a = view;
            this.f8799b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f8798a.setVisibility(4);
            Runnable runnable = this.f8799b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f8798a.setVisibility(0);
        }
    }

    public static void a(View view, long j10, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean b(int i10) {
        return i10 == 0;
    }

    public static void b(View view, long j10, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static boolean a(int i10, int i11) {
        return b(i10) != b(i11);
    }

    public static Activity b(View view, com.applovin.impl.sdk.k kVar) {
        if (view == null) {
            return null;
        }
        for (int i10 = 0; i10 < 1000; i10++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("ViewUtils", "Encountered error while retrieving activity from view", th2);
                }
            }
        }
        return null;
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 == 4) {
            return "INVISIBLE";
        }
        if (i10 == 8) {
            return "GONE";
        }
        return String.valueOf(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] a(int r2, int r3, int r4) {
        /*
            if (r2 != 0) goto L7
            int[] r2 = new int[]{r3, r4}
            return r2
        L7:
            r0 = r2 & 119(0x77, float:1.67E-43)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L14
            r2 = 13
            int[] r2 = new int[]{r2}
            return r2
        L14:
            r0 = r2 & 112(0x70, float:1.57E-43)
            r1 = 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L1b
            goto L33
        L1b:
            r0 = r2 & 48
            r1 = 48
            if (r0 != r1) goto L24
            r3 = 10
            goto L35
        L24:
            r0 = r2 & 80
            r1 = 80
            if (r0 != r1) goto L2d
            r3 = 12
            goto L35
        L2d:
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L35
        L33:
            r3 = 15
        L35:
            r0 = r2 & 7
            r1 = 7
            if (r0 != r1) goto L3b
            goto L63
        L3b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L45
            r4 = 20
            goto L65
        L45:
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L4d
            r4 = 9
            goto L65
        L4d:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r2 & r0
            if (r1 != r0) goto L57
            r4 = 21
            goto L65
        L57:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L5f
            r4 = 11
            goto L65
        L5f:
            r0 = 1
            r2 = r2 & r0
            if (r2 != r0) goto L65
        L63:
            r4 = 14
        L65:
            int[] r2 = new int[]{r4, r3}
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e8.a(int, int, int):int[]");
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static void a(View view, final com.applovin.impl.sdk.k kVar) {
        if (view == null || kVar == null || !o0.b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.applovin.impl.da
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return e8.a(kVar, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets a(com.applovin.impl.sdk.k kVar, View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(((Integer) kVar.a(x4.f11434u2)).intValue());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    public static boolean a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return a(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (a(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
