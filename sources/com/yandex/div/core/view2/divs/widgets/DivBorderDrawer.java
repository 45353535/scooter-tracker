package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.view.ViewCompat;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ShadowCache;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.BorderParams;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.ShadowParams;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientViewKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.List;
import k8.ar;
import k8.g9;
import k8.l7;
import k8.oa;
import k8.oo;
import k8.zl;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.g;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rf.c;
import y7.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 V2\u00020\u0001:\u0005WXVYZB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0010\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eJ\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0012J\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u00060+R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u00103\u001a\u00060.R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u00108\u001a\u000604R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010E\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010F\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR*\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010\u0016\"\u0004\bJ\u0010KR \u0010N\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006["}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/yandex/div/core/view2/Div2View;Landroid/view/View;)V", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "bindBorder", "(Lk8/l7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "observeBorder", "applyBorder", "invalidatePaths", "()V", "invalidateOutline", "", "shouldUseCanvasClipping", "()Z", "shouldUseNinePatchShadows", "setBorder", "", "width", "height", "onBoundsChanged", "(II)V", "invalidateBorder", "Landroid/graphics/Canvas;", "canvas", "clipCorners", "(Landroid/graphics/Canvas;)V", "drawBorder", "drawShadow", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/view/View;", "<set-?>", "Lk8/l7;", "getBorder", "()Lk8/l7;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ClipParams;", "clipParams", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ClipParams;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$BorderParams;", "borderParams$delegate", "Lkotlin/Lazy;", "getBorderParams", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$BorderParams;", "borderParams", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ShadowParams;", "shadowParams$delegate", "getShadowParams", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ShadowParams;", "shadowParams", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$RoundedRectOutlineProvider;", "outlineProvider", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$RoundedRectOutlineProvider;", "", "strokeWidth", "F", "", "cornerRadii", "[F", "hasDifferentCornerRadii", "Z", "hasBorder", "hasCustomShadow", "hasShadow", "value", "needClipping", "getNeedClipping", "setNeedClipping", "(Z)V", "", "Lcom/yandex/div/core/Disposable;", BillingClient.FeatureType.SUBSCRIPTIONS, "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", y.f66058y, "BorderParams", "ClipParams", "RoundedRectOutlineProvider", "ShadowParams", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivBorderDrawer implements ExpressionSubscriber {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private l7 border;

    @Nullable
    private float[] cornerRadii;

    @NotNull
    private final Div2View divView;
    private boolean hasBorder;
    private boolean hasCustomShadow;
    private boolean hasDifferentCornerRadii;
    private boolean hasShadow;
    private float strokeWidth;

    @NotNull
    private final View view;

    @NotNull
    private final ClipParams clipParams = new ClipParams();

    /* JADX INFO: renamed from: borderParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borderParams = i.a(new Function0<BorderParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$borderParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DivBorderDrawer.BorderParams invoke() {
            return this.this$0.new BorderParams();
        }
    });

    /* JADX INFO: renamed from: shadowParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shadowParams = i.a(new Function0<ShadowParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$shadowParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DivBorderDrawer.ShadowParams invoke() {
            return this.this$0.new ShadowParams();
        }
    });

    @NotNull
    private final RoundedRectOutlineProvider outlineProvider = new RoundedRectOutlineProvider(0.0f, 1, null);
    private boolean needClipping = true;

    @NotNull
    private final List<Disposable> subscriptions = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$BorderParams;", "", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;)V", "", "width", "height", "", "radii", "calculatePerimeter", "(FF[F)F", "perimeter", "Landroid/graphics/DashPathEffect;", "createDashPathEffect", "(F)Landroid/graphics/DashPathEffect;", "strokeWidth", "", "borderColor", "", "setPaintParams", "(FI)V", "invalidate", "([F)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "", "isDashed", "Z", "()Z", "setDashed", "(Z)V", "halfDp", "F", "defaultDashWidth", "defaultGapWidth", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "getStrokeOffset", "()F", "strokeOffset", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class BorderParams {
        private final float defaultDashWidth;
        private final float defaultGapWidth;
        private final float halfDp;
        private boolean isDashed;

        @NotNull
        private final Paint paint;

        @NotNull
        private final Path path;

        @NotNull
        private final RectF rect;

        public BorderParams() {
            Paint paint = new Paint();
            this.paint = paint;
            this.path = new Path();
            this.halfDp = BaseDivViewExtensionsKt.dpToPxF(Double.valueOf(0.5d), DivBorderDrawer.this.getDisplayMetrics());
            this.defaultDashWidth = BaseDivViewExtensionsKt.dpToPxF(6, DivBorderDrawer.this.getDisplayMetrics());
            this.defaultGapWidth = BaseDivViewExtensionsKt.dpToPxF(2, DivBorderDrawer.this.getDisplayMetrics());
            this.rect = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }

        private final float calculatePerimeter(float width, float height, float[] radii) {
            float f10 = 2;
            float fSqrt = (width * f10) + (f10 * height);
            if (radii.length != 8) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivBorderDrawer", "Wrong corner radii count " + radii.length + ". Expected 8");
                }
                return fSqrt;
            }
            int i10 = 0;
            int iC = c.c(0, radii.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    float f11 = radii[i10];
                    float f12 = radii[i10 + 1];
                    fSqrt = ((fSqrt - f11) - f12) + ((float) (Math.sqrt(((double) ((f11 * f11) + (f12 * f12))) / 8.0d) * 3.141592653589793d));
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return g.d(fSqrt, 0.0f);
        }

        private final DashPathEffect createDashPathEffect(float perimeter) {
            float f10;
            float f11;
            if (perimeter > 0.0f) {
                float f12 = this.defaultDashWidth;
                float f13 = this.defaultGapWidth;
                float f14 = f12 + f13;
                float f15 = (int) (perimeter / f14);
                float f16 = perimeter - (f14 * f15);
                f10 = f12 + (((f16 * f12) / f14) / f15);
                f11 = f13 + (((f16 * f13) / f14) / f15);
            } else {
                f10 = this.defaultDashWidth;
                f11 = this.defaultGapWidth;
            }
            return new DashPathEffect(new float[]{f10, f11}, 0.0f);
        }

        private final float getStrokeOffset() {
            return Math.min(this.halfDp, Math.max(1.0f, DivBorderDrawer.this.strokeWidth * 0.1f));
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final void invalidate(@NotNull float[] radii) {
            float strokeOffset = (DivBorderDrawer.this.strokeWidth - getStrokeOffset()) / 2.0f;
            this.rect.set(strokeOffset, strokeOffset, DivBorderDrawer.this.view.getWidth() - strokeOffset, DivBorderDrawer.this.view.getHeight() - strokeOffset);
            this.path.reset();
            this.path.addRoundRect(this.rect, radii, Path.Direction.CW);
            this.path.close();
            this.paint.setPathEffect(this.isDashed ? createDashPathEffect(calculatePerimeter(this.rect.width(), this.rect.height(), radii)) : null);
        }

        public final void setDashed(boolean z10) {
            this.isDashed = z10;
        }

        public final void setPaintParams(float strokeWidth, int borderColor) {
            this.paint.setStrokeWidth(strokeWidth + getStrokeOffset());
            this.paint.setColor(borderColor);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ClipParams;", "", "(Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;)V", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "invalidatePath", "", "radii", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ClipParams {

        @NotNull
        private final Path path = new Path();

        @NotNull
        private final RectF rect = new RectF();

        public ClipParams() {
        }

        @NotNull
        public final Path getPath() {
            return this.path;
        }

        public final void invalidatePath(@Nullable float[] radii) {
            this.rect.set(0.0f, 0.0f, DivBorderDrawer.this.view.getWidth(), DivBorderDrawer.this.view.getHeight());
            this.path.reset();
            if (radii != null) {
                this.path.addRoundRect(this.rect, (float[]) radii.clone(), Path.Direction.CW);
                this.path.close();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$Companion;", "", "()V", "DEFAULT_CORNER_RADIUS", "", "DEFAULT_DX", "DEFAULT_DY", "DEFAULT_SHADOW_ALPHA", "DEFAULT_SHADOW_COLOR", "", "DEFAULT_STROKE_WIDTH", "NO_ELEVATION", "clampCornerRadius", "cornerRadius", "width", "height", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float clampCornerRadius(float cornerRadius, float width, float height) {
            if (height <= 0.0f || width <= 0.0f) {
                return 0.0f;
            }
            float fMin = Math.min(height, width) / 2;
            if (cornerRadius > fMin) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.WARNING)) {
                    kLog.print(5, "DivBorderDrawer", "Corner radius " + cornerRadius + " is greater than half of the smallest side " + fMin);
                }
            }
            return Math.min(cornerRadius, fMin);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$RoundedRectOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", "cornerRadius", "<init>", "(F)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "F", "getCornerRadius", "()F", "setCornerRadius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
        private float cornerRadius;

        public /* synthetic */ RoundedRectOutlineProvider(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0f : f10);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DivBorderDrawer.INSTANCE.clampCornerRadius(this.cornerRadius, view.getWidth(), view.getHeight()));
        }

        public final void setCornerRadius(float f10) {
            this.cornerRadius = f10;
        }

        public RoundedRectOutlineProvider(float f10) {
            this.cornerRadius = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,¨\u00060"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer$ShadowParams;", "", "<init>", "(Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;)V", "Lk8/oo;", "shadow", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "set", "(Lk8/oo;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "radii", "invalidateShadow", "([F)V", "", "defaultRadius", "F", "radius", "", "color", "I", "alpha", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "Landroid/graphics/NinePatch;", "cachedShadow", "Landroid/graphics/NinePatch;", "getCachedShadow", "()Landroid/graphics/NinePatch;", "setCachedShadow", "(Landroid/graphics/NinePatch;)V", "offsetX", "getOffsetX", "()F", "setOffsetX", "(F)V", "offsetY", "getOffsetY", "setOffsetY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class ShadowParams {
        private float alpha;

        @Nullable
        private NinePatch cachedShadow;
        private int color;
        private final float defaultRadius;
        private float offsetX;
        private float offsetY;

        @NotNull
        private final Paint paint;
        private float radius;

        @NotNull
        private final Rect rect;

        public ShadowParams() {
            float dimension = DivBorderDrawer.this.view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            this.defaultRadius = dimension;
            this.radius = dimension;
            this.color = ViewCompat.MEASURED_STATE_MASK;
            this.alpha = 0.14f;
            this.paint = new Paint();
            this.rect = new Rect();
            this.offsetY = 0.5f;
        }

        @Nullable
        public final NinePatch getCachedShadow() {
            return this.cachedShadow;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @NotNull
        public final Rect getRect() {
            return this.rect;
        }

        public final void invalidateShadow(@NotNull float[] radii) {
            float f10 = 2;
            this.rect.set(0, 0, (int) (DivBorderDrawer.this.view.getWidth() + (this.radius * f10)), (int) (DivBorderDrawer.this.view.getHeight() + (this.radius * f10)));
            this.paint.setColor(this.color);
            this.paint.setAlpha((int) (this.alpha * DivBorderDrawer.this.view.getAlpha() * 255));
            this.cachedShadow = ShadowCache.INSTANCE.getShadow(radii, this.radius, DivBorderDrawer.this.divView.getDiv2Component().getBitmapEffectHelper());
        }

        public final void set(@Nullable oo shadow, @NotNull ExpressionResolver resolver) {
            zl zlVar;
            oa oaVar;
            zl zlVar2;
            oa oaVar2;
            Expression expression;
            Expression expression2;
            Expression expression3;
            this.radius = (shadow == null || (expression3 = shadow.f90234b) == null) ? this.defaultRadius : BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(((Number) expression3.evaluate(resolver)).longValue()), DivBorderDrawer.this.getDisplayMetrics());
            this.color = (shadow == null || (expression2 = shadow.f90235c) == null) ? ViewCompat.MEASURED_STATE_MASK : ((Number) expression2.evaluate(resolver)).intValue();
            this.alpha = (shadow == null || (expression = shadow.f90233a) == null) ? 0.14f : (float) ((Number) expression.evaluate(resolver)).doubleValue();
            this.offsetX = ((shadow == null || (zlVar2 = shadow.f90236d) == null || (oaVar2 = zlVar2.f92958a) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.0f), r0) : BaseDivViewExtensionsKt.toPx(oaVar2, r0, resolver)) - this.radius;
            this.offsetY = ((shadow == null || (zlVar = shadow.f90236d) == null || (oaVar = zlVar.f92959b) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.5f), r0) : BaseDivViewExtensionsKt.toPx(oaVar, r0, resolver)) - this.radius;
        }
    }

    public DivBorderDrawer(@NotNull Div2View div2View, @NotNull View view) {
        this.divView = div2View;
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void applyBorder(k8.l7 r11, com.yandex.div.json.expressions.ExpressionResolver r12) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.applyBorder(k8.l7, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void bindBorder(l7 border, ExpressionResolver resolver) {
        applyBorder(border, resolver);
        observeBorder(border, resolver);
    }

    private final BorderParams getBorderParams() {
        return (BorderParams) this.borderParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayMetrics getDisplayMetrics() {
        return this.view.getResources().getDisplayMetrics();
    }

    private final ShadowParams getShadowParams() {
        return (ShadowParams) this.shadowParams.getValue();
    }

    private final void invalidateOutline() {
        if (shouldUseCanvasClipping()) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
            return;
        }
        float[] fArr = this.cornerRadii;
        float fFirst = fArr != null ? ArraysKt.first(fArr) : 0.0f;
        if (fFirst == 0.0f) {
            this.view.setClipToOutline(false);
            this.view.setOutlineProvider(shouldUseNinePatchShadows() ? null : ViewOutlineProvider.BACKGROUND);
        } else {
            this.outlineProvider.setCornerRadius(fFirst);
            this.view.setOutlineProvider(this.outlineProvider);
            this.view.setClipToOutline(this.needClipping);
        }
    }

    private final void invalidatePaths() {
        float[] fArr;
        float[] fArr2 = this.cornerRadii;
        if (fArr2 == null || (fArr = (float[]) fArr2.clone()) == null) {
            return;
        }
        this.clipParams.invalidatePath(fArr);
        float f10 = this.strokeWidth / 2.0f;
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, fArr[i10] - f10);
        }
        if (this.hasBorder) {
            getBorderParams().invalidate(fArr);
        }
        if (this.hasCustomShadow) {
            getShadowParams().invalidateShadow(fArr);
        }
    }

    private final void observeBorder(final l7 border, final ExpressionResolver resolver) {
        zl zlVar;
        oa oaVar;
        Expression expression;
        zl zlVar2;
        oa oaVar2;
        Expression expression2;
        zl zlVar3;
        oa oaVar3;
        Expression expression3;
        zl zlVar4;
        oa oaVar4;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        Expression expression13;
        Expression expression14;
        if (border == null || DivDataExtensionsKt.isConstant(border)) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$observeBorder$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyBorder(border, resolver);
                this.this$0.view.invalidate();
            }
        };
        Expression expression15 = border.f88755a;
        Disposable disposableObserve = null;
        addSubscription(expression15 != null ? expression15.observe(resolver, function1) : null);
        g9 g9Var = border.f88756b;
        addSubscription((g9Var == null || (expression14 = g9Var.f87782c) == null) ? null : expression14.observe(resolver, function1));
        g9 g9Var2 = border.f88756b;
        addSubscription((g9Var2 == null || (expression13 = g9Var2.f87783d) == null) ? null : expression13.observe(resolver, function1));
        g9 g9Var3 = border.f88756b;
        addSubscription((g9Var3 == null || (expression12 = g9Var3.f87781b) == null) ? null : expression12.observe(resolver, function1));
        g9 g9Var4 = border.f88756b;
        addSubscription((g9Var4 == null || (expression11 = g9Var4.f87780a) == null) ? null : expression11.observe(resolver, function1));
        addSubscription(border.f88757c.observe(resolver, function1));
        ar arVar = border.f88759e;
        addSubscription((arVar == null || (expression10 = arVar.f86313a) == null) ? null : expression10.observe(resolver, function1));
        ar arVar2 = border.f88759e;
        addSubscription((arVar2 == null || (expression9 = arVar2.f86316d) == null) ? null : expression9.observe(resolver, function1));
        ar arVar3 = border.f88759e;
        addSubscription((arVar3 == null || (expression8 = arVar3.f86315c) == null) ? null : expression8.observe(resolver, function1));
        oo ooVar = border.f88758d;
        addSubscription((ooVar == null || (expression7 = ooVar.f90233a) == null) ? null : expression7.observe(resolver, function1));
        oo ooVar2 = border.f88758d;
        addSubscription((ooVar2 == null || (expression6 = ooVar2.f90234b) == null) ? null : expression6.observe(resolver, function1));
        oo ooVar3 = border.f88758d;
        addSubscription((ooVar3 == null || (expression5 = ooVar3.f90235c) == null) ? null : expression5.observe(resolver, function1));
        oo ooVar4 = border.f88758d;
        addSubscription((ooVar4 == null || (zlVar4 = ooVar4.f90236d) == null || (oaVar4 = zlVar4.f92958a) == null || (expression4 = oaVar4.f90179a) == null) ? null : expression4.observe(resolver, function1));
        oo ooVar5 = border.f88758d;
        addSubscription((ooVar5 == null || (zlVar3 = ooVar5.f90236d) == null || (oaVar3 = zlVar3.f92958a) == null || (expression3 = oaVar3.f90180b) == null) ? null : expression3.observe(resolver, function1));
        oo ooVar6 = border.f88758d;
        addSubscription((ooVar6 == null || (zlVar2 = ooVar6.f90236d) == null || (oaVar2 = zlVar2.f92959b) == null || (expression2 = oaVar2.f90179a) == null) ? null : expression2.observe(resolver, function1));
        oo ooVar7 = border.f88758d;
        if (ooVar7 != null && (zlVar = ooVar7.f90236d) != null && (oaVar = zlVar.f92959b) != null && (expression = oaVar.f90180b) != null) {
            disposableObserve = expression.observe(resolver, function1);
        }
        addSubscription(disposableObserve);
    }

    private final boolean shouldUseCanvasClipping() {
        if (!this.needClipping) {
            return false;
        }
        if (this.divView.getForceCanvasClipping() || this.hasCustomShadow) {
            return true;
        }
        return (!this.hasShadow && (this.hasDifferentCornerRadii || this.hasBorder)) || TransientViewKt.isInTransientHierarchy(this.view);
    }

    private final boolean shouldUseNinePatchShadows() {
        return this.hasCustomShadow || TransientViewKt.isInTransientHierarchy(this.view);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        a.a(this, disposable);
    }

    public final void clipCorners(@NotNull Canvas canvas) {
        if (shouldUseCanvasClipping()) {
            canvas.clipPath(this.clipParams.getPath());
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        a.b(this);
    }

    public final void drawBorder(@NotNull Canvas canvas) {
        if (this.hasBorder) {
            canvas.drawPath(getBorderParams().getPath(), getBorderParams().getPaint());
        }
    }

    public final void drawShadow(@NotNull Canvas canvas) {
        if ((!TransientViewKt.isInTransientHierarchy(this.view) || TransientViewKt.isInTransientHierarchy(this.view.getParent())) && this.hasCustomShadow) {
            float offsetX = getShadowParams().getOffsetX();
            float offsetY = getShadowParams().getOffsetY();
            int iSave = canvas.save();
            canvas.translate(offsetX, offsetY);
            try {
                NinePatch cachedShadow = getShadowParams().getCachedShadow();
                if (cachedShadow != null) {
                    cachedShadow.draw(canvas, getShadowParams().getRect(), getShadowParams().getPaint());
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void invalidateBorder() {
        invalidatePaths();
        invalidateOutline();
    }

    public final void onBoundsChanged(int width, int height) {
        invalidateBorder();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        a.c(this);
    }

    public final void setBorder(@Nullable l7 border, @NotNull ExpressionResolver resolver) {
        if (DivDataExtensionsKt.equalsToConstant(border, this.border)) {
            return;
        }
        release();
        this.border = border;
        bindBorder(border, resolver);
    }

    public final void setNeedClipping(boolean z10) {
        if (this.needClipping == z10) {
            return;
        }
        this.needClipping = z10;
        invalidateOutline();
        this.view.invalidate();
    }
}
