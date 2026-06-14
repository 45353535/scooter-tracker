package hf;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pg.m;
import pg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final void a(s sVar, Function1 block) throws EOFException {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        tg.d dVar = tg.d.f105172a;
        pg.a buffer = sVar.getBuffer();
        if (buffer.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        m mVarQ = buffer.q();
        Intrinsics.checkNotNull(mVarQ);
        byte[] bArrB = mVarQ.b(true);
        int iF = mVarQ.f();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iF, mVarQ.d() - iF);
        Intrinsics.checkNotNull(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iF;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > mVarQ.j()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(iPosition);
        }
    }
}
