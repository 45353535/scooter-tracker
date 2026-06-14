package g0;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f72040c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected r0.c f72042e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f72038a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f72039b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f72041d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f72043f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f72044g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f72045h = -1.0f;

    public interface b {
        void f();
    }

    private static final class c implements d {
        private c() {
        }

        @Override // g0.a.d
        public r0.a a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // g0.a.d
        public float b() {
            return 0.0f;
        }

        @Override // g0.a.d
        public boolean c(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // g0.a.d
        public boolean d(float f10) {
            return false;
        }

        @Override // g0.a.d
        public float e() {
            return 1.0f;
        }

        @Override // g0.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d {
        r0.a a();

        float b();

        boolean c(float f10);

        boolean d(float f10);

        float e();

        boolean isEmpty();
    }

    private static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f72046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r0.a f72048c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f72049d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r0.a f72047b = f(0.0f);

        e(List list) {
            this.f72046a = list;
        }

        private r0.a f(float f10) {
            List list = this.f72046a;
            r0.a aVar = (r0.a) list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f72046a.size() - 2; size >= 1; size--) {
                r0.a aVar2 = (r0.a) this.f72046a.get(size);
                if (this.f72047b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (r0.a) this.f72046a.get(0);
        }

        @Override // g0.a.d
        public r0.a a() {
            return this.f72047b;
        }

        @Override // g0.a.d
        public float b() {
            return ((r0.a) this.f72046a.get(0)).f();
        }

        @Override // g0.a.d
        public boolean c(float f10) {
            r0.a aVar = this.f72048c;
            r0.a aVar2 = this.f72047b;
            if (aVar == aVar2 && this.f72049d == f10) {
                return true;
            }
            this.f72048c = aVar2;
            this.f72049d = f10;
            return false;
        }

        @Override // g0.a.d
        public boolean d(float f10) {
            if (this.f72047b.a(f10)) {
                return !this.f72047b.i();
            }
            this.f72047b = f(f10);
            return true;
        }

        @Override // g0.a.d
        public float e() {
            return ((r0.a) this.f72046a.get(r0.size() - 1)).c();
        }

        @Override // g0.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0.a f72050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f72051b = -1.0f;

        f(List list) {
            this.f72050a = (r0.a) list.get(0);
        }

        @Override // g0.a.d
        public r0.a a() {
            return this.f72050a;
        }

        @Override // g0.a.d
        public float b() {
            return this.f72050a.f();
        }

        @Override // g0.a.d
        public boolean c(float f10) {
            if (this.f72051b == f10) {
                return true;
            }
            this.f72051b = f10;
            return false;
        }

        @Override // g0.a.d
        public boolean d(float f10) {
            return !this.f72050a.i();
        }

        @Override // g0.a.d
        public float e() {
            return this.f72050a.c();
        }

        @Override // g0.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List list) {
        this.f72040c = q(list);
    }

    private float g() {
        if (this.f72044g == -1.0f) {
            this.f72044g = this.f72040c.b();
        }
        return this.f72044g;
    }

    private static d q(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f72038a.add(bVar);
    }

    protected r0.a b() {
        if (d0.e.h()) {
            d0.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        r0.a aVarA = this.f72040c.a();
        if (d0.e.h()) {
            d0.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarA;
    }

    float c() {
        if (this.f72045h == -1.0f) {
            this.f72045h = this.f72040c.e();
        }
        return this.f72045h;
    }

    protected float d() {
        Interpolator interpolator;
        r0.a aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f99188d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f72039b) {
            return 0.0f;
        }
        r0.a aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f72041d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f72041d;
    }

    public Object h() {
        float fE = e();
        if (this.f72042e == null && this.f72040c.c(fE) && !p()) {
            return this.f72043f;
        }
        r0.a aVarB = b();
        Interpolator interpolator = aVarB.f99189e;
        Object objI = (interpolator == null || aVarB.f99190f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f99190f.getInterpolation(fE));
        this.f72043f = objI;
        return objI;
    }

    abstract Object i(r0.a aVar, float f10);

    protected Object j(r0.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f72042e != null;
    }

    public void l() {
        if (d0.e.h()) {
            d0.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f72038a.size(); i10++) {
            ((b) this.f72038a.get(i10)).f();
        }
        if (d0.e.h()) {
            d0.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f72039b = true;
    }

    public void n(float f10) {
        if (d0.e.h()) {
            d0.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f72040c.isEmpty()) {
            if (d0.e.h()) {
                d0.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f72041d) {
            if (d0.e.h()) {
                d0.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f72041d = f10;
            if (this.f72040c.d(f10)) {
                l();
            }
            if (d0.e.h()) {
                d0.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(r0.c cVar) {
        r0.c cVar2 = this.f72042e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f72042e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    protected boolean p() {
        return false;
    }
}
