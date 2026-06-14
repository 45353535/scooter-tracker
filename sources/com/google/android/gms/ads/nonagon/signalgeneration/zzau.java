package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzau extends zzcdc {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbij zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcma zzf;
    private Context zzg;
    private final zzazh zzh;
    private final zzfjo zzi;
    private final zzfkj zzj;
    private final zzgzy zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbyk zzm;
    private final zzdye zzp;
    private final zzfqk zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzii)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzih)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzik)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzim)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzil);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzin);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzio);

    zzau(zzcma zzcmaVar, Context context, zzazh zzazhVar, zzfkj zzfkjVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzdye zzdyeVar, zzfqk zzfqkVar, VersionInfoParcel versionInfoParcel, zzbij zzbijVar, zzfjo zzfjoVar, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = zzcmaVar;
        this.zzg = context;
        this.zzh = zzazhVar;
        this.zzi = zzfjoVar;
        this.zzj = zzfkjVar;
        this.zzk = zzgzyVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdyeVar;
        this.zzq = zzfqkVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbijVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzip)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziq));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzir));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzis));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzit));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbyh zzbyhVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        zzgzy zzgzyVar = this.zzk;
        ListenableFuture listenableFutureZzc = zzgzyVar.zzc(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureZzc = zzgzo.zzj(listenableFutureZzc, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzp((ArrayList) obj);
                }
            }, zzgzyVar);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzgzo.zzr(listenableFutureZzc, new zzae(this, zzbyhVar, z10), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbyh zzbyhVar, boolean z10) {
        ListenableFuture listenableFutureZzc;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i11++;
            }
        }
        if (i11 > 1) {
            String strValueOf = String.valueOf(list);
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzgzy zzgzyVar = this.zzk;
                listenableFutureZzc = zzgzyVar.zzc(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureZzc = zzgzo.zzj(listenableFutureZzc, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzr((Uri) obj);
                        }
                    }, zzgzyVar);
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                listenableFutureZzc = zzgzo.zza(uri);
            }
            arrayList.add(listenableFutureZzc);
        }
        zzgzo.zzr(zzgzo.zzm(arrayList), new zzaf(this, zzbyhVar, z10), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkZ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlc)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlg)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzau zzauVar;
        ListenableFuture listenableFutureZza;
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
            listenableFutureZza = zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // com.google.android.gms.internal.ads.zzgyv
                public final /* synthetic */ ListenableFuture zza() {
                    return this.zza.zzs();
                }
            }, zzcei.zza);
            zzauVar = this;
        } else {
            zzauVar = this;
            listenableFutureZza = zzauVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
        }
        zzgzo.zzr(listenableFutureZza, new zzag(this), zzauVar.zzf.zzb());
    }

    private static boolean zzV(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzW(android.content.Context r11, java.lang.String r12, java.lang.String r13, com.google.android.gms.ads.internal.client.zzr r14, com.google.android.gms.ads.internal.client.zzm r15, int r16, @androidx.annotation.Nullable java.lang.String r17, android.os.Bundle r18, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcdh r19) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzW(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzcdh):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final ListenableFuture zzX(final String str) {
        final zzdtk[] zzdtkVarArr = new zzdtk[1];
        ListenableFuture listenableFutureZzb = this.zzj.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzu(zzdtkVarArr, str, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzk;
        ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFutureZzb, zzgywVar, zzgzyVar);
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzv(zzdtkVarArr);
            }
        }, zzgzyVar);
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzi(zzgzg.zzw(listenableFutureZzj), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziG)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzaq.zza, zzgzyVar), Exception.class, zzar.zza, zzgzyVar);
    }

    private final boolean zzY() {
        Map map;
        zzbyk zzbykVar = this.zzm;
        return (zzbykVar == null || (map = zzbykVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i10) + str + C4240b4.j.f42668b + str2 + C4240b4.j.f42670c + string.substring(i10));
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, StringUtils.COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgrt.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ zzfoo zzy(ListenableFuture listenableFuture, zzcdh zzcdhVar) {
        if (!zzfor.zza() || !((Boolean) zzbix.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfoo zzfooVarZzb = ((zzac) zzgzo.zzs(listenableFuture)).zzb();
            zzfooVarZzb.zzb(new ArrayList(Collections.singletonList(zzcdhVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
            zzfooVarZzb.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzfooVarZzb.zzd(zzmVar.zzm);
            return zzfooVarZzb;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ zzdye zzA() {
        return this.zzp;
    }

    final /* synthetic */ zzfqk zzB() {
        return this.zzq;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    final /* synthetic */ String zzG() {
        return this.zzv;
    }

    final /* synthetic */ String zzH() {
        return this.zzw;
    }

    final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    final /* synthetic */ String zzK() {
        return this.zzz;
    }

    final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    final /* synthetic */ String zzM() {
        return this.zzA;
    }

    final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    @VisibleForTesting
    final boolean zzc(@NonNull Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    @VisibleForTesting
    final boolean zzd(@NonNull Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    @Override // com.google.android.gms.internal.ads.zzcdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r11, final com.google.android.gms.internal.ads.zzcdh r12, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcda r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zze(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzcdh, com.google.android.gms.internal.ads.zzcda):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbyk zzbykVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbykVar == null ? null : zzbykVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzR(list, iObjectWrapper, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzS(list, iObjectWrapper, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) {
        this.zzm = zzbykVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkY)).booleanValue()) {
            zzbgv zzbgvVar = zzbhe.zziw;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcei.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzli)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                zzfVar.zza(webView);
                if (((Boolean) zzbjj.zzd.zze()).booleanValue()) {
                    zzcei.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzjVar.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlj)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzR(list, iObjectWrapper, zzbyhVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzS(list, iObjectWrapper, zzbyhVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlm)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbij zzbijVar = this.zzI;
        zzbijVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbijVar.zzb());
    }

    final /* synthetic */ zzac zzn(zzcdh zzcdhVar, int i10, Bundle bundle) {
        return zzW(this.zzg, zzcdhVar.zza, zzcdhVar.zzb, zzcdhVar.zzc, zzcdhVar.zzd, i10, zzcdhVar.zzf, bundle, zzcdhVar);
    }

    final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzazh zzazhVar = this.zzh;
        String strZzj = zzazhVar.zzb() != null ? zzazhVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzp(final ArrayList arrayList) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgqt() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfjo zzfjoVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfjoVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzazi e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ ListenableFuture zzr(final Uri uri) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgqt(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ ListenableFuture zzs() {
        return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzu(zzdtk[] zzdtkVarArr, String str, zzdtk zzdtkVar) throws JSONException {
        zzdtkVarArr[0] = zzdtkVar;
        Context context = this.zzg;
        zzbyk zzbykVar = this.zzm;
        Map map = zzbykVar.zzb;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbykVar.zza, null);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdtkVar.zzc(str, jSONObject);
    }

    final /* synthetic */ void zzv(zzdtk[] zzdtkVarArr) {
        zzdtk zzdtkVar = zzdtkVarArr[0];
        if (zzdtkVar != null) {
            this.zzj.zzc(zzgzo.zza(zzdtkVar));
        }
    }

    final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}
