package com.my.target;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jb {

    public class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0 f59969a;

        public a(o0 o0Var) {
            this.f59969a = o0Var;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) this.f59969a.a(view, windowInsets);
        }
    }

    public static boolean a(ApplicationInfo applicationInfo) {
        return applicationInfo.targetSdkVersion >= 35 && Build.VERSION.SDK_INT >= 35;
    }

    public static void a(View view, o0 o0Var) {
        view.setOnApplyWindowInsetsListener(new a(o0Var));
    }

    public static ib a(WindowInsets windowInsets) {
        return ib.a(windowInsets.getInsets(WindowInsets.Type.displayCutout() | WindowInsets.Type.systemBars()));
    }
}
