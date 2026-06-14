package m0;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.o;
import g0.a;
import g0.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l0.i;
import m0.e;
import o0.j;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements f0.e, a.b, j0.f {
    private Paint A;
    float B;
    BlurMaskFilter C;
    e0.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f94319a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f94320b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f94321c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f94322d = new e0.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f94323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f94324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f94325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f94326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f94327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f94328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f94329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f94330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f94331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f94332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Matrix f94333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final o f94334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e f94335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g0.h f94336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g0.d f94337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f94338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f94339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f94340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f94341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f94342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f94343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f94344z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f94346b;

        static {
            int[] iArr = new int[i.a.values().length];
            f94346b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94346b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94346b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94346b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f94345a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94345a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94345a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94345a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f94345a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f94345a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f94345a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(o oVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f94323e = new e0.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f94324f = new e0.a(1, mode2);
        e0.a aVar = new e0.a(1);
        this.f94325g = aVar;
        this.f94326h = new e0.a(PorterDuff.Mode.CLEAR);
        this.f94327i = new RectF();
        this.f94328j = new RectF();
        this.f94329k = new RectF();
        this.f94330l = new RectF();
        this.f94331m = new RectF();
        this.f94333o = new Matrix();
        this.f94341w = new ArrayList();
        this.f94343y = true;
        this.B = 0.0f;
        this.f94334p = oVar;
        this.f94335q = eVar;
        this.f94332n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f94342x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            g0.h hVar = new g0.h(eVar.h());
            this.f94336r = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((g0.a) it.next()).a(this);
            }
            for (g0.a aVar2 : this.f94336r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f94329k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f94336r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                l0.i iVar = (l0.i) this.f94336r.b().get(i10);
                Path path = (Path) ((g0.a) this.f94336r.a().get(i10)).h();
                if (path != null) {
                    this.f94319a.set(path);
                    this.f94319a.transform(matrix);
                    int i11 = a.f94346b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f94319a.computeBounds(this.f94331m, false);
                    if (i10 == 0) {
                        this.f94329k.set(this.f94331m);
                    } else {
                        RectF rectF2 = this.f94329k;
                        rectF2.set(Math.min(rectF2.left, this.f94331m.left), Math.min(this.f94329k.top, this.f94331m.top), Math.max(this.f94329k.right, this.f94331m.right), Math.max(this.f94329k.bottom, this.f94331m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f94329k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f94335q.i() != e.b.INVERT) {
            this.f94330l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f94338t.d(this.f94330l, matrix, true);
            if (rectF.intersect(this.f94330l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f94334p.invalidateSelf();
    }

    private void G(float f10) {
        this.f94334p.I().n().a(this.f94335q.j(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z10) {
        if (z10 != this.f94343y) {
            this.f94343y = z10;
            F();
        }
    }

    private void O() {
        if (this.f94335q.f().isEmpty()) {
            N(true);
            return;
        }
        g0.d dVar = new g0.d(this.f94335q.f());
        this.f94337s = dVar;
        dVar.m();
        this.f94337s.a(new a.b() { // from class: m0.a
            @Override // g0.a.b
            public final void f() {
                b bVar = this.f94318a;
                bVar.N(bVar.f94337s.r() == 1.0f);
            }
        });
        N(((Float) this.f94337s.h()).floatValue() == 1.0f);
        j(this.f94337s);
    }

    private void k(Canvas canvas, Matrix matrix, g0.a aVar, g0.a aVar2) {
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        this.f94322d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f94319a, this.f94322d);
    }

    private void l(Canvas canvas, Matrix matrix, g0.a aVar, g0.a aVar2) {
        q0.p.n(canvas, this.f94327i, this.f94323e);
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        this.f94322d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f94319a, this.f94322d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, g0.a aVar, g0.a aVar2) {
        q0.p.n(canvas, this.f94327i, this.f94322d);
        canvas.drawRect(this.f94327i, this.f94322d);
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        this.f94322d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f94319a, this.f94324f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, g0.a aVar, g0.a aVar2) {
        q0.p.n(canvas, this.f94327i, this.f94323e);
        canvas.drawRect(this.f94327i, this.f94322d);
        this.f94324f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        canvas.drawPath(this.f94319a, this.f94324f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, g0.a aVar, g0.a aVar2) {
        q0.p.n(canvas, this.f94327i, this.f94324f);
        canvas.drawRect(this.f94327i, this.f94322d);
        this.f94324f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        canvas.drawPath(this.f94319a, this.f94324f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (d0.e.h()) {
            d0.e.b("Layer#saveLayer");
        }
        q0.p.o(canvas, this.f94327i, this.f94323e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (d0.e.h()) {
            d0.e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f94336r.b().size(); i10++) {
            l0.i iVar = (l0.i) this.f94336r.b().get(i10);
            g0.a aVar = (g0.a) this.f94336r.a().get(i10);
            g0.a aVar2 = (g0.a) this.f94336r.c().get(i10);
            int i11 = a.f94346b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f94322d.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f94322d.setAlpha(255);
                        canvas.drawRect(this.f94327i, this.f94322d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f94322d.setAlpha(255);
                canvas.drawRect(this.f94327i, this.f94322d);
            }
        }
        if (d0.e.h()) {
            d0.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (d0.e.h()) {
            d0.e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, g0.a aVar) {
        this.f94319a.set((Path) aVar.h());
        this.f94319a.transform(matrix);
        canvas.drawPath(this.f94319a, this.f94324f);
    }

    private boolean r() {
        if (this.f94336r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f94336r.b().size(); i10++) {
            if (((l0.i) this.f94336r.b().get(i10)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f94340v != null) {
            return;
        }
        if (this.f94339u == null) {
            this.f94340v = Collections.EMPTY_LIST;
            return;
        }
        this.f94340v = new ArrayList();
        for (b bVar = this.f94339u; bVar != null; bVar = bVar.f94339u) {
            this.f94340v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        if (d0.e.h()) {
            d0.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f94327i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f94326h);
        if (d0.e.h()) {
            d0.e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, o oVar, d0.i iVar) {
        switch (a.f94345a[eVar.g().ordinal()]) {
            case 1:
                return new g(oVar, eVar, cVar, iVar);
            case 2:
                return new c(oVar, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(oVar, eVar);
            case 4:
                return new d(oVar, eVar);
            case 5:
                return new f(oVar, eVar);
            case 6:
                return new i(oVar, eVar);
            default:
                q0.g.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    e A() {
        return this.f94335q;
    }

    boolean B() {
        g0.h hVar = this.f94336r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f94338t != null;
    }

    public void H(g0.a aVar) {
        this.f94341w.remove(aVar);
    }

    void J(b bVar) {
        this.f94338t = bVar;
    }

    void K(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new e0.a();
        }
        this.f94344z = z10;
    }

    void L(b bVar) {
        this.f94339u = bVar;
    }

    void M(float f10) {
        if (d0.e.h()) {
            d0.e.b("BaseLayer#setProgress");
            d0.e.b("BaseLayer#setProgress.transform");
        }
        this.f94342x.j(f10);
        if (d0.e.h()) {
            d0.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f94336r != null) {
            if (d0.e.h()) {
                d0.e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f94336r.a().size(); i10++) {
                ((g0.a) this.f94336r.a().get(i10)).n(f10);
            }
            if (d0.e.h()) {
                d0.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f94337s != null) {
            if (d0.e.h()) {
                d0.e.b("BaseLayer#setProgress.inout");
            }
            this.f94337s.n(f10);
            if (d0.e.h()) {
                d0.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f94338t != null) {
            if (d0.e.h()) {
                d0.e.b("BaseLayer#setProgress.matte");
            }
            this.f94338t.M(f10);
            if (d0.e.h()) {
                d0.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (d0.e.h()) {
            d0.e.b("BaseLayer#setProgress.animations." + this.f94341w.size());
        }
        for (int i11 = 0; i11 < this.f94341w.size(); i11++) {
            ((g0.a) this.f94341w.get(i11)).n(f10);
        }
        if (d0.e.h()) {
            d0.e.c("BaseLayer#setProgress.animations." + this.f94341w.size());
            d0.e.c("BaseLayer#setProgress");
        }
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        this.f94342x.c(obj, cVar);
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f94327i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f94333o.set(matrix);
        if (z10) {
            List list = this.f94340v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f94333o.preConcat(((b) this.f94340v.get(size)).f94342x.f());
                }
            } else {
                b bVar = this.f94339u;
                if (bVar != null) {
                    this.f94333o.preConcat(bVar.f94342x.f());
                }
            }
        }
        this.f94333o.preConcat(this.f94342x.f());
    }

    @Override // g0.a.b
    public void f() {
        F();
    }

    @Override // f0.c
    public String getName() {
        return this.f94335q.j();
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        Paint paint;
        Integer num;
        d0.e.b(this.f94332n);
        if (!this.f94343y || this.f94335q.y()) {
            d0.e.c(this.f94332n);
            return;
        }
        s();
        if (d0.e.h()) {
            d0.e.b("Layer#parentMatrix");
        }
        this.f94320b.reset();
        this.f94320b.set(matrix);
        for (int size = this.f94340v.size() - 1; size >= 0; size--) {
            this.f94320b.preConcat(((b) this.f94340v.get(size)).f94342x.f());
        }
        if (d0.e.h()) {
            d0.e.c("Layer#parentMatrix");
        }
        g0.a aVarH = this.f94342x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (num = (Integer) aVarH.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == l0.h.NORMAL) {
            this.f94320b.preConcat(this.f94342x.f());
            if (d0.e.h()) {
                d0.e.b("Layer#drawLayer");
            }
            u(canvas, this.f94320b, iIntValue, dVar);
            if (d0.e.h()) {
                d0.e.c("Layer#drawLayer");
            }
            G(d0.e.c(this.f94332n));
            return;
        }
        if (d0.e.h()) {
            d0.e.b("Layer#computeBounds");
        }
        d(this.f94327i, this.f94320b, false);
        E(this.f94327i, matrix);
        this.f94320b.preConcat(this.f94342x.f());
        D(this.f94327i, this.f94320b);
        this.f94328j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f94321c);
        if (!this.f94321c.isIdentity()) {
            Matrix matrix2 = this.f94321c;
            matrix2.invert(matrix2);
            this.f94321c.mapRect(this.f94328j);
        }
        if (!this.f94327i.intersect(this.f94328j)) {
            this.f94327i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (d0.e.h()) {
            d0.e.c("Layer#computeBounds");
        }
        if (this.f94327i.width() >= 1.0f && this.f94327i.height() >= 1.0f) {
            if (d0.e.h()) {
                d0.e.b("Layer#saveLayer");
            }
            this.f94322d.setAlpha(255);
            PaintCompat.setBlendMode(this.f94322d, w().g());
            q0.p.n(canvas, this.f94327i, this.f94322d);
            if (d0.e.h()) {
                d0.e.c("Layer#saveLayer");
            }
            if (w() != l0.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.D == null) {
                    e0.a aVar = new e0.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f94327i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (d0.e.h()) {
                d0.e.b("Layer#drawLayer");
            }
            u(canvas, this.f94320b, iIntValue, dVar);
            if (d0.e.h()) {
                d0.e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f94320b);
            }
            if (C()) {
                if (d0.e.h()) {
                    d0.e.b("Layer#drawMatte");
                    d0.e.b("Layer#saveLayer");
                }
                q0.p.o(canvas, this.f94327i, this.f94325g, 19);
                if (d0.e.h()) {
                    d0.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f94338t.h(canvas, matrix, i10, null);
                if (d0.e.h()) {
                    d0.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (d0.e.h()) {
                    d0.e.c("Layer#restoreLayer");
                    d0.e.c("Layer#drawMatte");
                }
            }
            if (d0.e.h()) {
                d0.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (d0.e.h()) {
                d0.e.c("Layer#restoreLayer");
            }
        }
        if (this.f94344z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f94327i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f94327i, this.A);
        }
        G(d0.e.c(this.f94332n));
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        b bVar = this.f94338t;
        if (bVar != null) {
            j0.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f94338t.getName(), i10)) {
                list.add(eVarA.i(this.f94338t));
            }
            if (eVar.g(this.f94338t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f94338t.I(eVar, eVar.e(this.f94338t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void j(g0.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f94341w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar);

    public l0.h w() {
        return this.f94335q.a();
    }

    public l0.a x() {
        return this.f94335q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    public j z() {
        return this.f94335q.d();
    }

    @Override // f0.c
    public void g(List list, List list2) {
    }

    void I(j0.e eVar, int i10, List list, j0.e eVar2) {
    }
}
