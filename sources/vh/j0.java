package vh;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes12.dex */
public interface j0 extends Closeable, Flushable {
    void H(e eVar, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    m0 timeout();
}
