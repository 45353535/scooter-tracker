package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008b\u0001\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a1\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010%*\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'2\u0006\u0010(\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010+\u001a)\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010%*\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'H\u0002¢\u0006\u0004\b,\u0010-\u001a)\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010%*\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'H\u0002¢\u0006\u0004\b.\u0010-\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "Landroidx/compose/ui/graphics/Brush;", Reporting.EventType.FILL, "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", Constants.PUSH, "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "pop", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "peek", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends PathNode> clipPathData, @NotNull Function1<? super ImageVector.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f10, f11, f12, f13, f14, f15, f16, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, Function1 block, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        String name = str;
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        float f17 = (i10 & 4) != 0 ? 0.0f : f11;
        float f18 = (i10 & 8) != 0 ? 0.0f : f12;
        float f19 = (i10 & 16) != 0 ? 1.0f : f13;
        float f20 = (i10 & 32) != 0 ? 1.0f : f14;
        float f21 = (i10 & 64) != 0 ? 0.0f : f15;
        float f22 = (i10 & 128) != 0 ? 0.0f : f16;
        List clipPathData = (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f10, f17, f18, f19, f20, f21, f22, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m2147pathR_LF3I(@NotNull ImageVector.Builder path, @NotNull String name, @Nullable Brush brush, float f10, @Nullable Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2145addPathoIyEayM$default(path, pathBuilder2.getNodes(), i12, name, brush, f10, brush2, f11, f12, i10, i11, f13, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m2148pathR_LF3I$default(ImageVector.Builder path, String str, Brush brush, float f10, Brush brush2, float f11, float f12, int i10, int i11, float f13, int i12, Function1 pathBuilder, int i13, Object obj) {
        String name = (i13 & 1) != 0 ? "" : str;
        Brush brush3 = (i13 & 2) != 0 ? null : brush;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        Brush brush4 = (i13 & 8) != 0 ? null : brush2;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int defaultStrokeLineCap = (i13 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i10;
        int defaultStrokeLineJoin = (i13 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int defaultFillType = (i13 & 512) != 0 ? VectorKt.getDefaultFillType() : i12;
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2145addPathoIyEayM$default(path, pathBuilder2.getNodes(), defaultFillType, name, brush3, f14, brush4, f15, f16, defaultStrokeLineCap, defaultStrokeLineJoin, f17, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }
}
