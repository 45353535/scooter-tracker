package org.bidon.sdk.databinders.test;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.databinders.DataBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/databinders/test/TestModeBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "", "<init>", "()V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TestModeBinder implements DataBinder<Boolean> {

    @NotNull
    private final String fieldName = "test";

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return b.a(BidonSdk.INSTANCE.getBidon$bidon_productionRelease().getIsTestMode());
    }
}
