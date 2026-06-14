package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdmd implements zzdct, com.google.android.gms.ads.internal.overlay.zzr, zzdbz {

    @Nullable
    @VisibleForTesting
    zzekb zza;
    private final Context zzb;

    @Nullable
    private final zzcjl zzc;
    private final zzfir zzd;
    private final VersionInfoParcel zze;
    private final zzejz zzf;

    public zzdmd(Context context, @Nullable zzcjl zzcjlVar, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzejz zzejzVar) {
        this.zzb = context;
        this.zzc = zzcjlVar;
        this.zzd = zzfirVar;
        this.zze = versionInfoParcel;
        this.zzf = zzejzVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i10) {
        this.zza = null;
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
    public final void zzdr() {
        zzcjl zzcjlVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcjlVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgp)).booleanValue()) {
                zzcjlVar.zze("onSdkImpression", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzcjl zzcjlVar;
        zzejy zzejyVar;
        zzejx zzejxVar;
        zzfir zzfirVar = this.zzd;
        if (!zzfirVar.zzT || (zzcjlVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i10 = versionInfoParcel.buddyApkVersion;
            int i11 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(".");
            sb2.append(i11);
            String string = sb2.toString();
            zzfjn zzfjnVar = zzfirVar.zzV;
            String strZza = zzfjnVar.zza();
            if (zzfjnVar.zzc() == 1) {
                zzejxVar = zzejx.VIDEO;
                zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
            } else {
                zzejyVar = zzfirVar.zzY == 2 ? zzejy.UNSPECIFIED : zzejy.BEGIN_TO_RENDER;
                zzejxVar = zzejx.HTML_DISPLAY;
            }
            zzekb zzekbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcjlVar.zzD(), "", "javascript", strZza, zzejyVar, zzejxVar, zzfirVar.zzal);
            this.zza = zzekbVarZzc;
            if (zzekbVarZzc != null) {
                zzfsj zzfsjVarZza = zzekbVarZzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfsjVarZza, zzcjlVar.zzD());
                    Iterator it = zzcjlVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfsjVarZza, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfsjVarZza, zzcjlVar.zzE());
                }
                zzcjlVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzfsjVarZza);
                zzcjlVar.zze("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzcjl zzcjlVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgp)).booleanValue() || (zzcjlVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcjlVar.zze("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
