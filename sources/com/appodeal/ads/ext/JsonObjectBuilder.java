package com.appodeal.ads.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\b*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0086\u0004¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\b*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/ext/JsonObjectBuilder;", "", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "", "value", "", "hasObject", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Lorg/json/JSONArray;", "hasArray", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "hasValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "build", "()Lorg/json/JSONObject;", "ext_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonObjectBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f13297a;

    public JsonObjectBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: build, reason: from getter */
    public final JSONObject getF13297a() {
        return this.f13297a;
    }

    public final void hasArray(String str, JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (jSONArray != null) {
            this.f13297a.put(str, jSONArray);
        } else if (this.f13297a.has(str)) {
            this.f13297a.remove(str);
        }
    }

    public final void hasObject(String str, JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (jSONObject != null) {
            this.f13297a.put(str, jSONObject);
        } else if (this.f13297a.has(str)) {
            this.f13297a.remove(str);
        }
    }

    public final void hasValue(String str, Object obj) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (obj instanceof JSONObject) {
            throw new IllegalArgumentException("Use [hasObject] instead");
        }
        if (obj instanceof JSONArray) {
            throw new IllegalArgumentException("Use [hasArray] instead");
        }
        if (obj != null) {
            this.f13297a.put(str, obj);
        } else if (this.f13297a.has(str)) {
            this.f13297a.remove(str);
        }
    }

    public JsonObjectBuilder(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f13297a = jsonObject;
    }

    public /* synthetic */ JsonObjectBuilder(JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
    }
}
