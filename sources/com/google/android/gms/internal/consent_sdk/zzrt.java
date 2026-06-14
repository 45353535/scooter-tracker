package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i10, int i11, zzrq zzrqVar, boolean z10, int[] iArr2, int i12, int i13, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z11 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z11 = true;
        }
        this.zzf = z11;
        this.zzg = iArr2;
        this.zzh = i12;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i10, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i10 & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i10, int i11) {
        return zzsw.zzc(obj, (long) (zzm(i11) & 1048575)) == i10;
    }

    private static boolean zzD(Object obj, long j10) {
        return ((Boolean) zzsw.zzf(obj, j10)).booleanValue();
    }

    private static final void zzE(int i10, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i10, (String) obj);
        } else {
            zztbVar.zzd(i10, (zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.consent_sdk.zzrt zzi(java.lang.Class r32, com.google.android.gms.internal.consent_sdk.zzrn r33, com.google.android.gms.internal.consent_sdk.zzrv r34, com.google.android.gms.internal.consent_sdk.zzrc r35, com.google.android.gms.internal.consent_sdk.zzsp r36, com.google.android.gms.internal.consent_sdk.zzqb r37, com.google.android.gms.internal.consent_sdk.zzrl r38) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzi(java.lang.Class, com.google.android.gms.internal.consent_sdk.zzrn, com.google.android.gms.internal.consent_sdk.zzrv, com.google.android.gms.internal.consent_sdk.zzrc, com.google.android.gms.internal.consent_sdk.zzsp, com.google.android.gms.internal.consent_sdk.zzqb, com.google.android.gms.internal.consent_sdk.zzrl):com.google.android.gms.internal.consent_sdk.zzrt");
    }

    private static double zzj(Object obj, long j10) {
        return ((Double) zzsw.zzf(obj, j10)).doubleValue();
    }

    private static float zzk(Object obj, long j10) {
        return ((Float) zzsw.zzf(obj, j10)).floatValue();
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzsw.zzf(obj, j10)).intValue();
    }

    private final int zzm(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzsw.zzf(obj, j10)).longValue();
    }

    private final zzsa zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzsa zzsaVar = (zzsa) objArr[i12];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarZzb = zzrx.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzsaVarZzb;
        return zzsaVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    private final void zzt(Object obj, Object obj2, int i10) {
        if (zzy(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzy(obj, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzv(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzC(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzC(obj, i11, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzw(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = 1048575 & iZzm;
        if (j10 == 1048575) {
            return;
        }
        zzsw.zzq(obj, j10, (1 << (iZzm >>> 20)) | zzsw.zzc(obj, j10));
    }

    private final void zzw(Object obj, int i10, int i11) {
        zzsw.zzq(obj, zzm(i11) & 1048575, i10);
    }

    private final boolean zzx(Object obj, Object obj2, int i10) {
        return zzy(obj, i10) == zzy(obj2, i10);
    }

    private final boolean zzy(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = iZzm & 1048575;
        if (j10 != 1048575) {
            return (zzsw.zzc(obj, j10) & (1 << (iZzm >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j11)) != 0;
            case 2:
                return zzsw.zzd(obj, j11) != 0;
            case 3:
                return zzsw.zzd(obj, j11) != 0;
            case 4:
                return zzsw.zzc(obj, j11) != 0;
            case 5:
                return zzsw.zzd(obj, j11) != 0;
            case 6:
                return zzsw.zzc(obj, j11) != 0;
            case 7:
                return zzsw.zzw(obj, j11);
            case 8:
                Object objZzf = zzsw.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzpm) {
                    return !zzpm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j11) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j11));
            case 11:
                return zzsw.zzc(obj, j11) != 0;
            case 12:
                return zzsw.zzc(obj, j11) != 0;
            case 13:
                return zzsw.zzc(obj, j11) != 0;
            case 14:
                return zzsw.zzd(obj, j11) != 0;
            case 15:
                return zzsw.zzc(obj, j11) != 0;
            case 16:
                return zzsw.zzd(obj, j11) != 0;
            case 17:
                return zzsw.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzy(obj, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04bf A[PHI: r17
  0x04bf: PHI (r17v35 int) = (r17v28 int), (r17v36 int) binds: [B:217:0x0598, B:183:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (iHashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzo = zzo(i12);
            int i14 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzn) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j10));
                    byte[] bArr = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr2 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr3 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr4 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzqs.zza(zzsw.zzw(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzf = zzsw.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr5 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr6 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzf2 = zzsw.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j10));
                        byte[] bArr7 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzqs.zza(zzD(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzd(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int iZzo = zzo(i10);
            int i11 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzn) {
                case 0:
                    if (zzy(obj2, i10)) {
                        zzsw.zzo(obj, j10, zzsw.zza(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 1:
                    if (zzy(obj2, i10)) {
                        zzsw.zzp(obj, j10, zzsw.zzb(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 2:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 3:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 4:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 5:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 6:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 7:
                    if (zzy(obj2, i10)) {
                        zzsw.zzm(obj, j10, zzsw.zzw(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 8:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 9:
                    zzt(obj, obj2, i10);
                    break;
                case 10:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 11:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 12:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 13:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 14:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 15:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 16:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 17:
                    zzt(obj, obj2, i10);
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
                    zzqr zzqrVarZzd = (zzqr) zzsw.zzf(obj, j10);
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj2, j10);
                    int size = zzqrVarZzd.size();
                    int size2 = zzqrVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVarZzd.zzc()) {
                            zzqrVarZzd = zzqrVarZzd.zzd(size2 + size);
                        }
                        zzqrVarZzd.addAll(zzqrVar);
                    }
                    if (size > 0) {
                        zzqrVar = zzqrVarZzd;
                    }
                    zzsw.zzs(obj, j10, zzqrVar);
                    break;
                case 50:
                    int i13 = zzsc.zza;
                    zzrk zzrkVarZzb = (zzrk) zzsw.zzf(obj, j10);
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj2, j10);
                    if (!zzrkVar.isEmpty()) {
                        if (!zzrkVarZzb.zze()) {
                            zzrkVarZzb = zzrkVarZzb.zzb();
                        }
                        zzrkVarZzb.zzd(zzrkVar);
                    }
                    zzsw.zzs(obj, j10, zzrkVarZzb);
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
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzu(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzu(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r19, com.google.android.gms.internal.consent_sdk.zztb r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzf(java.lang.Object, com.google.android.gms.internal.consent_sdk.zztb):void");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzx(obj, obj2, i10) || Double.doubleToLongBits(zzsw.zza(obj, j10)) != Double.doubleToLongBits(zzsw.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzx(obj, obj2, i10) || Float.floatToIntBits(zzsw.zzb(obj, j10)) != Float.floatToIntBits(zzsw.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzx(obj, obj2, i10) || zzsw.zzw(obj, j10) != zzsw.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
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
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
                    break;
                case 50:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
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
                    long jZzm = zzm(i10) & 1048575;
                    if (zzsw.zzc(obj, jZzm) != zzsw.zzc(obj2, jZzm) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzh(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzh(java.lang.Object):boolean");
    }
}
