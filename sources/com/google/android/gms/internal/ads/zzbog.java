package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbog {
    public static final zzboh zza = zzbof.zza;
    public static final zzboh zzb = zzbnw.zza;
    public static final zzboh zzc = zzbnx.zza;
    public static final zzboh zzd = new zzbno();
    public static final zzboh zze = new zzbnp();
    public static final zzboh zzf = zzboc.zza;
    public static final zzboh zzg = new zzbnq();
    public static final zzboh zzh = new zzbnr();
    public static final zzboh zzi = zzbod.zza;
    public static final zzboh zzj = new zzbns();
    public static final zzboh zzk = new zzbnt();
    public static final zzboh zzl = new zzchf();
    public static final zzboh zzm = new zzchg();
    public static final zzboh zzn = new zzbna();
    public static final zzboy zzo = new zzboy();
    public static final zzboh zzp = new zzbnu();
    public static final zzboh zzq = new zzbnv();
    public static final zzboh zzr = new zzbnb();
    public static final zzboh zzs = new zzbnc();
    public static final zzboh zzt = new zzbnd();
    public static final zzboh zzu = new zzbne();
    public static final zzboh zzv = new zzbnf();
    public static final zzboh zzw = new zzbng();
    public static final zzboh zzx = new zzbnh();
    public static final zzboh zzy = new zzbni();
    public static final zzboh zzz = new zzbnj();
    public static final zzboh zzA = new zzbnk();
    public static final zzboh zzB = new zzbnm();
    public static final zzboh zzC = new zzbnn();

    public static ListenableFuture zza(zzcjl zzcjlVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzazh zzazhVarZzS = zzcjlVar.zzS();
            zzfjo zzfjoVarZzT = zzcjlVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVarZzT == null) {
                if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                    uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
                }
            } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), zzcjlVar.zzE(), zzcjlVar.zzj());
            }
        } catch (zzazi unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcjlVar.zzC() != null) {
            map = zzcjlVar.zzC().zzaw;
        }
        final String strZzb = zzccs.zzb(uriZzd, zzcjlVar.getContext(), map);
        long jLongValue = ((Long) zzbjd.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return zzgzo.zza(strZzb);
        }
        zzgzg zzgzgVarZzw = zzgzg.zzw(zzcjlVar.zzaF());
        zzbny zzbnyVar = zzbny.zza;
        zzgzy zzgzyVar = zzcei.zzg;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzbnyVar, zzgzyVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzbnz
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzgqt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzboh r0 = com.google.android.gms.internal.ads.zzbog.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbjd.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbjd.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnz.apply(java.lang.Object):java.lang.Object");
            }
        }, zzgzyVar), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                zzboh zzbohVar = zzbog.zza;
                if (((Boolean) zzbjd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgzyVar);
    }

    public static zzboh zzb(final zzdjm zzdjmVar, final zzcrv zzcrvVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzbob
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjmVar);
                final String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcrv zzcrvVar2 = zzcrvVar;
                zzgzg zzgzgVarZzw = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
                zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzboe
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj2) {
                        zzcrv zzcrvVar3;
                        String str2 = (String) obj2;
                        zzboh zzbohVar = zzbog.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar3 = zzcrvVar2) != null && zzcrv.zzc(str)) ? zzcrvVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(str2);
                    }
                };
                zzgzy zzgzyVar = zzcei.zza;
                zzgzo.zzr((zzgzg) zzgzo.zzj(zzgzgVarZzw, zzgywVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
            }
        };
    }

    public static void zzc(Map map, zzdjm zzdjmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmi)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:56|8|9)|(12:66|11|12|(10:18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(2:32|(1:34)))|35|60|36|(1:41)(1:42)|64|43|71|49)(1:16)|15|(0)|35|60|36|(0)(0)|64|43|71|49|6) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzckx r17, java.util.Map r18) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zze(com.google.android.gms.internal.ads.zzckx, java.util.Map):void");
    }
}
