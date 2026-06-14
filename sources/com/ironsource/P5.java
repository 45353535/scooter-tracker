package com.ironsource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class P5 implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41549a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f41550b = Q5.f41620j;

    public static final class a implements InterfaceC4328g7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4328g7
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Ya.f42169o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.b(applicationContext));
            Q9 q9D = IronSourceUtils.d(applicationContext);
            if (q9D != null) {
                jSONObject.put("advId", q9D.c());
                jSONObject.put("advIdType", q9D.d());
            }
        }
        String strN = com.ironsource.mediationsdk.r.m().n();
        if (strN != null) {
            jSONObject.put(C4240b4.j.f42678g, strN);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Ic
    public void a() {
    }

    @Override // com.ironsource.Ic
    public void h(@Nullable String str) {
    }

    public final void a(@NotNull String dataSource, @NotNull JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f41549a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            C4311f7.a(this.f41550b, jSONObject.toString(), new a());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.API.error("exception " + e10.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Ic
    public void a(@Nullable List<IronSource.a> list, boolean z10, @Nullable S3 s32) {
        if (s32 != null) {
            C4645z1 c4645z1B = s32.b();
            J1 j1F = c4645z1B != null ? c4645z1B.f() : null;
            Intrinsics.checkNotNull(j1F);
            this.f41549a = j1F.l();
            this.f41550b = s32.b().f().d();
        }
    }
}
