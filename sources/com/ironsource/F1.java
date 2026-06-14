package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f40840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f40844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f40845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f40846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f40848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<Integer> f40849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<Integer> f40850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<Integer> f40851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<Integer> f40852m;

    public F1(@NotNull JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.f40840a = applicationEvents.optBoolean(H1.f41019a, false);
        this.f40841b = applicationEvents.optBoolean(H1.f41020b, false);
        this.f40842c = applicationEvents.optBoolean(H1.f41021c, false);
        this.f40843d = applicationEvents.optInt(H1.f41022d, -1);
        String strOptString = applicationEvents.optString(H1.f41023e);
        Intrinsics.checkNotNullExpressionValue(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f40844e = strOptString;
        String strOptString2 = applicationEvents.optString(H1.f41024f);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f40845f = strOptString2;
        this.f40846g = applicationEvents.optInt(H1.f41025g, -1);
        this.f40847h = applicationEvents.optInt(H1.f41026h, -1);
        this.f40848i = applicationEvents.optInt(H1.f41027i, 5000);
        this.f40849j = a(applicationEvents, H1.f41028j);
        this.f40850k = a(applicationEvents, H1.f41029k);
        this.f40851l = a(applicationEvents, H1.f41030l);
        this.f40852m = a(applicationEvents, H1.f41031m);
    }

    public final int a() {
        return this.f40846g;
    }

    public final boolean b() {
        return this.f40842c;
    }

    public final int c() {
        return this.f40843d;
    }

    @NotNull
    public final String d() {
        return this.f40845f;
    }

    public final int e() {
        return this.f40848i;
    }

    public final int f() {
        return this.f40847h;
    }

    @NotNull
    public final List<Integer> g() {
        return this.f40852m;
    }

    @NotNull
    public final List<Integer> h() {
        return this.f40850k;
    }

    @NotNull
    public final List<Integer> i() {
        return this.f40849j;
    }

    public final boolean j() {
        return this.f40841b;
    }

    public final boolean k() {
        return this.f40840a;
    }

    @NotNull
    public final String l() {
        return this.f40844e;
    }

    @NotNull
    public final List<Integer> m() {
        return this.f40851l;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange intRangeV = kotlin.ranges.g.v(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((IntIterator) it).nextInt())));
        }
        return arrayList;
    }
}
