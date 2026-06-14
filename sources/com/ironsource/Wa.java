package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Wa f41992a = new Wa();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f41993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f41994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f41995c;

        public a(boolean z10, long j10, long j11) {
            this.f41993a = z10;
            this.f41994b = j10;
            this.f41995c = j11;
        }

        public final boolean a() {
            return this.f41993a;
        }

        public final long b() {
            return this.f41994b;
        }

        public final long c() {
            return this.f41995c;
        }

        public final long d() {
            return this.f41994b;
        }

        public final long e() {
            return this.f41995c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41993a == aVar.f41993a && this.f41994b == aVar.f41994b && this.f41995c == aVar.f41995c;
        }

        public final boolean f() {
            return this.f41993a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z10 = this.f41993a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return (((r02 * 31) + androidx.collection.b.a(this.f41994b)) * 31) + androidx.collection.b.a(this.f41995c);
        }

        @NotNull
        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f41993a + ", refreshInterval=" + this.f41994b + ", visibilityCheckerInterval=" + this.f41995c + ")";
        }

        @NotNull
        public final a a(boolean z10, long j10, long j11) {
            return new a(z10, j10, j11);
        }

        public static /* synthetic */ a a(a aVar, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f41993a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f41994b;
            }
            if ((i10 & 4) != 0) {
                j11 = aVar.f41995c;
            }
            return aVar.a(z10, j10, j11);
        }
    }

    private Wa() {
    }

    @NotNull
    public final Aa a(@NotNull C4441n0 adTools, @NotNull V2 bannerContainer, @NotNull a config, @NotNull I2 bannerAdProperties, @NotNull Ba strategyListener, @NotNull M2 bannerAdUnitFactory, @NotNull InterfaceC4496q4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (config.f()) {
            return new Ea(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, 128, null);
        }
        Qa qa2 = new Qa(adTools, bannerContainer, bannerAdUnitFactory);
        qa2.a(strategyListener);
        return qa2;
    }
}
