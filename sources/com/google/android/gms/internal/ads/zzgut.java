package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgut {
    public static boolean zza(Iterable iterable, zzgrd zzgrdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgrdVar.getClass();
            return zzc((List) iterable, zzgrdVar);
        }
        Iterator it = iterable.iterator();
        zzgrdVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzgrdVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgwt it = ((zzgwk) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgrd zzgrdVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzgrdVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgrdVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgrdVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void zzd(List list, zzgrd zzgrdVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzgrdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }
}
