package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class Yb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Yb f76705a = new Yb();

    public Yb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return Unit.f93236a;
    }
}
