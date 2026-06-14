package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfjk {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzga zza;

    @Nullable
    public final zzbqs zzb;

    @Nullable
    public final zzerp zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;

    @Nullable
    public final zzbkh zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzco zzo;
    public final zzfiy zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcs zzw;

    /* synthetic */ zzfjk(zzfjj zzfjjVar, byte[] bArr) {
        this.zzf = zzfjjVar.zzE();
        this.zzg = zzfjjVar.zzF();
        this.zzw = zzfjjVar.zzaa();
        this.zze = zzfjjVar.zzD().zzB;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD2 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD3 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD4 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD5 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD6 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD7 = zzfjjVar.zzD();
        int i10 = zzfjjVar.zzD().zza;
        long j10 = zzmVarZzD7.zzb;
        Bundle bundle = zzmVarZzD6.zzc;
        int i11 = zzmVarZzD5.zzd;
        List list = zzmVarZzD4.zze;
        boolean z10 = zzmVarZzD3.zzf;
        int i12 = zzmVarZzD2.zzg;
        boolean z11 = true;
        if (!zzmVarZzD.zzh && !zzfjjVar.zzH()) {
            z11 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i10, j10, bundle, i11, list, z10, i12, z11, zzfjjVar.zzD().zzi, zzfjjVar.zzD().zzj, zzfjjVar.zzD().zzk, zzfjjVar.zzD().zzl, zzfjjVar.zzD().zzm, zzfjjVar.zzD().zzn, zzfjjVar.zzD().zzo, zzfjjVar.zzD().zzp, zzfjjVar.zzD().zzq, zzfjjVar.zzD().zzr, zzfjjVar.zzD().zzs, zzfjjVar.zzD().zzt, zzfjjVar.zzD().zzu, zzfjjVar.zzD().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfjjVar.zzD().zzw), zzfjjVar.zzD().zzx, zzfjjVar.zzD().zzy, zzfjjVar.zzD().zzz, zzfjjVar.zzD().zzA);
        this.zzd = zzmVar;
        this.zza = zzfjjVar.zzG() != null ? zzfjjVar.zzG() : zzfjjVar.zzK() != null ? zzfjjVar.zzK().zzf : null;
        this.zzh = zzfjjVar.zzI();
        this.zzi = zzfjjVar.zzJ();
        this.zzj = zzfjjVar.zzI() == null ? null : zzfjjVar.zzK() == null ? new zzbkh(new NativeAdOptions.Builder().build()) : zzfjjVar.zzK();
        this.zzk = zzfjjVar.zzL();
        this.zzl = zzfjjVar.zzP();
        this.zzm = zzfjjVar.zzM();
        this.zzn = zzfjjVar.zzN();
        this.zzo = zzfjjVar.zzO();
        this.zzb = zzfjjVar.zzQ();
        this.zzp = new zzfiy(zzfjjVar.zzR(), null);
        this.zzq = zzfjjVar.zzS();
        this.zzr = zzfjjVar.zzT();
        this.zzc = zzfjjVar.zzU();
        this.zzs = zzfjjVar.zzV();
        this.zzt = zzfjjVar.zzW();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfjjVar.zzX();
        this.zzv = zzfjjVar.zzY();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzea));
    }
}
