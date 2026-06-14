package t9;

import android.media.MediaCodec;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f104974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f104975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f104977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f104978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f104980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f104981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f104982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f104983j;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f104984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f104985b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f104985b.set(i10, i11);
            this.f104984a.setPattern(this.f104985b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f104984a = cryptoInfo;
            this.f104985b = androidx.media3.decoder.c.a(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f104982i = cryptoInfo;
        this.f104983j = o0.f98837a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f104982i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f104977d == null) {
            int[] iArr = new int[1];
            this.f104977d = iArr;
            this.f104982i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f104977d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f104979f = i10;
        this.f104977d = iArr;
        this.f104978e = iArr2;
        this.f104975b = bArr;
        this.f104974a = bArr2;
        this.f104976c = i11;
        this.f104980g = i12;
        this.f104981h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f104982i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (o0.f98837a >= 24) {
            ((b) q9.a.e(this.f104983j)).b(i12, i13);
        }
    }
}
