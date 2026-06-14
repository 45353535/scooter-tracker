package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0718a f56775b = new C0718a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f56776c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e f56777a;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C0718a {
        public /* synthetic */ C0718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0718a() {
        }
    }

    public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f56777a = eventHandler;
    }

    @JavascriptInterface
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateJavascript", message, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f56777a.c(event);
    }

    @JavascriptInterface
    @NotNull
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
