package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhio {
    private static final zzhij zzb = new zzhij(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhil zzc = new zzhil(new zzhim(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.DLE};

    public static byte[] zza(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 + i11;
            bArr2[i12] = (byte) (bArr[i11] & Ascii.SI);
            bArr2[i12 + 1] = (byte) ((bArr[i11] & 255) >> 4);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        zzhil zzhilVar = new zzhil(zzc);
        zzhin zzhinVar = new zzhin();
        for (i10 = 1; i10 < 64; i10 += 2) {
            zzhij zzhijVar = new zzhij(zzb);
            zzk(zzhijVar, i10 / 2, bArr2[i10]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar);
        }
        zzhim zzhimVar = new zzhim();
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            zzhij zzhijVar2 = new zzhij(zzb);
            zzk(zzhijVar2, i16 / 2, bArr2[i16]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar2);
        }
        zzhim zzhimVar2 = new zzhim(zzhilVar);
        long[] jArr = new long[10];
        zzhiv.zzf(jArr, zzhimVar2.zza);
        long[] jArr2 = new long[10];
        zzhiv.zzf(jArr2, zzhimVar2.zzb);
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr3, zzhimVar2.zzc);
        long[] jArr4 = new long[10];
        zzhiv.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhiv.zzb(jArr5, jArr2, jArr);
        zzhiv.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhiv.zze(jArr6, jArr, jArr2);
        zzhiv.zze(jArr6, jArr6, zzhiq.zza);
        zzhiv.zza(jArr6, jArr6, jArr4);
        zzhiv.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhiv.zzh(jArr5), zzhiv.zzh(jArr6))) {
            return zzhimVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i10 = bArrDigest[31] & Ascii.DEL;
        bArrDigest[31] = (byte) i10;
        bArrDigest[31] = (byte) (i10 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b10;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i10 = 31;
        while (true) {
            if (i10 < 0) {
                break;
            }
            int i11 = bArrCopyOfRange[i10] & 255;
            int i12 = zza[i10] & 255;
            if (i11 == i12) {
                i10--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i11 < i12) {
                MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j10 = (jZzo4 & 2097151) + (jZzn10 * 666643);
                long j11 = (j10 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j12 = j11 << 21;
                long j13 = jZzn5 + (jZzo11 * 666643) + (jZzo10 * 470296) + (jZzn10 * 654183);
                long j14 = (j13 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j15 = j14 << 21;
                long j16 = (((((jZzn6 & 2097151) + (jZzo12 * 666643)) + (jZzn11 * 470296)) + (jZzo11 * 654183)) - (jZzo10 * 997805)) + (jZzn10 * 136657);
                long j17 = (j16 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j18 = j17 << 21;
                long j19 = (((((jZzo7 & 2097151) + (jZzo13 * 470296)) + (jZzo12 * 654183)) - (jZzn11 * 997805)) + (jZzo11 * 136657)) - (jZzo10 * 683901);
                long j20 = (j19 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j21 = (((jZzo8 & 2097151) - (jZzo13 * 997805)) + (jZzo12 * 136657)) - (jZzn11 * 683901);
                long j22 = (j21 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j23 = jZzn9 - (jZzo13 * 683901);
                long j24 = (j23 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j25 = jZzn4 + (jZzo10 * 666643) + (jZzn10 * 470296) + j11;
                long j26 = (j25 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j27 = j26 << 21;
                long j28 = (((((jZzo5 & 2097151) + (jZzn11 * 666643)) + (jZzo11 * 470296)) + (jZzo10 * 654183)) - (jZzn10 * 997805)) + j14;
                long j29 = (j28 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j30 = j29 << 21;
                long j31 = (((((((jZzo6 & 2097151) + (jZzo13 * 666643)) + (jZzo12 * 470296)) + (jZzn11 * 654183)) - (jZzo11 * 997805)) + (jZzo10 * 136657)) - (jZzn10 * 683901)) + j17;
                long j32 = (j31 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j33 = j32 << 21;
                long j34 = (((((jZzn7 & 2097151) + (jZzo13 * 654183)) - (jZzo12 * 997805)) + (jZzn11 * 136657)) - (jZzo11 * 683901)) + j20;
                long j35 = (j34 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j36 = ((jZzn8 + (jZzo13 * 136657)) - (jZzo12 * 683901)) + j22;
                long j37 = (j36 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j38 = (j19 - (j20 << 21)) + j32;
                long j39 = jZzn + (j38 * 666643);
                long j40 = (j39 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j41 = j40 << 21;
                long j42 = (j21 - (j22 << 21)) + j35;
                long j43 = j34 - (j35 << 21);
                long j44 = (jZzn2 & 2097151) + (j42 * 666643) + (j43 * 470296) + (j38 * 654183);
                long j45 = (j44 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j46 = j45 << 21;
                long j47 = (j23 - (j24 << 21)) + j37;
                long j48 = j36 - (j37 << 21);
                long j49 = (((((jZzo3 & 2097151) + (j47 * 666643)) + (j48 * 470296)) + (j42 * 654183)) - (j43 * 997805)) + (j38 * 136657);
                long j50 = (j49 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j51 = j50 << 21;
                long j52 = (jZzo9 & 2097151) + j24;
                long j53 = (((((j10 - j12) + (j52 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j42 * 136657)) - (j43 * 683901);
                long j54 = (j53 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j55 = j54 << 21;
                long j56 = ((((j13 - j15) + j26) - (j52 * 997805)) + (j47 * 136657)) - (j48 * 683901);
                long j57 = (j56 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j58 = j57 << 21;
                long j59 = ((j16 - j18) + j29) - (j52 * 683901);
                long j60 = (j59 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j61 = (jZzo & 2097151) + (j43 * 666643) + (j38 * 470296) + j40;
                long j62 = (j61 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j63 = (((((jZzo2 & 2097151) + (j48 * 666643)) + (j42 * 470296)) + (j43 * 654183)) - (j38 * 997805)) + j45;
                long j64 = (j63 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j65 = (((((((jZzn3 & 2097151) + (j52 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j42 * 997805)) + (j43 * 136657)) - (j38 * 683901)) + j50;
                long j66 = (j65 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j67 = (((((j25 - j27) + (j52 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j42 * 683901)) + j54;
                long j68 = (j67 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j69 = (((j28 - j30) + (j52 * 136657)) - (j47 * 683901)) + j57;
                long j70 = (j69 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j71 = (j31 - j33) + j60;
                long j72 = (j71 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j73 = j72 << 21;
                long j74 = (j39 - j41) + (j72 * 666643);
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j61 - (j62 << 21)) + (j72 * 470296) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = (j44 - j46) + j62 + (j72 * 654183) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = ((j63 - (j64 << 21)) - (j72 * 997805)) + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j49 - j51) + j64 + (j72 * 136657) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = ((j65 - (j66 << 21)) - (j72 * 683901)) + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j53 - j55) + j66 + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j67 - (j68 << 21)) + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j56 - j58) + j68 + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j69 - (j70 << 21)) + j99;
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j59 - (j60 << 21)) + j70 + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = (j74 - j76) + (666643 * j108);
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (470296 * j108) + j111;
                long j114 = j113 >> 21;
                long j115 = j114 << 21;
                long j116 = (j80 - j82) + (654183 * j108) + j114;
                long j117 = j116 >> 21;
                long j118 = j117 << 21;
                long j119 = ((j83 - j85) - (997805 * j108)) + j117;
                long j120 = j119 >> 21;
                long j121 = j120 << 21;
                long j122 = (j86 - j88) + (136657 * j108) + j120;
                long j123 = j122 >> 21;
                long j124 = ((j89 - j91) - (j108 * 683901)) + j123;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                long j132 = j131 << 21;
                long j133 = (j98 - j100) + j131;
                long j134 = j133 >> 21;
                long j135 = j134 << 21;
                long j136 = (j101 - j103) + j134;
                long j137 = j136 >> 21;
                long j138 = j137 << 21;
                long j139 = (j104 - j106) + j137;
                long j140 = j139 >> 21;
                bArrDigest[0] = (byte) (j110 - j112);
                long j141 = j130 - j132;
                long j142 = j127 - j129;
                long j143 = j124 - j126;
                long j144 = j122 - (j123 << 21);
                long j145 = j119 - j121;
                long j146 = j116 - j118;
                long j147 = j113 - j115;
                bArrDigest[1] = (byte) (r8 >> 8);
                bArrDigest[2] = (byte) ((r8 >> 16) | (j147 << 5));
                bArrDigest[3] = (byte) (j147 >> 3);
                bArrDigest[4] = (byte) (j147 >> 11);
                bArrDigest[5] = (byte) ((j147 >> 19) | (j146 << 2));
                bArrDigest[6] = (byte) (j146 >> 6);
                bArrDigest[7] = (byte) ((j146 >> 14) | (j145 << 7));
                bArrDigest[8] = (byte) (j145 >> 1);
                bArrDigest[9] = (byte) (j145 >> 9);
                bArrDigest[10] = (byte) ((j145 >> 17) | (j144 << 4));
                bArrDigest[11] = (byte) (j144 >> 4);
                bArrDigest[12] = (byte) (j144 >> 12);
                bArrDigest[13] = (byte) ((j144 >> 20) | (j143 + j143));
                bArrDigest[14] = (byte) (j143 >> 7);
                bArrDigest[15] = (byte) ((j143 >> 15) | (j142 << 6));
                bArrDigest[16] = (byte) (j142 >> 2);
                bArrDigest[17] = (byte) (j142 >> 10);
                bArrDigest[18] = (byte) ((j142 >> 18) | (j141 << 3));
                long j148 = j139 - (j140 << 21);
                long j149 = (j107 - j109) + j140;
                long j150 = j136 - j138;
                bArrDigest[19] = (byte) (j141 >> 5);
                bArrDigest[20] = (byte) (j141 >> 13);
                bArrDigest[21] = (byte) (j133 - j135);
                bArrDigest[22] = (byte) (r6 >> 8);
                bArrDigest[23] = (byte) ((r6 >> 16) | (j150 << 5));
                bArrDigest[24] = (byte) (j150 >> 3);
                bArrDigest[25] = (byte) (j150 >> 11);
                bArrDigest[26] = (byte) ((j150 >> 19) | (j148 << 2));
                bArrDigest[27] = (byte) (j148 >> 6);
                bArrDigest[28] = (byte) ((j148 >> 14) | (j149 << 7));
                bArrDigest[29] = (byte) (j149 >> 1);
                bArrDigest[30] = (byte) (j149 >> 9);
                bArrDigest[31] = (byte) (j149 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhiv.zzg(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhiv.zzf(jArr4, jArrZzg);
                zzhiv.zze(jArr5, jArr4, zzhiq.zza);
                zzhiv.zzb(jArr4, jArr4, jArr2);
                zzhiv.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhiv.zzf(jArr8, jArr5);
                zzhiv.zze(jArr8, jArr8, jArr5);
                zzhiv.zzf(jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr5);
                zzhiv.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhiv.zzf(jArr9, jArr);
                zzhiv.zzf(jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr10);
                zzhiv.zze(jArr10, jArr, jArr10);
                zzhiv.zze(jArr9, jArr9, jArr10);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i13 = 1; i13 < 5; i13++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i14 = 1; i14 < 10; i14++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i15 = 1; i15 < 20; i15++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i16 = 1; i16 < 10; i16++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i17 = 1; i17 < 50; i17++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i18 = 1; i18 < 100; i18++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i19 = 1; i19 < 50; i19++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr, jArr9, jArr);
                zzhiv.zze(jArr, jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr4);
                zzhiv.zzf(jArr6, jArr);
                zzhiv.zze(jArr6, jArr6, jArr5);
                zzhiv.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhiv.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhiv.zze(jArr, jArr, zzhiq.zzc);
                }
                if (zze(jArr)) {
                    b10 = 255;
                } else {
                    b10 = 255;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b10) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhiv.zze(jArr3, jArr, jArrZzg);
                zzhin zzhinVar = new zzhin(new zzhim(jArr, jArrZzg, jArr2), jArr3);
                zzhik[] zzhikVarArr = new zzhik[8];
                zzhikVarArr[0] = new zzhik(zzhinVar);
                zzhil zzhilVar = new zzhil(new zzhim(), new long[10]);
                zzi(zzhilVar, zzhinVar.zza);
                zzhin zzhinVar2 = new zzhin(zzhilVar);
                for (int i20 = 1; i20 < 8; i20++) {
                    zzg(zzhilVar, zzhinVar2, zzhikVarArr[i20 - 1]);
                    zzhikVarArr[i20] = new zzhik(new zzhin(zzhilVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArrCopyOfRange);
                zzhil zzhilVar2 = new zzhil(zzc);
                zzhin zzhinVar3 = new zzhin();
                int i21 = b10;
                while (i21 >= 0 && bArrZzl[i21] == 0 && bArrZzl2[i21] == 0) {
                    i21--;
                }
                while (i21 >= 0) {
                    zzi(zzhilVar2, new zzhim(zzhilVar2));
                    byte b11 = bArrZzl[i21];
                    if (b11 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhikVarArr[bArrZzl[i21] / 2]);
                    } else if (b11 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhikVarArr[(-bArrZzl[i21]) / 2]);
                    }
                    byte b12 = bArrZzl2[i21];
                    if (b12 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhiq.zze[bArrZzl2[i21] / 2]);
                    } else if (b12 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhiq.zze[(-bArrZzl2[i21]) / 2]);
                    }
                    i21--;
                }
                byte[] bArrZzb = new zzhim(zzhilVar2).zzb();
                for (int i22 = 0; i22 < 32; i22++) {
                    if (bArrZzb[i22] != bArr2[i22]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhiq.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhiv.zzd(jArr2);
        byte[] bArrZzh = zzhiv.zzh(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrZzh[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ int zzf(long[] jArr) {
        return zzhiv.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zzb);
        long[] jArr6 = zzhijVar.zza;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zza(jArr7, jArr, jArr8);
        zzhiv.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zza);
        long[] jArr6 = zzhijVar.zzb;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zzb(jArr7, jArr, jArr8);
        zzhiv.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhil zzhilVar, zzhim zzhimVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr, jArr2);
        long[] jArr4 = zzhimVar2.zzc;
        long[] jArr5 = zzhimVar.zzb;
        zzhiv.zzf(jArr4, jArr5);
        long[] jArr6 = zzhilVar.zzb;
        zzhiv.zzf(jArr6, zzhimVar.zzc);
        zzhiv.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhimVar2.zzb;
        zzhiv.zza(jArr7, jArr2, jArr5);
        zzhiv.zzf(jArr3, jArr7);
        zzhiv.zza(jArr7, jArr4, jArr);
        zzhiv.zzb(jArr4, jArr4, jArr);
        zzhiv.zzb(jArr, jArr3, jArr7);
        zzhiv.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 + i14)) >> 7;
    }

    private static void zzk(zzhij zzhijVar, int i10, byte b10) {
        zzhij[][] zzhijVarArr = zzhiq.zzd;
        int i11 = (b10 & 255) >> 7;
        int i12 = (-i11) & b10;
        int i13 = b10 - (i12 + i12);
        zzhijVar.zzb(zzhijVarArr[i10][0], zzj(i13, 1));
        zzhijVar.zzb(zzhijVarArr[i10][1], zzj(i13, 2));
        zzhijVar.zzb(zzhijVarArr[i10][2], zzj(i13, 3));
        zzhijVar.zzb(zzhijVarArr[i10][3], zzj(i13, 4));
        zzhijVar.zzb(zzhijVarArr[i10][4], zzj(i13, 5));
        zzhijVar.zzb(zzhijVarArr[i10][5], zzj(i13, 6));
        zzhijVar.zzb(zzhijVarArr[i10][6], zzj(i13, 7));
        zzhijVar.zzb(zzhijVarArr[i10][7], zzj(i13, 8));
        long[] jArr = zzhijVar.zzc;
        long[] jArr2 = zzhijVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhijVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhijVar.zzb(new zzhij(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i11);
    }

    private static byte[] zzl(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        int i14 = b10 << i13;
                        int i15 = b11 + i14;
                        if (i15 <= 15) {
                            bArr2[i12] = (byte) i15;
                            bArr2[i10] = 0;
                        } else {
                            int i16 = b11 - i14;
                            if (i16 >= -15) {
                                bArr2[i12] = (byte) i16;
                                while (true) {
                                    if (i10 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i10] == 0) {
                                        bArr2[i10] = 1;
                                        break;
                                    }
                                    bArr2[i10] = 0;
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    private static long zzn(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long zzo(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | zzn(bArr, i10);
    }
}
