package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes8.dex */
final class zzarc extends zzard {
    private final byte[] zza;

    public zzarc(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzard, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }
}
