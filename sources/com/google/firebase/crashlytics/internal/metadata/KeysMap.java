package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class KeysMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32172a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32174c;

    public KeysMap(int i10, int i11) {
        this.f32173b = i10;
        this.f32174c = i11;
    }

    private String a(String str) {
        if (str != null) {
            return sanitizeString(str, this.f32174c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    @NonNull
    public synchronized Map<String, String> getKeys() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f32172a));
    }

    public synchronized boolean setKey(String str, String str2) {
        String strA = a(str);
        if (this.f32172a.size() >= this.f32173b && !this.f32172a.containsKey(strA)) {
            Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f32173b);
            return false;
        }
        String strSanitizeString = sanitizeString(str2, this.f32174c);
        if (CommonUtils.nullSafeEquals((String) this.f32172a.get(strA), strSanitizeString)) {
            return false;
        }
        Map map = this.f32172a;
        if (str2 == null) {
            strSanitizeString = "";
        }
        map.put(strA, strSanitizeString);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strA = a(entry.getKey());
                if (this.f32172a.size() < this.f32173b || this.f32172a.containsKey(strA)) {
                    String value = entry.getValue();
                    this.f32172a.put(strA, value == null ? "" : sanitizeString(value, this.f32174c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Logger.getLogger().w("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f32173b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
