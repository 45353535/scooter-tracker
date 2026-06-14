package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/compose/animation/AnimatedContentScope;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(@NotNull AnimatedContentScope<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.rootScope = rootScope;
    }

    @NotNull
    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) k.S(k.Q(CollectionsKt.asSequence(measurables), new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.maxIntrinsicHeight(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) k.S(k.Q(CollectionsKt.asSequence(measurables), new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.maxIntrinsicWidth(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo30measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Placeable placeable;
        Placeable placeable2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        final Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size();
        int i10 = 0;
        while (true) {
            placeable = null;
            if (i10 >= size2) {
                break;
            }
            Measurable measurable = measurables.get(i10);
            Object parentData = measurable.getParentData();
            AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                placeableArr[i10] = measurable.mo3011measureBRTryo0(j10);
            }
            i10++;
        }
        int size3 = measurables.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Measurable measurable2 = measurables.get(i11);
            if (placeableArr[i11] == null) {
                placeableArr[i11] = measurable2.mo3011measureBRTryo0(j10);
            }
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int lastIndex = ArraysKt.getLastIndex(placeableArr);
            if (lastIndex != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                IntIterator it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                    if (width < width2) {
                        placeable2 = placeable3;
                        width = width2;
                    }
                }
            }
        }
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if (size != 0) {
            placeable = placeableArr[0];
            int lastIndex2 = ArraysKt.getLastIndex(placeableArr);
            if (lastIndex2 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                IntIterator it2 = new IntRange(1, lastIndex2).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (height < height2) {
                        placeable = placeable4;
                        height = height2;
                    }
                }
            }
        }
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        this.rootScope.m40setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.CC.p(measure, width3, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Placeable.PlacementScope placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i12 = width3;
                int i13 = height3;
                int length = placeableArr2.length;
                int i14 = 0;
                while (i14 < length) {
                    Placeable placeable5 = placeableArr2[i14];
                    if (placeable5 != null) {
                        long jMo1265alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo1265alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i12, i13), LayoutDirection.Ltr);
                        placementScope = layout;
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m4069getXimpl(jMo1265alignKFBX0sM), IntOffset.m4070getYimpl(jMo1265alignKFBX0sM), 0.0f, 4, null);
                    } else {
                        placementScope = layout;
                    }
                    i14++;
                    layout = placementScope;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) k.S(k.Q(CollectionsKt.asSequence(measurables), new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.minIntrinsicHeight(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, final int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) k.S(k.Q(CollectionsKt.asSequence(measurables), new Function1<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.minIntrinsicWidth(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
