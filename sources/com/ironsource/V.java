package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface V {

    public static final class a implements V {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f41850a;

        public a(@NotNull JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.f41850a = applicationConfig;
        }

        @Override // com.ironsource.V
        @NotNull
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.f41850a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.V
        public int b() {
            int iOptInt = this.f41850a.optInt("debugMode", 0);
            if (this.f41850a.optBoolean(b.f41855e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.V
        @NotNull
        public String c() {
            String strOptString = this.f41850a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f41851a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f41852b = "controllerUrl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f41853c = "controllerConfig";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f41854d = "debugMode";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f41855e = "adptDebugMode";

        private b() {
        }
    }

    @NotNull
    JSONObject a();

    int b();

    @NotNull
    String c();
}
