package com.appodeal.ads.services.appsflyer.purchasable.validator;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f14610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f14611c;

    public b(AtomicBoolean atomicBoolean, f fVar) {
        this.f14610b = atomicBoolean;
        this.f14611c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f14610b.set(false);
        this.f14611c.f14623c.setValue(Boolean.FALSE);
        return Unit.f93236a;
    }
}
