package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class L4 extends ug {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sc f41233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pg f41234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L4(@NotNull V0 adTools, @NotNull Sc outcomeReporter, @NotNull pg waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f41233d = outcomeReporter;
        this.f41234e = waterfallInstances;
    }

    @Override // com.ironsource.ug
    public void a() {
    }

    @Override // com.ironsource.ug
    public void b(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f41233d.a(this.f41234e.b(), instance);
    }

    @Override // com.ironsource.ug
    public void c(@NotNull AbstractC4643z instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }

    @Override // com.ironsource.ug
    public void a(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }
}
