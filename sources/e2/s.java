package e2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f68896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f68897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f68898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f68899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f68900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f68901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f68902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnAttachStateChangeListener f68903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f68904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f68907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f68908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f68909n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.a();
            s.this.f68906k = false;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            s.this.j();
            return true;
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.a();
        }
    }

    public interface d {
        void a(boolean z10);
    }

    public s(Context context, View view, d dVar) {
        this(context, view, dVar, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        View view;
        String str;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.f68899d.getVisibility() != 0) {
            view = this.f68899d;
            str = "Visibility != View.VISIBLE";
        } else if (this.f68899d.getParent() == null) {
            view = this.f68899d;
            str = "No parent";
        } else if (!this.f68899d.getGlobalVisibleRect(this.f68896a)) {
            view = this.f68899d;
            str = "Can't get global visible rect";
        } else if (g.v(this.f68899d)) {
            view = this.f68899d;
            str = "View is transparent (alpha = 0)";
        } else {
            float width = this.f68899d.getWidth() * this.f68899d.getHeight();
            if (width <= 0.0f) {
                view = this.f68899d;
                str = "Ad View width or height is zero, show wasn't tracked";
            } else {
                float fWidth = (this.f68896a.width() * this.f68896a.height()) / width;
                if (fWidth < this.f68901f) {
                    view = this.f68899d;
                    str = "Ad View is not completely visible (" + fWidth + "), show wasn't tracked";
                } else {
                    View viewC = com.explorestack.iab.mraid.p.c(this.f68898c, this.f68899d);
                    if (viewC != null) {
                        viewC.getGlobalVisibleRect(this.f68897b);
                        if (!Rect.intersects(this.f68896a, this.f68897b)) {
                            view = this.f68899d;
                            str = "Ad View is out of current window, show wasn't tracked";
                        }
                        b(this.f68899d);
                        return;
                    }
                    view = this.f68899d;
                    str = "Can't obtain root view";
                }
            }
        }
        c(view, str);
    }

    private void b(View view) {
        this.f68905j = false;
        e(true);
    }

    private void c(View view, String str) {
        if (!this.f68905j) {
            this.f68905j = true;
            com.explorestack.iab.mraid.d.a("VisibilityTracker", str, new Object[0]);
        }
        e(false);
    }

    private void e(boolean z10) {
        if (this.f68904i != z10) {
            this.f68904i = z10;
            this.f68900e.a(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f68906k) {
            return;
        }
        this.f68906k = true;
        g.A(this.f68909n, 100L);
    }

    public boolean h() {
        return this.f68904i;
    }

    public void i() {
        this.f68908m = true;
        this.f68907l = false;
        this.f68906k = false;
        this.f68899d.getViewTreeObserver().removeOnPreDrawListener(this.f68902g);
        this.f68899d.removeOnAttachStateChangeListener(this.f68903h);
        g.i(this.f68909n);
    }

    public void k() {
        if (this.f68908m || this.f68907l) {
            return;
        }
        this.f68907l = true;
        if (this.f68902g == null) {
            this.f68902g = new b();
        }
        if (this.f68903h == null) {
            this.f68903h = new c();
        }
        this.f68899d.getViewTreeObserver().addOnPreDrawListener(this.f68902g);
        this.f68899d.addOnAttachStateChangeListener(this.f68903h);
        a();
    }

    public s(Context context, View view, d dVar, float f10) {
        this.f68896a = new Rect();
        this.f68897b = new Rect();
        this.f68904i = false;
        this.f68905j = false;
        this.f68906k = false;
        this.f68907l = false;
        this.f68908m = false;
        this.f68909n = new a();
        this.f68898c = context;
        this.f68899d = view;
        this.f68900e = dVar;
        this.f68901f = f10;
    }
}
