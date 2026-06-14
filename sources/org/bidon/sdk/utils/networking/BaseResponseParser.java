package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import org.bidon.sdk.utils.json.JsonParser;
import org.bidon.sdk.utils.json.JsonParsers;
import org.bidon.sdk.utils.networking.BaseResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/utils/networking/BaseResponseParser;", "Lorg/bidon/sdk/utils/json/JsonParser;", "Lorg/bidon/sdk/utils/networking/BaseResponse;", "<init>", "()V", "parseOrNull", "jsonString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseResponseParser implements JsonParser<BaseResponse> {
    @Override // org.bidon.sdk.utils.json.JsonParser
    @Nullable
    public BaseResponse parseOrNull(@NotNull String jsonString) {
        Object objB;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = new JSONObject(jsonString);
            Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("success"));
            JsonParsers jsonParsers = JsonParsers.INSTANCE;
            String strOptString = jSONObject.optString("error");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            Object obj = JsonParsers.parsersFactories.get(v0.b(BaseResponse.Error.class));
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.bidon.sdk.utils.json.JsonParsers.ParserFactory<T of org.bidon.sdk.utils.json.JsonParsers.parseOrNull>");
            objB = Result.b(new BaseResponse(boolValueOf, (BaseResponse.Error) ((JsonParsers.ParserFactory) obj).getInstance().parseOrNull(strOptString)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (BaseResponse) objB;
    }
}
