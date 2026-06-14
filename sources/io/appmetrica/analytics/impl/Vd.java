package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModuleDummy;

/* JADX INFO: loaded from: classes12.dex */
public final class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashServiceModule f76593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pd f76594b;

    public Vd() {
        NativeCrashServiceModule nativeCrashServiceModule = (NativeCrashServiceModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashServiceModuleImpl", NativeCrashServiceModule.class);
        this.f76593a = nativeCrashServiceModule == null ? new NativeCrashServiceModuleDummy() : nativeCrashServiceModule;
        this.f76594b = new Pd(new Ud(this));
    }
}
