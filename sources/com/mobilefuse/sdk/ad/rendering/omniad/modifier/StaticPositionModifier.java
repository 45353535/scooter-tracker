package com.mobilefuse.sdk.ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J&\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/StaticPositionModifier;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;)V", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", MenuActionType.CANCEL, "", "changePosition", "x", "", "y", "completeAction", "Lkotlin/Function0;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class StaticPositionModifier implements PositionModifier {

    @NotNull
    private final OmniAdContainer omniAdContainer;

    public StaticPositionModifier(@NotNull OmniAdContainer omniAdContainer) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        this.omniAdContainer = omniAdContainer;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    public void cancel() {
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    public void changePosition(int x10, int y10, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        getOmniAdContainer().changePosition(x10, y10);
        completeAction.invoke();
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }
}
