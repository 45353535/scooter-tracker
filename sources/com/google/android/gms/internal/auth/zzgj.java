package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzgj {
    private static final Class zza;
    private static final zzgy zzb;
    private static final zzgy zzc;
    private static final zzgy zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzj(false);
        zzc = zzj(true);
        zzd = new zzha();
    }

    public static zzgy zza() {
        return zzb;
    }

    public static zzgy zzb() {
        return zzc;
    }

    public static zzgy zzc() {
        return zzd;
    }

    static Object zzd(int i10, List list, zzex zzexVar, Object obj, zzgy zzgyVar) {
        if (zzexVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzexVar.zza()) {
                    obj = zze(i10, iIntValue, obj, zzgyVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zzexVar.zza()) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj = zze(i10, iIntValue2, obj, zzgyVar);
            }
        }
        if (i11 == size) {
            return obj;
        }
        list.subList(i11, size).clear();
        return obj;
    }

    static Object zze(int i10, int i11, Object obj, zzgy zzgyVar) {
        if (obj == null) {
            obj = zzgyVar.zzc();
        }
        zzgyVar.zzd(obj, i10, i11);
        return obj;
    }

    static void zzf(zzgy zzgyVar, Object obj, Object obj2) {
        zzgyVar.zzf(obj, zzgyVar.zzb(zzgyVar.zza(obj), zzgyVar.zza(obj2)));
    }

    public static void zzg(Class cls) {
        Class cls2;
        if (!zzeu.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzi(zzfr zzfrVar, Object obj, Object obj2, long j10) {
        zzhi.zzp(obj, j10, zzfr.zza(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10)));
    }

    private static zzgy zzj(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgy) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
