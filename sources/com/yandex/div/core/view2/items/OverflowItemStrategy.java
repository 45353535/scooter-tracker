package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \f2\u00020\u0001:\u0003\r\f\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "", "", "itemCount", "<init>", "(I)V", "step", "nextItem", "(I)I", "previousItem", "positionAfterScrollBy", "I", y.f66058y, "Clamp", "Ring", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OverflowItemStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int itemCount;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "(IIIILandroid/util/DisplayMetrics;)V", "nextItem", "step", "positionAfterScrollBy", "previousItem", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Clamp extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Clamp(int i10, int i11, int i12, int i13, @NotNull DisplayMetrics displayMetrics) {
            super(i11, null);
            this.currentItem = i10;
            this.itemCount = i11;
            this.scrollRange = i12;
            this.scrollOffset = i13;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.min(this.currentItem + step, this.itemCount - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int step) {
            return Math.min(Math.max(0, this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(step), this.metrics)), this.scrollRange);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.max(0, this.currentItem - step);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Companion;", "", "()V", "create", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "overflow", "", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "create$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OverflowItemStrategy create$div_release(@Nullable String overflow, int currentItem, int itemCount, int scrollRange, int scrollOffset, @NotNull DisplayMetrics metrics) {
            if (overflow == null ? true : Intrinsics.areEqual(overflow, "clamp")) {
                return new Clamp(currentItem, itemCount, scrollRange, scrollOffset, metrics);
            }
            if (Intrinsics.areEqual(overflow, "ring")) {
                return new Ring(currentItem, itemCount, scrollRange, scrollOffset, metrics);
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported overflow " + overflow);
            }
            return new Clamp(currentItem, itemCount, scrollRange, scrollOffset, metrics);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "(IIIILandroid/util/DisplayMetrics;)V", "nextItem", "step", "positionAfterScrollBy", "previousItem", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ring extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Ring(int i10, int i11, int i12, int i13, @NotNull DisplayMetrics displayMetrics) {
            super(i11, null);
            this.currentItem = i10;
            this.itemCount = i11;
            this.scrollRange = i12;
            this.scrollOffset = i13;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return (this.currentItem + step) % this.itemCount;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int step) {
            int iDpToPx = this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(step), this.metrics);
            int i10 = this.scrollRange;
            int i11 = iDpToPx % i10;
            return i11 < 0 ? i11 + i10 : i11;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            int i10 = this.currentItem - step;
            int i11 = this.itemCount;
            int i12 = i10 % i11;
            return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
        }
    }

    public /* synthetic */ OverflowItemStrategy(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public abstract int nextItem(int step);

    public abstract int positionAfterScrollBy(int step);

    public abstract int previousItem(int step);

    private OverflowItemStrategy(int i10) {
        this.itemCount = i10;
    }
}
