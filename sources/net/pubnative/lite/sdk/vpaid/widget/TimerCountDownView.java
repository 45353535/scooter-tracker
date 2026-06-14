package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import net.pubnative.lite.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public class TimerCountDownView extends CountDownView {
    private TextView progressTextView;
    private RelativeLayout timerContainer;

    public TimerCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View viewInflate = View.inflate(context, R.layout.timer_count_down, this);
        this.progressTextView = (TextView) viewInflate.findViewById(R.id.view_progress_text);
        this.timerContainer = (RelativeLayout) viewInflate.findViewById(R.id.timer_container);
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i10, int i11) {
        String string;
        String string2;
        if (this.timerContainer.getVisibility() == 8) {
            this.timerContainer.setVisibility(0);
        }
        int i12 = ((i11 - i10) / 1000) + 1;
        int i13 = i12 / 60;
        int i14 = i12 % 60;
        if (i13 >= 10) {
            string = Integer.toString(i13);
        } else {
            string = "0" + i13;
        }
        if (i14 >= 10) {
            string2 = Integer.toString(i14);
        } else {
            string2 = "0" + i14;
        }
        this.progressTextView.setText(string + StringUtils.PROCESS_POSTFIX_DELIMITER + string2);
    }

    public TimerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TimerCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
