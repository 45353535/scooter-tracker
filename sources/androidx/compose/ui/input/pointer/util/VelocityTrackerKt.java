package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a1\u0010\u0017\u001a\u00020\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "calculateImpulseVelocity", "dataPoints", "", "time", "isDataDifferential", "", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "event", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "set", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", FirebaseAnalytics.Param.INDEX, "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(event)) {
            velocityTracker.m2987setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i10 = 0;
        while (i10 < size) {
            HistoricalChange historicalChange = historical.get(i10);
            long jM1375minusMKHz9U = Offset.m1375minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m2987setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1376plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM1375minusMKHz9U));
            velocityTracker.m2984addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i10++;
            previousPosition = position;
        }
        velocityTracker.m2987setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1376plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m1375minusMKHz9U(event.getPosition(), previousPosition)));
        velocityTracker.m2984addPositionUv8p0NA(event.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(List<Float> list, List<Float> list2, boolean z10) {
        int size = list.size();
        float fAbs = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                return 0.0f;
            }
            return (z10 ? list.get(0).floatValue() : list.get(0).floatValue() - list.get(1).floatValue()) / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i10 = size - 1;
        for (int i11 = i10; i11 > 0; i11--) {
            int i12 = i11 - 1;
            if (list2.get(i11).floatValue() != list2.get(i12).floatValue()) {
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                float fFloatValue = (z10 ? -list.get(i12).floatValue() : list.get(i11).floatValue() - list.get(i12).floatValue()) / (list2.get(i11).floatValue() - list2.get(i12).floatValue());
                fAbs += (fFloatValue - fKineticEnergyToVelocity) * Math.abs(fFloatValue);
                if (i11 == i10) {
                    fAbs *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(fAbs);
    }

    private static final float kineticEnergyToVelocity(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    @NotNull
    public static final List<Float> polyFitLeastSquares(@NotNull List<Float> x10, @NotNull List<Float> y10, int i10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        if (i10 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (x10.size() != y10.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (x10.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i10 >= x10.size() ? x10.size() - 1 : i10;
        int i11 = i10 + 1;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = x10.size();
        int i13 = size + 1;
        Matrix matrix = new Matrix(i13, size2);
        for (int i14 = 0; i14 < size2; i14++) {
            matrix.set(0, i14, 1.0f);
            for (int i15 = 1; i15 < i13; i15++) {
                matrix.set(i15, i14, matrix.get(i15 - 1, i14) * x10.get(i14).floatValue());
            }
        }
        Matrix matrix2 = new Matrix(i13, size2);
        Matrix matrix3 = new Matrix(i13, i13);
        int i16 = 0;
        while (i16 < i13) {
            for (int i17 = 0; i17 < size2; i17++) {
                matrix2.set(i16, i17, matrix.get(i16, i17));
            }
            for (int i18 = 0; i18 < i16; i18++) {
                float fTimes = matrix2.getRow(i16).times(matrix2.getRow(i18));
                for (int i19 = 0; i19 < size2; i19++) {
                    matrix2.set(i16, i19, matrix2.get(i16, i19) - (matrix2.get(i18, i19) * fTimes));
                }
            }
            float fNorm = matrix2.getRow(i16).norm();
            if (fNorm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f10 = 1.0f / fNorm;
            for (int i20 = 0; i20 < size2; i20++) {
                matrix2.set(i16, i20, matrix2.get(i16, i20) * f10);
            }
            int i21 = 0;
            while (i21 < i13) {
                matrix3.set(i16, i21, i21 < i16 ? 0.0f : matrix2.getRow(i16).times(matrix.getRow(i21)));
                i21++;
            }
            i16++;
        }
        Vector vector = new Vector(size2);
        for (int i22 = 0; i22 < size2; i22++) {
            vector.set(i22, y10.get(i22).floatValue() * 1.0f);
        }
        for (int i23 = size; -1 < i23; i23--) {
            arrayList.set(i23, Float.valueOf(matrix2.getRow(i23).times(vector)));
            int i24 = i23 + 1;
            if (i24 <= size) {
                int i25 = size;
                while (true) {
                    arrayList.set(i23, Float.valueOf(((Number) arrayList.get(i23)).floatValue() - (matrix3.get(i23, i25) * ((Number) arrayList.get(i25)).floatValue())));
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            arrayList.set(i23, Float.valueOf(((Number) arrayList.get(i23)).floatValue() / matrix3.get(i23, i23)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i10, long j10, float f10) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i10];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i10] = new DataPointAtTime(j10, f10);
        } else {
            dataPointAtTime.setTime(j10);
            dataPointAtTime.setDataPoint(f10);
        }
    }
}
