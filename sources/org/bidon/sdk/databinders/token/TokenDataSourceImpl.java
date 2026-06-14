package org.bidon.sdk.databinders.token;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.Token;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/databinders/token/TokenDataSourceImpl;", "Lorg/bidon/sdk/databinders/token/TokenDataSource;", "keyValueStorage", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "<init>", "(Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;)V", "value", "Lorg/bidon/sdk/config/models/Token;", "token", "getToken", "()Lorg/bidon/sdk/config/models/Token;", "setToken", "(Lorg/bidon/sdk/config/models/Token;)V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TokenDataSourceImpl implements TokenDataSource {

    @NotNull
    private final KeyValueStorage keyValueStorage;

    @Nullable
    private Token token;

    public TokenDataSourceImpl(@NotNull KeyValueStorage keyValueStorage) {
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.keyValueStorage = keyValueStorage;
    }

    @Override // org.bidon.sdk.databinders.token.TokenDataSource
    @Nullable
    public Token getToken() {
        Token token = this.token;
        if (token != null) {
            return token;
        }
        String token2 = this.keyValueStorage.getToken();
        if (token2 == null) {
            return null;
        }
        Token token3 = new Token(token2);
        this.token = token3;
        return token3;
    }

    @Override // org.bidon.sdk.databinders.token.TokenDataSource
    public void setToken(@Nullable Token token) {
        this.keyValueStorage.setToken(token != null ? token.getToken() : null);
        this.token = token;
    }
}
