package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzfm {
    private static final zzfm zzd = new zzfm(true);
    final zzht zza = new zzho();
    boolean zzb;
    boolean zzc;

    private zzfm() {
    }

    static int zza(zzir zzirVar, int i10, Object obj) {
        int iZzy = zzfc.zzy(i10 << 3);
        if (zzirVar == zzir.zzj) {
            iZzy += iZzy;
        }
        return iZzy + zzb(zzirVar, obj);
    }

    static int zzb(zzir zzirVar, Object obj) {
        int iZzb;
        int iZzy;
        zzir zzirVar2 = zzir.zza;
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = zzfc.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = zzfc.zzb;
                return 4;
            case 2:
                return zzfc.zzz(((Long) obj).longValue());
            case 3:
                return zzfc.zzz(((Long) obj).longValue());
            case 4:
                return zzfc.zzz(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = zzfc.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = zzfc.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = zzfc.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzev)) {
                    int i15 = zzfc.zzb;
                    iZzb = zzin.zzb((String) obj);
                    iZzy = zzfc.zzy(iZzb);
                } else {
                    int i16 = zzfc.zzb;
                    iZzb = ((zzev) obj).zze();
                    iZzy = zzfc.zzy(iZzb);
                }
                break;
            case 9:
                return ((zzhb) obj).zzn();
            case 10:
                if (!(obj instanceof zzgh)) {
                    return zzfc.zzx((zzhb) obj);
                }
                iZzb = ((zzgh) obj).zza();
                iZzy = zzfc.zzy(iZzb);
                break;
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    int i17 = zzfc.zzb;
                    iZzb = ((byte[]) obj).length;
                    iZzy = zzfc.zzy(iZzb);
                } else {
                    int i18 = zzfc.zzb;
                    iZzb = ((zzev) obj).zze();
                    iZzy = zzfc.zzy(iZzb);
                }
                break;
            case 12:
                return zzfc.zzy(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzfw ? zzfc.zzz(((zzfw) obj).zza()) : zzfc.zzz(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = zzfc.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = zzfc.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzfc.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzfc.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzy + iZzb;
    }

    public static int zzc(zzfl zzflVar, Object obj) {
        zzir zzirVarZzb = zzflVar.zzb();
        int iZza = zzflVar.zza();
        if (!zzflVar.zze()) {
            return zza(zzirVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzflVar.zzd()) {
            int iZza2 = 0;
            while (i10 < size) {
                iZza2 += zza(zzirVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i10 < size) {
            iZzb += zzb(zzirVarZzb, list.get(i10));
            i10++;
        }
        return zzfc.zzy(iZza << 3) + iZzb + zzfc.zzy(iZzb);
    }

    public static zzfm zze() {
        return zzd;
    }

    static void zzi(zzfc zzfcVar, zzir zzirVar, int i10, Object obj) throws IOException {
        if (zzirVar == zzir.zzj) {
            zzfcVar.zzs(i10, 3);
            ((zzhb) obj).zzD(zzfcVar);
            zzfcVar.zzs(i10, 4);
            return;
        }
        zzfcVar.zzs(i10, zzirVar.zza());
        zzis zzisVar = zzis.INT;
        switch (zzirVar.ordinal()) {
            case 0:
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case 3:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case 4:
                zzfcVar.zzm(((Integer) obj).intValue());
                break;
            case 5:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case 6:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case 7:
                zzfcVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzev)) {
                    zzfcVar.zzr((String) obj);
                } else {
                    zzfcVar.zzg((zzev) obj);
                }
                break;
            case 9:
                ((zzhb) obj).zzD(zzfcVar);
                break;
            case 10:
                zzfcVar.zzn((zzhb) obj);
                break;
            case 11:
                if (!(obj instanceof zzev)) {
                    byte[] bArr = (byte[]) obj;
                    zzfcVar.zze(bArr, 0, bArr.length);
                } else {
                    zzfcVar.zzg((zzev) obj);
                }
                break;
            case 12:
                zzfcVar.zzu(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzfw)) {
                    zzfcVar.zzm(((Integer) obj).intValue());
                } else {
                    zzfcVar.zzm(((zzfw) obj).zza());
                }
                break;
            case 14:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzfcVar.zzu((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzfcVar.zzw((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzfl zzflVar = (zzfl) entry.getKey();
        if (zzflVar.zzc() != zzis.MESSAGE) {
            return true;
        }
        if (!zzflVar.zze()) {
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
        if (obj instanceof zzhc) {
            return ((zzhc) obj).zzo();
        }
        if (obj instanceof zzgh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzy;
        int iZzy2;
        zzfl zzflVar = (zzfl) entry.getKey();
        Object value = entry.getValue();
        if (zzflVar.zzc() != zzis.MESSAGE || zzflVar.zze() || zzflVar.zzd()) {
            return zzc(zzflVar, value);
        }
        if (value instanceof zzgh) {
            int iZza = ((zzfl) entry.getKey()).zza();
            int iZzy3 = zzfc.zzy(8);
            i10 = iZzy3 + iZzy3;
            iZzy = zzfc.zzy(16) + zzfc.zzy(iZza);
            int iZzy4 = zzfc.zzy(24);
            int iZza2 = ((zzgh) value).zza();
            iZzy2 = iZzy4 + zzfc.zzy(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzfl) entry.getKey()).zza();
            int iZzy5 = zzfc.zzy(8);
            i10 = iZzy5 + iZzy5;
            iZzy = zzfc.zzy(16) + zzfc.zzy(iZza3);
            iZzy2 = zzfc.zzy(24) + zzfc.zzx((zzhb) value);
        }
        return i10 + iZzy + iZzy2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.play_billing.zzfl r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.zzir r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzga.zzb
            r5.getClass()
            com.google.android.gms.internal.play_billing.zzir r1 = com.google.android.gms.internal.play_billing.zzir.zza
            com.google.android.gms.internal.play_billing.zzis r1 = com.google.android.gms.internal.play_billing.zzis.INT
            com.google.android.gms.internal.play_billing.zzis r0 = r0.zzb()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzhb
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzgh
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzfw
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.zzev
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
            com.google.android.gms.internal.play_billing.zzir r4 = r4.zzb()
            com.google.android.gms.internal.play_billing.zzis r4 = r4.zzb()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzfm.zzn(com.google.android.gms.internal.play_billing.zzfl, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfm zzfmVar = new zzfm();
        zzht zzhtVar = this.zza;
        int iZzc = zzhtVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = zzhtVar.zzg(i10);
            zzfmVar.zzh((zzfl) ((zzhp) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzhtVar.zzd()) {
            zzfmVar.zzh((zzfl) entry.getKey(), entry.getValue());
        }
        zzfmVar.zzc = this.zzc;
        return zzfmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfm) {
            return this.zza.equals(((zzfm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzht zzhtVar = this.zza;
        int iZzc = zzhtVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzhtVar.zzg(i10));
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public final Iterator zzf() {
        zzht zzhtVar = this.zza;
        return zzhtVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzgf(zzhtVar.entrySet().iterator()) : zzhtVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzht zzhtVar = this.zza;
        int iZzc = zzhtVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzhtVar.zzg(i10).getValue();
            if (value instanceof zzfu) {
                ((zzfu) value).zzz();
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzfu) {
                ((zzfu) value2).zzz();
            }
        }
        zzhtVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzfl zzflVar, Object obj) {
        if (!zzflVar.zze()) {
            zzn(zzflVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzflVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgh) {
            this.zzc = true;
        }
        this.zza.put(zzflVar, obj);
    }

    public final boolean zzj() {
        zzht zzhtVar = this.zza;
        int iZzc = zzhtVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzhtVar.zzg(i10))) {
                return false;
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzfm(boolean z10) {
        zzg();
        zzg();
    }
}
