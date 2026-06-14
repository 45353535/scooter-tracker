package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfon {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzke), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(listenableFuture), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static zzfmu zzc(final zzfoe zzfoeVar) {
        return new zzfmu() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfoeVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(listenableFuture, zzfooVar, zzfoeVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(listenableFuture, zzfooVar, zzfoeVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(listenableFuture), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    public static int zzg(zzfjk zzfjkVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z10) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(listenableFuture), new zzfok(zzfooVar, zzfoeVar, z10), zzcei.zzg);
        }
    }
}
