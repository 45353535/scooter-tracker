package com.pubmatic.sdk.openwrap.core.rewarded;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.R$id;
import com.pubmatic.sdk.openwrap.core.R$layout;
import com.pubmatic.sdk.openwrap.core.R$style;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRendering;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener;
import com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity;

/* JADX INFO: loaded from: classes11.dex */
public class POBRewardedAdRenderer implements POBRewardedAdRendering, POBAdRendererListener, POBVideoRenderingListener, POBVideoSkipEventListener, POBFullScreenActivityBackPressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBVideoRendering f62892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBRewardedAdRendererListener f62893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBAdDescriptor f62894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f62897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBFullScreenActivityListener f62898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f62899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Activity f62900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AlertDialog f62902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final POBSkipConfirmationInfo f62903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f62904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f62905n = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBRewardedAdRenderer.this.f62902k != null) {
                POBRewardedAdRenderer.this.f62902k.dismiss();
                if (view.getId() == R$id.pob_skip_alert_resume_btn) {
                    POBRewardedAdRenderer.this.a(false);
                } else if (view.getId() == R$id.pob_skip_alert_close_btn) {
                    POBRewardedAdRenderer.this.a(true);
                }
            }
        }
    }

    class b implements POBFullScreenActivityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f62907a;

        b(View view) {
            this.f62907a = view;
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onCreate(Activity activity) {
            POBRewardedAdRenderer.this.f62900i = activity;
            View view = this.f62907a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(activity);
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityListener
        public void onDestroy() {
            POBRewardedAdRenderer.this.b();
            View view = this.f62907a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(POBRewardedAdRenderer.this.f62897f.getApplicationContext());
            }
        }
    }

    public POBRewardedAdRenderer(@NonNull Context context, int i10, @NonNull POBSkipConfirmationInfo pOBSkipConfirmationInfo) {
        this.f62897f = context;
        this.f62896e = i10;
        this.f62903l = pOBSkipConfirmationInfo;
    }

    private void d() {
        POBVideoRendering pOBVideoRendering = this.f62892a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.invalidateExpiration();
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void destroy() {
        POBVideoRendering pOBVideoRendering = this.f62892a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.destroy();
            this.f62892a = null;
        }
        this.f62893b = null;
        AlertDialog alertDialog = this.f62902k;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                this.f62902k.dismiss();
            }
            this.f62902k = null;
        }
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.f62898g = null;
        Intent intent = new Intent(POBFullScreenActivity.ACTIONS.POB_CLOSE.name());
        intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, hashCode());
        try {
            POBFullScreenActivity.sendBroadcast(this.f62897f, intent);
        } catch (Exception e10) {
            POBLog.warn("POBRewardedAdRenderer", "Unable to send broadcast to full screen activity to close the ad for %s. Error: %s", intent.getAction(), e10.getMessage());
        }
        this.f62900i = null;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
        if (pOBDataType$POBVideoAdEventType == POBDataType$POBVideoAdEventType.COMPLETE) {
            this.f62901j = true;
            POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
            if (pOBRewardedAdRendererListener != null) {
                pOBRewardedAdRendererListener.onReceiveReward(null);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener
    public void onAdAboutToSkip() {
        c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        a();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        b();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i10) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.f62899h = view;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRender(pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        this.f62901j = true;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
    }

    @Override // com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener
    public void onBackPressed() {
        c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdClicked();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z10) {
        POBFullScreenActivity.updateBackButtonState(this.f62897f, hashCode(), z10);
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBLog.debug("POBRewardedAdRenderer", "Rendering onStart", new Object[0]);
        this.f62894c = pOBAdDescriptor;
        this.f62892a = POBRenderer.videoRenderer(this.f62897f, pOBAdDescriptor, "interstitial", this.f62896e, true);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            this.f62892a.setAdRendererListener(this);
            this.f62892a.setVideoRenderingListener(this);
            this.f62892a.setVideoSkipEventListener(this);
            this.f62892a.setWatermark(this.f62904m);
            this.f62892a.renderAd(pOBAdDescriptor);
            return;
        }
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, "Rendering failed for descriptor: " + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void setAdRendererListener(@Nullable POBRewardedAdRendererListener pOBRewardedAdRendererListener) {
        this.f62893b = pOBRewardedAdRendererListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void setWatermark(@Nullable String str) {
        this.f62904m = str;
    }

    @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendering
    public void show() {
        View view;
        POBLog.info("POBRewardedAdRenderer", "Show rewarded ad", new Object[0]);
        POBAdDescriptor pOBAdDescriptor = this.f62894c;
        if (pOBAdDescriptor == null || (view = this.f62899h) == null) {
            return;
        }
        a(pOBAdDescriptor, view);
        if (POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode())) != null) {
            try {
                POBFullScreenActivity.startFullScreenActivity(this.f62897f, this.f62894c.isVideo(), hashCode());
                a();
                return;
            } catch (Exception e10) {
                POBLog.error("POBRewardedAdRenderer", "Unable to start full screen activity for ad renderer %s. Error: %s", Integer.valueOf(hashCode()), e10.getMessage());
                onAdRenderingFailed(new POBError(1009, "Failed to show interstitial ad with error: " + e10.getMessage()));
                return;
            }
        }
        String str = "Can not show rewarded ad for descriptor: " + this.f62894c;
        POBLog.error("POBRewardedAdRenderer", str, new Object[0]);
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10 = this.f62895d - 1;
        this.f62895d = i10;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f62893b;
        if (pOBRewardedAdRendererListener == null || i10 != 0) {
            return;
        }
        pOBRewardedAdRendererListener.onAdInteractionStopped();
        destroy();
    }

    private void c() {
        if (this.f62901j) {
            Activity activity = this.f62900i;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Activity activity2 = this.f62900i;
        if (activity2 == null || activity2.isFinishing() || this.f62900i.isDestroyed()) {
            return;
        }
        if (this.f62902k == null) {
            View viewInflate = LayoutInflater.from(this.f62900i).inflate(R$layout.pob_layout_rewardedad_skip_alert, (ViewGroup) null);
            AlertDialog.Builder cancelable = new AlertDialog.Builder(this.f62900i, R$style.SkipAlertDialog).setView(viewInflate).setCancelable(false);
            ((TextView) viewInflate.findViewById(R$id.pob_skip_alert_title_txt)).setText(this.f62903l.getTitle());
            ((TextView) viewInflate.findViewById(R$id.pob_skip_alert_msg_txt)).setText(this.f62903l.getMessage());
            Button button = (Button) viewInflate.findViewById(R$id.pob_skip_alert_resume_btn);
            button.setText(this.f62903l.getResumeText());
            button.setOnClickListener(this.f62905n);
            Button button2 = (Button) viewInflate.findViewById(R$id.pob_skip_alert_close_btn);
            button2.setText(this.f62903l.getCloseText());
            button2.setOnClickListener(this.f62905n);
            this.f62902k = cancelable.create();
        }
        this.f62902k.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        POBVideoRendering pOBVideoRendering = this.f62892a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.proceedAdSkip(z10);
        }
    }

    private void a(POBAdDescriptor pOBAdDescriptor, View view) {
        this.f62898g = new b(view);
        ViewGroup viewGroup = pOBAdDescriptor.isVideo() ? (ViewGroup) view : null;
        if (viewGroup != null) {
            POBAdViewCacheService.AdViewConfig adViewConfig = new POBAdViewCacheService.AdViewConfig(viewGroup, this.f62898g);
            adViewConfig.setBackPressListener(this);
            POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), adViewConfig);
            return;
        }
        POBLog.warn("POBRewardedAdRenderer", "Failed to create renderer container view.", new Object[0]);
    }

    private void a() {
        if (this.f62893b != null && this.f62895d == 0) {
            d();
            this.f62893b.onAdInteractionStarted();
        }
        this.f62895d++;
    }
}
