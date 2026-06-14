package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastHtmlResource;", "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "htmlContent", "", "(Ljava/lang/String;)V", "content", "getContent", "()Ljava/lang/String;", "getHtmlContent", "resourceType", "Lcom/mobilefuse/videoplayer/model/VastResourceType;", "getResourceType", "()Lcom/mobilefuse/videoplayer/model/VastResourceType;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastHtmlResource implements VastBaseResource {

    @Nullable
    private final String content;

    @Nullable
    private final String htmlContent;

    @NotNull
    private final VastResourceType resourceType = VastResourceType.HTML;

    public VastHtmlResource(@Nullable String str) {
        this.htmlContent = str;
        this.content = str;
    }

    public static /* synthetic */ VastHtmlResource copy$default(VastHtmlResource vastHtmlResource, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastHtmlResource.htmlContent;
        }
        return vastHtmlResource.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    @NotNull
    public final VastHtmlResource copy(@Nullable String htmlContent) {
        return new VastHtmlResource(htmlContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof VastHtmlResource) && Intrinsics.areEqual(this.htmlContent, ((VastHtmlResource) other).htmlContent);
        }
        return true;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @Nullable
    public String getContent() {
        return this.content;
    }

    @Nullable
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @NotNull
    public VastResourceType getResourceType() {
        return this.resourceType;
    }

    public int hashCode() {
        String str = this.htmlContent;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "VastHtmlResource(htmlContent=" + this.htmlContent + ")";
    }
}
