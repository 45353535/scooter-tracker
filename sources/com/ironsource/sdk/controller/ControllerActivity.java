package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.Ag;
import com.ironsource.C4240b4;
import com.ironsource.C4387k;
import com.ironsource.C4404l;
import com.ironsource.C4449n8;
import com.ironsource.C4462o4;
import com.ironsource.C4533s8;
import com.ironsource.C4561u2;
import com.ironsource.C4618x8;
import com.ironsource.D5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.Nc;
import com.ironsource.P9;
import com.ironsource.Xd;
import com.ironsource.Z0;
import com.ironsource.dg;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: loaded from: classes10.dex */
public class ControllerActivity extends Activity implements Nc, dg {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44927o = "ControllerActivity";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f44928p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f44929q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f44930r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f44932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f44933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f44934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC4634y7 f44935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedCallback f44936f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44938h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Z0 f44942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44944n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f44937g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f44939i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f44940j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RelativeLayout.LayoutParams f44941k = new RelativeLayout.LayoutParams(-1, -1);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f44937g));
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f44939i.removeCallbacks(controllerActivity.f44940j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f44939i.postDelayed(controllerActivity2.f44940j, 500L);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(f44927o, "OnBackInvokedCallback");
        if (C4561u2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f44936f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f44936f);
            Logger.i(f44927o, "OnBackInvokedCallback unregistered");
            this.f44936f = null;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.f44933c == null) {
                throw new Exception(f44929q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f44934d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f44930r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f44934d);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            C4618x8.a(Xd.f42085s, new C4533s8().a(D5.A, e10.getMessage()).a());
            Logger.i(f44927o, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void j() {
        int iK = this.f44935e.K(this);
        String str = f44927o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void k() {
        int iK = this.f44935e.K(this);
        String str = f44927o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.Nc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f44927o, "onBackPressed");
        if (C4561u2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Nc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44935e = Ib.U().i();
        try {
            new C4404l(this).a();
            new C4387k(this).a();
            v vVar = (v) P9.b((Context) this).a().k();
            this.f44932b = vVar;
            vVar.r().setId(1);
            this.f44932b.a((Nc) this);
            this.f44932b.a((dg) this);
            Intent intent = getIntent();
            this.f44938h = intent.getStringExtra(C4240b4.i.f42638m);
            this.f44937g = intent.getBooleanExtra(C4240b4.i.f42656v, false);
            this.f44931a = intent.getStringExtra("adViewId");
            this.f44943m = false;
            this.f44944n = intent.getBooleanExtra(C4240b4.i.f42665z0, false);
            if (this.f44937g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f44940j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f44933c = relativeLayout;
            setContentView(relativeLayout, this.f44941k);
            this.f44934d = a(this.f44931a);
            if (this.f44933c.findViewById(1) == null && this.f44934d.getParent() != null) {
                finish();
            }
            d();
            this.f44933c.addView(this.f44934d, this.f44941k);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = f44927o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (this.f44943m) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f44932b.x()) {
            this.f44932b.w();
            return true;
        }
        if (this.f44937g && (i10 == 25 || i10 == 24)) {
            this.f44939i.removeCallbacks(this.f44940j);
            this.f44939i.postDelayed(this.f44940j, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.Nc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(f44927o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f44932b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f44944n) {
                this.f44932b.B();
            }
            this.f44932b.b(false, C4240b4.i.Z);
            this.f44932b.g(this.f44938h, C4240b4.i.f42653t0);
        }
        if (isFinishing()) {
            this.f44943m = true;
            c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(f44927o, C4240b4.i.f42655u0);
        v vVar = this.f44932b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f44944n) {
                this.f44932b.F();
            }
            this.f44932b.b(true, C4240b4.i.Z);
            this.f44932b.g(this.f44938h, C4240b4.i.f42655u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(f44927o, "onStart");
        v vVar = this.f44932b;
        if (vVar != null) {
            vVar.g(this.f44938h, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(f44927o, "onStop");
        v vVar = this.f44932b;
        if (vVar != null) {
            vVar.g(this.f44938h, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f44927o, "onUserLeaveHint");
        v vVar = this.f44932b;
        if (vVar != null) {
            vVar.g(this.f44938h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.dg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.dg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.dg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.dg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.dg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f44937g && z10) {
            runOnUiThread(this.f44940j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            Logger.i(f44927o, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            f();
        } else {
            b();
        }
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f44936f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.w
                public final void onBackInvoked() {
                    this.f45392a.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f44936f);
        }
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = f44927o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f44932b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.u.Gone);
        this.f44932b.C();
        this.f44932b.D();
        this.f44932b.g(this.f44938h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(C4240b4.i.A), intent.getIntExtra(C4240b4.i.B, 0));
    }

    private boolean e() {
        return this.f44931a == null;
    }

    private void b() {
        runOnUiThread(new d());
    }

    private FrameLayout a(String str) {
        if (!b(str)) {
            return this.f44932b.r();
        }
        return Ag.a(getApplicationContext(), C4449n8.a().a(str).getPresentingView());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                j();
                return;
            }
            if ("portrait".equalsIgnoreCase(str)) {
                k();
                return;
            }
            if (C4240b4.i.G.equalsIgnoreCase(str)) {
                if (this.f44935e.w(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return C4449n8.a().a(this.f44931a).getPresentingView();
    }
}
