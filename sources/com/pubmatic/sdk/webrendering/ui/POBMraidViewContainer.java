package com.pubmatic.sdk.webrendering.ui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.ui.POBCountdownView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBMraidViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f63454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBOnSkipOptionUpdateListener f63456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBCountdownView f63457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f63458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBObstructionUpdateListener f63459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBMraidViewContainerListener f63460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBCountdownTimer f63462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f63464k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R$id.pob_close_btn) {
                if (POBMraidViewContainer.this.f63460g != null) {
                    POBMraidViewContainer.this.f63460g.onClose();
                }
            } else if (view.getId() == R$id.pob_forward_btn) {
                POBMraidViewContainer.this.hideSkipBtn();
                if (POBMraidViewContainer.this.f63460g != null) {
                    POBMraidViewContainer.this.f63460g.onForward();
                }
                POBMraidViewContainer.this.bringWatermarkToFront();
            }
        }
    }

    class b extends POBCountdownTimer {
        b(long j10, long j11, Looper looper) {
            super(j10, j11, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            POBMraidViewContainer.this.handleShowSkip();
            POBLog.debug("POBMraidViewContainer", "Skip button timer exhausted, Skip button is shown", new Object[0]);
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
            POBMraidViewContainer.this.a();
            POBLog.debug("POBMraidViewContainer", "Countdown view timer exhausted, Skip button is shown", new Object[0]);
        }
    }

    public POBMraidViewContainer(@NonNull Context context, boolean z10) {
        super(context);
        this.f63461h = false;
        if (z10) {
            this.f63454a = POBUIUtil.createSkipButton(context, R$id.pob_forward_btn, R$drawable.pob_ic_forward_24);
        } else {
            this.f63454a = POBUIUtil.createSkipButton(context, R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        }
    }

    private void c() {
        POBCountdownTimer pOBCountdownTimer = this.f63462i;
        if (pOBCountdownTimer != null) {
            this.f63463j = true;
            pOBCountdownTimer.start();
            POBLog.debug("POBMraidViewContainer", "Skip button timer started", new Object[0]);
        }
    }

    public void bringWatermarkToFront() {
        ImageView imageView = this.f63464k;
        if (imageView != null) {
            imageView.bringToFront();
        }
    }

    public void configureSkippability(int i10) {
        this.f63455b = i10;
    }

    @NonNull
    public ImageView getSkipBtn() {
        return this.f63454a;
    }

    public void handleShowSkip() {
        this.f63454a.setVisibility(0);
        a(true);
    }

    public void handleSkipTimer(long j10) {
        if (this.f63461h) {
            b();
            this.f63462i = new b(TimeUnit.MILLISECONDS.toSeconds(j10), 1L, Looper.getMainLooper());
            if (hasWindowFocus()) {
                c();
                return;
            }
            return;
        }
        int seconds = this.f63455b - ((int) TimeUnit.MILLISECONDS.toSeconds(j10));
        if (!this.f63458e || seconds <= 0) {
            a();
            return;
        }
        POBCountdownView pOBCountdownView = new POBCountdownView(getContext(), seconds);
        this.f63457d = pOBCountdownView;
        pOBCountdownView.setTimerExhaustedListener(new c());
        addView(this.f63457d);
        bringWatermarkToFront();
        POBLog.debug("POBMraidViewContainer", "Countdown view timer started", new Object[0]);
        POBObstructionUpdateListener pOBObstructionUpdateListener = this.f63459f;
        if (pOBObstructionUpdateListener != null) {
            pOBObstructionUpdateListener.addFriendlyObstructions(this.f63457d, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
        }
    }

    @NonNull
    public void hideSkipBtn() {
        this.f63454a.setVisibility(8);
    }

    public void onAdViewClicked() {
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        POBLog.debug("POBMraidViewContainer", "Display interstitial skipOffset: " + this.f63455b, new Object[0]);
        POBObstructionUpdateListener pOBObstructionUpdateListener = this.f63459f;
        if (pOBObstructionUpdateListener != null) {
            pOBObstructionUpdateListener.addFriendlyObstructions(this.f63454a, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
            ImageView imageView = this.f63464k;
            if (imageView != null) {
                this.f63459f.addFriendlyObstructions(imageView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
            }
        }
        if (this.f63458e || this.f63461h) {
            this.f63454a.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        POBCountdownTimer pOBCountdownTimer = this.f63462i;
        if (pOBCountdownTimer == null) {
            return;
        }
        if (!z10) {
            pOBCountdownTimer.pause();
        } else if (this.f63463j) {
            pOBCountdownTimer.resume();
        } else {
            c();
        }
    }

    public void setCustomCloseEnabled(boolean z10) {
        this.f63461h = z10;
    }

    public void setEnableSkipTimer(boolean z10) {
        this.f63458e = z10;
    }

    public void setMraidViewContainerListener(@Nullable POBMraidViewContainerListener pOBMraidViewContainerListener) {
        this.f63460g = pOBMraidViewContainerListener;
    }

    public void setObstructionUpdateListener(@Nullable POBObstructionUpdateListener pOBObstructionUpdateListener) {
        this.f63459f = pOBObstructionUpdateListener;
    }

    public void setSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.f63456c = pOBOnSkipOptionUpdateListener;
    }

    @NonNull
    public void setWatermarkView(@Nullable ImageView imageView) {
        this.f63464k = imageView;
        if (imageView != null) {
            addView(imageView);
            bringWatermarkToFront();
            POBObstructionUpdateListener pOBObstructionUpdateListener = this.f63459f;
            if (pOBObstructionUpdateListener != null) {
                pOBObstructionUpdateListener.addFriendlyObstructions(imageView, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.NOT_VISIBLE);
            }
        }
    }

    public void updateSkipButtonToCloseButton() {
        b();
        POBUIUtil.updateSkipButtonToCloseButton((ImageButton) this.f63454a);
        a();
        this.f63454a.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        POBCountdownView pOBCountdownView = this.f63457d;
        if (pOBCountdownView != null && pOBCountdownView.getParent() != null) {
            removeView(this.f63457d);
        }
        handleShowSkip();
    }

    private void b() {
        POBCountdownTimer pOBCountdownTimer = this.f63462i;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
            this.f63462i = null;
        }
    }

    public POBMraidViewContainer(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z10, boolean z11) {
        this(context, viewGroup, z10);
        if (z11) {
            POBUIUtil.updateSkipBtnColor(context, this.f63454a, R$color.pob_controls_stroke_color);
        }
    }

    private void a(boolean z10) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.f63456c;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z10);
        }
    }

    public POBMraidViewContainer(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z10) {
        this(context, z10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        addView(viewGroup, layoutParams);
        this.f63454a.setOnClickListener(new a());
        addView(this.f63454a);
        bringWatermarkToFront();
    }
}
