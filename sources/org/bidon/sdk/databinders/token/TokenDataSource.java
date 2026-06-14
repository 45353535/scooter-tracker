package org.bidon.sdk.databinders.token;

import kotlin.Metadata;
import org.bidon.sdk.config.models.Token;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/databinders/token/TokenDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "token", "Lorg/bidon/sdk/config/models/Token;", "getToken", "()Lorg/bidon/sdk/config/models/Token;", "setToken", "(Lorg/bidon/sdk/config/models/Token;)V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TokenDataSource extends DataSource {
    @Nullable
    Token getToken();

    void setToken(@Nullable Token token);
}
