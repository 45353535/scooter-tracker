package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.u;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011\"#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\"#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011\"#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011\"#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u0011\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b%\u0010)\"!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b%\u0010+\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0006*\u00020,8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010-\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0006*\u00020.8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010/\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0006*\u0002008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u00101\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u0006*\u0002028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u00103\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u0006*\u0002048Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u00105\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u0006*\u0002068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/TwoWayConverter;", "", "start", AtomManager.ATOM_STOP_METHOD_NAME, "fraction", "lerp", "(FFF)F", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "", "IntToVector", "Landroidx/compose/ui/unit/Dp;", "DpToVector", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpOffsetToVector", "Landroidx/compose/ui/geometry/Size;", "SizeToVector", "Landroidx/compose/ui/geometry/Offset;", "OffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntSize;", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "RectToVector", "Lkotlin/Float$Companion;", "getVectorConverter", "(Lkotlin/jvm/internal/u;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/a0;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VectorConvertersKt {

    @NotNull
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new Function1<Float, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        @NotNull
        public final AnimationVector1D invoke(float f10) {
            return new AnimationVector1D(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f10) {
            return invoke(f10.floatValue());
        }
    }, new Function1<AnimationVector1D, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Float invoke(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(it.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new Function1<Integer, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        @NotNull
        public final AnimationVector1D invoke(int i10) {
            return new AnimationVector1D(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Integer num) {
            return invoke(num.intValue());
        }
    }, new Function1<AnimationVector1D, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf((int) it.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new Function1<Dp, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Dp dp) {
            return m149invoke0680j_4(dp.m3965unboximpl());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m149invoke0680j_4(float f10) {
            return new AnimationVector1D(f10);
        }
    }, new Function1<AnimationVector1D, Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Dp invoke(AnimationVector1D animationVector1D) {
            return Dp.m3949boximpl(m150invokeu2uoSUM(animationVector1D));
        }

        /* JADX INFO: renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m150invokeu2uoSUM(@NotNull AnimationVector1D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Dp.m3951constructorimpl(it.getValue());
        }
    });

    @NotNull
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new Function1<DpOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
            return m147invokejoFl9I(dpOffset.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m147invokejoFl9I(long j10) {
            return new AnimationVector2D(DpOffset.m4012getXD9Ej5fM(j10), DpOffset.m4014getYD9Ej5fM(j10));
        }
    }, new Function1<AnimationVector2D, DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
            return DpOffset.m4006boximpl(m148invokegVRvYmI(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m148invokegVRvYmI(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DpKt.m3972DpOffsetYgX7TsA(Dp.m3951constructorimpl(it.getV1()), Dp.m3951constructorimpl(it.getV2()));
        }
    });

    @NotNull
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new Function1<Size, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Size size) {
            return m157invokeuvyYCjk(size.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m157invokeuvyYCjk(long j10) {
            return new AnimationVector2D(Size.m1440getWidthimpl(j10), Size.m1437getHeightimpl(j10));
        }
    }, new Function1<AnimationVector2D, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Size invoke(AnimationVector2D animationVector2D) {
            return Size.m1428boximpl(m158invoke7Ah8Wj8(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m158invoke7Ah8Wj8(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SizeKt.Size(it.getV1(), it.getV2());
        }
    });

    @NotNull
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new Function1<Offset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m155invokek4lQ0M(offset.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m155invokek4lQ0M(long j10) {
            return new AnimationVector2D(Offset.m1371getXimpl(j10), Offset.m1372getYimpl(j10));
        }
    }, new Function1<AnimationVector2D, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m1360boximpl(m156invoketuRUvjQ(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m156invoketuRUvjQ(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OffsetKt.Offset(it.getV1(), it.getV2());
        }
    });

    @NotNull
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new Function1<IntOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
            return m151invokegyyYBs(intOffset.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m151invokegyyYBs(long j10) {
            return new AnimationVector2D(IntOffset.m4069getXimpl(j10), IntOffset.m4070getYimpl(j10));
        }
    }, new Function1<AnimationVector2D, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
            return IntOffset.m4060boximpl(m152invokeBjo55l4(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m152invokeBjo55l4(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IntOffsetKt.IntOffset(zf.a.d(it.getV1()), zf.a.d(it.getV2()));
        }
    });

    @NotNull
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new Function1<IntSize, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntSize intSize) {
            return m153invokeozmzZPI(intSize.getPackedValue());
        }

        @NotNull
        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m153invokeozmzZPI(long j10) {
            return new AnimationVector2D(IntSize.m4111getWidthimpl(j10), IntSize.m4110getHeightimpl(j10));
        }
    }, new Function1<AnimationVector2D, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
            return IntSize.m4103boximpl(m154invokeYEO4UFw(animationVector2D));
        }

        /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m154invokeYEO4UFw(@NotNull AnimationVector2D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IntSizeKt.IntSize(zf.a.d(it.getV1()), zf.a.d(it.getV2()));
        }
    });

    @NotNull
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new Function1<Rect, AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AnimationVector4D invoke(@NotNull Rect it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new AnimationVector4D(it.getLeft(), it.getTop(), it.getRight(), it.getBottom());
        }
    }, new Function1<AnimationVector4D, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Rect invoke(@NotNull AnimationVector4D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Rect(it.getV1(), it.getV2(), it.getV3(), it.getV4());
        }
    });

    @NotNull
    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        return new TwoWayConverterImpl(convertToVector, convertFromVector);
    }

    @NotNull
    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return FloatToVector;
    }

    public static final float lerp(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }

    @NotNull
    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@NotNull a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return IntToVector;
    }

    @NotNull
    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@NotNull Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return RectToVector;
    }

    @NotNull
    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(@NotNull Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DpToVector;
    }

    @NotNull
    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@NotNull DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DpOffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@NotNull Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return SizeToVector;
    }

    @NotNull
    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@NotNull IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntOffsetToVector;
    }

    @NotNull
    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@NotNull IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntSizeToVector;
    }
}
