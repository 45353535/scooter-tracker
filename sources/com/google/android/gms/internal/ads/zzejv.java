package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzejv implements zzejw {
    static /* synthetic */ zzekb zzl(String str, String str2, String str3, zzejx zzejxVar, String str4, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zzfsxVarZza = zzfsx.zza("Google", str2);
        zzfsw zzfswVarZzn = zzn("javascript");
        zzfso zzfsoVarZzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzfswVarZzn == zzfswVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfsoVarZzp == null) {
            String strValueOf = String.valueOf(zzejxVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfsw zzfswVarZzn2 = zzn(str4);
        if (zzfsoVarZzp != zzfso.VIDEO || zzfswVarZzn2 != zzfswVar) {
            zzfsl zzfslVarZza = zzfsl.zza(zzfsxVarZza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzfsoVarZzp, zzo(zzejyVar.toString()), zzfswVarZzn, zzfswVarZzn2, true), zzfslVarZza), zzfslVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    static /* synthetic */ zzekb zzm(String str, String str2, String str3, String str4, zzejx zzejxVar, WebView webView, String str5, String str6, zzejy zzejyVar) {
        zzfsx zzfsxVarZza = zzfsx.zza(str, str2);
        zzfsw zzfswVarZzn = zzn("javascript");
        zzfsw zzfswVarZzn2 = zzn(str4);
        zzfso zzfsoVarZzp = zzp(zzejxVar.toString());
        zzfsw zzfswVar = zzfsw.NONE;
        if (zzfswVarZzn == zzfswVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfsoVarZzp == null) {
            String strValueOf = String.valueOf(zzejxVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfsoVarZzp != zzfso.VIDEO || zzfswVarZzn2 != zzfswVar) {
            zzfsl zzfslVarZzb = zzfsl.zzb(zzfsxVarZza, webView, str5, "");
            return new zzekb(zzfsj.zze(zzfsk.zza(zzfsoVarZzp, zzo(zzejyVar.toString()), zzfswVarZzn, zzfswVarZzn2, true), zzfslVarZzb), zzfslVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfsw zzn(@Nullable String str) {
        return "native".equals(str) ? zzfsw.NATIVE : "javascript".equals(str) ? zzfsw.JAVASCRIPT : zzfsw.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfsr zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.zzfsr r4 = com.google.android.gms.internal.ads.zzfsr.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejv.zzo(java.lang.String):com.google.android.gms.internal.ads.zzfsr");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfso zzp(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfso r4 = com.google.android.gms.internal.ads.zzfso.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejv.zzp(java.lang.String):com.google.android.gms.internal.ads.zzfso");
    }

    @Nullable
    private static final Object zzq(zzeju zzejuVar) {
        try {
            return zzejuVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeju() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // com.google.android.gms.internal.ads.zzeju
                public final /* synthetic */ Object zza() {
                    if (zzfsh.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfsh.zza(context);
                    return Boolean.valueOf(zzfsh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
            return (String) zzq(zzejk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzekb zzc(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzejy zzejyVar, final zzejx zzejxVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzekb) zzq(new zzeju(str7, str, str6, zzejxVar, str4, webView, str5, str8, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzejx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzejxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzekb zzd(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzejy zzejyVar, final zzejx zzejxVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() || !zzfsh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzekb) zzq(new zzeju(str5, str, str8, str4, zzejxVar, webView, str6, str7, zzejyVar) { // from class: com.google.android.gms.internal.ads.zzejm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzejx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzejy zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzejxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzejyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                return zzejv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zze(final zzfsj zzfsjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            Objects.requireNonNull(zzfsjVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsjVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzf(final zzfsj zzfsjVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzg(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzh(final zzfsj zzfsjVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
                    zzfsjVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    @Nullable
    public final zzfsv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (zzfsv) zzq(new zzeju(webView, z11) { // from class: com.google.android.gms.internal.ads.zzejq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeju
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i10 = versionInfoParcel2.buddyApkVersion;
                int i11 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
                sb2.append(i10);
                sb2.append(".");
                sb2.append(i11);
                return zzfsv.zza(zzfsx.zza("Google", sb2.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzj(final zzfsv zzfsvVar, final zzfsu zzfsuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsvVar.zzb(zzfsuVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzejw
    public final void zzk(final zzfsv zzfsvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfsvVar.zzd(view, zzfsq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
