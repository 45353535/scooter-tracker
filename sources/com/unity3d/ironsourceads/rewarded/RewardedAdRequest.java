package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C4571uc;
import com.ironsource.InterfaceC4521rd;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f67849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4521rd f67850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f67851e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f67853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f67854c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f67852a = instanceId;
            this.f67853b = adm;
        }

        @NotNull
        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f67852a);
            return new RewardedAdRequest(this.f67852a, this.f67853b, this.f67854c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f67853b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f67852a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f67854c = extraParams;
            return this;
        }
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f67851e;
    }

    @NotNull
    public final String getAdm() {
        return this.f67848b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f67849c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67847a;
    }

    @NotNull
    public final InterfaceC4521rd getProviderName$mediationsdk_release() {
        return this.f67850d;
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f67847a = str;
        this.f67848b = str2;
        this.f67849c = bundle;
        this.f67850d = new C4571uc(str);
        String strB = W9.b();
        Intrinsics.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f67851e = strB;
    }
}
