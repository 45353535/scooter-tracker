package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f21716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f21717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f21718e;

    public b() {
        int i10 = z.f23162a;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f21717d = cryptoInfo;
        this.f21718e = i10 >= 24 ? new a(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2) {
        this.f21715b = iArr;
        this.f21716c = iArr2;
        this.f21714a = bArr2;
        int i11 = z.f23162a;
        if (i11 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f21717d;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i11 >= 24) {
                a.a(this.f21718e);
            }
        }
    }
}
