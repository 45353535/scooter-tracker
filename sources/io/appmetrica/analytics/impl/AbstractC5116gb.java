package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC5116gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f77250a;

    static {
        int[] iArr = new int[InternalModuleEvent.Category.values().length];
        iArr[InternalModuleEvent.Category.SYSTEM.ordinal()] = 1;
        iArr[InternalModuleEvent.Category.GENERAL.ordinal()] = 2;
        f77250a = iArr;
    }
}
