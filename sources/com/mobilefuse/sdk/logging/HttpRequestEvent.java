package com.mobilefuse.sdk.logging;

import com.my.target.common.menu.MenuActionType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/logging/HttpRequestEvent;", "", "timeStamp", "Ljava/util/Date;", "url", "", "(Ljava/util/Date;Ljava/lang/String;)V", "getTimeStamp", "()Ljava/util/Date;", "getUrl", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpRequestEvent {

    @NotNull
    private final Date timeStamp;

    @NotNull
    private final String url;

    public HttpRequestEvent(@NotNull Date timeStamp, @NotNull String url) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(url, "url");
        this.timeStamp = timeStamp;
        this.url = url;
    }

    public static /* synthetic */ HttpRequestEvent copy$default(HttpRequestEvent httpRequestEvent, Date date, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = httpRequestEvent.timeStamp;
        }
        if ((i10 & 2) != 0) {
            str = httpRequestEvent.url;
        }
        return httpRequestEvent.copy(date, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final HttpRequestEvent copy(@NotNull Date timeStamp, @NotNull String url) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpRequestEvent(timeStamp, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequestEvent)) {
            return false;
        }
        HttpRequestEvent httpRequestEvent = (HttpRequestEvent) other;
        return Intrinsics.areEqual(this.timeStamp, httpRequestEvent.timeStamp) && Intrinsics.areEqual(this.url, httpRequestEvent.url);
    }

    @NotNull
    public final Date getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Date date = this.timeStamp;
        int iHashCode = (date != null ? date.hashCode() : 0) * 31;
        String str = this.url;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HttpRequestEvent(timeStamp=" + this.timeStamp + ", url=" + this.url + ")";
    }
}
