package a1;

import a1.b;
import a1.g;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b.r f3400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f3401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f3402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.b f3403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f3404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.b f3405f;

    public f() {
        this.f3400a = null;
        this.f3401b = null;
        this.f3402c = null;
        this.f3403d = null;
        this.f3404e = null;
        this.f3405f = null;
    }

    public boolean a() {
        b.r rVar = this.f3400a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean b() {
        return this.f3401b != null;
    }

    public boolean c() {
        return this.f3402c != null;
    }

    public boolean d() {
        return this.f3404e != null;
    }

    public boolean e() {
        return this.f3403d != null;
    }

    public boolean f() {
        return this.f3405f != null;
    }

    public f g(float f10, float f11, float f12, float f13) {
        this.f3405f = new g.b(f10, f11, f12, f13);
        return this;
    }

    public f(f fVar) {
        this.f3400a = null;
        this.f3401b = null;
        this.f3402c = null;
        this.f3403d = null;
        this.f3404e = null;
        this.f3405f = null;
        if (fVar == null) {
            return;
        }
        this.f3400a = fVar.f3400a;
        this.f3401b = fVar.f3401b;
        this.f3403d = fVar.f3403d;
        this.f3404e = fVar.f3404e;
        this.f3405f = fVar.f3405f;
    }
}
