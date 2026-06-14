package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;
import com.moloco.sdk.MetricsRequest$SDKInitSuccessTrackingRequest;
import com.moloco.sdk.MetricsRequest$SDKInitTrackingRequest;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ve.g;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e f55694b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55695a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f55613g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f55608b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f55609c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f55610d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f55611e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f55612f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f55695a = iArr;
        }
    }

    public n(String endpoint, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e httpRequestClient) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(httpRequestClient, "httpRequestClient");
        this.f55693a = endpoint;
        this.f55694b = httpRequestClient;
    }

    @Override // com.moloco.sdk.internal.services.init.m
    public Object a(long j10, Continuation continuation) {
        MolocoLogger molocoLogger;
        try {
            molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "Reporting InitTracking success", false, 4, null);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifySuccess post request", e10, false, 8, null);
        }
        if (this.f55693a.length() == 0) {
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return Unit.f93236a;
        }
        Uri uriBuild = Uri.parse(this.f55693a).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = this.f55694b;
        String string = uriBuild.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e.a.a(eVar, string, d(j10), g.a.f106629a.b(), null, 8, null);
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.services.init.m
    public Object b(i iVar, long j10, Continuation continuation) {
        try {
            if (iVar instanceof i.a) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking client failure: " + ((i.a) iVar).a(), false, 4, null);
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new lf.m();
                }
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking server failure: " + ((i.b) iVar).a(), false, 4, null);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifyFailure post request", e10, false, 8, null);
        }
        if (this.f55693a.length() == 0) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return Unit.f93236a;
        }
        Uri uriBuild = Uri.parse(this.f55693a).buildUpon().build();
        byte[] bArrE = e(iVar, j10);
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = this.f55694b;
        String string = uriBuild.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e.a.a(eVar, string, bArrE, g.a.f106629a.b(), null, 8, null);
        return Unit.f93236a;
    }

    public final MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b c(b bVar) {
        switch (a.f55695a[bVar.ordinal()]) {
            case 1:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.UNKNOWN;
            case 2:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.HTTP_REQUEST_TIMEOUT;
            case 3:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.HTTP_UKNOWN_HOST;
            case 4:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.HTTP_SOCKET;
            case 5:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.HTTP_SSL_ERROR;
            case 6:
                return MetricsRequest$SDKInitFailureTrackingRequest.ClientError.b.ANDROID_WORK_MANAGER_ISSUE;
            default:
                throw new lf.m();
        }
    }

    public final byte[] d(long j10) {
        MetricsRequest$SDKInitTrackingRequest.a aVarNewBuilder = MetricsRequest$SDKInitTrackingRequest.newBuilder();
        aVarNewBuilder.b(j10);
        aVarNewBuilder.c((MetricsRequest$SDKInitSuccessTrackingRequest) MetricsRequest$SDKInitSuccessTrackingRequest.newBuilder().build());
        byte[] byteArray = ((MetricsRequest$SDKInitTrackingRequest) aVarNewBuilder.build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final byte[] e(i iVar, long j10) {
        MetricsRequest$SDKInitTrackingRequest.a aVarNewBuilder = MetricsRequest$SDKInitTrackingRequest.newBuilder();
        MetricsRequest$SDKInitFailureTrackingRequest.a aVarNewBuilder2 = MetricsRequest$SDKInitFailureTrackingRequest.newBuilder();
        if (iVar instanceof i.a) {
            MetricsRequest$SDKInitFailureTrackingRequest.ClientError.a aVarNewBuilder3 = MetricsRequest$SDKInitFailureTrackingRequest.ClientError.newBuilder();
            aVarNewBuilder3.a(c(((i.a) iVar).a()));
            aVarNewBuilder2.a((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) aVarNewBuilder3.build());
        } else {
            if (!(iVar instanceof i.b)) {
                throw new lf.m();
            }
            MetricsRequest$SDKInitFailureTrackingRequest.ServerError.a aVarNewBuilder4 = MetricsRequest$SDKInitFailureTrackingRequest.ServerError.newBuilder();
            aVarNewBuilder4.a(((i.b) iVar).a());
            aVarNewBuilder2.b((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) aVarNewBuilder4.build());
        }
        aVarNewBuilder.a((MetricsRequest$SDKInitFailureTrackingRequest) aVarNewBuilder2.build());
        aVarNewBuilder.b(j10);
        byte[] byteArray = ((MetricsRequest$SDKInitTrackingRequest) aVarNewBuilder.build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
