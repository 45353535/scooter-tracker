package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/SharedInstances;", "", "()V", "webViewAppInvocationCallbackInvoker", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "getWebViewAppInvocationCallbackInvoker", "()Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "webViewAppNativeCallbackSubject", "Lcom/unity3d/services/core/webview/bridge/INativeCallbackSubject;", "getWebViewAppNativeCallbackSubject", "()Lcom/unity3d/services/core/webview/bridge/INativeCallbackSubject;", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "getWebViewBridge", "()Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "webViewEventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "getWebViewEventSender", "()Lcom/unity3d/services/core/webview/bridge/IEventSender;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedInstances {

    @NotNull
    public static final SharedInstances INSTANCE = new SharedInstances();

    @NotNull
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.a
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(Invocation invocation) {
            SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };

    @NotNull
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        @NotNull
        public NativeCallback getCallback(@NotNull String callbackId) {
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(callbackId);
            Intrinsics.checkNotNullExpressionValue(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(@NotNull NativeCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            WebViewApp.getCurrentApp().removeCallback(callback);
        }
    };

    @NotNull
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            return WebViewApp.getCurrentApp() != null;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(@NotNull Enum<?> eventCategory, @NotNull Enum<?> eventId, @NotNull Object... params) {
            Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(params, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
            }
            return false;
        }
    };

    @NotNull
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(@Nullable String callbackId, @Nullable String callbackStatus, @Nullable Object[] parameters) throws Exception {
            WebViewBridge.getInstance().handleCallback(callbackId, callbackStatus, parameters);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(@Nullable String className, @Nullable String methodName, @Nullable Object[] parameters, @Nullable WebViewCallback callback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(className, methodName, parameters, callback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewApp.getCurrentApp().invokeCallback(it);
    }

    @NotNull
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    @NotNull
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    @NotNull
    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    @NotNull
    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
