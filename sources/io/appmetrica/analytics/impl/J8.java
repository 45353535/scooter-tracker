package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f75989a;

    static {
        int[] iArr = new int[ModuleEvent.Category.values().length];
        iArr[ModuleEvent.Category.GENERAL.ordinal()] = 1;
        iArr[ModuleEvent.Category.SYSTEM.ordinal()] = 2;
        f75989a = iArr;
    }
}
