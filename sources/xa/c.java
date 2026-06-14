package xa;

import java.nio.ByteBuffer;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements a {
    @Override // xa.a
    public final v a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(bVar.f104988e);
        q9.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract v b(b bVar, ByteBuffer byteBuffer);
}
