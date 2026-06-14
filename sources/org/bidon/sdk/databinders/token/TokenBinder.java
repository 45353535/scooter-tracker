package org.bidon.sdk.databinders.token;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.Token;
import org.bidon.sdk.databinders.DataBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/databinders/token/TokenBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "", "dataSource", "Lorg/bidon/sdk/databinders/token/TokenDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/token/TokenDataSource;)V", "fieldName", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TokenBinder implements DataBinder<String> {

    @NotNull
    private final TokenDataSource dataSource;

    @NotNull
    private final String fieldName;

    public TokenBinder(@NotNull TokenDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.fieldName = "token";
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        Token token = this.dataSource.getToken();
        if (token != null) {
            return token.getToken();
        }
        return null;
    }
}
