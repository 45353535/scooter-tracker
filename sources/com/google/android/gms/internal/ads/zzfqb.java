package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfqb {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgzz zzc;

    @Nullable
    private final zzfqc zzd;

    @Nullable
    private final zzclx zze;

    public zzfqb(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgzz zzgzzVar, @Nullable zzfqc zzfqcVar, @Nullable zzclx zzclxVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgzzVar;
        this.zzd = zzfqcVar;
        this.zze = zzclxVar;
    }

    private final ListenableFuture zze(final String str, final long j10, final int i10) {
        final String string;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i10 > zzxVar.zza()) {
            zzfqc zzfqcVar = this.zzd;
            if (zzfqcVar == null || !zzxVar.zzd()) {
                return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfqcVar.zza(str, "", 2);
            return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjS)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i10));
            String strValueOf = String.valueOf(builderClearQuery.build());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
            sb2.append(strValueOf);
            sb2.append(C4240b4.j.f42670c);
            sb2.append(encodedQuery);
            string = sb2.toString();
        } else {
            string = str;
        }
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfqa
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(i10, j10, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j10 == 0) {
            zzgzz zzgzzVar = this.zzc;
            return zzgzo.zzj(zzgzzVar.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpz
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(string);
                }
            }), zzgywVar, zzgzzVar);
        }
        zzgzz zzgzzVar2 = this.zzc;
        return zzgzo.zzj(zzgzzVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(string);
            }
        }, j10, TimeUnit.MILLISECONDS), zzgywVar, zzgzzVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzclx zzclxVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() || (zzclxVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzb.zzc(str, null);
        }
        String strZzb = zzclxVar.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), strZzb);
        }
        return this.zzb.zzc(str, map);
    }

    public final ListenableFuture zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    final /* synthetic */ ListenableFuture zzb(int i10, long j10, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgzo.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i10 != 1) {
            jZzb = (long) (zzxVar.zzc() * j10);
        }
        return zze(str, jZzb, i10 + 1);
    }
}
