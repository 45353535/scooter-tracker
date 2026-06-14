package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzgkc implements zzgjf {
    private final zzgmu zza;
    private final zzgmg zzb;
    private final ExecutorService zzc;
    private final zzgmz zzd;
    private final zzgoe zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgkb zzj;

    zzgkc(zzikv zzikvVar, zzgmu zzgmuVar, zzgmg zzgmgVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgbf zzgbfVar, ExecutorService executorService) {
        this.zza = zzgmuVar;
        this.zzb = zzgmgVar;
        this.zzc = executorService;
        this.zzd = zzgmzVar;
        this.zze = zzgoeVar;
        this.zzg = zzgbfVar.zzb();
        this.zzh = zzgbfVar.zzk();
        this.zzi = zzgbfVar.zzj();
    }

    private final String zzq(Map map) throws zzatt, zzatp {
        String strZzb;
        zzgoe zzgoeVar = this.zze;
        try {
            zzgoeVar.zza(20110).zza();
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar == null) {
                        zzgoeVar.zzb(20109);
                        strZzb = "";
                    } else {
                        strZzb = zzgkbVar.zzb(map);
                    }
                } finally {
                }
            }
            return strZzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        synchronized (this.zzf) {
            try {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar == null) {
                    return "3.825731049.-1";
                }
                return zzgkbVar.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzb() {
        zzgzg zzgzgVarZzw = zzgzg.zzw(this.zzb.zzb());
        zzgka zzgkaVar = zzgka.zza;
        ExecutorService executorService = this.zzc;
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzgkaVar, executorService), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((zzgdu) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzc(final Context context) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgzo.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgju
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgzo.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgjv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzgkbVar.zzc(map);
                    } else {
                        this.zze.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzatp | zzatt e10) {
            this.zze.zzd(20104, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void zzh(java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgkc.zzh(java.util.Map):void");
    }

    final /* synthetic */ ListenableFuture zzi(zzgdu zzgduVar) {
        if (this.zza.zzb(zzgduVar)) {
            return zzgzo.zzk(this.zzb.zze(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjw
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzm((byte[]) obj);
                    return null;
                }
            }, zzhaf.zza());
        }
        this.zze.zzb(20103);
        throw new zzgjg(1);
    }

    final /* synthetic */ String zzj(final Context context) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(map, context);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgjy
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgjz
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    final /* synthetic */ Void zzm(byte[] bArr) {
        zzatr zzatrVarZzc = zzgkf.zzc();
        zzgoc zzgocVarZza = this.zze.zza(20102);
        try {
            try {
                zzgocVarZza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgkb.zza(zzatrVarZzc, bArr);
                }
                zzgocVarZza.zzc();
                return null;
            } catch (zzatp e10) {
                e = e10;
                zzgocVarZza.zzb(e);
                throw new zzgjg(2, e);
            } catch (zzatt e11) {
                e = e11;
                zzgocVarZza.zzb(e);
                throw new zzgjg(2, e);
            } catch (Throwable th2) {
                zzgocVarZza.zzb(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            throw th3;
        }
    }

    final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", null);
        map.put("bds", str);
    }
}
