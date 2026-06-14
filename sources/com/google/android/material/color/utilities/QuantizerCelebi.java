package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerCelebi {
    public static Map<Integer, Integer> quantize(int[] iArr, int i10) {
        Set<Integer> setKeySet = new QuantizerWu().quantize(iArr, i10).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr2[i11] = it.next().intValue();
            i11++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i10);
    }
}
