package vh;

import java.io.Closeable;

/* JADX INFO: loaded from: classes12.dex */
public interface l0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(e eVar, long j10);

    m0 timeout();
}
