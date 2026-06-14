package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzun {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    @VisibleForTesting
    zzun(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzun zza(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzun r0 = new com.google.android.gms.internal.ads.zzun
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L67
            if (r15 == 0) goto L67
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L67
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L67
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L73
        L67:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L7e
        L73:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L7e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzun.zza(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzun");
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzo) || str.equals(zzvg.zzg(zzvVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzk(com.google.android.gms.internal.ads.zzv r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzun.zzk(com.google.android.gms.internal.ads.zzv, boolean):boolean");
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzo, "audio/flac") && zzvVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfj.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(C4240b4.j.f42674e);
        zzee.zza("MediaCodecInfo", sb2.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i10, i11);
        int i12 = pointZzo.x;
        int i13 = pointZzo.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfj.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzv zzvVar) throws zzuy {
        int i10;
        if (!zzj(zzvVar) || !zzk(zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i11 = zzvVar.zzv;
            if (i11 <= 0 || (i10 = zzvVar.zzw) <= 0) {
                return true;
            }
            return zzg(i11, i10, zzvVar.zzz);
        }
        int i12 = zzvVar.zzH;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i12)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 20);
                sb2.append("sampleRate.support, ");
                sb2.append(i12);
                zzm(sb2.toString());
                return false;
            }
        }
        int i13 = zzvVar.zzG;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb3 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i14).length() + 1);
                sb3.append("AssumedMaxChannelAdjustment: ");
                sb3.append(str);
                sb3.append(", [");
                sb3.append(maxInputChannelCount);
                sb3.append(" to ");
                sb3.append(i14);
                sb3.append(C4240b4.j.f42674e);
                zzee.zzc("MediaCodecInfo", sb3.toString());
                maxInputChannelCount = i14;
            }
            if (maxInputChannelCount < i13) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 22);
                sb4.append("channelCount.support, ");
                sb4.append(i13);
                zzm(sb4.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzv zzvVar) {
        return zzj(zzvVar) && zzk(zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair pairZzd = zzdo.zzd(zzvVar);
        return pairZzd != null && ((Integer) pairZzd.first).intValue() == 42;
    }

    public final zzio zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i10;
        String str = zzvVar.zzo;
        String str2 = zzvVar2.zzo;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzA != zzvVar2.zzA) {
                i11 |= 1024;
            }
            boolean z10 = (zzvVar.zzv == zzvVar2.zzv && zzvVar.zzw == zzvVar2.zzw) ? false : true;
            if (!this.zze && z10) {
                i11 |= 512;
            }
            zzi zziVar = zzvVar.zzE;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzE)) && !Objects.equals(zziVar, zzvVar2.zzE)) {
                i11 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i11 |= 2;
            }
            int i12 = zzvVar.zzx;
            if (i12 != -1 && (i10 = zzvVar.zzy) != -1 && i12 == zzvVar2.zzx && i10 == zzvVar2.zzy && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZzd = zzdo.zzd(zzvVar);
                Pair pairZzd2 = zzdo.zzd(zzvVar2);
                if (pairZzd == null || pairZzd2 == null || !((Integer) pairZzd.first).equals(pairZzd2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new zzio(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzG != zzvVar4.zzG) {
                i11 |= 4096;
            }
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i11 |= 8192;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i11 |= 16384;
            }
            if (i11 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZzd3 = zzdo.zzd(zzvVar3);
                    Pair pairZzd4 = zzdo.zzd(zzvVar4);
                    if (pairZzd3 != null && pairZzd4 != null) {
                        int iIntValue = ((Integer) pairZzd3.first).intValue();
                        int iIntValue2 = ((Integer) pairZzd4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZzd3.equals(pairZzd4)) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i11 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzio(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzio(this.zza, zzvVar3, zzvVar4, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzg(int r10, int r11, double r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzun.zzg(int, int, double):boolean");
    }

    public final float zzh(int i10, int i11) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i10 && this.zzk == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzg(i10, i11, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzg = zzg(i10, i11, f14);
                if (true == zZzg) {
                    f12 = f14;
                }
                if (true != zZzg) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i10;
        this.zzk = i11;
        return f11;
    }

    @Nullable
    public final Point zzi(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i10, i11);
    }
}
