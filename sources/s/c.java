package s;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import q.q;
import s.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f99504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99505b;

    public static final class a implements i.a {
        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(ByteBuffer byteBuffer, y.m mVar, o.e eVar) {
            return new c(byteBuffer, mVar);
        }
    }

    public c(ByteBuffer byteBuffer, y.m mVar) {
        this.f99504a = byteBuffer;
        this.f99505b = mVar;
    }

    @Override // s.i
    public Object a(Continuation continuation) {
        try {
            vh.e eVar = new vh.e();
            eVar.write(this.f99504a);
            this.f99504a.position(0);
            return new m(q.a(eVar, this.f99505b.g()), null, q.f.MEMORY);
        } catch (Throwable th2) {
            this.f99504a.position(0);
            throw th2;
        }
    }
}
