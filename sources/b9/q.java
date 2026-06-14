package b9;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes12.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f5928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5930c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5931d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5932e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5933f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f5934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f5935h;

    public interface a {
        void a(float f10, long j10, long j11);

        void b();
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            q.this.a();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jMin = q.this.f5933f;
            if (q.this.f5928a.isShown()) {
                jMin = Math.min(q.this.f5932e, jMin + 16);
                q.this.b(jMin);
                q.this.f5929b.a((q.this.f5933f * 100.0f) / q.this.f5932e, q.this.f5933f, q.this.f5932e);
            }
            if (jMin >= q.this.f5932e) {
                q.this.f5929b.b();
            } else {
                q.this.f5928a.postDelayed(this, 16L);
            }
        }
    }

    public q(View view, a aVar) {
        b bVar = new b();
        this.f5934g = bVar;
        this.f5935h = new c();
        this.f5928a = view;
        this.f5929b = aVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        boolean zIsShown = this.f5928a.isShown();
        if (this.f5930c == zIsShown) {
            return;
        }
        this.f5930c = zIsShown;
        if (!zIsShown) {
            m();
        } else if (j()) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        this.f5933f = j10;
    }

    public void h() {
        m();
        this.f5928a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f5934g);
    }

    public boolean j() {
        long j10 = this.f5932e;
        return j10 != 0 && this.f5933f < j10;
    }

    public void k(float f10) {
        if (this.f5931d == f10) {
            return;
        }
        this.f5931d = f10;
        this.f5932e = (long) (f10 * 1000.0f);
        l();
    }

    public void l() {
        if (!this.f5928a.isShown() || this.f5932e == 0) {
            return;
        }
        this.f5928a.postDelayed(this.f5935h, 16L);
    }

    public void m() {
        this.f5928a.removeCallbacks(this.f5935h);
    }
}
