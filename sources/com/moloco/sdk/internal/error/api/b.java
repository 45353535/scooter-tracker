package com.moloco.sdk.internal.error.api;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.i;
import com.moloco.sdk.internal.utils.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a f54215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54216c;

    public b(i timeProviderService, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a httpClient) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f54214a = timeProviderService;
        this.f54215b = httpClient;
        this.f54216c = "ErrorReportingApi";
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f54216c, "SDK Crashed", error, false, 8, null);
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(String error, String url, com.moloco.sdk.internal.error.a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        String strE = d.e(d.d(url, error, this.f54214a.invoke()), errorMetadata.a());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f54216c, "Reporting error: " + error + " to url: " + strE, null, false, 12, null);
        this.f54215b.a(strE);
    }
}
