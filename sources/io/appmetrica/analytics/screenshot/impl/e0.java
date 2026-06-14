package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f79007a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        iArr[ActivityEvent.RESUMED.ordinal()] = 1;
        iArr[ActivityEvent.PAUSED.ordinal()] = 2;
        f79007a = iArr;
    }
}
