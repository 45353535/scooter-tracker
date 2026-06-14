package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.properties.e;
import kotlin.ranges.g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u0013*\u00020$2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0013*\u00020$2\u0006\u0010%\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u0013*\u00020$2\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010\u000eJ\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u000eJ\u001f\u00100\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010\u0012J'\u00101\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u0012J'\u0010;\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010#J'\u0010<\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010#J/\u0010A\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR+\u0010W\u001a\u00020O2\u0006\u0010P\u001a\u00020O8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0014\u0010`\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0014\u0010b\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u001cR\u0014\u0010d\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010YR\u0014\u0010f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010Y¨\u0006g"}, d2 = {"Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gravity", "", "setForegroundGravity", "(I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "r", "b", "onLayout", "(ZIIII)V", "shouldDelayChildPressedState", "()Z", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/View;", "child", "measureChildWithDefinedSize", "(Landroid/view/View;II)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "exactWidth", "exactHeight", "matchDynamicSize", "(Lcom/yandex/div/internal/widget/DivLayoutParams;ZZ)Z", "matchDynamicWidth", "(Lcom/yandex/div/internal/widget/DivLayoutParams;Z)Z", "matchDynamicHeight", "childWidth", "updateMaxWidth", "childHeight", "updateMaxHeight", "considerMatchParentChildrenInMaxSize", "considerMatchParentMargins", "(Landroid/view/View;ZZ)V", "getDynamicWidth", "(I)I", "widthSize", "getDynamicHeight", "(III)I", "isDynamicAspect", "(I)Z", "remeasureWrapContentConstrainedChildren", "remeasureWrapContentConstrainedChild", "remeasureMatchParentChild", "left", "top", "right", "bottom", "layoutChildren", "(IIII)V", "Landroid/graphics/Rect;", "foregroundPadding", "Landroid/graphics/Rect;", "", "measuredMatchParentChildren", "Ljava/util/Set;", "skippedMatchParentChildren", "matchParentChildren", "maxWidth", "I", "maxHeight", "childState", "", "<set-?>", "aspectRatio$delegate", "Lkotlin/properties/e;", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getPaddingLeftWithForeground", "()I", "paddingLeftWithForeground", "getPaddingRightWithForeground", "paddingRightWithForeground", "getPaddingTopWithForeground", "paddingTopWithForeground", "getPaddingBottomWithForeground", "paddingBottomWithForeground", "getUseAspect", "useAspect", "getHorizontalPadding", "horizontalPadding", "getVerticalPadding", "verticalPadding", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FrameContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(FrameContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* JADX INFO: renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final e aspectRatio;
    private int childState;

    @NotNull
    private final Rect foregroundPadding;

    @NotNull
    private final Set<View> matchParentChildren;
    private int maxHeight;
    private int maxWidth;

    @NotNull
    private final Set<View> measuredMatchParentChildren;

    @NotNull
    private final Set<View> skippedMatchParentChildren;

    public /* synthetic */ FrameContainerLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void considerMatchParentChildrenInMaxSize(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        int i11;
        if (!this.matchParentChildren.isEmpty()) {
            boolean zIsExact = ViewsKt.isExact(widthMeasureSpec);
            boolean zIsExact2 = ViewsKt.isExact(heightMeasureSpec);
            if (!zIsExact || !zIsExact2) {
                boolean z10 = false;
                boolean z11 = !zIsExact && this.maxWidth == 0;
                if (!zIsExact2 && !getUseAspect() && this.maxHeight == 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    for (View view : this.matchParentChildren) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        if (this.skippedMatchParentChildren.contains(view) && ((((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1 && z11) || (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 && z10))) {
                            i10 = widthMeasureSpec;
                            i11 = heightMeasureSpec;
                            measureChildWithMargins(view, i10, 0, i11, 0);
                            this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                            this.skippedMatchParentChildren.remove(view);
                        } else {
                            i10 = widthMeasureSpec;
                            i11 = heightMeasureSpec;
                        }
                        if (z11) {
                            updateMaxWidth(view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                        }
                        if (z10) {
                            updateMaxHeight(view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                        }
                        widthMeasureSpec = i10;
                        heightMeasureSpec = i11;
                    }
                } else {
                    Iterator<T> it = this.matchParentChildren.iterator();
                    while (it.hasNext()) {
                        considerMatchParentMargins((View) it.next(), zIsExact, zIsExact2);
                    }
                }
            }
        }
    }

    private final void considerMatchParentMargins(View child, boolean exactWidth, boolean exactHeight) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (matchDynamicWidth(divLayoutParams, exactWidth)) {
            updateMaxWidth(child.getMinimumWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (matchDynamicHeight(divLayoutParams, exactHeight)) {
            updateMaxHeight(child.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final int getDynamicHeight(int widthMeasureSpec, int heightMeasureSpec, int widthSize) {
        if (ViewsKt.isExact(heightMeasureSpec)) {
            return 0;
        }
        if (isDynamicAspect(widthMeasureSpec)) {
            return zf.a.d(widthSize / getAspectRatio());
        }
        int iE = g.e(this.maxHeight + getVerticalPadding(), getSuggestedMinimumHeight());
        Drawable foreground = getForeground();
        return foreground != null ? g.e(iE, foreground.getMinimumHeight()) : iE;
    }

    private final int getDynamicWidth(int widthMeasureSpec) {
        if (ViewsKt.isExact(widthMeasureSpec)) {
            return 0;
        }
        int iE = g.e(this.maxWidth + getHorizontalPadding(), getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        return foreground != null ? g.e(iE, foreground.getMinimumWidth()) : iE;
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.foregroundPadding.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.foregroundPadding.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.foregroundPadding.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.foregroundPadding.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    private final boolean isDynamicAspect(int widthMeasureSpec) {
        return getUseAspect() && !ViewsKt.isExact(widthMeasureSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void layoutChildren(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getPaddingLeftWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingRightWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingTopWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingBottomWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r11) goto L92
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L8f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            com.yandex.div.internal.widget.DivLayoutParams r3 = (com.yandex.div.internal.widget.DivLayoutParams) r3
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            int r6 = r3.getGravity()
            int r7 = r9.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            int r7 = r3.getGravity()
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 & 7
            r8 = 1
            if (r6 == r8) goto L5e
            r8 = 5
            if (r6 == r8) goto L58
            int r6 = r3.leftMargin
        L56:
            int r6 = r6 + r0
            goto L6a
        L58:
            int r6 = r12 - r4
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            goto L6a
        L5e:
            int r6 = r12 - r0
            int r6 = r6 - r4
            int r8 = r3.leftMargin
            int r6 = r6 + r8
            int r8 = r3.rightMargin
            int r6 = r6 - r8
            int r6 = r6 / 2
            goto L56
        L6a:
            r8 = 16
            if (r7 == r8) goto L7d
            r8 = 80
            if (r7 == r8) goto L76
            int r3 = r3.topMargin
            int r3 = r3 + r10
            goto L8a
        L76:
            int r7 = r13 - r5
            int r3 = r3.bottomMargin
            int r3 = r7 - r3
            goto L8a
        L7d:
            int r7 = r13 - r10
            int r7 = r7 - r5
            int r8 = r3.topMargin
            int r7 = r7 + r8
            int r3 = r3.bottomMargin
            int r7 = r7 - r3
            int r7 = r7 / 2
            int r3 = r10 + r7
        L8a:
            int r4 = r4 + r6
            int r5 = r5 + r3
            r2.layout(r6, r3, r4, r5)
        L8f:
            int r1 = r1 + 1
            goto L19
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.FrameContainerLayout.layoutChildren(int, int, int, int):void");
    }

    private final boolean matchDynamicHeight(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1;
    }

    private final boolean matchDynamicSize(DivLayoutParams divLayoutParams, boolean z10, boolean z11) {
        return matchDynamicWidth(divLayoutParams, z10) || matchDynamicHeight(divLayoutParams, z11);
    }

    private final boolean matchDynamicWidth(DivLayoutParams divLayoutParams, boolean z10) {
        return !z10 && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
    }

    private final void measureChildWithDefinedSize(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean zIsExact = ViewsKt.isExact(widthMeasureSpec);
        boolean zIsExact2 = ViewsKt.isExact(heightMeasureSpec);
        boolean z10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1;
        int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        boolean z11 = i10 == -1;
        if (!(zIsExact && zIsExact2) && (!zIsExact2 ? !(!zIsExact ? !(z10 && i10 <= 0) : !z11) : !z10)) {
            if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
                this.skippedMatchParentChildren.add(child);
                return;
            }
            return;
        }
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        if (matchDynamicSize(divLayoutParams, zIsExact, zIsExact2)) {
            this.measuredMatchParentChildren.add(child);
        }
        if (!zIsExact && !z10) {
            updateMaxWidth(child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (zIsExact2 || z11 || getUseAspect()) {
            return;
        }
        updateMaxHeight(child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
    }

    private final void remeasureMatchParentChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int horizontalPadding = getHorizontalPadding() + divLayoutParams.getHorizontalMargins$div_release();
        int verticalPadding = getVerticalPadding() + divLayoutParams.getVerticalMargins$div_release();
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
            widthMeasureSpec = ViewsKt.makeExactSpec(getMeasuredWidth());
        }
        DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
        int childMeasureSpec = companion.getChildMeasureSpec(widthMeasureSpec, horizontalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth());
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
            heightMeasureSpec = ViewsKt.makeExactSpec(getMeasuredHeight());
        }
        child.measure(childMeasureSpec, companion.getChildMeasureSpec(heightMeasureSpec, verticalPadding, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        if (this.skippedMatchParentChildren.contains(child)) {
            this.childState = View.combineMeasuredStates(this.childState, child.getMeasuredState());
        }
    }

    private final void remeasureWrapContentConstrainedChild(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        if (((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height == -3) {
            measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
            this.matchParentChildren.remove(child);
        }
    }

    private final void remeasureWrapContentConstrainedChildren(int widthMeasureSpec, int heightMeasureSpec) {
        if (isDynamicAspect(widthMeasureSpec)) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    remeasureWrapContentConstrainedChild(childAt, widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
    }

    private final void updateMaxHeight(int childHeight) {
        this.maxHeight = Math.max(this.maxHeight, childHeight);
    }

    private final void updateMaxWidth(int childWidth) {
        this.maxWidth = Math.max(this.maxWidth, childWidth);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        layoutChildren(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.childState = 0;
        boolean zIsExact = ViewsKt.isExact(widthMeasureSpec);
        if (getUseAspect()) {
            heightMeasureSpec = !zIsExact ? View.MeasureSpec.makeMeasureSpec(0, 0) : ViewsKt.makeExactSpec(zf.a.d(View.MeasureSpec.getSize(widthMeasureSpec) / getAspectRatio()));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChildWithDefinedSize(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        CollectionsKt.addAll(this.matchParentChildren, this.measuredMatchParentChildren);
        CollectionsKt.addAll(this.matchParentChildren, this.skippedMatchParentChildren);
        considerMatchParentChildrenInMaxSize(widthMeasureSpec, heightMeasureSpec);
        int iResolveSizeAndState = View.resolveSizeAndState(getDynamicWidth(widthMeasureSpec), widthMeasureSpec, this.childState);
        int dynamicHeight = getDynamicHeight(widthMeasureSpec, heightMeasureSpec, 16777215 & iResolveSizeAndState);
        if (ViewsKt.isUnspecified(heightMeasureSpec)) {
            heightMeasureSpec = ViewsKt.makeExactSpec(dynamicHeight);
            remeasureWrapContentConstrainedChildren(widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(dynamicHeight, heightMeasureSpec, this.childState << 16));
        Iterator<T> it = this.matchParentChildren.iterator();
        while (it.hasNext()) {
            remeasureMatchParentChild((View) it.next(), widthMeasureSpec, heightMeasureSpec);
        }
        this.measuredMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
        this.matchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    @Override // android.view.View
    public void setForegroundGravity(int gravity) {
        if (getForegroundGravity() == gravity) {
            return;
        }
        super.setForegroundGravity(gravity);
        if (getForegroundGravity() != 119 || getForeground() == null) {
            this.foregroundPadding.setEmpty();
        } else {
            getForeground().getPadding(this.foregroundPadding);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public FrameContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.foregroundPadding = new Rect();
        this.measuredMatchParentChildren = new LinkedHashSet();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.matchParentChildren = new LinkedHashSet();
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
    }
}
