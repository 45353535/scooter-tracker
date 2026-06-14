package ic;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ic.a;
import id.j1;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f74177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1 f74178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0919a f74179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f74180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f74181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f74182f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f74183g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f74184h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f74185i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ic.b$b, reason: collision with other inner class name */
    private class C0920b implements u {
        private C0920b() {
        }

        @Override // pd.w
        public void c(Throwable th2) {
            t.a(this, th2);
            b.this.g();
        }

        @Override // pd.w
        public void onRun() {
            if (b.this.f()) {
                return;
            }
            b.this.g();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    private class c implements ViewTreeObserver.OnPreDrawListener {
        private c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.k();
            return true;
        }
    }

    public b(View view, j1 j1Var, a.InterfaceC0919a interfaceC0919a) {
        this.f74177a = new WeakReference(view);
        this.f74178b = j1Var;
        this.f74179c = interfaceC0919a;
        this.f74180d = new C0920b();
        this.f74181e = new c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x011c, code lost:
    
        if (r8 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r14 = r8;
        r8 = (android.view.ViewGroup) r8.getParent();
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(android.view.View r16, float r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.b.c(android.view.View, float, boolean, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        View viewH = h();
        if (viewH == null) {
            stop();
            return true;
        }
        if (c(viewH, this.f74178b.a(), this.f74178b.c(), this.f74178b.b())) {
            i();
            return false;
        }
        j();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f74184h.set(false);
        k();
    }

    private void i() {
        if (this.f74185i.compareAndSet(false, true)) {
            this.f74179c.a();
        }
    }

    private void j() {
        if (this.f74185i.compareAndSet(true, false)) {
            this.f74179c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f74184h.compareAndSet(false, true)) {
            jd.h.c(this.f74180d);
            jd.h.e(this.f74180d, 100L);
        }
    }

    @Override // ic.a
    public void a() {
        stop();
        this.f74177a.clear();
    }

    public View h() {
        return (View) this.f74177a.get();
    }

    @Override // ic.a
    public void start() {
        synchronized (this.f74182f) {
            try {
                if (this.f74183g.compareAndSet(false, true)) {
                    View viewH = h();
                    if (viewH == null) {
                        stop();
                        return;
                    }
                    v.g("VisibilityTracker", "Start tracking - %s", viewH);
                    ViewTreeObserver viewTreeObserver = viewH.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(this.f74181e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ic.a
    public void stop() {
        synchronized (this.f74182f) {
            try {
                this.f74183g.set(false);
                View viewH = h();
                if (viewH != null) {
                    v.g("VisibilityTracker", "Stop tracking - %s", viewH);
                    ViewTreeObserver viewTreeObserver = viewH.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f74181e);
                    }
                }
                jd.h.c(this.f74180d);
                this.f74184h.set(false);
                this.f74185i.set(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ic.a
    public boolean b() {
        return this.f74185i.get();
    }

    private View a(View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view2;
            }
        }
        return view2;
    }
}
