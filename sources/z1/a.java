package z1;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.security.spec.AlgorithmParameterSpec;
import t1.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public final AlgorithmParameterSpec a() {
        b.a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}
