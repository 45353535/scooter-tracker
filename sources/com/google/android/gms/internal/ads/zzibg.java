package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzibg {
    private static final zzibg zzd = new zzibg(true);
    final zzieb zza = new zzidx();
    boolean zzb;
    boolean zzc;

    private zzibg() {
    }

    public static zzibg zza() {
        return zzd;
    }

    static void zzf(zziaw zziawVar, zzies zziesVar, int i10, Object obj) throws IOException {
        if (zziesVar == zzies.zzj) {
            zziawVar.zzH(i10, 3);
            ((zzidc) obj).zzcX(zziawVar);
            zziawVar.zzH(i10, 4);
            return;
        }
        zziawVar.zzH(i10, zziesVar.zzb());
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziawVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zziawVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zziawVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zziawVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzian)) {
                    zziawVar.zzx((String) obj);
                } else {
                    zziawVar.zzl((zzian) obj);
                }
                break;
            case 9:
                ((zzidc) obj).zzcX(zziawVar);
                break;
            case 10:
                zziawVar.zzp((zzidc) obj);
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    byte[] bArr = (byte[]) obj;
                    zziawVar.zzm(bArr, 0, bArr.length);
                } else {
                    zziawVar.zzl((zzian) obj);
                }
                break;
            case 12:
                zziawVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzibv)) {
                    zziawVar.zzr(((Integer) obj).intValue());
                } else {
                    zziawVar.zzr(((zzibv) obj).zza());
                }
                break;
            case 14:
                zziawVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zziawVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zziawVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zziawVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzies zziesVar, int i10, Object obj) {
        int iZzA = zziaw.zzA(i10 << 3);
        if (zziesVar == zzies.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zziesVar, obj);
    }

    static int zzi(zzies zziesVar, Object obj) {
        int iZzc;
        int iZzA;
        zzies zziesVar2 = zzies.zza;
        zziet zzietVar = zziet.INT;
        switch (zziesVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = zziaw.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = zziaw.zzf;
                return 4;
            case 2:
                return zziaw.zzB(((Long) obj).longValue());
            case 3:
                return zziaw.zzB(((Long) obj).longValue());
            case 4:
                return zziaw.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = zziaw.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = zziaw.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = zziaw.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzian)) {
                    int i15 = zziaw.zzf;
                    iZzc = zzier.zzc((String) obj);
                    iZzA = zziaw.zzA(iZzc);
                } else {
                    int i16 = zziaw.zzf;
                    iZzc = ((zzian) obj).zzc();
                    iZzA = zziaw.zzA(iZzc);
                }
                break;
            case 9:
                return ((zzidc) obj).zzbr();
            case 10:
                if (!(obj instanceof zzicl)) {
                    return zziaw.zzC((zzidc) obj);
                }
                iZzc = ((zzicl) obj).zzb();
                iZzA = zziaw.zzA(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzian)) {
                    int i17 = zziaw.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zziaw.zzA(iZzc);
                } else {
                    int i18 = zziaw.zzf;
                    iZzc = ((zzian) obj).zzc();
                    iZzA = zziaw.zzA(iZzc);
                }
                break;
            case 12:
                return zziaw.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzibv ? zziaw.zzB(((zzibv) obj).zza()) : zziaw.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = zziaw.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = zziaw.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zziaw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zziaw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    public static int zzj(zzibf zzibfVar, Object obj) {
        zzies zziesVarZzb = zzibfVar.zzb();
        int iZza = zzibfVar.zza();
        if (!zzibfVar.zzd()) {
            return zzh(zziesVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzibfVar.zze()) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzh(zziesVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i10 < size) {
            iZzi += zzi(zziesVarZzb, list.get(i10));
            i10++;
        }
        return zziaw.zzA(iZza << 3) + iZzi + zziaw.zzA(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzibf zzibfVar = (zzibf) entry.getKey();
        if (zzibfVar.zzc() != zziet.MESSAGE) {
            return true;
        }
        if (!zzibfVar.zzd()) {
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
        if (obj instanceof zzidd) {
            return ((zzidd) obj).zzbi();
        }
        if (obj instanceof zzicl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzA;
        int iZzA2;
        zzibf zzibfVar = (zzibf) entry.getKey();
        Object value = entry.getValue();
        if (zzibfVar.zzc() != zziet.MESSAGE || zzibfVar.zzd() || zzibfVar.zze()) {
            return zzj(zzibfVar, value);
        }
        if (value instanceof zzicl) {
            int iZza = ((zzibf) entry.getKey()).zza();
            int iZzA3 = zziaw.zzA(8);
            i10 = iZzA3 + iZzA3;
            iZzA = zziaw.zzA(16) + zziaw.zzA(iZza);
            int iZzA4 = zziaw.zzA(24);
            int iZzb = ((zzicl) value).zzb();
            iZzA2 = iZzA4 + zziaw.zzA(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzibf) entry.getKey()).zza();
            int iZzA5 = zziaw.zzA(8);
            i10 = iZzA5 + iZzA5;
            iZzA = zziaw.zzA(16) + zziaw.zzA(iZza2);
            iZzA2 = zziaw.zzA(24) + zziaw.zzC((zzidc) value);
        }
        return i10 + iZzA + iZzA2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzibf r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzies r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzice.zzb
            r5.getClass()
            com.google.android.gms.internal.ads.zzies r1 = com.google.android.gms.internal.ads.zzies.zza
            com.google.android.gms.internal.ads.zziet r1 = com.google.android.gms.internal.ads.zziet.INT
            com.google.android.gms.internal.ads.zziet r0 = r0.zza()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzidc
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzicl
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzibv
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzian
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
            com.google.android.gms.internal.ads.zzies r4 = r4.zzb()
            com.google.android.gms.internal.ads.zziet r4 = r4.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzibg.zzn(com.google.android.gms.internal.ads.zzibf, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzibg zzibgVar = new zzibg();
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zziebVar.zzd(i10);
            zzibgVar.zzd((zzibf) ((zzidy) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zziebVar.zze()) {
            zzibgVar.zzd((zzibf) entry.getKey(), entry.getValue());
        }
        zzibgVar.zzc = this.zzc;
        return zzibgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzibg) {
            return this.zza.equals(((zzibg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zziebVar.zzd(i10).getValue();
            if (value instanceof zzibr) {
                ((zzibr) value).zzbm();
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzibr) {
                ((zzibr) value2).zzbm();
            }
        }
        zziebVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzieb zziebVar = this.zza;
        return zziebVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzick(zziebVar.entrySet().iterator()) : zziebVar.entrySet().iterator();
    }

    public final void zzd(zzibf zzibfVar, Object obj) {
        if (!zzibfVar.zzd()) {
            zzn(zzibfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzibfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzicl) {
            this.zzc = true;
        }
        this.zza.put(zzibfVar, obj);
    }

    public final boolean zze() {
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zziebVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzieb zziebVar = this.zza;
        int iZzc = zziebVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zziebVar.zzd(i10));
        }
        Iterator it = zziebVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzibg(boolean z10) {
        zzb();
        zzb();
    }
}
