package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.pubnative.lite.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressCountDownView extends CountDownView {
    private TextView progressTextView;
    private RelativeLayout timerContainer;

    public ProgressCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View viewInflate = View.inflate(context, R.layout.progress_count_down, this);
        this.progressTextView = (TextView) viewInflate.findViewById(R.id.view_progress_text);
        this.timerContainer = (RelativeLayout) viewInflate.findViewById(R.id.progress_container);
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i10, int i11) {
        if (this.timerContainer.getVisibility() == 8) {
            this.timerContainer.setVisibility(0);
        }
        this.progressTextView.setText("You can skip\nad in " + (((i11 - i10) / 1000) + 1) + "s");
    }

    public ProgressCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ProgressCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
