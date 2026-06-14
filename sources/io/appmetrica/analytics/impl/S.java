package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class S extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f76380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10) {
        super(0);
        this.f76380a = u10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u10 = this.f76380a;
        N n10 = u10.f76536g;
        Context context = u10.f76530a;
        n10.getClass();
        return N.a(new L(n10, context));
    }
}
