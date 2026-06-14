package com.fyber.inneractive.sdk.activities;

import android.R;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.renderers.t;
import com.fyber.inneractive.sdk.ui.CloseButtonConfiguration;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements com.fyber.inneractive.sdk.interfaces.e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f20116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f20117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.f f20118d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CloseButtonFlowManager f20123i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20119e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20120f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20121g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20122h = false;
    protected final Runnable mHideNavigationBarTask = new c(this);

    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        r.f23896b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void destroy() {
        if (isFinishing() || this.f20116b == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f20123i;
        closeButtonFlowManager.f23798c.setVisibility(8);
        closeButtonFlowManager.f23796a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void dismissAd(boolean z10) {
        this.f20122h = z10;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
        if (fVar != null) {
            fVar.b(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public View getCloseButton() {
        return this.f20123i.f23800e;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public ViewGroup getLayout() {
        return this.f20116b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.f fVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (fVar != 0 && (((b0) fVar) instanceof t)) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        t0 t0Var = ((r0) this.f20117c.getAdContent().f21038d).f20438f;
        if (t0Var != null) {
            Orientation orientation = t0Var.f20493e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean isCloseButtonDisplay() {
        return this.f20123i.f23799d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
        if (fVar == null || !fVar.v()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
        if (fVar != null) {
            int i10 = configuration.orientation;
            if (i10 != this.f20119e) {
                this.f20119e = i10;
                fVar.a();
                return;
            }
            int i11 = this.f20120f;
            int i12 = configuration.screenHeightDp;
            if (i11 == i12 && this.f20121g == configuration.screenWidthDp) {
                return;
            }
            this.f20120f = i12;
            this.f20121g = configuration.screenWidthDp;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f20117c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f20117c.getAdContent().f21038d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f20117c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f20118d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.f20117c.getLocalUniqueId());
        this.f20119e = getResources().getConfiguration().orientation;
        this.f20120f = getResources().getConfiguration().screenHeightDp;
        this.f20121g = getResources().getConfiguration().screenWidthDp;
        if (this.f20118d == null) {
            IAlog.f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        try {
            setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_fullscreen_activity);
            this.f20116b = (ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_ad_content);
            this.f20123i = new CloseButtonFlowManager(this);
            ((p0) this.f20118d).initialize(this.f20117c);
            try {
                this.f20118d.a(this, this);
                this.f20118d.b(this.f20123i);
                this.f20117c.getAdContent().f21039e = true;
            } catch (Resources.NotFoundException e10) {
                IAlog.f("Interstitial Activity: %s", e10.getMessage());
                finish();
            } catch (InneractiveUnitController.AdDisplayError e11) {
                IAlog.f("Interstitial Activity: %s", e11.getMessage());
                finish();
            }
        } catch (Throwable th2) {
            z.a(th2, this.f20117c.getAdContent().f21035a, this.f20117c.getAdContent().b());
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup = this.f20116b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f20116b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f20117c;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
        if (fVar != null) {
            fVar.a(this.f20123i);
            this.f20118d.l();
            this.f20118d.destroy();
            this.f20118d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.f20117c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
            if (fVar != null) {
                fVar.s();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f20118d;
        if (fVar2 != null) {
            fVar2.a(this.f20123i);
            this.f20118d.l();
            this.f20118d.destroy();
            this.f20118d = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
        if (fVar != null) {
            fVar.n();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f20118d;
            if (fVar != null) {
                fVar.s();
                return;
            }
            return;
        }
        hideNavigationBar();
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f20118d;
        if (fVar2 != null) {
            fVar2.n();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void secondEndCardWasDisplayed() {
        this.f20123i.f23801f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void setActivityOrientation(boolean z10, Orientation orientation) {
        if (z10 && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z10 && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (i10 == 1) {
            setRequestedOrientation(7);
        } else if (i10 == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseButton(boolean z10, int i10, int i11) {
        CloseButtonConfiguration closeButtonConfiguration = this.f20123i.f23802g;
        closeButtonConfiguration.f23791c = z10;
        closeButtonConfiguration.f23792d = i10;
        closeButtonConfiguration.f23793e = i11;
        closeButtonConfiguration.f23790b = true;
        closeButtonConfiguration.f23789a = false;
        closeButtonConfiguration.f23795g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f20123i;
        closeButtonFlowManager.f23797b.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_round_overlay_bg);
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f23802g;
        closeButtonConfiguration.f23789a = true;
        closeButtonConfiguration.f23790b = false;
        closeButtonConfiguration.f23795g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void updateCloseCountdown(int i10) {
        CloseButtonFlowManager closeButtonFlowManager = this.f20123i;
        if (i10 > 0) {
            closeButtonFlowManager.f23797b.setText(Integer.toString(i10));
        } else {
            closeButtonFlowManager.getClass();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean wasDismissedByUser() {
        return this.f20122h;
    }
}
