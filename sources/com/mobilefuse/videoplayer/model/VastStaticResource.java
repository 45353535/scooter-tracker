package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastStaticResource;", "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "creativeType", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "content", "getContent", "()Ljava/lang/String;", "getCreativeType", "resourceType", "Lcom/mobilefuse/videoplayer/model/VastResourceType;", "getResourceType", "()Lcom/mobilefuse/videoplayer/model/VastResourceType;", "getUrl", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastStaticResource implements VastBaseResource {

    @Nullable
    private final String content;

    @Nullable
    private final String creativeType;

    @NotNull
    private final VastResourceType resourceType = VastResourceType.STATIC;

    @Nullable
    private final String url;

    public VastStaticResource(@Nullable String str, @Nullable String str2) {
        this.creativeType = str;
        this.url = str2;
        this.content = str2;
    }

    public static /* synthetic */ VastStaticResource copy$default(VastStaticResource vastStaticResource, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastStaticResource.creativeType;
        }
        if ((i10 & 2) != 0) {
            str2 = vastStaticResource.url;
        }
        return vastStaticResource.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreativeType() {
        return this.creativeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastStaticResource copy(@Nullable String creativeType, @Nullable String url) {
        return new VastStaticResource(creativeType, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastStaticResource)) {
            return false;
        }
        VastStaticResource vastStaticResource = (VastStaticResource) other;
        return Intrinsics.areEqual(this.creativeType, vastStaticResource.creativeType) && Intrinsics.areEqual(this.url, vastStaticResource.url);
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @Nullable
    public String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreativeType() {
        return this.creativeType;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @NotNull
    public VastResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.creativeType;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastStaticResource(creativeType=" + this.creativeType + ", url=" + this.url + ")";
    }
}
