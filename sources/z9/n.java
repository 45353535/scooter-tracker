package z9;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public interface n {

    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f119297b;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f119297b = i10;
        }
    }

    void a(u.a aVar);

    void b(u.a aVar);

    t9.b getCryptoConfig();

    a getError();

    UUID getSchemeUuid();

    int getState();

    boolean playClearSamplesWithoutKeys();

    Map queryKeyStatus();

    boolean requiresSecureDecoder(String str);
}
