package com.mobilefuse.sdk.network.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpStatusCode;", "", "()V", "BAD_REQUEST", "", "NOT_FOUND", "NO_CONTENT", "OK", "TOO_MANY_REQUESTS", "UNKNOWN_HOST", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class HttpStatusCode {
    public static final int BAD_REQUEST = 400;

    @NotNull
    public static final HttpStatusCode INSTANCE = new HttpStatusCode();
    public static final int NOT_FOUND = 404;
    public static final int NO_CONTENT = 204;
    public static final int OK = 200;
    public static final int TOO_MANY_REQUESTS = 429;
    public static final int UNKNOWN_HOST = -1;

    private HttpStatusCode() {
    }
}
