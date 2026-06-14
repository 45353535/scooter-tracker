package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5629x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f79051a;

    public C5629x(@NotNull ClientContext clientContext) {
        this.f79051a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.f79051a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(MapsKt.mapOf(TuplesKt.to("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
