package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfqr {
    private final int zzc;

    @Nullable
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfrf zzg;
    private final Clock zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    @VisibleForTesting
    final Map zza = new LinkedHashMap();

    @VisibleForTesting
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfqr(int i10, ScheduledExecutorService scheduledExecutorService, zzfrf zzfrfVar, Clock clock) {
        this.zzc = i10;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfrfVar;
        this.zzh = clock;
    }

    private static String zzl(String str, AdFormat adFormat) {
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, str, adFormat);
    }

    private final boolean zzm(zzfsa zzfsaVar) {
        AdFormat adFormatZzo = zzfsaVar.zzo();
        if (adFormatZzo == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                return !map.containsKey(zzl(zzfsaVar.zzn(), adFormatZzo));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean zzn() {
        Map map = this.zza;
        synchronized (map) {
            try {
                for (zzfsa zzfsaVar : map.values()) {
                    if (zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized void zzo(long j10) {
        if (this.zzb.compareAndSet(false, true)) {
            if (j10 > 0) {
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, j10, TimeUnit.MILLISECONDS);
            } else {
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzh();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzk() {
        zzguf zzgufVarZzq;
        try {
            if (this.zzd.get()) {
                return;
            }
            zzfsa zzfsaVar = null;
            this.zze = null;
            if (zzf() < this.zzc || zzn()) {
                Map map = this.zza;
                synchronized (map) {
                    zzgufVarZzq = zzguf.zzq(map.values());
                }
                int size = zzgufVarZzq.size();
                double d10 = Double.MAX_VALUE;
                for (int i10 = 0; i10 < size; i10++) {
                    zzfsa zzfsaVar2 = (zzfsa) zzgufVarZzq.get(i10);
                    if (zzfsaVar2.zzq()) {
                        double dZzp = ((double) zzfsaVar2.zzp()) / ((double) zzfsaVar2.zze.zzd);
                        if (dZzp < d10) {
                            d10 = dZzp;
                        }
                        if (dZzp < d10) {
                            zzfsaVar = zzfsaVar2;
                        }
                    }
                }
                if (zzfsaVar != null) {
                    zzfsaVar.zze();
                    if (zzfsaVar.zzp() > 0) {
                        this.zzg.zzq(this.zzh.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzf(), this.zzc);
                    }
                }
                int iZzf = zzf();
                int i11 = this.zzc;
                if (iZzf >= i11) {
                    zzr();
                }
                if (zzf() >= i11) {
                    if (zzn()) {
                    }
                }
                if (zzn()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzk();
                        }
                    });
                    return;
                }
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqo
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzj();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzV)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            zzr();
            this.zzb.set(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg() {
        this.zzd.set(false);
        zzk();
    }

    private final void zzr() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        zzfrf zzfrfVar = this.zzg;
        Clock clock = this.zzh;
        zzfrfVar.zzs(clock.currentTimeMillis(), this.zzc, size);
    }

    private final void zzs(zzfsa zzfsaVar, int i10) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), i10, zzf(), this.zzc);
    }

    private final synchronized boolean zzt(zzfsa zzfsaVar) {
        if (!this.zzd.get() && zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
            zzfsaVar.zze();
            return true;
        }
        return false;
    }

    private static final int zzu(zzfsa zzfsaVar) {
        int iZzp = zzfsaVar.zzp();
        int i10 = iZzp - 1;
        if (!zzfsaVar.zzt()) {
            iZzp = i10;
        }
        return Math.max(iZzp, 0);
    }

    public final void zza(zzfsa zzfsaVar) {
        int i10 = 1;
        if (zzfsaVar.zzp() <= 0 && !zzfsaVar.zzt()) {
            i10 = 0;
        }
        zzc(zzfsaVar, i10);
    }

    public final synchronized void zzb(zzfsa zzfsaVar) {
        try {
            if (zzm(zzfsaVar)) {
                return;
            }
            long jZzy = zzfsaVar.zzy();
            if (jZzy <= 0) {
                zza(zzfsaVar);
                return;
            }
            if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
                zzs(zzfsaVar, 1);
            }
            this.zzd.set(true);
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
            this.zzb.set(true);
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg();
                }
            }, jZzy, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zzc(zzfsa zzfsaVar, int i10) {
        if (zzm(zzfsaVar)) {
            return;
        }
        if (i10 > 0) {
            zzs(zzfsaVar, i10);
        }
        if (!zzt(zzfsaVar)) {
            zzo(0L);
        } else {
            zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
        }
    }

    public final void zzd(String str, AdFormat adFormat, zzfsa zzfsaVar) {
        Map map = this.zza;
        String strZzl = zzl(str, adFormat);
        synchronized (map) {
            try {
                if (!map.containsKey(strZzl)) {
                    map.put(strZzl, zzfsaVar);
                    zzt(zzfsaVar);
                    zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze(String str, AdFormat adFormat) {
        zzfsa zzfsaVar;
        Map map = this.zza;
        String strZzl = zzl(str, adFormat);
        synchronized (map) {
            zzfsaVar = (zzfsa) map.remove(strZzl);
        }
        if (zzfsaVar == null) {
            return;
        }
        int iZzu = zzu(zzfsaVar);
        if (iZzu > 0) {
            zzs(zzfsaVar, iZzu);
        }
        if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
            zzo(0L);
        }
    }

    @VisibleForTesting
    final int zzf() {
        int iZzu;
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                iZzu = 0;
                while (it.hasNext()) {
                    iZzu += zzu((zzfsa) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iZzu;
    }
}
