package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s9.y;

/* JADX INFO: loaded from: classes12.dex */
class a implements s9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s9.g f80939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f80940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f80941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f80942d;

    public a(s9.g gVar, byte[] bArr, byte[] bArr2) {
        this.f80939a = gVar;
        this.f80940b = bArr;
        this.f80941c = bArr2;
    }

    @Override // s9.g
    public final void a(y yVar) {
        q9.a.e(yVar);
        this.f80939a.a(yVar);
    }

    @Override // s9.g
    public final long b(s9.k kVar) {
        try {
            Cipher cipherC = c();
            try {
                cipherC.init(2, new SecretKeySpec(this.f80940b, "AES"), new IvParameterSpec(this.f80941c));
                s9.i iVar = new s9.i(this.f80939a, kVar);
                this.f80942d = new CipherInputStream(iVar, cipherC);
                iVar.n();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected Cipher c() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // s9.g
    public void close() {
        if (this.f80942d != null) {
            this.f80942d = null;
            this.f80939a.close();
        }
    }

    @Override // s9.g
    public final Map getResponseHeaders() {
        return this.f80939a.getResponseHeaders();
    }

    @Override // s9.g
    public final Uri getUri() {
        return this.f80939a.getUri();
    }

    @Override // n9.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        q9.a.e(this.f80942d);
        int i12 = this.f80942d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
