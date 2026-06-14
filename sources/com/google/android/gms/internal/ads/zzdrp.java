package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4257c4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdrp {
    private final Context zza;
    private final zzdqv zzb;
    private final zzazh zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbgd zzf;
    private final Executor zzg;
    private final zzbkh zzh;
    private final zzdsh zzi;
    private final zzduv zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtq zzl;
    private final zzdxz zzm;
    private final zzfqk zzn;
    private final zzeiu zzo;
    private final zzejf zzp;
    private final zzfjo zzq;
    private final zzdxt zzr;
    private final zzdzc zzs;

    public zzdrp(Context context, zzdqv zzdqvVar, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, Executor executor, zzfjk zzfjkVar, zzdsh zzdshVar, zzduv zzduvVar, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = context;
        this.zzb = zzdqvVar;
        this.zzc = zzazhVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbgdVar;
        this.zzg = executor;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzdshVar;
        this.zzj = zzduvVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxzVar;
        this.zzn = zzfqkVar;
        this.zzo = zzeiuVar;
        this.zzl = zzdtqVar;
        this.zzp = zzejfVar;
        this.zzq = zzfjoVar;
        this.zzr = zzdxtVar;
        this.zzs = zzdzcVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzguf.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzguf.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i10));
            if (zzezVarZzt != null) {
                arrayList.add(zzezVarZzt);
            }
        }
        return zzguf.zzq(arrayList);
    }

    private final ListenableFuture zzm(@Nullable JSONArray jSONArray, boolean z10, boolean z11, zzdxh zzdxhVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgzo.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10, null));
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdro.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.util.concurrent.ListenableFuture zzn(@androidx.annotation.Nullable org.json.JSONObject r14, boolean r15, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzdxh r16) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrp.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdxh):com.google.common.util.concurrent.ListenableFuture");
    }

    @Nullable
    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfirVar, zzfiuVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcceVar);
        return zzgzo.zzj(listenableFutureZzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzenv {
                zzcjl zzcjlVar = (zzcjl) obj;
                if (zzcjlVar == null || zzcjlVar.zzh() == null) {
                    throw new zzenv(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcei.zzg);
    }

    private static ListenableFuture zzq(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgzo.zzh(listenableFuture, Exception.class, new zzgyw(obj2) { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgzo.zza(null);
            }
        }, zzcei.zzg);
    }

    private static ListenableFuture zzr(boolean z10, final ListenableFuture listenableFuture, Object obj) {
        return z10 ? zzgzo.zzj(listenableFuture, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzgzo.zzc(new zzenv(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcei.zzg) : zzq(listenableFuture, null);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i10 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i10, i11));
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzez zzt(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, @Nullable zzdxh zzdxhVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdxhVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        zzbkh zzbkhVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbkhVar.zzb, zzbkhVar.zzd, zzdxhVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfir zzfirVar, final zzfiu zzfiuVar, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzcce zzcceVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlx)).booleanValue()) {
            return zzgzo.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgzo.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeP))) {
                return zzgzo.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzj = zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzrVarZzs, zzfirVar, zzfiuVar, zzbVar, zzcceVar, strOptString, strOptString2, obj);
            }
        }, zzcei.zzf);
        return zzgzo.zzj(listenableFutureZzj, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzenv {
                if (((zzcjl) obj) != null) {
                    return listenableFutureZzj;
                }
                throw new zzenv(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcei.zzg);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4257c4.f42799c);
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgzo.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdxhVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzcce zzcceVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgzo.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(strOptString, zzcceVar, zzbVar, obj);
            }
        }, zzcei.zzf);
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcen zzcenVar = new zzcen();
        zzgzo.zzr(listenableFuture, new zzdrd(this, zzcenVar), zzcei.zzf);
        return zzcenVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        ListenableFuture listenableFutureZza;
        zzdrp zzdrpVar;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", com.taurusx.tax.w.o.w.f67354a);
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlw)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z10 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z10) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzcceVar);
                zzdrpVar = this;
            }
            return zzq(zzgzo.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, zzdrpVar.zzk), null);
        }
        if (!z10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzgzo.zza(null);
        }
        zzdrpVar = this;
        listenableFutureZza = zzdrpVar.zzp(jSONObjectOptJSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        return zzq(zzgzo.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, zzdrpVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, String str, String str2, Object obj) throws zzcka {
        zzdzc zzdzcVar;
        zzcjl zzcjlVarZza = this.zzj.zza(zzrVar, zzfirVar, zzfiuVar);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzdtn zzdtnVarZza = this.zzl.zza();
        zzclj zzcljVarZzP = zzcjlVarZza.zzP();
        zzbgv zzbgvVar = zzbhe.zzpf;
        zzcljVarZzP.zzab(zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzo, this.zzn, this.zzm, null, zzdtnVarZza, null, null, null, null, null, null, null);
        zzcjlVarZza.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zzcjlVarZza.zzab("/getNativeClickMeta", zzbog.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziR)).booleanValue() && (zzdzcVar = this.zzs) != null) {
                zzcjlVarZza.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
            }
        }
        zzcjlVarZza.zzP().zzS(true);
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z10, int i10, String str3, String str4) {
                zzcem zzcemVar = zzcemVarZza;
                if (z10) {
                    zzcemVar.zzb();
                    return;
                }
                int length = String.valueOf(i10).length();
                StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Image Web View failed to load. Error code: ");
                sb2.append(i10);
                sb2.append(", Description: ");
                sb2.append(str3);
                sb2.append(", Failing URL: ");
                sb2.append(str4);
                zzcemVar.zzd(new zzenv(1, sb2.toString()));
            }
        });
        zzcjlVarZza.zzau(str, str2, null);
        return zzcemVarZza;
    }

    final /* synthetic */ zzbka zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbka(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcce zzcceVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzcka {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzejf zzejfVar = this.zzp;
        zzcjl zzcjlVarZza = zzckb.zza(context, zzclv.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzejfVar, this.zzq, this.zzm);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z10, int i10, String str2, String str3) {
                zzcemVarZza.zzb();
            }
        });
        zzcjlVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            if (zzcceVar != null) {
                zzcjlVarZza.zzP().zzj(zzcceVar);
            }
            zzcjlVarZza.zzP().zzi(zzbVar);
        }
        return zzcemVarZza;
    }
}
