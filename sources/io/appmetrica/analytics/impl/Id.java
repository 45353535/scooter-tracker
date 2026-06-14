package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* JADX INFO: loaded from: classes12.dex */
public final class Id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gf f75938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f75939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0 f75940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0 f75941d;

    public Id(Gf gf2) {
        this.f75938a = gf2;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f75939b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f75940c = new G0();
    }
}
