package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import com.ironsource.D5;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f78837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f78838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f78839c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f78837a = networkTask;
        this.f78838b = interruptionSafeThread;
        this.f78839c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOnRequestComplete;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f78837a.getExponentialBackoffPolicy();
        boolean zCanBeExecuted = this.f78837a.getConnectionExecutionPolicy().canBeExecuted();
        boolean zCanBeExecuted2 = this.f78837a.getExponentialBackoffPolicy().canBeExecuted(this.f78837a.getRetryPolicyConfig());
        if (!this.f78838b.isRunning() || !zCanBeExecuted || !zCanBeExecuted2) {
            this.f78837a.onShouldNotExecute();
            return;
        }
        boolean zOnCreateNetworkTask = this.f78837a.onCreateNetworkTask();
        Boolean boolValueOf = null;
        while (this.f78838b.isRunning() && zOnCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f78837a.getRetryPolicyConfig())) {
            f fVar = this.f78839c;
            NetworkTask networkTask = this.f78837a;
            fVar.getClass();
            boolean z10 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(StringsKt.v1(url).toString())) {
                    StringBuilder sb2 = new StringBuilder("Task ");
                    sb2.append(networkTask.description());
                    sb2.append(" url is `");
                    sb2.append(url);
                    sb2.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb2.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb2.toString()));
                } else {
                    Request.Builder builderAddHeader = new Request.Builder(url).addHeader("Accept", D5.L).addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        builderAddHeader.addHeader((String) entry.getKey(), CollectionsKt.joinToString$default((Iterable) entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            builderAddHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                builderAddHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                builderAddHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i10 = b.f78833a;
                    Response responseExecute = builder.withConnectTimeout(i10).withReadTimeout(i10).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(builderAddHeader.build()).execute();
                    int code = responseExecute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(responseExecute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(responseExecute.getResponseData());
                    }
                    if (responseExecute.isCompleted()) {
                        zOnRequestComplete = networkTask.onRequestComplete();
                        boolValueOf = Boolean.valueOf(zOnRequestComplete);
                        if (zOnRequestComplete && this.f78837a.shouldTryNextHost()) {
                            z10 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
                        zOnCreateNetworkTask = z10;
                    } else {
                        networkTask.onRequestError(responseExecute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            zOnRequestComplete = false;
            boolValueOf = Boolean.valueOf(zOnRequestComplete);
            if (zOnRequestComplete) {
            }
            exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
            zOnCreateNetworkTask = z10;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(Intrinsics.areEqual(boolValueOf, Boolean.TRUE));
    }
}
