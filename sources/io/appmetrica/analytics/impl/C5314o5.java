package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5314o5 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5314o5 f77881a = new C5314o5();

    public C5314o5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
