package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5514w6 implements CryptoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESRSAEncrypter f78487a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    @NotNull
    public final Encrypter getAesRsaEncrypter() {
        return this.f78487a;
    }
}
