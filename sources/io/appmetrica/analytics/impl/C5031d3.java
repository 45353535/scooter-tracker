package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5031d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5005c3 f77000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f77001b;

    public C5031d3() {
        this(new C5005c3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C5005c3 c5005c3 = this.f77000a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c5005c3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f77001b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C5031d3(C5005c3 c5005c3, GZIPCompressor gZIPCompressor) {
        this.f77000a = c5005c3;
        this.f77001b = gZIPCompressor;
    }
}
