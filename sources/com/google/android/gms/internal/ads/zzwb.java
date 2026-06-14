package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwb {
    private static final AtomicLong zza = new AtomicLong();

    public zzwb(long j10, zzhf zzhfVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
