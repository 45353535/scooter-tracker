package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class hb1 implements fb1 {
    @Override // yads.fb1
    public final void a(Context context, View view) {
        view.setVisibility(0);
        view.setMinimumHeight(qi3.a(context, 50.0f));
    }

    @Override // yads.fb1
    public final void onAttachedToWindow() {
    }

    @Override // yads.fb1
    public final void onDetachedFromWindow() {
    }
}
