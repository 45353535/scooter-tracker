package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 +2\u00020\u0001:\u0002+,B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0004J0\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020%H\u0014J\u0012\u0010'\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%H\u0014J \u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J0\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014R*\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/view/ViewGroup;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "gravity", "getGravity$annotations", "()V", "getGravity", "()I", "setGravity", "(I)V", "horizontalGravity", "getHorizontalGravity$div_release", "horizontalPaddings", "getHorizontalPaddings$div_release", "verticalGravity", "getVerticalGravity$div_release", "verticalPaddings", "getVerticalPaddings$div_release", "baseMeasureChild", "", "child", "Landroid/view/View;", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "baseMeasureChildWithMargins", "widthUsed", "heightUsed", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "generateLayoutParams", "lp", "measureChild", "measureChildWithMargins", y.f66058y, "OffsetsHolder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int gravity;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$Companion;", "", "<init>", "()V", "", "parentMeasureSpec", "padding", "childDimension", "minSize", "maxSize", "getChildMeasureSpec", "(IIIII)I", "toHorizontalGravity", "(I)I", "toVerticalGravity", "", "freeSpace", "childCount", "getSpaceAroundPart$div_release", "(FI)F", "getSpaceAroundPart", "getSpaceBetweenPart$div_release", "getSpaceBetweenPart", "getSpaceEvenlyPart$div_release", "getSpaceEvenlyPart", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r10 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int getChildMeasureSpec(int r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r8)
                int r8 = android.view.View.MeasureSpec.getSize(r8)
                int r8 = r8 - r9
                r9 = 0
                int r8 = java.lang.Math.max(r9, r8)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 2147483647(0x7fffffff, float:NaN)
                r5 = 1073741824(0x40000000, float:2.0)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r6) goto L4a
                if (r0 == 0) goto L44
                if (r0 == r5) goto L1f
                goto L6a
            L1f:
                if (r10 < 0) goto L25
                if (r10 > r4) goto L25
            L23:
                r9 = r5
                goto L6b
            L25:
                if (r10 != r3) goto L30
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L23
            L30:
                if (r10 != r2) goto L39
                if (r12 != r4) goto L36
            L34:
                r10 = r8
                goto L6b
            L36:
                r10 = r12
            L37:
                r9 = r6
                goto L6b
            L39:
                if (r10 != r1) goto L6a
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L37
            L44:
                if (r10 < 0) goto L47
                goto L23
            L47:
                if (r12 != r4) goto L36
                goto L34
            L4a:
                if (r10 < 0) goto L4f
                if (r10 > r4) goto L4f
                goto L23
            L4f:
                if (r10 != r3) goto L5a
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L37
            L5a:
                if (r10 != r2) goto L5f
                if (r12 != r4) goto L36
                goto L34
            L5f:
                if (r10 != r1) goto L6a
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L37
            L6a:
                r10 = r9
            L6b:
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.DivViewGroup.Companion.getChildMeasureSpec(int, int, int, int, int):int");
        }

        public final float getSpaceAroundPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount * 2);
        }

        public final float getSpaceBetweenPart$div_release(float freeSpace, int childCount) {
            if (childCount == 1) {
                return 0.0f;
            }
            return freeSpace / (childCount - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i10) {
            return i10 & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i10) {
            return i10 & 1879048304;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    protected final void baseMeasureChild(@NotNull View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    protected final void baseMeasureChildWithMargins(@NotNull View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams p10) {
        return p10 instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attrs) {
        return new DivLayoutParams(getContext(), attrs);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        return INSTANCE.toHorizontalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalGravity$div_release() {
        return INSTANCE.toVerticalGravity(this.gravity);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@NotNull View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = INSTANCE;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(@NotNull View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = INSTANCE;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + widthUsed, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + heightUsed, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i10) {
        if (this.gravity == i10) {
            return;
        }
        Companion companion = INSTANCE;
        if (companion.toHorizontalGravity(i10) == 0) {
            i10 |= GravityCompat.START;
        }
        if (companion.toVerticalGravity(i10) == 0) {
            i10 |= 48;
        }
        this.gravity = i10;
        requestLayout();
    }

    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams lp) {
        return lp instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) lp) : lp instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) lp) : new DivLayoutParams(lp);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0080\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "", "", "firstChildOffset", "spaceBetweenChildren", "", "edgeDividerOffset", "<init>", "(Lcom/yandex/div/internal/widget/DivViewGroup;FFI)V", "freeSpace", "gravity", "childCount", "", "update", "(FII)V", "F", "getFirstChildOffset", "()F", "setFirstChildOffset", "(F)V", "getSpaceBetweenChildren", "setSpaceBetweenChildren", "I", "getEdgeDividerOffset", "()I", "setEdgeDividerOffset", "(I)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f10, float f11, int i10) {
            this.firstChildOffset = f10;
            this.spaceBetweenChildren = f11;
            this.edgeDividerOffset = i10;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void update(float freeSpace, int gravity, int childCount) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (gravity) {
                case 1:
                case 16:
                    this.firstChildOffset = freeSpace / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = freeSpace;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.INSTANCE.getSpaceAroundPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f10 = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f10;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f10);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.INSTANCE.getSpaceBetweenPart$div_release(freeSpace, childCount);
                    return;
                case AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL /* 67108864 */:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.INSTANCE.getSpaceEvenlyPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + gravity);
            }
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f10, float f11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0 : i10);
        }
    }
}
