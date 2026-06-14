package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes5.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private final JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
    }

    @NonNull
    public static JavaScriptReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) xh.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.internal.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return JavaScriptReplyProxyImpl.a(jsReplyProxyBoundaryInterface);
            }
        });
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mBoundaryInterface.postMessage(str);
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessageWithPayload(xh.a.c(new WebMessagePayloadAdapter(bArr)));
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
