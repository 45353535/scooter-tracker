package com.mobilefuse.videoplayer.model;

import com.ironsource.C4240b4;
import com.mobilefuse.videoplayer.model.VastEventOwner;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastAdContent;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "adServingId", "", "getAdServingId", "()Ljava/lang/String;", "adSystem", "getAdSystem", "adTitle", "getAdTitle", C4240b4.i.F0, "getAdvertiser", "creativeList", "", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "getCreativeList", "()Ljava/util/List;", "description", "getDescription", "verificationList", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "getVerificationList", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface VastAdContent extends VastEventOwner {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastAdContent vastAdContent, @NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return VastEventOwner.DefaultImpls.getEvents(vastAdContent, eventType);
        }

        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastAdContent vastAdContent, @NotNull EventType eventType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return VastEventOwner.DefaultImpls.getEvents(vastAdContent, eventType, str);
        }
    }

    @Nullable
    String getAdServingId();

    @Nullable
    String getAdSystem();

    @Nullable
    String getAdTitle();

    @Nullable
    String getAdvertiser();

    @NotNull
    List<VastCreative> getCreativeList();

    @Nullable
    String getDescription();

    @NotNull
    List<VastVerification> getVerificationList();
}
