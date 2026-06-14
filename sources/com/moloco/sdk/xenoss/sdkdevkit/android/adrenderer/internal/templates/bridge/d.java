package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56743c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f56744d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f56745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56746b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public d(WebView webView, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56745a = webView;
        this.f56746b = metricsRecorder;
    }

    public static final void b(d dVar, String str) {
        dVar.f56746b.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.V.g()).e("attached", String.valueOf(dVar.f56745a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "notifyReadyEvent call completed, result: " + str, null, false, 12, null);
    }

    public static final void c(d dVar, boolean z10, String str) {
        dVar.f56746b.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.X.g()).e("viewable", String.valueOf(z10)).e("attached", String.valueOf(dVar.f56745a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "setIsViewable call completed, result: " + str, null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        this.f56746b.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.U.g()).e("attached", String.valueOf(this.f56745a.isAttachedToWindow())));
        this.f56745a.evaluateJavascript("notifyReadyEvent()", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.b(this.f56742a, (String) obj);
            }
        });
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a(final boolean z10) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateBridgeImpl", "viewVisible: " + z10 + " called, invoking setIsViewable in WebView", null, false, 12, null);
        this.f56746b.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.W.g()).e("viewable", String.valueOf(z10)).e("attached", String.valueOf(this.f56745a.isAttachedToWindow())));
        this.f56745a.evaluateJavascript("setIsViewable(" + z10 + ')', new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.c(this.f56740a, z10, (String) obj);
            }
        });
    }
}
