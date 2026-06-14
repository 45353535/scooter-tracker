package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4571uc;
import com.ironsource.InterfaceC4521rd;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class BannerAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f67802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AdSize f67803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Bundle f67804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4521rd f67805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f67806g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f67807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f67808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f67809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final AdSize f67810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private Bundle f67811e;

        public Builder(@NotNull Context context, @NotNull String instanceId, @NotNull String adm, @NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f67807a = context;
            this.f67808b = instanceId;
            this.f67809c = adm;
            this.f67810d = size;
        }

        @NotNull
        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f67808b + ", size: " + this.f67810d.getSizeDescription());
            return new BannerAdRequest(this.f67807a, this.f67808b, this.f67809c, this.f67810d, this.f67811e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f67809c;
        }

        @NotNull
        public final Context getContext() {
            return this.f67807a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f67808b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.f67810d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f67811e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f67806g;
    }

    @NotNull
    public final String getAdm() {
        return this.f67802c;
    }

    @NotNull
    public final Context getContext() {
        return this.f67800a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f67804e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f67801b;
    }

    @NotNull
    public final InterfaceC4521rd getProviderName$mediationsdk_release() {
        return this.f67805f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.f67803d;
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f67800a = context;
        this.f67801b = str;
        this.f67802c = str2;
        this.f67803d = adSize;
        this.f67804e = bundle;
        this.f67805f = new C4571uc(str);
        String strB = W9.b();
        Intrinsics.checkNotNullExpressionValue(strB, "generateMultipleUniqueInstanceId()");
        this.f67806g = strB;
    }
}
