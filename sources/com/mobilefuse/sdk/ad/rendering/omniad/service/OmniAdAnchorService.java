package com.mobilefuse.sdk.ad.rendering.omniad.service;

import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;", "", "propertyService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "marginDp", "", "anchor", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;II)V", "getAnchor", "()I", "setAnchor", "(I)V", "getMarginDp", "getPropertyService", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "changePositionToAnchor", "", "modifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "completeAction", "Lkotlin/Function0;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class OmniAdAnchorService {
    private int anchor;
    private final int marginDp;

    @NotNull
    private final OmniAdPropertyService propertyService;

    public OmniAdAnchorService(@NotNull OmniAdPropertyService propertyService, int i10, int i11) {
        Intrinsics.checkNotNullParameter(propertyService, "propertyService");
        this.propertyService = propertyService;
        this.marginDp = i10;
        this.anchor = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePositionToAnchor$default(OmniAdAnchorService omniAdAnchorService, PositionModifier positionModifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorService.changePositionToAnchor.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        omniAdAnchorService.changePositionToAnchor(positionModifier, function0);
    }

    public final void changePositionToAnchor(@NotNull PositionModifier modifier, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        this.propertyService.changePosition(OmniAdAnchorServiceKt.getAnchorPosition(this), modifier, completeAction);
    }

    public final int getAnchor() {
        return this.anchor;
    }

    public final int getMarginDp() {
        return this.marginDp;
    }

    @NotNull
    public final OmniAdPropertyService getPropertyService() {
        return this.propertyService;
    }

    public final void setAnchor(int i10) {
        this.anchor = i10;
    }

    public /* synthetic */ OmniAdAnchorService(OmniAdPropertyService omniAdPropertyService, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(omniAdPropertyService, i10, (i12 & 4) != 0 ? 3 : i11);
    }
}
