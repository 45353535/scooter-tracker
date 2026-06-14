package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface U1 {

    public static final class a implements U1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f41828a;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.U1
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.f41828a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new p.a(strOptString) : new p.b();
        }

        public a(@Nullable JSONObject jSONObject) {
            this.f41828a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);
}
