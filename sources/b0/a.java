package b0;

import b0.b;
import y.e;
import y.i;
import y.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f5780b;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0124a implements b.a {
        @Override // b0.b.a
        public b a(c cVar, i iVar) {
            return new a(cVar, iVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof C0124a;
        }

        public int hashCode() {
            return C0124a.class.hashCode();
        }
    }

    public a(c cVar, i iVar) {
        this.f5779a = cVar;
        this.f5780b = iVar;
    }

    @Override // b0.b
    public void a() {
        i iVar = this.f5780b;
        if (iVar instanceof p) {
            this.f5779a.a(((p) iVar).a());
        } else if (iVar instanceof e) {
            this.f5779a.c(iVar.a());
        }
    }
}
