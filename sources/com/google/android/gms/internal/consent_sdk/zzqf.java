package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzqf {
    private static final zzqf zzd = new zzqf(true);
    final zzsi zza = new zzsd();
    boolean zzb;
    boolean zzc;

    private zzqf() {
    }

    static int zza(zzsz zzszVar, int i10, Object obj) {
        int iZzC = zzpv.zzC(i10 << 3);
        if (zzszVar == zzsz.zzj) {
            iZzC += iZzC;
        }
        return iZzC + zzb(zzszVar, obj);
    }

    static int zzb(zzsz zzszVar, Object obj) {
        int iZzd;
        int iZzC;
        zzsz zzszVar2 = zzsz.zza;
        zzta zztaVar = zzta.INT;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = zzpv.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = zzpv.zzf;
                return 4;
            case 2:
                return zzpv.zzD(((Long) obj).longValue());
            case 3:
                return zzpv.zzD(((Long) obj).longValue());
            case 4:
                return zzpv.zzD(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = zzpv.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = zzpv.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = zzpv.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzpm)) {
                    return zzpv.zzB((String) obj);
                }
                int i15 = zzpv.zzf;
                iZzd = ((zzpm) obj).zzd();
                iZzC = zzpv.zzC(iZzd);
                break;
                break;
            case 9:
                return ((zzrq) obj).zzn();
            case 10:
                if (!(obj instanceof zzqz)) {
                    return zzpv.zzA((zzrq) obj);
                }
                iZzd = ((zzqz) obj).zza();
                iZzC = zzpv.zzC(iZzd);
                break;
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    int i16 = zzpv.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzC = zzpv.zzC(iZzd);
                } else {
                    int i17 = zzpv.zzf;
                    iZzd = ((zzpm) obj).zzd();
                    iZzC = zzpv.zzC(iZzd);
                }
                break;
            case 12:
                return zzpv.zzC(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzqo ? zzpv.zzD(((zzqo) obj).zza()) : zzpv.zzD(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = zzpv.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = zzpv.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzpv.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzpv.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzC + iZzd;
    }

    public static int zzc(zzqe zzqeVar, Object obj) {
        zzsz zzszVarZzb = zzqeVar.zzb();
        int iZza = zzqeVar.zza();
        if (!zzqeVar.zze()) {
            return zza(zzszVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzqeVar.zzd()) {
            int iZza2 = 0;
            while (i10 < size) {
                iZza2 += zza(zzszVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i10 < size) {
            iZzb += zzb(zzszVarZzb, list.get(i10));
            i10++;
        }
        return zzpv.zzC(iZza << 3) + iZzb + zzpv.zzC(iZzb);
    }

    public static zzqf zze() {
        return zzd;
    }

    static void zzi(zzpv zzpvVar, zzsz zzszVar, int i10, Object obj) throws IOException {
        if (zzszVar == zzsz.zzj) {
            zzpvVar.zzu(i10, 3);
            ((zzrq) obj).zzB(zzpvVar);
            zzpvVar.zzu(i10, 4);
            return;
        }
        zzpvVar.zzu(i10, zzszVar.zza());
        zzta zztaVar = zzta.INT;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.zzy(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.zzo(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.zzJ(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.zzt((String) obj);
                } else {
                    zzpvVar.zzi((zzpm) obj);
                }
                break;
            case 9:
                ((zzrq) obj).zzB(zzpvVar);
                break;
            case 10:
                zzpvVar.zzp((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.zzL(bArr, 0, bArr.length);
                } else {
                    zzpvVar.zzi((zzpm) obj);
                }
                break;
            case 12:
                zzpvVar.zzw(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.zzo(((Integer) obj).intValue());
                } else {
                    zzpvVar.zzo(((zzqo) obj).zza());
                }
                break;
            case 14:
                zzpvVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.zzm(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzpvVar.zzw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzpvVar.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzqe zzqeVar = (zzqe) entry.getKey();
        if (zzqeVar.zzc() != zzta.MESSAGE) {
            return true;
        }
        if (!zzqeVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzl(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzrr) {
            return ((zzrr) obj).zzo();
        }
        if (obj instanceof zzqz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzC;
        int iZzC2;
        zzqe zzqeVar = (zzqe) entry.getKey();
        Object value = entry.getValue();
        if (zzqeVar.zzc() != zzta.MESSAGE || zzqeVar.zze() || zzqeVar.zzd()) {
            return zzc(zzqeVar, value);
        }
        if (value instanceof zzqz) {
            int iZza = ((zzqe) entry.getKey()).zza();
            int iZzC3 = zzpv.zzC(8);
            i10 = iZzC3 + iZzC3;
            iZzC = zzpv.zzC(16) + zzpv.zzC(iZza);
            int iZzC4 = zzpv.zzC(24);
            int iZza2 = ((zzqz) value).zza();
            iZzC2 = iZzC4 + zzpv.zzC(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzqe) entry.getKey()).zza();
            int iZzC5 = zzpv.zzC(8);
            i10 = iZzC5 + iZzC5;
            iZzC = zzpv.zzC(16) + zzpv.zzC(iZza3);
            iZzC2 = zzpv.zzC(24) + zzpv.zzA((zzrq) value);
        }
        return i10 + iZzC + iZzC2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.consent_sdk.zzqe r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.consent_sdk.zzsz r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.consent_sdk.zzqs.zzb
            r5.getClass()
            com.google.android.gms.internal.consent_sdk.zzsz r1 = com.google.android.gms.internal.consent_sdk.zzsz.zza
            com.google.android.gms.internal.consent_sdk.zzta r1 = com.google.android.gms.internal.consent_sdk.zzta.INT
            com.google.android.gms.internal.consent_sdk.zzta r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.consent_sdk.zzrq
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.consent_sdk.zzqz
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.consent_sdk.zzqo
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.consent_sdk.zzpm
            if (r0 != 0) goto L33
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.consent_sdk.zzsz r4 = r4.zzb()
            com.google.android.gms.internal.consent_sdk.zzta r4 = r4.zzb()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzqf.zzn(com.google.android.gms.internal.consent_sdk.zzqe, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzqf zzqfVar = new zzqf();
        zzsi zzsiVar = this.zza;
        int iZzc = zzsiVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = zzsiVar.zzg(i10);
            zzqfVar.zzh((zzqe) ((zzse) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzsiVar.zzd()) {
            zzqfVar.zzh((zzqe) entry.getKey(), entry.getValue());
        }
        zzqfVar.zzc = this.zzc;
        return zzqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqf) {
            return this.zza.equals(((zzqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzsi zzsiVar = this.zza;
        int iZzc = zzsiVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzsiVar.zzg(i10));
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public final Iterator zzf() {
        zzsi zzsiVar = this.zza;
        return zzsiVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzqx(zzsiVar.entrySet().iterator()) : zzsiVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzsi zzsiVar = this.zza;
        int iZzc = zzsiVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzsiVar.zzg(i10).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).zzx();
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzqm) {
                ((zzqm) value2).zzx();
            }
        }
        zzsiVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzqe zzqeVar, Object obj) {
        if (!zzqeVar.zze()) {
            zzn(zzqeVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzqeVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzqz) {
            this.zzc = true;
        }
        this.zza.put(zzqeVar, obj);
    }

    public final boolean zzj() {
        zzsi zzsiVar = this.zza;
        int iZzc = zzsiVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzsiVar.zzg(i10))) {
                return false;
            }
        }
        Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzqf(boolean z10) {
        zzg();
        zzg();
    }
}
