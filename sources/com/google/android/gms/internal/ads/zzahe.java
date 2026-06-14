package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzahe extends zzaeg {
    public zzahe(final zzafh zzafhVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzafhVar);
        zzaed zzaedVar = new zzaed() { // from class: com.google.android.gms.internal.ads.zzahc
            @Override // com.google.android.gms.internal.ads.zzaed
            public final /* synthetic */ long zza(long j13) {
                return zzafhVar.zzb(j13);
            }
        };
        zzahd zzahdVar = new zzahd(zzafhVar, i10, null);
        long jZza = zzafhVar.zza();
        long j13 = zzafhVar.zzj;
        int i11 = zzafhVar.zzd;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) zzafhVar.zzc)) / 2) + 1;
        } else {
            int i12 = zzafhVar.zza;
            int i13 = zzafhVar.zzb;
            long j14 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i12 == i13 && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * ((long) zzafhVar.zzg)) * ((long) zzafhVar.zzh)) / 8);
        }
        super(zzaedVar, zzahdVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzafhVar.zzc));
    }
}
