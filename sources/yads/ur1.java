package yads;

import com.ironsource.C4228aa;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class ur1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116746a;

    public ur1(int i10, String str) {
        this.f116746a = i10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                uf.c.a(byteArrayOutputStream, null);
                Cipher cipher = Cipher.getInstance(C4228aa.f42351b);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f116746a).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher2 = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    byteArrayOutputStream.write(cipher2.doFinal(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    uf.c.a(byteArrayOutputStream, null);
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
