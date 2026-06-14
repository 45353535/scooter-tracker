package a1;

import a1.b;
import a1.e;
import a1.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes6.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet f3616i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a1.g f3619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0004h f3620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f3621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f3622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f3623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.q f3624h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f3627c;

        static {
            int[] iArr = new int[g.e0.d.values().length];
            f3627c = iArr;
            try {
                iArr[g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3627c[g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3627c[g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[g.e0.c.values().length];
            f3626b = iArr2;
            try {
                iArr2[g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3626b[g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3626b[g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f3625a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3625a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3625a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3625a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3625a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3625a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3625a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3625a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements g.x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f3630c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3635h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3628a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f3631d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3632e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3633f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3634g = -1;

        b(g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.c(this);
            if (this.f3635h) {
                this.f3631d.b((c) this.f3628a.get(this.f3634g));
                this.f3628a.set(this.f3634g, this.f3631d);
                this.f3635h = false;
            }
            c cVar = this.f3631d;
            if (cVar != null) {
                this.f3628a.add(cVar);
            }
        }

        List a() {
            return this.f3628a;
        }

        @Override // a1.g.x
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f3632e = true;
            this.f3633f = false;
            c cVar = this.f3631d;
            h.h(cVar.f3637a, cVar.f3638b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f3633f = true;
            this.f3635h = false;
        }

        @Override // a1.g.x
        public void close() {
            this.f3628a.add(this.f3631d);
            lineTo(this.f3629b, this.f3630c);
            this.f3635h = true;
        }

        @Override // a1.g.x
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f3633f || this.f3632e) {
                this.f3631d.a(f10, f11);
                this.f3628a.add(this.f3631d);
                this.f3632e = false;
            }
            this.f3631d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f3635h = false;
        }

        @Override // a1.g.x
        public void lineTo(float f10, float f11) {
            this.f3631d.a(f10, f11);
            this.f3628a.add(this.f3631d);
            h hVar = h.this;
            c cVar = this.f3631d;
            this.f3631d = hVar.new c(f10, f11, f10 - cVar.f3637a, f11 - cVar.f3638b);
            this.f3635h = false;
        }

        @Override // a1.g.x
        public void moveTo(float f10, float f11) {
            if (this.f3635h) {
                this.f3631d.b((c) this.f3628a.get(this.f3634g));
                this.f3628a.set(this.f3634g, this.f3631d);
                this.f3635h = false;
            }
            c cVar = this.f3631d;
            if (cVar != null) {
                this.f3628a.add(cVar);
            }
            this.f3629b = f10;
            this.f3630c = f11;
            this.f3631d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f3634g = this.f3628a.size();
        }

        @Override // a1.g.x
        public void quadTo(float f10, float f11, float f12, float f13) {
            this.f3631d.a(f10, f11);
            this.f3628a.add(this.f3631d);
            this.f3631d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f3635h = false;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f3637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f3640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3641e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f3639c = 0.0f;
            this.f3640d = 0.0f;
            this.f3637a = f10;
            this.f3638b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f3639c = (float) (((double) f12) / dSqrt);
                this.f3640d = (float) (((double) f13) / dSqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f3637a;
            float f13 = f11 - this.f3638b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f3639c;
            if (f12 != (-f14) || f13 != (-this.f3640d)) {
                this.f3639c = f14 + f12;
                this.f3640d += f13;
            } else {
                this.f3641e = true;
                this.f3639c = -f13;
                this.f3640d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f3639c;
            float f11 = this.f3639c;
            if (f10 == (-f11)) {
                float f12 = cVar.f3640d;
                if (f12 == (-this.f3640d)) {
                    this.f3641e = true;
                    this.f3639c = -f12;
                    this.f3640d = cVar.f3639c;
                    return;
                }
            }
            this.f3639c = f11 + f10;
            this.f3640d += cVar.f3640d;
        }

        public String toString() {
            return "(" + this.f3637a + StringUtils.COMMA + this.f3638b + " " + this.f3639c + StringUtils.COMMA + this.f3640d + ")";
        }
    }

    private class d implements g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f3643a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3645c;

        d(g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.c(this);
        }

        Path a() {
            return this.f3643a;
        }

        @Override // a1.g.x
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f3644b, this.f3645c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f3644b = f13;
            this.f3645c = f14;
        }

        @Override // a1.g.x
        public void close() {
            this.f3643a.close();
        }

        @Override // a1.g.x
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f3643a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f3644b = f14;
            this.f3645c = f15;
        }

        @Override // a1.g.x
        public void lineTo(float f10, float f11) {
            this.f3643a.lineTo(f10, f11);
            this.f3644b = f10;
            this.f3645c = f11;
        }

        @Override // a1.g.x
        public void moveTo(float f10, float f11) {
            this.f3643a.moveTo(f10, f11);
            this.f3644b = f10;
            this.f3645c = f11;
        }

        @Override // a1.g.x
        public void quadTo(float f10, float f11, float f12, float f13) {
            this.f3643a.quadTo(f10, f11, f12, f13);
            this.f3644b = f12;
            this.f3645c = f13;
        }
    }

    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f3647e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f3647e = path;
        }

        @Override // a1.h.f, a1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f3620d.f3657b) {
                    str2 = str;
                    h.this.f3617a.drawTextOnPath(str2, this.f3647e, this.f3649b, this.f3650c, h.this.f3620d.f3659d);
                } else {
                    str2 = str;
                }
                if (h.this.f3620d.f3658c) {
                    h.this.f3617a.drawTextOnPath(str2, this.f3647e, this.f3649b, this.f3650c, h.this.f3620d.f3660e);
                }
            } else {
                str2 = str;
            }
            this.f3649b += h.this.f3620d.f3659d.measureText(str2);
        }
    }

    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3650c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f3649b = f10;
            this.f3650c = f11;
        }

        @Override // a1.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f3620d.f3657b) {
                    h.this.f3617a.drawText(str, this.f3649b, this.f3650c, h.this.f3620d.f3659d);
                }
                if (h.this.f3620d.f3658c) {
                    h.this.f3617a.drawText(str, this.f3649b, this.f3650c, h.this.f3620d.f3660e);
                }
            }
            this.f3649b += h.this.f3620d.f3659d.measureText(str);
        }
    }

    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f3654d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f3652b = f10;
            this.f3653c = f11;
            this.f3654d = path;
        }

        @Override // a1.h.j
        public boolean a(g.y0 y0Var) {
            if (!(y0Var instanceof g.z0)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // a1.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f3620d.f3659d.getTextPath(str2, 0, str.length(), this.f3652b, this.f3653c, path);
                this.f3654d.addPath(path);
            } else {
                str2 = str;
            }
            this.f3652b += h.this.f3620d.f3659d.measureText(str2);
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f3667d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f3667d = new RectF();
            this.f3665b = f10;
            this.f3666c = f11;
        }

        @Override // a1.h.j
        public boolean a(g.y0 y0Var) {
            if (!(y0Var instanceof g.z0)) {
                return true;
            }
            g.z0 z0Var = (g.z0) y0Var;
            g.n0 n0VarR = y0Var.f3559a.r(z0Var.f3613o);
            if (n0VarR == null) {
                h.F("TextPath path reference '%s' not found", z0Var.f3613o);
                return false;
            }
            g.v vVar = (g.v) n0VarR;
            Path pathA = h.this.new d(vVar.f3596o).a();
            Matrix matrix = vVar.f3548n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            RectF rectF = new RectF();
            pathA.computeBounds(rectF, true);
            this.f3667d.union(rectF);
            return false;
        }

        @Override // a1.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f3620d.f3659d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f3665b, this.f3666c);
                this.f3667d.union(rectF);
            }
            this.f3665b += h.this.f3620d.f3659d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f10) {
        this.f3617a = canvas;
        this.f3618b = f10;
    }

    private boolean A() {
        Boolean bool = this.f3620d.f3656a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(g.n0 n0Var) {
        if (n0Var instanceof g.t) {
            return;
        }
        S0();
        u(n0Var);
        if (n0Var instanceof g.f0) {
            x0((g.f0) n0Var);
        } else if (n0Var instanceof g.e1) {
            E0((g.e1) n0Var);
        } else if (n0Var instanceof g.s0) {
            B0((g.s0) n0Var);
        } else if (n0Var instanceof g.m) {
            q0((g.m) n0Var);
        } else if (n0Var instanceof g.o) {
            r0((g.o) n0Var);
        } else if (n0Var instanceof g.v) {
            t0((g.v) n0Var);
        } else if (n0Var instanceof g.b0) {
            w0((g.b0) n0Var);
        } else if (n0Var instanceof g.d) {
            o0((g.d) n0Var);
        } else if (n0Var instanceof g.i) {
            p0((g.i) n0Var);
        } else if (n0Var instanceof g.q) {
            s0((g.q) n0Var);
        } else if (n0Var instanceof g.a0) {
            v0((g.a0) n0Var);
        } else if (n0Var instanceof g.z) {
            u0((g.z) n0Var);
        } else if (n0Var instanceof g.w0) {
            D0((g.w0) n0Var);
        }
        R0();
    }

    private void B(g.k0 k0Var, Path path) {
        g.o0 o0Var = this.f3620d.f3656a.f3450c;
        if (o0Var instanceof g.u) {
            g.n0 n0VarR = this.f3619c.r(((g.u) o0Var).f3592b);
            if (n0VarR instanceof g.y) {
                L(k0Var, path, (g.y) n0VarR);
                return;
            }
        }
        this.f3617a.drawPath(path, this.f3620d.f3659d);
    }

    private void B0(g.s0 s0Var) {
        y("Switch render", new Object[0]);
        W0(this.f3620d, s0Var);
        if (A()) {
            Matrix matrix = s0Var.f3554o;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            p(s0Var);
            boolean zM0 = m0();
            K0(s0Var);
            if (zM0) {
                j0(s0Var);
            }
            U0(s0Var);
        }
    }

    private void C(Path path) {
        C0004h c0004h = this.f3620d;
        if (c0004h.f3656a.M != g.e0.i.NonScalingStroke) {
            this.f3617a.drawPath(path, c0004h.f3660e);
            return;
        }
        Matrix matrix = this.f3617a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f3617a.setMatrix(new Matrix());
        Shader shader = this.f3620d.f3660e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f3617a.drawPath(path2, this.f3620d.f3660e);
        this.f3617a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(g.t0 t0Var, g.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f3420c == 0.0f || bVar.f3421d == 0.0f) {
            return;
        }
        a1.e eVar = t0Var.f3569o;
        if (eVar == null) {
            eVar = a1.e.f3377e;
        }
        W0(this.f3620d, t0Var);
        C0004h c0004h = this.f3620d;
        c0004h.f3661f = bVar;
        if (!c0004h.f3656a.f3470w.booleanValue()) {
            g.b bVar2 = this.f3620d.f3661f;
            O0(bVar2.f3418a, bVar2.f3419b, bVar2.f3420c, bVar2.f3421d);
        }
        g.b bVar3 = t0Var.f3585p;
        if (bVar3 != null) {
            this.f3617a.concat(o(this.f3620d.f3661f, bVar3, eVar));
            this.f3620d.f3662g = t0Var.f3585p;
        } else {
            Canvas canvas = this.f3617a;
            g.b bVar4 = this.f3620d.f3661f;
            canvas.translate(bVar4.f3418a, bVar4.f3419b);
        }
        boolean zM0 = m0();
        F0(t0Var, true);
        if (zM0) {
            j0(t0Var);
        }
        U0(t0Var);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(g.w0 w0Var) {
        y("Text render", new Object[0]);
        W0(this.f3620d, w0Var);
        if (A()) {
            Matrix matrix = w0Var.f3603s;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            List list = w0Var.f3414o;
            float f10 = 0.0f;
            float fE = (list == null || list.size() == 0) ? 0.0f : ((g.p) w0Var.f3414o.get(0)).e(this);
            List list2 = w0Var.f3415p;
            float f11 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.p) w0Var.f3415p.get(0)).f(this);
            List list3 = w0Var.f3416q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.p) w0Var.f3416q.get(0)).e(this);
            List list4 = w0Var.f3417r;
            if (list4 != null && list4.size() != 0) {
                f10 = ((g.p) w0Var.f3417r.get(0)).f(this);
            }
            g.e0.f fVarO = O();
            if (fVarO != g.e0.f.Start) {
                float fN = n(w0Var);
                if (fVarO == g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            if (w0Var.f3547h == null) {
                i iVar = new i(fE, f11);
                E(w0Var, iVar);
                RectF rectF = iVar.f3667d;
                w0Var.f3547h = new g.b(rectF.left, rectF.top, rectF.width(), iVar.f3667d.height());
            }
            U0(w0Var);
            r(w0Var);
            p(w0Var);
            boolean zM0 = m0();
            E(w0Var, new f(fE + fE2, f11 + f10));
            if (zM0) {
                j0(w0Var);
            }
        }
    }

    private void E(g.y0 y0Var, j jVar) {
        if (A()) {
            Iterator it = y0Var.f3523i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                g.n0 n0Var = (g.n0) it.next();
                if (n0Var instanceof g.c1) {
                    jVar.b(T0(((g.c1) n0Var).f3432c, z10, !it.hasNext()));
                } else {
                    l0(n0Var, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(g.e1 e1Var) {
        y("Use render", new Object[0]);
        g.p pVar = e1Var.f3512s;
        if (pVar == null || !pVar.j()) {
            g.p pVar2 = e1Var.f3513t;
            if (pVar2 == null || !pVar2.j()) {
                W0(this.f3620d, e1Var);
                if (A()) {
                    g.n0 n0VarR = e1Var.f3559a.r(e1Var.f3509p);
                    if (n0VarR == null) {
                        F("Use reference '%s' not found", e1Var.f3509p);
                        return;
                    }
                    Matrix matrix = e1Var.f3554o;
                    if (matrix != null) {
                        this.f3617a.concat(matrix);
                    }
                    g.p pVar3 = e1Var.f3510q;
                    float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
                    g.p pVar4 = e1Var.f3511r;
                    this.f3617a.translate(fE, pVar4 != null ? pVar4.f(this) : 0.0f);
                    p(e1Var);
                    boolean zM0 = m0();
                    i0(e1Var);
                    if (n0VarR instanceof g.f0) {
                        g.b bVarF0 = f0(null, null, e1Var.f3512s, e1Var.f3513t);
                        S0();
                        y0((g.f0) n0VarR, bVarF0);
                        R0();
                    } else if (n0VarR instanceof g.t0) {
                        g.p pVar5 = e1Var.f3512s;
                        if (pVar5 == null) {
                            pVar5 = new g.p(100.0f, g.d1.percent);
                        }
                        g.p pVar6 = e1Var.f3513t;
                        if (pVar6 == null) {
                            pVar6 = new g.p(100.0f, g.d1.percent);
                        }
                        g.b bVarF02 = f0(null, null, pVar5, pVar6);
                        S0();
                        C0((g.t0) n0VarR, bVarF02);
                        R0();
                    } else {
                        A0(n0VarR);
                    }
                    h0();
                    if (zM0) {
                        j0(e1Var);
                    }
                    U0(e1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(g.j0 j0Var, boolean z10) {
        if (z10) {
            i0(j0Var);
        }
        Iterator it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            A0((g.n0) it.next());
        }
        if (z10) {
            h0();
        }
    }

    private void G(g.y0 y0Var, StringBuilder sb2) {
        Iterator it = y0Var.f3523i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            g.n0 n0Var = (g.n0) it.next();
            if (n0Var instanceof g.y0) {
                G((g.y0) n0Var, sb2);
            } else if (n0Var instanceof g.c1) {
                sb2.append(T0(((g.c1) n0Var).f3432c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(g.j jVar, String str) {
        g.n0 n0VarR = jVar.f3559a.r(str);
        if (n0VarR == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarR instanceof g.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarR == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g.j jVar2 = (g.j) n0VarR;
        if (jVar.f3539i == null) {
            jVar.f3539i = jVar2.f3539i;
        }
        if (jVar.f3540j == null) {
            jVar.f3540j = jVar2.f3540j;
        }
        if (jVar.f3541k == null) {
            jVar.f3541k = jVar2.f3541k;
        }
        if (jVar.f3538h.isEmpty()) {
            jVar.f3538h = jVar2.f3538h;
        }
        try {
            if (jVar instanceof g.m0) {
                I((g.m0) jVar, (g.m0) n0VarR);
            } else {
                J((g.q0) jVar, (g.q0) n0VarR);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f3542l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H0(a1.g.r r12, a1.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.H0(a1.g$r, a1.h$c):void");
    }

    private void I(g.m0 m0Var, g.m0 m0Var2) {
        if (m0Var.f3555m == null) {
            m0Var.f3555m = m0Var2.f3555m;
        }
        if (m0Var.f3556n == null) {
            m0Var.f3556n = m0Var2.f3556n;
        }
        if (m0Var.f3557o == null) {
            m0Var.f3557o = m0Var2.f3557o;
        }
        if (m0Var.f3558p == null) {
            m0Var.f3558p = m0Var2.f3558p;
        }
    }

    private void I0(g.l lVar) {
        g.r rVar;
        g.r rVar2;
        g.r rVar3;
        int size;
        g.e0 e0Var = this.f3620d.f3656a;
        String str = e0Var.f3472y;
        if (str == null && e0Var.f3473z == null && e0Var.A == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            g.n0 n0VarR = lVar.f3559a.r(str);
            if (n0VarR != null) {
                rVar = (g.r) n0VarR;
            } else {
                F("Marker reference '%s' not found", this.f3620d.f3656a.f3472y);
                rVar = null;
            }
        }
        String str2 = this.f3620d.f3656a.f3473z;
        if (str2 == null) {
            rVar2 = null;
        } else {
            g.n0 n0VarR2 = lVar.f3559a.r(str2);
            if (n0VarR2 != null) {
                rVar2 = (g.r) n0VarR2;
            } else {
                F("Marker reference '%s' not found", this.f3620d.f3656a.f3473z);
                rVar2 = null;
            }
        }
        String str3 = this.f3620d.f3656a.A;
        if (str3 == null) {
            rVar3 = null;
        } else {
            g.n0 n0VarR3 = lVar.f3559a.r(str3);
            if (n0VarR3 != null) {
                rVar3 = (g.r) n0VarR3;
            } else {
                F("Marker reference '%s' not found", this.f3620d.f3656a.A);
                rVar3 = null;
            }
        }
        List listA = lVar instanceof g.v ? new b(((g.v) lVar).f3596o).a() : lVar instanceof g.q ? k((g.q) lVar) : l((g.z) lVar);
        if (listA == null || (size = listA.size()) == 0) {
            return;
        }
        g.e0 e0Var2 = this.f3620d.f3656a;
        e0Var2.A = null;
        e0Var2.f3473z = null;
        e0Var2.f3472y = null;
        if (rVar != null) {
            H0(rVar, (c) listA.get(0));
        }
        if (rVar2 != null && listA.size() > 2) {
            c cVarN0 = (c) listA.get(0);
            c cVar = (c) listA.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = (c) listA.get(i10);
                cVarN0 = cVar.f3641e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(rVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            H0(rVar3, (c) listA.get(size - 1));
        }
    }

    private void J(g.q0 q0Var, g.q0 q0Var2) {
        if (q0Var.f3574m == null) {
            q0Var.f3574m = q0Var2.f3574m;
        }
        if (q0Var.f3575n == null) {
            q0Var.f3575n = q0Var2.f3575n;
        }
        if (q0Var.f3576o == null) {
            q0Var.f3576o = q0Var2.f3576o;
        }
        if (q0Var.f3577p == null) {
            q0Var.f3577p = q0Var2.f3577p;
        }
        if (q0Var.f3578q == null) {
            q0Var.f3578q = q0Var2.f3578q;
        }
    }

    private void J0(g.s sVar, g.k0 k0Var, g.b bVar) {
        float fE;
        float f10;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f3586o;
        if (bool == null || !bool.booleanValue()) {
            g.p pVar = sVar.f3590s;
            float fD = pVar != null ? pVar.d(this, 1.0f) : 1.2f;
            g.p pVar2 = sVar.f3591t;
            float fD2 = pVar2 != null ? pVar2.d(this, 1.0f) : 1.2f;
            fE = fD * bVar.f3420c;
            f10 = fD2 * bVar.f3421d;
        } else {
            g.p pVar3 = sVar.f3590s;
            fE = pVar3 != null ? pVar3.e(this) : bVar.f3420c;
            g.p pVar4 = sVar.f3591t;
            f10 = pVar4 != null ? pVar4.f(this) : bVar.f3421d;
        }
        if (fE == 0.0f || f10 == 0.0f) {
            return;
        }
        S0();
        C0004h c0004hM = M(sVar);
        this.f3620d = c0004hM;
        c0004hM.f3656a.f3461n = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f3617a.save();
        Boolean bool2 = sVar.f3587p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f3617a.translate(bVar.f3418a, bVar.f3419b);
            this.f3617a.scale(bVar.f3420c, bVar.f3421d);
        }
        F0(sVar, false);
        this.f3617a.restore();
        if (zM0) {
            k0(k0Var, bVar);
        }
        R0();
    }

    private void K(g.y yVar, String str) {
        g.n0 n0VarR = yVar.f3559a.r(str);
        if (n0VarR == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarR instanceof g.y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarR == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        g.y yVar2 = (g.y) n0VarR;
        if (yVar.f3604q == null) {
            yVar.f3604q = yVar2.f3604q;
        }
        if (yVar.f3605r == null) {
            yVar.f3605r = yVar2.f3605r;
        }
        if (yVar.f3606s == null) {
            yVar.f3606s = yVar2.f3606s;
        }
        if (yVar.f3607t == null) {
            yVar.f3607t = yVar2.f3607t;
        }
        if (yVar.f3608u == null) {
            yVar.f3608u = yVar2.f3608u;
        }
        if (yVar.f3609v == null) {
            yVar.f3609v = yVar2.f3609v;
        }
        if (yVar.f3610w == null) {
            yVar.f3610w = yVar2.f3610w;
        }
        if (yVar.f3523i.isEmpty()) {
            yVar.f3523i = yVar2.f3523i;
        }
        if (yVar.f3585p == null) {
            yVar.f3585p = yVar2.f3585p;
        }
        if (yVar.f3569o == null) {
            yVar.f3569o = yVar2.f3569o;
        }
        String str2 = yVar2.f3611x;
        if (str2 != null) {
            K(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(g.s0 s0Var) {
        Set systemLanguage;
        String language = Locale.getDefault().getLanguage();
        a1.g.k();
        for (g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof g.g0) {
                g.g0 g0Var = (g.g0) n0Var;
                if (g0Var.getRequiredExtensions() == null && ((systemLanguage = g0Var.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set requiredFeatures = g0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f3616i == null) {
                            V();
                        }
                        if (requiredFeatures.isEmpty() || !f3616i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set requiredFormats = g0Var.getRequiredFormats();
                    if (requiredFormats != null) {
                        requiredFormats.isEmpty();
                    } else {
                        Set requiredFonts = g0Var.getRequiredFonts();
                        if (requiredFonts == null) {
                            A0(n0Var);
                            return;
                        }
                        requiredFonts.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L(a1.g.k0 r23, android.graphics.Path r24, a1.g.y r25) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.L(a1.g$k0, android.graphics.Path, a1.g$y):void");
    }

    private void L0(g.z0 z0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f3620d, z0Var);
        if (A() && Y0()) {
            g.n0 n0VarR = z0Var.f3559a.r(z0Var.f3613o);
            if (n0VarR == null) {
                F("TextPath reference '%s' not found", z0Var.f3613o);
                return;
            }
            g.v vVar = (g.v) n0VarR;
            Path pathA = new d(vVar.f3596o).a();
            Matrix matrix = vVar.f3548n;
            if (matrix != null) {
                pathA.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathA, false);
            g.p pVar = z0Var.f3614p;
            float fD = pVar != null ? pVar.d(this, pathMeasure.getLength()) : 0.0f;
            g.e0.f fVarO = O();
            if (fVarO != g.e0.f.Start) {
                float fN = n(z0Var);
                if (fVarO == g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fD -= fN;
            }
            r((g.k0) z0Var.getTextRoot());
            boolean zM0 = m0();
            E(z0Var, new e(pathA, fD, 0.0f));
            if (zM0) {
                j0(z0Var);
            }
        }
    }

    private C0004h M(g.n0 n0Var) {
        C0004h c0004h = new C0004h();
        V0(c0004h, g.e0.a());
        return N(n0Var, c0004h);
    }

    private boolean M0() {
        return this.f3620d.f3656a.f3461n.floatValue() < 1.0f || this.f3620d.f3656a.H != null;
    }

    private C0004h N(g.n0 n0Var, C0004h c0004h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof g.l0) {
                arrayList.add(0, (g.l0) n0Var);
            }
            Object obj = n0Var.f3560b;
            if (obj == null) {
                break;
            }
            n0Var = (g.n0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0004h, (g.l0) it.next());
        }
        C0004h c0004h2 = this.f3620d;
        c0004h.f3662g = c0004h2.f3662g;
        c0004h.f3661f = c0004h2.f3661f;
        return c0004h;
    }

    private void N0() {
        this.f3620d = new C0004h();
        this.f3621e = new Stack();
        V0(this.f3620d, g.e0.a());
        C0004h c0004h = this.f3620d;
        c0004h.f3661f = null;
        c0004h.f3663h = false;
        this.f3621e.push(new C0004h(c0004h));
        this.f3623g = new Stack();
        this.f3622f = new Stack();
    }

    private g.e0.f O() {
        g.e0.f fVar;
        g.e0 e0Var = this.f3620d.f3656a;
        if (e0Var.f3468u == g.e0.h.LTR || (fVar = e0Var.f3469v) == g.e0.f.Middle) {
            return e0Var.f3469v;
        }
        g.e0.f fVar2 = g.e0.f.Start;
        return fVar == fVar2 ? g.e0.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float fE = f12 + f10;
        float f14 = f13 + f11;
        g.c cVar = this.f3620d.f3656a.f3471x;
        if (cVar != null) {
            f10 += cVar.f3431d.e(this);
            f11 += this.f3620d.f3656a.f3471x.f3428a.f(this);
            fE -= this.f3620d.f3656a.f3471x.f3429b.e(this);
            f14 -= this.f3620d.f3656a.f3471x.f3430c.f(this);
        }
        this.f3617a.clipRect(f10, f11, fE, f14);
    }

    private Path.FillType P() {
        g.e0.a aVar = this.f3620d.f3656a.G;
        return (aVar == null || aVar != g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0004h c0004h, boolean z10, g.o0 o0Var) {
        int i10;
        g.e0 e0Var = c0004h.f3656a;
        float fFloatValue = (z10 ? e0Var.f3452e : e0Var.f3454g).floatValue();
        if (o0Var instanceof g.f) {
            i10 = ((g.f) o0Var).f3516b;
        } else if (!(o0Var instanceof g.C0003g)) {
            return;
        } else {
            i10 = c0004h.f3656a.f3462o.f3516b;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0004h.f3659d.setColor(iX);
        } else {
            c0004h.f3660e.setColor(iX);
        }
    }

    private void Q0(boolean z10, g.c0 c0Var) {
        if (z10) {
            if (W(c0Var.f3551e, 2147483648L)) {
                C0004h c0004h = this.f3620d;
                g.e0 e0Var = c0004h.f3656a;
                g.o0 o0Var = c0Var.f3551e.I;
                e0Var.f3450c = o0Var;
                c0004h.f3657b = o0Var != null;
            }
            if (W(c0Var.f3551e, 4294967296L)) {
                this.f3620d.f3656a.f3452e = c0Var.f3551e.J;
            }
            if (W(c0Var.f3551e, 6442450944L)) {
                C0004h c0004h2 = this.f3620d;
                P0(c0004h2, z10, c0004h2.f3656a.f3450c);
                return;
            }
            return;
        }
        if (W(c0Var.f3551e, 2147483648L)) {
            C0004h c0004h3 = this.f3620d;
            g.e0 e0Var2 = c0004h3.f3656a;
            g.o0 o0Var2 = c0Var.f3551e.I;
            e0Var2.f3453f = o0Var2;
            c0004h3.f3658c = o0Var2 != null;
        }
        if (W(c0Var.f3551e, 4294967296L)) {
            this.f3620d.f3656a.f3454g = c0Var.f3551e.J;
        }
        if (W(c0Var.f3551e, 6442450944L)) {
            C0004h c0004h4 = this.f3620d;
            P0(c0004h4, z10, c0004h4.f3656a.f3453f);
        }
    }

    private void R0() {
        this.f3617a.restore();
        this.f3620d = (C0004h) this.f3621e.pop();
    }

    private void S0() {
        this.f3617a.save();
        this.f3621e.push(this.f3620d);
        this.f3620d = new C0004h(this.f3620d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f3620d.f3663h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.e0.a aVar = this.f3620d.f3656a.f3451d;
        return (aVar == null || aVar != g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(g.k0 k0Var) {
        if (k0Var.f3560b == null || k0Var.f3547h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f3623g.peek()).invert(matrix)) {
            g.b bVar = k0Var.f3547h;
            float f10 = bVar.f3418a;
            float f11 = bVar.f3419b;
            float fB = bVar.b();
            g.b bVar2 = k0Var.f3547h;
            float f12 = bVar2.f3419b;
            float fB2 = bVar2.b();
            float fC = k0Var.f3547h.c();
            g.b bVar3 = k0Var.f3547h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, bVar3.f3418a, bVar3.c()};
            matrix.preConcat(this.f3617a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            g.k0 k0Var2 = (g.k0) this.f3622f.peek();
            g.b bVar4 = k0Var2.f3547h;
            if (bVar4 == null) {
                k0Var2.f3547h = g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet hashSet = new HashSet();
        f3616i = hashSet;
        hashSet.add("Structure");
        f3616i.add("BasicStructure");
        f3616i.add("ConditionalProcessing");
        f3616i.add("Image");
        f3616i.add("Style");
        f3616i.add("ViewportAttribute");
        f3616i.add("Shape");
        f3616i.add("BasicText");
        f3616i.add("PaintAttribute");
        f3616i.add("BasicPaintAttribute");
        f3616i.add("OpacityAttribute");
        f3616i.add("BasicGraphicsAttribute");
        f3616i.add("Marker");
        f3616i.add("Gradient");
        f3616i.add("Pattern");
        f3616i.add("Clip");
        f3616i.add("BasicClip");
        f3616i.add("Mask");
        f3616i.add("View");
    }

    private void V0(C0004h c0004h, g.e0 e0Var) {
        if (W(e0Var, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            c0004h.f3656a.f3462o = e0Var.f3462o;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            c0004h.f3656a.f3461n = e0Var.f3461n;
        }
        if (W(e0Var, 1L)) {
            c0004h.f3656a.f3450c = e0Var.f3450c;
            g.o0 o0Var = e0Var.f3450c;
            c0004h.f3657b = (o0Var == null || o0Var == g.f.f3515d) ? false : true;
        }
        if (W(e0Var, 4L)) {
            c0004h.f3656a.f3452e = e0Var.f3452e;
        }
        if (W(e0Var, 6149L)) {
            P0(c0004h, true, c0004h.f3656a.f3450c);
        }
        if (W(e0Var, 2L)) {
            c0004h.f3656a.f3451d = e0Var.f3451d;
        }
        if (W(e0Var, 8L)) {
            c0004h.f3656a.f3453f = e0Var.f3453f;
            g.o0 o0Var2 = e0Var.f3453f;
            c0004h.f3658c = (o0Var2 == null || o0Var2 == g.f.f3515d) ? false : true;
        }
        if (W(e0Var, 16L)) {
            c0004h.f3656a.f3454g = e0Var.f3454g;
        }
        if (W(e0Var, 6168L)) {
            P0(c0004h, false, c0004h.f3656a.f3453f);
        }
        if (W(e0Var, 34359738368L)) {
            c0004h.f3656a.M = e0Var.M;
        }
        if (W(e0Var, 32L)) {
            g.e0 e0Var2 = c0004h.f3656a;
            g.p pVar = e0Var.f3455h;
            e0Var2.f3455h = pVar;
            c0004h.f3660e.setStrokeWidth(pVar.c(this));
        }
        if (W(e0Var, 64L)) {
            c0004h.f3656a.f3456i = e0Var.f3456i;
            int i10 = a.f3626b[e0Var.f3456i.ordinal()];
            if (i10 == 1) {
                c0004h.f3660e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0004h.f3660e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0004h.f3660e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e0Var, 128L)) {
            c0004h.f3656a.f3457j = e0Var.f3457j;
            int i11 = a.f3627c[e0Var.f3457j.ordinal()];
            if (i11 == 1) {
                c0004h.f3660e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0004h.f3660e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0004h.f3660e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e0Var, 256L)) {
            c0004h.f3656a.f3458k = e0Var.f3458k;
            c0004h.f3660e.setStrokeMiter(e0Var.f3458k.floatValue());
        }
        if (W(e0Var, 512L)) {
            c0004h.f3656a.f3459l = e0Var.f3459l;
        }
        if (W(e0Var, 1024L)) {
            c0004h.f3656a.f3460m = e0Var.f3460m;
        }
        Typeface typefaceT = null;
        if (W(e0Var, 1536L)) {
            g.p[] pVarArr = c0004h.f3656a.f3459l;
            if (pVarArr == null) {
                c0004h.f3660e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fC = c0004h.f3656a.f3459l[i13 % length].c(this);
                    fArr[i13] = fC;
                    f10 += fC;
                }
                if (f10 == 0.0f) {
                    c0004h.f3660e.setPathEffect(null);
                } else {
                    float fC2 = c0004h.f3656a.f3460m.c(this);
                    if (fC2 < 0.0f) {
                        fC2 = (fC2 % f10) + f10;
                    }
                    c0004h.f3660e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e0Var, 16384L)) {
            float fQ = Q();
            c0004h.f3656a.f3464q = e0Var.f3464q;
            c0004h.f3659d.setTextSize(e0Var.f3464q.d(this, fQ));
            c0004h.f3660e.setTextSize(e0Var.f3464q.d(this, fQ));
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            c0004h.f3656a.f3463p = e0Var.f3463p;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (e0Var.f3465r.intValue() == -1 && c0004h.f3656a.f3465r.intValue() > 100) {
                g.e0 e0Var3 = c0004h.f3656a;
                e0Var3.f3465r = Integer.valueOf(e0Var3.f3465r.intValue() - 100);
            } else if (e0Var.f3465r.intValue() != 1 || c0004h.f3656a.f3465r.intValue() >= 900) {
                c0004h.f3656a.f3465r = e0Var.f3465r;
            } else {
                g.e0 e0Var4 = c0004h.f3656a;
                e0Var4.f3465r = Integer.valueOf(e0Var4.f3465r.intValue() + 100);
            }
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            c0004h.f3656a.f3466s = e0Var.f3466s;
        }
        if (W(e0Var, 106496L)) {
            if (c0004h.f3656a.f3463p != null && this.f3619c != null) {
                a1.g.k();
                for (String str : c0004h.f3656a.f3463p) {
                    g.e0 e0Var5 = c0004h.f3656a;
                    typefaceT = t(str, e0Var5.f3465r, e0Var5.f3466s);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                g.e0 e0Var6 = c0004h.f3656a;
                typefaceT = t("serif", e0Var6.f3465r, e0Var6.f3466s);
            }
            c0004h.f3659d.setTypeface(typefaceT);
            c0004h.f3660e.setTypeface(typefaceT);
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            c0004h.f3656a.f3467t = e0Var.f3467t;
            Paint paint = c0004h.f3659d;
            g.e0.EnumC0002g enumC0002g = e0Var.f3467t;
            g.e0.EnumC0002g enumC0002g2 = g.e0.EnumC0002g.LineThrough;
            paint.setStrikeThruText(enumC0002g == enumC0002g2);
            Paint paint2 = c0004h.f3659d;
            g.e0.EnumC0002g enumC0002g3 = e0Var.f3467t;
            g.e0.EnumC0002g enumC0002g4 = g.e0.EnumC0002g.Underline;
            paint2.setUnderlineText(enumC0002g3 == enumC0002g4);
            c0004h.f3660e.setStrikeThruText(e0Var.f3467t == enumC0002g2);
            c0004h.f3660e.setUnderlineText(e0Var.f3467t == enumC0002g4);
        }
        if (W(e0Var, 68719476736L)) {
            c0004h.f3656a.f3468u = e0Var.f3468u;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            c0004h.f3656a.f3469v = e0Var.f3469v;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            c0004h.f3656a.f3470w = e0Var.f3470w;
        }
        if (W(e0Var, 2097152L)) {
            c0004h.f3656a.f3472y = e0Var.f3472y;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            c0004h.f3656a.f3473z = e0Var.f3473z;
        }
        if (W(e0Var, 8388608L)) {
            c0004h.f3656a.A = e0Var.A;
        }
        if (W(e0Var, 16777216L)) {
            c0004h.f3656a.B = e0Var.B;
        }
        if (W(e0Var, 33554432L)) {
            c0004h.f3656a.C = e0Var.C;
        }
        if (W(e0Var, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            c0004h.f3656a.f3471x = e0Var.f3471x;
        }
        if (W(e0Var, 268435456L)) {
            c0004h.f3656a.F = e0Var.F;
        }
        if (W(e0Var, 536870912L)) {
            c0004h.f3656a.G = e0Var.G;
        }
        if (W(e0Var, 1073741824L)) {
            c0004h.f3656a.H = e0Var.H;
        }
        if (W(e0Var, 67108864L)) {
            c0004h.f3656a.D = e0Var.D;
        }
        if (W(e0Var, 134217728L)) {
            c0004h.f3656a.E = e0Var.E;
        }
        if (W(e0Var, 8589934592L)) {
            c0004h.f3656a.K = e0Var.K;
        }
        if (W(e0Var, 17179869184L)) {
            c0004h.f3656a.L = e0Var.L;
        }
        if (W(e0Var, 137438953472L)) {
            c0004h.f3656a.N = e0Var.N;
        }
    }

    private boolean W(g.e0 e0Var, long j10) {
        return (j10 & e0Var.f3449b) != 0;
    }

    private void W0(C0004h c0004h, g.l0 l0Var) {
        c0004h.f3656a.b(l0Var.f3560b == null);
        g.e0 e0Var = l0Var.f3551e;
        if (e0Var != null) {
            V0(c0004h, e0Var);
        }
        if (this.f3619c.n()) {
            for (b.p pVar : this.f3619c.d()) {
                if (a1.b.l(this.f3624h, pVar.f3356a, l0Var)) {
                    V0(c0004h, pVar.f3357b);
                }
            }
        }
        g.e0 e0Var2 = l0Var.f3552f;
        if (e0Var2 != null) {
            V0(c0004h, e0Var2);
        }
    }

    private void X(boolean z10, g.b bVar, g.m0 m0Var) {
        float fD;
        float f10;
        float fD2;
        float f11;
        String str = m0Var.f3542l;
        if (str != null) {
            H(m0Var, str);
        }
        Boolean bool = m0Var.f3539i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0004h c0004h = this.f3620d;
        Paint paint = z10 ? c0004h.f3659d : c0004h.f3660e;
        if (z11) {
            g.b bVarS = S();
            g.p pVar = m0Var.f3555m;
            float fE = pVar != null ? pVar.e(this) : 0.0f;
            g.p pVar2 = m0Var.f3556n;
            fD = pVar2 != null ? pVar2.f(this) : 0.0f;
            g.p pVar3 = m0Var.f3557o;
            float fE2 = pVar3 != null ? pVar3.e(this) : bVarS.f3420c;
            g.p pVar4 = m0Var.f3558p;
            f11 = fE2;
            f10 = fE;
            fD2 = pVar4 != null ? pVar4.f(this) : 0.0f;
        } else {
            g.p pVar5 = m0Var.f3555m;
            float fD3 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.0f;
            g.p pVar6 = m0Var.f3556n;
            fD = pVar6 != null ? pVar6.d(this, 1.0f) : 0.0f;
            g.p pVar7 = m0Var.f3557o;
            float fD4 = pVar7 != null ? pVar7.d(this, 1.0f) : 1.0f;
            g.p pVar8 = m0Var.f3558p;
            f10 = fD3;
            fD2 = pVar8 != null ? pVar8.d(this, 1.0f) : 0.0f;
            f11 = fD4;
        }
        float f12 = fD;
        S0();
        this.f3620d = M(m0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f3418a, bVar.f3419b);
            matrix.preScale(bVar.f3420c, bVar.f3421d);
        }
        Matrix matrix2 = m0Var.f3540j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f3538h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f3620d.f3657b = false;
                return;
            } else {
                this.f3620d.f3658c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m0Var.f3538h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.d0 d0Var = (g.d0) ((g.n0) it.next());
            Float f14 = d0Var.f3437h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f3620d, d0Var);
            g.e0 e0Var = this.f3620d.f3656a;
            g.f fVar = (g.f) e0Var.D;
            if (fVar == null) {
                fVar = g.f.f3514c;
            }
            iArr[i10] = x(fVar.f3516b, e0Var.E.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f12 == fD2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.k kVar = m0Var.f3541k;
        if (kVar != null) {
            if (kVar == g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f12, f11, fD2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f3620d.f3656a.f3452e.floatValue()));
    }

    private void X0() {
        int iX;
        g.e0 e0Var = this.f3620d.f3656a;
        g.o0 o0Var = e0Var.K;
        if (o0Var instanceof g.f) {
            iX = ((g.f) o0Var).f3516b;
        } else if (!(o0Var instanceof g.C0003g)) {
            return;
        } else {
            iX = e0Var.f3462o.f3516b;
        }
        Float f10 = e0Var.L;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f3617a.drawColor(iX);
    }

    private Path Y(g.d dVar) {
        g.p pVar = dVar.f3434o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        g.p pVar2 = dVar.f3435p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        float fC = dVar.f3436q.c(this);
        float f11 = fE - fC;
        float f12 = f10 - fC;
        float f13 = fE + fC;
        float f14 = f10 + fC;
        if (dVar.f3547h == null) {
            float f15 = 2.0f * fC;
            dVar.f3547h = new g.b(f11, f12, f15, f15);
        }
        float f16 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f12);
        float f17 = fE + f16;
        float f18 = f10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path.cubicTo(f13, f19, f17, f14, fE, f14);
        float f20 = fE - f16;
        path.cubicTo(f20, f14, f11, f19, f11, f10);
        path.cubicTo(f11, f18, f20, f12, fE, f12);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f3620d.f3656a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(g.i iVar) {
        g.p pVar = iVar.f3529o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        g.p pVar2 = iVar.f3530p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        float fE2 = iVar.f3531q.e(this);
        float f11 = iVar.f3532r.f(this);
        float f12 = fE - fE2;
        float f13 = f10 - f11;
        float f14 = fE + fE2;
        float f15 = f10 + f11;
        if (iVar.f3547h == null) {
            iVar.f3547h = new g.b(f12, f13, fE2 * 2.0f, 2.0f * f11);
        }
        float f16 = fE2 * 0.5522848f;
        float f17 = f11 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f13);
        float f18 = fE + f16;
        float f19 = f10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f10 + f17;
        path.cubicTo(f14, f20, f18, f15, fE, f15);
        float f21 = fE - f16;
        path.cubicTo(f21, f15, f12, f20, f12, f10);
        path.cubicTo(f12, f19, f21, f13, fE, f13);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(g.q qVar) {
        g.p pVar = qVar.f3570o;
        float fE = pVar == null ? 0.0f : pVar.e(this);
        g.p pVar2 = qVar.f3571p;
        float f10 = pVar2 == null ? 0.0f : pVar2.f(this);
        g.p pVar3 = qVar.f3572q;
        float fE2 = pVar3 == null ? 0.0f : pVar3.e(this);
        g.p pVar4 = qVar.f3573r;
        float f11 = pVar4 != null ? pVar4.f(this) : 0.0f;
        if (qVar.f3547h == null) {
            qVar.f3547h = new g.b(Math.min(fE, fE2), Math.min(f10, f11), Math.abs(fE2 - fE), Math.abs(f11 - f10));
        }
        Path path = new Path();
        path.moveTo(fE, f10);
        path.lineTo(fE2, f11);
        return path;
    }

    private Path b0(g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f3612o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = zVar.f3612o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (zVar instanceof g.a0) {
            path.close();
        }
        if (zVar.f3547h == null) {
            zVar.f3547h = m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path c0(a1.g.b0 r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.c0(a1.g$b0):android.graphics.Path");
    }

    private Path d0(g.w0 w0Var) {
        List list = w0Var.f3414o;
        float f10 = 0.0f;
        float fE = (list == null || list.size() == 0) ? 0.0f : ((g.p) w0Var.f3414o.get(0)).e(this);
        List list2 = w0Var.f3415p;
        float f11 = (list2 == null || list2.size() == 0) ? 0.0f : ((g.p) w0Var.f3415p.get(0)).f(this);
        List list3 = w0Var.f3416q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : ((g.p) w0Var.f3416q.get(0)).e(this);
        List list4 = w0Var.f3417r;
        if (list4 != null && list4.size() != 0) {
            f10 = ((g.p) w0Var.f3417r.get(0)).f(this);
        }
        if (this.f3620d.f3656a.f3469v != g.e0.f.Start) {
            float fN = n(w0Var);
            if (this.f3620d.f3656a.f3469v == g.e0.f.Middle) {
                fN /= 2.0f;
            }
            fE -= fN;
        }
        if (w0Var.f3547h == null) {
            i iVar = new i(fE, f11);
            E(w0Var, iVar);
            RectF rectF = iVar.f3667d;
            w0Var.f3547h = new g.b(rectF.left, rectF.top, rectF.width(), iVar.f3667d.height());
        }
        Path path = new Path();
        E(w0Var, new g(fE + fE2, f11 + f10, path));
        return path;
    }

    private void e0(boolean z10, g.b bVar, g.q0 q0Var) {
        float f10;
        float fD;
        float f11;
        String str = q0Var.f3542l;
        if (str != null) {
            H(q0Var, str);
        }
        Boolean bool = q0Var.f3539i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0004h c0004h = this.f3620d;
        Paint paint = z10 ? c0004h.f3659d : c0004h.f3660e;
        if (z11) {
            g.p pVar = new g.p(50.0f, g.d1.percent);
            g.p pVar2 = q0Var.f3574m;
            float fE = pVar2 != null ? pVar2.e(this) : pVar.e(this);
            g.p pVar3 = q0Var.f3575n;
            float f12 = pVar3 != null ? pVar3.f(this) : pVar.f(this);
            g.p pVar4 = q0Var.f3576o;
            fD = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f10 = fE;
            f11 = f12;
        } else {
            g.p pVar5 = q0Var.f3574m;
            float fD2 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.5f;
            g.p pVar6 = q0Var.f3575n;
            float fD3 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.5f;
            g.p pVar7 = q0Var.f3576o;
            f10 = fD2;
            fD = pVar7 != null ? pVar7.d(this, 1.0f) : 0.5f;
            f11 = fD3;
        }
        S0();
        this.f3620d = M(q0Var);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f3418a, bVar.f3419b);
            matrix.preScale(bVar.f3420c, bVar.f3421d);
        }
        Matrix matrix2 = q0Var.f3540j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f3538h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f3620d.f3657b = false;
                return;
            } else {
                this.f3620d.f3658c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q0Var.f3538h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            g.d0 d0Var = (g.d0) ((g.n0) it.next());
            Float f14 = d0Var.f3437h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f3620d, d0Var);
            g.e0 e0Var = this.f3620d.f3656a;
            g.f fVar = (g.f) e0Var.D;
            if (fVar == null) {
                fVar = g.f.f3514c;
            }
            iArr[i10] = x(fVar.f3516b, e0Var.E.floatValue());
            i10++;
            R0();
        }
        if (fD == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        g.k kVar = q0Var.f3541k;
        if (kVar != null) {
            if (kVar == g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fD, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f3620d.f3656a.f3452e.floatValue()));
    }

    private g.b f0(g.p pVar, g.p pVar2, g.p pVar3, g.p pVar4) {
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        g.b bVarS = S();
        return new g.b(fE, f10, pVar3 != null ? pVar3.e(this) : bVarS.f3420c, pVar4 != null ? pVar4.f(this) : bVarS.f3421d);
    }

    private Path g0(g.k0 k0Var, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f3621e.push(this.f3620d);
        C0004h c0004h = new C0004h(this.f3620d);
        this.f3620d = c0004h;
        W0(c0004h, k0Var);
        if (!A() || !Y0()) {
            this.f3620d = (C0004h) this.f3621e.pop();
            return null;
        }
        if (k0Var instanceof g.e1) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g.e1 e1Var = (g.e1) k0Var;
            g.n0 n0VarR = k0Var.f3559a.r(e1Var.f3509p);
            if (n0VarR == null) {
                F("Use reference '%s' not found", e1Var.f3509p);
                this.f3620d = (C0004h) this.f3621e.pop();
                return null;
            }
            if (!(n0VarR instanceof g.k0)) {
                this.f3620d = (C0004h) this.f3621e.pop();
                return null;
            }
            pathD0 = g0((g.k0) n0VarR, false);
            if (pathD0 == null) {
                return null;
            }
            if (e1Var.f3547h == null) {
                e1Var.f3547h = m(pathD0);
            }
            Matrix matrix = e1Var.f3554o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k0Var instanceof g.l) {
            g.l lVar = (g.l) k0Var;
            if (k0Var instanceof g.v) {
                pathD0 = new d(((g.v) k0Var).f3596o).a();
                if (k0Var.f3547h == null) {
                    k0Var.f3547h = m(pathD0);
                }
            } else {
                pathD0 = k0Var instanceof g.b0 ? c0((g.b0) k0Var) : k0Var instanceof g.d ? Y((g.d) k0Var) : k0Var instanceof g.i ? Z((g.i) k0Var) : k0Var instanceof g.z ? b0((g.z) k0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (lVar.f3547h == null) {
                lVar.f3547h = m(pathD0);
            }
            Matrix matrix2 = lVar.f3548n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k0Var instanceof g.w0)) {
                F("Invalid %s element found in clipPath definition", k0Var.b());
                return null;
            }
            g.w0 w0Var = (g.w0) k0Var;
            pathD0 = d0(w0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f3603s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f3620d.f3656a.F != null && (pathJ = j(k0Var, k0Var.f3547h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f3620d = (C0004h) this.f3621e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, g.x xVar) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            xVar.lineTo(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            xVar.cubicTo(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    private void h0() {
        this.f3622f.pop();
        this.f3623g.pop();
    }

    private static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(g.j0 j0Var) {
        this.f3622f.push(j0Var);
        this.f3623g.push(this.f3617a.getMatrix());
    }

    private Path j(g.k0 k0Var, g.b bVar) {
        Path pathG0;
        g.n0 n0VarR = k0Var.f3559a.r(this.f3620d.f3656a.F);
        if (n0VarR == null) {
            F("ClipPath reference '%s' not found", this.f3620d.f3656a.F);
            return null;
        }
        g.e eVar = (g.e) n0VarR;
        this.f3621e.push(this.f3620d);
        this.f3620d = M(eVar);
        Boolean bool = eVar.f3448p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(bVar.f3418a, bVar.f3419b);
            matrix.preScale(bVar.f3420c, bVar.f3421d);
        }
        Matrix matrix2 = eVar.f3554o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (g.n0 n0Var : eVar.f3523i) {
            if ((n0Var instanceof g.k0) && (pathG0 = g0((g.k0) n0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f3620d.f3656a.F != null) {
            if (eVar.f3547h == null) {
                eVar.f3547h = m(path);
            }
            Path pathJ = j(eVar, eVar.f3547h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f3620d = (C0004h) this.f3621e.pop();
        return path;
    }

    private void j0(g.k0 k0Var) {
        k0(k0Var, k0Var.f3547h);
    }

    private List k(g.q qVar) {
        g.p pVar = qVar.f3570o;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        g.p pVar2 = qVar.f3571p;
        float f10 = pVar2 != null ? pVar2.f(this) : 0.0f;
        g.p pVar3 = qVar.f3572q;
        float fE2 = pVar3 != null ? pVar3.e(this) : 0.0f;
        g.p pVar4 = qVar.f3573r;
        float f11 = pVar4 != null ? pVar4.f(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = fE2 - fE;
        float f13 = f11 - f10;
        arrayList.add(new c(fE, f10, f12, f13));
        arrayList.add(new c(fE2, f11, f12, f13));
        return arrayList;
    }

    private void k0(g.k0 k0Var, g.b bVar) {
        if (this.f3620d.f3656a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f3617a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f3617a.saveLayer(null, paint2, 31);
            g.s sVar = (g.s) this.f3619c.r(this.f3620d.f3656a.H);
            J0(sVar, k0Var, bVar);
            this.f3617a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f3617a.saveLayer(null, paint3, 31);
            J0(sVar, k0Var, bVar);
            this.f3617a.restore();
            this.f3617a.restore();
        }
        R0();
    }

    private List l(g.z zVar) {
        int length = zVar.f3612o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f3612o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = zVar.f3612o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f3637a, f13 - cVar.f3638b);
            f10 = f12;
            f11 = f13;
        }
        if (!(zVar instanceof g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f3612o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f3637a, f15 - cVar.f3638b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(g.n0 n0Var, j jVar) {
        float f10;
        float f11;
        float fE;
        g.e0.f fVarO;
        if (jVar.a((g.y0) n0Var)) {
            if (n0Var instanceof g.z0) {
                S0();
                L0((g.z0) n0Var);
                R0();
                return;
            }
            if (!(n0Var instanceof g.v0)) {
                if (n0Var instanceof g.u0) {
                    S0();
                    g.u0 u0Var = (g.u0) n0Var;
                    W0(this.f3620d, u0Var);
                    if (A()) {
                        r((g.k0) u0Var.getTextRoot());
                        g.n0 n0VarR = n0Var.f3559a.r(u0Var.f3594o);
                        if (n0VarR == null || !(n0VarR instanceof g.y0)) {
                            F("Tref reference '%s' not found", u0Var.f3594o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((g.y0) n0VarR, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            g.v0 v0Var = (g.v0) n0Var;
            W0(this.f3620d, v0Var);
            if (A()) {
                List list = v0Var.f3414o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float f12 = 0.0f;
                if (z11) {
                    float fE2 = !z10 ? ((f) jVar).f3649b : ((g.p) v0Var.f3414o.get(0)).e(this);
                    List list2 = v0Var.f3415p;
                    f11 = (list2 == null || list2.size() == 0) ? ((f) jVar).f3650c : ((g.p) v0Var.f3415p.get(0)).f(this);
                    List list3 = v0Var.f3416q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : ((g.p) v0Var.f3416q.get(0)).e(this);
                    List list4 = v0Var.f3417r;
                    if (list4 != null && list4.size() != 0) {
                        f12 = ((g.p) v0Var.f3417r.get(0)).f(this);
                    }
                    f10 = f12;
                    f12 = fE2;
                } else {
                    f10 = 0.0f;
                    f11 = 0.0f;
                    fE = 0.0f;
                }
                if (z10 && (fVarO = O()) != g.e0.f.Start) {
                    float fN = n(v0Var);
                    if (fVarO == g.e0.f.Middle) {
                        fN /= 2.0f;
                    }
                    f12 -= fN;
                }
                r((g.k0) v0Var.getTextRoot());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f3649b = f12 + fE;
                    fVar.f3650c = f11 + f10;
                }
                boolean zM0 = m0();
                E(v0Var, jVar);
                if (zM0) {
                    j0(v0Var);
                }
            }
            R0();
        }
    }

    private g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        g.n0 n0VarR;
        if (!M0()) {
            return false;
        }
        this.f3617a.saveLayerAlpha(null, w(this.f3620d.f3656a.f3461n.floatValue()), 31);
        this.f3621e.push(this.f3620d);
        C0004h c0004h = new C0004h(this.f3620d);
        this.f3620d = c0004h;
        String str = c0004h.f3656a.H;
        if (str != null && ((n0VarR = this.f3619c.r(str)) == null || !(n0VarR instanceof g.s))) {
            F("Mask reference '%s' not found", this.f3620d.f3656a.H);
            this.f3620d.f3656a.H = null;
        }
        return true;
    }

    private float n(g.y0 y0Var) {
        k kVar = new k(this, null);
        E(y0Var, kVar);
        return kVar.f3670b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f3639c, cVar2.f3640d, cVar2.f3637a - cVar.f3637a, cVar2.f3638b - cVar.f3638b);
        if (fD == 0.0f) {
            fD = D(cVar2.f3639c, cVar2.f3640d, cVar3.f3637a - cVar2.f3637a, cVar3.f3638b - cVar2.f3638b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f3639c > 0.0f || cVar2.f3640d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f3639c = -cVar2.f3639c;
        cVar2.f3640d = -cVar2.f3640d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Matrix o(a1.g.b r10, a1.g.b r11, a1.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            a1.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f3420c
            float r2 = r11.f3420c
            float r1 = r1 / r2
            float r2 = r10.f3421d
            float r3 = r11.f3421d
            float r2 = r2 / r3
            float r3 = r11.f3418a
            float r3 = -r3
            float r4 = r11.f3419b
            float r4 = -r4
            a1.e r5 = a1.e.f3376d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f3418a
            float r10 = r10.f3419b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            a1.e$b r5 = r12.b()
            a1.e$b r6 = a1.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f3420c
            float r2 = r2 / r1
            float r5 = r10.f3421d
            float r5 = r5 / r1
            int[] r6 = a1.h.a.f3625a
            a1.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f3420c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f3420c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            a1.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f3421d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f3421d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f3418a
            float r10 = r10.f3419b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.o(a1.g$b, a1.g$b, a1.e):android.graphics.Matrix");
    }

    private void o0(g.d dVar) {
        y("Circle render", new Object[0]);
        g.p pVar = dVar.f3436q;
        if (pVar == null || pVar.j()) {
            return;
        }
        W0(this.f3620d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f3548n;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f3620d.f3657b) {
                B(dVar, pathY);
            }
            if (this.f3620d.f3658c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    private void p(g.k0 k0Var) {
        q(k0Var, k0Var.f3547h);
    }

    private void p0(g.i iVar) {
        y("Ellipse render", new Object[0]);
        g.p pVar = iVar.f3531q;
        if (pVar == null || iVar.f3532r == null || pVar.j() || iVar.f3532r.j()) {
            return;
        }
        W0(this.f3620d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f3548n;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f3620d.f3657b) {
                B(iVar, pathZ);
            }
            if (this.f3620d.f3658c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    private void q(g.k0 k0Var, g.b bVar) {
        Path pathJ;
        if (this.f3620d.f3656a.F == null || (pathJ = j(k0Var, bVar)) == null) {
            return;
        }
        this.f3617a.clipPath(pathJ);
    }

    private void q0(g.m mVar) {
        y("Group render", new Object[0]);
        W0(this.f3620d, mVar);
        if (A()) {
            Matrix matrix = mVar.f3554o;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            p(mVar);
            boolean zM0 = m0();
            F0(mVar, true);
            if (zM0) {
                j0(mVar);
            }
            U0(mVar);
        }
    }

    private void r(g.k0 k0Var) {
        g.o0 o0Var = this.f3620d.f3656a.f3450c;
        if (o0Var instanceof g.u) {
            z(true, k0Var.f3547h, (g.u) o0Var);
        }
        g.o0 o0Var2 = this.f3620d.f3656a.f3453f;
        if (o0Var2 instanceof g.u) {
            z(false, k0Var.f3547h, (g.u) o0Var2);
        }
    }

    private void r0(g.o oVar) {
        g.p pVar;
        String str;
        y("Image render", new Object[0]);
        g.p pVar2 = oVar.f3564s;
        if (pVar2 == null || pVar2.j() || (pVar = oVar.f3565t) == null || pVar.j() || (str = oVar.f3561p) == null) {
            return;
        }
        a1.e eVar = oVar.f3569o;
        if (eVar == null) {
            eVar = a1.e.f3377e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            a1.g.k();
            return;
        }
        g.b bVar = new g.b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f3620d, oVar);
        if (A() && Y0()) {
            Matrix matrix = oVar.f3566u;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            g.p pVar3 = oVar.f3562q;
            float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
            g.p pVar4 = oVar.f3563r;
            this.f3620d.f3661f = new g.b(fE, pVar4 != null ? pVar4.f(this) : 0.0f, oVar.f3564s.e(this), oVar.f3565t.e(this));
            if (!this.f3620d.f3656a.f3470w.booleanValue()) {
                g.b bVar2 = this.f3620d.f3661f;
                O0(bVar2.f3418a, bVar2.f3419b, bVar2.f3420c, bVar2.f3421d);
            }
            oVar.f3547h = this.f3620d.f3661f;
            U0(oVar);
            p(oVar);
            boolean zM0 = m0();
            X0();
            this.f3617a.save();
            this.f3617a.concat(o(this.f3620d.f3661f, bVar, eVar));
            this.f3617a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f3620d.f3656a.N != g.e0.e.optimizeSpeed ? 2 : 0));
            this.f3617a.restore();
            if (zM0) {
                j0(oVar);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(g.q qVar) {
        y("Line render", new Object[0]);
        W0(this.f3620d, qVar);
        if (A() && Y0() && this.f3620d.f3658c) {
            Matrix matrix = qVar.f3548n;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            Path pathA0 = a0(qVar);
            U0(qVar);
            r(qVar);
            p(qVar);
            boolean zM0 = m0();
            C(pathA0);
            I0(qVar);
            if (zM0) {
                j0(qVar);
            }
        }
    }

    private Typeface t(String str, Integer num, g.e0.b bVar) {
        int i10;
        boolean z10 = bVar == g.e0.b.Italic;
        i10 = num.intValue() > 500 ? z10 ? 3 : 1 : z10 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    private void t0(g.v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f3596o == null) {
            return;
        }
        W0(this.f3620d, vVar);
        if (A() && Y0()) {
            C0004h c0004h = this.f3620d;
            if (c0004h.f3658c || c0004h.f3657b) {
                Matrix matrix = vVar.f3548n;
                if (matrix != null) {
                    this.f3617a.concat(matrix);
                }
                Path pathA = new d(vVar.f3596o).a();
                if (vVar.f3547h == null) {
                    vVar.f3547h = m(pathA);
                }
                U0(vVar);
                r(vVar);
                p(vVar);
                boolean zM0 = m0();
                if (this.f3620d.f3657b) {
                    pathA.setFillType(U());
                    B(vVar, pathA);
                }
                if (this.f3620d.f3658c) {
                    C(pathA);
                }
                I0(vVar);
                if (zM0) {
                    j0(vVar);
                }
            }
        }
    }

    private void u(g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof g.l0) && (bool = ((g.l0) n0Var).f3550d) != null) {
            this.f3620d.f3663h = bool.booleanValue();
        }
    }

    private void u0(g.z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f3620d, zVar);
        if (A() && Y0()) {
            C0004h c0004h = this.f3620d;
            if (c0004h.f3658c || c0004h.f3657b) {
                Matrix matrix = zVar.f3548n;
                if (matrix != null) {
                    this.f3617a.concat(matrix);
                }
                if (zVar.f3612o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                pathB0.setFillType(U());
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f3620d.f3657b) {
                    B(zVar, pathB0);
                }
                if (this.f3620d.f3658c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(g.a0 a0Var) {
        y("Polygon render", new Object[0]);
        W0(this.f3620d, a0Var);
        if (A() && Y0()) {
            C0004h c0004h = this.f3620d;
            if (c0004h.f3658c || c0004h.f3657b) {
                Matrix matrix = a0Var.f3548n;
                if (matrix != null) {
                    this.f3617a.concat(matrix);
                }
                if (a0Var.f3612o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a0Var);
                U0(a0Var);
                r(a0Var);
                p(a0Var);
                boolean zM0 = m0();
                if (this.f3620d.f3657b) {
                    B(a0Var, pathB0);
                }
                if (this.f3620d.f3658c) {
                    C(pathB0);
                }
                I0(a0Var);
                if (zM0) {
                    j0(a0Var);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(g.b0 b0Var) {
        y("Rect render", new Object[0]);
        g.p pVar = b0Var.f3424q;
        if (pVar == null || b0Var.f3425r == null || pVar.j() || b0Var.f3425r.j()) {
            return;
        }
        W0(this.f3620d, b0Var);
        if (A() && Y0()) {
            Matrix matrix = b0Var.f3548n;
            if (matrix != null) {
                this.f3617a.concat(matrix);
            }
            Path pathC0 = c0(b0Var);
            U0(b0Var);
            r(b0Var);
            p(b0Var);
            boolean zM0 = m0();
            if (this.f3620d.f3657b) {
                B(b0Var, pathC0);
            }
            if (this.f3620d.f3658c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b0Var);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    private void x0(g.f0 f0Var) {
        z0(f0Var, f0(f0Var.f3517q, f0Var.f3518r, f0Var.f3519s, f0Var.f3520t), f0Var.f3585p, f0Var.f3569o);
    }

    private void y0(g.f0 f0Var, g.b bVar) {
        z0(f0Var, bVar, f0Var.f3585p, f0Var.f3569o);
    }

    private void z(boolean z10, g.b bVar, g.u uVar) {
        g.n0 n0VarR = this.f3619c.r(uVar.f3592b);
        if (n0VarR == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", uVar.f3592b);
            g.o0 o0Var = uVar.f3593c;
            if (o0Var != null) {
                P0(this.f3620d, z10, o0Var);
                return;
            } else if (z10) {
                this.f3620d.f3657b = false;
                return;
            } else {
                this.f3620d.f3658c = false;
                return;
            }
        }
        if (n0VarR instanceof g.m0) {
            X(z10, bVar, (g.m0) n0VarR);
        } else if (n0VarR instanceof g.q0) {
            e0(z10, bVar, (g.q0) n0VarR);
        } else if (n0VarR instanceof g.c0) {
            Q0(z10, (g.c0) n0VarR);
        }
    }

    private void z0(g.f0 f0Var, g.b bVar, g.b bVar2, a1.e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f3420c == 0.0f || bVar.f3421d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f3569o) == null) {
            eVar = a1.e.f3377e;
        }
        W0(this.f3620d, f0Var);
        if (A()) {
            C0004h c0004h = this.f3620d;
            c0004h.f3661f = bVar;
            if (!c0004h.f3656a.f3470w.booleanValue()) {
                g.b bVar3 = this.f3620d.f3661f;
                O0(bVar3.f3418a, bVar3.f3419b, bVar3.f3420c, bVar3.f3421d);
            }
            q(f0Var, this.f3620d.f3661f);
            if (bVar2 != null) {
                this.f3617a.concat(o(this.f3620d.f3661f, bVar2, eVar));
                this.f3620d.f3662g = f0Var.f3585p;
            } else {
                Canvas canvas = this.f3617a;
                g.b bVar4 = this.f3620d.f3661f;
                canvas.translate(bVar4.f3418a, bVar4.f3419b);
            }
            boolean zM0 = m0();
            X0();
            F0(f0Var, true);
            if (zM0) {
                j0(f0Var);
            }
            U0(f0Var);
        }
    }

    void G0(a1.g gVar, a1.f fVar) {
        g.b bVar;
        a1.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f3619c = gVar;
        g.f0 f0VarM = gVar.m();
        if (f0VarM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.d()) {
            g.l0 l0VarJ = this.f3619c.j(fVar.f3404e);
            if (l0VarJ == null || !(l0VarJ instanceof g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f3404e));
                return;
            }
            g.f1 f1Var = (g.f1) l0VarJ;
            bVar = f1Var.f3585p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f3404e));
                return;
            }
            eVar = f1Var.f3569o;
        } else {
            bVar = fVar.e() ? fVar.f3403d : f0VarM.f3585p;
            eVar = fVar.b() ? fVar.f3401b : f0VarM.f3569o;
        }
        if (fVar.a()) {
            gVar.a(fVar.f3400a);
        }
        if (fVar.c()) {
            b.q qVar = new b.q();
            this.f3624h = qVar;
            qVar.f3359a = gVar.j(fVar.f3402c);
        }
        N0();
        u(f0VarM);
        S0();
        g.b bVar2 = new g.b(fVar.f3405f);
        g.p pVar = f0VarM.f3519s;
        if (pVar != null) {
            bVar2.f3420c = pVar.d(this, bVar2.f3420c);
        }
        g.p pVar2 = f0VarM.f3520t;
        if (pVar2 != null) {
            bVar2.f3421d = pVar2.d(this, bVar2.f3421d);
        }
        z0(f0VarM, bVar2, bVar, eVar);
        R0();
        if (fVar.a()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f3620d.f3659d.getTextSize();
    }

    float R() {
        return this.f3620d.f3659d.getTextSize() / 2.0f;
    }

    g.b S() {
        C0004h c0004h = this.f3620d;
        g.b bVar = c0004h.f3662g;
        return bVar != null ? bVar : c0004h.f3661f;
    }

    float T() {
        return this.f3618b;
    }

    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3670b;

        private k() {
            super(h.this, null);
            this.f3670b = 0.0f;
        }

        @Override // a1.h.j
        public void b(String str) {
            this.f3670b += h.this.f3620d.f3659d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: a1.h$h, reason: collision with other inner class name */
    private class C0004h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.e0 f3656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f3659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f3660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g.b f3661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        g.b f3662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3663h;

        C0004h() {
            Paint paint = new Paint();
            this.f3659d = paint;
            paint.setFlags(193);
            this.f3659d.setHinting(0);
            this.f3659d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f3659d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f3660e = paint3;
            paint3.setFlags(193);
            this.f3660e.setHinting(0);
            this.f3660e.setStyle(Paint.Style.STROKE);
            this.f3660e.setTypeface(typeface);
            this.f3656a = g.e0.a();
        }

        C0004h(C0004h c0004h) {
            this.f3657b = c0004h.f3657b;
            this.f3658c = c0004h.f3658c;
            this.f3659d = new Paint(c0004h.f3659d);
            this.f3660e = new Paint(c0004h.f3660e);
            g.b bVar = c0004h.f3661f;
            if (bVar != null) {
                this.f3661f = new g.b(bVar);
            }
            g.b bVar2 = c0004h.f3662g;
            if (bVar2 != null) {
                this.f3662g = new g.b(bVar2);
            }
            this.f3663h = c0004h.f3663h;
            try {
                this.f3656a = (g.e0) c0004h.f3656a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f3656a = g.e0.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
