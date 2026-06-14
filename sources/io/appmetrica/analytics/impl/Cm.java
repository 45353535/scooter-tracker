package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class Cm implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Em f75631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5153hm f75632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Nl f75633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f75634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigProvider f75635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f75636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f75637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Vl f75638h;

    public Cm(@NonNull Em em, @NonNull FullUrlFormer<C5101fm> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C5101fm> configProvider) {
        this(em, new Vl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f75631a.f75744a.f75789f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f75637g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f75634d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f75636f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5101fm) this.f75635e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C5468ua.H.A()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f75634d.setHeader(HttpHeaders.ACCEPT_ENCODING, "encrypted");
        return this.f75631a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        if (z10) {
            return;
        }
        this.f75633c = Nl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C5153hm c5153hmA = this.f75638h.handle(this.f75636f);
        this.f75632b = c5153hmA;
        return c5153hmA != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
        this.f75633c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f75633c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f75632b == null || this.f75636f.getResponseHeaders() == null) {
            return;
        }
        this.f75631a.a(this.f75632b, (C5101fm) this.f75635e.getConfig(), this.f75636f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f75633c == null) {
            this.f75633c = Nl.UNKNOWN;
        }
        this.f75631a.a(this.f75633c);
    }

    public Cm(Em em, Vl vl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f75631a = em;
        this.f75638h = vl;
        this.f75634d = requestDataHolder;
        this.f75636f = responseDataHolder;
        this.f75635e = configProvider;
        this.f75637g = fullUrlFormer;
        fullUrlFormer.setHosts(((C5101fm) configProvider.getConfig()).k());
    }
}
