package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pw2 {
    public final fr1 a(ir1 ir1Var) {
        ByteBuffer byteBuffer = ir1Var.f110670d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (ir1Var.b(Integer.MIN_VALUE)) {
            return null;
        }
        return a(ir1Var, byteBuffer);
    }

    public abstract fr1 a(ir1 ir1Var, ByteBuffer byteBuffer);
}
