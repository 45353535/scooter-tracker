package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfad implements zzfax {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfae zzc = new zzfae(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgzy zzd;
    private final ScheduledExecutorService zze;
    private final zzeqk zzf;
    private final Context zzg;
    private final zzfjk zzh;
    private final zzeqf zzi;
    private final zzdvp zzj;
    private final zzeam zzk;
    private final int zzl;

    zzfad(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeqk zzeqkVar, Context context, zzfjk zzfjkVar, zzeqf zzeqfVar, zzdvp zzdvpVar, zzeam zzeamVar, int i10) {
        this.zzd = zzgzyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeqkVar;
        this.zzg = context;
        this.zzh = zzfjkVar;
        this.zzi = zzeqfVar;
        this.zzj = zzdvpVar;
        this.zzk = zzeamVar;
        this.zzl = i10;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeqoVar.zze), zzg(str), zzeqoVar.zzb, zzeqoVar.zzc));
        }
    }

    @Nullable
    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgzg zzh(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgyv zzgyvVar = new zzgyv() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z10, z11);
            }
        };
        zzgzy zzgzyVar = this.zzd;
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzgzo.zzf(zzgyvVar, zzgzyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcf)).booleanValue()) {
            zzgzgVarZzw = (zzgzg) zzgzo.zzi(zzgzgVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzezz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i10 = zzfad.zzb;
                String str2 = str;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoz)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgzyVar);
    }

    private final void zzi(zzbvs zzbvsVar, Bundle bundle, @NonNull List list, zzeqn zzeqnVar) throws RemoteException {
        zzbvsVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        if (this.zzl == 2) {
            return zzgzo.zza(zzc);
        }
        zzfjk zzfjkVar = this.zzh;
        if (zzfjkVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcl)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)))) {
                return zzgzo.zza(zzc);
            }
        }
        return zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzgyv
            public final /* synthetic */ ListenableFuture zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ ListenableFuture zzc() {
        final String str;
        zzfad zzfadVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcj)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcs)).booleanValue()) {
            zzfadVar = this;
            zzf(arrayList, zzfadVar.zzf.zzd(zzfadVar.zza, lowerCase));
        } else {
            zzeqk zzeqkVar = this.zzf;
            for (Map.Entry entry : zzeqkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzfadVar = this;
            zzf(arrayList, zzeqkVar.zzb());
        }
        return zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i10 = zzfad.zzb;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzfae(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfc)).booleanValue()) {
                    return new zzfae(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzfadVar.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcen r3 = new com.google.android.gms.internal.ads.zzcen
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbgv r12 = com.google.android.gms.internal.ads.zzbhe.zzck
            com.google.android.gms.internal.ads.zzbhc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzd(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzeqf r12 = r7.zzi
            r12.zza(r8)
            com.google.android.gms.internal.ads.zzbvs r12 = r12.zzb(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdvp r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbvs r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.zzbgv r9 = com.google.android.gms.internal.ads.zzbhe.zzca
            com.google.android.gms.internal.ads.zzbhc r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r10.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            com.google.android.gms.internal.ads.zzeqn.zzd(r8, r3)
            r1 = r7
            goto Lbb
        L4e:
            throw r1
        L4f:
            com.google.android.gms.internal.ads.zzeqn r0 = new com.google.android.gms.internal.ads.zzeqn
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzt.zzk()
            long r4 = r12.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbgv r8 = com.google.android.gms.internal.ads.zzbhe.zzcf
            com.google.android.gms.internal.ads.zzbhc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r12.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzfac r12 = new com.google.android.gms.internal.ads.zzfac
            r12.<init>()
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzbY
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8b:
            if (r11 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbgv r8 = com.google.android.gms.internal.ads.zzbhe.zzcm
            com.google.android.gms.internal.ads.zzbhc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r11.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzgzy r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzfaa r0 = new com.google.android.gms.internal.ads.zzfaa
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lbb
        Lb0:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.zzi(r2, r8, r4, r0)
            goto Lbb
        Lb7:
            r1 = r7
            r0.zzb()
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfad.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    final /* synthetic */ void zze(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        try {
            zzi(zzbvsVar, bundle, list, zzeqnVar);
        } catch (RemoteException e10) {
            zzcenVar.zzd(e10);
        }
    }
}
