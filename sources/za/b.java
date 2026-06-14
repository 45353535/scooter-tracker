package za;

import java.nio.ByteBuffer;
import java.util.Arrays;
import n9.v;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends xa.c {
    @Override // xa.c
    protected v b(xa.b bVar, ByteBuffer byteBuffer) {
        return new v(c(new d0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(d0 d0Var) {
        return new a((String) q9.a.e(d0Var.B()), (String) q9.a.e(d0Var.B()), d0Var.A(), d0Var.A(), Arrays.copyOfRange(d0Var.e(), d0Var.f(), d0Var.g()));
    }
}
