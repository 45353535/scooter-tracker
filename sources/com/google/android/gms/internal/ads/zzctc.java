package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzctc implements zzbde {
    private zzcjl zza;
    private final Executor zzb;
    private final zzcso zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcsr zzg = new zzcsr();

    public zzctc(Executor executor, zzcso zzcsoVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcsoVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z10 = this.zzf ? false : zzbddVar.zzj;
        zzcsr zzcsrVar = this.zzg;
        zzcsrVar.zza = z10;
        zzcsrVar.zzd = this.zzd.elapsedRealtime();
        zzcsrVar.zzf = zzbddVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 31);
        sb2.append("Calling AFMA_updateActiveView(");
        sb2.append(string);
        sb2.append(")");
        String string2 = sb2.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
