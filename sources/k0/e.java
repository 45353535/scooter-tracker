package k0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f85926a;

    public e(List list) {
        this.f85926a = list;
    }

    @Override // k0.o
    public g0.a a() {
        return ((r0.a) this.f85926a.get(0)).i() ? new g0.k(this.f85926a) : new g0.j(this.f85926a);
    }

    @Override // k0.o
    public List b() {
        return this.f85926a;
    }

    @Override // k0.o
    public boolean isStatic() {
        return this.f85926a.size() == 1 && ((r0.a) this.f85926a.get(0)).i();
    }
}
