package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.my.target.common.MyTargetActivity;
import com.my.target.s2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h4 implements s2, MyTargetActivity.ActivityEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2.a f59799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f59802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s2.b f59804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f59805g;

    public h4(s2.a aVar) {
        this.f59799a = aVar;
    }

    public static h4 a(e4 e4Var, t4 t4Var, boolean z10, s2.a aVar) {
        if (e4Var instanceof o4) {
            return p4.a((o4) e4Var, t4Var, z10, aVar);
        }
        if (e4Var instanceof j4) {
            return k4.a((j4) e4Var, t4Var, aVar);
        }
        if (e4Var instanceof l4) {
            return n4.a((l4) e4Var, aVar);
        }
        return null;
    }

    @Override // com.my.target.s2
    public float b() {
        return 0.0f;
    }

    public s2.b c() {
        return this.f59804f;
    }

    public abstract boolean d();

    @Override // com.my.target.s2
    public void destroy() {
        dismiss();
    }

    @Override // com.my.target.s2
    public void dismiss() {
        this.f59803e = false;
        WeakReference weakReference = this.f59802d;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityAttach(MyTargetActivity myTargetActivity) {
        DisplayCutout displayCutout;
        Window window = myTargetActivity.getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        View decorView = window.getDecorView();
        if (decorView == null) {
            a(window);
            return;
        }
        decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            displayCutout = null;
        } else if (i10 >= 29) {
            Display display = decorView.getDisplay();
            if (display == null) {
                a(window);
                return;
            }
            displayCutout = display.getCutout();
        } else {
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets == null) {
                a(window);
                return;
            }
            displayCutout = rootWindowInsets.getDisplayCutout();
        }
        if (displayCutout == null) {
            a(window);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public final boolean onActivityBackPressed() {
        return d();
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        myTargetActivity.setTheme(android.R.style.Theme.NoTitleBar);
        this.f59805g = myTargetActivity.getApplicationContext();
        this.f59802d = new WeakReference(myTargetActivity);
        this.f59799a.g();
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        this.f59803e = false;
        this.f59802d = null;
        this.f59799a.f();
        this.f59805g = null;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
        this.f59800b = false;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
        this.f59800b = true;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStart() {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStop() {
    }

    public void a(b bVar, Context context) {
        bb.b(bVar.x(), "closedByUser", 1, context);
        dismiss();
    }

    @Override // com.my.target.s2
    public void a(Context context) {
        if (this.f59803e) {
            this.f59799a.e();
            gb.a("InterstitialAdEngine: Unable to open Interstitial Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.f59799a.d();
        this.f59803e = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.my.target.s2
    public String a() {
        return "myTarget";
    }

    @Override // com.my.target.s2
    public void a(s2.b bVar) {
        this.f59804f = bVar;
    }

    public void a(Window window) {
        window.setFlags(1024, 1024);
    }

    public final void a(b bVar, q5 q5Var) {
        Context context = this.f59805g;
        if (context == null) {
            return;
        }
        bb.b(bVar.x(), "error", 1, context);
        if (q5Var == null) {
            return;
        }
        q5Var.b(context);
    }
}
