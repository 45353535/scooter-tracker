package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidUpdateRequest;", "", "eidData", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "requestBody", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "requestUserPayload", "", "(Lcom/mobilefuse/sdk/identity/EidSdkData;Lcom/mobilefuse/sdk/network/client/HttpPostBody;Ljava/lang/String;)V", "getEidData", "()Lcom/mobilefuse/sdk/identity/EidSdkData;", "getRequestBody", "()Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "getRequestUserPayload", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class EidUpdateRequest {

    @NotNull
    private final EidSdkData eidData;

    @NotNull
    private final HttpPostBody requestBody;

    @NotNull
    private final String requestUserPayload;

    public EidUpdateRequest(@NotNull EidSdkData eidData, @NotNull HttpPostBody requestBody, @NotNull String requestUserPayload) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        this.eidData = eidData;
        this.requestBody = requestBody;
        this.requestUserPayload = requestUserPayload;
    }

    public static /* synthetic */ EidUpdateRequest copy$default(EidUpdateRequest eidUpdateRequest, EidSdkData eidSdkData, HttpPostBody httpPostBody, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eidSdkData = eidUpdateRequest.eidData;
        }
        if ((i10 & 2) != 0) {
            httpPostBody = eidUpdateRequest.requestBody;
        }
        if ((i10 & 4) != 0) {
            str = eidUpdateRequest.requestUserPayload;
        }
        return eidUpdateRequest.copy(eidSdkData, httpPostBody, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EidSdkData getEidData() {
        return this.eidData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HttpPostBody getRequestBody() {
        return this.requestBody;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestUserPayload() {
        return this.requestUserPayload;
    }

    @NotNull
    public final EidUpdateRequest copy(@NotNull EidSdkData eidData, @NotNull HttpPostBody requestBody, @NotNull String requestUserPayload) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        return new EidUpdateRequest(eidData, requestBody, requestUserPayload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EidUpdateRequest)) {
            return false;
        }
        EidUpdateRequest eidUpdateRequest = (EidUpdateRequest) other;
        return Intrinsics.areEqual(this.eidData, eidUpdateRequest.eidData) && Intrinsics.areEqual(this.requestBody, eidUpdateRequest.requestBody) && Intrinsics.areEqual(this.requestUserPayload, eidUpdateRequest.requestUserPayload);
    }

    @NotNull
    public final EidSdkData getEidData() {
        return this.eidData;
    }

    @NotNull
    public final HttpPostBody getRequestBody() {
        return this.requestBody;
    }

    @NotNull
    public final String getRequestUserPayload() {
        return this.requestUserPayload;
    }

    public int hashCode() {
        EidSdkData eidSdkData = this.eidData;
        int iHashCode = (eidSdkData != null ? eidSdkData.hashCode() : 0) * 31;
        HttpPostBody httpPostBody = this.requestBody;
        int iHashCode2 = (iHashCode + (httpPostBody != null ? httpPostBody.hashCode() : 0)) * 31;
        String str = this.requestUserPayload;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EidUpdateRequest(eidData=" + this.eidData + ", requestBody=" + this.requestBody + ", requestUserPayload=" + this.requestUserPayload + ")";
    }
}
