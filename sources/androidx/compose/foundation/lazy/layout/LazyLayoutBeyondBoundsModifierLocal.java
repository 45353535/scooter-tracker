package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 /2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001/B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u0007*\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "currentInterval", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "addNextInterval", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Z", "hasMoreContent", "isOppositeToOrientation-4vf7U8o", "(I)Z", "isOppositeToOrientation", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "layout", "Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "Z", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", C4240b4.i.W, "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", y.f66058y, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {

    @NotNull
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    @NotNull
    private final LazyListBeyondBoundsInfo beyondBoundsInfo;

    @NotNull
    private final LayoutDirection layoutDirection;

    @NotNull
    private final Orientation orientation;
    private final boolean reverseLayout;

    @NotNull
    private final BeyondBoundsState state;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(@NotNull BeyondBoundsState state, @NotNull LazyListBeyondBoundsInfo beyondBoundsInfo, boolean z10, @NotNull LayoutDirection layoutDirection, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z10;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX INFO: renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval m614addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.getStart()
            int r6 = r6.getEnd()
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE
            int r2 = r1.m2997getBeforehoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r2)
            if (r2 == 0) goto L18
        L14:
            int r0 = r0 + (-1)
            goto L8c
        L18:
            int r2 = r1.m2996getAfterhoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r2)
            if (r2 == 0) goto L26
        L22:
            int r6 = r6 + 1
            goto L8c
        L26:
            int r2 = r1.m2995getAbovehoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r2)
            if (r2 == 0) goto L35
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L35:
            int r2 = r1.m2998getBelowhoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r2)
            if (r2 == 0) goto L44
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L44:
            int r2 = r1.m2999getLefthoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L69
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L64
            if (r7 == r3) goto L5f
            goto L8c
        L5f:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L64:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L69:
            int r1 = r1.m3000getRighthoxUOeE()
            boolean r7 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(r7, r1)
            if (r7 == 0) goto L93
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L87
            if (r7 == r3) goto L82
            goto L8c
        L82:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L87:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L8c:
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r7 = r5.beyondBoundsInfo
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval r6 = r7.addInterval(r0, r6)
            return r6
        L93:
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection()
            lf.g r6 = new lf.g
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.m614addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval, int):androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m615hasMoreContentFR3nfPY(LazyListBeyondBoundsInfo.Interval interval, int i10) {
        if (m616isOppositeToOrientation4vf7U8o(i10)) {
            return false;
        }
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2997getBeforehoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2996getAfterhoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2995getAbovehoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2998getBelowhoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2999getLefthoxUOeE())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
            if (i11 == 1) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            }
            if (i11 == 2) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            }
            throw new m();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m3000getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new g();
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
        if (i12 == 1) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (i12 == 2) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        throw new m();
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsAfter(LazyListBeyondBoundsInfo.Interval interval, LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal) {
        return interval.getEnd() < lazyLayoutBeyondBoundsModifierLocal.state.getItemCount() - 1;
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsBefore(LazyListBeyondBoundsInfo.Interval interval) {
        return interval.getStart() > 0;
    }

    /* JADX INFO: renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m616isOppositeToOrientation4vf7U8o(int i10) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2995getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2998getBelowhoxUOeE())) {
            return this.orientation == Orientation.Horizontal;
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2999getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m3000getRighthoxUOeE())) {
            return this.orientation == Orientation.Vertical;
        }
        if (BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2997getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m2991equalsimpl0(i10, companion.m2996getAfterhoxUOeE())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
        throw new g();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    @Nullable
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo617layouto7g1Pn8(final int direction, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return block.invoke(emptyBeyondBoundsScope);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = this.beyondBoundsInfo.addInterval(this.state.getFirstVisibleIndex(), this.state.getLastVisibleIndex());
        T tInvoke = null;
        while (tInvoke == null && m615hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f93280b, direction)) {
            LazyListBeyondBoundsInfo.Interval intervalM614addNextIntervalFR3nfPY = m614addNextIntervalFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f93280b, direction);
            this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f93280b);
            ref$ObjectRef.f93280b = intervalM614addNextIntervalFR3nfPY;
            this.state.remeasure();
            tInvoke = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m615hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f93280b, direction);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) ref$ObjectRef.f93280b);
        this.state.remeasure();
        return tInvoke;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
