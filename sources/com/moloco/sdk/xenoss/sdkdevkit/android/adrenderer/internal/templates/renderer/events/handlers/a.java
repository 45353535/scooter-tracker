package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.acm.f;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56900a;

    public a(com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56900a = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf("metric");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "ACMHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("event");
        String string2 = event.getString("metricName");
        String string3 = event.getString("type");
        JSONObject jSONObjectOptJSONObject = event.optJSONObject("tags");
        String string4 = event.getString("value");
        if (Intrinsics.areEqual(string3, "counter")) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Count metric recorded: " + string2 + " = " + string4, false, 4, null);
            Intrinsics.checkNotNull(string2);
            com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(string2);
            Intrinsics.checkNotNull(string4);
            cVar.d(Integer.parseInt(string4));
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.checkNotNull(next);
                    String string5 = jSONObjectOptJSONObject.getString(next);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    cVar = cVar.e(next, string5);
                }
            }
            this.f56900a.b(cVar);
            return;
        }
        if (!Intrinsics.areEqual(string3, "timer")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, b(), "Unknown event type: " + string, null, false, 12, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Timer metric recorded: " + string2 + " = " + string4, false, 4, null);
        f.a aVar = com.moloco.sdk.acm.f.Companion;
        Intrinsics.checkNotNull(string2);
        com.moloco.sdk.acm.f fVarA = aVar.a(string2);
        Intrinsics.checkNotNull(string4);
        fVarA.g(Long.parseLong(string4));
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                Intrinsics.checkNotNull(next2);
                String string6 = jSONObjectOptJSONObject.getString(next2);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                fVarA = fVarA.f(next2, string6);
            }
        }
        this.f56900a.a(fVarA);
    }
}
