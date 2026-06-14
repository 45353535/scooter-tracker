package z9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public interface e0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f119193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f119194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f119195c;

        public a(byte[] bArr, String str, int i10) {
            this.f119193a = bArr;
            this.f119194b = str;
            this.f119195c = i10;
        }

        public byte[] a() {
            return this.f119193a;
        }

        public String b() {
            return this.f119194b;
        }
    }

    public interface b {
        void a(e0 e0Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        e0 acquireExoMediaDrm(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f119196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f119197b;

        public d(byte[] bArr, String str) {
            this.f119196a = bArr;
            this.f119197b = str;
        }

        public byte[] a() {
            return this.f119196a;
        }

        public String b() {
            return this.f119197b;
        }
    }

    void a(b bVar);

    void b(byte[] bArr, c2 c2Var);

    void closeSession(byte[] bArr);

    t9.b createCryptoConfig(byte[] bArr);

    int getCryptoType();

    a getKeyRequest(byte[] bArr, List list, int i10, HashMap map);

    d getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
