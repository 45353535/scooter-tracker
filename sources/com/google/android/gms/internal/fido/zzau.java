package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzau extends zzaq implements Set {
    private transient zzat zza;

    zzau() {
    }

    static int zzf(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzau zzi(Object obj, Object obj2) {
        return zzk(2, obj, obj2);
    }

    private static zzau zzk(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzax.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzay(obj);
        }
        int iZzf = zzf(i10);
        Object[] objArr2 = new Object[iZzf];
        int i11 = iZzf - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i14);
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzap.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzay(obj4);
        }
        if (zzf(i13) < iZzf / 2) {
            return zzk(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzax(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzau) && zzj() && ((zzau) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzaz iterator();

    public final zzat zzg() {
        zzat zzatVar = this.zza;
        if (zzatVar != null) {
            return zzatVar;
        }
        zzat zzatVarZzh = zzh();
        this.zza = zzatVarZzh;
        return zzatVarZzh;
    }

    zzat zzh() {
        Object[] array = toArray();
        int i10 = zzat.zzd;
        return zzat.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }
}
