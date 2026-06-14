package com.mobilefuse.sdk.network.model;

import android.net.Uri;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0001\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"resolvedMfxBidEndpointUrl", "", "getResolvedMfxBidEndpointUrl", "()Ljava/lang/String;", "toHttpPostRequest", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "url", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidRequestToHttpRequestKt {
    @NotNull
    public static final String getResolvedMfxBidEndpointUrl() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            String mfxBidEndpointUrl = MobileFuseSettings.getMfxBidEndpointUrl();
            if (MobileFuseSettings.isSpoofMode()) {
                mfxBidEndpointUrl = Uri.parse(mfxBidEndpointUrl).buildUpon().appendQueryParameter("spoof", "1").build().toString();
            }
            errorResult = new SuccessResult(mfxBidEndpointUrl);
        } catch (Throwable th2) {
            if (MfxBidRequestToHttpRequestKt$resolvedMfxBidEndpointUrl$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = MobileFuseSettings.getMfxBidEndpointUrl();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    @NotNull
    public static final HttpPostRequest<HttpParamsPostBody> toHttpPostRequest(@NotNull MfxBidRequest toHttpPostRequest, @NotNull String url) {
        Intrinsics.checkNotNullParameter(toHttpPostRequest, "$this$toHttpPostRequest");
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpPostRequest<>(url, new HttpParamsPostBody(MfxBidRequestToMapKt.toStringMap(toHttpPostRequest)), MfxBidRequestGetHeadersKt.getHeaders(toHttpPostRequest), true, true, 10000L);
    }

    public static /* synthetic */ HttpPostRequest toHttpPostRequest$default(MfxBidRequest mfxBidRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getResolvedMfxBidEndpointUrl();
        }
        return toHttpPostRequest(mfxBidRequest, str);
    }
}
