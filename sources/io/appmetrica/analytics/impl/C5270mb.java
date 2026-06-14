package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5270mb extends JSONObject {
    public C5270mb() {
    }

    public final Long a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String b(String str) {
        if (!has(str)) {
            return "";
        }
        try {
            return getString(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public C5270mb(String str) {
        super(str);
    }
}
