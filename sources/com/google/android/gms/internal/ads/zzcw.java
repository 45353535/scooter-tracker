package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcw {

    @Nullable
    private CharSequence zza;

    @Nullable
    private Bitmap zzb;

    @Nullable
    private Layout.Alignment zzc;

    @Nullable
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;
    private int zzp;

    public zzcw() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final zzcw zza(CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = null;
        return this;
    }

    @Nullable
    public final CharSequence zzb() {
        return this.zza;
    }

    public final zzcw zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        this.zza = null;
        return this;
    }

    public final zzcw zzd(@Nullable Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcw zze(@Nullable Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcw zzf(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcw zzg(int i10) {
        this.zzg = i10;
        return this;
    }

    public final int zzh() {
        return this.zzg;
    }

    public final zzcw zzi(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcw zzj(int i10) {
        this.zzi = i10;
        return this;
    }

    public final int zzk() {
        return this.zzi;
    }

    public final zzcw zzl(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcw zzm(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcw zzn(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcw zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzcw zzp(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcw zzq(int i10) {
        this.zzp = i10;
        return this;
    }

    public final zzcx zzr() {
        return new zzcx(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, this.zzp, null);
    }

    /* synthetic */ zzcw(zzcx zzcxVar, byte[] bArr) {
        this.zza = zzcxVar.zza;
        this.zzb = zzcxVar.zzd;
        this.zzc = zzcxVar.zzb;
        this.zzd = zzcxVar.zzc;
        this.zze = zzcxVar.zze;
        this.zzf = zzcxVar.zzf;
        this.zzg = zzcxVar.zzg;
        this.zzh = zzcxVar.zzh;
        this.zzi = zzcxVar.zzi;
        this.zzj = zzcxVar.zzl;
        this.zzk = zzcxVar.zzm;
        this.zzl = zzcxVar.zzj;
        this.zzm = zzcxVar.zzk;
        this.zzn = zzcxVar.zzn;
        this.zzo = zzcxVar.zzo;
        this.zzp = zzcxVar.zzp;
    }
}
