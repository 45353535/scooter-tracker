package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzidr {
    static final /* synthetic */ zzian zza(zzian zzianVar, zzian zzianVar2, ArrayDeque arrayDeque) {
        zzb(zzianVar, arrayDeque);
        zzb(zzianVar2, arrayDeque);
        zzian zzidtVar = (zzian) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzidtVar = new zzidt((zzian) arrayDeque.pop(), zzidtVar, null);
        }
        return zzidtVar;
    }

    private static final void zzb(zzian zzianVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzianVar.zzq()) {
            if (!(zzianVar instanceof zzidt)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzianVar.getClass())));
            }
            zzidt zzidtVar = (zzidt) zzianVar;
            zzb(zzidtVar.zzo(), arrayDeque);
            zzb(zzidtVar.zzE(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzianVar.zzc(), arrayDeque);
        int iZzn = zzidt.zzn(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= iZzn) {
            arrayDeque.push(zzianVar);
            return;
        }
        int iZzn2 = zzidt.zzn(iZzc);
        zzian zzidtVar2 = (zzian) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= iZzn2) {
                break;
            } else {
                zzidtVar2 = new zzidt((zzian) arrayDeque.pop(), zzidtVar2, bArr);
            }
        }
        zzidt zzidtVar3 = new zzidt(zzidtVar2, zzianVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzian) arrayDeque.peek()).zzc() >= zzidt.zzn(zzc(zzidtVar3.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzidtVar3 = new zzidt((zzian) arrayDeque.pop(), zzidtVar3, bArr);
            }
        }
        arrayDeque.push(zzidtVar3);
    }

    private static final int zzc(int i10, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzidt.zzb, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
