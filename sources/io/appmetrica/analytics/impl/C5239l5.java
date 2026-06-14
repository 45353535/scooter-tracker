package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5239l5 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5239l5 f77643a = new C5239l5();

    public C5239l5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
