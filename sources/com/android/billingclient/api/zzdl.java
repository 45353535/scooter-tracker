package com.android.billingclient.api;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkf;
import com.google.android.gms.internal.play_billing.zzkh;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;

/* JADX INFO: loaded from: classes5.dex */
final class zzdl implements zzcz {
    private zzjr zzb;
    private final zzdn zzc;

    zzdl(Context context, zzjr zzjrVar) {
        this.zzc = new zzdn(context);
        this.zzb = zzjrVar;
    }

    private final void zzl(@Nullable zziw zziwVar, zzjr zzjrVar) {
        if (zziwVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(zzjrVar);
            zzkfVarZza.zza(zziwVar);
            this.zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    private final void zzm(@Nullable zzja zzjaVar, zzjr zzjrVar) {
        if (zzjaVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(zzjrVar);
            zzkfVarZza.zzb(zzjaVar);
            this.zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zza(@Nullable zziw zziwVar) {
        try {
            zzl(zziwVar, this.zzb);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzb(@Nullable zziw zziwVar, int i10) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i10);
            this.zzb = (zzjr) zzjpVar.zzi();
            zza(zziwVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzc(zziw zziwVar, int i10, long j10) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i10);
            zzjr zzjrVar = (zzjr) zzjpVar.zzi();
            this.zzb = zzjrVar;
            if (j10 != 0) {
                zzjp zzjpVar2 = (zzjp) zzjrVar.zzq();
                zzjpVar2.zze(j10);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar, zzjrVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzd(zziw zziwVar, long j10, boolean z10) {
        zzjr zzjrVar;
        try {
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z10);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j10 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.zzb.zzq();
                zzjpVar.zze(j10);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zze(zziw zziwVar, int i10, long j10, boolean z10) {
        zzjr zzjrVar;
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i10);
            this.zzb = (zzjr) zzjpVar.zzi();
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z10);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j10 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar2 = (zzjp) this.zzb.zzq();
                zzjpVar2.zze(j10);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzf(@Nullable zzja zzjaVar) {
        try {
            zzm(zzjaVar, this.zzb);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzg(@Nullable zzja zzjaVar, int i10) {
        try {
            zzjp zzjpVar = (zzjp) this.zzb.zzq();
            zzjpVar.zzc(i10);
            this.zzb = (zzjr) zzjpVar.zzi();
            zzf(zzjaVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzh(zzja zzjaVar, long j10, boolean z10) {
        zzjr zzjrVar;
        try {
            zziy zziyVar = (zziy) zzjaVar.zzq();
            zzjz zzjzVar = (zzjz) zzjaVar.zzc().zzq();
            zzjzVar.zza(z10);
            zziyVar.zzc(zzjzVar);
            zzja zzjaVar2 = (zzja) zziyVar.zzi();
            if (j10 == 0) {
                zzjrVar = this.zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.zzb.zzq();
                zzjpVar.zze(j10);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzm(zzjaVar2, zzjrVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzi(zzji zzjiVar) {
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.zzb);
            zzkfVarZza.zzc(zzjiVar);
            this.zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzj(zzkn zzknVar) {
        try {
            zzdn zzdnVar = this.zzc;
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.zzb);
            zzkfVarZza.zze(zzknVar);
            zzdnVar.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzk(@Nullable zzkr zzkrVar) {
        if (zzkrVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.zzb);
            zzkfVarZza.zzp(zzkrVar);
            this.zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th2);
        }
    }
}
