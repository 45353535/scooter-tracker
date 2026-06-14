package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i10, int i11, zzfw zzfwVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        long jZzv = zzv(i10) & 1048575;
        if (zzG(obj2, i10)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i10);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i10);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int iZzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzv & 1048575;
        if (zzJ(obj2, i11, i10)) {
            Object objZzf = zzJ(obj, i11, i10) ? zzhi.zzf(obj, j10) : null;
            Object objZzf2 = zzhi.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j10, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j10, objZzf2);
                zzE(obj, i11, i10);
            }
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzs = zzs(i10);
        long j10 = 1048575 & iZzs;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j10, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzhi.zzn(obj, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(Object obj, Object obj2, int i10) {
        return zzG(obj, i10) == zzG(obj2, i10);
    }

    private final boolean zzG(Object obj, int i10) {
        int iZzs = zzs(i10);
        long j10 = iZzs & 1048575;
        if (j10 != 1048575) {
            return (zzhi.zzc(obj, j10) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i10);
        long j11 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j11)) != 0;
            case 2:
                return zzhi.zzd(obj, j11) != 0;
            case 3:
                return zzhi.zzd(obj, j11) != 0;
            case 4:
                return zzhi.zzc(obj, j11) != 0;
            case 5:
                return zzhi.zzd(obj, j11) != 0;
            case 6:
                return zzhi.zzc(obj, j11) != 0;
            case 7:
                return zzhi.zzt(obj, j11);
            case 8:
                Object objZzf = zzhi.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j11) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j11));
            case 11:
                return zzhi.zzc(obj, j11) != 0;
            case 12:
                return zzhi.zzc(obj, j11) != 0;
            case 13:
                return zzhi.zzc(obj, j11) != 0;
            case 14:
                return zzhi.zzd(obj, j11) != 0;
            case 15:
                return zzhi.zzc(obj, j11) != 0;
            case 16:
                return zzhi.zzd(obj, j11) != 0;
            case 17:
                return zzhi.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzG(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzI(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(Object obj, int i10, int i11) {
        return zzhi.zzc(obj, (long) (zzs(i11) & 1048575)) == i10;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j10, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzds zzdsVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzdt.zzm(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzdt.zzj(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzdt.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzdt.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzdt.zzm(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                int i18 = zzdsVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzez.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzdt.zzd(zzy(i17), bArr, i10, i11, zzdsVar);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzdt.zza(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, zzdsVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzdt.zzj(bArr, i10, zzdsVar);
                int i19 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i17);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i12, Long.valueOf(i19));
                    return iZzj3;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i19));
                unsafe.putInt(obj, j11, i13);
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzdt.zzj(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzdt.zzm(bArr, i10, zzdsVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 == 3) {
                    int iZzc = zzdt.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iZzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i23 = -1;
        int iZzm = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (iZzm < i22) {
            int iZzk = iZzm + 1;
            int i28 = bArr2[iZzm];
            if (i28 < 0) {
                iZzk = zzdt.zzk(i28, bArr2, iZzk, zzdsVar2);
                i28 = zzdsVar2.zza;
            }
            int i29 = iZzk;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int iZzr = i30 > i24 ? zzfzVar.zzr(i30, i25 / 3) : zzfzVar.zzq(i30);
            if (iZzr == i23) {
                unsafe = unsafe2;
                i12 = i28;
                i13 = i23;
                i14 = i30;
                i15 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i32 = iArr[iZzr + 1];
                int iZzu = zzu(i32);
                int i33 = i28;
                int i34 = iZzr;
                long j10 = i32 & 1048575;
                if (iZzu <= 17) {
                    int i35 = iArr[i34 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i27) {
                        int i38 = 1048575;
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj3, i27, i26);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i26 = unsafe2.getInt(obj3, i37);
                        }
                        i27 = i37;
                    }
                    switch (iZzu) {
                        case 0:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                zzhi.zzl(obj3, j10, Double.longBitsToDouble(zzdt.zzn(bArr2, i29)));
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 1:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                zzhi.zzm(obj3, j10, Float.intBitsToFloat(zzdt.zzb(bArr2, i29)));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i29, zzdsVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j10, zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i26 |= i36;
                                iZzm = iZzm2;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                i22 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i29, zzdsVar2);
                                unsafe2.putInt(obj3, j10, zzdsVar2.zza);
                                i26 |= i36;
                                i22 = i11;
                                iZzm = iZzj;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j10, zzdt.zzn(bArr2, i29));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj3, j10, zzdt.zzb(bArr2, i29));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 7:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i29, zzdsVar2);
                                zzhi.zzk(obj3, j10, zzdsVar2.zzb != 0);
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 8:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i32) == 0 ? zzdt.zzg(bArr2, i29, zzdsVar2) : zzdt.zzh(bArr2, i29, zzdsVar2);
                                unsafe2.putObject(obj3, j10, zzdsVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 9:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzd(zzfzVar.zzy(i21), bArr2, i29, i22, zzdsVar2);
                                Object object = unsafe2.getObject(obj3, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j10, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j10, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 10:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zza(bArr2, i29, zzdsVar2);
                                unsafe2.putObject(obj3, j10, zzdsVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 12:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i29, zzdsVar2);
                                unsafe2.putInt(obj3, j10, zzdsVar2.zza);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 15:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i29, zzdsVar2);
                                unsafe2.putInt(obj3, j10, zzei.zzb(zzdsVar2.zza));
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        case 16:
                            if (i31 != 0) {
                                i21 = i34;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i29, zzdsVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i21 = i34;
                                unsafe5.putLong(obj6, j10, zzei.zzc(zzdsVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i26 |= i36;
                                iZzm = iZzm3;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                            }
                            break;
                        default:
                            i21 = i34;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i14 = i30;
                            i15 = i21;
                            i13 = -1;
                            i12 = i33 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i15 = i34;
                    if (iZzu != 27) {
                        i16 = i29;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i19 = i27;
                            int iZzp = zzfzVar.zzp(obj, bArr, i16, i11, i33 == true ? 1 : 0, i30, i31, i15, i32, iZzu, j10, zzdsVar);
                            i18 = i33 == true ? 1 : 0;
                            i20 = i30;
                            if (iZzp != i16) {
                                zzfzVar = this;
                                obj3 = obj;
                                zzdsVar2 = zzdsVar;
                                iZzm = iZzp;
                                i25 = i15;
                                i24 = i20;
                                i27 = i19;
                                i23 = i13;
                                i26 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i11;
                            } else {
                                obj2 = obj;
                                i29 = iZzp;
                                i14 = i20;
                                i12 = i18;
                            }
                        } else {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i18 = i33 == true ? 1 : 0;
                            i19 = i27;
                            i20 = i30;
                            if (iZzu != 50) {
                                i14 = i20;
                                int iZzn = zzn(obj, bArr, i16, i11, i18 == true ? 1 : 0, i14, i31, i32, iZzu, j10, i15, zzdsVar);
                                obj2 = obj;
                                i12 = i18 == true ? 1 : 0;
                                i15 = i15;
                                if (iZzn != i16) {
                                    zzfzVar = this;
                                    zzdsVar2 = zzdsVar;
                                    i24 = i14;
                                    iZzm = iZzn;
                                    i25 = i15;
                                    obj3 = obj2;
                                    i27 = i19;
                                    i23 = i13;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i22 = i11;
                                } else {
                                    i29 = iZzn;
                                }
                            } else if (i31 == 2) {
                                int iZzm4 = zzm(obj, bArr, i16, i11, i15, j10, zzdsVar);
                                i15 = i15;
                                if (iZzm4 != i16) {
                                    zzfzVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzdsVar2 = zzdsVar;
                                    iZzm = iZzm4;
                                    i25 = i15;
                                    i24 = i20;
                                    i27 = i19;
                                    i23 = -1;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    i22 = i11;
                                } else {
                                    obj2 = obj;
                                    i29 = iZzm4;
                                    i14 = i20;
                                    i12 = i18;
                                }
                            } else {
                                i15 = i15;
                                obj2 = obj;
                                i29 = i16;
                                i14 = i20;
                                i12 = i18;
                            }
                        }
                    } else if (i31 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj3, j10);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j10, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(zzfzVar.zzy(i15), i33 == true ? 1 : 0, bArr2, i29, i11, zzeyVarZzd, zzdsVar2);
                        bArr2 = bArr;
                        zzdsVar2 = zzdsVar;
                        iZzm = iZze;
                        i25 = i15;
                        unsafe2 = unsafe2;
                        i24 = i30;
                        i23 = -1;
                        obj3 = obj;
                        i22 = i11;
                    } else {
                        i16 = i29;
                        i19 = i27;
                        i17 = i26;
                        unsafe = unsafe2;
                        i20 = i30;
                        i13 = -1;
                        i18 = i33 == true ? 1 : 0;
                        obj2 = obj;
                        i29 = i16;
                        i14 = i20;
                        i12 = i18;
                    }
                    i27 = i19;
                    i26 = i17;
                }
            }
            int iZzi = zzdt.zzi(i12 == true ? 1 : 0, bArr, i29, i11, zzc(obj2), zzdsVar);
            bArr2 = bArr;
            zzdsVar2 = zzdsVar;
            i24 = i14;
            i25 = i15;
            obj3 = obj2;
            i23 = i13;
            unsafe2 = unsafe;
            i22 = i11;
            iZzm = iZzi;
            zzfzVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i39 = i22;
        int i40 = i27;
        int i41 = i26;
        if (i40 != 1048575) {
            unsafe7.putInt(obj7, i40, i41);
        }
        if (iZzm == i39) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzds zzdsVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j11);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i10, zzdsVar);
                    int i17 = zzdsVar.zza + iZzj;
                    while (iZzj < i17) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i17) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i10)));
                    int i18 = i10 + 8;
                    while (i18 < i11) {
                        int iZzj2 = zzdt.zzj(bArr, i18, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return i18;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i18 = iZzj2 + 8;
                    }
                    return i18;
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i19 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i19) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i19) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i10)));
                    int i20 = i10 + 4;
                    while (i20 < i11) {
                        int iZzj4 = zzdt.zzj(bArr, i20, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return i20;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i20 = iZzj4 + 4;
                    }
                    return i20;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i21 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i21) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i21) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i10, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzdt.zzf(bArr, i10, zzeyVar, zzdsVar);
                }
                if (i14 == 0) {
                    return zzdt.zzl(i12, bArr, i10, i11, zzeyVar, zzdsVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i22 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i22) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i22) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i10));
                    int i23 = i10 + 8;
                    while (i23 < i11) {
                        int iZzj8 = zzdt.zzj(bArr, i23, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return i23;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i23 = iZzj8 + 8;
                    }
                    return i23;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i24 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i24) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i24) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i10));
                    int i25 = i10 + 4;
                    while (i25 < i11) {
                        int iZzj10 = zzdt.zzj(bArr, i25, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return i25;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i25 = iZzj10 + 4;
                    }
                    return i25;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i26 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i26) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i26) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i10, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i10, zzdsVar);
                        int i27 = zzdsVar.zza;
                        if (i27 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i27 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i27, zzez.zzb));
                            iZzj13 += i27;
                        }
                        while (iZzj13 < i11) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i12 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i28 = zzdsVar.zza;
                            if (i28 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i28 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i28, zzez.zzb));
                                iZzj13 += i28;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i29 = zzdsVar.zza;
                    if (i29 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i29 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i30 = iZzj15 + i29;
                        if (!zzhm.zzd(bArr, iZzj15, i30)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i29, zzez.zzb));
                        iZzj15 = i30;
                    }
                    while (iZzj15 < i11) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i31 = zzdsVar.zza;
                        if (i31 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i31 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i32 = iZzj15 + i31;
                            if (!zzhm.zzd(bArr, iZzj15, i32)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i31, zzez.zzb));
                            iZzj15 = i32;
                        }
                    }
                    return iZzj15;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return zzdt.zze(zzy(i15), i12, bArr, i10, i11, zzeyVar, zzdsVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i33 = zzdsVar.zza;
                    if (i33 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i33 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i33 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i33));
                        iZzj17 += i33;
                    }
                    while (iZzj17 < i11) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i34 = zzdsVar.zza;
                        if (i34 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i34 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i34 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i34));
                            iZzj17 += i34;
                        }
                    }
                    return iZzj17;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzl = zzdt.zzl(i12, bArr, i10, i11, zzeyVar, zzdsVar);
                    }
                    return i10;
                }
                iZzl = zzdt.zzf(bArr, i10, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i13, zzeyVar, zzx(i15), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i35 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i35) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i35) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i10, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i11) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i36 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i36) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i36) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i10, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i10;
            default:
                if (i14 == 3) {
                    zzgh zzghVarZzy = zzy(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i10, i11, i37, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i11) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i12 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i11, i37, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i10;
        }
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, 0);
    }

    private final int zzr(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, i11);
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzw(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    private final zzex zzx(int i10) {
        int i11 = i10 / 3;
        return (zzex) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i10;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzv = zzv(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j10)));
                    i11 = i10 + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j10)).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iZzc = zzhi.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 51:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j10)).doubleValue()));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j10)).floatValue());
                        i11 = i10 + iZzc;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j10)).booleanValue());
                        i11 = i10 + iZzc;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j10)).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzl(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzhi.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
            }
        }
        return (i11 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0088. Please report as an issue. */
    final int zzb(Object obj, byte[] bArr, int i10, int i11, int i12, zzds zzdsVar) throws IOException {
        int i13;
        zzfz<T> zzfzVar;
        Unsafe unsafe;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int i19;
        Unsafe unsafe2;
        int i20;
        zzds zzdsVar2;
        int iZzj;
        int i21;
        int i22;
        zzds zzdsVar3;
        int i23;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr3;
        zzds zzdsVar4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        zzfz<T> zzfzVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i29 = i11;
        zzds zzdsVar5 = zzdsVar;
        Unsafe unsafe4 = zzb;
        int i30 = -1;
        int i31 = i10;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int iZzr = 0;
        int i35 = 1048575;
        while (true) {
            if (i31 < i29) {
                int iZzk = i31 + 1;
                int i36 = bArr4[i31];
                if (i36 < 0) {
                    iZzk = zzdt.zzk(i36, bArr4, iZzk, zzdsVar5);
                    i36 = zzdsVar5.zza;
                }
                int i37 = i36;
                int i38 = iZzk;
                int i39 = (i37 == true ? 1 : 0) >>> 3;
                int i40 = (i37 == true ? 1 : 0) & 7;
                iZzr = i39 > i32 ? zzfzVar2.zzr(i39, iZzr / 3) : zzfzVar2.zzq(i39);
                if (iZzr == i30) {
                    i13 = i12;
                    zzfzVar = zzfzVar2;
                    i15 = i38;
                    i16 = i39;
                    unsafe = unsafe4;
                    i17 = i30;
                    i33 = i37 == true ? 1 : 0;
                    iZzr = 0;
                    i14 = 1048575;
                    obj2 = obj4;
                } else {
                    int[] iArr = zzfzVar2.zzc;
                    int i41 = iArr[iZzr + 1];
                    int iZzu = zzu(i41);
                    int i42 = i37 == true ? 1 : 0;
                    long j10 = i41 & 1048575;
                    if (iZzu <= 17) {
                        int i43 = iArr[iZzr + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i35) {
                            i18 = 1048575;
                            if (i35 != 1048575) {
                                unsafe4.putInt(obj4, i35, i34);
                            }
                            i35 = i45;
                            i34 = unsafe4.getInt(obj4, i45);
                        } else {
                            i18 = 1048575;
                        }
                        switch (iZzu) {
                            case 0:
                                bArr3 = bArr;
                                i19 = i18;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i20 = i38;
                                i16 = i39;
                                if (i40 == 1) {
                                    zzhi.zzl(obj3, j10, Double.longBitsToDouble(zzdt.zzn(bArr3, i20)));
                                    i31 = i20 + 8;
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i33 = i42 == true ? 1 : 0;
                                    i32 = i16;
                                    i30 = -1;
                                } else {
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i19 = i18;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i20 = i38;
                                i16 = i39;
                                if (i40 == 5) {
                                    zzhi.zzm(obj3, j10, Float.intBitsToFloat(zzdt.zzb(bArr3, i20)));
                                    i31 = i20 + 4;
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i33 = i42 == true ? 1 : 0;
                                    i32 = i16;
                                    i30 = -1;
                                } else {
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i20 = i38;
                                i16 = i39;
                                zzdsVar4 = zzdsVar;
                                if (i40 == 0) {
                                    int iZzm = zzdt.zzm(bArr3, i20, zzdsVar4);
                                    unsafe2.putLong(obj, j10, zzdsVar4.zzb);
                                    obj3 = obj;
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe2;
                                    i31 = iZzm;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i33 = i42 == true ? 1 : 0;
                                    i32 = i16;
                                    i30 = -1;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i20 = i38;
                                i16 = i39;
                                zzdsVar2 = zzdsVar;
                                if (i40 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i20, zzdsVar2);
                                    unsafe2.putInt(obj4, j10, zzdsVar2.zza);
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i16 = i39;
                                zzdsVar2 = zzdsVar;
                                if (i40 == 1) {
                                    Object obj5 = obj4;
                                    unsafe2.putLong(obj5, j10, zzdt.zzn(bArr2, i38));
                                    unsafe2 = unsafe2;
                                    obj4 = obj5;
                                    iZzj = i38 + 8;
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i20 = i38;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar2 = zzdsVar;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj4, j10, zzdt.zzb(bArr2, i21));
                                    iZzj = i21 + 4;
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar2 = zzdsVar;
                                if (i40 == 0) {
                                    iZzj = zzdt.zzm(bArr2, i21, zzdsVar2);
                                    i42 = i42 == true ? 1 : 0;
                                    zzhi.zzk(obj4, j10, zzdsVar2.zzb != 0);
                                    i34 |= i44;
                                    i29 = i11;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i42 = i42 == true ? 1 : 0;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i22 = i42 == true ? 1 : 0;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar3 = zzdsVar;
                                if (i40 == 2) {
                                    iZzj = (536870912 & i41) == 0 ? zzdt.zzg(bArr2, i21, zzdsVar3) : zzdt.zzh(bArr2, i21, zzdsVar3);
                                    unsafe2.putObject(obj4, j10, zzdsVar3.zzc);
                                    i34 |= i44;
                                    i29 = i11;
                                    i33 = i22 == true ? 1 : 0;
                                    zzdsVar5 = zzdsVar3;
                                    i32 = i16;
                                    i30 = -1;
                                    unsafe4 = unsafe2;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i42 = i22;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i23 = i11;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i22 = i42 == true ? 1 : 0;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar3 = zzdsVar;
                                if (i40 == 2) {
                                    iZzj = zzdt.zzd(zzfzVar2.zzy(iZzr), bArr2, i21, i23, zzdsVar3);
                                    if ((i34 & i44) == 0) {
                                        unsafe2.putObject(obj4, j10, zzdsVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j10, zzez.zzg(unsafe2.getObject(obj4, j10), zzdsVar3.zzc));
                                    }
                                    i34 |= i44;
                                    i33 = i22;
                                    i29 = i23;
                                    zzdsVar5 = zzdsVar3;
                                    i32 = i16;
                                    i30 = -1;
                                    unsafe4 = unsafe2;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i42 = i22;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i23 = i11;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i22 = i42 == true ? 1 : 0;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar3 = zzdsVar;
                                if (i40 == 2) {
                                    iZzj = zzdt.zza(bArr2, i21, zzdsVar3);
                                    unsafe2.putObject(obj4, j10, zzdsVar3.zzc);
                                    i34 |= i44;
                                    i33 = i22;
                                    i29 = i23;
                                    zzdsVar5 = zzdsVar3;
                                    i32 = i16;
                                    i30 = -1;
                                    unsafe4 = unsafe2;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i42 = i22;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i23 = i11;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar3 = zzdsVar;
                                if (i40 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i21, zzdsVar3);
                                    int i46 = zzdsVar3.zza;
                                    zzex zzexVarZzx = zzfzVar2.zzx(iZzr);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        i22 = i42 == true ? 1 : 0;
                                        unsafe2.putInt(obj4, j10, i46);
                                        i34 |= i44;
                                        i33 = i22;
                                        i29 = i23;
                                        zzdsVar5 = zzdsVar3;
                                        i32 = i16;
                                        i30 = -1;
                                        unsafe4 = unsafe2;
                                        i31 = iZzj;
                                        bArr4 = bArr2;
                                    } else {
                                        zzgz zzgzVarZzc = zzc(obj4);
                                        Long lValueOf = Long.valueOf(i46);
                                        i22 = i42 == true ? 1 : 0;
                                        zzgzVarZzc.zzf(i22 == true ? 1 : 0, lValueOf);
                                        i33 = i22;
                                        i29 = i23;
                                        zzdsVar5 = zzdsVar3;
                                        i32 = i16;
                                        i30 = -1;
                                        unsafe4 = unsafe2;
                                        i31 = iZzj;
                                        bArr4 = bArr2;
                                    }
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i18;
                                unsafe2 = unsafe4;
                                i21 = i38;
                                i16 = i39;
                                zzdsVar2 = zzdsVar;
                                if (i40 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i21, zzdsVar2);
                                    unsafe2.putInt(obj4, j10, zzei.zzb(zzdsVar2.zza));
                                    i34 |= i44;
                                    unsafe4 = unsafe2;
                                    i29 = i11;
                                    zzdsVar5 = zzdsVar2;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 16:
                                i19 = i18;
                                i21 = i38;
                                i16 = i39;
                                if (i40 == 0) {
                                    int iZzm2 = zzdt.zzm(bArr, i21, zzdsVar);
                                    Object obj6 = obj4;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(obj6, j10, zzei.zzc(zzdsVar.zzb));
                                    obj4 = obj6;
                                    i34 |= i44;
                                    unsafe4 = unsafe5;
                                    i31 = iZzm2;
                                    bArr4 = bArr;
                                    i29 = i11;
                                    zzdsVar5 = zzdsVar;
                                    i33 = i42 == true ? 1 : 0;
                                    i32 = i16;
                                    i30 = -1;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            default:
                                if (i40 == 3) {
                                    i16 = i39;
                                    iZzj = zzdt.zzc(zzfzVar2.zzy(iZzr), bArr, i38, i11, (i39 << 3) | 4, zzdsVar);
                                    bArr2 = bArr;
                                    if ((i34 & i44) == 0) {
                                        unsafe4.putObject(obj4, j10, zzdsVar.zzc);
                                    } else {
                                        unsafe4.putObject(obj4, j10, zzez.zzg(unsafe4.getObject(obj4, j10), zzdsVar.zzc));
                                    }
                                    i34 |= i44;
                                    zzdsVar5 = zzdsVar;
                                    i29 = i11;
                                    i33 = i42;
                                    i32 = i16;
                                    i30 = -1;
                                    i31 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i19 = i18;
                                    i21 = i38;
                                    i16 = i39;
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i20 = i21;
                                    i13 = i12;
                                    zzfzVar = zzfzVar2;
                                    i15 = i20;
                                    obj2 = obj3;
                                    i33 = i42;
                                    i14 = i19;
                                    i17 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                        }
                    } else {
                        obj3 = obj4;
                        Unsafe unsafe6 = unsafe4;
                        i16 = i39;
                        if (iZzu == 27) {
                            if (i40 == 2) {
                                zzey zzeyVarZzd = (zzey) unsafe6.getObject(obj3, j10);
                                if (!zzeyVarZzd.zzc()) {
                                    int size = zzeyVarZzd.size();
                                    zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                    unsafe6.putObject(obj3, j10, zzeyVarZzd);
                                }
                                unsafe4 = unsafe6;
                                int iZze = zzdt.zze(zzfzVar2.zzy(iZzr), i42 == true ? 1 : 0, bArr, i38, i11, zzeyVarZzd, zzdsVar);
                                bArr4 = bArr;
                                i29 = i11;
                                zzdsVar5 = zzdsVar;
                                i31 = iZze;
                                obj4 = obj3;
                                i33 = i42 == true ? 1 : 0;
                                i32 = i16;
                                i30 = -1;
                            } else {
                                i24 = i38;
                                i25 = i35;
                                i26 = i34;
                                i27 = iZzr;
                                i28 = i42 == true ? 1 : 0;
                                i14 = 1048575;
                                i17 = -1;
                                unsafe = unsafe6;
                            }
                        } else if (iZzu <= 49) {
                            int i47 = i35;
                            i26 = i34;
                            i14 = 1048575;
                            i17 = -1;
                            unsafe = unsafe6;
                            int iZzp = zzfzVar2.zzp(obj3, bArr, i38, i11, i42 == true ? 1 : 0, i16, i40, iZzr, i41, iZzu, j10, zzdsVar);
                            i27 = iZzr;
                            if (iZzp != i38) {
                                zzfzVar2 = this;
                                obj4 = obj;
                                bArr4 = bArr;
                                i35 = i47;
                                i29 = i11;
                                i31 = iZzp;
                                i33 = i42 == true ? 1 : 0;
                                iZzr = i27;
                                i34 = i26;
                                unsafe4 = unsafe;
                                i30 = i17;
                                i32 = i16;
                                zzdsVar5 = zzdsVar;
                            } else {
                                zzfzVar = this;
                                obj2 = obj;
                                i35 = i47;
                                i15 = iZzp;
                                i33 = i42 == true ? 1 : 0;
                                iZzr = i27;
                                i34 = i26;
                                i13 = i12;
                            }
                        } else {
                            i24 = i38;
                            i25 = i35;
                            i26 = i34;
                            i27 = iZzr;
                            i14 = 1048575;
                            i17 = -1;
                            i28 = i42 == true ? 1 : 0;
                            unsafe = unsafe6;
                            if (iZzu != 50) {
                                i33 = i28 == true ? 1 : 0;
                                int iZzn = zzn(obj, bArr, i24, i11, i33 == true ? 1 : 0, i16, i40, i41, iZzu, j10, i27, zzdsVar);
                                obj2 = obj;
                                zzfzVar = this;
                                if (iZzn != i24) {
                                    bArr4 = bArr;
                                    i35 = i25;
                                    i29 = i11;
                                    zzfzVar2 = zzfzVar;
                                    i31 = iZzn;
                                    obj4 = obj2;
                                    iZzr = i27;
                                    i34 = i26;
                                    unsafe4 = unsafe;
                                    i30 = i17;
                                    i32 = i16;
                                    zzdsVar5 = zzdsVar;
                                } else {
                                    i35 = i25;
                                    i15 = iZzn;
                                    iZzr = i27;
                                    i34 = i26;
                                    i13 = i12;
                                }
                            } else if (i40 == 2) {
                                int iZzm3 = zzm(obj, bArr, i24, i11, i27, j10, zzdsVar);
                                if (iZzm3 != i24) {
                                    zzfzVar2 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i35 = i25;
                                    i29 = i11;
                                    zzdsVar5 = zzdsVar;
                                    i31 = iZzm3;
                                    i33 = i28 == true ? 1 : 0;
                                    iZzr = i27;
                                    i34 = i26;
                                    unsafe4 = unsafe;
                                    i30 = -1;
                                    i32 = i16;
                                } else {
                                    obj2 = obj;
                                    i35 = i25;
                                    i13 = i12;
                                    i15 = iZzm3;
                                    i33 = i28 == true ? 1 : 0;
                                    iZzr = i27;
                                    i34 = i26;
                                    zzfzVar = this;
                                }
                            }
                        }
                        zzfzVar = this;
                        obj2 = obj;
                        i35 = i25;
                        i13 = i12;
                        i15 = i24;
                        i33 = i28;
                        iZzr = i27;
                        i34 = i26;
                    }
                }
                if (i33 != i13 || i13 == 0) {
                    int i48 = i33;
                    int iZzi = zzdt.zzi(i48 == true ? 1 : 0, bArr, i15, i11, zzc(obj2), zzdsVar);
                    i33 = i48 == true ? 1 : 0;
                    zzdsVar5 = zzdsVar;
                    i29 = i11;
                    zzfzVar2 = zzfzVar;
                    obj4 = obj2;
                    unsafe4 = unsafe;
                    i30 = i17;
                    i32 = i16;
                    i31 = iZzi;
                    bArr4 = bArr;
                } else {
                    i29 = i11;
                    i31 = i15;
                }
            } else {
                i13 = i12;
                zzfzVar = zzfzVar2;
                unsafe = unsafe4;
                i14 = 1048575;
                obj2 = obj4;
            }
        }
        if (i35 != i14) {
            unsafe.putInt(obj2, i35, i34);
        }
        for (int i49 = zzfzVar.zzj; i49 < zzfzVar.zzk; i49++) {
            int i50 = zzfzVar.zzi[i49];
            int i51 = zzfzVar.zzc[i50];
            Object objZzf = zzhi.zzf(obj2, zzfzVar.zzv(i50) & i14);
            if (objZzf != null && zzfzVar.zzx(i50) != null) {
                throw null;
            }
        }
        if (i13 == 0) {
            if (i31 != i29) {
                throw zzfa.zzd();
            }
        } else if (i31 > i29 || i33 != i13) {
            throw zzfa.zzd();
        }
        return i31;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long jZzv = zzv(this.zzi[i11]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(obj, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzv = zzv(i10);
            long j10 = 1048575 & iZzv;
            int i11 = this.zzc[i10];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i10)) {
                        zzhi.zzl(obj, j10, zzhi.zza(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i10)) {
                        zzhi.zzm(obj, j10, zzhi.zzb(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i10)) {
                        zzhi.zzk(obj, j10, zzhi.zzt(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i10, i11, zzdsVar);
        } else {
            zzb(obj, bArr, i10, i11, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzv = zzv(i10);
            long j10 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i10) || Double.doubleToLongBits(zzhi.zza(obj, j10)) != Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i10) || Float.floatToIntBits(zzhi.zzb(obj, j10)) != Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i10) || zzhi.zzt(obj, j10) != zzhi.zzt(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i10) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
