package fd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Nullable;
import ic.t;
import ic.u;
import java.util.concurrent.atomic.AtomicBoolean;
import pd.f0;
import pd.v;

/* JADX INFO: loaded from: classes3.dex */
public class b extends View implements ic.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Paint f71976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Paint f71977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Paint f71978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f71979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f71980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f71981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f71982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f71983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f71984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f71985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f71986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f71987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f71988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f71989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f71990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f71991q;

    /* JADX INFO: renamed from: fd.b$b, reason: collision with other inner class name */
    private class C0883b implements u {
        private C0883b() {
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            t.a(this, th2);
        }

        @Override // pd.w
        public void onRun() {
            boolean z10 = !b.this.k() || b.this.isShown();
            if (z10) {
                b.this.f71981g.k();
            } else {
                b.this.f71981g.j();
            }
            long jC = b.this.f71981g.c();
            long jD = b.this.f71981g.d();
            if (z10) {
                b.this.e((jD * 100.0f) / jC, (int) Math.ceil((jC - jD) / 1000.0d));
            }
            if (b.this.f71981g.f()) {
                b.this.l();
            } else {
                jd.h.e(this, 16L);
            }
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            v.b(this);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f71993a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f71994b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f71995c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f71996d = 0;

        c() {
        }

        long a() {
            return SystemClock.elapsedRealtime();
        }

        public void b(long j10) {
            this.f71994b = j10;
            h();
        }

        public long c() {
            return this.f71994b;
        }

        public long d() {
            return this.f71995c;
        }

        public boolean e() {
            return this.f71993a;
        }

        public boolean f() {
            return this.f71995c >= this.f71994b;
        }

        public void g() {
            this.f71993a = false;
        }

        public void h() {
            this.f71995c = 0L;
            this.f71996d = a();
        }

        public void i() {
            this.f71993a = true;
            this.f71996d = a();
        }

        public void j() {
            this.f71996d = a();
        }

        public void k() {
            if (e()) {
                long jA = a();
                this.f71995c = Math.min(this.f71994b, this.f71995c + (jA - this.f71996d));
                this.f71996d = jA;
            }
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        super(context);
        this.f71979e = new RectF();
        this.f71980f = new RectF();
        this.f71981g = new c();
        this.f71982h = new AtomicBoolean(false);
        this.f71988n = 100.0f;
        this.f71990p = (byte) -1;
        this.f71991q = false;
        Paint paint = new Paint(1);
        this.f71976b = paint;
        paint.setColor(ic.k.f74288d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f71977c = paint2;
        int i10 = ic.k.f74287c;
        paint2.setColor(i10);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.f71978d = paint3;
        paint3.setColor(i10);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        f(context);
    }

    private void f(Context context) {
        setLayerType(1, null);
        this.f71985k = f0.g(context, 54.0f);
        this.f71986l = f0.g(context, 54.0f);
        float fG = f0.g(context, 3.0f);
        this.f71987m = fG;
        this.f71977c.setStrokeWidth(fG);
        d();
    }

    private void g(Canvas canvas) {
        float f10 = this.f71990p * (360.0f - ((this.f71988n * 360.0f) * 0.01f));
        canvas.drawArc(this.f71979e, 0.0f, 360.0f, false, this.f71976b);
        canvas.drawArc(this.f71980f, 270.0f, f10, false, this.f71977c);
    }

    private void i(Canvas canvas) {
        canvas.drawText(String.valueOf(this.f71989o), this.f71985k, this.f71986l - ((this.f71978d.descent() + this.f71978d.ascent()) / 2.0f), this.f71978d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d dVar;
        if (this.f71982h.compareAndSet(false, true) && (dVar = this.f71983i) != null) {
            dVar.a();
        }
    }

    @Override // ic.h
    public void a(id.j jVar) {
        id.f0 f0VarK = jVar.k();
        if (f0VarK != null) {
            this.f71978d.setTypeface(Typeface.create(Typeface.DEFAULT, f0VarK.g()));
        }
        Integer numI = jVar.i();
        if (numI != null) {
            this.f71976b.setColor(numI.intValue());
        }
        Integer numP = jVar.p(getContext());
        if (numP != null) {
            float fIntValue = numP.intValue();
            this.f71987m = fIntValue;
            this.f71977c.setStrokeWidth(fIntValue);
        }
        Integer numO = jVar.o();
        if (numO != null) {
            this.f71977c.setColor(numO.intValue());
        }
        d();
    }

    float b(RectF rectF, boolean z10) {
        float fWidth = rectF.width();
        if (z10) {
            fWidth -= this.f71987m * 2.0f;
        }
        return fWidth * 0.70710677f * 0.9f;
    }

    void d() {
        float width = (getWidth() - r0) / 2.0f;
        float height = (getHeight() - r0) / 2.0f;
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f71979e.set(width, height, width + fMin, fMin + height);
        this.f71985k = this.f71979e.centerX();
        this.f71986l = this.f71979e.centerY();
        float f10 = this.f71987m / 2.0f;
        RectF rectF = this.f71980f;
        RectF rectF2 = this.f71979e;
        rectF.set(rectF2.left + f10, rectF2.top + f10, rectF2.right - f10, rectF2.bottom - f10);
        this.f71978d.setTextSize(b(this.f71979e, true));
    }

    public void e(float f10, int i10) {
        if (f10 >= 0.0f || f10 <= 100.0f) {
            this.f71988n = f10;
        }
        this.f71989o = i10;
        postInvalidate();
    }

    public void h() {
        o();
        this.f71983i = null;
    }

    public boolean k() {
        return this.f71991q;
    }

    public void m() {
        o();
        if (this.f71982h.get()) {
            return;
        }
        this.f71981g.i();
        C0883b c0883b = new C0883b();
        this.f71984j = c0883b;
        jd.h.e(c0883b, 16L);
    }

    public void n() {
        this.f71982h.set(false);
        this.f71981g.h();
        m();
    }

    public void o() {
        this.f71981g.g();
        Runnable runnable = this.f71984j;
        if (runnable == null) {
            return;
        }
        jd.h.c(runnable);
        this.f71984j = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.f71989o == 0) {
            return;
        }
        g(canvas);
        i(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d();
    }

    public void setClockwise(boolean z10) {
        if (z10) {
            this.f71990p = (byte) -1;
        } else {
            this.f71990p = (byte) 1;
        }
    }

    public void setDuration(long j10) {
        this.f71981g.b(j10);
    }

    public void setListener(@Nullable d dVar) {
        this.f71983i = dVar;
    }

    public void setOnlyVisibleWork(boolean z10) {
        this.f71991q = z10;
    }
}
