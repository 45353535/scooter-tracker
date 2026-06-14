package a1;

import a1.b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f3406g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f0 f3407a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3408b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3409c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3410d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.r f3411e = new b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f3412f = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3413a;

        static {
            int[] iArr = new int[d1.values().length];
            f3413a = iArr;
            try {
                iArr[d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3413a[d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3413a[d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3413a[d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3413a[d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3413a[d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3413a[d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3413a[d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3413a[d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class a0 extends z {
        a0() {
        }

        @Override // a1.g.z, a1.g.n0
        String b() {
            return "polygon";
        }
    }

    static abstract class a1 extends y0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f3414o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f3415p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f3416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f3417r;

        a1() {
        }
    }

    static class b0 extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3422o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3423p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3424q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3425r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3426s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3427t;

        b0() {
        }

        @Override // a1.g.n0
        String b() {
            return "rect";
        }
    }

    interface b1 {
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        p f3428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        p f3429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        p f3430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p f3431d;

        c(p pVar, p pVar2, p pVar3, p pVar4) {
            this.f3428a = pVar;
            this.f3429b = pVar2;
            this.f3430c = pVar3;
            this.f3431d = pVar4;
        }
    }

    static class c1 extends n0 implements x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f3432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b1 f3433d;

        c1(String str) {
            this.f3432c = str;
        }

        @Override // a1.g.x0
        public b1 getTextRoot() {
            return this.f3433d;
        }

        public String toString() {
            return "TextChild: '" + this.f3432c + "'";
        }
    }

    static class d extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3434o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3435p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3436q;

        d() {
        }

        @Override // a1.g.n0
        String b() {
            return "circle";
        }
    }

    enum d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class e extends m implements t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f3448p;

        e() {
        }

        @Override // a1.g.m, a1.g.n0
        String b() {
            return "clipPath";
        }
    }

    static class e0 implements Cloneable {
        String A;
        Boolean B;
        Boolean C;
        o0 D;
        Float E;
        String F;
        a G;
        String H;
        o0 I;
        Float J;
        o0 K;
        Float L;
        i M;
        e N;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f3449b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o0 f3450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f3451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Float f3452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        o0 f3453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Float f3454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        p f3455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        c f3456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        d f3457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Float f3458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        p[] f3459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f3460m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Float f3461n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        f f3462o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f3463p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Integer f3465r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        b f3466s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        EnumC0002g f3467t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        h f3468u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        f f3469v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Boolean f3470w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        c f3471x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f3472y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f3473z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: a1.g$e0$g, reason: collision with other inner class name */
        public enum EnumC0002g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        e0() {
        }

        static e0 a() {
            e0 e0Var = new e0();
            e0Var.f3449b = -1L;
            f fVar = f.f3514c;
            e0Var.f3450c = fVar;
            a aVar = a.NonZero;
            e0Var.f3451d = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e0Var.f3452e = fValueOf;
            e0Var.f3453f = null;
            e0Var.f3454g = fValueOf;
            e0Var.f3455h = new p(1.0f);
            e0Var.f3456i = c.Butt;
            e0Var.f3457j = d.Miter;
            e0Var.f3458k = Float.valueOf(4.0f);
            e0Var.f3459l = null;
            e0Var.f3460m = new p(0.0f);
            e0Var.f3461n = fValueOf;
            e0Var.f3462o = fVar;
            e0Var.f3463p = null;
            e0Var.f3464q = new p(12.0f, d1.pt);
            e0Var.f3465r = 400;
            e0Var.f3466s = b.Normal;
            e0Var.f3467t = EnumC0002g.None;
            e0Var.f3468u = h.LTR;
            e0Var.f3469v = f.Start;
            Boolean bool = Boolean.TRUE;
            e0Var.f3470w = bool;
            e0Var.f3471x = null;
            e0Var.f3472y = null;
            e0Var.f3473z = null;
            e0Var.A = null;
            e0Var.B = bool;
            e0Var.C = bool;
            e0Var.D = fVar;
            e0Var.E = fValueOf;
            e0Var.F = null;
            e0Var.G = aVar;
            e0Var.H = null;
            e0Var.I = null;
            e0Var.J = fValueOf;
            e0Var.K = null;
            e0Var.L = fValueOf;
            e0Var.M = i.None;
            e0Var.N = e.auto;
            return e0Var;
        }

        void b(boolean z10) {
            Boolean bool = Boolean.TRUE;
            this.B = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f3470w = bool;
            this.f3471x = null;
            this.F = null;
            this.f3461n = Float.valueOf(1.0f);
            this.D = f.f3514c;
            this.E = Float.valueOf(1.0f);
            this.H = null;
            this.I = null;
            this.J = Float.valueOf(1.0f);
            this.K = null;
            this.L = Float.valueOf(1.0f);
            this.M = i.None;
        }

        protected Object clone() {
            e0 e0Var = (e0) super.clone();
            p[] pVarArr = this.f3459l;
            if (pVarArr != null) {
                e0Var.f3459l = (p[]) pVarArr.clone();
            }
            return e0Var;
        }
    }

    static class e1 extends m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f3509p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3510q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3511r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3512s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3513t;

        e1() {
        }

        @Override // a1.g.m, a1.g.n0
        String b() {
            return "use";
        }
    }

    static class f extends o0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f3514c = new f(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final f f3515d = new f(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3516b;

        f(int i10) {
            this.f3516b = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f3516b));
        }
    }

    static class f0 extends r0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f3521u;

        f0() {
        }

        @Override // a1.g.n0
        String b() {
            return "svg";
        }
    }

    static class f1 extends r0 implements t {
        f1() {
        }

        @Override // a1.g.n0
        String b() {
            return MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW;
        }
    }

    /* JADX INFO: renamed from: a1.g$g, reason: collision with other inner class name */
    static class C0003g extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static C0003g f3522b = new C0003g();

        private C0003g() {
        }

        static C0003g a() {
            return f3522b;
        }
    }

    interface g0 {
        String getRequiredExtensions();

        Set getRequiredFeatures();

        Set getRequiredFonts();

        Set getRequiredFormats();

        Set getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set set);

        void setRequiredFonts(Set set);

        void setRequiredFormats(Set set);

        void setSystemLanguage(Set set);
    }

    static class h extends m implements t {
        h() {
        }

        @Override // a1.g.m, a1.g.n0
        String b() {
            return "defs";
        }
    }

    static abstract class h0 extends k0 implements j0, g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f3523i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f3524j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f3525k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f3526l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f3527m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f3528n = null;

        h0() {
        }

        @Override // a1.g.j0
        public void a(n0 n0Var) {
            this.f3523i.add(n0Var);
        }

        @Override // a1.g.j0
        public List getChildren() {
            return this.f3523i;
        }

        @Override // a1.g.g0
        public String getRequiredExtensions() {
            return this.f3525k;
        }

        @Override // a1.g.g0
        public Set getRequiredFeatures() {
            return this.f3524j;
        }

        @Override // a1.g.g0
        public Set getRequiredFonts() {
            return this.f3528n;
        }

        @Override // a1.g.g0
        public Set getRequiredFormats() {
            return this.f3527m;
        }

        @Override // a1.g.g0
        public Set getSystemLanguage() {
            return null;
        }

        @Override // a1.g.g0
        public void setRequiredExtensions(String str) {
            this.f3525k = str;
        }

        @Override // a1.g.g0
        public void setRequiredFeatures(Set set) {
            this.f3524j = set;
        }

        @Override // a1.g.g0
        public void setRequiredFonts(Set set) {
            this.f3528n = set;
        }

        @Override // a1.g.g0
        public void setRequiredFormats(Set set) {
            this.f3527m = set;
        }

        @Override // a1.g.g0
        public void setSystemLanguage(Set set) {
            this.f3526l = set;
        }
    }

    static class i extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3529o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3530p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3531q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3532r;

        i() {
        }

        @Override // a1.g.n0
        String b() {
            return "ellipse";
        }
    }

    static abstract class i0 extends k0 implements g0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set f3533i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f3534j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set f3535k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f3536l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f3537m = null;

        i0() {
        }

        @Override // a1.g.g0
        public String getRequiredExtensions() {
            return this.f3534j;
        }

        @Override // a1.g.g0
        public Set getRequiredFeatures() {
            return this.f3533i;
        }

        @Override // a1.g.g0
        public Set getRequiredFonts() {
            return this.f3537m;
        }

        @Override // a1.g.g0
        public Set getRequiredFormats() {
            return this.f3536l;
        }

        @Override // a1.g.g0
        public Set getSystemLanguage() {
            return this.f3535k;
        }

        @Override // a1.g.g0
        public void setRequiredExtensions(String str) {
            this.f3534j = str;
        }

        @Override // a1.g.g0
        public void setRequiredFeatures(Set set) {
            this.f3533i = set;
        }

        @Override // a1.g.g0
        public void setRequiredFonts(Set set) {
            this.f3537m = set;
        }

        @Override // a1.g.g0
        public void setRequiredFormats(Set set) {
            this.f3536l = set;
        }

        @Override // a1.g.g0
        public void setSystemLanguage(Set set) {
            this.f3535k = set;
        }
    }

    static abstract class j extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f3538h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f3539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f3540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        k f3541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f3542l;

        j() {
        }

        @Override // a1.g.j0
        public void a(n0 n0Var) throws a1.j {
            if (n0Var instanceof d0) {
                this.f3538h.add(n0Var);
                return;
            }
            throw new a1.j("Gradient elements cannot contain " + n0Var + " elements.");
        }

        @Override // a1.g.j0
        public List getChildren() {
            return this.f3538h;
        }
    }

    interface j0 {
        void a(n0 n0Var);

        List getChildren();
    }

    enum k {
        pad,
        reflect,
        repeat
    }

    static abstract class k0 extends l0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        b f3547h = null;

        k0() {
        }
    }

    static abstract class l extends i0 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f3548n;

        l() {
        }

        @Override // a1.g.n
        public void setTransform(Matrix matrix) {
            this.f3548n = matrix;
        }
    }

    static abstract class l0 extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f3549c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f3550d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e0 f3551e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e0 f3552f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f3553g = null;

        l0() {
        }

        public String toString() {
            return b();
        }
    }

    static class m extends h0 implements n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f3554o;

        m() {
        }

        @Override // a1.g.n0
        String b() {
            return "group";
        }

        @Override // a1.g.n
        public void setTransform(Matrix matrix) {
            this.f3554o = matrix;
        }
    }

    static class m0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f3555m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        p f3556n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3557o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3558p;

        m0() {
        }

        @Override // a1.g.n0
        String b() {
            return "linearGradient";
        }
    }

    interface n {
        void setTransform(Matrix matrix);
    }

    static class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f3559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j0 f3560b;

        n0() {
        }

        abstract String b();
    }

    static class o extends p0 implements n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f3561p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3562q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3563r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3564s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3565t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f3566u;

        o() {
        }

        @Override // a1.g.n0
        String b() {
            return "image";
        }

        @Override // a1.g.n
        public void setTransform(Matrix matrix) {
            this.f3566u = matrix;
        }
    }

    static abstract class o0 implements Cloneable {
        o0() {
        }
    }

    static abstract class p0 extends h0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        a1.e f3569o = null;

        p0() {
        }
    }

    static class q extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3570o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3571p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3572q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3573r;

        q() {
        }

        @Override // a1.g.n0
        String b() {
            return "line";
        }
    }

    static class q0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p f3574m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        p f3575n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        p f3576o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3577p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3578q;

        q0() {
        }

        @Override // a1.g.n0
        String b() {
            return "radialGradient";
        }
    }

    static class r extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f3579q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3580r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3581s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3582t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        p f3583u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f3584v;

        r() {
        }

        @Override // a1.g.n0
        String b() {
            return "marker";
        }
    }

    static abstract class r0 extends p0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        b f3585p;

        r0() {
        }
    }

    static class s extends h0 implements t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f3586o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f3587p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        p f3588q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p f3589r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p f3590s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3591t;

        s() {
        }

        @Override // a1.g.n0
        String b() {
            return "mask";
        }
    }

    static class s0 extends m {
        s0() {
        }

        @Override // a1.g.m, a1.g.n0
        String b() {
            return "switch";
        }
    }

    interface t {
    }

    static class t0 extends r0 implements t {
        t0() {
        }

        @Override // a1.g.n0
        String b() {
            return "symbol";
        }
    }

    static class u extends o0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        o0 f3593c;

        u(String str, o0 o0Var) {
            this.f3592b = str;
            this.f3593c = o0Var;
        }

        public String toString() {
            return this.f3592b + " " + this.f3593c;
        }
    }

    static class u0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f3594o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b1 f3595p;

        u0() {
        }

        @Override // a1.g.n0
        String b() {
            return "tref";
        }

        public void c(b1 b1Var) {
            this.f3595p = b1Var;
        }

        @Override // a1.g.x0
        public b1 getTextRoot() {
            return this.f3595p;
        }
    }

    static class v extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        w f3596o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f3597p;

        v() {
        }

        @Override // a1.g.n0
        String b() {
            return "path";
        }
    }

    static class v0 extends a1 implements x0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b1 f3598s;

        v0() {
        }

        @Override // a1.g.n0
        String b() {
            return "tspan";
        }

        public void c(b1 b1Var) {
            this.f3598s = b1Var;
        }

        @Override // a1.g.x0
        public b1 getTextRoot() {
            return this.f3598s;
        }
    }

    static class w implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3600b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3602d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f3599a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f3601c = new float[16];

        w() {
        }

        private void a(byte b10) {
            int i10 = this.f3600b;
            byte[] bArr = this.f3599a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f3599a = bArr2;
            }
            byte[] bArr3 = this.f3599a;
            int i11 = this.f3600b;
            this.f3600b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void b(int i10) {
            float[] fArr = this.f3601c;
            if (fArr.length < this.f3602d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f3601c = fArr2;
            }
        }

        @Override // a1.g.x
        public void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            a((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            b(5);
            float[] fArr = this.f3601c;
            int i10 = this.f3602d;
            int i11 = i10 + 1;
            this.f3602d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f3602d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f3602d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f3602d = i14;
            fArr[i13] = f13;
            this.f3602d = i10 + 5;
            fArr[i14] = f14;
        }

        void c(x xVar) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f3600b; i11++) {
                byte b10 = this.f3599a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f3601c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    xVar.moveTo(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f3601c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    xVar.lineTo(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f3601c;
                    xVar.cubicTo(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f3601c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    xVar.quadTo(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f3601c;
                    xVar.arcTo(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    xVar.close();
                }
            }
        }

        @Override // a1.g.x
        public void close() {
            a((byte) 8);
        }

        @Override // a1.g.x
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            a((byte) 2);
            b(6);
            float[] fArr = this.f3601c;
            int i10 = this.f3602d;
            int i11 = i10 + 1;
            this.f3602d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f3602d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f3602d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f3602d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f3602d = i15;
            fArr[i14] = f14;
            this.f3602d = i10 + 6;
            fArr[i15] = f15;
        }

        boolean d() {
            return this.f3600b == 0;
        }

        @Override // a1.g.x
        public void lineTo(float f10, float f11) {
            a((byte) 1);
            b(2);
            float[] fArr = this.f3601c;
            int i10 = this.f3602d;
            int i11 = i10 + 1;
            this.f3602d = i11;
            fArr[i10] = f10;
            this.f3602d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // a1.g.x
        public void moveTo(float f10, float f11) {
            a((byte) 0);
            b(2);
            float[] fArr = this.f3601c;
            int i10 = this.f3602d;
            int i11 = i10 + 1;
            this.f3602d = i11;
            fArr[i10] = f10;
            this.f3602d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // a1.g.x
        public void quadTo(float f10, float f11, float f12, float f13) {
            a((byte) 3);
            b(4);
            float[] fArr = this.f3601c;
            int i10 = this.f3602d;
            int i11 = i10 + 1;
            this.f3602d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f3602d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f3602d = i13;
            fArr[i12] = f12;
            this.f3602d = i10 + 4;
            fArr[i13] = f13;
        }
    }

    static class w0 extends a1 implements b1, n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f3603s;

        w0() {
        }

        @Override // a1.g.n0
        String b() {
            return "text";
        }

        @Override // a1.g.n
        public void setTransform(Matrix matrix) {
            this.f3603s = matrix;
        }
    }

    interface x {
        void arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void close();

        void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

        void lineTo(float f10, float f11);

        void moveTo(float f10, float f11);

        void quadTo(float f10, float f11, float f12, float f13);
    }

    interface x0 {
        b1 getTextRoot();
    }

    static class y extends r0 implements t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f3604q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f3605r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f3606s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        p f3607t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        p f3608u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        p f3609v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        p f3610w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f3611x;

        y() {
        }

        @Override // a1.g.n0
        String b() {
            return "pattern";
        }
    }

    static abstract class y0 extends h0 {
        y0() {
        }

        @Override // a1.g.h0, a1.g.j0
        public void a(n0 n0Var) throws a1.j {
            if (n0Var instanceof x0) {
                this.f3523i.add(n0Var);
                return;
            }
            throw new a1.j("Text content elements cannot contain " + n0Var + " elements.");
        }
    }

    static class z extends l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f3612o;

        z() {
        }

        @Override // a1.g.n0
        String b() {
            return "polyline";
        }
    }

    static class z0 extends y0 implements x0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f3613o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        p f3614p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b1 f3615q;

        z0() {
        }

        @Override // a1.g.n0
        String b() {
            return "textPath";
        }

        public void c(b1 b1Var) {
            this.f3615q = b1Var;
        }

        @Override // a1.g.x0
        public b1 getTextRoot() {
            return this.f3615q;
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
    }

    private b e(float f10) {
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        d1 d1Var4;
        float fB;
        d1 d1Var5;
        f0 f0Var = this.f3407a;
        p pVar = f0Var.f3519s;
        p pVar2 = f0Var.f3520t;
        if (pVar == null || pVar.j() || (d1Var = pVar.f3568c) == (d1Var2 = d1.percent) || d1Var == (d1Var3 = d1.em) || d1Var == (d1Var4 = d1.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = pVar.b(f10);
        if (pVar2 == null) {
            b bVar = this.f3407a.f3585p;
            fB = bVar != null ? (bVar.f3421d * fB2) / bVar.f3420c : fB2;
        } else {
            if (pVar2.j() || (d1Var5 = pVar2.f3568c) == d1Var2 || d1Var5 == d1Var3 || d1Var5 == d1Var4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = pVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 i(j0 j0Var, String str) {
        l0 l0VarI;
        l0 l0Var = (l0) j0Var;
        if (str.equals(l0Var.f3549c)) {
            return l0Var;
        }
        for (Object obj : j0Var.getChildren()) {
            if (obj instanceof l0) {
                l0 l0Var2 = (l0) obj;
                if (str.equals(l0Var2.f3549c)) {
                    return l0Var2;
                }
                if ((obj instanceof j0) && (l0VarI = i((j0) obj, str)) != null) {
                    return l0VarI;
                }
            }
        }
        return null;
    }

    static a1.i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new a1.k().z(inputStream, f3406g);
    }

    void a(b.r rVar) {
        this.f3411e.b(rVar);
    }

    void b() {
        this.f3411e.e(b.u.RenderOptions);
    }

    List d() {
        return this.f3411e.c();
    }

    public float f() {
        if (this.f3407a != null) {
            return e(this.f3410d).f3421d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        f0 f0Var = this.f3407a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = f0Var.f3585p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f3407a != null) {
            return e(this.f3410d).f3420c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    l0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f3407a.f3549c)) {
            return this.f3407a;
        }
        if (this.f3412f.containsKey(str)) {
            return (l0) this.f3412f.get(str);
        }
        l0 l0VarI = i(this.f3407a, str);
        this.f3412f.put(str, l0VarI);
        return l0VarI;
    }

    f0 m() {
        return this.f3407a;
    }

    boolean n() {
        return !this.f3411e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i10, int i11, a1.f fVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f3405f == null) {
            fVar = fVar == null ? new a1.f() : new a1.f(fVar);
            fVar.g(0.0f, 0.0f, i10, i11);
        }
        new a1.h(canvasBeginRecording, this.f3410d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture q(a1.f fVar) {
        p pVar;
        b bVar = (fVar == null || !fVar.e()) ? this.f3407a.f3585p : fVar.f3403d;
        if (fVar != null && fVar.f()) {
            return p((int) Math.ceil(fVar.f3405f.b()), (int) Math.ceil(fVar.f3405f.c()), fVar);
        }
        f0 f0Var = this.f3407a;
        p pVar2 = f0Var.f3519s;
        if (pVar2 != null) {
            d1 d1Var = pVar2.f3568c;
            d1 d1Var2 = d1.percent;
            if (d1Var != d1Var2 && (pVar = f0Var.f3520t) != null && pVar.f3568c != d1Var2) {
                return p((int) Math.ceil(pVar2.b(this.f3410d)), (int) Math.ceil(this.f3407a.f3520t.b(this.f3410d)), fVar);
            }
        }
        if (pVar2 != null && bVar != null) {
            return p((int) Math.ceil(pVar2.b(this.f3410d)), (int) Math.ceil((bVar.f3421d * r1) / bVar.f3420c), fVar);
        }
        p pVar3 = f0Var.f3520t;
        if (pVar3 == null || bVar == null) {
            return p(512, 512, fVar);
        }
        return p((int) Math.ceil((bVar.f3420c * r1) / bVar.f3421d), (int) Math.ceil(pVar3.b(this.f3410d)), fVar);
    }

    n0 r(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    void s(String str) {
        this.f3409c = str;
    }

    public void t(float f10, float f11, float f12, float f13) {
        f0 f0Var = this.f3407a;
        if (f0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f0Var.f3585p = new b(f10, f11, f12, f13);
    }

    void u(f0 f0Var) {
        this.f3407a = f0Var;
    }

    void v(String str) {
        this.f3408b = str;
    }

    static class p implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d1 f3568c;

        p(float f10, d1 d1Var) {
            this.f3567b = f10;
            this.f3568c = d1Var;
        }

        float a() {
            return this.f3567b;
        }

        float b(float f10) {
            int i10 = a.f3413a[this.f3568c.ordinal()];
            if (i10 == 1) {
                return this.f3567b;
            }
            switch (i10) {
                case 4:
                    return this.f3567b * f10;
                case 5:
                    return (this.f3567b * f10) / 2.54f;
                case 6:
                    return (this.f3567b * f10) / 25.4f;
                case 7:
                    return (this.f3567b * f10) / 72.0f;
                case 8:
                    return (this.f3567b * f10) / 6.0f;
                default:
                    return this.f3567b;
            }
        }

        float c(a1.h hVar) {
            if (this.f3568c != d1.percent) {
                return e(hVar);
            }
            b bVarS = hVar.S();
            if (bVarS == null) {
                return this.f3567b;
            }
            float f10 = bVarS.f3420c;
            if (f10 == bVarS.f3421d) {
                return (this.f3567b * f10) / 100.0f;
            }
            return (this.f3567b * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float d(a1.h hVar, float f10) {
            return this.f3568c == d1.percent ? (this.f3567b * f10) / 100.0f : e(hVar);
        }

        float e(a1.h hVar) {
            switch (a.f3413a[this.f3568c.ordinal()]) {
                case 9:
                    b bVarS = hVar.S();
                    if (bVarS != null) {
                    }
                    break;
            }
            return this.f3567b;
        }

        float f(a1.h hVar) {
            if (this.f3568c != d1.percent) {
                return e(hVar);
            }
            b bVarS = hVar.S();
            return bVarS == null ? this.f3567b : (this.f3567b * bVarS.f3421d) / 100.0f;
        }

        boolean i() {
            return this.f3567b < 0.0f;
        }

        boolean j() {
            return this.f3567b == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f3567b) + this.f3568c;
        }

        p(float f10) {
            this.f3567b = f10;
            this.f3568c = d1.px;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f3418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f3420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f3421d;

        b(float f10, float f11, float f12, float f13) {
            this.f3418a = f10;
            this.f3419b = f11;
            this.f3420c = f12;
            this.f3421d = f13;
        }

        static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f3418a + this.f3420c;
        }

        float c() {
            return this.f3419b + this.f3421d;
        }

        RectF d() {
            return new RectF(this.f3418a, this.f3419b, b(), c());
        }

        void e(b bVar) {
            float f10 = bVar.f3418a;
            if (f10 < this.f3418a) {
                this.f3418a = f10;
            }
            float f11 = bVar.f3419b;
            if (f11 < this.f3419b) {
                this.f3419b = f11;
            }
            if (bVar.b() > b()) {
                this.f3420c = bVar.b() - this.f3418a;
            }
            if (bVar.c() > c()) {
                this.f3421d = bVar.c() - this.f3419b;
            }
        }

        public String toString() {
            return C4240b4.j.f42672d + this.f3418a + " " + this.f3419b + " " + this.f3420c + " " + this.f3421d + C4240b4.j.f42674e;
        }

        b(b bVar) {
            this.f3418a = bVar.f3418a;
            this.f3419b = bVar.f3419b;
            this.f3420c = bVar.f3420c;
            this.f3421d = bVar.f3421d;
        }
    }

    static class c0 extends l0 implements j0 {
        c0() {
        }

        @Override // a1.g.n0
        String b() {
            return "solidColor";
        }

        @Override // a1.g.j0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // a1.g.j0
        public void a(n0 n0Var) {
        }
    }

    static class d0 extends l0 implements j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f3437h;

        d0() {
        }

        @Override // a1.g.n0
        String b() {
            return AtomManager.ATOM_STOP_METHOD_NAME;
        }

        @Override // a1.g.j0
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // a1.g.j0
        public void a(n0 n0Var) {
        }
    }
}
