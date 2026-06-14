package g9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import b9.g;
import b9.h;
import b9.k;

/* JADX INFO: loaded from: classes12.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f72157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f72158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f72159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f72160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0886a f72161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f72162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f72163h;

    /* JADX INFO: renamed from: g9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0886a {
        void b();

        void c();
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f72161f != null) {
                a.this.f72161f.b();
            }
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f72159d == null) {
                return;
            }
            long j10 = a.this.f72157b.f72169d;
            if (a.this.isShown()) {
                j10 += 50;
                a.this.f72157b.a(j10);
                a.this.f72159d.r((int) ((100 * j10) / a.this.f72157b.f72168c), (int) Math.ceil((a.this.f72157b.f72168c - j10) / 1000.0d));
            }
            if (j10 < a.this.f72157b.f72168c) {
                a.this.postDelayed(this, 50L);
                return;
            }
            a.this.j();
            if (a.this.f72157b.f72167b <= 0.0f || a.this.f72161f == null) {
                return;
            }
            a.this.f72161f.c();
        }

        /* synthetic */ c(a aVar, b bVar) {
            this();
        }
    }

    public a(Context context) {
        super(context);
        this.f72157b = new d(null);
    }

    private void e() {
        if (isShown()) {
            h();
            c cVar = new c(this, null);
            this.f72160e = cVar;
            postDelayed(cVar, 50L);
        }
    }

    private void h() {
        c cVar = this.f72160e;
        if (cVar != null) {
            removeCallbacks(cVar);
            this.f72160e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f72157b.j()) {
            g gVar = this.f72158c;
            if (gVar != null) {
                gVar.l();
            }
            if (this.f72159d == null) {
                this.f72159d = new h(null);
            }
            this.f72159d.g(getContext(), this, this.f72163h);
            e();
            return;
        }
        h();
        if (this.f72158c == null) {
            this.f72158c = new g(new b());
        }
        this.f72158c.g(getContext(), this, this.f72162g);
        h hVar = this.f72159d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        g gVar = this.f72158c;
        if (gVar != null) {
            gVar.i();
        }
        h hVar = this.f72159d;
        if (hVar != null) {
            hVar.i();
        }
    }

    public long getOnScreenTimeMs() {
        return this.f72157b.h();
    }

    public boolean k() {
        return this.f72157b.e();
    }

    public boolean m() {
        return this.f72157b.l();
    }

    public void n(boolean z10, float f10) {
        if (this.f72157b.f72166a == z10 && this.f72157b.f72167b == f10) {
            return;
        }
        this.f72157b.d(z10, f10);
        if (z10) {
            j();
            return;
        }
        g gVar = this.f72158c;
        if (gVar != null) {
            gVar.l();
        }
        h hVar = this.f72159d;
        if (hVar != null) {
            hVar.l();
        }
        h();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            h();
        } else if (this.f72157b.j() && this.f72157b.l()) {
            e();
        }
        this.f72157b.c(i10 == 0);
    }

    public void setCloseClickListener(@Nullable InterfaceC0886a interfaceC0886a) {
        this.f72161f = interfaceC0886a;
    }

    public void setCloseStyle(@Nullable k kVar) {
        this.f72162g = kVar;
        g gVar = this.f72158c;
        if (gVar == null || !gVar.n()) {
            return;
        }
        this.f72158c.g(getContext(), this, kVar);
    }

    public void setCountDownStyle(@Nullable k kVar) {
        this.f72163h = kVar;
        h hVar = this.f72159d;
        if (hVar == null || !hVar.n()) {
            return;
        }
        this.f72159d.g(getContext(), this, kVar);
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f72166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f72167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f72168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f72169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f72170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f72171f;

        private d() {
            this.f72166a = false;
            this.f72167b = 0.0f;
            this.f72168c = 0L;
            this.f72169d = 0L;
            this.f72170e = 0L;
            this.f72171f = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z10) {
            if (this.f72170e > 0) {
                this.f72171f += System.currentTimeMillis() - this.f72170e;
            }
            if (z10) {
                this.f72170e = System.currentTimeMillis();
            } else {
                this.f72170e = 0L;
            }
        }

        public void a(long j10) {
            this.f72169d = j10;
        }

        public void d(boolean z10, float f10) {
            this.f72166a = z10;
            this.f72167b = f10;
            this.f72168c = (long) (f10 * 1000.0f);
            this.f72169d = 0L;
        }

        public boolean e() {
            long j10 = this.f72168c;
            return j10 == 0 || this.f72169d >= j10;
        }

        public long h() {
            return this.f72170e > 0 ? System.currentTimeMillis() - this.f72170e : this.f72171f;
        }

        public boolean j() {
            long j10 = this.f72168c;
            return j10 != 0 && this.f72169d < j10;
        }

        public boolean l() {
            return this.f72166a;
        }

        /* synthetic */ d(b bVar) {
            this();
        }
    }
}
