package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C4240b4;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class D8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f40587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f40588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f40589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f40590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Drawable f40591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final WebView f40592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final View f40593g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f40596a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private final String f40597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final String f40598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private final String f40599c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            private final String f40600d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            private final Result f40601e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            private final Result f40602f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @NotNull
            private final View f40603g;

            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result result, @Nullable Result result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f40597a = str;
                this.f40598b = str2;
                this.f40599c = str3;
                this.f40600d = str4;
                this.f40601e = result;
                this.f40602f = result2;
                this.f40603g = privacyIcon;
            }

            @Nullable
            public final String a() {
                return this.f40597a;
            }

            @Nullable
            public final String b() {
                return this.f40598b;
            }

            @Nullable
            public final String c() {
                return this.f40599c;
            }

            @Nullable
            public final String d() {
                return this.f40600d;
            }

            @Nullable
            public final Result e() {
                return this.f40601e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f40597a, aVar.f40597a) && Intrinsics.areEqual(this.f40598b, aVar.f40598b) && Intrinsics.areEqual(this.f40599c, aVar.f40599c) && Intrinsics.areEqual(this.f40600d, aVar.f40600d) && Intrinsics.areEqual(this.f40601e, aVar.f40601e) && Intrinsics.areEqual(this.f40602f, aVar.f40602f) && Intrinsics.areEqual(this.f40603g, aVar.f40603g);
            }

            @Nullable
            public final Result f() {
                return this.f40602f;
            }

            @NotNull
            public final View g() {
                return this.f40603g;
            }

            @NotNull
            public final D8 h() {
                Drawable drawable;
                String str = this.f40597a;
                String str2 = this.f40598b;
                String str3 = this.f40599c;
                String str4 = this.f40600d;
                Result result = this.f40601e;
                WebView webView = null;
                if (result != null) {
                    Object objL = result.l();
                    if (Result.i(objL)) {
                        objL = null;
                    }
                    drawable = (Drawable) objL;
                } else {
                    drawable = null;
                }
                Result result2 = this.f40602f;
                if (result2 != null) {
                    Object objL2 = result2.l();
                    webView = (WebView) (Result.i(objL2) ? null : objL2);
                }
                return new D8(str, str2, str3, str4, drawable, webView, this.f40603g);
            }

            public int hashCode() {
                String str = this.f40597a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f40598b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f40599c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f40600d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result result = this.f40601e;
                int iH = (iHashCode4 + (result == null ? 0 : Result.h(result.l()))) * 31;
                Result result2 = this.f40602f;
                return ((iH + (result2 != null ? Result.h(result2.l()) : 0)) * 31) + this.f40603g.hashCode();
            }

            @Nullable
            public final String i() {
                return this.f40598b;
            }

            @Nullable
            public final String j() {
                return this.f40599c;
            }

            @Nullable
            public final String k() {
                return this.f40600d;
            }

            @Nullable
            public final Result l() {
                return this.f40601e;
            }

            @Nullable
            public final Result m() {
                return this.f40602f;
            }

            @NotNull
            public final View n() {
                return this.f40603g;
            }

            @Nullable
            public final String o() {
                return this.f40597a;
            }

            @NotNull
            public String toString() {
                return "Data(title=" + this.f40597a + ", advertiser=" + this.f40598b + ", body=" + this.f40599c + ", cta=" + this.f40600d + ", icon=" + this.f40601e + ", media=" + this.f40602f + ", privacyIcon=" + this.f40603g + ")";
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result result, @Nullable Result result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f40597a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f40598b;
                }
                if ((i10 & 4) != 0) {
                    str3 = aVar.f40599c;
                }
                if ((i10 & 8) != 0) {
                    str4 = aVar.f40600d;
                }
                if ((i10 & 16) != 0) {
                    result = aVar.f40601e;
                }
                if ((i10 & 32) != 0) {
                    result2 = aVar.f40602f;
                }
                if ((i10 & 64) != 0) {
                    view = aVar.f40603g;
                }
                Result result3 = result2;
                View view2 = view;
                Result result4 = result;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, result4, result3, view2);
            }
        }

        public b(@NotNull a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f40596a = data;
        }

        @NotNull
        public final a a() {
            return this.f40596a;
        }

        @NotNull
        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f40596a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f40596a.i() != null) {
                a(jSONObject, C4240b4.i.F0);
            }
            if (this.f40596a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f40596a.k() != null) {
                a(jSONObject, "cta");
            }
            Result resultL = this.f40596a.l();
            if (resultL != null) {
                a(jSONObject, "icon", resultL.l());
            }
            Result resultM = this.f40596a.m();
            if (resultM != null) {
                a(jSONObject, "media", resultM.l());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.j(obj));
            Throwable thG = Result.g(obj);
            if (thG != null) {
                String message = thG.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.f93236a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public D8(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f40587a = str;
        this.f40588b = str2;
        this.f40589c = str3;
        this.f40590d = str4;
        this.f40591e = drawable;
        this.f40592f = webView;
        this.f40593g = privacyIcon;
    }

    @Nullable
    public final String a() {
        return this.f40587a;
    }

    @Nullable
    public final String b() {
        return this.f40588b;
    }

    @Nullable
    public final String c() {
        return this.f40589c;
    }

    @Nullable
    public final String d() {
        return this.f40590d;
    }

    @Nullable
    public final Drawable e() {
        return this.f40591e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d82 = (D8) obj;
        return Intrinsics.areEqual(this.f40587a, d82.f40587a) && Intrinsics.areEqual(this.f40588b, d82.f40588b) && Intrinsics.areEqual(this.f40589c, d82.f40589c) && Intrinsics.areEqual(this.f40590d, d82.f40590d) && Intrinsics.areEqual(this.f40591e, d82.f40591e) && Intrinsics.areEqual(this.f40592f, d82.f40592f) && Intrinsics.areEqual(this.f40593g, d82.f40593g);
    }

    @Nullable
    public final WebView f() {
        return this.f40592f;
    }

    @NotNull
    public final View g() {
        return this.f40593g;
    }

    @Nullable
    public final String h() {
        return this.f40588b;
    }

    public int hashCode() {
        String str = this.f40587a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40588b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40589c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f40590d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f40591e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f40592f;
        return ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f40593g.hashCode();
    }

    @Nullable
    public final String i() {
        return this.f40589c;
    }

    @Nullable
    public final String j() {
        return this.f40590d;
    }

    @Nullable
    public final Drawable k() {
        return this.f40591e;
    }

    @Nullable
    public final WebView l() {
        return this.f40592f;
    }

    @NotNull
    public final View m() {
        return this.f40593g;
    }

    @Nullable
    public final String n() {
        return this.f40587a;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdData(title=" + this.f40587a + ", advertiser=" + this.f40588b + ", body=" + this.f40589c + ", cta=" + this.f40590d + ", icon=" + this.f40591e + ", mediaView=" + this.f40592f + ", privacyIcon=" + this.f40593g + ")";
    }

    @NotNull
    public final D8 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new D8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ D8 a(D8 d82, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d82.f40587a;
        }
        if ((i10 & 2) != 0) {
            str2 = d82.f40588b;
        }
        if ((i10 & 4) != 0) {
            str3 = d82.f40589c;
        }
        if ((i10 & 8) != 0) {
            str4 = d82.f40590d;
        }
        if ((i10 & 16) != 0) {
            drawable = d82.f40591e;
        }
        if ((i10 & 32) != 0) {
            webView = d82.f40592f;
        }
        if ((i10 & 64) != 0) {
            view = d82.f40593g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return d82.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final U8 f40594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC4219a1 f40595b;

        public a(@NotNull U8 imageLoader, @NotNull InterfaceC4219a1 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f40594a = imageLoader;
            this.f40595b = adViewManagement;
        }

        private final Result b(String str) {
            if (str == null) {
                return null;
            }
            return Result.a(this.f40594a.a(str));
        }

        @NotNull
        public final b a(@NotNull Context activityContext, @NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? E8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(C4240b4.i.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? E8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? E8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("cta");
            String strB4 = jSONObjectOptJSONObject4 != null ? E8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? E8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject("media");
            String strB6 = jSONObjectOptJSONObject6 != null ? E8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(C4240b4.i.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C4454nd.f44461a.a(activityContext, jSONObjectOptJSONObject7 != null ? E8.b(jSONObjectOptJSONObject7, "url") : null, this.f40594a)));
        }

        private final Result a(String str) {
            if (str == null) {
                return null;
            }
            H8 h8A = this.f40595b.a(str);
            WebView presentingView = h8A != null ? h8A.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.f93230c;
                return Result.a(Result.b(kotlin.d.a(new Exception("missing adview for id: '" + str + "'"))));
            }
            return Result.a(Result.b(presentingView));
        }
    }
}
