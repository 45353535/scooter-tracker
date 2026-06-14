package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class L1 implements InterfaceC4412l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F7 f41221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private M1 f41222b;

    public static final class a {
        @NotNull
        public final M1 a(@Nullable J1 j12, @NotNull F7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (j12 != null ? Boolean.valueOf(j12.k()) : null));
            boolean z10 = false;
            if (featureAvailabilityService.a()) {
                Td.i().a(new C4649z5(A5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((j12 != null ? j12.k() : false) && featureAvailabilityService.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new C4560u1() : new U7();
        }
    }

    public L1(@NotNull F7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f41221a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC4412l7
    public void a(@Nullable J1 j12) {
        if (this.f41222b == null) {
            this.f41222b = new a().a(j12, this.f41221a);
        }
    }

    @Override // com.ironsource.M1
    public void b(@NotNull InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        M1 m12 = this.f41222b;
        if (m12 != null) {
            m12.b(observer);
        }
    }

    @Override // com.ironsource.M1
    public void a(@NotNull InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        M1 m12 = this.f41222b;
        if (m12 != null) {
            m12.a(observer);
        }
    }
}
