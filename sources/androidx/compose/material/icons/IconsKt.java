package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aO\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\b8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "name", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "block", "Landroidx/compose/ui/graphics/vector/ImageVector;", "materialIcon", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector;", "", "fillAlpha", "strokeAlpha", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "pathBuilder", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "materialPath", "MaterialIconDimension", "F", "getMaterialIconDimension$annotations", "()V", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    @NotNull
    public static final ImageVector materialIcon(@NotNull String name, @NotNull Function1<? super ImageVector.Builder, ImageVector.Builder> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(new ImageVector.Builder(name, Dp.m3951constructorimpl(24.0f), Dp.m3951constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null)).build();
    }

    @NotNull
    /* JADX INFO: renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1193materialPathYwgOQQI(@NotNull ImageVector.Builder materialPath, float f10, float f11, int i10, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        Intrinsics.checkNotNullParameter(materialPath, "$this$materialPath");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1630getBlack0d7_KjU(), null);
        int iM1927getButtKaPHkGw = StrokeCap.INSTANCE.m1927getButtKaPHkGw();
        int iM1937getBevelLxFBmk8 = StrokeJoin.INSTANCE.m1937getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2145addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), i10, "", solidColor, f10, null, f11, 1.0f, iM1927getButtKaPHkGw, iM1937getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1194materialPathYwgOQQI$default(ImageVector.Builder materialPath, float f10, float f11, int i10, Function1 pathBuilder, int i11, Object obj) {
        float f12 = (i11 & 1) != 0 ? 1.0f : f10;
        float f13 = (i11 & 2) != 0 ? 1.0f : f11;
        int defaultFillType = (i11 & 4) != 0 ? VectorKt.getDefaultFillType() : i10;
        Intrinsics.checkNotNullParameter(materialPath, "$this$materialPath");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1630getBlack0d7_KjU(), null);
        int iM1927getButtKaPHkGw = StrokeCap.INSTANCE.m1927getButtKaPHkGw();
        int iM1937getBevelLxFBmk8 = StrokeJoin.INSTANCE.m1937getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2145addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), defaultFillType, "", solidColor, f12, null, f13, 1.0f, iM1927getButtKaPHkGw, iM1937getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
