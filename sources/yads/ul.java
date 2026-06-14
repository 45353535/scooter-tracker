package yads;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ul implements ze {
    @Override // yads.ze
    public final void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // yads.ze
    public final void cancel() {
    }
}
