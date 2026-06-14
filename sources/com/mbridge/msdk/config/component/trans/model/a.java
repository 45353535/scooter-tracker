package com.mbridge.msdk.config.component.trans.model;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47294a;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("expression")) == null) {
            return;
        }
        a(String.valueOf(obj).replace("'", ""));
    }

    public String a() {
        return this.f47294a;
    }

    public void a(String str) {
        this.f47294a = str;
    }
}
