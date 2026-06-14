package org.bidon.sdk.utils.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a#\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Lorg/bidon/sdk/utils/json/JsonObjectBuilder;", "", "method", "Lorg/json/JSONObject;", "jsonObject", "(Lkotlin/jvm/functions/Function1;)Lorg/json/JSONObject;", "putTo", "(Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)Lorg/json/JSONObject;", "Lorg/bidon/sdk/utils/json/JsonArrayBuilder;", "Lorg/json/JSONArray;", "jsonArray", "(Lkotlin/jvm/functions/Function1;)Lorg/json/JSONArray;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JsonObjectBuilderKt {
    @NotNull
    public static final JSONArray jsonArray(@NotNull Function1<? super JsonArrayBuilder, Unit> method) {
        Intrinsics.checkNotNullParameter(method, "method");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        method.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.getJsonArray();
    }

    @NotNull
    public static final JSONObject jsonObject(@NotNull Function1<? super JsonObjectBuilder, Unit> method) {
        Intrinsics.checkNotNullParameter(method, "method");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder(null, 1, null);
        method.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.getJsonObject();
    }

    @NotNull
    public static final JSONObject jsonObject(@NotNull JSONObject putTo, @NotNull Function1<? super JsonObjectBuilder, Unit> method) {
        Intrinsics.checkNotNullParameter(putTo, "putTo");
        Intrinsics.checkNotNullParameter(method, "method");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder(putTo);
        method.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.getJsonObject();
    }
}
