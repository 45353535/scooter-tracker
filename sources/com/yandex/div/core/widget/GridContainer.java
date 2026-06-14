package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.R$styleable;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0011\u0018\u0000 M2\u00020\u0001:\u0007NOMPQRSB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0015J7\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0015J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0015JG\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010.J/\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J/\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00103J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010.J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0011R\u0018\u0010<\u001a\u00060;R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010F\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010.\"\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bG\u0010.R\u0014\u0010J\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010.R\u0014\u0010L\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010.¨\u0006T"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "child", "", "onViewAdded", "(Landroid/view/View;)V", "onViewRemoved", "requestLayout", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "widthSpec", "heightSpec", "measureChildrenInitial", "parentWidthSpec", "parentHeightSpec", "childWidth", "childHeight", "measureChild", "(Landroid/view/View;IIII)V", "remeasureChildrenWidth", "remeasureChildrenHeight", "cellWidth", "cellHeight", "measureMatchParentChild", "(Landroid/view/View;IIIIII)V", "calculateGridHorizontalPosition", "()I", "calculateGridVerticalPosition", "cellLeft", "gravity", "calculateChildHorizontalPosition", "(IIII)I", "cellTop", "calculateChildVerticalPosition", "invalidateStructure", "invalidateMeasurement", "checkConsistency", "computeLayoutHashCode", "validateLayoutParams", "Lcom/yandex/div/core/widget/GridContainer$Grid;", "grid", "Lcom/yandex/div/core/widget/GridContainer$Grid;", "lastLayoutHashCode", "I", "initialized", "Z", "value", "getColumnCount", "setColumnCount", "(I)V", "columnCount", "getRowCount", "rowCount", "getPaddingHorizontal", "paddingHorizontal", "getPaddingVertical", "paddingVertical", y.f66058y, "Cell", "CellProjection", "Grid", "Line", "SizeConstraint", "SpannedCellComparator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RtlHardcoded"})
public abstract class GridContainer extends DivViewGroup {

