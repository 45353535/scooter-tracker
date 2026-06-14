package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5015cd implements ModuleEventServiceHandlerReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5392r9 f76964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W5 f76965c;

    public C5015cd(boolean z10, @NotNull C5392r9 c5392r9, @NotNull W5 w52) {
        this.f76963a = z10;
        this.f76964b = c5392r9;
        this.f76965c = w52;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f76963a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        W5 w5D = W5.d(this.f76965c);
        w5D.f76617d = counterReportApi.getType();
        w5D.f76618e = counterReportApi.getCustomType();
        w5D.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            w5D.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            w5D.setValueBytes(valueBytes);
        }
        w5D.f76620g = counterReportApi.getBytesTruncated();
        C5392r9 c5392r9 = this.f76964b;
        c5392r9.a(w5D, Wk.a(c5392r9.f78129c.b(w5D), w5D.f76622i));
    }
}
