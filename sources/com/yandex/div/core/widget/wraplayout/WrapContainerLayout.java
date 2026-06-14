package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.ironsource.C4240b4;
import com.ironsource.C4329g8;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.v0;
import kotlin.properties.e;
import kotlin.ranges.d;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b/\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002¹\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010\u0019J/\u0010*\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010+J7\u0010.\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010\fJ\u001f\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\fJ\u001f\u0010;\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010@J7\u0010B\u001a\u00020\n2\u0006\u0010>\u001a\u00020=2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010D\u001a\u00020\n2\u0006\u0010>\u001a\u00020=2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\bD\u0010CJC\u0010B\u001a\u0004\u0018\u00010\n2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010>\u001a\u00020=2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010GJ\u0019\u0010H\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\bH\u0010\u0010J\u0019\u0010I\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\bI\u0010\u0010J-\u0010J\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ-\u0010L\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\bL\u0010KJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u0007¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u0007¢\u0006\u0004\bP\u0010OJ\u001f\u0010Q\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0014¢\u0006\u0004\bQ\u0010\fJ7\u0010S\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\bU\u0010@J\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010WR0\u0010Y\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010OR1\u0010e\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\bd\u0010^\u001a\u0004\bb\u0010W\"\u0004\bc\u0010OR1\u0010j\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bf\u0010a\u0012\u0004\bi\u0010^\u001a\u0004\bg\u0010W\"\u0004\bh\u0010OR/\u0010p\u001a\u0004\u0018\u00010E2\b\u0010_\u001a\u0004\u0018\u00010E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010a\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR/\u0010t\u001a\u0004\u0018\u00010E2\b\u0010_\u001a\u0004\u0018\u00010E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010a\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\u0016\u0010u\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00140w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010ZR\u0016\u0010{\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010ZR\u0016\u0010|\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010ZR\u0016\u0010}\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010ZR\u0016\u0010~\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010ZR\u0016\u0010\u007f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010ZR\u0018\u0010\u0080\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010ZR\u0018\u0010\u0081\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010ZR\u0018\u0010\u0082\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010ZR\u0018\u0010\u0083\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010ZR\u0018\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010ZR\u0018\u0010\u0085\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010ZR\u0018\u0010\u0086\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010ZR\u001c\u0010\u0088\u0001\u001a\u00070\u0087\u0001R\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010ZR3\u0010\u0091\u0001\u001a\u00030\u008b\u00012\u0007\u0010_\u001a\u00030\u008b\u00018V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010a\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010WR\u0016\u0010\u0095\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010WR\u0016\u0010\u0097\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010WR\u0016\u0010\u0099\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010WR\u0016\u0010\u009b\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010WR\u0016\u0010\u009d\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010WR\u0016\u0010\u009f\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010WR\u0016\u0010¡\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010WR\u0016\u0010£\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010WR\u0016\u0010¥\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010WR\u0016\u0010§\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010WR\u0016\u0010©\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010WR\u001b\u0010ª\u0001\u001a\u00020\u000e*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u001b\u0010\u00ad\u0001\u001a\u00020\u000e*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010«\u0001R\u001d\u0010®\u0001\u001a\u00020\u000e*\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010±\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010WR\u0016\u0010³\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010WR\u0016\u0010µ\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010WR\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006º\u0001"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "calculateLines", "(II)V", C4240b4.a.f42515t, "", "showSeparatorAtStart", "(I)Z", "showSeparatorBetween", "showSeparatorAtEnd", "childIndex", "Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "line", "addLineIfNeeded", "(ILcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;)V", "addLine", "(Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;)V", "maxSize", "currentLength", "childLength", "lineItemsCount", "isWrapRequired", "(IIIII)Z", "measureSpec", "crossAlignment", "paddingAlongCrossAxis", "determineCrossSize", "(III)V", "spaceLine", "addEdgeSpace", "addSpaceBetweenLines", "size", "isCrossAxis", "getSize", "(IIIZ)I", "state", "tooSmallState", "getState", "(IIIII)I", "left", "right", "layoutHorizontal", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "getTopOffsetForHorizontalLayout", "(Landroid/view/View;Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;)I", "top", "bottom", "layoutVertical", "lineWidth", "getLeftOffsetForVerticalLayout", "(Landroid/view/View;I)I", "Landroid/graphics/Canvas;", "canvas", "drawSeparatorsHorizontal", "(Landroid/graphics/Canvas;)V", "drawSeparatorsVertical", "drawSeparator", "(Landroid/graphics/Canvas;IIII)V", "drawLineSeparator", "Landroid/graphics/drawable/Drawable;", "separator", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;IIII)Lkotlin/Unit;", "showLeftSeparator", "showRightSeparator", "setSeparatorMargins", "(IIII)V", "setLineSeparatorMargins", "px", "setItemSpacing", "(I)V", "setLineSpacing", "onMeasure", "changed", "onLayout", "(ZIIII)V", "dispatchDraw", "getBaseline", "()I", "value", "wrapDirection", "I", "getWrapDirection", "setWrapDirection", "getWrapDirection$annotations", "()V", "<set-?>", "showSeparators$delegate", "Lkotlin/properties/e;", "getShowSeparators", "setShowSeparators", "getShowSeparators$annotations", "showSeparators", "showLineSeparators$delegate", "getShowLineSeparators", "setShowLineSeparators", "getShowLineSeparators$annotations", "showLineSeparators", "separatorDrawable$delegate", "getSeparatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setSeparatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "separatorDrawable", "lineSeparatorDrawable$delegate", "getLineSeparatorDrawable", "setLineSeparatorDrawable", "lineSeparatorDrawable", "isRowDirection", "Z", "", "lines", "Ljava/util/List;", "childState", "separatorMarginTop", "separatorMarginBottom", "separatorMarginLeft", "separatorMarginRight", "itemSpacingPx", "lineSpacingPx", "lineSeparatorMarginTop", "lineSeparatorMarginBottom", "lineSeparatorMarginLeft", "lineSeparatorMarginRight", "middleLineSeparatorOffset", "edgeLineSeparatorOffset", "Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "offsetsHolder", "Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "tempSumCrossSize", "", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getSeparatorLength", "separatorLength", "getLineSeparatorLength", "lineSeparatorLength", "getBetweenItemsSpacing", "betweenItemsSpacing", "getBetweenLinesSpacing", "betweenLinesSpacing", "getEdgeSeparatorsLength", "edgeSeparatorsLength", "getEdgeLineSeparatorsLength", "edgeLineSeparatorsLength", "getStartSeparatorLength", "startSeparatorLength", "getMiddleSeparatorLength", "middleSeparatorLength", "getEndSeparatorLength", "endSeparatorLength", "getStartLineSeparatorLength", "startLineSeparatorLength", "getMiddleLineSeparatorLength", "middleLineSeparatorLength", "getEndLineSeparatorLength", "endLineSeparatorLength", "isHidden", "(Landroid/view/View;)Z", "getHasIncorrectSize", "hasIncorrectSize", "isIncorrectForCrossAxis", "(Ljava/lang/Integer;)Z", "getVisibleLinesCount", "visibleLinesCount", "getLargestMainSize", "largestMainSize", "getSumOfCrossSize", "sumOfCrossSize", "getFirstVisibleLine", "()Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "firstVisibleLine", "WrapLine", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class WrapContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(WrapContainerLayout.class, "showSeparators", "getShowSeparators()I", 0)), v0.f(new g0(WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", 0)), v0.f(new g0(WrapContainerLayout.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), v0.f(new g0(WrapContainerLayout.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), v0.f(new g0(WrapContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* JADX INFO: renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final e aspectRatio;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;

    @Px
    private int itemSpacingPx;

    /* JADX INFO: renamed from: lineSeparatorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final e lineSeparatorDrawable;

    @Px
    private int lineSeparatorMarginBottom;

    @Px
    private int lineSeparatorMarginLeft;

    @Px
    private int lineSeparatorMarginRight;

    @Px
    private int lineSeparatorMarginTop;

    @Px
    private int lineSpacingPx;

    @NotNull
    private final List<WrapLine> lines;
    private int middleLineSeparatorOffset;

    @NotNull
    private final DivViewGroup.OffsetsHolder offsetsHolder;

    /* JADX INFO: renamed from: separatorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final e separatorDrawable;

    @Px
    private int separatorMarginBottom;

    @Px
    private int separatorMarginLeft;

    @Px
    private int separatorMarginRight;

    @Px
    private int separatorMarginTop;

    /* JADX INFO: renamed from: showLineSeparators$delegate, reason: from kotlin metadata */
    @NotNull
    private final e showLineSeparators;

    /* JADX INFO: renamed from: showSeparators$delegate, reason: from kotlin metadata */
    @NotNull
    private final e showSeparators;
    private int tempSumCrossSize;
    private int wrapDirection;

    public WrapContainerLayout(@NotNull Context context) {
        super(context, null, 0, 6, null);
        this.showSeparators = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.showLineSeparators = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.separatorDrawable = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.lineSeparatorDrawable = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
    }

    private final void addEdgeSpace(WrapLine spaceLine) {
        this.lines.add(0, spaceLine);
        this.lines.add(spaceLine);
    }

    private final void addLine(WrapLine line) {
        this.lines.add(line);
        if (line.getMaxBaseline() > 0) {
            line.setCrossSize(Math.max(line.getCrossSize(), line.getMaxBaseline() + line.getMaxHeightUnderBaseline()));
        }
        this.tempSumCrossSize += line.getCrossSize();
    }

    private final void addLineIfNeeded(int childIndex, WrapLine line) {
        if (childIndex != getChildCount() - 1 || line.getItemCountNotGone() == 0) {
            return;
        }
        addLine(line);
    }

    private final void addSpaceBetweenLines(WrapLine spaceLine) {
        for (int i10 = 1; i10 < this.lines.size(); i10 += 2) {
            this.lines.add(i10, spaceLine);
        }
    }

    private final void calculateLines(int widthMeasureSpec, int heightMeasureSpec) {
        int edgeSeparatorsLength;
        int edgeSeparatorsLength2;
        int i10;
        int i11;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i12 = this.isRowDirection ? widthMeasureSpec : heightMeasureSpec;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int edgeSeparatorsLength3 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength3, 0, 5, null);
        int i13 = 0;
        WrapLine wrapLine2 = wrapLine;
        int iMax = Integer.MIN_VALUE;
        for (Object obj : ViewGroupKt.getChildren(this)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (isHidden(view)) {
                wrapLine2.setGoneItemCount(wrapLine2.getGoneItemCount() + 1);
                wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                addLineIfNeeded(i13, wrapLine2);
                int i15 = mode;
                i10 = size;
                i11 = i15;
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalPaddings$div_release = getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release();
                int verticalPaddings$div_release = getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    edgeSeparatorsLength = horizontalPaddings$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength2 = this.tempSumCrossSize;
                } else {
                    edgeSeparatorsLength = horizontalPaddings$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength2 = getEdgeSeparatorsLength();
                }
                int i16 = verticalPaddings$div_release + edgeSeparatorsLength2;
                int i17 = edgeSeparatorsLength;
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                view.measure(companion.getChildMeasureSpec(widthMeasureSpec, i17, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(heightMeasureSpec, i16, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                int measuredWidth = view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release();
                int measuredHeight = view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                int i18 = measuredWidth;
                int i19 = mode;
                i10 = size;
                i11 = i19;
                if (isWrapRequired(i11, i10, wrapLine2.getMainSize(), measuredHeight, wrapLine2.getItemCount())) {
                    if (wrapLine2.getItemCountNotGone() > 0) {
                        addLine(wrapLine2);
                    }
                    wrapLine2 = new WrapLine(i13, edgeSeparatorsLength3, 1);
                    iMax = Integer.MIN_VALUE;
                } else {
                    if (wrapLine2.getItemCount() > 0) {
                        wrapLine2.setMainSize(wrapLine2.getMainSize() + getBetweenItemsSpacing());
                    }
                    wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                }
                if (this.isRowDirection && divLayoutParams.getIsBaselineAligned()) {
                    wrapLine2.setMaxBaseline(Math.max(wrapLine2.getMaxBaseline(), view.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    wrapLine2.setMaxHeightUnderBaseline(Math.max(wrapLine2.getMaxHeightUnderBaseline(), (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view.getBaseline()));
                }
                wrapLine2.setMainSize(wrapLine2.getMainSize() + measuredHeight);
                iMax = Math.max(iMax, i18);
                wrapLine2.setCrossSize(Math.max(wrapLine2.getCrossSize(), iMax));
                addLineIfNeeded(i13, wrapLine2);
            }
            int i20 = i10;
            mode = i11;
            size = i20;
            i13 = i14;
        }
    }

    private final void determineCrossSize(int measureSpec, int crossAlignment, int paddingAlongCrossAxis) {
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(measureSpec) == 1073741824) {
            int size = View.MeasureSpec.getSize(measureSpec);
            if (this.lines.size() == 1) {
                this.lines.get(0).setCrossSize(size - paddingAlongCrossAxis);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + paddingAlongCrossAxis;
            if (crossAlignment != 1) {
                if (crossAlignment != 5) {
                    if (crossAlignment != 16) {
                        if (crossAlignment != 80) {
                            if (crossAlignment != 16777216) {
                                if (crossAlignment != 33554432) {
                                    if (crossAlignment != 67108864) {
                                        if (crossAlignment != 268435456) {
                                            if (crossAlignment != 536870912) {
                                                if (crossAlignment != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    WrapLine wrapLine = new WrapLine(0, 0, 0, 7, null);
                                    int iD = a.d(DivViewGroup.INSTANCE.getSpaceEvenlyPart$div_release(sumOfCrossSize, this.lines.size()));
                                    wrapLine.setCrossSize(iD);
                                    int i10 = iD / 2;
                                    this.middleLineSeparatorOffset = i10;
                                    this.edgeLineSeparatorOffset = i10;
                                    addSpaceBetweenLines(wrapLine);
                                    addEdgeSpace(wrapLine);
                                    return;
                                }
                                WrapLine wrapLine2 = new WrapLine(0, 0, 0, 7, null);
                                int iD2 = a.d(DivViewGroup.INSTANCE.getSpaceBetweenPart$div_release(sumOfCrossSize, this.lines.size()));
                                wrapLine2.setCrossSize(iD2);
                                this.middleLineSeparatorOffset = iD2 / 2;
                                addSpaceBetweenLines(wrapLine2);
                                return;
                            }
                            WrapLine wrapLine3 = new WrapLine(0, 0, 0, 7, null);
                            int iD3 = a.d(DivViewGroup.INSTANCE.getSpaceAroundPart$div_release(sumOfCrossSize, this.lines.size()));
                            wrapLine3.setCrossSize(iD3);
                            this.middleLineSeparatorOffset = iD3;
                            this.edgeLineSeparatorOffset = iD3 / 2;
                            for (int i11 = 0; i11 < this.lines.size(); i11 += 3) {
                                this.lines.add(i11, wrapLine3);
                                this.lines.add(i11 + 2, wrapLine3);
                            }
                            return;
                        }
                    }
                }
                WrapLine wrapLine4 = new WrapLine(0, 0, 0, 7, null);
                wrapLine4.setCrossSize(sumOfCrossSize);
                this.lines.add(0, wrapLine4);
                return;
            }
            WrapLine wrapLine5 = new WrapLine(0, 0, 0, 7, null);
            wrapLine5.setCrossSize(sumOfCrossSize / 2);
            addEdgeSpace(wrapLine5);
        }
    }

    private final void drawLineSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getLineSeparatorDrawable(), canvas, left + this.lineSeparatorMarginLeft, top - this.lineSeparatorMarginTop, right - this.lineSeparatorMarginRight, bottom + this.lineSeparatorMarginBottom);
    }

    private final void drawSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getSeparatorDrawable(), canvas, left + this.separatorMarginLeft, top - this.separatorMarginTop, right - this.separatorMarginRight, bottom + this.separatorMarginBottom);
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int right;
        t0 t0Var = new t0();
        t0 t0Var2 = new t0();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int bottom = firstVisibleLine != null ? firstVisibleLine.getBottom() - firstVisibleLine.getCrossSize() : 0;
            t0Var.f93331b = bottom;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, bottom - this.edgeLineSeparatorOffset);
        }
        boolean z10 = false;
        for (WrapLine wrapLine : this.lines) {
            if (wrapLine.getItemCountNotGone() != 0) {
                int bottom2 = wrapLine.getBottom();
                t0Var2.f93331b = bottom2;
                t0Var.f93331b = bottom2 - wrapLine.getCrossSize();
                if (z10 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, t0Var.f93331b - this.middleLineSeparatorOffset);
                }
                d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
                int iE = indices.e();
                int iF = indices.f();
                int iG = indices.g();
                if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                    right = 0;
                    boolean z11 = true;
                    while (true) {
                        View childAt = getChildAt(iE);
                        if (childAt != null && !isHidden(childAt)) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            right = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z11) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, t0Var, t0Var2, left - wrapLine.getEdgeSeparatorOffset());
                                }
                                z11 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, t0Var, t0Var2, left - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                            }
                        }
                        if (iE == iF) {
                            break;
                        } else {
                            iE += iG;
                        }
                    }
                } else {
                    right = 0;
                }
                if (right > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, t0Var, t0Var2, right + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
                z10 = true;
            }
        }
        if (t0Var2.f93331b <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, t0Var2.f93331b + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i10) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i10 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i10);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, t0 t0Var, t0 t0Var2, int i10) {
        wrapContainerLayout.drawSeparator(canvas, i10 - wrapContainerLayout.getSeparatorLength(), t0Var.f93331b, i10, t0Var2.f93331b);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        t0 t0Var = new t0();
        t0 t0Var2 = new t0();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int right = firstVisibleLine != null ? firstVisibleLine.getRight() - firstVisibleLine.getCrossSize() : 0;
            t0Var.f93331b = right;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, right - this.edgeLineSeparatorOffset);
        }
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((IntIterator) it).nextInt());
            if (wrapLine.getItemCountNotGone() != 0) {
                int right2 = wrapLine.getRight();
                t0Var2.f93331b = right2;
                t0Var.f93331b = right2 - wrapLine.getCrossSize();
                if (z10 && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, t0Var.f93331b - this.middleLineSeparatorOffset);
                }
                boolean z11 = true;
                z10 = getLineSeparatorDrawable() != null;
                int itemCount = wrapLine.getItemCount();
                int bottom = 0;
                for (int i10 = 0; i10 < itemCount; i10++) {
                    View childAt = getChildAt(wrapLine.getFirstIndex() + i10);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        bottom = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z11) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, t0Var, t0Var2, top - wrapLine.getEdgeSeparatorOffset());
                            }
                            z11 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, t0Var, t0Var2, top - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                        }
                    }
                }
                if (bottom > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, t0Var, t0Var2, bottom + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
            }
        }
        if (t0Var2.f93331b <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, t0Var2.f93331b + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i10) {
        wrapContainerLayout.drawLineSeparator(canvas, i10 - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i10, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, t0 t0Var, t0 t0Var2, int i10) {
        wrapContainerLayout.drawSeparator(canvas, t0Var.f93331b, i10 - wrapContainerLayout.getSeparatorLength(), t0Var2.f93331b, i10);
    }

    private final int getBetweenItemsSpacing() {
        return showSeparatorBetween(getShowSeparators()) ? getSeparatorLength() : this.itemSpacingPx;
    }

    private final int getBetweenLinesSpacing() {
        return showSeparatorBetween(getShowLineSeparators()) ? getLineSeparatorLength() : this.lineSpacingPx;
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj = null;
        if (this.isRowDirection || !com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            Iterator<T> it = this.lines.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WrapLine) next).isVisible()) {
                    obj = next;
                    break;
                }
            }
            return (WrapLine) obj;
        }
        List<WrapLine> list = this.lines;
        ListIterator<WrapLine> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            WrapLine wrapLinePrevious = listIterator.previous();
            if (wrapLinePrevious.isVisible()) {
                obj = wrapLinePrevious;
                break;
            }
        }
        return (WrapLine) obj;
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((WrapLine) it.next()).getMainSize());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((WrapLine) it.next()).getMainSize());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int lineWidth) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(DivViewGroup.INSTANCE.toHorizontalGravity(divLayoutParams.getGravity()), ViewCompat.getLayoutDirection(this));
        return absoluteGravity != 1 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (lineWidth - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((lineWidth - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i10;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i10 = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i10 = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i10;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i10;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i10 = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i10 = this.separatorMarginBottom;
        }
        return intrinsicHeight + i10;
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    private final int getSize(int mode, int size, int maxSize, boolean isCrossAxis) {
        if (mode == Integer.MIN_VALUE) {
            return isCrossAxis ? Math.min(size, maxSize) : (maxSize <= size && getVisibleLinesCount() <= 1) ? maxSize : size;
        }
        if (mode != 0) {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown size mode is set: " + mode);
            }
        }
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getState(int mode, int state, int size, int maxSize, int tooSmallState) {
        return (mode != 0 && size < maxSize) ? View.combineMeasuredStates(state, tooSmallState) : state;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int crossSize = 0;
        while (it.hasNext()) {
            crossSize += ((WrapLine) it.next()).getCrossSize();
        }
        return crossSize + getEdgeLineSeparatorsLength() + (getBetweenLinesSpacing() * (getVisibleLinesCount() - 1));
    }

    private final int getTopOffsetForHorizontalLayout(View view, WrapLine line) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int verticalGravity = DivViewGroup.INSTANCE.toVerticalGravity(divLayoutParams.getGravity());
        return verticalGravity != 16 ? verticalGravity != 80 ? divLayoutParams.getIsBaselineAligned() ? Math.max(line.getMaxBaseline() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) : ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin : (line.getCrossSize() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : (((line.getCrossSize() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.lines;
        int i10 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((WrapLine) it.next()).getItemCountNotGone() > 0 && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    private final boolean isHidden(View view) {
        return view.getVisibility() == 8 || getHasIncorrectSize(view);
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final boolean isWrapRequired(int mode, int maxSize, int currentLength, int childLength, int lineItemsCount) {
        return mode != 0 && maxSize < (currentLength + childLength) + (lineItemsCount != 0 ? getBetweenItemsSpacing() : 0);
    }

    private final void layoutHorizontal(int left, int right) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getHorizontalGravity$div_release(), ViewCompat.getLayoutDirection(this));
        boolean z10 = false;
        for (WrapLine wrapLine : this.lines) {
            float mainSize = (right - left) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, absoluteGravity, wrapLine.getItemCountNotGone());
            float paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z10) {
                    paddingTop += getBetweenLinesSpacing();
                }
                z10 = true;
            }
            d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
            int iE = indices.e();
            int iF = indices.f();
            int iG = indices.g();
            if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
                boolean z11 = false;
                while (true) {
                    View childAt = getChildAt(iE);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        float betweenItemsSpacing = paddingLeft + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z11) {
                            betweenItemsSpacing += getBetweenItemsSpacing();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(childAt, wrapLine) + paddingTop;
                        childAt.layout(a.d(betweenItemsSpacing), topOffsetForHorizontalLayout, a.d(betweenItemsSpacing) + childAt.getMeasuredWidth(), topOffsetForHorizontalLayout + childAt.getMeasuredHeight());
                        paddingLeft = betweenItemsSpacing + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + wrapLine.getSpaceBetweenChildren();
                        z11 = true;
                    } else if (getHasIncorrectSize(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                    if (iE != iF) {
                        iE += iG;
                    }
                }
            }
            paddingTop += wrapLine.getCrossSize();
            wrapLine.setRight(a.d(paddingLeft));
            wrapLine.setBottom(paddingTop);
        }
    }

    private final void layoutVertical(int top, int bottom) {
        int paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((IntIterator) it).nextInt());
            float mainSize = (bottom - top) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, getVerticalGravity$div_release(), wrapLine.getItemCountNotGone());
            float paddingTop = getPaddingTop() + getStartSeparatorLength() + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z10) {
                    paddingLeft += getBetweenLinesSpacing();
                }
                z10 = true;
            }
            int itemCount = wrapLine.getItemCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < itemCount; i10++) {
                View childAt = getChildAt(wrapLine.getFirstIndex() + i10);
                if (childAt != null && !isHidden(childAt)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    float betweenItemsSpacing = paddingTop + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z11) {
                        betweenItemsSpacing += getBetweenItemsSpacing();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(childAt, wrapLine.getCrossSize()) + paddingLeft;
                    childAt.layout(leftOffsetForVerticalLayout, a.d(betweenItemsSpacing), childAt.getMeasuredWidth() + leftOffsetForVerticalLayout, a.d(betweenItemsSpacing) + childAt.getMeasuredHeight());
                    paddingTop = betweenItemsSpacing + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + wrapLine.getSpaceBetweenChildren();
                    z11 = true;
                } else if (getHasIncorrectSize(childAt)) {
                    childAt.layout(0, 0, 0, 0);
                }
            }
            paddingLeft += wrapLine.getCrossSize();
            wrapLine.setRight(paddingLeft);
            wrapLine.setBottom(a.d(paddingTop));
        }
    }

    private final boolean showLeftSeparator(int mode) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtEnd(mode) : showSeparatorAtStart(mode);
    }

    private final boolean showRightSeparator(int mode) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtStart(mode) : showSeparatorAtEnd(mode);
    }

    private final boolean showSeparatorAtEnd(int mode) {
        return (mode & 4) != 0;
    }

    private final boolean showSeparatorAtStart(int mode) {
        return (mode & 1) != 0;
    }

    private final boolean showSeparatorBetween(int mode) {
        return (mode & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        return firstVisibleLine != null ? firstVisibleLine.getMaxBaseline() + getPaddingTop() : super.getBaseline();
    }

    @Nullable
    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable.getValue(this, $$delegatedProperties[3]);
    }

    @Nullable
    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable.getValue(this, $$delegatedProperties[2]);
    }

    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getShowSeparators() {
        return ((Number) this.showSeparators.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isRowDirection) {
            layoutHorizontal(left, right);
        } else {
            layoutVertical(top, bottom);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMakeMeasureSpec;
        int mode;
        int size;
        int i10;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int iD = a.d(size2 / getAspectRatio());
            size = iD;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iD, 1073741824);
            mode = 1073741824;
        } else {
            iMakeMeasureSpec = heightMeasureSpec;
            mode = View.MeasureSpec.getMode(heightMeasureSpec);
            size = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        calculateLines(widthMeasureSpec, iMakeMeasureSpec);
        if (this.isRowDirection) {
            determineCrossSize(iMakeMeasureSpec, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(widthMeasureSpec, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int sumOfCrossSize = this.isRowDirection ? getSumOfCrossSize() + getVerticalPaddings$div_release() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, 16777216);
        int iResolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), widthMeasureSpec, this.childState);
        if (!this.isRowDirection || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i10 = mode;
        } else {
            size = a.d((16777215 & iResolveSizeAndState) / getAspectRatio());
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i10 = 1073741824;
        }
        int i11 = size;
        this.childState = getState(i10, this.childState, i11, sumOfCrossSize, 256);
        setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(getSize(i10, i11, sumOfCrossSize, this.isRowDirection), iMakeMeasureSpec, this.childState));
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio.setValue(this, $$delegatedProperties[4], Float.valueOf(f10));
    }

    public final void setItemSpacing(int px) {
        if (this.itemSpacingPx != px) {
            this.itemSpacingPx = px;
            requestLayout();
        }
    }

    public final void setLineSeparatorDrawable(@Nullable Drawable drawable) {
        this.lineSeparatorDrawable.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setLineSeparatorMargins(int left, int top, int right, int bottom) {
        this.lineSeparatorMarginLeft = left;
        this.lineSeparatorMarginRight = right;
        this.lineSeparatorMarginTop = top;
        this.lineSeparatorMarginBottom = bottom;
        requestLayout();
    }

    public final void setLineSpacing(int px) {
        if (this.lineSpacingPx != px) {
            this.lineSpacingPx = px;
            requestLayout();
        }
    }

    public final void setSeparatorDrawable(@Nullable Drawable drawable) {
        this.separatorDrawable.setValue(this, $$delegatedProperties[2], drawable);
    }

    public final void setSeparatorMargins(int left, int top, int right, int bottom) {
        this.separatorMarginLeft = left;
        this.separatorMarginRight = right;
        this.separatorMarginTop = top;
        this.separatorMarginBottom = bottom;
        requestLayout();
    }

    public final void setShowLineSeparators(int i10) {
        this.showLineSeparators.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    public final void setShowSeparators(int i10) {
        this.showSeparators.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setWrapDirection(int i10) {
        if (this.wrapDirection != i10) {
            this.wrapDirection = i10;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.wrapDirection);
                }
                z10 = false;
            }
            this.isRowDirection = z10;
            requestLayout();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u0015R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u0015R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u0015R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u0015R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u0015R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010\fR\u0011\u00106\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "", "", "firstIndex", "mainSize", "itemCount", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFirstIndex", "getMainSize", "setMainSize", "(I)V", "getItemCount", "setItemCount", "crossSize", "getCrossSize", "setCrossSize", "maxBaseline", "getMaxBaseline", "setMaxBaseline", "maxHeightUnderBaseline", "getMaxHeightUnderBaseline", "setMaxHeightUnderBaseline", "right", "getRight", "setRight", "bottom", "getBottom", "setBottom", "goneItemCount", "getGoneItemCount", "setGoneItemCount", "edgeSeparatorOffset", "getEdgeSeparatorOffset", "setEdgeSeparatorOffset", "", "spaceBetweenChildren", "F", "getSpaceBetweenChildren", "()F", "setSpaceBetweenChildren", "(F)V", "getItemCountNotGone", "itemCountNotGone", C4329g8.f43166k, "()Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class WrapLine {
        private int bottom;
        private int crossSize;
        private int edgeSeparatorOffset;
        private final int firstIndex;
        private int goneItemCount;
        private int itemCount;
        private int mainSize;
        private int maxBaseline;
        private int maxHeightUnderBaseline;
        private int right;
        private float spaceBetweenChildren;

        public WrapLine(int i10, int i11, int i12) {
            this.firstIndex = i10;
            this.mainSize = i11;
            this.itemCount = i12;
            this.maxBaseline = -1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) other;
            return this.firstIndex == wrapLine.firstIndex && this.mainSize == wrapLine.mainSize && this.itemCount == wrapLine.itemCount;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getCrossSize() {
            return this.crossSize;
        }

        public final int getEdgeSeparatorOffset() {
            return this.edgeSeparatorOffset;
        }

        public final int getFirstIndex() {
            return this.firstIndex;
        }

        public final int getGoneItemCount() {
            return this.goneItemCount;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final int getItemCountNotGone() {
            return this.itemCount - this.goneItemCount;
        }

        public final int getMainSize() {
            return this.mainSize;
        }

        public final int getMaxBaseline() {
            return this.maxBaseline;
        }

        public final int getMaxHeightUnderBaseline() {
            return this.maxHeightUnderBaseline;
        }

        public final int getRight() {
            return this.right;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public int hashCode() {
            return (((this.firstIndex * 31) + this.mainSize) * 31) + this.itemCount;
        }

        public final boolean isVisible() {
            return getItemCountNotGone() > 0;
        }

        public final void setBottom(int i10) {
            this.bottom = i10;
        }

        public final void setCrossSize(int i10) {
            this.crossSize = i10;
        }

        public final void setEdgeSeparatorOffset(int i10) {
            this.edgeSeparatorOffset = i10;
        }

        public final void setGoneItemCount(int i10) {
            this.goneItemCount = i10;
        }

        public final void setItemCount(int i10) {
            this.itemCount = i10;
        }

        public final void setMainSize(int i10) {
            this.mainSize = i10;
        }

        public final void setMaxBaseline(int i10) {
            this.maxBaseline = i10;
        }

        public final void setMaxHeightUnderBaseline(int i10) {
            this.maxHeightUnderBaseline = i10;
        }

        public final void setRight(int i10) {
            this.right = i10;
        }

        public final void setSpaceBetweenChildren(float f10) {
            this.spaceBetweenChildren = f10;
        }

        @NotNull
        public String toString() {
            return "WrapLine(firstIndex=" + this.firstIndex + ", mainSize=" + this.mainSize + ", itemCount=" + this.itemCount + ')';
        }

        public /* synthetic */ WrapLine(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
        }
    }

    private final Unit drawSeparator(Drawable separator, Canvas canvas, int left, int top, int right, int bottom) {
        if (separator == null) {
            return null;
        }
        float f10 = (left + right) / 2.0f;
        float f11 = (top + bottom) / 2.0f;
        float intrinsicWidth = separator.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = separator.getIntrinsicHeight() / 2.0f;
        separator.setBounds((int) (f10 - intrinsicWidth), (int) (f11 - intrinsicHeight), (int) (f10 + intrinsicWidth), (int) (f11 + intrinsicHeight));
        separator.draw(canvas);
        return Unit.f93236a;
    }
}
