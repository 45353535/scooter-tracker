package com.pubmatic.sdk.video.player;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$dimen;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.mraid.POBMraidRenderer;
import com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener;
import com.pubmatic.sdk.webrendering.ui.POBCountdownView;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class POBMraidEndCardView extends FrameLayout implements POBEndCardRendering, POBAdRendererListener, POBUseCustomCloseListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.pubmatic.sdk.video.player.a f63058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBMraidRenderer f63060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImageView f63062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f63063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBOnSkipOptionUpdateListener f63064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBCountdownView f63065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f63066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private POBTimeoutHandler f63067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBCountdownTimer f63068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f63069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f63070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f63071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f63072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f63073p;

    class a implements POBTimeoutHandler.POBTimeoutHandlerListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBLog.debug("POBMraidEndCardView", "Custom close delay timer exhausted", new Object[0]);
            POBMraidEndCardView pOBMraidEndCardView = POBMraidEndCardView.this;
            pOBMraidEndCardView.a(pOBMraidEndCardView.f63069l, 2000L);
        }
    }

    class b extends POBCountdownTimer {
        b(long j10, long j11, Looper looper) {
            super(j10, j11, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            POBMraidEndCardView.this.g();
            POBLog.debug("POBMraidEndCardView", "Skip button timer exhausted, Skip button is shown", new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onTick(long j10) {
        }
    }

    class c implements POBCountdownView.OnTimerExhaustedListener {
        c() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBCountdownView.OnTimerExhaustedListener
        public void onTimerExhausted() {
            POBMraidEndCardView.this.c();
            POBLog.debug("POBMraidEndCardView", "Countdown view timer exhausted, Skip button is shown", new Object[0]);
        }
    }

    public POBMraidEndCardView(@NonNull Context context, boolean z10) {
        super(context);
        this.f63063f = z10;
        setBackgroundColor(getResources().getColor(R.color.black));
        if (z10) {
            this.f63062e = POBUIUtil.createSkipButton(context, R$id.pob_forward_btn, R$drawable.pob_ic_forward_24);
        } else {
            this.f63062e = POBUIUtil.createSkipButton(context, R$id.pob_close_btn, com.pubmatic.sdk.common.R$drawable.pob_ic_close_black_24dp);
        }
        this.f63062e.setOnClickListener(this);
        this.f63062e.setVisibility(8);
    }

    private void d() {
        setBackgroundColor(Color.argb(204, 0, 0, 0));
    }

    private void e() {
        POBTimeoutHandler pOBTimeoutHandler = this.f63067j;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
            this.f63067j = null;
        }
    }

    private void f() {
        POBCountdownTimer pOBCountdownTimer = this.f63068k;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
            this.f63068k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f63062e.setVisibility(0);
        a(true);
    }

    private void h() {
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new a());
        this.f63067j = pOBTimeoutHandler;
        pOBTimeoutHandler.start(2000L);
        this.f63070m = System.currentTimeMillis();
        POBLog.debug("POBMraidEndCardView", "Custom close delay timer started with 2 sec delay", new Object[0]);
    }

    private void i() {
        POBCountdownTimer pOBCountdownTimer = this.f63068k;
        if (pOBCountdownTimer != null) {
            this.f63072o = true;
            pOBCountdownTimer.start();
            POBLog.debug("POBMraidEndCardView", "Skip button timer started", new Object[0]);
        }
    }

    public void destroy() {
        invalidateRenderer();
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public FrameLayout getView() {
        return this;
    }

    public void invalidateRenderer() {
        POBMraidRenderer pOBMraidRenderer = this.f63060c;
        if (pOBMraidRenderer != null) {
            pOBMraidRenderer.destroy();
            this.f63060c = null;
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        this.f63073p++;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        int i10 = this.f63073p - 1;
        this.f63073p = i10;
        com.pubmatic.sdk.video.player.a aVar = this.f63058a;
        if (aVar == null || i10 != 0) {
            return;
        }
        if (this.f63060c != null && this.f63063f) {
            aVar.d();
        } else {
            destroy();
            this.f63058a.onClose();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i10) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.f63066i = view;
        if (view.getParent() != null || pOBAdDescriptor == null) {
            return;
        }
        com.pubmatic.sdk.video.player.a aVar = this.f63058a;
        if (aVar != null) {
            aVar.a();
        }
        POBEndCardUtil.updateEndCardView(view, this, pOBAdDescriptor);
        addView(view, 0);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        a(new POBVastError(602, "End-card failed to render."));
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f63060c == null) {
            a(false, 0L);
        } else {
            h();
            onAdInteractionStarted();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.pob_close_btn) {
            com.pubmatic.sdk.video.player.a aVar = this.f63058a;
            if (aVar != null) {
                aVar.onClose();
                return;
            }
            return;
        }
        if (view.getId() == R$id.pob_forward_btn) {
            com.pubmatic.sdk.video.player.a aVar2 = this.f63058a;
            if (aVar2 != null) {
                aVar2.d();
                return;
            }
            return;
        }
        if (view.getId() == com.pubmatic.sdk.video.R$id.pob_learn_more_btn) {
            c();
            com.pubmatic.sdk.video.player.a aVar3 = this.f63058a;
            if (aVar3 != null) {
                aVar3.b();
                return;
            }
            return;
        }
        if (view instanceof POBMraidEndCardView) {
            c();
            com.pubmatic.sdk.video.player.a aVar4 = this.f63058a;
            if (aVar4 != null) {
                aVar4.c();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f63060c != null) {
            e();
            f();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        c();
        com.pubmatic.sdk.video.player.a aVar = this.f63058a;
        if (aVar != null) {
            aVar.onEndCardWillLeaveApp();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        c();
        com.pubmatic.sdk.video.player.a aVar = this.f63058a;
        if (aVar != null) {
            aVar.a(null, true);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        View view = this.f63066i;
        if (view != null) {
            removeView(view);
            this.f63066i = null;
        }
        a(new POBVastError(602, "End-card failed to render."));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        POBCountdownTimer pOBCountdownTimer = this.f63068k;
        if (pOBCountdownTimer == null) {
            return;
        }
        if (!z10) {
            pOBCountdownTimer.pause();
        } else if (this.f63072o) {
            pOBCountdownTimer.resume();
        } else {
            i();
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void render(@Nullable POBAdDescriptor pOBAdDescriptor) {
        if (pOBAdDescriptor == null) {
            b();
            return;
        }
        POBLog.debug("POBMraidEndCardView", "Suitable end-card found.", new Object[0]);
        if (!POBNetworkMonitor.isNetworkAvailable(getContext())) {
            a(new POBVastError(602, "End-card failed to render due to network connectivity."));
        } else {
            if (renderMRAIDView(pOBAdDescriptor)) {
                return;
            }
            a(new POBVastError(604, "No supported resource found for end-card."));
        }
    }

    protected boolean renderMRAIDView(@NonNull POBAdDescriptor pOBAdDescriptor) {
        if (POBUtils.isNullOrEmpty(pOBAdDescriptor.getRenderableContent())) {
            POBLog.error("POBMraidEndCardView", "Renderable contents not available.", new Object[0]);
            return false;
        }
        POBMraidRenderer pOBMraidRendererCreateInstance = POBMraidRenderer.createInstance(getContext(), "interstitial", hashCode());
        this.f63060c = pOBMraidRendererCreateInstance;
        if (pOBMraidRendererCreateInstance == null) {
            POBLog.error("POBMraidEndCardView", "Failed to create MRAID Renderer.", new Object[0]);
            return false;
        }
        pOBMraidRendererCreateInstance.setAdRendererListener(this);
        this.f63060c.setBaseURL(POBInstanceProvider.getSdkConfig().isRequestSecureCreative() ? "https://ow.pubmatic.com/openrtb/2.5" : "http://ow.pubmatic.com/openrtb/2.5");
        this.f63060c.setCustomCloseListener(this);
        this.f63060c.renderAd(pOBAdDescriptor);
        return true;
    }

    void setFSCEnabled(boolean z10) {
        setOnClickListener(z10 ? this : null);
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setLearnMoreTitle(@NonNull String str) {
        this.f63059b = str;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setListener(@Nullable com.pubmatic.sdk.video.player.a aVar) {
        this.f63058a = aVar;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.f63064g = pOBOnSkipOptionUpdateListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBEndCardRendering
    public void setSkipAfter(int i10) {
        this.f63061d = i10;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.POBUseCustomCloseListener
    public void useCustomClose(boolean z10) {
        this.f63069l = z10;
        e();
        long jMax = Math.max(0L, System.currentTimeMillis() - this.f63070m);
        this.f63070m = jMax;
        a(z10, jMax);
    }

    private void b() {
        a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        POBCountdownView pOBCountdownView = this.f63065h;
        if (pOBCountdownView == null || pOBCountdownView.getParent() != this) {
            return;
        }
        removeView(this.f63065h);
        g();
        this.f63065h = null;
    }

    private void a() {
        POBLog.debug("POBMraidEndCardView", "Rendering Learn More button on end-card.", new Object[0]);
        Resources resources = getResources();
        View viewA = com.pubmatic.sdk.video.player.b.a(getContext(), com.pubmatic.sdk.video.R$id.pob_learn_more_btn, this.f63059b, resources.getColor(R$color.pob_controls_background_color));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = 17;
        addView(viewA, layoutParams);
        viewA.setOnClickListener(this);
    }

    private void a(POBVastError pOBVastError) {
        com.pubmatic.sdk.video.player.a aVar = this.f63058a;
        if (aVar != null) {
            aVar.a(pOBVastError);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, long j10) {
        POBMraidEndCardView pOBMraidEndCardView;
        if (this.f63071n) {
            return;
        }
        this.f63071n = true;
        POBLog.debug("POBMraidEndCardView", "EndCard skipOffset: " + this.f63061d, new Object[0]);
        if (z10) {
            pOBMraidEndCardView = this;
            pOBMraidEndCardView.f63068k = pOBMraidEndCardView.new b(a(j10), 1L, Looper.getMainLooper());
            if (hasWindowFocus()) {
                i();
            }
        } else {
            pOBMraidEndCardView = this;
            int seconds = pOBMraidEndCardView.f63061d - ((int) TimeUnit.MILLISECONDS.toSeconds(j10));
            if (seconds > 0) {
                pOBMraidEndCardView.f63065h = new POBCountdownView(getContext(), seconds);
                a(false);
                pOBMraidEndCardView.f63065h.setTimerExhaustedListener(new c());
                addView(pOBMraidEndCardView.f63065h);
                POBLog.debug("POBMraidEndCardView", "Countdown view timer started", new Object[0]);
            } else {
                g();
            }
        }
        addView(pOBMraidEndCardView.f63062e);
    }

    private long a(long j10) {
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(TimeUnit.SECONDS.toMillis(this.f63061d), 20000L) - j10);
    }

    private void a(boolean z10) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.f63064g;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z10);
        }
    }
}
