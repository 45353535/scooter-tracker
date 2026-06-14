package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5099fk implements ServiceComponentModuleReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f77168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5578yk f77169b;

    public C5099fk(@NotNull C5058e5 c5058e5, @NotNull C5578yk c5578yk) {
        this.f77168a = c5058e5;
        this.f77169b = c5578yk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f77169b.getClass();
        this.f77168a.a(C5578yk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C5099fk(C5058e5 c5058e5, C5578yk c5578yk, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5058e5, (i10 & 2) != 0 ? new C5578yk() : c5578yk);
    }
}
