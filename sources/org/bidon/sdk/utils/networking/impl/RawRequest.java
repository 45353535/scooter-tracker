package org.bidon.sdk.utils.networking.impl;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.networking.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/RawRequest;", "", "method", "Lorg/bidon/sdk/utils/networking/Method;", "url", "", "body", "", "headers", "", "", "<init>", "(Lorg/bidon/sdk/utils/networking/Method;Ljava/lang/String;[BLjava/util/Map;)V", "getMethod", "()Lorg/bidon/sdk/utils/networking/Method;", "getUrl", "()Ljava/lang/String;", "getBody", "()[B", "getHeaders", "()Ljava/util/Map;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RawRequest {

    @Nullable
    private final byte[] body;

    @NotNull
    private final Map<String, List<String>> headers;

    @NotNull
    private final Method method;

    @NotNull
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public RawRequest(@NotNull Method method, @NotNull String url, @Nullable byte[] bArr, @NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.method = method;
        this.url = url;
        this.body = bArr;
        this.headers = headers;
    }

    @Nullable
    public final byte[] getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
