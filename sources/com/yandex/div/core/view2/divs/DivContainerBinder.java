package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.e9;
import k8.ep;
import k8.f7;
import k8.f9;
import k8.hb;
import k8.jp;
import k8.k8;
import k8.u8;
import k8.w6;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B=\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010!\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J[\u0010'\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(JS\u0010*\u001a\u00020\u001c*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J9\u0010-\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.JI\u00100\u001a\b\u0012\u0004\u0012\u00020$0#*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u00101J1\u00106\u001a\b\u0012\u0004\u0012\u0002020#*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107JE\u0010<\u001a\u00020\u001c*\u0002082\u0006\u00109\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002022\u0006\u0010,\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010=J7\u0010A\u001a\u00020\u001c*\u00020\u00042\u0006\u0010?\u001a\u00020>2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\bA\u0010BJ5\u0010D\u001a\u00020\u001c*\u00020C2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u001c*\u00020C2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bF\u0010GJ-\u0010I\u001a\u00020\u001c*\u00020H2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bI\u0010JJ5\u0010D\u001a\u00020\u001c*\u00020H2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010KJ-\u0010F\u001a\u00020\u001c*\u00020H2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bF\u0010JJ-\u0010L\u001a\u00020\u001c*\u00020H2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bL\u0010JJW\u0010S\u001a\u00020\u001c*\u0002082\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010N\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u00010M2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u00162\u0006\u0010R\u001a\u00020Q2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bS\u0010TJ3\u0010U\u001a\u00020\u001c*\u0002082\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00103\u001a\u00020M2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u0016H\u0002¢\u0006\u0004\bU\u0010VJ+\u0010W\u001a\u00020\u001c*\u00020\u00032\u0006\u00103\u001a\u00020M2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010XJ#\u0010W\u001a\u00020\u001c*\u00020Y2\u0006\u00103\u001a\u00020M2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010ZJ+\u0010[\u001a\u00020\u001c*\u00020\u00032\u0006\u00103\u001a\u00020M2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b[\u0010XJ#\u0010[\u001a\u00020\u001c*\u00020Y2\u0006\u00103\u001a\u00020M2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b[\u0010ZJ3\u0010_\u001a\u00020\u001c*\u00020Y2\u0006\u00103\u001a\u00020M2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0002¢\u0006\u0004\b_\u0010`J%\u0010e\u001a\u00020d*\u0004\u0018\u00010a2\u0006\u0010c\u001a\u00020b2\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010h\u001a\u000204*\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u000204*\u00020gH\u0002¢\u0006\u0004\bj\u0010iJ\u001d\u0010l\u001a\u000204*\u0004\u0018\u00010k2\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u001a2\b\b\u0001\u0010]\u001a\u000204H\u0002¢\u0006\u0004\bn\u0010oJ'\u0010p\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bp\u0010qJ'\u0010r\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\br\u0010qJ/\u0010t\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bt\u0010uJ-\u0010v\u001a\u00020\u001c*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bv\u0010wR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010xR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010yR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010zR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010yR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010{R\u0014\u0010|\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}¨\u0006~"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$c;", "Lk8/u8;", "Landroid/view/ViewGroup;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lkf/a;", "Lcom/yandex/div/core/view2/DivViewCreator;", "divViewCreator", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divPatchManager", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lkf/a;Lcom/yandex/div/core/downloader/DivPatchManager;Lkf/a;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "div", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "oldResolver", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "shouldBindItemBuilder", "", "bindItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/state/DivStatePath;Z)V", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "bindItemBuilder", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", FirebaseAnalytics.Param.ITEMS, "oldItems", "applyItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lk8/u8;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindingContext", "dispatchItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lk8/u8;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)V", "resolver", "validateChildren", "(Landroid/view/ViewGroup;Lk8/u8;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "newDiv", "dispatchBinding", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lk8/u8;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)Ljava/util/List;", "Lk8/y0;", "childDiv", "", "childIndex", "applyPatchToChild", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;I)Ljava/util/List;", "Landroid/view/View;", "parentContext", "parentDiv", "oldParentDiv", "bindChild", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/u8;Lk8/u8;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "newItems", "replaceWithReuse", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Ljava/util/List;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;", "bindProperties", "(Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;Lk8/u8;Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindSeparator", "(Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;Lk8/u8;Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "bindLineSpacing", "(Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;Lk8/u8;Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "(Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;Lk8/u8;Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindLineSeparator", "Lk8/f7;", "newChildDiv", "oldChildDiv", "childResolver", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "bindChildAlignment", "(Landroid/view/View;Lk8/u8;Lk8/u8;Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lcom/yandex/div/core/view2/Div2View;)V", "applyChildAlignment", "(Landroid/view/View;Lk8/u8;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "checkCrossAxisSize", "(Lk8/u8;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lk8/ep;", "(Lk8/ep;Lk8/f7;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "checkMainAxisSize", "", C4240b4.a.f42515t, "axis", "checkSize", "(Lk8/ep;Lk8/f7;Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;Ljava/lang/String;)V", "Lk8/hb;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "toRect", "(Lk8/hb;Landroid/content/res/Resources;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/Rect;", "Lk8/u8$d;", "toOrientationMode", "(Lk8/u8$d;)I", "toWrapDirection", "Lk8/u8$e;", "toSeparatorMode", "(Lk8/u8$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "showSeparatorBetween", "(I)Z", "checkItemSpacingIgnored", "(Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "checkLineSpacingIgnored", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/ViewGroup;Lk8/y0$c;Lcom/yandex/div/core/state/DivStatePath;)V", "bind", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lk8/u8;Lk8/u8;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lkf/a;", "Lcom/yandex/div/core/downloader/DivPatchManager;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "tempRect", "Landroid/graphics/Rect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivContainerBinder extends DivViewBinder<y0.c, u8, ViewGroup> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final kf.a divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final kf.a divViewCreator;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Rect tempRect;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[u8.d.values().length];
            try {
                iArr[u8.d.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivContainerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull kf.a aVar, @NotNull DivPatchManager divPatchManager, @NotNull kf.a aVar2, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divViewCreator = aVar;
        this.divPatchManager = divPatchManager;
        this.divBinder = aVar2;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, u8 u8Var, f7 f7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Expression expressionG = f7Var.g();
        z5 alignmentVertical = null;
        y5 alignmentHorizontal = expressionG != null ? (y5) expressionG.evaluate(expressionResolver2) : DivUtilKt.isWrapContainer(u8Var, expressionResolver) ? null : DivUtilKt.toAlignmentHorizontal((e9) u8Var.f91605o.evaluate(expressionResolver));
        Expression expressionM = f7Var.m();
        if (expressionM != null) {
            alignmentVertical = (z5) expressionM.evaluate(expressionResolver2);
        } else if (!DivUtilKt.isWrapContainer(u8Var, expressionResolver)) {
            alignmentVertical = DivUtilKt.toAlignmentVertical((f9) u8Var.f91606p.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, alignmentHorizontal, alignmentVertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, u8 u8Var, u8 u8Var2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, u8Var, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, u8Var, u8Var2, list, list2, divStatePath);
    }

    private final List<y0> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, y0 y0Var, int i10) {
        String id2 = y0Var.c().getId();
        if (id2 == null) {
            return CollectionsKt.listOf(y0Var);
        }
        Map<y0, View> mapCreateViewsForId = this.divPatchManager.createViewsForId(bindingContext, id2);
        if (mapCreateViewsForId == null) {
            return CollectionsKt.listOf(y0Var);
        }
        viewGroup.removeViewAt(i10);
        Iterator<Map.Entry<y0, View>> it = mapCreateViewsForId.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            viewGroup.addView(it.next().getValue(), i11 + i10);
            i11++;
        }
        return CollectionsKt.toList(mapCreateViewsForId.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, y0 y0Var, ExpressionResolver expressionResolver, u8 u8Var, u8 u8Var2, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        y0 div = divHolderView != null ? divHolderView.getDiv() : null;
        Div2View divView = bindingContext.getDivView();
        ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = divView.getRuntimeStore().resolveRuntimeWith(divView, divStatePath, y0Var, expressionResolver, bindingContext.getExpressionResolver());
        ((DivBinder) this.divBinder.get()).bind(bindingContext.getFor(expressionResolver), view, y0Var, divStatePath);
        bindChildAlignment(view, u8Var, u8Var2, y0Var.c(), div != null ? div.c() : null, bindingContext.getExpressionResolver(), (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver2 = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) ? expressionResolver : expressionResolver2, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (DivUtilKt.getHasSightActions(y0Var.c())) {
            divView.bindViewToDiv$div_release(view, y0Var);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    private final void bindChildAlignment(final View view, final u8 u8Var, u8 u8Var2, final f7 f7Var, f7 f7Var2, final ExpressionResolver expressionResolver, final ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && f7Var2 != null) {
            if (ExpressionsKt.equalsToConstant(u8Var.f91605o, u8Var2 != null ? u8Var2.f91605o : null)) {
                if (ExpressionsKt.equalsToConstant(u8Var.f91606p, u8Var2 != null ? u8Var2.f91606p : null) && ExpressionsKt.equalsToConstant(f7Var.g(), f7Var2.g()) && ExpressionsKt.equalsToConstant(f7Var.m(), f7Var2.m())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, u8Var, f7Var, expressionResolver, expressionResolver2);
        if (ExpressionsKt.isConstant(u8Var.f91605o) && ExpressionsKt.isConstant(u8Var.f91606p) && ExpressionsKt.isConstantOrNull(f7Var.g()) && ExpressionsKt.isConstantOrNull(f7Var.m())) {
            return;
        }
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
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
                this.this$0.applyChildAlignment(view, u8Var, f7Var, expressionResolver, expressionResolver2);
            }
        };
        expressionSubscriber.addSubscription(u8Var.f91605o.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(u8Var.f91606p.observe(expressionResolver, function1));
        Expression expressionG = f7Var.g();
        expressionSubscriber.addSubscription(expressionG != null ? expressionG.observe(expressionResolver2, function1) : null);
        Expression expressionM = f7Var.m();
        expressionSubscriber.addSubscription(expressionM != null ? expressionM.observe(expressionResolver2, function1) : null);
    }

    private final void bindItemBuilder(final ViewGroup viewGroup, final BindingContext bindingContext, final u8 u8Var, final DivStatePath divStatePath, final ErrorCollector errorCollector) {
        final k8 k8Var = u8Var.f91616z;
        if (k8Var == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(k8Var, bindingContext.getExpressionResolver(), new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindItemBuilder.1
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
                List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(k8Var, bindingContext.getExpressionResolver());
                ViewParent viewParent = viewGroup;
                Intrinsics.checkNotNull(viewParent, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
                List<DivItemBuilderResult> items = ((DivCollectionHolder) viewParent).getItems();
                if (items == null) {
                    items = CollectionsKt.emptyList();
                }
                List<DivItemBuilderResult> list = items;
                this.replaceWithReuse(viewGroup, bindingContext.getDivView(), list, listBuild);
                DivContainerBinder divContainerBinder = this;
                ViewGroup viewGroup2 = viewGroup;
                BindingContext bindingContext2 = bindingContext;
                u8 u8Var2 = u8Var;
                divContainerBinder.applyItems(viewGroup2, bindingContext2, u8Var2, u8Var2, listBuild, list, divStatePath, errorCollector);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r0, r2, r9, null, 4, null) == false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindItems(android.view.ViewGroup r13, com.yandex.div.core.view2.BindingContext r14, k8.u8 r15, k8.u8 r16, com.yandex.div.json.expressions.ExpressionResolver r17, com.yandex.div.core.state.DivStatePath r18, boolean r19) {
        /*
            r12 = this;
            r1 = r16
            com.yandex.div.core.view2.Div2View r8 = r14.getDivView()
            com.yandex.div.json.expressions.ExpressionResolver r0 = r14.getExpressionResolver()
            java.util.List r9 = com.yandex.div.internal.core.DivCollectionExtensionsKt.buildItems(r15, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r0)
            r0 = r13
            com.yandex.div.core.view2.divs.widgets.DivCollectionHolder r0 = (com.yandex.div.core.view2.divs.widgets.DivCollectionHolder) r0
            java.util.List r10 = r0.getItems()
            if (r10 != 0) goto L4a
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            com.yandex.div.internal.core.DivItemBuilderResult r2 = (com.yandex.div.internal.core.DivItemBuilderResult) r2
            kf.a r4 = r12.divViewCreator
            java.lang.Object r4 = r4.get()
            com.yandex.div.core.view2.DivViewCreator r4 = (com.yandex.div.core.view2.DivViewCreator) r4
            k8.y0 r5 = r2.getDiv()
            com.yandex.div.json.expressions.ExpressionResolver r2 = r2.getExpressionResolver()
            android.view.View r2 = r4.create(r5, r2)
            r13.addView(r2)
            goto L23
        L47:
            r6 = r9
            r2 = r10
            goto L7f
        L4a:
            if (r15 == r1) goto L47
            boolean r0 = r8.getComplexRebindInProgress$div_release()
            r11 = 0
            if (r0 == 0) goto L56
            r6 = r9
        L54:
            r10 = r11
            goto L80
        L56:
            if (r1 == 0) goto L79
            com.yandex.div.core.view2.animations.DivComparator r0 = com.yandex.div.core.view2.animations.DivComparator.INSTANCE
            com.yandex.div.json.expressions.ExpressionResolver r4 = r14.getExpressionResolver()
            r6 = 16
            r7 = 0
            r5 = 0
            r2 = r15
            r3 = r17
            boolean r3 = com.yandex.div.core.view2.animations.DivComparator.areValuesReplaceable$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r3 == 0) goto L79
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r0
            r3 = r9
            r2 = r10
            boolean r0 = com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r1, r2, r3, r4, r5, r6)
            r6 = r3
            if (r0 != 0) goto L7f
            goto L7b
        L79:
            r6 = r9
            r2 = r10
        L7b:
            r12.replaceWithReuse(r13, r8, r2, r6)
            goto L54
        L7f:
            r10 = r2
        L80:
            com.yandex.div.core.view2.errors.ErrorCollectors r0 = r12.errorCollectors
            com.yandex.div.DivDataTag r1 = r8.getDataTag()
            k8.ea r2 = r8.getDivData()
            com.yandex.div.core.view2.errors.ErrorCollector r8 = r0.getOrCreate(r1, r2)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            if (r19 == 0) goto L9a
            r4 = r18
            r5 = r8
            r0.bindItemBuilder(r1, r2, r3, r4, r5)
        L9a:
            r4 = r16
            r7 = r18
            r5 = r6
            r6 = r10
            r0.applyItems(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindItems(android.view.ViewGroup, com.yandex.div.core.view2.BindingContext, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.state.DivStatePath, boolean):void");
    }

    static /* synthetic */ void bindItems$default(DivContainerBinder divContainerBinder, ViewGroup viewGroup, BindingContext bindingContext, u8 u8Var, u8 u8Var2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z10, int i10, Object obj) {
        divContainerBinder.bindItems(viewGroup, bindingContext, u8Var, u8Var2, expressionResolver, divStatePath, (i10 & 32) != 0 ? true : z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindLineSeparator(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r11, k8.u8 r12, k8.u8 r13, final com.yandex.div.json.expressions.ExpressionResolver r14) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindLineSeparator(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void bindLineSpacing(final DivWrapLayout divWrapLayout, u8 u8Var, u8 u8Var2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(u8Var.F, u8Var2 != null ? u8Var2.F : null)) {
            return;
        }
        final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
        divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx((Long) u8Var.F.evaluate(expressionResolver), displayMetrics));
        if (ExpressionsKt.isConstant(u8Var.F)) {
            return;
        }
        divWrapLayout.addSubscription(u8Var.F.observe(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder.bindLineSpacing.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics));
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindProperties(final com.yandex.div.core.view2.divs.widgets.DivLinearLayout r4, final k8.u8 r5, k8.u8 r6, final com.yandex.div.json.expressions.ExpressionResolver r7, com.yandex.div.core.view2.errors.ErrorCollector r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindProperties(com.yandex.div.core.view2.divs.widgets.DivLinearLayout, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindSeparator(final com.yandex.div.core.view2.divs.widgets.DivLinearLayout r11, k8.u8 r12, k8.u8 r13, final com.yandex.div.json.expressions.ExpressionResolver r14) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindSeparator(com.yandex.div.core.view2.divs.widgets.DivLinearLayout, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void checkCrossAxisSize(u8 u8Var, f7 f7Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(u8Var, expressionResolver)) {
            checkCrossAxisSize(f7Var.getHeight(), f7Var, errorCollector);
        } else {
            checkCrossAxisSize(f7Var.getWidth(), f7Var, errorCollector);
        }
    }

    private final void checkItemSpacingIgnored(u8 div, ExpressionResolver resolver, ErrorCollector errorCollector) {
        long jLongValue = ((Number) div.A.evaluate(resolver)).longValue();
        if (!showSeparatorBetween(toSeparatorMode(div.P, resolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    private final void checkLineSpacingIgnored(u8 div, ExpressionResolver resolver, ErrorCollector errorCollector) {
        long jLongValue = ((Number) div.F.evaluate(resolver)).longValue();
        if (!showSeparatorBetween(toSeparatorMode(div.E, resolver)) || jLongValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
    }

    private final void checkMainAxisSize(u8 u8Var, f7 f7Var, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(u8Var, expressionResolver)) {
            if (u8Var.getWidth() instanceof ep.e) {
                checkMainAxisSize(f7Var.getWidth(), f7Var, errorCollector);
            }
        } else if (u8Var.getHeight() instanceof ep.e) {
            w6 w6Var = u8Var.f91599i;
            if (w6Var == null || ((float) ((Number) w6Var.f92110a.evaluate(expressionResolver)).doubleValue()) == 0.0f) {
                checkMainAxisSize(f7Var.getHeight(), f7Var, errorCollector);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void checkSize(k8.ep r4, k8.f7 r5, com.yandex.div.core.view2.errors.ErrorCollector r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            r0 = 3
            boolean r4 = r4 instanceof k8.ep.d
            if (r4 == 0) goto L47
            java.lang.String r4 = r5.getId()
            if (r4 == 0) goto L23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = " with id='"
            r5.append(r1)
            r5.append(r4)
            r4 = 39
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            if (r4 != 0) goto L25
        L23:
            java.lang.String r4 = ""
        L25:
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r4
            r4 = 2
            r1[r4] = r8
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r7 = "Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis."
            java.lang.String r4 = java.lang.String.format(r7, r4)
            java.lang.String r7 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            r5.<init>(r4)
            r6.logWarning(r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.checkSize(k8.ep, k8.f7, com.yandex.div.core.view2.errors.ErrorCollector, java.lang.String, java.lang.String):void");
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, u8 u8Var, u8 u8Var2, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        u8 u8Var3 = u8Var;
        int i10 = 0;
        if (u8Var3.f91616z == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int size = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<y0> listApplyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i11 + size);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listApplyPatchToChild, 10));
                Iterator<T> it = listApplyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((y0) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                size += arrayList2.size() - 1;
                CollectionsKt.addAll(arrayList, arrayList2);
                i11 = i12;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        DivContainerBinder divContainerBinder = this;
        BindingContext bindingContext2 = bindingContext;
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(list2);
        for (Object obj2 : list2) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            divContainerBinder.bindChild(viewGroup.getChildAt(i10), bindingContext2, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), u8Var3, u8Var2, divStatePath.appendDiv(itemIds.get(i10)));
            divContainerBinder = this;
            bindingContext2 = bindingContext;
            u8Var3 = u8Var;
            i10 = i13;
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, u8 u8Var, u8 u8Var2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> listDispatchBinding = dispatchBinding(viewGroup, bindingContext, u8Var, u8Var2, list, divStatePath);
        Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        ((DivCollectionHolder) viewGroup).setItems(listDispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), listDispatchBinding, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<DivItemBuilderResult> list3 = list;
        List listC0 = k.c0(ViewGroupKt.getChildren(viewGroup));
        Iterator<T> it = list3.iterator();
        Iterator it2 = listC0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list3, 10), CollectionsKt.collectionSizeOrDefault(listC0, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(Unit.f93236a);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        int i10 = 0;
        while (true) {
            Object obj = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) next2;
            Iterator it4 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                y0 y0Var = (y0) next3;
                if (DivUtilKt.isBranch(y0Var) ? Intrinsics.areEqual(DivUtilKt.getType(divItemBuilderResult.getDiv()), DivUtilKt.getType(y0Var)) : DivUtilKt.canBeReused(y0Var, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                    obj = next3;
                    break;
                }
            }
            View view = (View) b1.d(linkedHashMap).remove((y0) obj);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            int iIntValue = ((Number) it5.next()).intValue();
            DivItemBuilderResult divItemBuilderResult2 = list2.get(iIntValue);
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it6.next();
                    if (Intrinsics.areEqual(DivUtilKt.getType((y0) next), DivUtilKt.getType(divItemBuilderResult2.getDiv()))) {
                        break;
                    }
                }
            }
            View viewCreate = (View) b1.d(linkedHashMap).remove((y0) next);
            if (viewCreate == null) {
                viewCreate = ((DivViewCreator) this.divViewCreator.get()).create(divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver());
            }
            viewGroup.addView(viewCreate, iIntValue);
        }
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it7.next());
        }
    }

    private final boolean showSeparatorBetween(int mode) {
        return (mode & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(u8.d dVar) {
        return WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(hb hbVar, Resources resources, ExpressionResolver expressionResolver) {
        if (hbVar == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        jp jpVar = (jp) hbVar.f88006g.evaluate(expressionResolver);
        if (hbVar.f88004e == null && hbVar.f88001b == null) {
            this.tempRect.left = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88002c.evaluate(expressionResolver), displayMetrics, jpVar);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88003d.evaluate(expressionResolver), displayMetrics, jpVar);
        } else {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Rect rect = this.tempRect;
                Expression expression = hbVar.f88004e;
                rect.left = BaseDivViewExtensionsKt.unitToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics, jpVar);
                Rect rect2 = this.tempRect;
                Expression expression2 = hbVar.f88001b;
                rect2.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics, jpVar);
            } else {
                Rect rect3 = this.tempRect;
                Expression expression3 = hbVar.f88001b;
                rect3.left = BaseDivViewExtensionsKt.unitToPx(expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null, displayMetrics, jpVar);
                Rect rect4 = this.tempRect;
                Expression expression4 = hbVar.f88004e;
                rect4.right = BaseDivViewExtensionsKt.unitToPx(expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null, displayMetrics, jpVar);
            }
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88005f.evaluate(expressionResolver), displayMetrics, jpVar);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88000a.evaluate(expressionResolver), displayMetrics, jpVar);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int toSeparatorMode(u8.e eVar, ExpressionResolver expressionResolver) {
        if (eVar == null) {
            return 0;
        }
        boolean zBooleanValue = ((Boolean) eVar.f91644c.evaluate(expressionResolver)).booleanValue();
        ?? r02 = zBooleanValue;
        if (((Boolean) eVar.f91645d.evaluate(expressionResolver)).booleanValue()) {
            r02 = (zBooleanValue ? 1 : 0) | 2;
        }
        return ((Boolean) eVar.f91643b.evaluate(expressionResolver)).booleanValue() ? r02 | 4 : r02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(u8.d dVar) {
        return WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()] == 1 ? 0 : 1;
    }

    private final void validateChildren(ViewGroup viewGroup, u8 u8Var, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f7 f7VarC = ((DivItemBuilderResult) it.next()).getDiv().c();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(u8Var, f7VarC, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(u8Var, f7VarC, expressionResolver, errorCollector);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bindView(@NotNull BindingContext context, @NotNull ViewGroup view, @NotNull y0.c div, @NotNull DivStatePath path) {
        ExpressionResolver oldExpressionResolver$div_release;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div.Container>");
        DivHolderView divHolderView = (DivHolderView) view;
        y0.c cVar = (y0.c) divHolderView.getDiv();
        BindingContext bindingContext = divHolderView.getBindingContext();
        if (bindingContext == null || (oldExpressionResolver$div_release = bindingContext.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = context.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (div == cVar) {
            bindItems(view, context, div.d(), cVar.d(), expressionResolver, path, false);
            return;
        }
        this.baseBinder.bindView(context, view, div, cVar);
        bind(view, context, div.d(), cVar != null ? cVar.d() : null);
        Iterator it = ViewGroupKt.getChildren(view).iterator();
        while (it.hasNext()) {
            context.getDivView().unbindViewFromDiv$div_release((View) it.next());
        }
        bindItems$default(this, view, context, div.d(), cVar != null ? cVar.d() : null, expressionResolver, path, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull ViewGroup viewGroup, @NotNull BindingContext bindingContext, @NotNull u8 u8Var, @Nullable u8 u8Var2) {
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, u8Var.f91589b, u8Var.f91593d, u8Var.G, u8Var.f91608r, u8Var.f91614x, u8Var.f91613w, u8Var.L, u8Var.K, u8Var.f91591c, u8Var.f91602l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, u8Var.f91599i, u8Var2 != null ? u8Var2.f91599i : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, u8Var.f91603m, u8Var2 != null ? u8Var2.f91603m : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, u8Var, u8Var2, expressionResolver, orCreate);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, u8Var, u8Var2, expressionResolver, orCreate);
        }
    }

    private final void checkCrossAxisSize(ep epVar, f7 f7Var, ErrorCollector errorCollector) {
        checkSize(epVar, f7Var, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkMainAxisSize(ep epVar, f7 f7Var, ErrorCollector errorCollector) {
        checkSize(epVar, f7Var, errorCollector, "wrap_content size", C4240b4.i.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindProperties(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r4, final k8.u8 r5, k8.u8 r6, final com.yandex.div.json.expressions.ExpressionResolver r7, com.yandex.div.core.view2.errors.ErrorCollector r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindProperties(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.core.view2.errors.ErrorCollector):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindSeparator(final com.yandex.div.core.view2.divs.widgets.DivWrapLayout r11, k8.u8 r12, k8.u8 r13, final com.yandex.div.json.expressions.ExpressionResolver r14) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.bindSeparator(com.yandex.div.core.view2.divs.widgets.DivWrapLayout, k8.u8, k8.u8, com.yandex.div.json.expressions.ExpressionResolver):void");
    }
}
