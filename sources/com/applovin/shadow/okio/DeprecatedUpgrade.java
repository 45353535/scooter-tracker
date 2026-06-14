package com.applovin.shadow.okio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okio/-DeprecatedOkio;", "Okio", "Lcom/applovin/shadow/okio/-DeprecatedOkio;", "getOkio", "()Ljava/lang/Object;", "Lcom/applovin/shadow/okio/-DeprecatedUtf8;", "Utf8", "Lcom/applovin/shadow/okio/-DeprecatedUtf8;", "getUtf8", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeprecatedUpgrade {

    @NotNull
    private static final DeprecatedOkio Okio = DeprecatedOkio.INSTANCE;

    @NotNull
    private static final DeprecatedUtf8 Utf8 = DeprecatedUtf8.INSTANCE;

    @NotNull
    public static final DeprecatedOkio getOkio() {
        return Okio;
    }

    @NotNull
    public static final DeprecatedUtf8 getUtf8() {
        return Utf8;
    }
}
