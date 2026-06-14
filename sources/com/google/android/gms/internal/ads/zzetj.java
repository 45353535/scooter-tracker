package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetj implements zzfav {
    public final com.google.android.gms.ads.internal.client.zzr zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;
    public final int zzi;
    public final boolean zzj;

    @Nullable
    public final Insets zzk;

    @Nullable
    public final zzetg zzl;

    public zzetj(com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, boolean z10, String str2, float f10, int i10, int i11, @Nullable String str3, int i12, boolean z11, @Nullable Insets insets, @Nullable zzetg zzetgVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = i12;
        this.zzj = z11;
        this.zzk = insets;
        this.zzl = zzetgVar;
    }

    private final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i10 = zzrVar.zze;
        zzfjz.zzb(bundle, "smart_w", "full", i10 == -1);
        int i11 = zzrVar.zzb;
        zzfjz.zzb(bundle, "smart_h", "auto", i11 == -2);
        zzfjz.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfjz.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfjz.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfjz.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfjz.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfjz.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfjz.zze(bundle, "format", this.zzb);
        zzfjz.zzb(bundle, "fluid", "height", this.zzc);
        zzfjz.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.zzg);
        String str = this.zzh;
        zzfjz.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i12 = this.zzi;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        zzetg zzetgVar = this.zzl;
        if (zzetgVar != null) {
            bundle.putInt("rc_tl", zzetgVar.zza);
            bundle.putInt("rc_tr", zzetgVar.zzb);
            bundle.putInt("rc_bl", zzetgVar.zzc);
            bundle.putInt("rc_br", zzetgVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i11);
            bundle2.putInt("width", i10);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzdah) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzdah) obj).zzb);
    }
}
