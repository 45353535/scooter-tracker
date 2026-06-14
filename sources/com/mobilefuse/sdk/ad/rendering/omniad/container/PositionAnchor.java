package com.mobilefuse.sdk.ad.rendering.omniad.container;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/container/PositionAnchor;", "", "()V", "BOTTOM_LEFT", "", "BOTTOM_RIGHT", "TOP_LEFT", "TOP_RIGHT", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class PositionAnchor {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;

    @NotNull
    public static final PositionAnchor INSTANCE = new PositionAnchor();
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    private PositionAnchor() {
    }
}
