package androidx.graphics.shapes;

import androidx.collection.FloatList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0000¨\u0006\u000e"}, d2 = {"linearMap", "", "xValues", "Landroidx/collection/FloatList;", "yValues", "x", "progressInRange", "", "progress", "progressFrom", "progressTo", "validateProgress", "", "p", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatMappingKt {
    public static final float linearMap(@NotNull FloatList xValues, @NotNull FloatList yValues, float f10) {
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f10).toString());
        }
        Iterator it = g.v(0, xValues._size).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            int i10 = iNextInt + 1;
            if (progressInRange(f10, xValues.get(iNextInt), xValues.get(i10 % xValues.getSize()))) {
                int size = i10 % xValues.getSize();
                float fPositiveModulo = Utils.positiveModulo(xValues.get(size) - xValues.get(iNextInt), 1.0f);
                return Utils.positiveModulo(yValues.get(iNextInt) + (Utils.positiveModulo(yValues.get(size) - yValues.get(iNextInt), 1.0f) * (fPositiveModulo < 0.001f ? 0.5f : Utils.positiveModulo(f10 - xValues.get(iNextInt), 1.0f) / fPositiveModulo)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean progressInRange(float f10, float f11, float f12) {
        return f12 >= f11 ? f11 <= f10 && f10 <= f12 : f10 >= f11 || f10 <= f12;
    }

    public static final void validateProgress(@NotNull FloatList p10) {
        int i10;
        Intrinsics.checkNotNullParameter(p10, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p10.content;
        int i11 = p10._size;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= i11) {
                break;
            }
            float f10 = fArr[i12];
            if (!boolValueOf.booleanValue() || 0.0f > f10 || f10 > 1.0f) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
            i12++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + FloatList.joinToString$default(p10, null, null, null, 0, null, 31, null)).toString());
        }
        Iterable iterableV = g.v(1, p10.getSize());
        if ((iterableV instanceof Collection) && ((Collection) iterableV).isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = iterableV.iterator();
            i10 = 0;
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (p10.get(iNextInt) < p10.get(iNextInt - 1) && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i10 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + FloatList.joinToString$default(p10, null, null, null, 0, null, 31, null)).toString());
    }
}
