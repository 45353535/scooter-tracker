package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4638yb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f45881c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f45882d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f45883e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f45884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f45885b;

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final C4638yb a(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d10 = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C4638yb(d10, precision);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                C4456nf.a(e10);
                return null;
            }
        }

        private a() {
        }
    }

    public C4638yb(double d10, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.f45884a = d10;
        this.f45885b = precision;
    }

    public final double a() {
        return this.f45884a;
    }

    @NotNull
    public final String b() {
        return this.f45885b;
    }

    @NotNull
    public final String c() {
        return this.f45885b;
    }

    public final double d() {
        return this.f45884a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4638yb)) {
            return false;
        }
        C4638yb c4638yb = (C4638yb) obj;
        return Double.compare(this.f45884a, c4638yb.f45884a) == 0 && Intrinsics.areEqual(this.f45885b, c4638yb.f45885b);
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f45884a) * 31) + this.f45885b.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.f45884a + ", precision=" + this.f45885b + ")";
    }

    @NotNull
    public final C4638yb a(double d10, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C4638yb(d10, precision);
    }

    public static /* synthetic */ C4638yb a(C4638yb c4638yb, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = c4638yb.f45884a;
        }
        if ((i10 & 2) != 0) {
            str = c4638yb.f45885b;
        }
        return c4638yb.a(d10, str);
    }

    @Nullable
    public static final C4638yb a(@NotNull JSONObject jSONObject) {
        return f45881c.a(jSONObject);
    }
}
