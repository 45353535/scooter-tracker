package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56767c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f56768d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f56770b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        this.f56769a = context;
        this.f56770b = mraidCommunicationHub;
    }

    @JavascriptInterface
    public final void close() {
        this.f56770b.a();
    }

    @JavascriptInterface
    public final void expand(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @JavascriptInterface
    public final void open(@NotNull String jsonParams) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        String string = new JSONObject(jsonParams).getString("url");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar = this.f56770b;
        Intrinsics.checkNotNull(string);
        aVar.a(string);
    }

    @JavascriptInterface
    public final void resize(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @JavascriptInterface
    public final void setOrientationProperties(@NotNull String jsonParams) {
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        try {
            JSONObject jSONObject = new JSONObject(jsonParams);
            boolean zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            String strOptString = jSONObject.optString("forceOrientation", "none");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Orientation Set from JSON: " + zOptBoolean + ", " + strOptString, false, 4, null);
            y yVarA = y.f56534b.a(strOptString);
            if (yVarA != null) {
                this.f56770b.a(zOptBoolean, yVarA);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Error parsing orientation properties JSON", e10, false, 8, null);
        }
    }
}
