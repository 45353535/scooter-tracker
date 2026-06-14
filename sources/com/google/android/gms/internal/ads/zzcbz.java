package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcbz implements zzcce {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = DesugarCollections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzifv zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccb zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbz(Context context, VersionInfoParcel versionInfoParcel, zzccb zzccbVar, @Nullable String str, zzcca zzccaVar) {
        Preconditions.checkNotNull(zzccbVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzccbVar;
        Iterator it = zzccbVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzifv zzifvVarZzg = zzihz.zzg();
        zzifvVarZzg.zzn(9);
        if (str != null) {
            zzifvVarZzg.zzb(str);
            zzifvVarZzg.zzc(str);
        }
        zzifw zzifwVarZzc = zzifx.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzifwVarZzc.zza(str2);
        }
        zzifvVarZzg.zzd((zzifx) zzifwVarZzc.zzbu());
        zzihl zzihlVarZzc = zzihm.zzc();
        zzihlVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzihlVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzihlVarZzc.zzb(apkVersion);
        }
        zzifvVarZzg.zzk((zzihm) zzihlVarZzc.zzbu());
        this.zzd = zzifvVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final zzccb zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e10) {
                        e = e10;
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e12) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e12);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzccd.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zze(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i10 == 3) {
                    ((zzihj) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzihj zzihjVarZze = zzihk.zze();
            int iZza = zzihi.zza(i10);
            if (iZza != 0) {
                zzihjVarZze.zze(iZza);
            }
            zzihjVarZze.zza(linkedHashMap.size());
            zzihjVarZze.zzb(str);
            zzigi zzigiVarZzc = zzigl.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzigg zziggVarZzc = zzigh.zzc();
                        zziggVarZzc.zza(zzian.zzv(str2));
                        zziggVarZzc.zzb(zzian.zzv(str3));
                        zzigiVarZzc.zza((zzigh) zziggVarZzc.zzbu());
                    }
                }
            }
            zzihjVarZze.zzc((zzigl) zzigiVarZzc.zzbu());
            linkedHashMap.put(str, zzihjVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZza = zzgzo.zza(Collections.EMPTY_MAP);
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcbv
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgzy zzgzyVar = zzcei.zzg;
            ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFutureZza, zzgywVar, zzgzyVar);
            ListenableFuture listenableFutureZzi = zzgzo.zzi(listenableFutureZzj, 10L, TimeUnit.SECONDS, zzcei.zzd);
            zzgzo.zzr(listenableFutureZzj, new zzcbu(this, listenableFutureZzi), zzgzyVar);
            zzc.add(listenableFutureZzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zziam zziamVarZzA = zzian.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zziamVarZzA);
        synchronized (this.zzj) {
            zzifv zzifvVar = this.zzd;
            zzihd zzihdVarZzc = zzihf.zzc();
            zzihdVarZzc.zzb(zziamVarZzA.zza());
            zzihdVarZzc.zza(MimeTypes.IMAGE_PNG);
            zzihdVarZzc.zzc(2);
            zzifvVar.zzj((zzihf) zzihdVarZzc.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzihj zzihjVar;
        ListenableFuture listenableFutureZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzihjVar = (zzihj) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzihjVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                            sb2.append("Cannot find the corresponding resource object for ");
                            sb2.append(str);
                            zzccd.zza(sb2.toString());
                        } else {
                            for (int i10 = 0; i10 < length; i10++) {
                                zzihjVar.zzd(jSONArrayOptJSONArray.getJSONObject(i10).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbjm.zza.zze()).booleanValue()) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e10);
                }
                return zzgzo.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z10 = this.zza;
        if (!(z10 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z10 || !this.zzi.zzd))) {
            return zzgzo.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzihk) ((zzihj) it.next()).zzbu());
                }
                zzifv zzifvVar = this.zzd;
                zzifvVar.zzl(this.zzf);
                zzifvVar.zzm(this.zzg);
                if (zzccd.zzb()) {
                    String strZza = zzifvVar.zza();
                    String strZzg = zzifvVar.zzg();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb3.append("Sending SB report\n  url: ");
                    sb3.append(strZza);
                    sb3.append("\n  clickUrl: ");
                    sb3.append(strZzg);
                    sb3.append("\n  resources: \n");
                    StringBuilder sb4 = new StringBuilder(sb3.toString());
                    for (zzihk zzihkVar : zzifvVar.zze()) {
                        sb4.append("    [");
                        sb4.append(zzihkVar.zzd());
                        sb4.append("] ");
                        sb4.append(zzihkVar.zzc());
                    }
                    zzccd.zza(sb4.toString());
                }
                ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzihz) zzifvVar.zzbu()).zzaN());
                if (zzccd.zzb()) {
                    listenableFutureZzb.addListener(zzcbx.zza, zzcei.zza);
                }
                listenableFutureZzk = zzgzo.zzk(listenableFutureZzb, zzcbw.zza, zzcei.zzg);
            } finally {
            }
        }
        return listenableFutureZzk;
    }
}
