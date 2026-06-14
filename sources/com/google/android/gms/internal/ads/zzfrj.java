package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfrj {
    private final zzfsb zzc;
    private final zzfrf zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfrj(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, Clock clock) {
        this.zzc = zzfsbVar;
        this.zzd = zzfrfVar;
        this.zze = context;
        this.zzh = clock;
    }

    static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length());
        sb2.append(str);
        sb2.append("#");
        sb2.append(strName);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfsa) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfsa) it2.next()).zzi();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfrj.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzfsa zzfsaVar) {
        zzfsaVar.zzd();
        this.zza.put(str, zzfsaVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z10;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfsa zzfsaVarZzq = zzq(str, adFormat);
            int iZzp = 0;
            z10 = zzfsaVarZzq != null && zzfsaVarZzq.zzf();
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
            zzfrf zzfrfVar = this.zzd;
            int i10 = zzfsaVarZzq == null ? 0 : zzfsaVarZzq.zze.zzd;
            if (zzfsaVarZzq != null) {
                iZzp = zzfsaVarZzq.zzp();
            }
            zzfrfVar.zzd(i10, iZzp, jCurrentTimeMillis, lValueOf, zzfsaVarZzq != null ? zzfsaVarZzq.zzk() : null, zzfrmVar, "1");
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
        zzfrf zzfrfVar = this.zzd;
        Clock clock = this.zzh;
        zzfrfVar.zzf(clock.currentTimeMillis(), zzfrmVar, -1, -1, "1");
        zzfsa zzfsaVarZzq = zzq(str, adFormat);
        if (zzfsaVarZzq == null) {
            return null;
        }
        try {
            String strZzk = zzfsaVarZzq.zzk();
            Object objZzg = zzfsaVarZzq.zzg();
            Object objCast = objZzg == null ? null : cls.cast(objZzg);
            if (objCast != null) {
                zzfrfVar.zzh(clock.currentTimeMillis(), zzfsaVarZzq.zze.zzd, zzfsaVarZzq.zzp(), strZzk, zzfrmVar, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    @Nullable
    private final synchronized zzfsa zzq(String str, AdFormat adFormat) {
        return (zzfsa) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e10) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfri(this));
                    } catch (RuntimeException e11) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfrh(this));
            }
            List<com.google.android.gms.ads.internal.client.zzft> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzm) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzfsa zzfsaVarZza = this.zzc.zza(zzftVar, zzceVar);
                if (adFormat != null && zzfsaVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzfsaVarZza.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzd;
                    zzfsaVarZza.zzl(zzfrfVar);
                    zzn(zzh(str, adFormat), zzfsaVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfrfVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfrm(new zzfrl(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzp(zzcaz.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbex zze(String str) {
        return (zzbex) zzp(zzbex.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
