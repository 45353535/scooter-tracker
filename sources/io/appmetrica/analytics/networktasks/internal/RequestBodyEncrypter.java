package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface RequestBodyEncrypter {
    @Nullable
    byte[] encrypt(byte[] bArr);

    @NonNull
    RequestBodyEncryptionMode getEncryptionMode();
}
