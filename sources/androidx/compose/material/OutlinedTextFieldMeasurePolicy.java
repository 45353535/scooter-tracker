package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J/\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @NotNull
    private final Function1<Size, Unit> onLabelMeasured;

    @NotNull
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(@NotNull Function1<? super Size, Unit> onLabelMeasured, boolean z10, float f10, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = paddingValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj2 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = function2.invoke(obj2, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PlaceholderId)) {
                        obj = next4;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.m1071calculateHeightzUg2_y0(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj2 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = function2.invoke(obj2, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PlaceholderId)) {
                        obj = next4;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.m1072calculateWidthO3s9Psw(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0, this.animationProgress < 1.0f, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i10, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i10, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i11));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        MeasureScope measure = measureScope;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int iMo302roundToPx0680j_4 = measure.mo302roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getBottom());
        long jM3910copyZbe2FdA$default = Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), TextFieldImplKt.LeadingId)) {
                break;
            }
        }
        Measurable measurable = (Measurable) next;
        Placeable placeableMo3011measureBRTryo0 = measurable != null ? measurable.mo3011measureBRTryo0(jM3910copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo0);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), TextFieldImplKt.TrailingId)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo3011measureBRTryo02 = measurable2 != null ? measurable2.mo3011measureBRTryo0(ConstraintsKt.m3936offsetNN6EwU$default(jM3910copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo02);
        boolean z10 = outlinedTextFieldMeasurePolicy.animationProgress < 1.0f;
        int iMo302roundToPx0680j_42 = measure.mo302roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo399calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo302roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo400calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int i10 = -iMo302roundToPx0680j_4;
        long jM3935offsetNN6EwU = ConstraintsKt.m3935offsetNN6EwU(jM3910copyZbe2FdA$default, z10 ? (-iWidthOrZero2) - iMo302roundToPx0680j_42 : -iMo302roundToPx0680j_42, i10);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next3), TextFieldImplKt.LabelId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) next3;
        final Placeable placeableMo3011measureBRTryo03 = measurable3 != null ? measurable3.mo3011measureBRTryo0(jM3935offsetNN6EwU) : null;
        if (placeableMo3011measureBRTryo03 != null) {
            outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m1428boximpl(SizeKt.Size(placeableMo3011measureBRTryo03.getWidth(), placeableMo3011measureBRTryo03.getHeight())));
        }
        long jM3910copyZbe2FdA$default2 = Constraints.m3910copyZbe2FdA$default(ConstraintsKt.m3935offsetNN6EwU(j10, -iWidthOrZero2, i10 - Math.max(TextFieldImplKt.heightOrZero(placeableMo3011measureBRTryo03) / 2, measure.mo302roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.TextFieldId)) {
                Placeable placeableMo3011measureBRTryo04 = measurable4.mo3011measureBRTryo0(jM3910copyZbe2FdA$default2);
                long jM3910copyZbe2FdA$default3 = Constraints.m3910copyZbe2FdA$default(jM3910copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) next4;
                final Placeable placeableMo3011measureBRTryo05 = measurable5 != null ? measurable5.mo3011measureBRTryo0(jM3910copyZbe2FdA$default3) : null;
                final int iM1072calculateWidthO3s9Psw = OutlinedTextFieldKt.m1072calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo02), placeableMo3011measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo3011measureBRTryo05), z10, j10, measure.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                final int iM1071calculateHeightzUg2_y0 = OutlinedTextFieldKt.m1071calculateHeightzUg2_y0(TextFieldImplKt.heightOrZero(placeableMo3011measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo3011measureBRTryo02), placeableMo3011measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(placeableMo3011measureBRTryo03), TextFieldImplKt.heightOrZero(placeableMo3011measureBRTryo05), j10, measure.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                for (Measurable measurable6 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), OutlinedTextFieldKt.BorderId)) {
                        final Placeable placeableMo3011measureBRTryo06 = measurable6.mo3011measureBRTryo0(ConstraintsKt.Constraints(iM1072calculateWidthO3s9Psw != Integer.MAX_VALUE ? iM1072calculateWidthO3s9Psw : 0, iM1072calculateWidthO3s9Psw, iM1071calculateHeightzUg2_y0 != Integer.MAX_VALUE ? iM1071calculateHeightzUg2_y0 : 0, iM1071calculateHeightzUg2_y0));
                        final Placeable placeable = placeableMo3011measureBRTryo02;
                        final Placeable placeable2 = placeableMo3011measureBRTryo04;
                        final Placeable placeable3 = placeableMo3011measureBRTryo0;
                        return MeasureScope.CC.p(measureScope, iM1072calculateWidthO3s9Psw, iM1071calculateHeightzUg2_y0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$2
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
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                OutlinedTextFieldKt.place(layout, iM1071calculateHeightzUg2_y0, iM1072calculateWidthO3s9Psw, placeable3, placeable, placeable2, placeableMo3011measureBRTryo03, placeableMo3011measureBRTryo05, placeableMo3011measureBRTryo06, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope.getDensity(), measureScope.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    outlinedTextFieldMeasurePolicy = this;
                    placeableMo3011measureBRTryo04 = placeableMo3011measureBRTryo04;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            outlinedTextFieldMeasurePolicy = this;
            measure = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i10, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i11));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i10, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i11) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i11));
            }
        });
    }
}
