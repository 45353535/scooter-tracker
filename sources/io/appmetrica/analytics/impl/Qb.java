package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Qb {
    public static final ArrayList a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                Locale locale = locales.get(i10);
                if (locale != null) {
                    arrayList.add(Le.a(locale));
                }
            }
        }
        return arrayList;
    }
}
