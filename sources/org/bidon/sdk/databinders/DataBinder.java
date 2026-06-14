package org.bidon.sdk.databinders;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0002\u0010\bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/databinders/DataBinder;", "JsonElement", "", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DataBinder<JsonElement> {
    @NotNull
    String getFieldName();

    @Nullable
    Object getJsonObject(@NotNull Continuation continuation);
}
