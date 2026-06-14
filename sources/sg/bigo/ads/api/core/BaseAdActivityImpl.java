package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAdActivityImpl {

    @NonNull
    public final Activity L;
    public int M = 0;

    protected BaseAdActivityImpl(@NonNull Activity activity) {
        this.L = activity;
    }

    public abstract void F();

    public abstract void T();

    protected boolean V() {
        return false;
    }

    public abstract void a(int i10, int i11, Intent intent);

    public final void aF() {
        Window window;
        if (V() || (window = this.L.getWindow()) == null) {
            return;
        }
        sg.bigo.ads.common.utils.s.a(window);
    }

    public void aG() {
        this.L.finish();
    }

    public final boolean aH() {
        return this.M == 1;
    }

    public abstract void ac();

    public abstract void ae();

    public abstract void ag();

    public abstract void ah();

    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(boolean z10);

    protected final void o(@LayoutRes int i10) {
        this.L.setContentView(sg.bigo.ads.common.utils.a.a(this.L, i10, null, false));
    }

    @Nullable
    public final <T extends View> T p(@IdRes int i10) {
        return (T) this.L.findViewById(i10);
    }
}
