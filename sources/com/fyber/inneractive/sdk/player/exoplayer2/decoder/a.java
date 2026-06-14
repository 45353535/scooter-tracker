package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f21713b = androidx.media3.decoder.c.a(0, 0);

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.f21712a = cryptoInfo;
    }

    public static void a(a aVar) {
        aVar.f21713b.set(0, 0);
        aVar.f21712a.setPattern(aVar.f21713b);
    }
}
