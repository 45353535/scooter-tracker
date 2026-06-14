package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f103011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractRunnableC1274a f103013c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    static abstract class AbstractRunnableC1274a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f103015b;

        private AbstractRunnableC1274a() {
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f103015b) {
                return;
            }
            a();
        }

        /* synthetic */ AbstractRunnableC1274a(byte b10) {
            this();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private synchronized void a(boolean z10) {
        try {
            AbstractRunnableC1274a abstractRunnableC1274a = this.f103013c;
            if (abstractRunnableC1274a != null) {
                abstractRunnableC1274a.f103015b = true;
                this.f103013c = null;
            }
            if (z10) {
                AbstractRunnableC1274a abstractRunnableC1274a2 = new AbstractRunnableC1274a() { // from class: sg.bigo.ads.common.view.a.1
                    @Override // sg.bigo.ads.common.view.a.AbstractRunnableC1274a
                    protected final void a() {
                        if (a.this.f103012b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                            a.this.a();
                        }
                        a.this.postDelayed(this, r0.f103011a);
                    }
                };
                this.f103013c = abstractRunnableC1274a2;
                postDelayed(abstractRunnableC1274a2, this.f103011a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract void a();

    protected abstract boolean b();

    public final void c() {
        if (this.f103012b) {
            return;
        }
        this.f103012b = true;
        a(true);
    }

    public final void d() {
        this.f103012b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f103011a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(@IntRange(from = 0) int i10) {
        this.f103011a = i10;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f103011a = 3000;
        this.f103012b = false;
    }
}
