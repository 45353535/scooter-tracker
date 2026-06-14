package com.mobilefuse.sdk.telemetry.loggers;

import android.util.Log;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpJsonPostBody;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J+\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/MfxRequestManager;", "", "()V", "createJsonRequestBody", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "json", "", "sendRequest", "", "serviceUrl", "onSuccessCallback", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class MfxRequestManager {
    private final Either<BaseError, HttpPostBody> createJsonRequestBody(String json) {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(new SuccessResult(new HttpJsonPostBody(json)));
        } catch (Throwable th2) {
            if (MfxRequestManager$createJsonRequestBody$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }

    @Nullable
    public final Unit sendRequest(@NotNull final String serviceUrl, @NotNull final String json, @NotNull final Function0<Unit> onSuccessCallback) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(serviceUrl, "serviceUrl");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Either<BaseError, HttpPostBody> eitherCreateJsonRequestBody = createJsonRequestBody(json);
            if (eitherCreateJsonRequestBody instanceof SuccessResult) {
                HttpFlowKt.requestHttpPost$default(serviceUrl, (HttpPostBody) ((SuccessResult) eitherCreateJsonRequestBody).getValue(), 0L, MapsKt.mapOf(TuplesKt.to("Content-Type", "text-plain")), false, 4, null).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.telemetry.loggers.MfxRequestManager$sendRequest$$inlined$gracefullyHandleException$lambda$1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof SuccessResult) {
                            Either either = (Either) ((SuccessResult) result).getValue();
                            if (!(either instanceof ErrorResult)) {
                                if (either instanceof SuccessResult) {
                                    onSuccessCallback.invoke();
                                    return;
                                }
                                return;
                            }
                            ErrorResult errorResult2 = (ErrorResult) either;
                            if (!(errorResult2.getValue() instanceof HttpError.ConnectionError)) {
                                Log.d("MobileFuse.Telemetry", "Error sending the Log. Error message: " + ((HttpError) errorResult2.getValue()).getMessage());
                                return;
                            }
                            Object value2 = errorResult2.getValue();
                            if (!(value2 instanceof HttpError.ConnectionError)) {
                                value2 = null;
                            }
                            HttpError.ConnectionError connectionError = (HttpError.ConnectionError) value2;
                            if (connectionError == null || connectionError.getStatusCode() != 204) {
                                return;
                            }
                            onSuccessCallback.invoke();
                        }
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t10) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t10);
                    }
                });
            } else {
                boolean z10 = eitherCreateJsonRequestBody instanceof ErrorResult;
            }
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (MfxRequestManager$sendRequest$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = null;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Unit) value;
    }
}
