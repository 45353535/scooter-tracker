package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzaeg {
    protected final zzaea zza;
    protected final zzaef zzb;

    @Nullable
    protected zzaec zzc;
    private final int zzd;

    protected zzaeg(zzaed zzaedVar, zzaef zzaefVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzaefVar;
        this.zzd = i10;
        this.zza = new zzaea(zzaedVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzaev zzaevVar, long j10, zzafv zzafvVar) {
        if (j10 == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzaev zzaevVar, long j10) throws IOException {
        long jZzn = j10 - zzaevVar.zzn();
        if (jZzn < 0 || jZzn > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        zzaevVar.zzf((int) jZzn);
        return true;
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final void zzb(long j10) {
        zzaec zzaecVar = this.zzc;
        if (zzaecVar == null || zzaecVar.zze() != j10) {
            zzaea zzaeaVar = this.zza;
            this.zzc = new zzaec(j10, zzaeaVar.zzd(j10), 0L, zzaeaVar.zze(), zzaeaVar.zzf(), zzaeaVar.zzg(), zzaeaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            zzaec zzaecVar = this.zzc;
            zzaecVar.getClass();
            long jZzb = zzaecVar.zzb();
            long jZzc = zzaecVar.zzc();
            long jZzh = zzaecVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzaevVar, jZzb, zzafvVar);
            }
            if (!zzg(zzaevVar, jZzh)) {
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            zzaevVar.zzl();
            zzaee zzaeeVarZza = this.zzb.zza(zzaevVar, zzaecVar.zzd());
            int iZzd = zzaeeVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            if (iZzd == -2) {
                zzaecVar.zzf(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzaevVar, zzaeeVarZza.zzf());
                    zze(true, zzaeeVarZza.zzf());
                    return zzf(zzaevVar, zzaeeVarZza.zzf(), zzafvVar);
                }
                zzaecVar.zzg(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            }
        }
    }

    protected final void zze(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
