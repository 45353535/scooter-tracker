package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f75254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f75255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f75256c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f75254a = str;
        this.f75255b = bArr;
        this.f75256c = bArr2;
    }

    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f75255b, "AES");
            Cipher cipher = Cipher.getInstance(this.f75254a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f75256c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public String getAlgorithm() {
        return this.f75254a;
    }

    @VisibleForTesting
    public byte[] getIV() {
        return this.f75256c;
    }

    @VisibleForTesting
    public byte[] getPassword() {
        return this.f75255b;
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] bArr, int i10, int i11) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f75255b, "AES");
            Cipher cipher = Cipher.getInstance(this.f75254a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f75256c));
            return cipher.doFinal(bArr, i10, i11);
        } catch (Throwable unused) {
            return null;
        }
    }
}
