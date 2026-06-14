package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastModel;", "", "vastTagChain", "", "Lcom/mobilefuse/videoplayer/model/VastTag;", "(Ljava/util/List;)V", "selectedAd", "Lcom/mobilefuse/videoplayer/model/VastAd;", "getSelectedAd", "()Lcom/mobilefuse/videoplayer/model/VastAd;", "getVastTagChain", "()Ljava/util/List;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastModel {

    @Nullable
    private final VastAd selectedAd;

    @NotNull
    private final List<VastTag> vastTagChain;

    public VastModel(@NotNull List<VastTag> vastTagChain) {
        Intrinsics.checkNotNullParameter(vastTagChain, "vastTagChain");
        this.vastTagChain = vastTagChain;
        this.selectedAd = VastDataModelExtensionsKt.getFirstAd(VastDataModelExtensionsKt.getMainVastTag(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastModel copy$default(VastModel vastModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = vastModel.vastTagChain;
        }
        return vastModel.copy(list);
    }

    @NotNull
    public final List<VastTag> component1() {
        return this.vastTagChain;
    }

    @NotNull
    public final VastModel copy(@NotNull List<VastTag> vastTagChain) {
        Intrinsics.checkNotNullParameter(vastTagChain, "vastTagChain");
        return new VastModel(vastTagChain);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof VastModel) && Intrinsics.areEqual(this.vastTagChain, ((VastModel) other).vastTagChain);
        }
        return true;
    }

    @Nullable
    public final VastAd getSelectedAd() {
        return this.selectedAd;
    }

    @NotNull
    public final List<VastTag> getVastTagChain() {
        return this.vastTagChain;
    }

    public int hashCode() {
        List<VastTag> list = this.vastTagChain;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "VastModel(vastTagChain=" + this.vastTagChain + ")";
    }
}
