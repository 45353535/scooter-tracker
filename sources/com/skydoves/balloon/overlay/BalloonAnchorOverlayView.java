package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.b;
import v5.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010$\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R;\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010%2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u00100\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R+\u00104\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010/R+\u0010;\u001a\u0002052\u0006\u0010\u001e\u001a\u0002058G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R/\u0010B\u001a\u0004\u0018\u00010<2\b\u0010\u001e\u001a\u0004\u0018\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010I\u001a\u00020C2\u0006\u0010\u001e\u001a\u00020C8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u001f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010V\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "()V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/Canvas;", "canvas", "a", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "getStatusBarHeight", "()I", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "<set-?>", "Lu5/b;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getAnchorViewList", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", "d", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getOverlayPaddingColor", "setOverlayPaddingColor", "overlayPaddingColor", "", InneractiveMediationDefs.GENDER_FEMALE, "getOverlayPadding", "()F", "setOverlayPadding", "(F)V", "overlayPadding", "Landroid/graphics/Point;", "g", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "Lv5/c;", "h", "getBalloonOverlayShape", "()Lv5/c;", "setBalloonOverlayShape", "(Lv5/c;)V", "balloonOverlayShape", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Paint;", "j", "Landroid/graphics/Paint;", "paint", CampaignEx.JSON_KEY_AD_K, "paddingColorPaint", CmcdData.Factory.STREAM_TYPE_LIVE, "Z", "invalidated", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BalloonAnchorOverlayView extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63643m = {v0.f(new g0(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0)), v0.f(new g0(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b anchorView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b anchorViewList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b overlayColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b overlayPaddingColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b overlayPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b overlayPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b balloonOverlayShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Bitmap bitmap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Paint paddingColorPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a(View view, Canvas canvas) {
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            RectF rectF = getOverlayPosition() != null ? new RectF(r1.x - getOverlayPadding(), (r1.y - getOverlayPadding()) + getStatusBarHeight(), r1.x + view.getWidth() + getOverlayPadding(), r1.y + view.getHeight() + getOverlayPadding() + getStatusBarHeight()) : new RectF(r0.left - getOverlayPadding(), r0.top - getOverlayPadding(), r0.right + getOverlayPadding(), r0.bottom + getOverlayPadding());
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            if (!(getBalloonOverlayShape() instanceof v5.b)) {
                throw new m();
            }
            canvas.drawOval(rectF, this.paint);
            canvas.drawOval(rectF2, this.paddingColorPaint);
        }
    }

    private final void b() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        View anchorView = getAnchorView();
        if (anchorView == null || anchorView.getWidth() != 0) {
            View anchorView2 = getAnchorView();
            if (anchorView2 == null || anchorView2.getHeight() != 0) {
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                this.bitmap = bitmapCreateBitmap;
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = this.paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                paint.setColor(getOverlayColor());
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
                Paint paint2 = this.paint;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                paint2.setColor(0);
                Paint paint3 = this.paddingColorPaint;
                paint3.setColor(getOverlayPaddingColor());
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(getOverlayPadding());
                List<View> anchorViewList = getAnchorViewList();
                if (anchorViewList == null || anchorViewList.isEmpty()) {
                    a(getAnchorView(), canvas);
                } else {
                    List<View> anchorViewList2 = getAnchorViewList();
                    if (anchorViewList2 != null) {
                        Iterator<T> it = anchorViewList2.iterator();
                        while (it.hasNext()) {
                            a((View) it.next(), canvas);
                        }
                    }
                }
                this.invalidated = false;
            }
        }
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.invalidated || (bitmap = this.bitmap) == null || (bitmap != null && bitmap.isRecycled())) {
            b();
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || bitmap2.isRecycled() || canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    @Nullable
    public final View getAnchorView() {
        return (View) this.anchorView.getValue(this, f63643m[0]);
    }

    @Nullable
    public final List<View> getAnchorViewList() {
        return (List) this.anchorViewList.getValue(this, f63643m[1]);
    }

    @NotNull
    public final c getBalloonOverlayShape() {
        return (c) this.balloonOverlayShape.getValue(this, f63643m[6]);
    }

    @ColorInt
    public final int getOverlayColor() {
        return ((Number) this.overlayColor.getValue(this, f63643m[2])).intValue();
    }

    @Px
    public final float getOverlayPadding() {
        return ((Number) this.overlayPadding.getValue(this, f63643m[4])).floatValue();
    }

    @ColorInt
    public final int getOverlayPaddingColor() {
        return ((Number) this.overlayPaddingColor.getValue(this, f63643m[3])).intValue();
    }

    @Nullable
    public final Point getOverlayPosition() {
        return (Point) this.overlayPosition.getValue(this, f63643m[5]);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.invalidated = true;
    }

    public final void setAnchorView(@Nullable View view) {
        this.anchorView.setValue(this, f63643m[0], view);
    }

    public final void setAnchorViewList(@Nullable List<? extends View> list) {
        this.anchorViewList.setValue(this, f63643m[1], list);
    }

    public final void setBalloonOverlayShape(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.balloonOverlayShape.setValue(this, f63643m[6], cVar);
    }

    public final void setOverlayColor(int i10) {
        this.overlayColor.setValue(this, f63643m[2], Integer.valueOf(i10));
    }

    public final void setOverlayPadding(float f10) {
        this.overlayPadding.setValue(this, f63643m[4], Float.valueOf(f10));
    }

    public final void setOverlayPaddingColor(int i10) {
        this.overlayPaddingColor.setValue(this, f63643m[3], Integer.valueOf(i10));
    }

    public final void setOverlayPosition(@Nullable Point point) {
        this.overlayPosition.setValue(this, f63643m[5], point);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.anchorView = u5.c.a(this, null);
        this.anchorViewList = u5.c.a(this, null);
        this.overlayColor = u5.c.a(this, 0);
        this.overlayPaddingColor = u5.c.a(this, 0);
        this.overlayPadding = u5.c.a(this, Float.valueOf(0.0f));
        this.overlayPosition = u5.c.a(this, null);
        this.balloonOverlayShape = u5.c.a(this, v5.b.f105760a);
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.paddingColorPaint = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }
}
