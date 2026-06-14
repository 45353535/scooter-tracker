package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    public static final a G = new a(null);
    private final JSONArray A;
    private final List B;
    private final List C;
    private final List D;
    private final List E;
    private final Long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumSet f19909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f19912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f19913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f19914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f19916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JSONArray f19917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f19918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f19919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f19920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f19921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f19922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f19923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONArray f19924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final JSONArray f19925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map f19926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final JSONArray f19927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final JSONArray f19928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final JSONArray f19929y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final JSONArray f19930z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f19931e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f19934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f19935d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = -1;
                    int iOptInt = jSONArray.optInt(i10, -1);
                    if (iOptInt == -1) {
                        String versionString = jSONArray.optString(i10);
                        if (!z.W(versionString)) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i11 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                z.Z("FacebookSDK", e10);
                            }
                            iOptInt = i11;
                        }
                    }
                    iArr[i10] = iOptInt;
                }
                return iArr;
            }

            public final b a(JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (z.W(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List listSplit$default = StringsKt.split$default(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (z.W(str) || z.W(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new b(str, str2, z.W(strOptString) ? null : Uri.parse(strOptString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f19932a;
        }

        public final String b() {
            return this.f19933b;
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f19932a = str;
            this.f19933b = str2;
            this.f19934c = uri;
            this.f19935d = iArr;
        }
    }

    public i(boolean z10, String nuxContent, boolean z11, int i10, EnumSet smartLoginOptions, Map dialogConfigurations, boolean z12, c errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, List list, List list2, List list3, List list4, Long l10) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f19905a = z10;
        this.f19906b = nuxContent;
        this.f19907c = z11;
        this.f19908d = i10;
        this.f19909e = smartLoginOptions;
        this.f19910f = dialogConfigurations;
        this.f19911g = z12;
        this.f19912h = errorClassification;
        this.f19913i = smartLoginBookmarkIconURL;
        this.f19914j = smartLoginMenuIconURL;
        this.f19915k = z13;
        this.f19916l = z14;
        this.f19917m = jSONArray;
        this.f19918n = sdkUpdateMessage;
        this.f19919o = z15;
        this.f19920p = z16;
        this.f19921q = str;
        this.f19922r = str2;
        this.f19923s = str3;
        this.f19924t = jSONArray2;
        this.f19925u = jSONArray3;
        this.f19926v = map;
        this.f19927w = jSONArray4;
        this.f19928x = jSONArray5;
        this.f19929y = jSONArray6;
        this.f19930z = jSONArray7;
        this.A = jSONArray8;
        this.B = list;
        this.C = list2;
        this.D = list3;
        this.E = list4;
        this.F = l10;
    }

    public final boolean a() {
        return this.f19911g;
    }

    public final JSONArray b() {
        return this.A;
    }

    public final JSONArray c() {
        return this.f19927w;
    }

    public final boolean d() {
        return this.f19916l;
    }

    public final List e() {
        return this.B;
    }

    public final Long f() {
        return this.F;
    }

    public final c g() {
        return this.f19912h;
    }

    public final JSONArray h() {
        return this.f19917m;
    }

    public final boolean i() {
        return this.f19915k;
    }

    public final JSONArray j() {
        return this.f19925u;
    }

    public final List k() {
        return this.D;
    }

    public final JSONArray l() {
        return this.f19924t;
    }

    public final List m() {
        return this.C;
    }

    public final String n() {
        return this.f19921q;
    }

    public final JSONArray o() {
        return this.f19928x;
    }

    public final String p() {
        return this.f19923s;
    }

    public final JSONArray q() {
        return this.f19930z;
    }

    public final String r() {
        return this.f19918n;
    }

    public final JSONArray s() {
        return this.f19929y;
    }

    public final int t() {
        return this.f19908d;
    }

    public final String u() {
        return this.f19922r;
    }

    public final List v() {
        return this.E;
    }

    public final boolean w() {
        return this.f19905a;
    }
}
