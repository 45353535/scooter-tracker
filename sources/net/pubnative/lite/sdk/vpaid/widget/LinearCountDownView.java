package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.utils.ProgressTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
public class LinearCountDownView extends FrameLayout {
    private ProgressBar progressBarView;
    private TextView progressTextView;

    public LinearCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View viewInflate = View.inflate(context, R.layout.linear_player_count_down, this);
        this.progressBarView = (ProgressBar) viewInflate.findViewById(R.id.view_progress_bar);
        this.progressTextView = (TextView) viewInflate.findViewById(R.id.view_progress_text);
    }

    public void reset() {
        this.progressTextView.setText(ProgressTimeFormatter.formatSeconds(0));
    }

    public void setProgress(int i10, int i11) {
        this.progressBarView.setMax(i11);
        this.progressBarView.setSecondaryProgress(i11);
        this.progressBarView.setProgress(i10);
        int i12 = ((i11 - i10) / 1000) + 1;
        if (i12 < 0) {
            i12 = 0;
        }
        this.progressTextView.setText(ProgressTimeFormatter.formatSeconds(i12));
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
