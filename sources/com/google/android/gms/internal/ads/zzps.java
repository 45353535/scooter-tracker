package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzps {

    @VisibleForTesting
    static final zzgui zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzps zza = new zzps(zzguf.zzj(zzpr.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzguf zzc = zzguf.zzl(2, 5, 6);

    static {
        zzguh zzguhVar = new zzguh();
        zzguhVar.zza(5, 6);
        zzguhVar.zza(17, 6);
        zzguhVar.zza(7, 6);
        zzguhVar.zza(30, 10);
        zzguhVar.zza(18, 6);
        zzguhVar.zza(6, 8);
        zzguhVar.zza(8, 8);
        zzguhVar.zza(14, 8);
        zzb = zzguhVar.zzc();
    }

    private zzps(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzpr zzprVar = (zzpr) list.get(i10);
            this.zzd.put(zzprVar.zzb, zzprVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            iMax = Math.max(iMax, ((zzpr) this.zzd.valueAt(i11)).zzc);
        }
        this.zze = iMax;
    }

    @SuppressLint({"UnprotectedReceiver"})
    static zzps zza(Context context, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.zzps zzb(android.content.Context r10, @androidx.annotation.Nullable android.content.Intent r11, com.google.android.gms.internal.ads.zzd r12, @androidx.annotation.Nullable android.media.AudioDeviceInfo r13) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzps.zzb(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.zzd, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzps");
    }

    @Nullable
    static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzguf zzf(@Nullable int[] iArr, int i10) {
        int i11 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            zzgucVar.zzf(new zzpr(i12, i10));
        }
        return zzgucVar.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzps
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzps r9 = (com.google.android.gms.internal.ads.zzps) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            java.lang.String r4 = com.google.android.gms.internal.ads.zzfj.zza
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L1f
            boolean r1 = androidx.media3.common.util.p.a(r1, r3)
            if (r1 == 0) goto L47
            goto L40
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L47
            r5 = r2
        L2a:
            if (r5 >= r4) goto L40
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L47
            int r5 = r5 + r0
            goto L2a
        L40:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L47
            return r0
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzps.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfj.zza;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i10 = this.zze;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 50 + string.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzd(com.google.android.gms.internal.ads.zzv r10, com.google.android.gms.internal.ads.zzd r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzas.zzg(r0, r1)
            com.google.android.gms.internal.ads.zzgui r2 = com.google.android.gms.internal.ads.zzps.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lbf
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzfj.zza(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzfj.zza(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzfj.zza(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzfj.zza(r6, r1)
            if (r7 == 0) goto Lbf
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzpr r6 = (com.google.android.gms.internal.ads.zzpr) r6
            r6.getClass()
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lbf
        L73:
            boolean r10 = r6.zza(r7)
            if (r10 != 0) goto L85
            goto Lbf
        L7a:
            int r10 = r10.zzH
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.zzb(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r11 = 3
            if (r7 == r11) goto L97
            r11 = 4
            if (r7 == r11) goto L97
            r11 = 5
            if (r7 != r11) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            r11 = 26
            if (r10 > r11) goto Lac
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lac
            r10 = 1
            if (r3 != r10) goto Lac
            r3 = 2
        Lac:
            int r10 = com.google.android.gms.internal.ads.zzfj.zzB(r3)
            if (r10 == 0) goto Lbf
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lbf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzps.zzd(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzd):android.util.Pair");
    }
}
