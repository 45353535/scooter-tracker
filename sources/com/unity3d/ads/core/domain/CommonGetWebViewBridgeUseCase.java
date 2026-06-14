package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import eg.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "adPlayerScope", "Lkotlinx/coroutines/CoroutineScope;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(@NotNull CoroutineDispatcher dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    @NotNull
    public WebViewBridge invoke(@NotNull AndroidWebViewContainer webViewContainer, @NotNull CoroutineScope adPlayerScope) {
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent, this.logger);
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(CoroutineDispatcher coroutineDispatcher, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? o0.a() : coroutineDispatcher, sendDiagnosticEvent, logger);
    }
}
