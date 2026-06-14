package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f21807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f21809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f21810d;

    public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, byte[] bArr, byte[] bArr2) {
        this.f21807a = hVar;
        this.f21808b = bArr;
        this.f21809c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f21808b, "AES"), new IvParameterSpec(this.f21809c));
                this.f21810d = new CipherInputStream(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(this.f21807a, kVar), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f21810d = null;
        this.f21807a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        CipherInputStream cipherInputStream = this.f21810d;
        if (cipherInputStream == null) {
            throw new IllegalStateException();
        }
        int i12 = cipherInputStream.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f21807a.a();
    }
}
