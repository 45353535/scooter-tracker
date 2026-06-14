package e2;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f68886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f68887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68888c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f68889d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f68890e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68891f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f68892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f68893h;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            r.this.i();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jMin = r.this.f68891f;
            if (r.this.f68886a.isShown()) {
                jMin = Math.min(r.this.f68890e, jMin + 16);
                r.this.c(jMin);
                r.this.f68887b.a((r.this.f68891f * 100.0f) / r.this.f68890e, r.this.f68891f, r.this.f68890e);
            }
            if (jMin >= r.this.f68890e) {
                r.this.f68887b.a();
            } else {
                r.this.f68886a.postDelayed(this, 16L);
            }
        }
    }

    public interface c {
        void a();

        void a(float f10, long j10, long j11);
    }

    public r(View view, c cVar) {
        a aVar = new a();
        this.f68892g = aVar;
        this.f68893h = new b();
        this.f68886a = view;
        this.f68887b = cVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j10) {
        this.f68891f = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        boolean zIsShown = this.f68886a.isShown();
        if (this.f68888c == zIsShown) {
            return;
        }
        this.f68888c = zIsShown;
        if (!zIsShown) {
            m();
        } else if (g()) {
            k();
        }
    }

    public void a() {
        m();
        this.f68886a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f68892g);
    }

    public void b(float f10) {
        if (this.f68889d == f10) {
            return;
        }
        this.f68889d = f10;
        this.f68890e = (long) (f10 * 1000.0f);
        k();
    }

    public boolean g() {
        long j10 = this.f68890e;
        return j10 != 0 && this.f68891f < j10;
    }

    public void k() {
        if (!this.f68886a.isShown() || this.f68890e == 0) {
            return;
        }
        this.f68886a.postDelayed(this.f68893h, 16L);
    }

    public void m() {
        this.f68886a.removeCallbacks(this.f68893h);
    }
}
