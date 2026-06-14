package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "", "id", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUrl", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastClickThrough {

    @Nullable
    private final String id;

    @NotNull
    private final String url;

    public VastClickThrough(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = str;
        this.url = url;
    }

    public static /* synthetic */ VastClickThrough copy$default(VastClickThrough vastClickThrough, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastClickThrough.id;
        }
        if ((i10 & 2) != 0) {
            str2 = vastClickThrough.url;
        }
        return vastClickThrough.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastClickThrough copy(@Nullable String id2, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new VastClickThrough(id2, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastClickThrough)) {
            return false;
        }
        VastClickThrough vastClickThrough = (VastClickThrough) other;
        return Intrinsics.areEqual(this.id, vastClickThrough.id) && Intrinsics.areEqual(this.url, vastClickThrough.url);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastClickThrough(id=" + this.id + ", url=" + this.url + ")";
    }
}
