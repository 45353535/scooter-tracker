package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"!\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"!\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"!\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"difference", "Landroidx/compose/ui/graphics/PathOperation;", "Landroidx/compose/ui/graphics/PathOperation$Companion;", "getDifference$annotations", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)V", "getDifference", "(Landroidx/compose/ui/graphics/PathOperation$Companion;)I", "intersect", "getIntersect$annotations", "getIntersect", "reverseDifference", "getReverseDifference$annotations", "getReverseDifference", "union", "getUnion$annotations", "getUnion", "xor", "getXor$annotations", "getXor", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PathOperationKt {
    public static final int getDifference(@NotNull PathOperation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.m1866getDifferenceb3I0S0c();
    }

    public static /* synthetic */ void getDifference$annotations(PathOperation.Companion companion) {
    }

    public static final int getIntersect(@NotNull PathOperation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.m1867getIntersectb3I0S0c();
    }

    public static /* synthetic */ void getIntersect$annotations(PathOperation.Companion companion) {
    }

    public static final int getReverseDifference(@NotNull PathOperation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.m1868getReverseDifferenceb3I0S0c();
    }

    public static /* synthetic */ void getReverseDifference$annotations(PathOperation.Companion companion) {
    }

    public static final int getUnion(@NotNull PathOperation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.m1869getUnionb3I0S0c();
    }

    public static /* synthetic */ void getUnion$annotations(PathOperation.Companion companion) {
    }

    public static final int getXor(@NotNull PathOperation.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.m1870getXorb3I0S0c();
    }

    public static /* synthetic */ void getXor$annotations(PathOperation.Companion companion) {
    }
}
