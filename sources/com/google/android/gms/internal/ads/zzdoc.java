package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdoc extends zzcwf {
    public static final zzguf zzc = zzguf.zzn("3010", "3008", com.taurusx.tax.w.s.s.f67500f, com.taurusx.tax.w.s.s.f67516v, "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdoh zze;
    private final zzdop zzf;
    private final zzdpg zzg;
    private final zzdom zzh;
    private final zzdor zzi;
    private final zzika zzj;
    private final zzika zzk;
    private final zzika zzl;
    private final zzika zzm;
    private final zzika zzn;

    @Nullable
    private zzdqe zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzccn zzt;
    private final zzazh zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdoe zzx;
    private final zzers zzy;
    private final Map zzz;

    public zzdoc(zzcwe zzcweVar, Executor executor, zzdoh zzdohVar, zzdop zzdopVar, zzdpg zzdpgVar, zzdom zzdomVar, zzdor zzdorVar, zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, zzika zzikaVar4, zzika zzikaVar5, zzccn zzccnVar, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, Context context, zzdoe zzdoeVar, zzers zzersVar, zzbdh zzbdhVar) {
        super(zzcweVar);
        this.zzd = executor;
        this.zze = zzdohVar;
        this.zzf = zzdopVar;
        this.zzg = zzdpgVar;
        this.zzh = zzdomVar;
        this.zzi = zzdorVar;
        this.zzj = zzikaVar;
        this.zzk = zzikaVar2;
        this.zzl = zzikaVar3;
        this.zzm = zzikaVar4;
        this.zzn = zzikaVar5;
        this.zzt = zzccnVar;
        this.zzu = zzazhVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdoeVar;
        this.zzy = zzersVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmb)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzA >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmc)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdqe zzdqeVar) {
        Iterator<String> itKeys;
        View view;
        zzazc zzazcVarZzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdqeVar;
                this.zzg.zza(zzdqeVar);
                this.zzf.zza(zzdqeVar.zzdE(), zzdqeVar.zzk(), zzdqeVar.zzl(), zzdqeVar, zzdqeVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdq)).booleanValue() && (zzazcVarZzb = this.zzu.zzb()) != null) {
                    zzazcVarZzb.zzh(zzdqeVar.zzdE());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcq)).booleanValue()) {
                    zzfir zzfirVar = this.zzb;
                    if (zzfirVar.zzak && (itKeys = zzfirVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdqe zzdqeVar2 = this.zzo;
                            WeakReference weakReference = zzdqeVar2 == null ? null : (WeakReference) zzdqeVar2.zzj().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbdg zzbdgVar = new zzbdg(this.zzw, view);
                                this.zzA.add(zzbdgVar);
                                zzbdgVar.zza(new zzdnr(this, next));
                            }
                        }
                    }
                }
                if (zzdqeVar.zzh() != null) {
                    zzdqeVar.zzh().zza(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdqe zzdqeVar) {
        this.zzf.zzb(zzdqeVar.zzdE(), zzdqeVar.zzj());
        if (zzdqeVar.zzdA() != null) {
            zzdqeVar.zzdA().setClickable(false);
            zzdqeVar.zzdA().removeAllViews();
        }
        if (zzdqeVar.zzh() != null) {
            zzdqeVar.zzh().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpc)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpd)).booleanValue()) {
                zzbgv zzbgvVar = zzbhe.zzpe;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).floatValue();
                    if (viewZzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    @Nullable
    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzguf zzgufVar = zzc;
            int size = zzgufVar.size();
            int i10 = 0;
            while (i10 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgufVar.get(i10));
                i10++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzah() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzo = zzdqeVar.zzo();
        if (iObjectWrapperZzo != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzo);
        }
        return zzdpg.zza;
    }

    private final void zzai(String str, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzX = this.zze.zzX();
        if (listenableFutureZzX == null) {
            return;
        }
        zzgzo.zzr(listenableFutureZzX, new zzdns(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, @Nullable zzekb zzekbVar) {
        zzcjl zzcjlVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzekbVar == null || zzcjlVarZzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    public final synchronized void zzA(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzr(zzdjVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzs(zzdfVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = zzdqeVar instanceof zzdpa;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z10);
                }
            });
        }
    }

    public final synchronized void zzE(@Nullable final View view, final int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmX)).booleanValue()) {
            zzdqe zzdqeVar = this.zzo;
            if (zzdqeVar == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = zzdqeVar instanceof zzdpa;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdny
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z10, i10);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    @Nullable
    public final zzekb zzL(String str, boolean z10) {
        boolean z11;
        String str2;
        zzejx zzejxVar;
        zzejy zzejyVar;
        zzdom zzdomVar = this.zzh;
        if (zzdomVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdoh zzdohVar = this.zze;
            zzcjl zzcjlVarZzW = zzdohVar.zzW();
            zzcjl zzcjlVarZzT = zzdohVar.zzT();
            if (zzcjlVarZzW == null && zzcjlVarZzT == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdomVar.zzg();
            int iZzc = zzdomVar.zzg().zzc();
            int i11 = iZzc - 1;
            boolean z12 = false;
            if (i11 != 0) {
                if (i11 != 1) {
                    String str3 = iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    StringBuilder sb2 = new StringBuilder(str3.length() + 49);
                    sb2.append("Unknown omid media type: ");
                    sb2.append(str3);
                    sb2.append(". Not initializing Omid.");
                    String string = sb2.toString();
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return null;
                }
                if (zzcjlVarZzW == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z12 = true;
            } else if (zzcjlVarZzT != null) {
                z11 = true;
            } else {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z12) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcjlVarZzW = zzcjlVarZzT;
            }
            if (zzcjlVarZzW == null) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i17 = versionInfoParcel.buddyApkVersion;
            int i18 = versionInfoParcel.clientJarVersion;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i17).length() + 1 + String.valueOf(i18).length());
            sb3.append(i17);
            sb3.append(".");
            sb3.append(i18);
            String string2 = sb3.toString();
            if (z11) {
                zzejxVar = zzejx.VIDEO;
                zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
            } else {
                zzejxVar = zzejx.NATIVE_DISPLAY;
                zzejyVar = zzdohVar.zzx() == 3 ? zzejy.UNSPECIFIED : zzejy.ONE_PIXEL;
            }
            zzekb zzekbVarZzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(string2, zzcjlVarZzW.zzD(), "", "javascript", str2, str, zzejyVar, zzejxVar, this.zzb.zzal);
            if (zzekbVarZzd == null) {
                int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdohVar.zzq(zzekbVarZzd);
            zzcjlVarZzW.zzak(zzekbVarZzd);
            if (z11) {
                zzfsj zzfsjVarZza = zzekbVarZzd.zza();
                if (zzcjlVarZzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfsjVarZza, zzcjlVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z10) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzekbVarZzd.zza());
                zzcjlVarZzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzekbVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzx() != 3) {
                zzcen zzcenVarZzY = zzdohVar.zzY();
                if (zzcenVarZzY == null) {
                    return;
                }
                zzgzo.zzr(zzcenVarZzY, new zzdnt(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzekb zzekbVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzekbVarZzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzekbVarZzZ.zza(), view);
    }

    public final zzdoe zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcjl zzcjlVarZzT = this.zze.zzT();
        if (zzcjlVarZzT == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzguf zzgufVar = zzdoc.zzc;
                    zzcjlVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e10);
        }
    }

    final /* synthetic */ void zzS() {
        try {
            zzdoh zzdohVar = this.zze;
            int iZzx = zzdohVar.zzx();
            if (iZzx == 1) {
                zzblt zzbltVarZza = this.zzi.zza();
                if (zzbltVarZza != null) {
                    zzai("Google", true);
                    zzbltVarZza.zze((zzblj) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzblq zzblqVarZzb = this.zzi.zzb();
                if (zzblqVarZzb != null) {
                    zzai("Google", true);
                    zzblqVarZzb.zze((zzblh) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzblz zzblzVarZzf = this.zzi.zzf(zzdohVar.zzS());
                if (zzblzVarZzf != null) {
                    if (zzdohVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzblzVarZzf.zze((zzblm) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbmg zzbmgVarZzc = this.zzi.zzc();
                if (zzbmgVarZzc != null) {
                    zzai("Google", true);
                    zzbmgVarZzc.zze((zzbmm) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbrb zzbrbVarZze = this.zzi.zze();
                if (zzbrbVarZze != null) {
                    zzbrbVarZze.zze((zzbqv) this.zzm.zzb());
                }
            }
        } catch (RemoteException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e10);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z10) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(null, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z10, zzah(), 0);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z10, int i10) {
        zzdqe zzdqeVar = this.zzo;
        if (zzdqeVar != null) {
            this.zzf.zzf(view, zzdqeVar.zzdE(), this.zzo.zzj(), this.zzo.zzk(), z10, zzah(), i10);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdoh zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdqe zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdqe zzdqeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzco)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdqeVar);
                }
            });
        } else {
            zzU(zzdqeVar);
        }
    }

    public final synchronized void zzh(final zzdqe zzdqeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzco)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdqeVar);
                }
            });
        } else {
            zzV(zzdqeVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z10) {
        zzcjl zzcjlVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z10, zzah());
        if (this.zzs) {
            zzdoh zzdohVar = this.zze;
            if (zzdohVar.zzT() != null && (zzcjlVarZzT = zzdohVar.zzT()) != null) {
                zzcjlVarZzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    @AnyThread
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdop zzdopVar = this.zzf;
            Objects.requireNonNull(zzdopVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdob
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdopVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzu(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzcq     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfir r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzeL     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbhc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzd(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzI(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdoc.zzu(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbmj zzbmjVar) {
        this.zzf.zzp(zzbmjVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
