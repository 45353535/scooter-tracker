package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaaq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzaar zzaarVar) {
        zzb(zzaarVar);
        this.zza.add(new zzaap(handler, zzaarVar));
    }

    public final void zzb(zzaar zzaarVar) {
        CopyOnWriteArrayList<zzaap> copyOnWriteArrayList = this.zza;
        for (zzaap zzaapVar : copyOnWriteArrayList) {
            if (zzaapVar.zzc() == zzaarVar) {
                zzaapVar.zza();
                copyOnWriteArrayList.remove(zzaapVar);
            }
        }
    }

    public final void zzc(final int i10, final long j10, final long j11) {
        for (final zzaap zzaapVar : this.zza) {
            if (!zzaapVar.zzd()) {
                zzaapVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaapVar.zzc().zzX(i10, j10, j11);
                    }
                });
            }
        }
    }
}
