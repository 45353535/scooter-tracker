package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);

    @Nullable
    public final Context zza;
    private final Object zzd;

    @GuardedBy("lock")
    private zzzl zze;

    @Nullable
    @GuardedBy("lock")
    private Thread zzf;

    @Nullable
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (androidx.activity.s.a(zzzlVar)) {
            this.zze = zzzlVar;
        } else {
            zzzk zzzkVar = new zzzk(zzzlVar, bArr);
            zzzkVar.zzx((zzbl) zzzlVar);
            this.zze = new zzzl(zzzkVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Nullable
    protected static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return strZzi2.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(strZzi.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzguf r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzguf):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z10;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                z10 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzynVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    @Nullable
    private static final Pair zzw(int i10, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzaafVar2.zza(i11)) {
                zzyn zzynVarZzb = zzaafVar2.zzb(i11);
                for (int i12 = 0; i12 < zzynVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i12);
                    List listZza = zzzrVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzzs zzzsVar = (zzzs) listZza.get(i14);
                        int iZza = zzzsVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzzs zzzsVar2 = (zzzs) listZza.get(i16);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzzs) list.get(i17)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean zEquals;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (zEquals) {
            return;
        }
        if (zzzlVar.zzU && this.zza == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    @Nullable
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    protected final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        final zzzl zzzlVar;
        final boolean z10;
        final String str;
        final String languageTag;
        int i10;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i11 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i12 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                z10 = false;
                break;
            }
            if (zzaafVar.zza(i14) == 2 && zzaafVar.zzb(i14).zzb > 0) {
                z10 = true;
                break;
            }
            i14++;
        }
        Pair pairZzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i15, zzbg zzbgVar, int[] iArr3) {
                final zzaaa zzaaaVar = this.zza;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaaVar.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i16 = iArr2[i15];
                int i17 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i18 = 0; i18 < zzbgVar.zza; i18++) {
                    zzgucVar.zzf(new zzyx(i15, zzbgVar, i18, zzzlVar2, iArr3[i18], z10, zzgrdVar, i16));
                }
                return zzgucVar.zzi();
            }
        }, zzyy.zza);
        if (pairZzw != null) {
            zzaabVarArr[((Integer) pairZzw.second).intValue()] = (zzaab) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i15 = zzzlVar.zzw.zzb;
        final Point pointZzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair pairZzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.util.List zza(int r19, com.google.android.gms.internal.ads.zzbg r20, int[] r21) {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
            }
        }, zzzb.zza);
        int i16 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i17, zzbg zzbgVar, int[] iArr3) {
                int i18 = zzaaa.zzb;
                int i19 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i20 = 0; i20 < zzbgVar.zza; i20++) {
                    zzgucVar.zzf(new zzzi(i17, zzbgVar, i20, zzzlVar, iArr3[i20]));
                }
                return zzgucVar.zzi();
            }
        }, zzyz.zza) : null;
        if (pairZzw3 != null) {
            zzaabVarArr[((Integer) pairZzw3.second).intValue()] = (zzaab) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzaabVarArr[((Integer) pairZzw2.second).intValue()] = (zzaab) pairZzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzfj.zza;
            languageTag = locale.toLanguageTag();
        }
        int i17 = 3;
        Pair pairZzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i18, zzbg zzbgVar, int[] iArr3) {
                int i19 = zzaaa.zzb;
                int i20 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i21 = 0; i21 < zzbgVar.zza; i21++) {
                    zzgucVar.zzf(new zzzq(i18, zzbgVar, i21, zzzlVar, iArr3[i21], str, languageTag));
                }
                return zzgucVar.zzi();
            }
        }, zzza.zza);
        if (pairZzw4 != null) {
            zzaabVarArr[((Integer) pairZzw4.second).intValue()] = (zzaab) pairZzw4.first;
        }
        int i18 = 0;
        while (i18 < i12) {
            int iZza = zzaafVar.zza(i18);
            if (iZza == i12 || iZza == i11 || iZza == i17 || iZza == i16) {
                i10 = i11;
            } else {
                zzyn zzynVarZzb = zzaafVar.zzb(i18);
                int[][] iArr3 = iArr[i18];
                int i19 = i13;
                int i20 = i19;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i19 < zzynVarZzb.zzb) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i19);
                    int[] iArr4 = iArr3[i19];
                    zzzj zzzjVar2 = zzzjVar;
                    int i21 = i11;
                    for (int i22 = i13; i22 < zzbgVarZza.zza; i22++) {
                        if (p1.c(iArr4[i22], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zzbgVarZza.zza(i22), iArr4[i22]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzzjVar2 = zzzjVar3;
                                zzbgVar = zzbgVarZza;
                                i20 = i22;
                            }
                        }
                    }
                    i19++;
                    i11 = i21;
                    i13 = 0;
                    zzzjVar = zzzjVar2;
                }
                i10 = i11;
                zzaabVarArr[i18] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i20}, 0);
            }
            i18++;
            i11 = i10;
            i12 = 2;
            i13 = 0;
            i17 = 3;
            i16 = 4;
        }
        int i23 = i11;
        HashMap map = new HashMap();
        int i24 = 2;
        for (int i25 = 0; i25 < 2; i25++) {
            zzv(zzaafVar.zzb(i25), zzzlVar, map);
        }
        zzv(zzaafVar.zze(), zzzlVar, map);
        for (int i26 = 0; i26 < 2; i26++) {
            if (((zzbh) map.get(Integer.valueOf(zzaafVar.zza(i26)))) != null) {
                throw null;
            }
        }
        int i27 = 0;
        while (i27 < i24) {
            zzyn zzynVarZzb2 = zzaafVar.zzb(i27);
            if (zzzlVar.zzb(i27, zzynVarZzb2)) {
                if (zzzlVar.zzc(i27, zzynVarZzb2) != null) {
                    throw null;
                }
                zzaabVarArr[i27] = null;
            }
            i27++;
            i24 = 2;
        }
        int i28 = 0;
        while (i28 < i24) {
            int iZza2 = zzaafVar.zza(i28);
            if (zzzlVar.zza(i28) || zzzlVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzaabVarArr[i28] = null;
            }
            i28++;
            i24 = 2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzaasVarZzt = zzt();
        zzguf zzgufVarZzd = zzyu.zzd(zzaabVarArr);
        int i29 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i30 = 0;
        while (i30 < i29) {
            zzaab zzaabVar = zzaabVarArr[i30];
            if (zzaabVar != null) {
                int[] iArr5 = zzaabVar.zzb;
                int length = iArr5.length;
                if (length != 0) {
                    zzaacVarArr[i30] = length == i23 ? new zzaad(zzaabVar.zza, iArr5[0], 0, 0, null) : zzytVar.zza(zzaabVar.zza, iArr5, 0, zzaasVarZzt, (zzguf) zzgufVarZzd.get(i30));
                } else {
                    i30++;
                    i29 = 2;
                    i23 = 1;
                }
            }
            i30++;
            i29 = 2;
            i23 = 1;
        }
        zzmo[] zzmoVarArr = new zzmo[i29];
        for (int i31 = 0; i31 < i29; i31++) {
            zzmoVarArr[i31] = (zzzlVar.zza(i31) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i31))) || (zzaafVar.zza(i31) != -2 && zzaacVarArr[i31] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        Boolean bool;
        zzzp zzzpVar;
        zzzp zzzpVar2;
        if (!zzzlVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i10 = zzvVar.zzG;
        byte b10 = -1;
        if (i10 != -1 && i10 > 2) {
            String str = zzvVar.zzo;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            b10 = 2;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            b10 = 0;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            b10 = 3;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            b10 = 1;
                        }
                        break;
                }
                if ((b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) && (Build.VERSION.SDK_INT < 32 || (zzzpVar2 = this.zzg) == null || !zzzpVar2.zza())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc() && this.zzg.zzd(this.zzh, zzvVar);
        }
        return true;
    }
}
