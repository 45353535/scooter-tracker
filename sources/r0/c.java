package r0;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f99208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0.a f99209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Object f99210c;

    public c() {
        this.f99208a = new b();
        this.f99210c = null;
    }

    public Object a(b bVar) {
        return this.f99210c;
    }

    public final Object b(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        return a(this.f99208a.h(f10, f11, obj, obj2, f12, f13, f14));
    }

    public final void c(g0.a aVar) {
        this.f99209b = aVar;
    }

    public c(Object obj) {
        this.f99208a = new b();
        this.f99210c = obj;
    }
}
