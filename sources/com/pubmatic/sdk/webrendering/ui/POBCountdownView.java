package com.pubmatic.sdk.webrendering.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$dimen;
import com.pubmatic.sdk.webrendering.R$id;

/* JADX INFO: loaded from: classes11.dex */
public class POBCountdownView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBCountdownTimer f63418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f63419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f63422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnTimerExhaustedListener f63423f;

    public interface OnTimerExhaustedListener {
        void onTimerExhausted();
    }

    class a extends POBCountdownTimer {
        a(long j10, long j11, Looper looper) {
            super(j10, j11, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            if (POBCountdownView.this.f63423f != null) {
                POBCountdownView.this.f63423f.onTimerExhausted();
            }
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onTick(long j10) {
            POBCountdownView.this.setTimeToTimerTextView(j10);
        }
    }

    private POBCountdownView(Context context) {
        super(context);
        this.f63420c = false;
        this.f63422e = context.getResources();
        TextView textViewB = b();
        this.f63419b = textViewB;
        addView(textViewB);
    }

    private TextView b() {
        this.f63419b = POBUIUtil.createSkipDurationTextView(getContext(), R$id.pob_skip_duration_timer);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f63422e.getDimensionPixelOffset(R$dimen.pob_control_width), this.f63422e.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = 17;
        this.f63419b.setLayoutParams(layoutParams);
        return this.f63419b;
    }

    private void c() {
        POBCountdownTimer pOBCountdownTimer = this.f63418a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.pause();
        }
    }

    private void d() {
        POBCountdownTimer pOBCountdownTimer = this.f63418a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.resume();
        }
    }

    private void e() {
        if (this.f63418a == null) {
            a aVar = new a(this.f63421d, 1L, Looper.getMainLooper());
            this.f63418a = aVar;
            aVar.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToTimerTextView(long j10) {
        this.f63419b.setText(String.valueOf(j10));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f63420c && hasWindowFocus()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f63420c) {
            a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f63420c) {
            if (!z10) {
                c();
            } else {
                e();
                d();
            }
        }
    }

    public void setTimerExhaustedListener(@Nullable OnTimerExhaustedListener onTimerExhaustedListener) {
        this.f63423f = onTimerExhaustedListener;
    }

    private void a() {
        POBCountdownTimer pOBCountdownTimer = this.f63418a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
        }
    }

    public POBCountdownView(@NonNull Context context, int i10) {
        this(context);
        if (i10 > 0) {
            this.f63421d = i10;
            this.f63420c = true;
        }
        setLayoutParams(POBUIUtil.getLayoutParamsForTopRightPosition(context));
        setTimeToTimerTextView(i10);
    }
}
