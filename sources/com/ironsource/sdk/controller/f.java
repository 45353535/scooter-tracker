package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0476a f45104c = new C0476a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f45105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final JSONObject f45106b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0476a {
            public /* synthetic */ C0476a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@NotNull String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id2 = jSONObject.getString(b.f45108b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                return new a(id2, jSONObjectOptJSONObject);
            }

            private C0476a() {
            }
        }

        public a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f45105a = msgId;
            this.f45106b = jSONObject;
        }

        @NotNull
        public final String a() {
            return this.f45105a;
        }

        @Nullable
        public final JSONObject b() {
            return this.f45106b;
        }

        @NotNull
        public final String c() {
            return this.f45105a;
        }

        @Nullable
        public final JSONObject d() {
            return this.f45106b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f45105a, aVar.f45105a) && Intrinsics.areEqual(this.f45106b, aVar.f45106b);
        }

        public int hashCode() {
            int iHashCode = this.f45105a.hashCode() * 31;
            JSONObject jSONObject = this.f45106b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.f45105a + ", params=" + this.f45106b + ")";
        }

        @NotNull
        public final a a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f45105a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f45106b;
            }
            return aVar.a(str, jSONObject);
        }

        @NotNull
        public static final a a(@NotNull String str) throws JSONException {
            return f45104c.a(str);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f45107a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f45108b = "msgId";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f45109c = "adId";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f45110d = "params";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f45111e = "success";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f45112f = "reason";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f45113g = "command";

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f45114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f45115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final JSONObject f45116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private String f45117d;

        public c(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f45114a = adId;
            this.f45115b = command;
            this.f45116c = params;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.f45117d = string;
        }

        @NotNull
        public final String a() {
            return this.f45114a;
        }

        @NotNull
        public final String b() {
            return this.f45115b;
        }

        @NotNull
        public final JSONObject c() {
            return this.f45116c;
        }

        @NotNull
        public final String d() {
            return this.f45114a;
        }

        @NotNull
        public final String e() {
            return this.f45115b;
        }

        public boolean equals(@Nullable Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return Intrinsics.areEqual(this.f45117d, cVar.f45117d) && Intrinsics.areEqual(this.f45114a, cVar.f45114a) && Intrinsics.areEqual(this.f45115b, cVar.f45115b) && Intrinsics.areEqual(this.f45116c.toString(), cVar.f45116c.toString());
        }

        @NotNull
        public final String f() {
            return this.f45117d;
        }

        @NotNull
        public final JSONObject g() {
            return this.f45116c;
        }

        @NotNull
        public final String h() {
            String string = new JSONObject().put(b.f45108b, this.f45117d).put(b.f45109c, this.f45114a).put("params", this.f45116c).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            return "MessageToController(adId=" + this.f45114a + ", command=" + this.f45115b + ", params=" + this.f45116c + ")";
        }

        @NotNull
        public final c a(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f45114a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f45115b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f45116c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f45117d = str;
        }
    }
}
