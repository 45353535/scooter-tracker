package com.ironsource;

import com.ironsource.sdk.controller.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Kb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f41209d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f41211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f41212c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Kb a(@NotNull String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.f45109c);
            String command = jSONObject.getString(f.b.f45113g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new Kb(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public Kb(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f41210a = adId;
        this.f41211b = command;
        this.f41212c = jSONObject;
    }

    @NotNull
    public final String a() {
        return this.f41210a;
    }

    @NotNull
    public final String b() {
        return this.f41211b;
    }

    @Nullable
    public final JSONObject c() {
        return this.f41212c;
    }

    @NotNull
    public final String d() {
        return this.f41210a;
    }

    @NotNull
    public final String e() {
        return this.f41211b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kb)) {
            return false;
        }
        Kb kb2 = (Kb) obj;
        return Intrinsics.areEqual(this.f41210a, kb2.f41210a) && Intrinsics.areEqual(this.f41211b, kb2.f41211b) && Intrinsics.areEqual(this.f41212c, kb2.f41212c);
    }

    @Nullable
    public final JSONObject f() {
        return this.f41212c;
    }

    public int hashCode() {
        int iHashCode = ((this.f41210a.hashCode() * 31) + this.f41211b.hashCode()) * 31;
        JSONObject jSONObject = this.f41212c;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessageToNative(adId=" + this.f41210a + ", command=" + this.f41211b + ", params=" + this.f41212c + ")";
    }

    @NotNull
    public final Kb a(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new Kb(adId, command, jSONObject);
    }

    public static /* synthetic */ Kb a(Kb kb2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = kb2.f41210a;
        }
        if ((i10 & 2) != 0) {
            str2 = kb2.f41211b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = kb2.f41212c;
        }
        return kb2.a(str, str2, jSONObject);
    }

    @NotNull
    public static final Kb a(@NotNull String str) throws JSONException {
        return f41209d.a(str);
    }
}
