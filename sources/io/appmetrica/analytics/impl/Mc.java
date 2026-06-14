package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Mc extends HashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76125a;

    public Mc() {
        this.f76125a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f76125a = str2.length() + str.length() + this.f76125a;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f76125a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f76125a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f76125a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f76125a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public Mc(String str) {
        super(AbstractC5295nb.d(str));
        this.f76125a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f76125a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f76125a;
        }
    }
}
