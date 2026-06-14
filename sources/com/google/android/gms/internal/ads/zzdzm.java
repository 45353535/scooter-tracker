package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.Df;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdzm {
    private final zzbph zza;

    zzdzm(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdzl zzdzlVar) throws RemoteException {
        String strZza = zzdzlVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdzl(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("nativeObjectCreated");
        zzs(zzdzlVar);
    }

    public final void zzc(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("nativeObjectNotCreated");
        zzs(zzdzlVar);
    }

    public final void zzd(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzf(long j10, int i10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i10));
        zzs(zzdzlVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc(Df.f40642c);
        zzs(zzdzlVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc(Df.f40645f);
        this.zza.zzb(zzdzlVar.zza());
    }

    public final void zzi(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc(Df.f40646g);
        zzs(zzdzlVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onRewardedAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzl(long j10, int i10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onRewardedAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i10));
        zzs(zzdzlVar);
    }

    public final void zzm(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onRewardedAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onRewardedAdFailedToShow");
        zzdzlVar.zzd(Integer.valueOf(i10));
        zzs(zzdzlVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onRewardedAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzp(long j10, zzcaw zzcawVar) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onUserEarnedReward");
        zzdzlVar.zze(zzcawVar.zze());
        zzdzlVar.zzf(Integer.valueOf(zzcawVar.zzf()));
        zzs(zzdzlVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc("onAdImpression");
        zzs(zzdzlVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j10));
        zzdzlVar.zzc(Df.f40645f);
        zzs(zzdzlVar);
    }
}
