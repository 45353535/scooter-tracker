package com.moloco.sdk.internal.error;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.config.a f54217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.api.a f54218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54219c;

    public c(com.moloco.sdk.internal.services.config.a configService, com.moloco.sdk.internal.error.api.a errorReportingApi) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.f54217a = configService;
        this.f54218b = errorReportingApi;
        this.f54219c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.b
    public void a(String error, a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        if (this.f54217a.a("ReportSDKError")) {
            String strB = this.f54217a.b("ReportSDKError");
            if (strB == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f54219c, "Error reporting is enabled but with invalid url", null, false, 12, null);
                return;
            } else {
                this.f54218b.a(error, strB, errorMetadata);
                return;
            }
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f54219c, "Error reporting is disabled. Tried to report error: " + error, null, false, 12, null);
    }
}
