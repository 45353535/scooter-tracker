package g0;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public class q extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f72105i;

    public q(r0.c cVar) {
        this(cVar, null);
    }

    @Override // g0.a
    float c() {
        return 1.0f;
    }

    @Override // g0.a
    public Object h() {
        r0.c cVar = this.f72042e;
        Object obj = this.f72105i;
        return cVar.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // g0.a
    Object i(r0.a aVar, float f10) {
        return h();
    }

    @Override // g0.a
    public void l() {
        if (this.f72042e != null) {
            super.l();
        }
    }

    @Override // g0.a
    public void n(float f10) {
        this.f72041d = f10;
    }

    public q(r0.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f72105i = obj;
    }
}
