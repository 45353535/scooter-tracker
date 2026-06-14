package org.bidon.sdk.utils.json;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/utils/json/JsonSerializer;", "T", "", "serialize", "Lorg/json/JSONObject;", "data", "(Ljava/lang/Object;)Lorg/json/JSONObject;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JsonSerializer<T> {
    @NotNull
    JSONObject serialize(T data);
}
