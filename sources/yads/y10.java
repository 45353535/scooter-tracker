package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class y10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f118048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f118049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f118051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f118052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f118056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x10 f118057j;

    public y10() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f118056i = cryptoInfo;
        this.f118057j = w83.f117341a >= 24 ? new x10(cryptoInfo) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f118053f = i10;
        this.f118051d = iArr;
        this.f118052e = iArr2;
        this.f118049b = bArr;
        this.f118048a = bArr2;
        this.f118050c = i11;
        this.f118054g = i12;
        this.f118055h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f118056i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (w83.f117341a >= 24) {
            x10 x10Var = this.f118057j;
            x10Var.getClass();
            x10Var.a(i12, i13);
        }
    }
}
