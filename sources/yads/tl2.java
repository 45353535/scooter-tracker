package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class tl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf0 f116291a;

    public /* synthetic */ tl2() {
        this(new wf0());
    }

    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_ic_replay));
        this.f116291a.getClass();
        int iA = wf0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public tl2(wf0 wf0Var) {
        this.f116291a = wf0Var;
    }
}
