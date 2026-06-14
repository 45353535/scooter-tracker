package org.bidon.sdk.utils.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0086\u0004J\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/json/JsonObjectBuilder;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "hasValue", "", "", "value", "build", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonObjectBuilder {

    @NotNull
    private final JSONObject jsonObject;

    public JsonObjectBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: build, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final void hasValue(@NotNull String str, @Nullable Object obj) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (obj != null) {
            this.jsonObject.put(str, obj);
        } else if (this.jsonObject.has(str)) {
            this.jsonObject.remove(str);
        }
    }

    public JsonObjectBuilder(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.jsonObject = jsonObject;
    }

    public /* synthetic */ JsonObjectBuilder(JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
    }
}
