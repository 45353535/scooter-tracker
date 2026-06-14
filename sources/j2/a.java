package j2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import e2.e;
import e2.j;
import e2.k;

/* JADX INFO: loaded from: classes5.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f85477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f85478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f85479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f85480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f85481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f85482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f85483h;

    /* JADX INFO: renamed from: j2.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC1020a implements View.OnClickListener {
        ViewOnClickListenerC1020a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f85481f != null) {
                a.this.f85481f.b();
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f85479d == null) {
                return;
            }
            long j10 = a.this.f85477b.f85489d;
            if (a.this.isShown()) {
                j10 += 50;
                a.this.f85477b.a(j10);
                a.this.f85479d.r((int) ((100 * j10) / a.this.f85477b.f85488c), (int) Math.ceil((a.this.f85477b.f85488c - j10) / 1000.0d));
            }
            if (j10 < a.this.f85477b.f85488c) {
                a.this.postDelayed(this, 50L);
                return;
            }
            a.this.j();
            if (a.this.f85477b.f85487b <= 0.0f || a.this.f85481f == null) {
                return;
            }
            a.this.f85481f.c();
        }

        /* synthetic */ b(a aVar, ViewOnClickListenerC1020a viewOnClickListenerC1020a) {
            this();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f85486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f85487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f85488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f85489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f85490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f85491f;

        private c() {
            this.f85486a = false;
            this.f85487b = 0.0f;
            this.f85488c = 0L;
            this.f85489d = 0L;
            this.f85490e = 0L;
            this.f85491f = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z10) {
            if (this.f85490e > 0) {
                this.f85491f += System.currentTimeMillis() - this.f85490e;
            }
            if (z10) {
                this.f85490e = System.currentTimeMillis();
            } else {
                this.f85490e = 0L;
            }
        }

        public void a(long j10) {
            this.f85489d = j10;
        }

        public void d(boolean z10, float f10) {
            this.f85486a = z10;
            this.f85487b = f10;
            this.f85488c = (long) (f10 * 1000.0f);
            this.f85489d = 0L;
        }

        public boolean e() {
            long j10 = this.f85488c;
            return j10 == 0 || this.f85489d >= j10;
        }

        public long h() {
            return this.f85490e > 0 ? System.currentTimeMillis() - this.f85490e : this.f85491f;
        }

        public boolean j() {
            long j10 = this.f85488c;
            return j10 != 0 && this.f85489d < j10;
        }

        public boolean l() {
            return this.f85486a;
        }

        /* synthetic */ c(ViewOnClickListenerC1020a viewOnClickListenerC1020a) {
            this();
        }
    }

    public interface d {
        void b();

        void c();
    }

    public a(Context context) {
        super(context);
        this.f85477b = new c(null);
    }

    private void e() {
        if (isShown()) {
            h();
            b bVar = new b(this, null);
            this.f85480e = bVar;
            postDelayed(bVar, 50L);
        }
    }

    private void h() {
        b bVar = this.f85480e;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f85480e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f85477b.j()) {
            j jVar = this.f85478c;
            if (jVar != null) {
                jVar.m();
            }
            if (this.f85479d == null) {
                this.f85479d = new k(null);
            }
            this.f85479d.f(getContext(), this, this.f85483h);
            e();
            return;
        }
        h();
        if (this.f85478c == null) {
            this.f85478c = new j(new ViewOnClickListenerC1020a());
        }
        this.f85478c.f(getContext(), this, this.f85482g);
        k kVar = this.f85479d;
        if (kVar != null) {
            kVar.m();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        j jVar = this.f85478c;
        if (jVar != null) {
            jVar.c();
        }
        k kVar = this.f85479d;
        if (kVar != null) {
            kVar.c();
        }
    }

    public long getOnScreenTimeMs() {
        return this.f85477b.h();
    }

    public boolean k() {
        return this.f85477b.e();
    }

    public boolean m() {
        return this.f85477b.l();
    }

    public void n(boolean z10, float f10) {
        if (this.f85477b.f85486a == z10 && this.f85477b.f85487b == f10) {
            return;
        }
        this.f85477b.d(z10, f10);
        if (z10) {
            j();
            return;
        }
        j jVar = this.f85478c;
        if (jVar != null) {
            jVar.m();
        }
        k kVar = this.f85479d;
        if (kVar != null) {
            kVar.m();
        }
        h();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            h();
        } else if (this.f85477b.j() && this.f85477b.l()) {
            e();
        }
        this.f85477b.c(i10 == 0);
    }

    public void setCloseClickListener(@Nullable d dVar) {
        this.f85481f = dVar;
    }

    public void setCloseStyle(@Nullable e eVar) {
        this.f85482g = eVar;
        j jVar = this.f85478c;
        if (jVar == null || !jVar.o()) {
            return;
        }
        this.f85478c.f(getContext(), this, eVar);
    }

    public void setCountDownStyle(@Nullable e eVar) {
        this.f85483h = eVar;
        k kVar = this.f85479d;
        if (kVar == null || !kVar.o()) {
            return;
        }
        this.f85479d.f(getContext(), this, eVar);
    }
}
