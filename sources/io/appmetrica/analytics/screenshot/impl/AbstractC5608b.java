package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC5608b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f78999a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        iArr[ActivityEvent.STARTED.ordinal()] = 1;
        iArr[ActivityEvent.STOPPED.ordinal()] = 2;
        f78999a = iArr;
    }
}
