package j9;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class o implements j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f85536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.core.j f85537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f85538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f85539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f85540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f85541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f85542g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f85543h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f85544i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f85545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f85546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f85547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f85548m;

    private class b implements i9.b {
        private b() {
        }

        @Override // ae.j
        public void c(Throwable th2) {
            i9.a.a(this, th2);
            o.this.r();
        }

        @Override // ae.j
        public void onRun() {
            if (o.this.p()) {
                return;
            }
            o.this.r();
        }

        @Override // java.lang.Runnable
        public /* synthetic */ void run() {
            ae.i.a(this);
        }
    }

    private class c implements i9.b {
        private c() {
        }

        @Override // ae.j
        public /* synthetic */ void c(Throwable th2) {
            i9.a.a(this, th2);
        }

        @Override // ae.j
        public void onRun() {
            o.this.stop();
        }

        @Override // java.lang.Runnable
        public /* synthetic */ void run() {
            ae.i.a(this);
        }
    }

    private class d implements ViewTreeObserver.OnPreDrawListener {
        private d() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            o.this.u();
            return true;
        }
    }

    public o(View view, io.bidmachine.core.j jVar, p pVar) {
        this.f85536a = new WeakReference(view);
        this.f85537b = jVar;
        this.f85538c = pVar;
        this.f85539d = new d();
        this.f85540e = new b();
        this.f85541f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        View viewS = s();
        if (viewS == null) {
            stop();
            return true;
        }
        if (this.f85545j && this.f85546k) {
            stop();
            return true;
        }
        long jB = this.f85537b.b();
        if (t(viewS, this.f85537b.a(), this.f85537b.d(), this.f85537b.c()) && this.f85538c.a()) {
            this.f85545j = true;
            if (!this.f85547l && !this.f85546k) {
                io.bidmachine.core.h.V(this.f85541f, jB);
                this.f85548m = System.currentTimeMillis();
                this.f85547l = true;
            }
        } else if (!this.f85546k) {
            io.bidmachine.core.h.g(this.f85541f);
            this.f85548m = 0L;
            this.f85547l = false;
        }
        return false;
    }

    private View q(View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view2;
            }
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f85544i.set(false);
        u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    private boolean t(View view, final float f10, boolean z10, boolean z11) {
        final String string;
        try {
            string = view.toString();
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
        }
        if (!view.isShown()) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.g
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: view visibility verification failed - %s", string);
                }
            });
            return false;
        }
        if (io.bidmachine.core.h.N(view)) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.h
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: view transparent verification failed - %s", string);
                }
            });
            return false;
        }
        if (!z10 && !view.hasWindowFocus()) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.i
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: window focus verification failed - %s", string);
                }
            });
            return false;
        }
        float width = view.getWidth() * view.getHeight();
        if (width == 0.0f) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.j
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: view size verification failed - %s", string);
                }
            });
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.k
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: global visibility verification failed - %s", string);
                }
            });
            return false;
        }
        final float fWidth = (rect.width() * rect.height()) / width;
        if (fWidth < f10) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.l
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: ad view not completely visible (%s / %s) - %s", Float.valueOf(fWidth), Float.valueOf(f10), string);
                }
            });
            return false;
        }
        View viewQ = q(view);
        if (viewQ == null) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.m
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: content or root layout not found - %s", string);
                }
            });
            return false;
        }
        Rect rect2 = new Rect();
        viewQ.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            io.bidmachine.core.a.a(new ce.b() { // from class: j9.n
                @Override // ce.b
                public final Object get() {
                    return String.format("Show wasn't tracked: ad view is out of current window - %s", string);
                }
            });
            return false;
        }
        if (!z11) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView();
            ?? r14 = (ViewGroup) view.getParent();
            final int i10 = 0;
            while (r14 != 0) {
                for (int iIndexOfChild = r14.indexOfChild(view) + 1; iIndexOfChild < r14.getChildCount(); iIndexOfChild++) {
                    final View childAt = r14.getChildAt(iIndexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rectD = io.bidmachine.core.h.D(childAt);
                        if (Rect.intersects(rect, rectD)) {
                            final float fV = v(rect, rectD);
                            if (fV < f10) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: j9.d
                                    @Override // ce.b
                                    public final Object get() {
                                        return String.format("Show wasn't tracked: ad view is covered by another view (visible percent - %s / %s, ad view - %s, overlapping view - %s)", Float.valueOf(fV), Float.valueOf(f10), string, childAt);
                                    }
                                });
                                return false;
                            }
                            i10++;
                            if (i10 >= 3) {
                                io.bidmachine.core.a.a(new ce.b() { // from class: j9.e
                                    @Override // ce.b
                                    public final Object get() {
                                        return String.format("Show wasn't tracked: ad view is covered by too many views (overlapping views count - %s, ad view - %s)", Integer.valueOf(i10), string);
                                    }
                                });
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (r14 != viewGroup) {
                    ?? r92 = r14;
                    r14 = (ViewGroup) r14.getParent();
                    view = r92;
                } else {
                    r14 = 0;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f85544i.compareAndSet(false, true)) {
            io.bidmachine.core.h.g(this.f85540e);
            io.bidmachine.core.h.V(this.f85540e, 100L);
        }
    }

    private float v(Rect rect, Rect rect2) {
        int iWidth = rect.width() * rect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / iWidth;
    }

    View s() {
        return (View) this.f85536a.get();
    }

    @Override // j9.a
    public void start() {
        synchronized (this.f85542g) {
            try {
                if (this.f85543h.compareAndSet(false, true)) {
                    final View viewS = s();
                    if (viewS == null) {
                        stop();
                    } else {
                        io.bidmachine.core.a.a(new ce.b() { // from class: j9.c
                            @Override // ce.b
                            public final Object get() {
                                return String.format("Start tracking - %s", viewS);
                            }
                        });
                        viewS.getViewTreeObserver().addOnPreDrawListener(this.f85539d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j9.a
    public void stop() {
        synchronized (this.f85542g) {
            try {
                this.f85543h.set(false);
                final View viewS = s();
                if (viewS != null) {
                    io.bidmachine.core.a.a(new ce.b() { // from class: j9.f
                        @Override // ce.b
                        public final Object get() {
                            return String.format("Stop tracking - %s", viewS);
                        }
                    });
                    long jB = this.f85537b.b();
                    if (this.f85545j && !this.f85546k && jB > -1 && this.f85548m > 0 && System.currentTimeMillis() - this.f85548m >= jB) {
                        this.f85546k = true;
                        this.f85538c.b();
                    }
                    ViewTreeObserver viewTreeObserver = viewS.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f85539d);
                    }
                }
                io.bidmachine.core.h.g(this.f85540e);
                io.bidmachine.core.h.g(this.f85541f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
