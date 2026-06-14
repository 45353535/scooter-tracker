package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f41704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, b> f41705b;

    static final class a extends Lambda implements Function1<JSONObject, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41706a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f41707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f41709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f41710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f41711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f41712f;

        public b(@NotNull JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(U2.f41829a) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(U2.f41829a) : null;
            this.f41707a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(U2.f41830b, 25000) : 25000;
            this.f41708b = iOptInt;
            this.f41709c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f41710d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(U2.f41832d) || jSONObjectOptJSONObject.isNull(U2.f41832d)) ? iOptInt : jSONObjectOptJSONObject.optLong(U2.f41832d);
            this.f41711e = features.has(U2.f41833e) ? features.optInt(U2.f41833e) / 100.0f : 0.15f;
            List<String> listB = features.has(U2.f41834f) ? C4365ia.b(features.getJSONArray(U2.f41834f)) : CollectionsKt.listOf((Object[]) new String[]{"BANNER", com.ironsource.mediationsdk.l.f44064d});
            Intrinsics.checkNotNullExpressionValue(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f41712f = listB;
        }

        @NotNull
        public final List<String> a() {
            return this.f41712f;
        }

        public final float b() {
            return this.f41711e;
        }

        public final int c() {
            return this.f41708b;
        }

        public final long d() {
            return this.f41710d;
        }

        public final boolean e() {
            return this.f41709c;
        }
    }

    public S2(@NotNull JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f41704a = new b(bannerConfigurations);
        this.f41705b = new X0(bannerConfigurations).a(a.f41706a);
    }

    @NotNull
    public final Map<String, b> a() {
        return this.f41705b;
    }

    @NotNull
    public final b b() {
        return this.f41704a;
    }
}
