package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0082\u0001\u0083\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\u0010\u000eJ\b\u00107\u001a\u00020\u000bH\u0016J\u0010\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:H\u0014J\u0010\u0010;\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\u000bH\u0016J\b\u0010=\u001a\u00020\u001bH\u0016J\b\u0010>\u001a\u00020\u000bH\u0016J\u001d\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020AH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020FH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u001bH\u0016J%\u0010M\u001a\u00020F2\u0006\u0010N\u001a\u00020F2\u0006\u0010L\u001a\u00020\u001bH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020RH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ0\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020X2\u0006\u0010[\u001a\u00020XH\u0014J\b\u0010\\\u001a\u00020\u000bH\u0002J\u001d\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020_H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010TJ*\u0010a\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u001d\u0010b\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020AH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010CJ\b\u0010d\u001a\u00020\u000bH\u0016J°\u0001\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u00102\u0006\u0010i\u001a\u00020\u00102\u0006\u0010j\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\u00102\u0006\u0010o\u001a\u00020\u00102\u0006\u0010p\u001a\u00020)2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\u001b2\b\u0010t\u001a\u0004\u0018\u00010u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020~H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\t\u0010\u0081\u0001\u001a\u00020\u000bH\u0002R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010(\u001a\u00020)X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "value", "", "cameraDistancePx", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipBoundsCache", "Landroid/graphics/Rect;", "clipToBounds", "", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "drawnWithZ", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "layerId", "", "getLayerId", "()J", "mHasOverlappingRendering", "mTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "manualClipPath", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "destroy", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawLayer", "forceLayout", "hasOverlappingRendering", "invalidate", "inverseTransform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "inverseTransform-58bKbWc", "([F)V", "isInLayer", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "onLayout", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "r", "b", "resetClipBounds", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "updateDisplayList", "updateLayerProperties", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateOutlineResolver", com.taurusx.tax.f.y.f66058y, "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;

    @Nullable
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;

    @Nullable
    private static Method updateDisplayListIfDirtyMethod;

    @NotNull
    private final CanvasHolder canvasHolder;

    @Nullable
    private Rect clipBoundsCache;
    private boolean clipToBounds;

    @NotNull
    private final DrawChildContainer container;

    @Nullable
    private Function1<? super Canvas, Unit> drawBlock;
    private boolean drawnWithZ;

    @Nullable
    private Function0<Unit> invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;

    @NotNull
    private final LayerMatrixCache<View> matrixCache;

    @NotNull
    private final OutlineResolver outlineResolver;

    @NotNull
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Function2<View, Matrix, Unit> getMatrix = new Function2<View, Matrix, Unit>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            invoke2(view, matrix);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            matrix.set(view.getMatrix());
        }
    };

    @NotNull
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Outline outline2 = ((ViewLayer) view).outlineResolver.getOutline();
            Intrinsics.checkNotNull(outline2);
            outline.set(outline2);
        }
    };

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "getMatrix", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        @NotNull
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z10) {
            ViewLayer.shouldUseDispatchDraw = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }

        private Companion() {
        }
    }

    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {

        @NotNull
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        public static final long getUniqueDrawingId(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(@NotNull AndroidComposeView ownerView, @NotNull DrawChildContainer container, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.outlineResolver = new OutlineResolver(ownerView.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.INSTANCE.m1965getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        container.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getOutline() != null ? OutlineProvider : null);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z10 = true;
        }
        Function1<? super Canvas, Unit> function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z10) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.drawnWithZ = z10;
        if (z10) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo3240inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArrM3303calculateInverseMatrixbWbORWo = this.matrixCache.m3303calculateInverseMatrixbWbORWo(this);
        if (fArrM3303calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m1826timesAssign58bKbWc(matrix, fArrM3303calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo3241isInLayerk4lQ0M(long position) {
        float fM1371getXimpl = Offset.m1371getXimpl(position);
        float fM1372getYimpl = Offset.m1372getYimpl(position);
        if (this.clipToBounds) {
            return 0.0f <= fM1371getXimpl && fM1371getXimpl < ((float) getWidth()) && 0.0f <= fM1372getYimpl && fM1372getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m3326isInOutlinek4lQ0M(position);
        }
        return true;
    }

    /* JADX INFO: renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!inverse) {
            androidx.compose.ui.graphics.Matrix.m1817mapimpl(this.matrixCache.m3304calculateMatrixGrdbGEg(this), rect);
            return;
        }
        float[] fArrM3303calculateInverseMatrixbWbORWo = this.matrixCache.m3303calculateInverseMatrixbWbORWo(this);
        if (fArrM3303calculateInverseMatrixbWbORWo != null) {
            androidx.compose.ui.graphics.Matrix.m1817mapimpl(fArrM3303calculateInverseMatrixbWbORWo, rect);
        } else {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo3242mapOffset8S9VItk(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.Matrix.m1815mapMKHz9U(this.matrixCache.m3304calculateMatrixGrdbGEg(this), point);
        }
        float[] fArrM3303calculateInverseMatrixbWbORWo = this.matrixCache.m3303calculateInverseMatrixbWbORWo(this);
        return fArrM3303calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1815mapMKHz9U(fArrM3303calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m1385getInfiniteF1C5BW0();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo3243movegyyYBs(long position) {
        int iM4069getXimpl = IntOffset.m4069getXimpl(position);
        if (iM4069getXimpl != getLeft()) {
            offsetLeftAndRight(iM4069getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int iM4070getYimpl = IntOffset.m4070getYimpl(position);
        if (iM4070getYimpl != getTop()) {
            offsetTopAndBottom(iM4070getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo3244resizeozmzZPI(long size) {
        int iM4111getWidthimpl = IntSize.m4111getWidthimpl(size);
        int iM4110getHeightimpl = IntSize.m4110getHeightimpl(size);
        if (iM4111getWidthimpl == getWidth() && iM4110getHeightimpl == getHeight()) {
            return;
        }
        float f10 = iM4111getWidthimpl;
        setPivotX(TransformOrigin.m1960getPivotFractionXimpl(this.mTransformOrigin) * f10);
        float f11 = iM4110getHeightimpl;
        setPivotY(TransformOrigin.m1961getPivotFractionYimpl(this.mTransformOrigin) * f11);
        this.outlineResolver.m3327updateuvyYCjk(SizeKt.Size(f10, f11));
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + iM4111getWidthimpl, getTop() + iM4110getHeightimpl);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.INSTANCE.m1965getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo3245transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        androidx.compose.ui.graphics.Matrix.m1826timesAssign58bKbWc(matrix, this.matrixCache.m3304calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        setInvalidated(false);
        INSTANCE.updateDisplayList(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: updateLayerProperties-dDxr-wY */
    public void mo3246updateLayerPropertiesdDxrwY(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.mTransformOrigin = transformOrigin;
        setScaleX(scaleX);
        setScaleY(scaleY);
        setAlpha(alpha);
        setTranslationX(translationX);
        setTranslationY(translationY);
        setElevation(shadowElevation);
        setRotation(rotationZ);
        setRotationX(rotationX);
        setRotationY(rotationY);
        setPivotX(TransformOrigin.m1960getPivotFractionXimpl(this.mTransformOrigin) * getWidth());
        setPivotY(TransformOrigin.m1961getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        setCameraDistancePx(cameraDistance);
        boolean z10 = true;
        this.clipToBounds = clip && shape == RectangleShapeKt.getRectangleShape();
        resetClipBounds();
        boolean z11 = getManualClipPath() != null;
        setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        boolean zUpdate = this.outlineResolver.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        updateOutlineResolver();
        boolean z12 = getManualClipPath() != null;
        if (z11 != z12 || (z12 && zUpdate)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        this.matrixCache.invalidate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = ViewLayerVerificationHelper28.INSTANCE;
            viewLayerVerificationHelper28.setOutlineAmbientShadowColor(this, ColorKt.m1658toArgb8_81llA(ambientShadowColor));
            viewLayerVerificationHelper28.setOutlineSpotShadowColor(this, ColorKt.m1658toArgb8_81llA(spotShadowColor));
        }
        if (i10 >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, renderEffect);
        }
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.m1684equalsimpl0(compositingStrategy, companion.m1690getOffscreenNrFUSI())) {
            setLayerType(2, null);
        } else if (CompositingStrategy.m1684equalsimpl0(compositingStrategy, companion.m1689getModulateAlphaNrFUSI())) {
            setLayerType(0, null);
            z10 = false;
        } else {
            setLayerType(0, null);
        }
        this.mHasOverlappingRendering = z10;
    }
}
