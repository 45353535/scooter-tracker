package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcfk extends TextureView implements zzcgh {
    protected final zzcfy zza;
    protected final zzcgi zzb;

    public zzcfk(Context context) {
        super(context);
        this.zza = new zzcfy();
        this.zzb = new zzcgi(context, this);
    }

    public void zzA(int i10) {
    }

    public void zzB(int i10) {
    }

    public void zzC(int i10) {
    }

    public abstract String zza();

    public abstract void zzb(zzcfj zzcfjVar);

    public abstract void zzc(@Nullable String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i10);

    public abstract void zzj(float f10, float f11);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzc(str);
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
