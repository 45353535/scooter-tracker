package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static int a(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }
}
