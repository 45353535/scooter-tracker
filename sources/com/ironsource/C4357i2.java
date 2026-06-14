package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4357i2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f43336h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f43337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a f43338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4424m2 f43339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f43340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final JSONObject f43341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final C4255c2 f43342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final C4443n2 f43343g;

    /* JADX INFO: renamed from: com.ironsource.i2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f43344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f43345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f43346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a f43347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final C4424m2 f43348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final JSONObject f43349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final JSONObject f43350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private final C4255c2 f43351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private final C4443n2 f43352i;

        public a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f43344a = auctionData;
            this.f43345b = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.f43346c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.f43347d = aVarA;
            this.f43348e = c(jSONObjectA);
            this.f43349f = d(jSONObjectA);
            this.f43350g = b(jSONObjectA);
            this.f43351h = a(aVarA, instanceId);
            this.f43352i = b(aVarA, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        public final C4357i2 a() {
            return new C4357i2(this.f43346c, this.f43347d, this.f43348e, this.f43349f, this.f43350g, this.f43351h, this.f43352i);
        }

        @NotNull
        public final JSONObject b() {
            return this.f43344a;
        }

        @NotNull
        public final String c() {
            return this.f43345b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C4424m2 c(JSONObject jSONObject) {
            return new C4424m2(jSONObject);
        }

        private final C4443n2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4424m2 c4424m2A = aVar.a(str);
            if (c4424m2A == null) {
                return null;
            }
            String strK = c4424m2A.k();
            Intrinsics.checkNotNullExpressionValue(strK, "it.serverData");
            return new C4443n2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f43815d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f43819h);
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeV = kotlin.ranges.g.v(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = intRangeV.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    C4424m2 c4424m2 = new C4424m2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c4424m2.n()) {
                        c4424m2 = null;
                    }
                    if (c4424m2 != null) {
                        arrayList2.add(c4424m2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0470a(arrayList);
        }

        private final C4255c2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4424m2 c4424m2A = aVar.a(str);
            if (c4424m2A == null) {
                return null;
            }
            C4255c2 c4255c2 = new C4255c2();
            c4255c2.a(c4424m2A.b());
            c4255c2.c(c4424m2A.h());
            c4255c2.b(c4424m2A.g());
            return c4255c2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C4357i2 c4357i2, String str) {
            String strB = c4357i2.b();
            if (strB != null && strB.length() != 0) {
                if (c4357i2.i()) {
                    Result.Companion companion = Result.f93230c;
                    return Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.f())));
                }
                C4424m2 c4424m2A = c4357i2.a(str);
                if (c4424m2A == null) {
                    Result.Companion companion2 = Result.f93230c;
                    return Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.j())));
                }
                String strK = c4424m2A.k();
                if (strK != null && strK.length() != 0) {
                    return Result.b(c4357i2);
                }
                Result.Companion companion3 = Result.f93230c;
                return Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.e())));
            }
            Result.Companion companion4 = Result.f93230c;
            return Result.b(kotlin.d.a(new C4261c8(C4598w5.f45712a.i())));
        }
    }

    public C4357i2(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a waterfall, @NotNull C4424m2 genericNotifications, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C4255c2 c4255c2, @Nullable C4443n2 c4443n2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f43337a = str;
        this.f43338b = waterfall;
        this.f43339c = genericNotifications;
        this.f43340d = jSONObject;
        this.f43341e = jSONObject2;
        this.f43342f = c4255c2;
        this.f43343g = c4443n2;
    }

    @Nullable
    public final String a() {
        C4443n2 c4443n2 = this.f43343g;
        if (c4443n2 != null) {
            return c4443n2.d();
        }
        return null;
    }

    @Nullable
    public final String b() {
        return this.f43337a;
    }

    @Nullable
    public final C4255c2 c() {
        return this.f43342f;
    }

    @Nullable
    public final JSONObject d() {
        return this.f43341e;
    }

    @NotNull
    public final C4424m2 e() {
        return this.f43339c;
    }

    @Nullable
    public final JSONObject f() {
        return this.f43340d;
    }

    @Nullable
    public final C4443n2 g() {
        return this.f43343g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f43338b;
    }

    public final boolean i() {
        return this.f43338b.isEmpty();
    }

    @Nullable
    public final C4424m2 a(@NotNull String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.f43338b, providerName);
    }

    private final C4424m2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
