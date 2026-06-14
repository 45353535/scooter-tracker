package com.ironsource;

import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4543t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f45430a = b.f45446a;

    /* JADX INFO: renamed from: com.ironsource.t1$a */
    public interface a extends InterfaceC4543t1 {

        /* JADX INFO: renamed from: com.ironsource.t1$a$a, reason: collision with other inner class name */
        public static final class C0481a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f45431b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f45432c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final C4500q8.e f45433d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f45434e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f45435f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            private final C0482a f45436g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f45437h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final int f45438i;

            /* JADX INFO: renamed from: com.ironsource.t1$a$a$a, reason: collision with other inner class name */
            public static final class C0482a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f45439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f45440b;

                public C0482a(int i10, int i11) {
                    this.f45439a = i10;
                    this.f45440b = i11;
                }

                public final int a() {
                    return this.f45439a;
                }

                public final int b() {
                    return this.f45440b;
                }

                public final int c() {
                    return this.f45439a;
                }

                public final int d() {
                    return this.f45440b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0482a)) {
                        return false;
                    }
                    C0482a c0482a = (C0482a) obj;
                    return this.f45439a == c0482a.f45439a && this.f45440b == c0482a.f45440b;
                }

                public int hashCode() {
                    return (this.f45439a * 31) + this.f45440b;
                }

                @NotNull
                public String toString() {
                    return "Coordinates(x=" + this.f45439a + ", y=" + this.f45440b + ")";
                }

                @NotNull
                public final C0482a a(int i10, int i11) {
                    return new C0482a(i10, i11);
                }

                public static /* synthetic */ C0482a a(C0482a c0482a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0482a.f45439a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0482a.f45440b;
                    }
                    return c0482a.a(i10, i11);
                }
            }

            public C0481a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C0482a coordinates, int i10, int i11) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.f45431b = successCallback;
                this.f45432c = failCallback;
                this.f45433d = productType;
                this.f45434e = demandSourceName;
                this.f45435f = url;
                this.f45436g = coordinates;
                this.f45437h = i10;
                this.f45438i = i11;
            }

            @NotNull
            public final C0481a a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C0482a coordinates, int i10, int i11) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C0481a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i10, i11);
            }

            @Override // com.ironsource.InterfaceC4543t1.a
            @NotNull
            public String b() {
                return this.f45435f;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String c() {
                return this.f45432c;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public C4500q8.e d() {
                return this.f45433d;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String e() {
                return this.f45434e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0481a)) {
                    return false;
                }
                C0481a c0481a = (C0481a) obj;
                return Intrinsics.areEqual(this.f45431b, c0481a.f45431b) && Intrinsics.areEqual(this.f45432c, c0481a.f45432c) && this.f45433d == c0481a.f45433d && Intrinsics.areEqual(this.f45434e, c0481a.f45434e) && Intrinsics.areEqual(this.f45435f, c0481a.f45435f) && Intrinsics.areEqual(this.f45436g, c0481a.f45436g) && this.f45437h == c0481a.f45437h && this.f45438i == c0481a.f45438i;
            }

            @NotNull
            public final String f() {
                return this.f45431b;
            }

            @NotNull
            public final String g() {
                return this.f45432c;
            }

            @NotNull
            public final C4500q8.e h() {
                return this.f45433d;
            }

            public int hashCode() {
                return (((((((((((((this.f45431b.hashCode() * 31) + this.f45432c.hashCode()) * 31) + this.f45433d.hashCode()) * 31) + this.f45434e.hashCode()) * 31) + this.f45435f.hashCode()) * 31) + this.f45436g.hashCode()) * 31) + this.f45437h) * 31) + this.f45438i;
            }

            @NotNull
            public final String i() {
                return this.f45434e;
            }

            @NotNull
            public final String j() {
                return this.f45435f;
            }

            @NotNull
            public final C0482a k() {
                return this.f45436g;
            }

            public final int l() {
                return this.f45437h;
            }

            public final int m() {
                return this.f45438i;
            }

            public final int n() {
                return this.f45437h;
            }

            @NotNull
            public final C0482a o() {
                return this.f45436g;
            }

            public final int p() {
                return this.f45438i;
            }

            @NotNull
            public String toString() {
                return "Click(successCallback=" + this.f45431b + ", failCallback=" + this.f45432c + ", productType=" + this.f45433d + ", demandSourceName=" + this.f45434e + ", url=" + this.f45435f + ", coordinates=" + this.f45436g + ", action=" + this.f45437h + ", metaState=" + this.f45438i + ")";
            }

            public static /* synthetic */ C0481a a(C0481a c0481a, String str, String str2, C4500q8.e eVar, String str3, String str4, C0482a c0482a, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = c0481a.f45431b;
                }
                if ((i12 & 2) != 0) {
                    str2 = c0481a.f45432c;
                }
                if ((i12 & 4) != 0) {
                    eVar = c0481a.f45433d;
                }
                if ((i12 & 8) != 0) {
                    str3 = c0481a.f45434e;
                }
                if ((i12 & 16) != 0) {
                    str4 = c0481a.f45435f;
                }
                if ((i12 & 32) != 0) {
                    c0482a = c0481a.f45436g;
                }
                if ((i12 & 64) != 0) {
                    i10 = c0481a.f45437h;
                }
                if ((i12 & 128) != 0) {
                    i11 = c0481a.f45438i;
                }
                int i13 = i10;
                int i14 = i11;
                String str5 = str4;
                C0482a c0482a2 = c0482a;
                return c0481a.a(str, str2, eVar, str3, str5, c0482a2, i13, i14);
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String a() {
                return this.f45431b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.t1$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f45441b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f45442c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            private final C4500q8.e f45443d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f45444e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            private final String f45445f;

            public b(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.f45441b = successCallback;
                this.f45442c = failCallback;
                this.f45443d = productType;
                this.f45444e = demandSourceName;
                this.f45445f = url;
            }

            @NotNull
            public final b a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC4543t1.a
            @NotNull
            public String b() {
                return this.f45445f;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String c() {
                return this.f45442c;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public C4500q8.e d() {
                return this.f45443d;
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String e() {
                return this.f45444e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f45441b, bVar.f45441b) && Intrinsics.areEqual(this.f45442c, bVar.f45442c) && this.f45443d == bVar.f45443d && Intrinsics.areEqual(this.f45444e, bVar.f45444e) && Intrinsics.areEqual(this.f45445f, bVar.f45445f);
            }

            @NotNull
            public final String f() {
                return this.f45441b;
            }

            @NotNull
            public final String g() {
                return this.f45442c;
            }

            @NotNull
            public final C4500q8.e h() {
                return this.f45443d;
            }

            public int hashCode() {
                return (((((((this.f45441b.hashCode() * 31) + this.f45442c.hashCode()) * 31) + this.f45443d.hashCode()) * 31) + this.f45444e.hashCode()) * 31) + this.f45445f.hashCode();
            }

            @NotNull
            public final String i() {
                return this.f45444e;
            }

            @NotNull
            public final String j() {
                return this.f45445f;
            }

            @NotNull
            public String toString() {
                return "Impression(successCallback=" + this.f45441b + ", failCallback=" + this.f45442c + ", productType=" + this.f45443d + ", demandSourceName=" + this.f45444e + ", url=" + this.f45445f + ")";
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4500q8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f45441b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f45442c;
                }
                if ((i10 & 4) != 0) {
                    eVar = bVar.f45443d;
                }
                if ((i10 & 8) != 0) {
                    str3 = bVar.f45444e;
                }
                if ((i10 & 16) != 0) {
                    str4 = bVar.f45445f;
                }
                String str5 = str4;
                C4500q8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC4543t1
            @NotNull
            public String a() {
                return this.f45441b;
            }
        }

        @NotNull
        String b();
    }

    @NotNull
    String a();

    @NotNull
    String c();

    @NotNull
    C4500q8.e d();

    @NotNull
    String e();

    /* JADX INFO: renamed from: com.ironsource.t1$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f45446a = new b();

        private b() {
        }

        @NotNull
        public final InterfaceC4543t1 a(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (Intrinsics.areEqual(strOptString, C4257c4.f42799c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C4240b4.g.f42582e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C4240b4.i.f42638m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C4500q8.e eVarValueOf = C4500q8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C4257c4.f42802f);
                int i10 = jSONObject3.getInt(C4257c4.f42803g);
                int i11 = jSONObject3.getInt(C4257c4.f42804h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C4257c4.f42806j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C0481a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0481a.C0482a(i10, i11), iOptInt, iOptInt2);
            }
            if (Intrinsics.areEqual(strOptString, "impression")) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
