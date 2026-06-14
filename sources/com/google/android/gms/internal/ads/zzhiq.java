package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
final class zzhiq {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhij[][] zzd;
    static final zzhij[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhip zzhipVar = new zzhip(null);
        zzhipVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhipVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhipVar.zzb(bigIntegerModPow2);
        zza = zzhiv.zzg(zzb(bigIntegerMod));
        zzb = zzhiv.zzg(zzb(bigIntegerMod2));
        zzc = zzhiv.zzg(zzb(bigIntegerModPow));
        zzd = (zzhij[][]) Array.newInstance((Class<?>) zzhij.class, 32, 8);
        zzhip zzhipVarZza = zzhipVar;
        for (int i10 = 0; i10 < 32; i10++) {
            zzhip zzhipVarZza2 = zzhipVarZza;
            for (int i11 = 0; i11 < 8; i11++) {
                zzd[i10][i11] = zzc(zzhipVarZza2);
                zzhipVarZza2 = zza(zzhipVarZza2, zzhipVarZza);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                zzhipVarZza = zza(zzhipVarZza, zzhipVarZza);
            }
        }
        zzhip zzhipVarZza3 = zza(zzhipVar, zzhipVar);
        zze = new zzhij[8];
        for (int i13 = 0; i13 < 8; i13++) {
            zze[i13] = zzc(zzhipVar);
            zzhipVar = zza(zzhipVar, zzhipVarZza3);
        }
    }

    private static zzhip zza(zzhip zzhipVar, zzhip zzhipVar2) {
        zzhip zzhipVar3 = new zzhip(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhipVar.zza().multiply(zzhipVar2.zza()).multiply(zzhipVar.zzc()).multiply(zzhipVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhipVar.zza().multiply(zzhipVar2.zzc()).add(zzhipVar2.zza().multiply(zzhipVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhipVar3.zzb(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhipVar3.zzd(zzhipVar.zzc().multiply(zzhipVar2.zzc()).add(zzhipVar.zza().multiply(zzhipVar2.zza())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhipVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }

    private static zzhij zzc(zzhip zzhipVar) {
        BigInteger bigIntegerAdd = zzhipVar.zzc().add(zzhipVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhij(zzhiv.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhiv.zzg(zzb(zzhipVar.zzc().subtract(zzhipVar.zza()).mod(bigInteger))), zzhiv.zzg(zzb(zzh.multiply(zzhipVar.zza()).multiply(zzhipVar.zzc()).mod(bigInteger))));
    }
}
