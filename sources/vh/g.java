package vh;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes12.dex */
public interface g extends l0, ReadableByteChannel {
    long C(h hVar);

    long T(j0 j0Var);

    long a0(h hVar);

    e buffer();

    boolean exhausted();

    e getBuffer();

    InputStream inputStream();

    g peek();

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j10);

    h readByteString();

    h readByteString(long j10);

    long readDecimalLong();

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(Charset charset);

    String readUtf8(long j10);

    String readUtf8Line();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j10);

    boolean request(long j10);

    void require(long j10);

    void skip(long j10);

    boolean t(long j10, h hVar);

    int w0(a0 a0Var);
}
