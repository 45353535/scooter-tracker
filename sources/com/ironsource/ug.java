package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ug {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f45580c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f45581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sc f45582b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ug a(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData, @NotNull Sc outcomeReporter, @NotNull pg waterfallInstances, @NotNull F adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C4353hf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new L4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public ug(@NotNull C4441n0 adTools, @NotNull Sc outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f45581a = adTools;
        this.f45582b = outcomeReporter;
    }

    private final void b(AbstractC4643z abstractC4643z, List<? extends AbstractC4643z> list) {
        for (AbstractC4643z abstractC4643z2 : list) {
            if (abstractC4643z2 == abstractC4643z) {
                abstractC4643z.a(true);
                return;
            }
            abstractC4643z2.a(false);
            IronLog.INTERNAL.verbose(C4441n0.a(this.f45581a, abstractC4643z2.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(@NotNull AbstractC4643z abstractC4643z);

    public final void a(@NotNull AbstractC4643z instanceToShow, @NotNull List<? extends AbstractC4643z> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(@NotNull AbstractC4643z abstractC4643z);

    public abstract void c(@NotNull AbstractC4643z abstractC4643z);

    public final void a(@NotNull AbstractC4643z instance, @Nullable String str, @NotNull C4432ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f45582b.a(instance, str, publisherDataHolder);
    }
}
