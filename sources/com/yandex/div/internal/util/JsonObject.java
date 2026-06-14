package com.yandex.div.internal.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/internal/util/JsonObject;", "Lcom/yandex/div/internal/util/JsonNode;", "Lorg/json/JSONObject;", "value", "<init>", "(Lorg/json/JSONObject;)V", "", "dump", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "getValue", "()Lorg/json/JSONObject;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsonObject extends JsonNode {

    @NotNull
    private final JSONObject value;

    public JsonObject(@NotNull JSONObject jSONObject) {
        super(null);
        this.value = jSONObject;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    public String dump() {
        return this.value.toString();
    }
}
