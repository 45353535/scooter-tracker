package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC5625t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f79043a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        iArr[ActivityEvent.RESUMED.ordinal()] = 1;
        iArr[ActivityEvent.PAUSED.ordinal()] = 2;
        f79043a = iArr;
    }
}
