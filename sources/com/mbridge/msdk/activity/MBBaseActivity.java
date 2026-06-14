package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f46214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f46215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46216c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f46217d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f46218e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    class b extends OrientationEventListener {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f46214a != null ? MBBaseActivity.this.f46214a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f46216c != 1) {
                MBBaseActivity.this.f46216c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f46216c != 2) {
                MBBaseActivity.this.f46216c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f46216c != 3) {
                MBBaseActivity.this.f46216c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f46216c == 4) {
                    return;
                }
                MBBaseActivity.this.f46216c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f46215b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f46215b.enable();
        } else {
            this.f46215b.disable();
            this.f46215b = null;
        }
    }

    public void getNotchParams() {
        if (this.f46217d) {
            return;
        }
        this.f46218e = new a();
        getWindow().getDecorView().postDelayed(this.f46218e, 500L);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46217d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f46217d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f46215b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f46215b = null;
            }
            if (this.f46218e != null) {
                getWindow().getDecorView().removeCallbacks(this.f46218e);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f48549f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout;
        int i15 = Build.VERSION.SDK_INT;
        if (this.f46217d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i16 = -1;
        if (rootWindowInsets == null || i15 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i10 = -1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f46214a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f46216c == -1) {
                this.f46216c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                q0.b("MBBaseActivity", this.f46216c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i16 = 90;
                } else if (rotation == 2) {
                    i16 = 180;
                } else if (rotation == 3) {
                    i16 = 270;
                }
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = i16;
            } else {
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = 0;
            }
            i12 = safeInsetRight;
            i13 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i10, i11, i12, i13, i14);
        if (mBBaseActivity.f46215b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private int a() {
        if (this.f46214a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f46214a = getDisplay();
            } else {
                this.f46214a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f46214a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
