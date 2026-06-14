package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface n0 extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void f(a aVar);
    }

    a A();

    void N(b bVar);

    String getConnectionType();

    boolean m0(b bVar);
}
