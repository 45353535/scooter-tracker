package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzagc zza(zzaev zzaevVar) throws IOException {
        return zzc(zzaevVar, true, false);
    }

    @Nullable
    public static zzagc zzb(zzaev zzaevVar, boolean z10) throws IOException {
        return zzc(zzaevVar, false, z10);
    }

    @Nullable
    private static zzagc zzc(zzaev zzaevVar, boolean z10, boolean z11) throws IOException {
        zzagc zzagcVar;
        long j10;
        zzer zzerVar;
        int i10;
        int i11;
        long j11;
        int i12;
        int i13;
        int[] iArr;
        long jZzo = zzaevVar.zzo();
        long j12 = -1;
        long j13 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jZzo != -1 && jZzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j13 = jZzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i14 = (int) j13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            zzerVar2.zza(8);
            if (!zzaevVar.zzh(zzerVar2.zzi(), i15, 8, true)) {
                break;
            }
            long jZzz = zzerVar2.zzz();
            int iZzB = zzerVar2.zzB();
            if (jZzz == 1) {
                j10 = j12;
                zzaevVar.zzi(zzerVar2.zzi(), 8, 8);
                i10 = 16;
                zzerVar2.zzf(16);
                jZzz = zzerVar2.zzD();
                zzerVar = zzerVar2;
            } else {
                j10 = j12;
                if (jZzz == 0) {
                    long jZzo2 = zzaevVar.zzo();
                    if (jZzo2 != j10) {
                        jZzz = (jZzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar2;
                i10 = 8;
            }
            long j14 = jZzz;
            zzagcVar = null;
            long j15 = i10;
            if (j14 < j15) {
                i11 = 1;
                if (iZzB == 1718773093) {
                    if (i10 == 8) {
                        j14 = 8;
                        iZzB = 1718773093;
                    } else {
                        iZzB = 1718773093;
                    }
                }
                return new zzajv(iZzB, j14, i10);
            }
            i11 = 1;
            i16 += i10;
            if (iZzB == 1836019574) {
                i14 += (int) j14;
                if (jZzo != -1 && i14 > jZzo) {
                    i14 = (int) jZzo;
                }
                zzerVar2 = zzerVar;
                j12 = j10;
                i15 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j11 = jZzo;
                    i12 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i15 = i11;
                        break;
                    }
                    i17 |= (iZzB == 1835295092 ? 0 : i11) ^ 1;
                    if (iZzB == 1937007212) {
                        if (j14 > 1000000) {
                            i15 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j11 = jZzo;
                    if ((((long) i16) + j14) - j15 >= i14) {
                        i15 = 0;
                        break;
                    }
                    int i18 = (int) (j14 - j15);
                    i16 += i18;
                    if (iZzB != 1718909296) {
                        i12 = 0;
                        if (i18 != 0) {
                            zzaevVar.zzk(i18);
                        }
                    } else {
                        if (i18 < 8) {
                            return new zzajv(1718909296, i18, 8);
                        }
                        zzerVar.zza(i18);
                        i12 = 0;
                        zzaevVar.zzi(zzerVar.zzi(), 0, i18);
                        int iZzB2 = zzerVar.zzB();
                        int i19 = (zzd(iZzB2, z11) ? 1 : 0) | i17;
                        zzerVar.zzk(4);
                        int iZzd = zzerVar.zzd() / 4;
                        if (i19 == 0 && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i20 = 0;
                            while (true) {
                                if (i20 >= iZzd) {
                                    i13 = i19;
                                    break;
                                }
                                int iZzB3 = zzerVar.zzB();
                                iArr[i20] = iZzB3;
                                if (zzd(iZzB3, z11)) {
                                    i13 = i11;
                                    break;
                                }
                                i20++;
                            }
                        } else {
                            i13 = i19;
                            iArr = null;
                        }
                        if (i13 == 0) {
                            return new zzalg(iZzB2, iArr);
                        }
                        i17 = i13;
                    }
                }
                i15 = i12;
                zzerVar2 = zzerVar;
                jZzo = j11;
                j12 = j10;
            }
        }
        zzagcVar = null;
        return i17 == 0 ? zzakx.zza : z10 != i15 ? i15 != 0 ? zzakp.zza : zzakp.zzb : zzagcVar;
    }

    private static boolean zzd(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z10) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
