package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4524s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f44854d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f44855e = "capping";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f44856f = "pacing";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f44857g = "delivery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f44858h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f44859i = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f44860j = "reward";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f44861k = "name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f44862l = "amount";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f44863m = "virtualItemName";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f44864n = "virtualItemCount";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f44865o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f44866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f44867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f44868c;

    /* JADX INFO: renamed from: com.ironsource.s$a */
    static final class a extends Lambda implements Function1<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44869a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b */
    static final class b extends Lambda implements Function1<JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44870a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final H3 f44871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Xc f44872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final O4 f44873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Long f44874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final C4657zd f44875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final C4657zd f44876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final C4488pd f44877g;

        public d(@NotNull JSONObject features) throws JSONException {
            H3 h32;
            Xc xc2;
            Intrinsics.checkNotNullParameter(features, "features");
            C4488pd c4488pd = null;
            if (features.has(C4524s.f44855e)) {
                JSONObject jSONObject = features.getJSONObject(C4524s.f44855e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                h32 = new H3(jSONObject);
            } else {
                h32 = null;
            }
            this.f44871a = h32;
            if (features.has(C4524s.f44856f)) {
                JSONObject jSONObject2 = features.getJSONObject(C4524s.f44856f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                xc2 = new Xc(jSONObject2);
            } else {
                xc2 = null;
            }
            this.f44872b = xc2;
            this.f44873c = features.has("delivery") ? new O4(features.getBoolean("delivery")) : null;
            this.f44874d = features.has(C4524s.f44859i) ? Long.valueOf(features.getLong(C4524s.f44859i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject("reward");
            this.f44875e = jSONObjectOptJSONObject != null ? new C4657zd(jSONObjectOptJSONObject, "name", "amount") : null;
            C4657zd c4657zd = new C4657zd(features, C4524s.f44863m, C4524s.f44864n);
            String strB = c4657zd.b();
            this.f44876f = (strB == null || strB.length() == 0 || c4657zd.a() == null) ? null : c4657zd;
            if (features.has(C4524s.f44858h)) {
                JSONObject jSONObject3 = features.getJSONObject(C4524s.f44858h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c4488pd = new C4488pd(jSONObject3);
            }
            this.f44877g = c4488pd;
        }

        @Nullable
        public final C4657zd a() {
            return this.f44875e;
        }

        @Nullable
        public final H3 b() {
            return this.f44871a;
        }

        @Nullable
        public final O4 c() {
            return this.f44873c;
        }

        @Nullable
        public final Long d() {
            return this.f44874d;
        }

        @Nullable
        public final Xc e() {
            return this.f44872b;
        }

        @Nullable
        public final C4657zd f() {
            return this.f44876f;
        }

        @Nullable
        public final C4488pd g() {
            return this.f44877g;
        }
    }

    public C4524s(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f44866a = new C4418ld(configurations).a(b.f44870a);
        this.f44867b = new d(configurations);
        this.f44868c = new X0(configurations).a(a.f44869a);
    }

    @NotNull
    public final Map<String, d> a() {
        return this.f44868c;
    }

    @NotNull
    public final d b() {
        return this.f44867b;
    }

    @NotNull
    public final Map<String, d> c() {
        return this.f44866a;
    }
}
