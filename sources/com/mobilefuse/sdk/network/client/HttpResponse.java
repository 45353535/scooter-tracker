package com.mobilefuse.sdk.network.client;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpResponse;", "", "body", "", "statusCode", "", "requestTimestamp", "", "responseTimestamp", "(Ljava/lang/String;IJJ)V", "getBody", "()Ljava/lang/String;", "getRequestTimestamp", "()J", "getResponseTimestamp", "getStatusCode", "()I", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpResponse {

    @NotNull
    private final String body;
    private final long requestTimestamp;
    private final long responseTimestamp;
    private final int statusCode;

    public HttpResponse(@NotNull String body, int i10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
        this.statusCode = i10;
        this.requestTimestamp = j10;
        this.responseTimestamp = j11;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, String str, int i10, long j10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            j10 = httpResponse.requestTimestamp;
        }
        if ((i11 & 8) != 0) {
            j11 = httpResponse.responseTimestamp;
        }
        long j12 = j11;
        return httpResponse.copy(str, i10, j10, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getResponseTimestamp() {
        return this.responseTimestamp;
    }

    @NotNull
    public final HttpResponse copy(@NotNull String body, int statusCode, long requestTimestamp, long responseTimestamp) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new HttpResponse(body, statusCode, requestTimestamp, responseTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return Intrinsics.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && this.requestTimestamp == httpResponse.requestTimestamp && this.responseTimestamp == httpResponse.responseTimestamp;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public final long getResponseTimestamp() {
        return this.responseTimestamp;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.body;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.statusCode) * 31) + b.a(this.requestTimestamp)) * 31) + b.a(this.responseTimestamp);
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", requestTimestamp=" + this.requestTimestamp + ", responseTimestamp=" + this.responseTimestamp + ")";
    }
}
