package com.unity3d.ironsourceads.interstitial;

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
public final class InterstitialAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Bundle f67836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4521rd f67837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f67838e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f67840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private Bundle f67841c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f67839a = instanceId;
            this.f67840b = adm;
        }

        @NotNull
        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f67839a);
            return new InterstitialAdRequest(this.f67839a, this.f67840b, this.f67841c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f67840b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f67839a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f67841c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f67838e;
    }

    @NotNull
    public final String getAdm() {
        return this.f67835b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f67836c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67834a;
    }

    @NotNull
    public final InterfaceC4521rd getProviderName$mediationsdk_release() {
        return this.f67837d;
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f67834a = str;
        this.f67835b = str2;
        this.f67836c = bundle;
        this.f67837d = new C4571uc(str);
        String strB = W9.b();
        Intrinsics.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f67838e = strB;
    }
}
