package com.appsflyer.api;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/appsflyer/api/AFSerializable;", "Ljava/io/Serializable;", "toJsonMap", "", "", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AFSerializable extends Serializable {
    @NotNull
    Map<String, Object> toJsonMap();
}
