package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzgrt;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zze;

    @Nullable
    private zzep zzb;

    @Nullable
    private zzfb zzc;

    @Nullable
    private zzeo zzd;

    @Nullable
    private zzdb zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzm = null;

    @NonNull
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzB(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqg zzbqgVar = (zzbqg) it.next();
            map.put(zzbqgVar.zza, new zzbqo(zzbqgVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqgVar.zzd, zzbqgVar.zzc));
        }
        return new zzbqp(map);
    }

    private final void zzC(@NonNull RequestConfiguration requestConfiguration) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zzr(new zzfv(requestConfiguration));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
        }
    }

    private final void zzD(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(@Nullable String str) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zze();
            this.zzl.zzj(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public static zzex zzb() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (zze == null) {
                    zze = new zzex();
                }
                zzexVar = zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzexVar;
    }

    final /* synthetic */ OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    @Nullable
    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.zzb;
        }
        if (iOrdinal == 2) {
            return this.zzc;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, RemoteException -> 0x0051, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, RemoteException -> 0x0051, blocks: (B:26:0x0034, B:28:0x003b, B:33:0x0053, B:35:0x005c, B:40:0x006f, B:42:0x0080, B:44:0x0092, B:51:0x00d5, B:52:0x00ea, B:45:0x00a2, B:47:0x00b0, B:49:0x00c2, B:50:0x00cd, B:37:0x0064, B:39:0x006a), top: B:60:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.content.Context r3, @androidx.annotation.Nullable java.lang.String r4, @androidx.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzex.zzc(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028 A[Catch: all -> 0x0019, TryCatch #1 {, blocks: (B:9:0x0011, B:11:0x0015, B:17:0x0021, B:19:0x0028, B:20:0x002d, B:22:0x0031, B:23:0x0036, B:25:0x003a, B:26:0x003f, B:16:0x001c), top: B:35:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[Catch: all -> 0x0019, TryCatch #1 {, blocks: (B:9:0x0011, B:11:0x0015, B:17:0x0021, B:19:0x0028, B:20:0x002d, B:22:0x0031, B:23:0x0036, B:25:0x003a, B:26:0x003f, B:16:0x001c), top: B:35:0x0011, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a A[Catch: all -> 0x0019, TryCatch #1 {, blocks: (B:9:0x0011, B:11:0x0015, B:17:0x0021, B:19:0x0028, B:20:0x002d, B:22:0x0031, B:23:0x0036, B:25:0x003a, B:26:0x003f, B:16:0x001c), top: B:35:0x0011, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
            r3.zzj = r1     // Catch: java.lang.Throwable -> L43
            r3.zzi = r1     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r1 = r3.zzh     // Catch: java.lang.Throwable -> L43
            r1.clear()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = r3.zzk
            monitor-enter(r1)
            com.google.android.gms.ads.internal.client.zzdb r0 = r3.zzl     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            if (r0 == 0) goto L21
            r0.zzw()     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L21
        L19:
            r0 = move-exception
            goto L41
        L1b:
            r0 = move-exception
            java.lang.String r2 = "Unable to stop the SDK."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r2, r0)     // Catch: java.lang.Throwable -> L19
        L21:
            r0 = 0
            r3.zzl = r0     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.ads.internal.client.zzep r2 = r3.zzb     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L2d
            r2.zzg()     // Catch: java.lang.Throwable -> L19
            r3.zzb = r0     // Catch: java.lang.Throwable -> L19
        L2d:
            com.google.android.gms.ads.internal.client.zzfb r2 = r3.zzc     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L36
            r2.zzg()     // Catch: java.lang.Throwable -> L19
            r3.zzc = r0     // Catch: java.lang.Throwable -> L19
        L36:
            com.google.android.gms.ads.internal.client.zzeo r2 = r3.zzd     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L3f
            r2.zzg()     // Catch: java.lang.Throwable -> L19
            r3.zzd = r0     // Catch: java.lang.Throwable -> L19
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r0
        L43:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzex.zzd():void");
    }

    public final Status zze(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z10;
        Status status;
        zzbhe.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strValueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(adUnitId).length());
            sb2.append(strValueOf);
            sb2.append("#");
            sb2.append(adUnitId);
            String string = sb2.toString();
            map.put(string, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map, string, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z10 = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z10 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z10 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put(AdFormat.APP_OPEN_AD, (Integer) zzbd.zzc().zzd(zzbhe.zzfu));
        enumMap.put(AdFormat.INTERSTITIAL, (Integer) zzbd.zzc().zzd(zzbhe.zzfs));
        enumMap.put(AdFormat.REWARDED, (Integer) zzbd.zzc().zzd(zzbhe.zzft));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (iIntValue > num.intValue()) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, adFormat2.name()));
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb3 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb3.append((String) it4.next());
                if (it4.hasNext()) {
                    sb3.append(", ");
                }
            }
            String string2 = sb3.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string2);
            status = new Status(13, string2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzt(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzeq(this, preloadCallback));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e10);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final void zzf(float f10) {
        boolean z10 = true;
        Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzf(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e10);
            }
        }
    }

    public final float zzg() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            float fZzk = 1.0f;
            if (zzdbVar == null) {
                return 1.0f;
            }
            try {
                fZzk = zzdbVar.zzk();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e10);
            }
            return fZzk;
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzh(z10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e10);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            boolean zZzl = false;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zZzl = zzdbVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e10);
            }
            return zZzl;
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzer(this.zza));
                        return map;
                    }
                };
            }
            try {
                return zzB(zzdbVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzer(this.zza));
                        return map;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.zzk) {
            zzD(context);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            try {
                zzD(context);
                zzdb zzdbVar = this.zzl;
                if (zzdbVar == null) {
                    return;
                }
                this.zzm = onAdInspectorClosedListener;
                try {
                    zzdbVar.zzt(new zzev(null));
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String zzo() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return "";
            }
            try {
                return zzgrt.zza(zzdbVar.zzm());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e10);
                return "";
            }
        }
    }

    @NonNull
    public final RequestConfiguration zzp() {
        return this.zzn;
    }

    public final void zzq(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzn;
                this.zzn = requestConfiguration;
                if (this.zzl == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzC(requestConfiguration);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzr(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zzdbVar.zzu(z10);
                return true;
            } catch (RemoteException e10) {
                String str = z10 ? a.f44111j : "disable";
                StringBuilder sb2 = new StringBuilder(str.length() + 40);
                sb2.append("Unable to ");
                sb2.append(str);
                sb2.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2.toString(), e10);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzv(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e10);
            }
        }
    }

    final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ void zzu(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ Object zzw() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzx() {
        return this.zzh;
    }

    final /* synthetic */ void zzy(boolean z10) {
        this.zzi = false;
    }

    final /* synthetic */ void zzz(boolean z10) {
        this.zzj = true;
    }
}
