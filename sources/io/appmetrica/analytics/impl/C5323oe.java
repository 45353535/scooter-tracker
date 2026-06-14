package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5323oe {
    public static final H9 a(C5323oe c5323oe, Q9 q92, Object obj) {
        int i10;
        c5323oe.getClass();
        H9 h92 = new H9();
        switch (q92) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new lf.m();
        }
        h92.f75853a = i10;
        C5348pe.f77982b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        h92.f75854b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return h92;
    }
}
