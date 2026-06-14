package com.yandex.div.evaluable.function;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toColorFloatComponentValue", "", "", "toColorIntComponentValue", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i10) throws IllegalArgumentException {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return ((double) i10) / ((double) 255.0f);
    }

    public static final int toColorIntComponentValue(double d10) throws IllegalArgumentException {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d10 * ((double) 255.0f)) + ((double) 0.5f));
    }
}
