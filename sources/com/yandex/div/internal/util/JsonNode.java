package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/util/JsonNode;", "", "()V", "dump", "", "Lcom/yandex/div/internal/util/JsonArray;", "Lcom/yandex/div/internal/util/JsonObject;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class JsonNode {
    public /* synthetic */ JsonNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String dump();

    private JsonNode() {
    }
}
