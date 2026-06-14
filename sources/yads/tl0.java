package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class tl0 extends pw2 {
    @Override // yads.pw2
    public final fr1 a(ir1 ir1Var, ByteBuffer byteBuffer) {
        w92 w92Var = new w92(byteBuffer.limit(), byteBuffer.array());
        String strJ = w92Var.j();
        strJ.getClass();
        String strJ2 = w92Var.j();
        strJ2.getClass();
        return new fr1(new sl0(strJ, strJ2, w92Var.i(), w92Var.i(), Arrays.copyOfRange(w92Var.f117356a, w92Var.f117357b, w92Var.f117358c)));
    }
}
