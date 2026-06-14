package vh;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes12.dex */
public interface f extends j0, WritableByteChannel {
    f emit();

    f emitCompleteSegments();

    @Override // vh.j0, java.io.Flushable
    void flush();

    e getBuffer();

    long i(l0 l0Var);

    OutputStream outputStream();

    f r(h hVar);

    f write(byte[] bArr);

    f write(byte[] bArr, int i10, int i11);

    f writeByte(int i10);

    f writeDecimalLong(long j10);

    f writeHexadecimalUnsignedLong(long j10);

    f writeInt(int i10);

    f writeShort(int i10);

    f writeUtf8(String str);

    f writeUtf8(String str, int i10, int i11);
}
