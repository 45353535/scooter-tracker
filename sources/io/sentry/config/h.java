package io.sentry.config;

import io.sentry.a9;
import java.util.ArrayList;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static g a() {
        Properties propertiesA;
        Properties propertiesA2;
        a9 a9Var = new a9();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesA2 = new e(property, a9Var).a()) != null) {
            arrayList.add(new i(propertiesA2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesA = new e(str, a9Var).a()) != null) {
            arrayList.add(new i(propertiesA));
        }
        Properties propertiesA3 = new b(a9Var).a();
        if (propertiesA3 != null) {
            arrayList.add(new i(propertiesA3));
        }
        Properties propertiesA4 = new e("sentry.properties", a9Var).a();
        if (propertiesA4 != null) {
            arrayList.add(new i(propertiesA4));
        }
        return new c(arrayList);
    }
}
