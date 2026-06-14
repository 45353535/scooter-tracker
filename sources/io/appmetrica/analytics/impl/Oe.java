package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T9 f76195a;

    public Oe(T9 t92) {
        this.f76195a = t92;
    }

    public final Sn a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.f76195a.f76495b.a();
        Boolean bool = (Boolean) this.f76195a.f76496c.a();
        if (stacktrace != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stacktrace, 10));
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new Hl(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new Sn(new In(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
