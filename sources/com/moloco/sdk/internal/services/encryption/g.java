package com.moloco.sdk.internal.services.encryption;

import android.util.Base64;
import com.moloco.sdk.BuildConfig;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f55546b = i.a(new Function0() { // from class: com.moloco.sdk.internal.services.encryption.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.h();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f55547c = i.a(new Function0() { // from class: com.moloco.sdk.internal.services.encryption.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.g();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f55548d = i.a(new Function0() { // from class: com.moloco.sdk.internal.services.encryption.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.f();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f55549e = i.a(new Function0() { // from class: com.moloco.sdk.internal.services.encryption.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SecretKeySpec f55550f = j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f55551g = i.a(new Function0() { // from class: com.moloco.sdk.internal.services.encryption.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.i();
        }
    });

    public static final String d() {
        byte[] bArrDecode = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return StringsKt.F(bArrDecode);
    }

    public static final String f() {
        return StringsKt.F(new byte[]{65, 69, 83});
    }

    public static final String g() {
        return StringsKt.F(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
    }

    public static final String h() {
        byte[] bArrDecode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return StringsKt.F(bArrDecode);
    }

    public static final IvParameterSpec i() {
        return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
    }

    public IvParameterSpec a() {
        return (IvParameterSpec) this.f55551g.getValue();
    }

    public SecretKeySpec b() {
        return this.f55550f;
    }

    public byte[] c(byte[] input, String publicKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Cipher cipher = Cipher.getInstance(n());
        cipher.init(1, e(publicKey));
        byte[] bArrDoFinal = cipher.doFinal(b().getEncoded());
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final PublicKey e(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(m()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }

    public final SecretKeySpec j() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(k());
        keyGenerator.init(256);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), k());
    }

    public final String k() {
        return (String) this.f55548d.getValue();
    }

    public final String l() {
        return (String) this.f55549e.getValue();
    }

    public final String m() {
        return (String) this.f55546b.getValue();
    }

    public final String n() {
        return (String) this.f55547c.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] a(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(data, "data");
        Cipher cipher = Cipher.getInstance(l());
        cipher.init(1, b(), a());
        byte[] bArrDoFinal = cipher.doFinal(data);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    public byte[] a(String rsaPublicKey) {
        Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        byte[] encoded = b().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        return c(encoded, rsaPublicKey);
    }
}
