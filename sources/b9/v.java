package b9;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes12.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f5954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f5956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f5957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f5958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f5959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f5960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnAttachStateChangeListener f5961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5966n;

    public interface a {
        void a(boolean z10);
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a();
            v.this.f5964l = false;
        }
    }

    class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            v.this.g();
            return true;
        }
    }

    class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            v.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            v.this.a();
        }
    }

    public v(Context context, View view, a aVar) {
        this(context, view, aVar, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.f5954b.getVisibility() != 0) {
            c(this.f5954b, "Visibility != View.VISIBLE");
            return;
        }
        if (this.f5954b.getParent() == null) {
            c(this.f5954b, "No parent");
            return;
        }
        if (!this.f5954b.getGlobalVisibleRect(this.f5957e)) {
            c(this.f5954b, "Can't get global visible rect");
            return;
        }
        if (u.x(this.f5954b)) {
            c(this.f5954b, "View is transparent (alpha = 0)");
            return;
        }
        float width = this.f5954b.getWidth() * this.f5954b.getHeight();
        if (width <= 0.0f) {
            c(this.f5954b, "Ad View width or height is zero, show wasn't tracked");
            return;
        }
        float fWidth = (this.f5957e.width() * this.f5957e.height()) / width;
        if (fWidth < this.f5956d) {
            c(this.f5954b, "Ad View is not completely visible (" + fWidth + "), show wasn't tracked");
            return;
        }
        View viewN = io.bidmachine.iab.mraid.r.n(this.f5953a, this.f5954b);
        if (viewN == null) {
            c(this.f5954b, "Can't obtain root view");
            return;
        }
        viewN.getGlobalVisibleRect(this.f5958f);
        if (!Rect.intersects(this.f5957e, this.f5958f)) {
            c(this.f5954b, "Ad View is out of current window, show wasn't tracked");
            return;
        }
        b(this.f5954b);
    }

    private void b(View view) {
        this.f5963k = false;
        e(true);
    }

    private void c(View view, String str) {
        if (!this.f5963k) {
            this.f5963k = true;
            io.bidmachine.iab.mraid.i.c("VisibilityTracker", str, new Object[0]);
        }
        e(false);
    }

    private void e(boolean z10) {
        if (this.f5962j != z10) {
            this.f5962j = z10;
            this.f5955c.a(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f5964l) {
            return;
        }
        this.f5964l = true;
        u.C(this.f5959g, 100L);
    }

    public boolean i() {
        return this.f5962j;
    }

    public void j() {
        this.f5966n = true;
        this.f5965m = false;
        this.f5964l = false;
        this.f5954b.getViewTreeObserver().removeOnPreDrawListener(this.f5960h);
        this.f5954b.removeOnAttachStateChangeListener(this.f5961i);
        u.m(this.f5959g);
    }

    public void k() {
        if (this.f5966n || this.f5965m) {
            return;
        }
        this.f5965m = true;
        if (this.f5960h == null) {
            this.f5960h = new c();
        }
        if (this.f5961i == null) {
            this.f5961i = new d();
        }
        this.f5954b.getViewTreeObserver().addOnPreDrawListener(this.f5960h);
        this.f5954b.addOnAttachStateChangeListener(this.f5961i);
        a();
    }

    public v(Context context, View view, a aVar, float f10) {
        this.f5962j = false;
        this.f5963k = false;
        this.f5964l = false;
        this.f5965m = false;
        this.f5966n = false;
        this.f5953a = context;
        this.f5954b = view;
        this.f5955c = aVar;
        this.f5956d = f10;
        this.f5957e = new Rect();
        this.f5958f = new Rect();
        this.f5959g = new b();
    }
}
