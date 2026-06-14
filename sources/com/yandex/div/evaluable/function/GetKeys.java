package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/evaluable/function/GetKeys;", "Lcom/yandex/div/evaluable/function/GetKeysFromDict;", "<init>", "()V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "isMethod", "Z", "()Z", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetKeys extends GetKeysFromDict {

    @NotNull
    public static final GetKeys INSTANCE = new GetKeys();

    @NotNull
    private static final String name = "getKeys";
    private static final boolean isMethod = true;

    private GetKeys() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
