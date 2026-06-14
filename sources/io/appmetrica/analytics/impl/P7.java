package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f76246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76248c;

    public P7(String str, HashMap map, String str2) {
        this.f76247b = str;
        this.f76246a = map;
        this.f76248c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f76246a + ", mDeeplink='" + this.f76247b + "', mUnparsedReferrer='" + this.f76248c + "'}";
    }
}
