package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import com.ironsource.C4329g8;
import com.taurusx.tax.g.n;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage;", "", "opportunityId", "", "(Ljava/lang/String;)V", "getOpportunityId", "()Ljava/lang/String;", "DisplayDestroyed", "DisplayError", "DisplayFinishRequest", "DisplayReady", "FocusChanged", "OpenUrl", "SetOrientation", "VisibilityChanged", "WebViewInstanceRequest", "WebViewInstanceResponse", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayDestroyed;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayError;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayFinishRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayReady;", "Lcom/unity3d/ads/adplayer/DisplayMessage$FocusChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrl;", "Lcom/unity3d/ads/adplayer/DisplayMessage$SetOrientation;", "Lcom/unity3d/ads/adplayer/DisplayMessage$VisibilityChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceResponse;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DisplayMessage {

    @NotNull
    private final String opportunityId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayDestroyed;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayError;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayError extends DisplayMessage {

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(@NotNull String opportunityId, @NotNull String reason) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayFinishRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$DisplayReady;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "showOptions", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getShowOptions", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisplayReady extends DisplayMessage {

        @Nullable
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(@NotNull String opportunityId, @Nullable Map<String, ? extends Object> map) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        @Nullable
        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : map);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$FocusChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "isFocused", "", "(Ljava/lang/String;Z)V", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(@NotNull String opportunityId, boolean z10) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isFocused = z10;
        }

        /* JADX INFO: renamed from: isFocused, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$OpenUrl;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", n.f66171o, "Landroid/content/Intent;", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "", "(Ljava/lang/String;Landroid/content/Intent;Z)V", "getIntent", "()Landroid/content/Intent;", "getUseActivityForResult", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenUrl extends DisplayMessage {

        @NotNull
        private final Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(@NotNull String opportunityId, @NotNull Intent intent, boolean z10) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
            this.useActivityForResult = z10;
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$SetOrientation;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "orientation", "", "(Ljava/lang/String;I)V", "getOrientation", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(@NotNull String opportunityId, int i10) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.orientation = i10;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$VisibilityChanged;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", C4329g8.f43166k, "", "(Ljava/lang/String;Z)V", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(@NotNull String opportunityId, boolean z10) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            this.isVisible = z10;
        }

        /* JADX INFO: renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceRequest;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(@NotNull String opportunityId) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/DisplayMessage$WebViewInstanceResponse;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "opportunityId", "", "webView", "Landroid/webkit/WebView;", "(Ljava/lang/String;Landroid/webkit/WebView;)V", "getWebView", "()Landroid/webkit/WebView;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WebViewInstanceResponse extends DisplayMessage {

        @NotNull
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(@NotNull String opportunityId, @NotNull WebView webView) {
            super(opportunityId, null);
            Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @NotNull
        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
