package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010\"\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\r\"\u0014\u0010\u001c\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010\"\u0014\u0010\u001d\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\"\u0014\u0010\u001e\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010\"\u0014\u0010\u001f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010\"\u0014\u0010 \u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0010\"\u001a\u0010\"\u001a\u00020!8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u001a\u0010'\u001a\u00020&8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%\"\u001a\u0010*\u001a\u00020)8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u001a\u0010-\u001a\u00020,8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u001a\u00102\u001a\u0002018\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "pathStr", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "EmptyPath", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultStrokeLineCap", "I", "getDefaultStrokeLineCap", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultStrokeLineJoin", "getDefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "DefaultTintBlendMode", "getDefaultTintBlendMode", "Landroidx/compose/ui/graphics/Color;", "DefaultTintColor", "J", "getDefaultTintColor", "()J", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "getDefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VectorKt {

    @NotNull
    public static final String DefaultGroupName = "";

    @NotNull
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    @NotNull
    private static final List<PathNode> EmptyPath = CollectionsKt.emptyList();
    private static final int DefaultStrokeLineCap = StrokeCap.INSTANCE.m1927getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.INSTANCE.m1938getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.INSTANCE.m1552getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.INSTANCE.m1639getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.INSTANCE.m1858getNonZeroRgk1Os();

    @NotNull
    public static final List<PathNode> PathData(@NotNull Function1<? super PathBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PathBuilder pathBuilder = new PathBuilder();
        block.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @NotNull
    public static final List<PathNode> addPathNodes(@Nullable String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    @NotNull
    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }
}
