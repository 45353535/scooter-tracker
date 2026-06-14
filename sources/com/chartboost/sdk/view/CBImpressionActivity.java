package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import b1.b;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import f1.c2;
import f1.eg;
import f1.ga;
import f1.of;
import f1.rd;
import f1.u0;
import f1.v4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/view/CBImpressionActivity;", "Landroid/app/Activity;", "Lf1/u0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", C4240b4.i.f42655u0, C4240b4.i.f42653t0, "onDestroy", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "", "b", "()Z", "finishActivity", "Lf1/v4;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "a", "(Lf1/v4;)V", "getActivity", "()Lcom/chartboost/sdk/view/CBImpressionActivity;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, EidRequestBuilder.REQUEST_FIELD_EMAIL, "d", InneractiveMediationDefs.GENDER_FEMALE, "Lf1/c2;", "Lf1/c2;", "presenter", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class CBImpressionActivity extends Activity implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public c2 presenter;

    @Override // f1.u0
    public void a(v4 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e10) {
            eg.d("Cannot attach view to activity", e10);
        }
    }

    @Override // f1.u0
    public boolean b() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        return decorView.isHardwareAccelerated();
    }

    @Override // f1.u0
    public void c() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                View decorView = window2 != null ? window2.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
            if (i10 >= 28) {
                Window window3 = getWindow();
                WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
                if (attributes == null) {
                    return;
                }
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } catch (Exception e10) {
            eg.d("Cannot set view to fullscreen", e10);
        }
    }

    public final void d() {
        if (this.presenter == null) {
            if (!b.h()) {
                eg.j("Cannot start Chartboost activity due to SDK not being initialized.", null, 2, null);
                finish();
                return;
            }
            rd rdVar = rd.f70996b;
            of ofVarA = rdVar.l().a();
            Object obj = rdVar.a().b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            this.presenter = new c2(this, ofVarA, (ga) obj, rdVar.d().j());
        }
    }

    public final boolean e() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isChartboost", false);
        }
        return false;
    }

    public final void f() {
    }

    @Override // f1.u0
    public void finishActivity() {
        finish();
    }

    @Override // f1.u0
    public CBImpressionActivity getActivity() {
        return this;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.i();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.c();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        f();
        if (!e()) {
            eg.j("This activity cannot be called from outside chartboost SDK", null, 2, null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        d();
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.d();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.e();
        }
        this.presenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.f();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        d();
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        c2 c2Var = this.presenter;
        if (c2Var != null) {
            c2Var.h();
        }
    }
}
