package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerMap implements Quantizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f26142a;

    public Map<Integer, Integer> getColorToCount() {
        return this.f26142a;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(iIntValue));
        }
        this.f26142a = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
