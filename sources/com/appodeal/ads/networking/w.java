package com.appodeal.ads.networking;

import com.appodeal.ads.network.HttpError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w {
    public static final LoadingError a(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return th2 instanceof HttpError.ConnectionError ? LoadingError.ConnectionError : th2 instanceof HttpError.TimeoutError ? LoadingError.TimeoutError : th2 instanceof HttpError.RequestError ? LoadingError.RequestError : th2 instanceof HttpError.InternalError ? LoadingError.InternalError : th2 instanceof HttpError.ServerError ? LoadingError.ServerError : th2 instanceof HttpError.AdapterNotFound ? LoadingError.AdapterNotFound : th2 instanceof HttpError.AdTypeNotSupportedInAdapter ? LoadingError.AdTypeNotSupportedInAdapter : th2 instanceof HttpError.Canceled ? LoadingError.Canceled : th2 instanceof HttpError.IncorrectAdUnit ? LoadingError.IncorrectAdunit : th2 instanceof HttpError.IncorrectCreative ? LoadingError.IncorrectCreative : th2 instanceof HttpError.InvalidAssets ? LoadingError.InvalidAssets : th2 instanceof HttpError.NoFill ? LoadingError.NoFill : th2 instanceof HttpError.RequestVerificationFailed ? LoadingError.RequestVerificationFailed : th2 instanceof HttpError.SdkVersionNotSupported ? LoadingError.SdkVersionNotSupported : th2 instanceof HttpError.ShowFailed ? LoadingError.ShowFailed : LoadingError.InternalError;
    }
}
