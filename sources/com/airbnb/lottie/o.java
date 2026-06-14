package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d0.b0;
import d0.c0;
import d0.e0;
import d0.u;
import d0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0.v;

/* JADX INFO: loaded from: classes5.dex */
public class o extends Drawable implements Drawable.Callback, Animatable {
    private static final boolean U;
    private static final List V;
    private static final Executor W;
    private Bitmap A;
    private Canvas B;
    private Rect C;
    private RectF D;
    private Paint E;
    private Rect F;
    private Rect G;
    private RectF H;
    private RectF I;
    private Matrix J;
    private float[] K;
    private Matrix L;
    private boolean M;
    private d0.a N;
    private final ValueAnimator.AnimatorUpdateListener O;
    private final Semaphore P;
    private Handler Q;
    private Runnable R;
    private final Runnable S;
    private float T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0.i f7321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0.j f7322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f7326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f7327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i0.b f7328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i0.a f7330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f7331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f7332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p f7333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m0.c f7336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c0 f7343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Matrix f7345z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(d0.i iVar);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        U = Build.VERSION.SDK_INT <= 25;
        V = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        W = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new q0.h());
    }

    public o() {
        q0.j jVar = new q0.j();
        this.f7322c = jVar;
        this.f7323d = true;
        this.f7324e = false;
        this.f7325f = false;
        this.f7326g = b.NONE;
        this.f7327h = new ArrayList();
        this.f7333n = new p();
        this.f7334o = false;
        this.f7335p = true;
        this.f7337r = 255;
        this.f7342w = false;
        this.f7343x = c0.AUTOMATIC;
        this.f7344y = false;
        this.f7345z = new Matrix();
        this.K = new float[9];
        this.M = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: d0.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.o.g(this.f68383b, valueAnimator);
            }
        };
        this.O = animatorUpdateListener;
        this.P = new Semaphore(1);
        this.S = new Runnable() { // from class: d0.t
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.o.k(this.f68384b);
            }
        };
        this.T = -3.4028235E38f;
        jVar.addUpdateListener(animatorUpdateListener);
    }

    private void B(int i10, int i11) {
        Bitmap bitmap = this.A;
        if (bitmap == null || bitmap.getWidth() < i10 || this.A.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.A = bitmapCreateBitmap;
            this.B.setBitmap(bitmapCreateBitmap);
            this.M = true;
            return;
        }
        if (this.A.getWidth() > i10 || this.A.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.A, 0, 0, i10, i11);
            this.A = bitmapCreateBitmap2;
            this.B.setBitmap(bitmapCreateBitmap2);
            this.M = true;
        }
    }

    private void C() {
        if (this.B != null) {
            return;
        }
        this.B = new Canvas();
        this.I = new RectF();
        this.J = new Matrix();
        this.L = new Matrix();
        this.C = new Rect();
        this.D = new RectF();
        this.E = new e0.a();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
    }

    private Context J() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private i0.a K() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f7330k == null) {
            i0.a aVar = new i0.a(getCallback(), null);
            this.f7330k = aVar;
            String str = this.f7332m;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f7330k;
    }

    private i0.b M() {
        i0.b bVar = this.f7328i;
        if (bVar != null && !bVar.b(J())) {
            this.f7328i = null;
        }
        if (this.f7328i == null) {
            this.f7328i = new i0.b(getCallback(), this.f7329j, null, this.f7321b.j());
        }
        return this.f7328i;
    }

    private boolean T0() {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return false;
        }
        float f10 = this.T;
        float fQ = this.f7322c.q();
        this.T = fQ;
        return Math.abs(fQ - f10) * iVar.d() >= 50.0f;
    }

    private boolean b0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public static /* synthetic */ void g(o oVar, ValueAnimator valueAnimator) {
        if (oVar.E()) {
            oVar.invalidateSelf();
            return;
        }
        m0.c cVar = oVar.f7336q;
        if (cVar != null) {
            cVar.M(oVar.f7322c.q());
        }
    }

    private void j0(Canvas canvas, m0.c cVar) {
        if (this.f7321b == null || cVar == null) {
            return;
        }
        C();
        canvas.getMatrix(this.J);
        canvas.getClipBounds(this.C);
        w(this.C, this.D);
        this.J.mapRect(this.D);
        x(this.D, this.C);
        if (this.f7335p) {
            this.I.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.d(this.I, null, false);
        }
        this.J.mapRect(this.I);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        m0(this.I, fWidth, fHeight);
        if (!b0()) {
            RectF rectF = this.I;
            Rect rect = this.C;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.I.width());
        int iCeil2 = (int) Math.ceil(this.I.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        B(iCeil, iCeil2);
        if (this.M) {
            this.J.getValues(this.K);
            float[] fArr = this.K;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f7345z.set(this.J);
            this.f7345z.preScale(fWidth, fHeight);
            Matrix matrix = this.f7345z;
            RectF rectF2 = this.I;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f7345z.postScale(1.0f / f10, 1.0f / f11);
            this.A.eraseColor(0);
            this.B.setMatrix(q0.p.f98669a);
            this.B.scale(f10, f11);
            cVar.h(this.B, this.f7345z, this.f7337r, null);
            this.J.invert(this.L);
            this.L.mapRect(this.H, this.I);
            x(this.H, this.G);
        }
        this.F.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.A, this.F, this.G, this.E);
    }

    public static /* synthetic */ void k(final o oVar) {
        m0.c cVar = oVar.f7336q;
        if (cVar == null) {
            return;
        }
        try {
            oVar.P.acquire();
            cVar.M(oVar.f7322c.q());
            if (U && oVar.M) {
                if (oVar.Q == null) {
                    oVar.Q = new Handler(Looper.getMainLooper());
                    oVar.R = new Runnable() { // from class: d0.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.o.n(this.f68382b);
                        }
                    };
                }
                oVar.Q.post(oVar.R);
            }
            oVar.P.release();
        } catch (InterruptedException unused) {
            oVar.P.release();
        } catch (Throwable th2) {
            oVar.P.release();
            throw th2;
        }
    }

    private void m0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public static /* synthetic */ void n(o oVar) {
        Drawable.Callback callback = oVar.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(oVar);
        }
    }

    private void t() {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return;
        }
        m0.c cVar = new m0.c(this, v.a(iVar), iVar.k(), iVar);
        this.f7336q = cVar;
        if (this.f7339t) {
            cVar.K(true);
        }
        this.f7336q.Q(this.f7335p);
    }

    private void v() {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return;
        }
        this.f7344y = this.f7343x.g(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    private void w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void y(Canvas canvas) {
        m0.c cVar = this.f7336q;
        d0.i iVar = this.f7321b;
        if (cVar == null || iVar == null) {
            return;
        }
        this.f7345z.reset();
        if (!getBounds().isEmpty()) {
            this.f7345z.preTranslate(r2.left, r2.top);
            this.f7345z.preScale(r2.width() / iVar.b().width(), r2.height() / iVar.b().height());
        }
        cVar.h(canvas, this.f7345z, this.f7337r, null);
    }

    public void A() {
        this.f7327h.clear();
        this.f7322c.p();
        if (isVisible()) {
            return;
        }
        this.f7326g = b.NONE;
    }

    public void A0(boolean z10) {
        this.f7334o = z10;
    }

    public void B0(final int i10) {
        if (this.f7321b == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7296a.B0(i10);
                }
            });
        } else {
            this.f7322c.G(i10 + 0.99f);
        }
    }

    public void C0(final String str) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar2) {
                    this.f7310a.C0(str);
                }
            });
            return;
        }
        j0.h hVarL = iVar.l(str);
        if (hVarL != null) {
            B0((int) (hVarL.f85452b + hVarL.f85453c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public d0.a D() {
        d0.a aVar = this.N;
        return aVar != null ? aVar : d0.e.d();
    }

    public void D0(final float f10) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar2) {
                    this.f7304a.D0(f10);
                }
            });
        } else {
            this.f7322c.G(q0.l.i(iVar.p(), this.f7321b.f(), f10));
        }
    }

    public boolean E() {
        return D() == d0.a.ENABLED;
    }

    public void E0(final int i10, final int i11) {
        if (this.f7321b == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7306a.E0(i10, i11);
                }
            });
        } else {
            this.f7322c.H(i10, i11 + 0.99f);
        }
    }

    public Bitmap F(String str) {
        i0.b bVarM = M();
        if (bVarM != null) {
            return bVarM.a(str);
        }
        return null;
    }

    public void F0(final String str) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar2) {
                    this.f7294a.F0(str);
                }
            });
            return;
        }
        j0.h hVarL = iVar.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f85452b;
            E0(i10, ((int) hVarL.f85453c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean G() {
        return this.f7342w;
    }

    public void G0(final int i10) {
        if (this.f7321b == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7298a.G0(i10);
                }
            });
        } else {
            this.f7322c.I(i10);
        }
    }

    public boolean H() {
        return this.f7335p;
    }

    public void H0(final String str) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar2) {
                    this.f7312a.H0(str);
                }
            });
            return;
        }
        j0.h hVarL = iVar.l(str);
        if (hVarL != null) {
            G0((int) hVarL.f85452b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public d0.i I() {
        return this.f7321b;
    }

    public void I0(final float f10) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar2) {
                    this.f7315a.I0(f10);
                }
            });
        } else {
            G0((int) q0.l.i(iVar.p(), this.f7321b.f(), f10));
        }
    }

    public void J0(boolean z10) {
        if (this.f7339t == z10) {
            return;
        }
        this.f7339t = z10;
        m0.c cVar = this.f7336q;
        if (cVar != null) {
            cVar.K(z10);
        }
    }

    public void K0(boolean z10) {
        this.f7338s = z10;
        d0.i iVar = this.f7321b;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    public int L() {
        return (int) this.f7322c.r();
    }

    public void L0(final float f10) {
        if (this.f7321b == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7317a.L0(f10);
                }
            });
            return;
        }
        if (d0.e.h()) {
            d0.e.b("Drawable#setProgress");
        }
        this.f7322c.F(this.f7321b.h(f10));
        if (d0.e.h()) {
            d0.e.c("Drawable#setProgress");
        }
    }

    public void M0(c0 c0Var) {
        this.f7343x = c0Var;
        v();
    }

    public String N() {
        return this.f7329j;
    }

    public void N0(int i10) {
        this.f7322c.setRepeatCount(i10);
    }

    public d0.v O(String str) {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return null;
        }
        return (d0.v) iVar.j().get(str);
    }

    public void O0(int i10) {
        this.f7322c.setRepeatMode(i10);
    }

    public boolean P() {
        return this.f7334o;
    }

    public void P0(boolean z10) {
        this.f7325f = z10;
    }

    public j0.h Q() {
        Iterator it = V.iterator();
        j0.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f7321b.l((String) it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void Q0(float f10) {
        this.f7322c.J(f10);
    }

    public float R() {
        return this.f7322c.t();
    }

    public float S() {
        return this.f7322c.u();
    }

    public void S0(boolean z10) {
        this.f7322c.K(z10);
    }

    public b0 T() {
        d0.i iVar = this.f7321b;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public float U() {
        return this.f7322c.q();
    }

    public boolean U0() {
        return this.f7331l == null && this.f7321b.c().size() > 0;
    }

    public c0 V() {
        return this.f7344y ? c0.SOFTWARE : c0.HARDWARE;
    }

    public int W() {
        return this.f7322c.getRepeatCount();
    }

    public int X() {
        return this.f7322c.getRepeatMode();
    }

    public float Y() {
        return this.f7322c.v();
    }

    public e0 Z() {
        return null;
    }

    public Typeface a0(j0.c cVar) {
        Map map = this.f7331l;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return (Typeface) map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return (Typeface) map.get(strB);
            }
            String str = cVar.a() + TokenBuilder.TOKEN_DELIMITER + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        i0.a aVarK = K();
        if (aVarK != null) {
            return aVarK.b(cVar);
        }
        return null;
    }

    public boolean c0() {
        q0.j jVar = this.f7322c;
        if (jVar == null) {
            return false;
        }
        return jVar.isRunning();
    }

    boolean d0() {
        if (isVisible()) {
            return this.f7322c.isRunning();
        }
        b bVar = this.f7326g;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m0.c cVar = this.f7336q;
        if (cVar == null) {
            return;
        }
        boolean zE = E();
        if (zE) {
            try {
                this.P.acquire();
            } catch (InterruptedException unused) {
                if (d0.e.h()) {
                    d0.e.c("Drawable#draw");
                }
                if (!zE) {
                    return;
                }
                this.P.release();
                if (cVar.P() == this.f7322c.q()) {
                    return;
                }
            } catch (Throwable th2) {
                if (d0.e.h()) {
                    d0.e.c("Drawable#draw");
                }
                if (zE) {
                    this.P.release();
                    if (cVar.P() != this.f7322c.q()) {
                        W.execute(this.S);
                    }
                }
                throw th2;
            }
        }
        if (d0.e.h()) {
            d0.e.b("Drawable#draw");
        }
        if (zE && T0()) {
            L0(this.f7322c.q());
        }
        if (this.f7325f) {
            try {
                if (this.f7344y) {
                    j0(canvas, cVar);
                } else {
                    y(canvas);
                }
            } catch (Throwable th3) {
                q0.g.b("Lottie crashed in draw!", th3);
            }
        } else if (this.f7344y) {
            j0(canvas, cVar);
        } else {
            y(canvas);
        }
        this.M = false;
        if (d0.e.h()) {
            d0.e.c("Drawable#draw");
        }
        if (zE) {
            this.P.release();
            if (cVar.P() == this.f7322c.q()) {
                return;
            }
            W.execute(this.S);
        }
    }

    public boolean e0() {
        return this.f7340u;
    }

    public boolean f0() {
        return this.f7341v;
    }

    public boolean g0(u uVar) {
        return this.f7333n.b(uVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7337r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        d0.i iVar = this.f7321b;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0() {
        this.f7327h.clear();
        this.f7322c.x();
        if (isVisible()) {
            return;
        }
        this.f7326g = b.NONE;
    }

    public void i0() {
        if (this.f7336q == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7314a.i0();
                }
            });
            return;
        }
        v();
        if (s(J()) || W() == 0) {
            if (isVisible()) {
                this.f7322c.y();
                this.f7326g = b.NONE;
            } else {
                this.f7326g = b.PLAY;
            }
        }
        if (s(J())) {
            return;
        }
        j0.h hVarQ = Q();
        if (hVarQ != null) {
            w0((int) hVarQ.f85452b);
        } else {
            w0((int) (Y() < 0.0f ? S() : R()));
        }
        this.f7322c.p();
        if (isVisible()) {
            return;
        }
        this.f7326g = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.M) {
            return;
        }
        this.M = true;
        if ((!U || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return c0();
    }

    public List k0(j0.e eVar) {
        if (this.f7336q == null) {
            q0.g.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f7336q.i(eVar, 0, arrayList, new j0.e(new String[0]));
        return arrayList;
    }

    public void l0() {
        if (this.f7336q == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7309a.l0();
                }
            });
            return;
        }
        v();
        if (s(J()) || W() == 0) {
            if (isVisible()) {
                this.f7322c.C();
                this.f7326g = b.NONE;
            } else {
                this.f7326g = b.RESUME;
            }
        }
        if (s(J())) {
            return;
        }
        w0((int) (Y() < 0.0f ? S() : R()));
        this.f7322c.p();
        if (isVisible()) {
            return;
        }
        this.f7326g = b.NONE;
    }

    public void n0(boolean z10) {
        this.f7340u = z10;
    }

    public void o0(boolean z10) {
        this.f7341v = z10;
    }

    public void p0(d0.a aVar) {
        this.N = aVar;
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.f7322c.addListener(animatorListener);
    }

    public void q0(boolean z10) {
        if (z10 != this.f7342w) {
            this.f7342w = z10;
            invalidateSelf();
        }
    }

    public void r(final j0.e eVar, final Object obj, final r0.c cVar) {
        m0.c cVar2 = this.f7336q;
        if (cVar2 == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7300a.r(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == j0.e.f85446c) {
            cVar2.b(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().b(obj, cVar);
        } else {
            List listK0 = k0(eVar);
            for (int i10 = 0; i10 < listK0.size(); i10++) {
                ((j0.e) listK0.get(i10)).d().b(obj, cVar);
            }
            zIsEmpty = true ^ listK0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == y.E) {
                L0(U());
            }
        }
    }

    public void r0(boolean z10) {
        if (z10 != this.f7335p) {
            this.f7335p = z10;
            m0.c cVar = this.f7336q;
            if (cVar != null) {
                cVar.Q(z10);
            }
            invalidateSelf();
        }
    }

    public boolean s(Context context) {
        if (this.f7324e) {
            return true;
        }
        return this.f7323d && d0.e.f().a(context) == h0.a.STANDARD_MOTION;
    }

    public boolean s0(d0.i iVar) {
        if (this.f7321b == iVar) {
            return false;
        }
        this.M = true;
        u();
        this.f7321b = iVar;
        t();
        this.f7322c.E(iVar);
        L0(this.f7322c.getAnimatedFraction());
        Iterator it = new ArrayList(this.f7327h).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f7327h.clear();
        iVar.v(this.f7338s);
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7337r = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        q0.g.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f7326g;
            if (bVar == b.PLAY) {
                i0();
                return visible;
            }
            if (bVar == b.RESUME) {
                l0();
                return visible;
            }
        } else {
            if (this.f7322c.isRunning()) {
                h0();
                this.f7326g = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f7326g = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        i0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        A();
    }

    public void t0(String str) {
        this.f7332m = str;
        i0.a aVarK = K();
        if (aVarK != null) {
            aVarK.c(str);
        }
    }

    public void u() {
        if (this.f7322c.isRunning()) {
            this.f7322c.cancel();
            if (!isVisible()) {
                this.f7326g = b.NONE;
            }
        }
        this.f7321b = null;
        this.f7336q = null;
        this.f7328i = null;
        this.T = -3.4028235E38f;
        this.f7322c.o();
        invalidateSelf();
    }

    public void u0(d0.b bVar) {
        i0.a aVar = this.f7330k;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v0(Map map) {
        if (map == this.f7331l) {
            return;
        }
        this.f7331l = map;
        invalidateSelf();
    }

    public void w0(final int i10) {
        if (this.f7321b == null) {
            this.f7327h.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.o.a
                public final void a(d0.i iVar) {
                    this.f7319a.w0(i10);
                }
            });
        } else {
            this.f7322c.F(i10);
        }
    }

    public void x0(boolean z10) {
        this.f7324e = z10;
    }

    public void y0(d0.c cVar) {
        i0.b bVar = this.f7328i;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public void z(u uVar, boolean z10) {
        boolean zA = this.f7333n.a(uVar, z10);
        if (this.f7321b == null || !zA) {
            return;
        }
        t();
    }

    public void z0(String str) {
        this.f7329j = str;
    }

    public void R0(e0 e0Var) {
    }
}
