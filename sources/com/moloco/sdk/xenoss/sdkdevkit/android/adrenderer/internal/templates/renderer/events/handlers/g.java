package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f56929a;

    public g(t0 externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f56929a = externalLinkHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf("launchUrl");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "LaunchUrlHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("url");
        t0 t0Var = this.f56929a;
        Intrinsics.checkNotNull(string);
        t0Var.a(string);
    }
}
