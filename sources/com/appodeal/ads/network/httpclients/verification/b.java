package com.appodeal.ads.network.httpclients.verification;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13989a;

    public final String a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f13989a = string;
        return string;
    }

    public final boolean b(String str) {
        String str2 = this.f13989a;
        boolean z10 = true;
        if (str2 == null) {
            return true;
        }
        if (str2.length() > 0 && str != null && str.length() != 0) {
            z10 = false;
            byte[] bArrDecode = Base64.decode(str, 0);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Intrinsics.checkNotNull(bArrDecode);
            try {
                byte[] bytes2 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAENIBD8zVGWMJWVFPJ9aQkyZS+ahKDB9xbQZeXIb7keGfUEMdOaOxWd+nTa2HbkeHi0PNfdGHAyCE4mycvIPwStw==".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                byte[] bArrDecode2 = Base64.decode(bytes2, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode2, "decode(...)");
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArrDecode2));
                Signature signature = Signature.getInstance("SHA256withECDSA");
                signature.initVerify(publicKeyGeneratePublic);
                signature.update(bytes);
                return signature.verify(bArrDecode);
            } catch (Exception unused) {
            }
        }
        return z10;
    }
}
