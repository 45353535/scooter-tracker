package y1;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f108341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f108342c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f108340a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmParameterSpec f108343d = new z1.a().a();

    public final Pair a(String str) {
        if (this.f108341b != null) {
            return d.a(this.f108340a, str);
        }
        return null;
    }

    public final String b(String str, byte[] bArr) {
        if (this.f108342c != null) {
            return a.a(a.b(2, bArr, this.f108340a), str);
        }
        return null;
    }

    public final void c() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        t1.b.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f108343d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f108340a = (SecretKey) key;
            this.f108341b = new d();
            this.f108342c = new b();
        }
    }
}
