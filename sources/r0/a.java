package r0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import d0.i;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f99185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f99186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f99187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f99188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f99189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f99190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f99191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f99192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f99193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f99194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f99197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f99198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f99199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f99200p;

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f99193i = -3987645.8f;
        this.f99194j = -3987645.8f;
        this.f99195k = 784923401;
        this.f99196l = 784923401;
        this.f99197m = Float.MIN_VALUE;
        this.f99198n = Float.MIN_VALUE;
        this.f99199o = null;
        this.f99200p = null;
        this.f99185a = iVar;
        this.f99186b = obj;
        this.f99187c = obj2;
        this.f99188d = interpolator;
        this.f99189e = null;
        this.f99190f = null;
        this.f99191g = f10;
        this.f99192h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f99185a == null) {
            return 1.0f;
        }
        if (this.f99198n == Float.MIN_VALUE) {
            if (this.f99192h == null) {
                this.f99198n = 1.0f;
            } else {
                float f10 = f();
                this.f99198n = (float) (((double) f10) + (((double) (this.f99192h.floatValue() - this.f99191g)) / ((double) this.f99185a.e())));
            }
        }
        return this.f99198n;
    }

    public float d() {
        if (this.f99194j == -3987645.8f) {
            this.f99194j = ((Float) this.f99187c).floatValue();
        }
        return this.f99194j;
    }

    public int e() {
        if (this.f99196l == 784923401) {
            this.f99196l = ((Integer) this.f99187c).intValue();
        }
        return this.f99196l;
    }

    public float f() {
        i iVar = this.f99185a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f99197m == Float.MIN_VALUE) {
            this.f99197m = (this.f99191g - iVar.p()) / this.f99185a.e();
        }
        return this.f99197m;
    }

    public float g() {
        if (this.f99193i == -3987645.8f) {
            this.f99193i = ((Float) this.f99186b).floatValue();
        }
        return this.f99193i;
    }

    public int h() {
        if (this.f99195k == 784923401) {
            this.f99195k = ((Integer) this.f99186b).intValue();
        }
        return this.f99195k;
    }

    public boolean i() {
        return this.f99188d == null && this.f99189e == null && this.f99190f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f99186b + ", endValue=" + this.f99187c + ", startFrame=" + this.f99191g + ", endFrame=" + this.f99192h + ", interpolator=" + this.f99188d + '}';
    }

    public a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f99193i = -3987645.8f;
        this.f99194j = -3987645.8f;
        this.f99195k = 784923401;
        this.f99196l = 784923401;
        this.f99197m = Float.MIN_VALUE;
        this.f99198n = Float.MIN_VALUE;
        this.f99199o = null;
        this.f99200p = null;
        this.f99185a = iVar;
        this.f99186b = obj;
        this.f99187c = obj2;
        this.f99188d = null;
        this.f99189e = interpolator;
        this.f99190f = interpolator2;
        this.f99191g = f10;
        this.f99192h = f11;
    }

    protected a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f99193i = -3987645.8f;
        this.f99194j = -3987645.8f;
        this.f99195k = 784923401;
        this.f99196l = 784923401;
        this.f99197m = Float.MIN_VALUE;
        this.f99198n = Float.MIN_VALUE;
        this.f99199o = null;
        this.f99200p = null;
        this.f99185a = iVar;
        this.f99186b = obj;
        this.f99187c = obj2;
        this.f99188d = interpolator;
        this.f99189e = interpolator2;
        this.f99190f = interpolator3;
        this.f99191g = f10;
        this.f99192h = f11;
    }

    public a(Object obj) {
        this.f99193i = -3987645.8f;
        this.f99194j = -3987645.8f;
        this.f99195k = 784923401;
        this.f99196l = 784923401;
        this.f99197m = Float.MIN_VALUE;
        this.f99198n = Float.MIN_VALUE;
        this.f99199o = null;
        this.f99200p = null;
        this.f99185a = null;
        this.f99186b = obj;
        this.f99187c = obj;
        this.f99188d = null;
        this.f99189e = null;
        this.f99190f = null;
        this.f99191g = Float.MIN_VALUE;
        this.f99192h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(Object obj, Object obj2) {
        this.f99193i = -3987645.8f;
        this.f99194j = -3987645.8f;
        this.f99195k = 784923401;
        this.f99196l = 784923401;
        this.f99197m = Float.MIN_VALUE;
        this.f99198n = Float.MIN_VALUE;
        this.f99199o = null;
        this.f99200p = null;
        this.f99185a = null;
        this.f99186b = obj;
        this.f99187c = obj2;
        this.f99188d = null;
        this.f99189e = null;
        this.f99190f = null;
        this.f99191g = Float.MIN_VALUE;
        this.f99192h = Float.valueOf(Float.MAX_VALUE);
    }
}
