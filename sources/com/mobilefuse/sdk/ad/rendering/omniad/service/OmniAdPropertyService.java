package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.app.Activity;
import android.graphics.Point;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ&\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020&2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ0\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006*"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "", "activity", "Landroid/app/Activity;", "sizePx", "Landroid/graphics/Point;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "(Landroid/app/Activity;Landroid/graphics/Point;Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;)V", "getActivity", "()Landroid/app/Activity;", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "lastModifier", "lastPosition", "getLastPosition", "()Landroid/graphics/Point;", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getSizePx", "changePosition", "", C4240b4.i.L, "modifier", "completeAction", "Lkotlin/Function0;", "x", "", "y", "changeScale", "scale", "", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "changeSize", "width", "height", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class OmniAdPropertyService {

    @NotNull
    private final Activity activity;

    @NotNull
    private final PositionModifier defaultPositionModifier;

    @NotNull
    private final SizeModifier defaultSizeModifier;
    private PositionModifier lastModifier;

    @NotNull
    private final Point lastPosition;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    @NotNull
    private final Point sizePx;

    public OmniAdPropertyService(@NotNull Activity activity, @NotNull Point sizePx, @NotNull OmniAdContainer omniAdContainer, @NotNull PositionModifier defaultPositionModifier, @NotNull SizeModifier defaultSizeModifier) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sizePx, "sizePx");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(defaultPositionModifier, "defaultPositionModifier");
        Intrinsics.checkNotNullParameter(defaultSizeModifier, "defaultSizeModifier");
        this.activity = activity;
        this.sizePx = sizePx;
        this.omniAdContainer = omniAdContainer;
        this.defaultPositionModifier = defaultPositionModifier;
        this.defaultSizeModifier = defaultSizeModifier;
        this.lastPosition = new Point(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, Point point, PositionModifier positionModifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i10 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService.changePosition.1
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
        omniAdPropertyService.changePosition(point, positionModifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeScale$default(OmniAdPropertyService omniAdPropertyService, float f10, ScaleModifier scaleModifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService.changeScale.1
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
        omniAdPropertyService.changeScale(f10, scaleModifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeSize$default(OmniAdPropertyService omniAdPropertyService, int i10, int i11, SizeModifier sizeModifier, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            sizeModifier = omniAdPropertyService.defaultSizeModifier;
        }
        if ((i12 & 8) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService.changeSize.1
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
        omniAdPropertyService.changeSize(i10, i11, sizeModifier, function0);
    }

    public final void changePosition(@NotNull Point position, @NotNull PositionModifier modifier, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        changePosition(position.x, position.y, modifier, completeAction);
    }

    public final void changeScale(float scale, @NotNull ScaleModifier modifier, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeScale(scale, completeAction);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void changeSize(int width, int height, @NotNull SizeModifier modifier, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeSize(width, height, completeAction);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final PositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @NotNull
    public final SizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    @NotNull
    public final Point getLastPosition() {
        return this.lastPosition;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final Point getSizePx() {
        return this.sizePx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, int i10, int i11, PositionModifier positionModifier, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i12 & 8) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService.changePosition.2
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
        omniAdPropertyService.changePosition(i10, i11, positionModifier, function0);
    }

    public final void changePosition(int x10, int y10, @NotNull PositionModifier modifier, @NotNull Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PositionModifier positionModifier = this.lastModifier;
            if (positionModifier != null) {
                positionModifier.cancel();
            }
            this.lastModifier = modifier;
            Point point = this.lastPosition;
            point.x = x10;
            point.y = y10;
            modifier.changePosition(x10, y10, completeAction);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }
}
