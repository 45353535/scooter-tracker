package com.appodeal.ads.adapters.admobmediation.customevent;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        CharSequence charSequence = (CharSequence) obj;
        Number number = StringsKt.B0(charSequence, '.', 0, false, 6, null) > StringsKt.B0(charSequence, ',', 0, false, 6, null) ? NumberFormat.getInstance(Locale.TAIWAN).parse((String) obj) : NumberFormat.getInstance().parse((String) obj);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }
}
