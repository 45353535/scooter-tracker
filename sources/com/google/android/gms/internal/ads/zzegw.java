package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzegw extends zzbzg {
    private final Context zza;
    private final zzgzy zzb;
    private final zzehe zzc;
    private final zzcqi zzd;
    private final ArrayDeque zze;
    private final zzfor zzf;
    private final zzcac zzg;

    public zzegw(Context context, zzgzy zzgzyVar, zzcac zzcacVar, zzcqi zzcqiVar, zzehe zzeheVar, ArrayDeque arrayDeque, zzehb zzehbVar, zzfor zzforVar) {
        zzbhe.zza(context);
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzg = zzcacVar;
        this.zzc = zzeheVar;
        this.zzd = zzcqiVar;
        this.zze = arrayDeque;
        this.zzf = zzforVar;
    }

    private static ListenableFuture zzm(final zzbzu zzbzuVar, zzfnu zzfnuVar, final zzfbz zzfbzVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfbzVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        };
        return zzfnuVar.zza(zzfno.GMS_SIGNALS, zzgzo.zza(zzbzuVar.zza)).zzc(zzgywVar).zzb(zzegl.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfnu zzfnuVar, zzbsz zzbszVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzbsp zzbspVarZza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, zzegq.zza);
        zzfon.zzb(listenableFuture, zzfoeVar);
        zzfnb zzfnbVarZzi = zzfnuVar.zza(zzfno.BUILD_URL, listenableFuture).zzc(zzbspVarZza).zzi();
        zzfon.zzf(zzfnbVarZzi, zzfooVar, zzfoeVar);
        return zzfnbVarZzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzbzl zzbzlVar, zzbzu zzbzuVar) {
        zzgzo.zzr(zzgzo.zzj(listenableFuture, new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgzo.zza(zzfkl.zza((InputStream) obj));
            }
        }, zzcei.zza), new zzegh(this, zzbzuVar, zzbzlVar), zzcei.zzg);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbjl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzegr zzegrVar) {
        zzp();
        this.zze.addLast(zzegrVar);
    }

    @Nullable
    private final synchronized zzegr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzegr zzegrVar = (zzegr) it.next();
            if (zzegrVar.zzc.equals(str)) {
                it.remove();
                return zzegrVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzbzu zzbzuVar, int i10) {
        zzegr zzegrVarZzr;
        zzfnb zzfnbVarZzi;
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i10);
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.response.normalize", zzegt.zzd, zzbsw.zzb);
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzegrVarZzr = zzr(zzbzuVar.zzh);
            if (zzegrVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzuVar.zzj;
            zzegrVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzegr zzegrVar = zzegrVarZzr;
        zzfoe zzfoeVarA = zzegrVar == null ? u0.a(context, 9) : zzegrVar.zzd;
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(zzbzuVar.zza.getStringArrayList("ad_types"));
        zzehd zzehdVar = new zzehd(zzbzuVar.zzg, zzfooVarZzf, zzfoeVarA);
        zzeha zzehaVar = new zzeha(context, zzbzuVar.zzb.afmaVersion, this.zzg, i10, null);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfoe zzfoeVarA2 = u0.a(context, 11);
        if (zzegrVar == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
            final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarA);
            zzfoe zzfoeVarA3 = u0.a(context, 10);
            final zzfnb zzfnbVarZzi2 = zzfnuVarZze.zzb(zzfno.HTTP, listenableFutureZzn, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbzw zzbzwVar = (zzbzw) listenableFutureZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.zzj());
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.zzk());
                    }
                    return new zzehc((JSONObject) listenableFutureZzm.get(), zzbzwVar);
                }
            }).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarA3)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi2, zzfooVarZzf, zzfoeVarA3);
            zzfon.zzb(zzfnbVarZzi2, zzfoeVarA2);
            zzfnbVarZzi = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, listenableFutureZzm, listenableFutureZzn, zzfnbVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzegt((zzegz) zzfnbVarZzi2.get(), (JSONObject) listenableFutureZzm.get(), (zzbzw) listenableFutureZzn.get());
                }
            }).zzc(zzbspVarZza).zzi();
        } else {
            zzehc zzehcVar = new zzehc(zzegrVar.zzb, zzegrVar.zza);
            zzfoe zzfoeVarA4 = u0.a(context, 10);
            final zzfnb zzfnbVarZzi3 = zzfnuVarZze.zza(zzfno.HTTP, zzgzo.zza(zzehcVar)).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarA4)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi3, zzfooVarZzf, zzfoeVarA4);
            final ListenableFuture listenableFutureZza = zzgzo.zza(zzegrVar);
            zzfon.zzb(zzfnbVarZzi3, zzfoeVarA2);
            zzfnbVarZzi = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, zzfnbVarZzi3, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzegz zzegzVar = (zzegz) zzfnbVarZzi3.get();
                    ListenableFuture listenableFuture = listenableFutureZza;
                    return new zzegt(zzegzVar, ((zzegr) listenableFuture.get()).zzb, ((zzegr) listenableFuture.get()).zza);
                }
            }).zzc(zzbspVarZza).zzi();
        }
        zzfon.zzd(zzfnbVarZzi, zzfooVarZzf, zzfoeVarA2);
        return zzfnbVarZzi;
    }

    public final ListenableFuture zzc(final zzbzu zzbzuVar, int i10) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzflg zzflgVar = zzbzuVar.zzi;
        if (zzflgVar == null) {
            return zzgzo.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzflgVar.zzc == 0 || zzflgVar.zzd == 0) {
            return zzgzo.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsz zzbszVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i10);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        final ListenableFuture listenableFutureZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        final zzfoe zzfoeVarA = u0.a(context, 9);
        final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarA);
        return zzfnuVarZze.zzb(zzfno.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(listenableFutureZzn, listenableFutureZzm, zzbzuVar, zzfoeVarA);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgzo.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgzo.zza(new zzegg(this));
        }
        return zzgzo.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzb = zzb(zzbzuVar, Binder.getCallingUid());
        zzo(listenableFutureZzb, zzbzlVar, zzbzuVar);
        if (((Boolean) zzbje.zzi.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        zzo(zzc(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        zzo(zzd(str), zzbzlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpA);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgrr.zza(zzgqq.zzc(',')).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzeha zzehaVar = new zzeha(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzegz zzegzVarZzb = zzehaVar.zza(new zzegy(str3, 30000, map, new byte[0], "", false));
                    if (zzegzVarZzb.zza != 200) {
                        int i10 = zzegzVarZzb.zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
                        sb2.append("Unexpected preconnect response: ");
                        sb2.append(i10);
                        throw new RemoteException(sb2.toString());
                    }
                } catch (Exception e10) {
                    throw new RemoteException(e10.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        if (((Boolean) zzbjt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbzdVar.zza;
            zzgzo.zzr(zzgzo.zza(null), new zzegf(this, zzbzmVar, zzbzdVar), zzcei.zzg);
        } else {
            try {
                zzbzmVar.zze("", zzbzdVar);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
            }
        }
    }

    public final ListenableFuture zzk(final zzbzu zzbzuVar, int i10) {
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Signal collection disabled."));
        }
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i10);
        final zzfba zzfbaVarZzd = zzfbzVarZzy.zzd();
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb);
        zzfoe zzfoeVarA = u0.a(context, 22);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfno zzfnoVar = zzfno.GET_SIGNALS;
        Bundle bundle = zzbzuVar.zza;
        zzfnb zzfnbVarZzi = zzfnuVarZze.zza(zzfnoVar, zzgzo.zza(bundle)).zzb(zzfon.zzc(zzfoeVarA)).zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                return zzfbaVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        }).zzj(zzfno.JS_SIGNALS).zzc(zzbspVarZza).zzi();
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfooVarZzf.zzd(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
        zzfon.zze(zzfnbVarZzi, zzfooVarZzf, zzfoeVarA);
        if (((Boolean) zzbje.zzj.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
        return zzfnbVarZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbzu zzbzuVar, zzfoe zzfoeVar) {
        String strZzi = ((zzbzw) listenableFuture.get()).zzi();
        zzq(new zzegr((zzbzw) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbzuVar.zzh, strZzi, zzfoeVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
