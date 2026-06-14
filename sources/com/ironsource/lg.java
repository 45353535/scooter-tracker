package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class lg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f43569c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Double f43570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f43571b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        @NotNull
        public final lg b() {
            return a().a();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Double f43572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Double f43573b;

        public final void a(@Nullable Double d10) {
            this.f43573b = d10;
        }

        public final void b(@Nullable Double d10) {
            this.f43572a = d10;
        }

        @Nullable
        public final Double c() {
            return this.f43572a;
        }

        @NotNull
        public final b a(double d10) {
            this.f43573b = Double.valueOf(d10);
            return this;
        }

        @Nullable
        public final Double b() {
            return this.f43573b;
        }

        @NotNull
        public final lg a() {
            return new lg(this, null);
        }

        @NotNull
        public final b b(double d10) {
            this.f43572a = Double.valueOf(d10);
            return this;
        }
    }

    public /* synthetic */ lg(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @NotNull
    public static final b a() {
        return f43569c.a();
    }

    @NotNull
    public static final lg b() {
        return f43569c.b();
    }

    @Nullable
    public final Double c() {
        return this.f43571b;
    }

    @Nullable
    public final Double d() {
        return this.f43570a;
    }

    @NotNull
    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f43571b);
            jSONObject.put("floor", this.f43570a);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    private lg(b bVar) {
        this.f43570a = bVar.c();
        this.f43571b = bVar.b();
    }
}
