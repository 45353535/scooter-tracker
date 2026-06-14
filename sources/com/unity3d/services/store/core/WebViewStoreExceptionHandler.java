package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J,\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/store/core/WebViewStoreExceptionHandler;", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "_webViewErrorHandler", "Lcom/unity3d/services/ads/gmascar/handlers/WebViewErrorHandler;", "(Lcom/unity3d/services/ads/gmascar/handlers/WebViewErrorHandler;)V", "getStoreError", "Lcom/unity3d/services/store/StoreError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleStoreException", "", "storeEvent", "Lcom/unity3d/services/store/StoreEvent;", "operationId", "", "sendErrorToWebView", "storeError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {

    @NotNull
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(@NotNull WebViewErrorHandler _webViewErrorHandler) {
        Intrinsics.checkNotNullParameter(_webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = _webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exception) {
        return exception instanceof NoSuchMethodException ? StoreError.NO_SUCH_METHOD : exception instanceof IllegalAccessException ? StoreError.ILLEGAL_ACCESS : exception instanceof JSONException ? StoreError.JSON_ERROR : exception instanceof InvocationTargetException ? StoreError.INVOCATION_TARGET : exception instanceof ClassNotFoundException ? StoreError.CLASS_NOT_FOUND : StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int operationId, Exception exception) {
        this._webViewErrorHandler.handleError((m) new StoreWebViewError(storeEvent, exception.getMessage(), Integer.valueOf(operationId), storeError, exception.getMessage()));
    }

    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@NotNull StoreEvent storeEvent, int operationId, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(storeEvent, "storeEvent");
        Intrinsics.checkNotNullParameter(exception, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exception), operationId, exception);
    }
}
