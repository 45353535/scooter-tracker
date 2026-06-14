package com.mobilefuse.sdk.nativeads;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/nativeads/NativeEventTracker;", "", "event", "Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType;", "method", "", "url", "", "(Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType;ILjava/lang/String;)V", "getEvent", "()Lcom/mobilefuse/sdk/nativeads/NativeEventTrackerType;", "getMethod", "()I", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class NativeEventTracker {

    @NotNull
    private final NativeEventTrackerType event;
    private final int method;

    @NotNull
    private final String url;

    public NativeEventTracker(@NotNull NativeEventTrackerType event, int i10, @NotNull String url) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        this.event = event;
        this.method = i10;
        this.url = url;
    }

    public static /* synthetic */ NativeEventTracker copy$default(NativeEventTracker nativeEventTracker, NativeEventTrackerType nativeEventTrackerType, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nativeEventTrackerType = nativeEventTracker.event;
        }
        if ((i11 & 2) != 0) {
            i10 = nativeEventTracker.method;
        }
        if ((i11 & 4) != 0) {
            str = nativeEventTracker.url;
        }
        return nativeEventTracker.copy(nativeEventTrackerType, i10, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NativeEventTrackerType getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final NativeEventTracker copy(@NotNull NativeEventTrackerType event, int method, @NotNull String url) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(url, "url");
        return new NativeEventTracker(event, method, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeEventTracker)) {
            return false;
        }
        NativeEventTracker nativeEventTracker = (NativeEventTracker) other;
        return Intrinsics.areEqual(this.event, nativeEventTracker.event) && this.method == nativeEventTracker.method && Intrinsics.areEqual(this.url, nativeEventTracker.url);
    }

    @NotNull
    public final NativeEventTrackerType getEvent() {
        return this.event;
    }

    public final int getMethod() {
        return this.method;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        NativeEventTrackerType nativeEventTrackerType = this.event;
        int iHashCode = (((nativeEventTrackerType != null ? nativeEventTrackerType.hashCode() : 0) * 31) + this.method) * 31;
        String str = this.url;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NativeEventTracker(event=" + this.event + ", method=" + this.method + ", url=" + this.url + ")";
    }
}
