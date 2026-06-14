package be;

import io.bidmachine.Function;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f6401b;

    public f() {
        this(new ConcurrentHashMap(), new g());
    }

    @Override // be.e
    public Float a(Object obj, Float f10) {
        return this.f6401b.l(k(obj, f10), f10);
    }

    @Override // be.e
    public float b(Object obj, float f10) {
        return this.f6401b.c(k(obj, Float.valueOf(f10)), f10);
    }

    @Override // be.e
    public /* synthetic */ Float c(Object obj) {
        return d.d(this, obj);
    }

    @Override // be.e
    public /* synthetic */ boolean d(Object obj) {
        return d.a(this, obj);
    }

    @Override // be.e
    public Integer e(Object obj, Integer num) {
        return this.f6401b.k(k(obj, num), num);
    }

    @Override // be.e
    public /* synthetic */ int f(Object obj) {
        return d.e(this, obj);
    }

    @Override // be.e
    public int g(Object obj, int i10) {
        return this.f6401b.j(k(obj, Integer.valueOf(i10)), i10);
    }

    @Override // be.e
    public /* synthetic */ Object h(Object obj, Function function) {
        return d.h(this, obj, function);
    }

    @Override // be.e
    public /* synthetic */ Object i(Object obj, Object obj2, Function function) {
        return d.i(this, obj, obj2, function);
    }

    @Override // be.e
    public String j(Object obj, String str) {
        return this.f6401b.f(k(obj, str), str);
    }

    @Override // be.e
    public Object k(Object obj, Object obj2) {
        return t(obj) ? u().get(obj) : obj2;
    }

    @Override // be.e
    public /* synthetic */ String l(Object obj) {
        return d.j(this, obj);
    }

    @Override // be.e
    public boolean m(Object obj, boolean z10) {
        return this.f6401b.g(k(obj, Boolean.valueOf(z10)), z10);
    }

    @Override // be.e
    public /* synthetic */ Integer n(Object obj) {
        return d.f(this, obj);
    }

    @Override // be.e
    public Boolean o(Object obj, Boolean bool) {
        return this.f6401b.h(k(obj, bool), bool);
    }

    @Override // be.e
    public /* synthetic */ Object p(Object obj) {
        return d.g(this, obj);
    }

    @Override // be.e
    public /* synthetic */ float q(Object obj) {
        return d.c(this, obj);
    }

    @Override // be.e
    public /* synthetic */ Boolean r(Object obj) {
        return d.b(this, obj);
    }

    public void s() {
        u().clear();
    }

    public boolean t(Object obj) {
        return u().containsKey(obj);
    }

    public Map u() {
        return this.f6400a;
    }

    public void v(Map map) {
        s();
        if (map != null) {
            u().putAll(map);
        }
    }

    public f(Map map, c cVar) {
        this.f6400a = map;
        this.f6401b = cVar;
    }
}
