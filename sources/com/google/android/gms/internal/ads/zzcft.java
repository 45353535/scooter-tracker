package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcft {
    private final Context zza;
    private final zzcge zzb;
    private final ViewGroup zzc;

    @Nullable
    private final zzdxz zzd;
    private zzcfs zze;

    public zzcft(Context context, ViewGroup viewGroup, zzcjl zzcjlVar, @Nullable zzdxz zzdxzVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcjlVar;
        this.zze = null;
        this.zzd = zzdxzVar;
    }

    @Nullable
    public final Integer zza() {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            return zzcfsVar.zzl();
        }
        return null;
    }

    public final void zzb(int i10, int i11, int i12, int i13) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzn(i10, i11, i12, i13);
        }
    }

    public final void zzc(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcgd zzcgdVar) {
        if (this.zze != null) {
            return;
        }
        zzcge zzcgeVar = this.zzb;
        zzbhl.zza(zzcgeVar.zzq().zzc(), zzcgeVar.zzi(), "vpr2");
        zzcfs zzcfsVar = new zzcfs(this.zza, zzcgeVar, i14, z10, zzcgeVar.zzq().zzc(), zzcgdVar, this.zzd);
        this.zze = zzcfsVar;
        this.zzc.addView(zzcfsVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i10, i11, i12, i13);
        zzcgeVar.zzdn(false);
    }

    public final zzcfs zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i10) {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzm(i10);
        }
    }
}
