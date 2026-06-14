package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabf {
    public static final zzaaz zza = new zzaaz(2, -9223372036854775807L, null);
    public static final zzaaz zzb = new zzaaz(3, -9223372036854775807L, null);
    private final zzabl zzc = b.a(zzfj.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzaay.zza);

    @Nullable
    private zzaba zzd;

    @Nullable
    private IOException zze;

    public zzabf(String str) {
    }

    public static zzaaz zza(boolean z10, long j10) {
        return new zzaaz(z10 ? 1 : 0, j10, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzabb zzabbVar, zzaax zzaaxVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaba(this, looperMyLooper, zzabbVar, zzaaxVar, i10, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzaba zzabaVar = this.zzd;
        zzabaVar.getClass();
        zzabaVar.zzc(false);
    }

    public final void zzg(@Nullable zzabc zzabcVar) {
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zzc(true);
        }
        zzabl zzablVar = this.zzc;
        zzablVar.execute(new zzabd(zzabcVar));
        zzablVar.zza();
    }

    public final void zzh(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zza(i10);
        }
    }

    final /* synthetic */ zzabl zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzaba zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzaba zzabaVar) {
        this.zzd = zzabaVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
