package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzud implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    zzud(zzug zzugVar) {
        Objects.requireNonNull(zzugVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
