package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcss implements zzbde, zzdca, com.google.android.gms.ads.internal.overlay.zzr, zzdbz {
    private final zzcsn zza;
    private final zzcso zzb;
    private final zzbtl zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcsr zzh = new zzcsr();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcss(zzbti zzbtiVar, zzcso zzcsoVar, Executor executor, zzcsn zzcsnVar, Clock clock) {
        this.zza = zzcsnVar;
        zzbst zzbstVar = zzbsw.zza;
        this.zzd = zzbtiVar.zza("google.afma.activeView.handleUpdate", zzbstVar, zzbstVar);
        this.zzb = zzcsoVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcjl) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final synchronized void zza(@Nullable Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final synchronized void zzb(@Nullable Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final synchronized void zzc(@Nullable Context context) {
        this.zzh.zze = ApsMetricsDataMap.APSMETRICS_FIELD_URL;
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized void zzdj(zzbdd zzbddVar) {
        zzcsr zzcsrVar = this.zzh;
        zzcsrVar.zza = zzbddVar.zzj;
        zzcsrVar.zzf = zzbddVar;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcsr zzcsrVar = this.zzh;
                zzcsrVar.zzd = this.zzf.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcsrVar);
                for (final zzcjl zzcjlVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 31);
                            sb2.append("Calling AFMA_updateActiveView(");
                            sb2.append(string);
                            sb2.append(")");
                            String string2 = sb2.toString();
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
                            zzcjlVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcel.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcjl zzcjlVar) {
        this.zzc.add(zzcjlVar);
        this.zza.zzb(zzcjlVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
