package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f45397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f45398b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f45397a == null) {
            f45397a = new IronSourceQaProperties();
        }
        return f45397a;
    }

    public static boolean isInitialized() {
        return f45397a != null;
    }

    public Map<String, String> getParameters() {
        return f45398b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f45398b.put(str, str2);
    }
}
