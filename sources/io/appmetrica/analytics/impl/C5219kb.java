package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5219kb {
    public static final H9 a(C5219kb c5219kb, Q9 q92, JSONObject jSONObject) {
        int i10;
        c5219kb.getClass();
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
        h92.f75854b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return h92;
    }
}
