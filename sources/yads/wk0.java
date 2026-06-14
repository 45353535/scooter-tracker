package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class wk0 implements mv {
    @Override // yads.mv
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // yads.mv
    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
