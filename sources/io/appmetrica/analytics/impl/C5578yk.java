package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5578yk {
    public static W5 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        W5 w52 = new W5("", "", 0);
        w52.f76617d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            w52.f76614a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            w52.f76615b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            w52.setValueBytes(valueBytes);
        }
        return w52;
    }
}