    @NotNull
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Cell;", "", "viewIndex", "", "columnIndex", "rowIndex", "columnSpan", "rowSpan", "(IIIII)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Cell {
        public final int columnIndex;
        public int columnSpan;
        public final int rowIndex;
        public int rowSpan;
        public final int viewIndex;

        public Cell(int i10, int i11, int i12, int i13, int i14) {
            this.viewIndex = i10;
            this.columnIndex = i11;
            this.rowIndex = i12;
            this.columnSpan = i13;
            this.rowSpan = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "", FirebaseAnalytics.Param.INDEX, "", "contentSize", "marginStart", "marginEnd", "span", "weight", "", "(IIIIIF)V", "size", "getSize", "()I", "specificSize", "getSpecificSize", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CellProjection {
        public final int contentSize;
        public final int index;
        public final int marginEnd;
        public final int marginStart;
        public final int span;
        public final float weight;

        public CellProjection(int i10, int i11, int i12, int i13, int i14, float f10) {
            this.index = i10;
            this.contentSize = i11;
            this.marginStart = i12;
            this.marginEnd = i13;
            this.span = i14;
            this.weight = f10;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001cR*\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R \u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0014\u00101\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010\rR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010\rR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\rR\u0011\u0010:\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0011\u0010<\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b;\u0010#¨\u0006="}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Grid;", "", "<init>", "(Lcom/yandex/div/core/widget/GridContainer;)V", "", "Lcom/yandex/div/core/widget/GridContainer$Cell;", "", "rowCount", "(Ljava/util/List;)I", "Lcom/yandex/div/core/widget/GridContainer$Line;", "lines", "calculateSize", "distributeCells", "()Ljava/util/List;", "measureColumns", "measureRows", "Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "constraint", "", "adjustWeightedLines", "(Ljava/util/List;Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;)V", "align", "(Ljava/util/List;)V", "invalidateStructure", "()V", "invalidateMeasurement", "widthSpec", "measureWidth", "(I)I", "heightSpec", "measureHeight", "value", "columnCount", "I", "getColumnCount", "()I", "setColumnCount", "(I)V", "Lcom/yandex/div/core/widget/Resettable;", "_cells", "Lcom/yandex/div/core/widget/Resettable;", "_columns", "_rows", "widthConstraint", "Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "heightConstraint", "getWidth", "width", "getHeight", "height", "getRowCount", "getCells", "cells", "getColumns", "columns", "getRows", "rows", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class Grid {

        @NotNull
        private final SizeConstraint heightConstraint;

        @NotNull
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;

        @NotNull
        private final Resettable<List<Cell>> _cells = new Resettable<>(new Function0<List<? extends Cell>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends GridContainer.Cell> invoke() {
                return this.this$0.distributeCells();
            }
        });

        @NotNull
        private final Resettable<List<Line>> _columns = new Resettable<>(new Function0<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends GridContainer.Line> invoke() {
                return this.this$0.measureColumns();
            }
        });

        @NotNull
        private final Resettable<List<Line>> _rows = new Resettable<>(new Function0<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends GridContainer.Line> invoke() {
                return this.this$0.measureRows();
            }
        });

        public Grid() {
            int i10 = 0;
            int i11 = 3;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.widthConstraint = new SizeConstraint(i10, i10, i11, defaultConstructorMarker);
            this.heightConstraint = new SizeConstraint(i10, i10, i11, defaultConstructorMarker);
        }

        private final void adjustWeightedLines(List<Line> lines, SizeConstraint constraint) {
            int size = lines.size();
            float weight = 0.0f;
            int size2 = 0;
            float fMax = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = lines.get(i10);
                if (line.isFlexible()) {
                    weight += line.getWeight();
                    fMax = Math.max(fMax, line.getSize() / line.getWeight());
                } else {
                    size2 += line.getSize();
                }
                line.getSize();
            }
            int size3 = lines.size();
            int iCeil = 0;
            for (int i11 = 0; i11 < size3; i11++) {
                Line line2 = lines.get(i11);
                iCeil += line2.isFlexible() ? (int) Math.ceil(line2.getWeight() * fMax) : line2.getSize();
            }
            float fMax2 = Math.max(0, Math.max(constraint.min, iCeil) - size2) / weight;
            int size4 = lines.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Line line3 = lines.get(i12);
                if (line3.isFlexible()) {
                    int iCeil2 = (int) Math.ceil(line3.getWeight() * fMax2);
                    Line.include$default(line3, iCeil2 - line3.getMarginSize(), iCeil2, 0.0f, 4, null);
                }
            }
        }

        private final void align(List<Line> lines) {
            int size = lines.size();
            int size2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = lines.get(i10);
                line.setOffset(size2);
                size2 += line.getSize();
            }
        }

        private final int calculateSize(List<Line> lines) {
            if (lines.isEmpty()) {
                return 0;
            }
            Line line = (Line) CollectionsKt.last((List) lines);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            Integer numValueOf;
            if (GridContainer.this.getChildCount() == 0) {
                return CollectionsKt.emptyList();
            }
            int i10 = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = gridContainer.getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    Integer numMinOrNull = ArraysKt.minOrNull(iArr2);
                    int iIntValue = numMinOrNull != null ? numMinOrNull.intValue() : 0;
                    int iIndexOf = ArraysKt.indexOf(iArr2, iIntValue);
                    int i13 = i11 + iIntValue;
                    IntRange intRangeV = g.v(0, i10);
                    int iE = intRangeV.e();
                    int iF = intRangeV.f();
                    if (iE <= iF) {
                        while (true) {
                            iArr2[iE] = Math.max(0, iArr2[iE] - iIntValue);
                            if (iE == iF) {
                                break;
                            }
                            iE++;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int iMin = Math.min(divLayoutParams.getColumnSpan(), i10 - iIndexOf);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i12, iIndexOf, i13, iMin, rowSpan));
                    int i14 = iIndexOf + iMin;
                    while (iIndexOf < i14) {
                        if (iArr2[iIndexOf] > 0) {
                            Cell cell = (Cell) arrayList.get(iArr[iIndexOf]);
                            int i15 = cell.columnIndex;
                            int i16 = cell.columnSpan + i15;
                            while (i15 < i16) {
                                int i17 = iArr2[i15];
                                iArr2[i15] = 0;
                                i15++;
                            }
                            cell.rowSpan = i13 - cell.rowIndex;
                        }
                        iArr[iIndexOf] = i12;
                        iArr2[iIndexOf] = rowSpan;
                        iIndexOf++;
                    }
                    i11 = i13;
                }
            }
            if (i10 == 0) {
                numValueOf = null;
            } else {
                int i18 = 1;
                numValueOf = Integer.valueOf(g.e(iArr2[0], 1));
                IntIterator it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(g.e(iArr2[it.nextInt()], i18));
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                    i18 = 1;
                }
            }
            int iIntValue2 = ((Cell) CollectionsKt.last((List) arrayList)).rowIndex + (numValueOf != null ? numValueOf.intValue() : 1);
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Cell cell2 = (Cell) arrayList.get(i19);
                int i20 = cell2.rowIndex;
                if (cell2.rowSpan + i20 > iIntValue2) {
                    cell2.rowSpan = iIntValue2 - i20;
                }
            }
            return arrayList;
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int size;
            float weight;
            int i10;
            int i11;
            int i12 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Cell cell = list.get(i14);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.columnIndex, childAt.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin, cell.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams));
                int i15 = cellProjection.span;
                if (i15 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i16 = i15 - 1;
                    float f10 = cellProjection.weight / i15;
                    if (i16 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i16 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Cell cell2 = list.get(i17);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.columnIndex, childAt2.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin, cell2.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i18 = 0; i18 < size4; i18++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i18);
                int i19 = cellProjection3.index;
                int i20 = (cellProjection3.span + i19) - 1;
                int size5 = cellProjection3.getSize();
                if (i19 <= i20) {
                    int i21 = i19;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i21 == i20) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i19 <= i20) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i19);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i19 != i20) {
                                i19++;
                            }
                        }
                    }
                } else if (size5 > 0 && i19 <= i20) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i19);
                        if (i10 <= 0) {
                            int i22 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, 0.0f, 4, null);
                        }
                        if (i19 != i20) {
                            i19++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int size;
            float weight;
            int i10;
            int i11;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i12 = 0; i12 < rowCount; i12++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell = list.get(i13);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.rowIndex, childAt.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, cell.rowSpan, GridContainerKt.getRowWeight(divLayoutParams));
                int i14 = cellProjection.span;
                if (i14 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i15 = i14 - 1;
                    float f10 = cellProjection.weight / i14;
                    if (i15 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i15 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Cell cell2 = list.get(i16);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.rowIndex, childAt2.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin, cell2.rowSpan, GridContainerKt.getRowWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i17 = 0; i17 < size4; i17++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection3.index;
                int i19 = (cellProjection3.span + i18) - 1;
                int size5 = cellProjection3.getSize();
                if (i18 <= i19) {
                    int i20 = i18;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i20);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i18 != i19) {
                                i18++;
                            }
                        }
                    }
                } else if (size5 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i10 <= 0) {
                            int i21 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i21, line3.getSize() + i21, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i22 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        }
                        if (i18 != i19) {
                            i18++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) CollectionsKt.last((List) list);
            return cell.rowIndex + cell.rowSpan;
        }

        @NotNull
        public final List<Cell> getCells() {
            return this._cells.get();
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        @NotNull
        public final List<Line> getColumns() {
            return this._columns.get();
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        @NotNull
        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final int measureHeight(int heightSpec) {
            this.heightConstraint.set(heightSpec);
            return Math.max(this.heightConstraint.min, Math.min(getHeight(), this.heightConstraint.max));
        }

        public final int measureWidth(int widthSpec) {
            this.widthConstraint.set(widthSpec);
            return Math.max(this.widthConstraint.min, Math.min(getWidth(), this.widthConstraint.max));
        }

        public final void setColumnCount(int i10) {
            if (i10 <= 0 || this.columnCount == i10) {
                return;
            }
            this.columnCount = i10;
            invalidateStructure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Line;", "", "()V", "<set-?>", "", "contentSize", "getContentSize", "()I", "isFlexible", "", "()Z", "marginSize", "getMarginSize", "offset", "getOffset", "setOffset", "(I)V", "size", "getSize", "", "weight", "getWeight", "()F", POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE, "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public static /* synthetic */ void include$default(Line line, int i10, int i11, float f10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            line.include(i10, i11, f10);
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void include(int contentSize, int size, float weight) {
            this.contentSize = Math.max(this.contentSize, contentSize);
            this.size = Math.max(this.size, size);
            this.weight = Math.max(this.weight, weight);
        }

        public final boolean isFlexible() {
            return this.weight > 0.0f;
        }

        public final void setOffset(int i10) {
            this.offset = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$SpannedCellComparator;", "Ljava/util/Comparator;", "Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "Lkotlin/Comparator;", "()V", "compare", "", "lhs", "rhs", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SpannedCellComparator implements Comparator<CellProjection> {

        @NotNull
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@NotNull CellProjection lhs, @NotNull CellProjection rhs) {
            if (lhs.getSpecificSize() < rhs.getSpecificSize()) {
                return 1;
            }
            return lhs.getSpecificSize() > rhs.getSpecificSize() ? -1 : 0;
        }
    }

    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridContainer, i10, 0);
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(R$styleable.GridContainer_android_columnCount, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(R$styleable.GridContainer_android_gravity, 8388659));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    private final int calculateChildHorizontalPosition(int cellLeft, int cellWidth, int childWidth, int gravity) {
        int i10 = gravity & 7;
        return i10 != 1 ? i10 != 5 ? cellLeft : (cellLeft + cellWidth) - childWidth : cellLeft + ((cellWidth - childWidth) / 2);
    }

    private final int calculateChildVerticalPosition(int cellTop, int cellHeight, int childHeight, int gravity) {
        int i10 = gravity & 112;
        return i10 != 16 ? i10 != 80 ? cellTop : (cellTop + cellHeight) - childHeight : cellTop + ((cellHeight - childHeight) / 2);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return gravity != 1 ? gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth2) - measuredWidth : getPaddingLeft() + ((measuredWidth2 - measuredWidth) / 2);
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        return gravity != 16 ? gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight2) - measuredHeight : getPaddingTop() + ((measuredHeight2 - measuredHeight) / 2);
    }

    private final void checkConsistency() {
        int i10 = this.lastLayoutHashCode;
        if (i10 == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i10 != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int iHashCode = Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                iHashCode = (iHashCode * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
        }
        return iHashCode;
    }

    private final int getPaddingHorizontal() {
        return getPaddingLeft() + getPaddingRight();
    }

    private final int getPaddingVertical() {
        return getPaddingTop() + getPaddingBottom();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final void measureChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight) {
        DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
        int minimumWidth = child.getMinimumWidth();
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int childMeasureSpec = companion.getChildMeasureSpec(parentWidthSpec, 0, childWidth, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        int minimumHeight = child.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        child.measure(childMeasureSpec, companion.getChildMeasureSpec(parentHeightSpec, 0, childHeight, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight()));
    }

    private final void measureChildrenInitial(int widthSpec, int heightSpec) {
        int i10;
        int i11;
        int i12;
        GridContainer gridContainer;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i15 = i14 == -1 ? 0 : i14;
                int i16 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                if (i16 == -1) {
                    i12 = 0;
                    gridContainer = this;
                    i10 = widthSpec;
                    i11 = heightSpec;
                } else {
                    i12 = i16;
                    i10 = widthSpec;
                    i11 = heightSpec;
                    gridContainer = this;
                }
                gridContainer.measureChild(childAt, i10, i11, i15, i12);
            } else {
                i10 = widthSpec;
                i11 = heightSpec;
            }
            i13++;
            widthSpec = i10;
            heightSpec = i11;
        }
    }

    private final void measureMatchParentChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight, int cellWidth, int cellHeight) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (childWidth == -1) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(cellWidth, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
            int minimumWidth = child.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec = companion.getChildMeasureSpec(parentWidthSpec, 0, childWidth, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        }
        if (childHeight == -1) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(cellHeight, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
            int minimumHeight = child.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec2 = companion2.getChildMeasureSpec(parentHeightSpec, 0, childHeight, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight());
        }
        child.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final void remeasureChildrenHeight(int widthSpec, int heightSpec) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i10);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                    measureMatchParentChild(childAt, widthSpec, heightSpec, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.rowIndex).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i10++;
            }
        }
    }

    private final void remeasureChildrenWidth(int widthSpec, int heightSpec) {
        int i10;
        int i11;
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    i13++;
                    i10 = widthSpec;
                    i11 = heightSpec;
                } else {
                    Cell cell = cells.get(i13);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    i10 = widthSpec;
                    i11 = heightSpec;
                    measureMatchParentChild(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, 0);
                    i13++;
                }
            } else {
                i10 = widthSpec;
                i11 = heightSpec;
            }
            i12++;
            widthSpec = i10;
            heightSpec = i11;
        }
    }

    private final void validateLayoutParams() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (GridContainerKt.getColumnWeight(divLayoutParams) < 0.0f || GridContainerKt.getRowWeight(divLayoutParams) < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
        }
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        long j10;
        List<Line> list;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int iCalculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int iCalculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = cells.get(i11);
                int offset = columns.get(cell.columnIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                j10 = jElapsedRealtime;
                int offset2 = rows.get(cell.rowIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = columns;
                int iCalculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + iCalculateGridHorizontalPosition;
                int iCalculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + iCalculateGridVerticalPosition;
                childAt.layout(iCalculateChildHorizontalPosition, iCalculateChildVerticalPosition, childAt.getMeasuredWidth() + iCalculateChildHorizontalPosition, childAt.getMeasuredHeight() + iCalculateChildVerticalPosition);
                i11++;
            } else {
                j10 = jElapsedRealtime;
                list = columns;
            }
            i10++;
            jElapsedRealtime = j10;
            columns = list;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onLayout() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec - paddingHorizontal), View.MeasureSpec.getMode(widthMeasureSpec));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec - paddingVertical), View.MeasureSpec.getMode(heightMeasureSpec));
        measureChildrenInitial(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureWidth = this.grid.measureWidth(iMakeMeasureSpec);
        remeasureChildrenWidth(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureHeight = this.grid.measureHeight(iMakeMeasureSpec2);
        remeasureChildrenHeight(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMeasureWidth + paddingHorizontal, getSuggestedMinimumWidth()), widthMeasureSpec, 0), View.resolveSizeAndState(Math.max(iMeasureHeight + paddingVertical, getSuggestedMinimumHeight()), heightMeasureSpec, 0));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", "onMeasure() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        super.onViewAdded(child);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        super.onViewRemoved(child);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i10) {
        this.grid.setColumnCount(i10);
        invalidateStructure();
        requestLayout();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "", "min", "", "max", "(II)V", "set", "", "measureSpec", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SizeConstraint {
        public int max;
        public int min;

        public SizeConstraint(int i10, int i11) {
            this.min = i10;
            this.max = i11;
        }

        public final void set(int measureSpec) {
            int mode = View.MeasureSpec.getMode(measureSpec);
            int size = View.MeasureSpec.getSize(measureSpec);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }

        public /* synthetic */ SizeConstraint(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 32768 : i11);
        }
    }
}
