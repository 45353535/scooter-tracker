package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import lf.i;
import lf.m;
import org.jetbrains.annotations.NotNull;
import zf.a;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001c\u0010$\"\u0004\b%\u0010&R4\u0010,\u001a\u00020(2\u0006\u0010!\u001a\u00020(8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010)\"\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u001d\u00103\u001a\u00020(8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b2\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "b", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroidx/compose/runtime/MutableState;", "()I", "d", "(I)V", "drawInvalidateTick", "Landroidx/compose/ui/geometry/Size;", "()J", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "Lkotlin/Lazy;", "a", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DrawablePainter extends Painter implements RememberObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MutableState drawInvalidateTick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableState drawableIntrinsicSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy callback;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.drawableIntrinsicSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1428boximpl(DrawablePainterKt.a(drawable)), null, 2, null);
        this.callback = i.a(new Function0<DrawablePainter$callback$2.AnonymousClass1>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                final DrawablePainter drawablePainter = this.f24096f;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
                    @Override // android.graphics.drawable.Drawable.Callback
                    public void invalidateDrawable(@NotNull Drawable d10) {
                        Intrinsics.checkNotNullParameter(d10, "d");
                        DrawablePainter drawablePainter2 = drawablePainter;
                        drawablePainter2.d(drawablePainter2.b() + 1);
                        DrawablePainter drawablePainter3 = drawablePainter;
                        drawablePainter3.e(DrawablePainterKt.a(drawablePainter3.getDrawable()));
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void scheduleDrawable(@NotNull Drawable d10, @NotNull Runnable what, long time) {
                        Intrinsics.checkNotNullParameter(d10, "d");
                        Intrinsics.checkNotNullParameter(what, "what");
                        DrawablePainterKt.b().postAtTime(what, time);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void unscheduleDrawable(@NotNull Drawable d10, @NotNull Runnable what) {
                        Intrinsics.checkNotNullParameter(d10, "d");
                        Intrinsics.checkNotNullParameter(what, "what");
                        DrawablePainterKt.b().removeCallbacks(what);
                    }
                };
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback a() {
        return (Drawable.Callback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int b() {
        return ((Number) this.drawInvalidateTick.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long c() {
        return ((Size) this.drawableIntrinsicSize.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i10) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(long j10) {
        this.drawableIntrinsicSize.setValue(Size.m1428boximpl(j10));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.drawable.setAlpha(g.n(a.d(alpha * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new m();
        }
        return drawable.setLayoutDirection(i11);
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return c();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        b();
        this.drawable.setBounds(0, 0, a.d(Size.m1440getWidthimpl(drawScope.mo2040getSizeNHjbRc())), a.d(Size.m1437getHeightimpl(drawScope.mo2040getSizeNHjbRc())));
        try {
            canvas.save();
            this.drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.drawable.setCallback(a());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
