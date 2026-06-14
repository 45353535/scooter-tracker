package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020!H\u0002JE\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\"\u00101\u001a\u001e\b\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020003\u0012\u0006\u0012\u0004\u0018\u00010402H\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010>\u001a\u00020!H\u0002J%\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010DJ%\u0010G\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ%\u0010I\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010DJ\u001d\u0010K\u001a\u00020\u00142\u0006\u00108\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\b\u0010N\u001a\u00020\u0014H\u0002J \u0010O\u001a\u00020\u0014*\u00020P2\u0006\u0010Q\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010U\u001a\u00020\u0014*\u00020P2\u0006\u0010V\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\n\u0010W\u001a\u00020!*\u00020PJ \u0010X\u001a\u00020\u0014*\u00020P2\u0006\u0010Y\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010Z\u001a\u00020\u0014*\u00020P2\u0006\u0010[\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020!0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "invalidateOverscroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverscroll", "drawRight", "right", "drawTop", "top", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    @NotNull
    private final List<EdgeEffect> allEffects;

    @NotNull
    private final EdgeEffect bottomEffect;

    @NotNull
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;

    @NotNull
    private final Modifier effectModifier;
    private boolean invalidationEnabled;

    @NotNull
    private final EdgeEffect leftEffect;

    @NotNull
    private final EdgeEffect leftEffectNegation;

    @NotNull
    private final Function1<IntSize, Unit> onNewSize;

    @NotNull
    private final OverscrollConfiguration overscrollConfig;

    @Nullable
    private PointerId pointerId;

    @Nullable
    private Offset pointerPosition;

    @NotNull
    private final MutableState<Unit> redrawSignal;

    @NotNull
    private final EdgeEffect rightEffect;

    @NotNull
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;

    @NotNull
    private final EdgeEffect topEffect;

    @NotNull
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.topEffect = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.leftEffect = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.rightEffect = edgeEffectCreate4;
        List<EdgeEffect> listListOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2});
        this.allEffects = listListOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listListOf.size();
        for (int i10 = 0; i10 < size; i10++) {
            listListOf.get(i10).setColor(ColorKt.m1658toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        Unit unit = Unit.f93236a;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m1449getZeroNHjbRc();
        Function1<IntSize, Unit> function1 = new Function1<IntSize, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m166invokeozmzZPI(intSize.getPackedValue());
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m166invokeozmzZPI(long j10) {
                boolean zM1436equalsimpl0 = Size.m1436equalsimpl0(IntSizeKt.m4121toSizeozmzZPI(j10), this.this$0.containerSize);
                this.this$0.containerSize = IntSizeKt.m4121toSizeozmzZPI(j10);
                if (!zM1436equalsimpl0) {
                    this.this$0.topEffect.setSize(IntSize.m4111getWidthimpl(j10), IntSize.m4110getHeightimpl(j10));
                    this.this$0.bottomEffect.setSize(IntSize.m4111getWidthimpl(j10), IntSize.m4110getHeightimpl(j10));
                    this.this$0.leftEffect.setSize(IntSize.m4110getHeightimpl(j10), IntSize.m4111getWidthimpl(j10));
                    this.this$0.rightEffect.setSize(IntSize.m4110getHeightimpl(j10), IntSize.m4111getWidthimpl(j10));
                    this.this$0.topEffectNegation.setSize(IntSize.m4111getWidthimpl(j10), IntSize.m4110getHeightimpl(j10));
                    this.this$0.bottomEffectNegation.setSize(IntSize.m4111getWidthimpl(j10), IntSize.m4110getHeightimpl(j10));
                    this.this$0.leftEffectNegation.setSize(IntSize.m4110getHeightimpl(j10), IntSize.m4111getWidthimpl(j10));
                    this.this$0.rightEffectNegation.setSize(IntSize.m4110getHeightimpl(j10), IntSize.m4111getWidthimpl(j10));
                }
                if (zM1436equalsimpl0) {
                    return;
                }
                this.this$0.invalidateOverscroll();
                this.this$0.animateToRelease();
            }
        };
        this.onNewSize = function1;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE.then(AndroidOverscrollKt.StretchOverscrollNonClippingLayer), unit, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), function1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.this$0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1440getWidthimpl(this.containerSize), (-Size.m1437getHeightimpl(this.containerSize)) + drawScope.mo308toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1437getHeightimpl(this.containerSize), drawScope.mo308toPx0680j_4(this.overscrollConfig.getDrawPadding().mo399calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iD = zf.a.d(Size.m1440getWidthimpl(this.containerSize));
        float fMo400calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo400calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iD) + drawScope.mo308toPx0680j_4(fMo400calculateRightPaddingu2uoSUM));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, drawScope.mo308toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m159pullBottom0a9Yr6o(long scroll, long displacement) {
        float fM1371getXimpl = Offset.m1371getXimpl(displacement) / Size.m1440getWidthimpl(this.containerSize);
        float fM1372getYimpl = Offset.m1372getYimpl(scroll) / Size.m1437getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -fM1372getYimpl, 1 - fM1371getXimpl)) * Size.m1437getHeightimpl(this.containerSize) : Offset.m1372getYimpl(scroll);
    }

    /* JADX INFO: renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m160pullLeft0a9Yr6o(long scroll, long displacement) {
        float fM1372getYimpl = Offset.m1372getYimpl(displacement) / Size.m1437getHeightimpl(this.containerSize);
        float fM1371getXimpl = Offset.m1371getXimpl(scroll) / Size.m1440getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.leftEffect, fM1371getXimpl, 1 - fM1372getYimpl) * Size.m1440getWidthimpl(this.containerSize) : Offset.m1371getXimpl(scroll);
    }

    /* JADX INFO: renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m161pullRight0a9Yr6o(long scroll, long displacement) {
        float fM1372getYimpl = Offset.m1372getYimpl(displacement) / Size.m1437getHeightimpl(this.containerSize);
        float fM1371getXimpl = Offset.m1371getXimpl(scroll) / Size.m1440getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -fM1371getXimpl, fM1372getYimpl)) * Size.m1440getWidthimpl(this.containerSize) : Offset.m1371getXimpl(scroll);
    }

    /* JADX INFO: renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m162pullTop0a9Yr6o(long scroll, long displacement) {
        float fM1371getXimpl = Offset.m1371getXimpl(displacement) / Size.m1440getWidthimpl(this.containerSize);
        float fM1372getYimpl = Offset.m1372getYimpl(scroll) / Size.m1437getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.topEffect, fM1372getYimpl, fM1371getXimpl) * Size.m1437getHeightimpl(this.containerSize) : Offset.m1372getYimpl(scroll);
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m163releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || Offset.m1371getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m1371getXimpl(delta));
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1371getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m1371getXimpl(delta));
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1372getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m1372getYimpl(delta));
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1372getYimpl(delta) <= 0.0f) {
            return zIsFinished;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m1372getYimpl(delta));
        return zIsFinished || this.bottomEffect.isFinished();
    }

    private final boolean stopOverscrollAnimation() {
        boolean z10;
        long jM1450getCenteruvyYCjk = SizeKt.m1450getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z10 = false;
        } else {
            m160pullLeft0a9Yr6o(Offset.INSTANCE.m1387getZeroF1C5BW0(), jM1450getCenteruvyYCjk);
            z10 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            m161pullRight0a9Yr6o(Offset.INSTANCE.m1387getZeroF1C5BW0(), jM1450getCenteruvyYCjk);
            z10 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            m162pullTop0a9Yr6o(Offset.INSTANCE.m1387getZeroF1C5BW0(), jM1450getCenteruvyYCjk);
            z10 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z10;
        }
        m159pullBottom0a9Yr6o(Offset.INSTANCE.m1387getZeroF1C5BW0(), jM1450getCenteruvyYCjk);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r13.invoke(r11, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo164applyToFlingBMRW4eQ(long r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo164applyToFlingBMRW4eQ(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo165applyToScrollRhakbz0(long r18, int r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo165applyToScrollRhakbz0(long, int, kotlin.jvm.functions.Function1):long");
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean zDrawLeft;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (Size.m1442isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zDrawLeft = false;
        } else {
            zDrawLeft = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zDrawLeft = drawTop(drawScope, this.topEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zDrawLeft = drawRight(drawScope, this.rightEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z10 = drawBottom(drawScope, this.bottomEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            zDrawLeft = z10;
        }
        if (zDrawLeft) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z10) {
        this.invalidationEnabled = z10;
    }
}
