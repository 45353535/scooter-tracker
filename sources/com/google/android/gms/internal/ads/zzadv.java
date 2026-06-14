package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.ts.TsExtractor;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class zzadv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_W, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzer zzerVar, String str, @Nullable String str2, @Nullable zzq zzqVar) {
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int i10 = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(8);
        int i11 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzeqVar.zzj(5)] * 1000;
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm("audio/ac3");
        zztVar.zzE(i11);
        zztVar.zzF(i10);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzh(i12);
        zztVar.zzi(i12);
        return zztVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzv zzb(com.google.android.gms.internal.ads.zzer r7, java.lang.String r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzq r10) {
        /*
            com.google.android.gms.internal.ads.zzeq r0 = new com.google.android.gms.internal.ads.zzeq
            r0.<init>()
            r0.zza(r7)
            r1 = 13
            int r1 = r0.zzj(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzh(r2)
            r3 = 2
            int r3 = r0.zzj(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzadv.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzh(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzadv.zze
            int r5 = r0.zzj(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzj(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzh(r2)
            r2 = 4
            int r2 = r0.zzj(r2)
            r0.zzh(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzh(r2)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzh(r5)
        L4f:
            int r2 = r0.zzc()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzh(r6)
            int r2 = r0.zzj(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zzm()
            int r0 = r0.zze()
            r7.zzh(r0)
            com.google.android.gms.internal.ads.zzt r7 = new com.google.android.gms.internal.ads.zzt
            r7.<init>()
            r7.zza(r8)
            r7.zzm(r2)
            r7.zzE(r4)
            r7.zzF(r3)
            r7.zzq(r10)
            r7.zze(r9)
            r7.zzi(r1)
            com.google.android.gms.internal.ads.zzv r7 = r7.zzM()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadv.zzb(com.google.android.gms.internal.ads.zzer, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    public static zzadu zzc(zzeq zzeqVar) {
        int iZzf;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzd = zzeqVar.zzd();
        zzeqVar.zzh(40);
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzf(iZzd);
        int i18 = -1;
        if (iZzj > 10) {
            zzeqVar.zzh(16);
            int iZzj2 = zzeqVar.zzj(2);
            if (iZzj2 == 0) {
                i18 = 0;
            } else if (iZzj2 == 1) {
                i18 = 1;
            } else if (iZzj2 == 2) {
                i18 = 2;
            }
            zzeqVar.zzh(3);
            int iZzj3 = zzeqVar.zzj(11) + 1;
            int iZzj4 = zzeqVar.zzj(2);
            if (iZzj4 == 3) {
                i10 = zzd[zzeqVar.zzj(2)];
                i15 = 6;
                i14 = 3;
            } else {
                int iZzj5 = zzeqVar.zzj(2);
                int i19 = zzb[iZzj5];
                i14 = iZzj5;
                i10 = zzc[iZzj4];
                i15 = i19;
            }
            iZzf = iZzj3 + iZzj3;
            int i20 = (iZzf * i10) / (i15 * 32);
            int iZzj6 = zzeqVar.zzj(3);
            boolean zZzi = zzeqVar.zzi();
            i11 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzeqVar.zzh(10);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzeqVar.zzh(5);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                i16 = 0;
                iZzj6 = 0;
            } else {
                i16 = iZzj6;
            }
            if (i18 == 1) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (zzeqVar.zzi()) {
                if (i16 > 2) {
                    zzeqVar.zzh(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    zzeqVar.zzh(6);
                }
                if ((i16 & 4) != 0) {
                    zzeqVar.zzh(6);
                }
                if (zZzi && zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                if (i17 == 0) {
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (i16 == 0 && zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    int iZzj7 = zzeqVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzeqVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzeqVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzeqVar.zzj(5);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                            }
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(7);
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(8);
                                }
                            }
                        }
                        zzeqVar.zzh((iZzj8 + 2) * 8);
                        zzeqVar.zzm();
                    }
                    if (i16 < 2) {
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                    }
                    if (!zzeqVar.zzi()) {
                        i17 = 0;
                    } else if (i14 == 0) {
                        zzeqVar.zzh(5);
                        i17 = 0;
                        i14 = 0;
                    } else {
                        for (int i21 = 0; i21 < i15; i21++) {
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
                if (i16 == 2) {
                    zzeqVar.zzh(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    zzeqVar.zzh(2);
                }
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (i16 == 0 && zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzeqVar.zzg();
                }
            }
            if (i17 == 0 && i14 != 3) {
                zzeqVar.zzg();
            }
            if (i17 == 2 && (i14 == 3 || zzeqVar.zzi())) {
                zzeqVar.zzh(6);
            }
            i12 = i15 * 256;
            str = (zzeqVar.zzi() && zzeqVar.zzj(6) == 1 && zzeqVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i20;
        } else {
            zzeqVar.zzh(32);
            int iZzj9 = zzeqVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzeqVar.zzj(6);
            int i22 = zzf[iZzj10 / 2] * 1000;
            iZzf = zzf(iZzj9, iZzj10);
            zzeqVar.zzh(8);
            int iZzj11 = zzeqVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzeqVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzeqVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzeqVar.zzh(2);
            }
            i10 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i11 = zze[iZzj11] + (zzeqVar.zzi() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new zzadu(str, i18, i11, i10, iZzf, i12, i13, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
