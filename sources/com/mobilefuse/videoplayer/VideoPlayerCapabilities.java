package com.mobilefuse.videoplayer;

import com.mobilefuse.videoplayer.model.VastPlayerCapability;
import com.taurusx.tax.f.y;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "", "()V", "capabilities", "", "Lcom/mobilefuse/videoplayer/model/VastPlayerCapability;", "getCapabilities", "()Ljava/util/Set;", "changeCapability", "", "capability", "addCapability", "", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoPlayerCapabilities {
    private static final Set<VastPlayerCapability> restrictedCapabilitiesToChange;

    @NotNull
    private final Set<VastPlayerCapability> capabilities;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        restrictedCapabilitiesToChange = linkedHashSet;
        linkedHashSet.add(VastPlayerCapability.ICON);
        linkedHashSet.add(VastPlayerCapability.AUTOPLAY);
        linkedHashSet.add(VastPlayerCapability.MUTED_AUTOPLAY);
    }

    public VideoPlayerCapabilities() {
        HashSet hashSet = new HashSet();
        this.capabilities = hashSet;
        hashSet.add(VastPlayerCapability.ICON);
        hashSet.add(VastPlayerCapability.AUTOPLAY);
        hashSet.add(VastPlayerCapability.MUTED_AUTOPLAY);
    }

    public final void changeCapability(@NotNull VastPlayerCapability capability, boolean addCapability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        if (restrictedCapabilitiesToChange.contains(capability)) {
            return;
        }
        if (addCapability) {
            this.capabilities.add(capability);
        } else {
            this.capabilities.remove(capability);
        }
    }

    @NotNull
    public final Set<VastPlayerCapability> getCapabilities() {
        return this.capabilities;
    }
}
