package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58903a = "WebBrowserUserAgentService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f58904b = i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.b(this.f58902b);
        }
    });

    public static final String b(g gVar) {
        try {
            String property = System.getProperty("http.agent");
            if (property != null) {
                if (!StringsKt.y0(property)) {
                    return property;
                }
            }
            return "";
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, gVar.f58903a, e10.toString(), null, false, 12, null);
            return "";
        }
    }

    public final String a() {
        return (String) this.f58904b.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.a
    public String invoke() {
        return a();
    }
}
