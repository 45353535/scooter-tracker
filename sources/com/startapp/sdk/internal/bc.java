package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class bc {
    public static final String a(Locale locale, Collection collection, char c10) {
        boolean z10;
        StringBuilder sb2;
        if (locale != null) {
            sb2 = new StringBuilder();
            sb2.append(locale);
            z10 = true;
        } else {
            z10 = false;
            sb2 = null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                if (z10) {
                    sb2.append(c10);
                }
                sb2.append(locale2);
                z10 = true;
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }
}
