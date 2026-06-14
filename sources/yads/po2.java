package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class po2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k43 f114730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g33 f114731b;

    public /* synthetic */ po2(k43 k43Var) {
        this(k43Var, new g33());
    }

    public final void a(View view, long j10, long j11) {
        view.setVisibility(0);
        this.f114730a.getClass();
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        TextView textView = viewFindViewWithTag instanceof TextView ? (TextView) viewFindViewWithTag : null;
        if (textView != null) {
            this.f114731b.getClass();
            textView.setText(String.valueOf((int) Math.ceil((j10 - j11) / g33.f111052a)));
        }
    }

    public po2(k43 k43Var, g33 g33Var) {
        this.f114730a = k43Var;
        this.f114731b = g33Var;
    }
}
