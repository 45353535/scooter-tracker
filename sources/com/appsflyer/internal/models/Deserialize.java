package com.appsflyer.internal.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/Deserialize;", "T", "", "fromJson", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Ljava/lang/Object;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Deserialize<T> {
    T fromJson(@NotNull JSONObject json);
}
