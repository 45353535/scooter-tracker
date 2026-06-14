package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.util.PositiveNumberDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ;2\u00020\u0001:\u0001;B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB\u0011\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000eB\u000f\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u00107\u001a\u00020$2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020\bH\u0016R+\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R+\u0010.\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0017\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R\u001a\u00104\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"¨\u0006<"}, d2 = {"Lcom/yandex/div/internal/widget/DivLayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "(Lcom/yandex/div/internal/widget/DivLayoutParams;)V", "<set-?>", "columnSpan", "getColumnSpan", "()I", "setColumnSpan", "(I)V", "columnSpan$delegate", "Lcom/yandex/div/internal/util/PositiveNumberDelegate;", "gravity", "getGravity", "setGravity", "horizontalMargins", "getHorizontalMargins$div_release", "horizontalWeight", "", "getHorizontalWeight", "()F", "setHorizontalWeight", "(F)V", "isBaselineAligned", "", "()Z", "setBaselineAligned", "(Z)V", "maxHeight", "getMaxHeight", "setMaxHeight", "maxWidth", "getMaxWidth", "setMaxWidth", "rowSpan", "getRowSpan", "setRowSpan", "rowSpan$delegate", "verticalMargins", "getVerticalMargins$div_release", "verticalWeight", "getVerticalWeight", "setVerticalWeight", "equals", "other", "", "hashCode", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0)), v0.f(new g0(DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0))};

    /* JADX INFO: renamed from: columnSpan$delegate, reason: from kotlin metadata */
    @NotNull
    private final PositiveNumberDelegate columnSpan;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;

    /* JADX INFO: renamed from: rowSpan$delegate, reason: from kotlin metadata */
    @NotNull
    private final PositiveNumberDelegate rowSpan;
    private float verticalWeight;

    public DivLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 8388659;
        this.columnSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DivLayoutParams.class != other.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) other;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan() && this.verticalWeight == divLayoutParams.verticalWeight && this.horizontalWeight == divLayoutParams.horizontalWeight && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth;
    }

    public final int getColumnSpan() {
        return this.columnSpan.getValue(this, $$delegatedProperties[0]).intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final float getHorizontalWeight() {
        return this.horizontalWeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getRowSpan() {
        return this.rowSpan.getValue(this, $$delegatedProperties[1]).intValue();
    }

    public final int getVerticalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final float getVerticalWeight() {
        return this.verticalWeight;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 31) + this.gravity) * 31) + (this.isBaselineAligned ? 1 : 0)) * 31) + getColumnSpan()) * 31) + getRowSpan()) * 31) + Float.floatToIntBits(this.verticalWeight)) * 31) + Float.floatToIntBits(this.horizontalWeight)) * 31;
        int i10 = this.maxHeight;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        int i11 = (iHashCode + i10) * 31;
        int i12 = this.maxWidth;
        return i11 + (i12 != Integer.MAX_VALUE ? i12 : 0);
    }

    /* JADX INFO: renamed from: isBaselineAligned, reason: from getter */
    public final boolean getIsBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z10) {
        this.isBaselineAligned = z10;
    }

    public final void setColumnSpan(int i10) {
        this.columnSpan.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setGravity(int i10) {
        this.gravity = i10;
    }

    public final void setHorizontalWeight(float f10) {
        this.horizontalWeight = f10;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setMaxWidth(int i10) {
        this.maxWidth = i10;
    }

    public final void setRowSpan(int i10) {
        this.rowSpan.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    public final void setVerticalWeight(float f10) {
        this.verticalWeight = f10;
    }

    public DivLayoutParams(int i10, int i11) {
        super(i10, i11);
        this.gravity = 8388659;
        this.columnSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 8388659;
        this.columnSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = 8388659;
        this.columnSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@NotNull DivLayoutParams divLayoutParams) {
        super((ViewGroup.MarginLayoutParams) divLayoutParams);
        this.gravity = 8388659;
        this.columnSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.gravity = divLayoutParams.gravity;
        this.isBaselineAligned = divLayoutParams.isBaselineAligned;
        this.verticalWeight = divLayoutParams.verticalWeight;
        this.horizontalWeight = divLayoutParams.horizontalWeight;
        setColumnSpan(divLayoutParams.getColumnSpan());
        setRowSpan(divLayoutParams.getRowSpan());
        this.maxHeight = divLayoutParams.maxHeight;
        this.maxWidth = divLayoutParams.maxWidth;
    }
}
