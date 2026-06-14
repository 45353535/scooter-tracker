package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public class PieChartCountdownView extends CountDownView {
    private boolean isBackgroundOn;
    private ProgressBar progressBarView;
    private TextView progressTextView;

    public PieChartCountdownView(Context context) {
        super(context);
        this.isBackgroundOn = false;
        init(context);
    }

    private void init(Context context) {
        View viewInflate = View.inflate(context, R.layout.player_count_down, this);
        this.progressBarView = (ProgressBar) viewInflate.findViewById(R.id.view_progress_bar);
        this.progressTextView = (TextView) viewInflate.findViewById(R.id.view_progress_text);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -90.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        this.progressBarView.startAnimation(rotateAnimation);
    }

    private void initBackground() {
        if (this.isBackgroundOn) {
            return;
        }
        this.isBackgroundOn = true;
        this.progressBarView.setBackground(getResources().getDrawable(R.drawable.circle_progress_background));
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i10, int i11) {
        initBackground();
        this.progressBarView.setMax(i11);
        this.progressBarView.setSecondaryProgress(i11);
        this.progressBarView.setProgress(i10);
        this.progressTextView.setText(String.valueOf(((i11 - i10) / 1000) + 1));
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isBackgroundOn = false;
        init(context);
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isBackgroundOn = false;
        init(context);
    }
}
