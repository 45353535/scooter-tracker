package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private C4224a6 f41129a;

    private final class a extends He {
        public a() {
        }

        @Override // com.ironsource.He, java.lang.Runnable
        public void run() {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            try {
                jSONObjectB.put("duration", a());
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C4231ad.P.a(new C4649z5(A5.APP_ENTER_BACKGROUND, jSONObjectB));
        }
    }

    public final void a(@NotNull InterfaceC4412l7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f41129a = new C4224a6(applicationLifecycleService, new a());
    }
}
