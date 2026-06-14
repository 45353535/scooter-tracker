package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes8.dex */
public interface zzcge extends zzcld, zzclg, zzbrd {
    Context getContext();

    void setBackgroundColor(int i10);

    void zzA(int i10);

    void zzB(int i10);

    @Nullable
    zzcft zzdm();

    void zzdn(boolean z10);

    @Nullable
    zzckr zzh();

    @Nullable
    zzbhq zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i10);

    int zzp();

    zzbhr zzq();

    @Nullable
    zzchr zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzchr zzchrVar);

    void zzu(boolean z10, long j10);

    void zzv(int i10);

    void zzw(zzckr zzckrVar);

    int zzx();

    int zzy();

    void zzz();
}
