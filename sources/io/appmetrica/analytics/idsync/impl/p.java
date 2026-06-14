package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f75433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f75434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f75435c = new SystemTimeProvider();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f75436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f75437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f75438f;

    public p(@NotNull ServiceContext serviceContext, @NotNull B b10) {
        this.f75433a = serviceContext;
        this.f75434b = b10;
        this.f75436d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f75437e = new s(serviceContext);
        this.f75438f = new i(serviceContext);
    }

    public static final void a(y yVar, p pVar) {
        if (yVar.f75446b) {
            B b10 = pVar.f75434b;
            String str = yVar.f75445a;
            b10.f75383d.put(str, new z(str, pVar.f75435c.currentTimeMillis(), yVar.f75448d ? 2 : 4));
            b10.f75380a.putString(b10.f75382c, b10.f75381b.fromModel(CollectionsKt.toList(b10.f75383d.values())));
            i iVar = pVar.f75438f;
            ModuleSelfReporter selfReporter = iVar.f75410a.getSelfReporter();
            iVar.f75411b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        t c4947a;
        s sVar = pVar.f75437e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if (r.f75441a[preconditions.getNetworkType().ordinal()] == 1) {
            c4947a = new C4948b(sVar.f75442a);
        } else {
            c4947a = new C4947a();
        }
        if (c4947a.a()) {
            q qVar = pVar.f75436d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), CollectionsKt.joinToString$default(entry.getValue(), ", ", null, null, 0, null, null, 62, null));
            }
            Response responseExecute = new NetworkClient.Builder().withSslSocketFactory(qVar.f75439a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f75440b.a(new y(requestConfig.getType(), responseExecute.isCompleted(), responseExecute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(responseExecute.getCode())), responseExecute.getCode(), !(responseExecute.getResponseData().length == 0) ? responseExecute.getResponseData() : responseExecute.getErrorData(), responseExecute.getHeaders()));
        }
    }

    public final void a(@NotNull final y yVar) {
        this.f75433a.getExecutorProvider().getModuleExecutor().execute(new Runnable() { // from class: q8.b
            @Override // java.lang.Runnable
            public final void run() {
                p.a(yVar, this);
            }
        });
    }

    public final void a(@NotNull final RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        z zVar = (z) this.f75434b.f75383d.get(requestConfig.getType());
        if (zVar != null) {
            long jCurrentTimeMillis = this.f75435c.currentTimeMillis();
            int iA = v.a(zVar.f75454c);
            if (iA != 1) {
                resendIntervalForValidResponse = iA != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (jCurrentTimeMillis - zVar.f75453b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f75433a.getExecutorProvider().getSupportIOExecutor().execute(new Runnable() { // from class: q8.a
            @Override // java.lang.Runnable
            public final void run() {
                p.a(this.f98755b, requestConfig);
            }
        });
    }
}
