package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class x10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f117677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f117678b = androidx.media3.decoder.c.a(0, 0);

    public x10(MediaCodec.CryptoInfo cryptoInfo) {
        this.f117677a = cryptoInfo;
    }

    public final void a(int i10, int i11) {
        this.f117678b.set(i10, i11);
        this.f117677a.setPattern(this.f117678b);
    }
}
