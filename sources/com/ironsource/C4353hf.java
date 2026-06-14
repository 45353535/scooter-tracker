package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4353hf extends ug {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Sc f43279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pg f43280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final F f43281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4353hf(@NotNull V0 adTools, @NotNull Sc outcomeReporter, @NotNull pg waterfallInstances, @NotNull F adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f43279d = outcomeReporter;
        this.f43280e = waterfallInstances;
        this.f43281f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.ug
    public void a(@NotNull AbstractC4643z instance) {
        AbstractC4643z abstractC4643zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f43281f.a(instance)) {
            this.f43279d.a(this.f43280e.b(), instance);
        } else {
            if (!this.f43281f.a() || (abstractC4643zA = this.f43281f.c().a()) == null) {
                return;
            }
            this.f43279d.a(this.f43280e.b(), abstractC4643zA);
        }
    }

    @Override // com.ironsource.ug
    public void b(@NotNull AbstractC4643z instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.ug
    public void c(@NotNull AbstractC4643z instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.f43279d.a(this.f43280e.b(), instanceToShow);
    }

    @Override // com.ironsource.ug
    public void a() {
        AbstractC4643z abstractC4643zA = this.f43281f.c().a();
        if (abstractC4643zA != null) {
            this.f43279d.a(this.f43280e.b(), abstractC4643zA);
        }
    }
}
