package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ei3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f110381a;

    public ei3(TextView textView) {
        this.f110381a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f110381a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
