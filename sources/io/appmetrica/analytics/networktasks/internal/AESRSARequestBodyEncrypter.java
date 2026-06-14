package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* JADX INFO: loaded from: classes12.dex */
public class AESRSARequestBodyEncrypter implements RequestBodyEncrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AESRSAEncrypter f78840a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @Nullable
    public byte[] encrypt(@Nullable byte[] bArr) {
        return this.f78840a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    @NonNull
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.f78840a = aESRSAEncrypter;
    }
}
