package com.appodeal.consent.networking;

import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.BuildConfig;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f15533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f15534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f15535e;

    public r(g gVar, l lVar, m mVar, JSONObject jSONObject, Boolean bool) {
        this.f15531a = gVar;
        this.f15532b = lVar;
        this.f15533c = mVar;
        this.f15534d = jSONObject;
        this.f15535e = bool;
    }

    public static final Unit a(final r rVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("app", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.consent.networking.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.c(this.f15528b, (JsonObjectBuilder) obj);
            }
        }));
        jsonObject.hasObject(C4240b4.i.G, JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.consent.networking.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.d(this.f15529b, (JsonObjectBuilder) obj);
            }
        }));
        jsonObject.hasObject("sdk", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.consent.networking.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.e(this.f15530b, (JsonObjectBuilder) obj);
            }
        }));
        jsonObject.hasObject(C4240b4.j.f42669b0, rVar.f15534d);
        jsonObject.hasValue("coppa", rVar.f15535e);
        jsonObject.hasValue(POBCoreNativeConstants.NATIVE_VERSION, BuildConfig.SDK_VERSION);
        return Unit.f93236a;
    }

    public static final Unit c(r rVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue(C4240b4.i.W, rVar.f15531a.f15497a);
        jsonObject.hasValue("packageName", rVar.f15531a.f15498b);
        jsonObject.hasValue("packageVersion", rVar.f15531a.f15499c);
        jsonObject.hasValue("admobAppId", rVar.f15531a.f15500d);
        return Unit.f93236a;
    }

    public static final Unit d(r rVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("idfa", rVar.f15532b.f15513a);
        jsonObject.hasValue("advertising_tracking", Boolean.valueOf(rVar.f15532b.f15514b));
        jsonObject.hasValue("idfv", rVar.f15532b.f15515c);
        jsonObject.hasValue("type", rVar.f15532b.f15516d);
        jsonObject.hasValue(CommonUrlParts.LOCALE, rVar.f15532b.f15517e);
        jsonObject.hasValue("width", Integer.valueOf(rVar.f15532b.f15518f));
        jsonObject.hasValue("height", Integer.valueOf(rVar.f15532b.f15519g));
        jsonObject.hasValue("pxratio", Float.valueOf(rVar.f15532b.f15520h));
        jsonObject.hasValue("model", rVar.f15532b.f15521i);
        jsonObject.hasValue(N6.f41422t, rVar.f15532b.f15522j);
        rVar.f15532b.getClass();
        jsonObject.hasValue("os", "Android");
        jsonObject.hasValue(N6.G, rVar.f15532b.f15523k);
        jsonObject.hasValue("colorTheme", rVar.f15532b.f15524l);
        return Unit.f93236a;
    }

    public static final Unit e(r rVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("id", rVar.f15533c.f15525a);
        jsonObject.hasValue("version", rVar.f15533c.f15526b);
        return Unit.f93236a;
    }

    public final byte[] b() {
        String string = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.consent.networking.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.a(this.f15527b, (JsonObjectBuilder) obj);
            }
        }).toString();
        if (string != null) {
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes != null) {
                return bytes;
            }
        }
        return new byte[0];
    }
}
