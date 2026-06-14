package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import java.util.Iterator;
import java.util.List;
import k8.a6;
import k8.aw;
import k8.c6;
import k8.e9;
import k8.f9;
import k8.j1;
import k8.lq;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 }2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001}B\u007f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#JC\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010,0+*\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J=\u00103\u001a\u000202*\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u00101\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b3\u00104Jc\u0010;\u001a\u000202*\u00020\u00042\u0006\u00105\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00032\u0006\u00101\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u00010\u00032\b\u00107\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u0001082\u0006\u0010(\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b;\u0010<J)\u0010@\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010/\u001a\u0002082\u0006\u0010?\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010AJ1\u0010G\u001a\u000202*\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u0002092\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002¢\u0006\u0004\bG\u0010HJ-\u0010I\u001a\u000202*\u00020\u00042\u0006\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u0010?\u001a\u000209H\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010L\u001a\u0004\u0018\u00010K*\u00020=2\u0006\u0010?\u001a\u000209H\u0002¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\u0004\u0018\u00010N*\u00020=2\u0006\u0010?\u001a\u000209H\u0002¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\u0004\u0018\u00010)2\u0006\u0010%\u001a\u00020$2\u0006\u0010Q\u001a\u00020)H\u0002¢\u0006\u0004\bR\u0010SJ+\u0010U\u001a\u000202*\u00020\u00042\u0006\u0010/\u001a\u00020\u00032\u0006\u00105\u001a\u00020$2\u0006\u0010T\u001a\u00020'H\u0002¢\u0006\u0004\bU\u0010VJ)\u0010X\u001a\u0002022\b\u0010W\u001a\u0004\u0018\u00010=2\u0006\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u000209H\u0002¢\u0006\u0004\bX\u0010YJG\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010%\u001a\u00020$2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020,2\b\u0010\\\u001a\u0004\u0018\u00010,2\b\u0010]\u001a\u0004\u0018\u00010=2\b\u0010W\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u000202*\u00020=H\u0002¢\u0006\u0004\ba\u0010bJC\u0010i\u001a\u0004\u0018\u00010^2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\u0006\u0010[\u001a\u00020,2\b\u0010\\\u001a\u0004\u0018\u00010,2\u0006\u0010g\u001a\u0002092\u0006\u0010h\u001a\u000209H\u0002¢\u0006\u0004\bi\u0010jJ?\u0010k\u001a\u0004\u0018\u00010^2\u0006\u0010%\u001a\u00020$2\u0006\u0010[\u001a\u00020,2\b\u0010\\\u001a\u0004\u0018\u00010,2\b\u0010]\u001a\u0004\u0018\u00010=2\b\u0010W\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bk\u0010lJ/\u0010m\u001a\u0002022\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bm\u0010nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010oR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010qR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010sR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010tR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010uR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010vR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010wR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010xR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010yR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010zR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010{R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010|¨\u0006~"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivStateBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$o;", "Lk8/lq;", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "viewBinder", "Lcom/yandex/div/state/DivStateCache;", "divStateCache", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "temporaryStateCache", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "divActionBeaconSender", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divPatchManager", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "Lcom/yandex/div/core/Div2Logger;", "div2Logger", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "divVisibilityActionTracker", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "variableBinder", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "runtimeVisitor", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkf/a;Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;Lcom/yandex/div/core/downloader/DivPatchManager;Lcom/yandex/div/core/downloader/DivPatchCache;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "id", "Lkotlin/Pair;", "Lk8/lq$c;", "getStates", "(Lk8/lq;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lcom/yandex/div/core/state/DivStatePath;Ljava/lang/String;)Lkotlin/Pair;", "div", "oldDiv", "newState", "", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lcom/yandex/div/core/view2/BindingContext;Lk8/lq;Lk8/lq;Lk8/lq$c;Lcom/yandex/div/core/state/DivStatePath;)V", "bindingContext", "oldDivState", "oldState", "Lk8/y0;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "oldResolver", "bindState", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lcom/yandex/div/core/view2/BindingContext;Lk8/lq;Lk8/lq$c;Lk8/lq;Lk8/lq$c;Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;Ljava/lang/String;)V", "Landroid/view/View;", "reusableIncomingView", "resolver", "getIncomingView", "(Landroid/view/View;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "", "Lk8/j1;", "actions", "swipeOut", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Ljava/util/List;)V", "fixAlignment", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lk8/lq;Lk8/lq;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/f9;", "extractParentContentAlignmentVertical", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/f9;", "Lk8/e9;", "extractParentContentAlignmentHorizontal", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/e9;", "variableName", "getValueFromVariable", "(Lcom/yandex/div/core/view2/BindingContext;Ljava/lang/String;)Ljava/lang/String;", "divStatePath", "observeStateIdVariable", "(Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lk8/lq;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "outgoing", "untrackRecursively", "(Landroid/view/View;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "divState", "incomingState", "outgoingState", "incoming", "Landroidx/transition/Transition;", "replaceViewsAnimated", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/lq;Lk8/lq$c;Lk8/lq$c;Landroid/view/View;Landroid/view/View;)Landroidx/transition/Transition;", "createLayoutParams", "(Landroid/view/View;)V", "Lcom/yandex/div/core/view2/DivTransitionBuilder;", "transitionBuilder", "Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;", "transitionHolder", "incomingResolver", "outgoingResolver", "setupTransitions", "(Lcom/yandex/div/core/view2/DivTransitionBuilder;Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;Lk8/lq$c;Lk8/lq$c;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroidx/transition/Transition;", "setupAnimation", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/lq$c;Lk8/lq$c;Landroid/view/View;Landroid/view/View;)Landroidx/transition/Transition;", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;Lk8/y0$o;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lkf/a;", "Lcom/yandex/div/state/DivStateCache;", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "Lcom/yandex/div/core/downloader/DivPatchManager;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivStateBinder extends DivViewBinder<y0.o, lq, DivStateLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @NotNull
    private final kf.a viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivStateBinder$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivStateBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull kf.a aVar, @NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull DivActionBinder divActionBinder, @NotNull DivActionBeaconSender divActionBeaconSender, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull ErrorCollectors errorCollectors, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull DivRuntimeVisitor divRuntimeVisitor) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.viewBinder = aVar;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = twoWayStringVariableBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    private final void bind(final DivStateLayout divStateLayout, final BindingContext bindingContext, lq lqVar, lq lqVar2, lq.c cVar, DivStatePath divStatePath) {
        BaseDivViewExtensionsKt.applyDivActions(divStateLayout, bindingContext, lqVar.f88859b, lqVar.f88861d, lqVar.f88883z, lqVar.f88874q, lqVar.f88880w, lqVar.f88879v, lqVar.D, lqVar.C, lqVar.f88860c, lqVar.f88868k);
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, lqVar, lqVar2, expressionResolver);
        observeStateIdVariable(divStateLayout, lqVar, bindingContext, divStatePath);
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, lqVar.f88869l, lqVar2 != null ? lqVar2.f88869l : null, expressionResolver);
        final List list = cVar.f88891e;
        divStateLayout.setSwipeOutCallback(list != null ? new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.swipeOut(divStateLayout, bindingContext.getDivView(), expressionResolver, list);
            }
        } : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bindState(com.yandex.div.core.view2.divs.widgets.DivStateLayout r21, com.yandex.div.core.view2.BindingContext r22, k8.lq r23, k8.lq.c r24, k8.lq r25, k8.lq.c r26, k8.y0 r27, com.yandex.div.core.state.DivStatePath r28, com.yandex.div.json.expressions.ExpressionResolver r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivStateBinder.bindState(com.yandex.div.core.view2.divs.widgets.DivStateLayout, com.yandex.div.core.view2.BindingContext, k8.lq, k8.lq$c, k8.lq, k8.lq$c, k8.y0, com.yandex.div.core.state.DivStatePath, com.yandex.div.json.expressions.ExpressionResolver, java.lang.String):void");
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final e9 extractParentContentAlignmentHorizontal(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        y0 div = divHolderView != null ? divHolderView.getDiv() : null;
        y0.c cVar = div instanceof y0.c ? (y0.c) div : null;
        if (cVar == null) {
            return null;
        }
        return (e9) cVar.d().f91605o.evaluate(expressionResolver);
    }

    private final f9 extractParentContentAlignmentVertical(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        y0 div = divHolderView != null ? divHolderView.getDiv() : null;
        y0.c cVar = div instanceof y0.c ? (y0.c) div : null;
        if (cVar == null) {
            return null;
        }
        return (f9) cVar.d().f91606p.evaluate(expressionResolver);
    }

    private final void fixAlignment(DivStateLayout divStateLayout, lq lqVar, lq lqVar2, ExpressionResolver expressionResolver) {
        y5 alignmentHorizontal;
        z5 z5Var;
        Expression expressionG = lqVar.g();
        Expression expressionM = lqVar.m();
        z5 alignmentVertical = null;
        if (Intrinsics.areEqual(expressionG, lqVar2 != null ? lqVar2.g() : null)) {
            if (Intrinsics.areEqual(expressionM, lqVar2 != null ? lqVar2.m() : null)) {
                return;
            }
        }
        if (expressionG == null || (alignmentHorizontal = (y5) expressionG.evaluate(expressionResolver)) == null) {
            e9 e9VarExtractParentContentAlignmentHorizontal = extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            alignmentHorizontal = e9VarExtractParentContentAlignmentHorizontal != null ? DivUtilKt.toAlignmentHorizontal(e9VarExtractParentContentAlignmentHorizontal) : null;
        }
        if (expressionM == null || (z5Var = (z5) expressionM.evaluate(expressionResolver)) == null) {
            f9 f9VarExtractParentContentAlignmentVertical = extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (f9VarExtractParentContentAlignmentVertical != null) {
                alignmentVertical = DivUtilKt.toAlignmentVertical(f9VarExtractParentContentAlignmentVertical);
            }
        } else {
            alignmentVertical = z5Var;
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, alignmentVertical);
    }

    private final View getIncomingView(View reusableIncomingView, y0 div, ExpressionResolver resolver) {
        if (reusableIncomingView != null) {
            return reusableIncomingView;
        }
        View viewCreate = this.viewCreator.create(div, resolver);
        createLayoutParams(viewCreate);
        return viewCreate;
    }

    private final Pair<lq.c, lq.c> getStates(lq lqVar, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object next;
        String id2 = bindingContext.getDivView().getDivTag().getId();
        String str2 = divStatePath.getStatesString$div_release() + IOUtils.DIR_SEPARATOR_UNIX + str;
        String state = this.temporaryStateCache.getState(id2, str2);
        if (state == null) {
            state = this.divStateCache.getState(id2, str2);
        }
        Object obj = null;
        if (state != null) {
            Function1<String, Unit> variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = lqVar.H;
            state = str3 != null ? getValueFromVariable(bindingContext, str3) : null;
        }
        Iterator it = lqVar.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((lq.c) next).f88890d, divStateLayout.getStateId())) {
                break;
            }
        }
        lq.c defaultState = (lq.c) next;
        if (defaultState == null) {
            defaultState = DivUtilKt.getDefaultState(lqVar, bindingContext.getExpressionResolver());
        }
        Iterator it2 = lqVar.I.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((lq.c) next2).f88890d, state)) {
                obj = next2;
                break;
            }
        }
        lq.c defaultState2 = (lq.c) obj;
        if (defaultState2 == null) {
            defaultState2 = DivUtilKt.getDefaultState(lqVar, bindingContext.getExpressionResolver());
        }
        return new Pair<>(defaultState, defaultState2);
    }

    private final String getValueFromVariable(BindingContext context, String variableName) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(context.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(variableName)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final lq lqVar, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = lqVar.H;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super String, Unit> valueUpdater) {
                divStateLayout.setVariableUpdater(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable String value) {
                Object next;
                if (value == null || divStateLayout.getStateId() == null || Intrinsics.areEqual(value, divStateLayout.getStateId())) {
                    return;
                }
                Iterator it = lqVar.I.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((lq.c) next).f88890d, value)) {
                            break;
                        }
                    }
                }
                bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, lqVar, null, 1, null), (lq.c) next, value), true);
            }
        }, divStatePath));
    }

    private final Transition replaceViewsAnimated(BindingContext context, lq divState, lq.c incomingState, lq.c outgoingState, View incoming, View outgoing) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        y0 y0Var;
        y0 y0Var2;
        if (outgoing == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(outgoing)) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return setupAnimation(context, incomingState, outgoingState, incoming, outgoing);
        }
        ExpressionResolver expressionResolver2 = context.getExpressionResolver();
        return (!DivTransitionsKt.allowsTransitionsOnStateChange(divState, expressionResolver2) || ((outgoingState == null || (y0Var2 = outgoingState.f88889c) == null || !DivUtilKt.containsStateInnerTransitions(y0Var2, expressionResolver)) && ((y0Var = incomingState.f88889c) == null || !DivUtilKt.containsStateInnerTransitions(y0Var, expressionResolver2)))) ? setupAnimation(context, incomingState, outgoingState, incoming, outgoing) : setupTransitions(context.getDivView().getViewComponent().getTransitionBuilder(), context.getDivView().getViewComponent().getStateTransitionHolder(), incomingState, outgoingState, expressionResolver2, expressionResolver);
    }

    private final Transition setupAnimation(BindingContext context, lq.c incomingState, lq.c outgoingState, View incoming, View outgoing) {
        List<a6> listEmptyList;
        BindingContext bindingContext;
        List<a6> listEmptyList2;
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        a6 a6Var = incomingState.f88887a;
        ExpressionResolver expressionResolver2 = null;
        a6 a6Var2 = outgoingState != null ? outgoingState.f88888b : null;
        if (a6Var == null && a6Var2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (a6Var != null && incoming != null) {
            if (a6Var.f86196e.evaluate(expressionResolver) != a6.c.SET) {
                listEmptyList2 = CollectionsKt.listOf(a6Var);
            } else {
                listEmptyList2 = a6Var.f86195d;
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
            }
            for (a6 a6Var3 : listEmptyList2) {
                Transition transition = DivStateBinderKt.toTransition(a6Var3, true, expressionResolver);
                if (transition != null) {
                    transitionSet.addTransition(transition.addTarget(incoming).setDuration(((Number) a6Var3.f86192a.evaluate(expressionResolver)).longValue()).setStartDelay(((Number) a6Var3.f86198g.evaluate(expressionResolver)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((c6) a6Var3.f86194c.evaluate(expressionResolver))));
                }
            }
        }
        if (outgoing != null && (bindingContext = BaseDivViewExtensionsKt.getBindingContext(outgoing)) != null) {
            expressionResolver2 = bindingContext.getExpressionResolver();
        }
        if (a6Var2 != null && expressionResolver2 != null) {
            if (a6Var2.f86196e.evaluate(expressionResolver2) != a6.c.SET) {
                listEmptyList = CollectionsKt.listOf(a6Var2);
            } else {
                listEmptyList = a6Var2.f86195d;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            for (a6 a6Var4 : listEmptyList) {
                Transition transition2 = DivStateBinderKt.toTransition(a6Var4, false, expressionResolver2);
                if (transition2 != null) {
                    transitionSet.addTransition(transition2.addTarget(outgoing).setDuration(((Number) a6Var4.f86192a.evaluate(expressionResolver2)).longValue()).setStartDelay(((Number) a6Var4.f86198g.evaluate(expressionResolver2)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((c6) a6Var4.f86194c.evaluate(expressionResolver2))));
                }
            }
        }
        if (outgoing != null) {
            outgoing.clearAnimation();
        }
        return transitionSet;
    }

    private final Transition setupTransitions(DivTransitionBuilder transitionBuilder, DivStateTransitionHolder transitionHolder, lq.c incomingState, lq.c outgoingState, ExpressionResolver incomingResolver, ExpressionResolver outgoingResolver) {
        DivTreeWalk divTreeWalkWalk;
        DivTreeWalk divTreeWalkOnEnter;
        y0 y0Var;
        DivTreeWalk divTreeWalkWalk2;
        DivTreeWalk divTreeWalkOnEnter2;
        Sequence<DivItemBuilderResult> sequenceE = null;
        if (Intrinsics.areEqual(incomingState, outgoingState)) {
            return null;
        }
        Sequence<DivItemBuilderResult> sequenceE2 = (outgoingState == null || (y0Var = outgoingState.f88889c) == null || (divTreeWalkWalk2 = DivTreeWalkKt.walk(y0Var, outgoingResolver)) == null || (divTreeWalkOnEnter2 = divTreeWalkWalk2.onEnter(new Function1<y0, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull y0 y0Var2) {
                return Boolean.valueOf(!(y0Var2 instanceof y0.o));
            }
        })) == null) ? null : k.E(divTreeWalkOnEnter2, new Function1<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                List listL = divItemBuilderResult.getDiv().c().l();
                return Boolean.valueOf(listL != null ? DivTransitionsKt.allowsTransitionsOnStateChange((List<? extends aw>) listL) : true);
            }
        });
        y0 y0Var2 = incomingState.f88889c;
        if (y0Var2 != null && (divTreeWalkWalk = DivTreeWalkKt.walk(y0Var2, incomingResolver)) != null && (divTreeWalkOnEnter = divTreeWalkWalk.onEnter(new Function1<y0, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull y0 y0Var3) {
                return Boolean.valueOf(!(y0Var3 instanceof y0.o));
            }
        })) != null) {
            sequenceE = k.E(divTreeWalkOnEnter, new Function1<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$4
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                    List listL = divItemBuilderResult.getDiv().c().l();
                    return Boolean.valueOf(listL != null ? DivTransitionsKt.allowsTransitionsOnStateChange((List<? extends aw>) listL) : true);
                }
            });
        }
        TransitionSet transitionSetBuildTransitions = transitionBuilder.buildTransitions(sequenceE2, sequenceE, outgoingResolver, incomingResolver);
        transitionHolder.append(transitionSetBuildTransitions);
        return transitionSetBuildTransitions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(final DivStateLayout divStateLayout, final Div2View div2View, final ExpressionResolver expressionResolver, final List<j1> list) {
        div2View.bulkActions$div_release(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DivActionBinder divActionBinder = DivStateBinder.this.divActionBinder;
                final Div2View div2View2 = div2View;
                final ExpressionResolver expressionResolver2 = expressionResolver;
                List<j1> list2 = list;
                final DivStateBinder divStateBinder = DivStateBinder.this;
                final DivStateLayout divStateLayout2 = divStateLayout;
                divActionBinder.handleActions$div_release(div2View2, expressionResolver2, list2, "state_swipe_out", new Function1<j1, Unit>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder.swipeOut.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var) {
                        invoke2(j1Var);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull j1 j1Var) {
                        divStateBinder.div2Logger.logSwipedAway(div2View2, expressionResolver2, divStateLayout2, j1Var);
                        divStateBinder.divActionBeaconSender.sendSwipeOutActionBeacon(j1Var, expressionResolver2);
                    }
                });
            }
        });
    }

    private final void untrackRecursively(View outgoing, Div2View divView, ExpressionResolver resolver) {
        Div2View div2View;
        ExpressionResolver expressionResolver;
        if (outgoing instanceof ViewGroup) {
            for (View view : ViewGroupKt.getChildren((ViewGroup) outgoing)) {
                y0 y0VarUnbindViewFromDiv$div_release = divView.unbindViewFromDiv$div_release(view);
                if (y0VarUnbindViewFromDiv$div_release != null) {
                    div2View = divView;
                    expressionResolver = resolver;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View, expressionResolver, null, y0VarUnbindViewFromDiv$div_release, null, null, 48, null);
                } else {
                    div2View = divView;
                    expressionResolver = resolver;
                }
                untrackRecursively(view, div2View, expressionResolver);
                divView = div2View;
                resolver = expressionResolver;
            }
        }
    }

    public void bindView(@NotNull final BindingContext context, @NotNull DivStateLayout view, @NotNull y0.o div, @NotNull final DivStatePath path) {
        DivStatePath divStatePath;
        lq lqVarD;
        lq lqVarD2 = div.d();
        y0.o div2 = view.getDiv();
        BindingContext bindingContext = view.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext != null ? bindingContext.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(lqVarD2, new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.errorCollectors.getOrCreate(context.getDivView().getDataTag(), context.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", path.toString()));
            }
        });
        DivStatePath divStatePath2 = path;
        Pair<lq.c, lq.c> states = getStates(lqVarD2, context, view, divStatePath2, id$div_release);
        lq.c cVarComponent1 = states.component1();
        lq.c cVarComponent2 = states.component2();
        if (cVarComponent1 == null || cVarComponent2 == null) {
            return;
        }
        y0 activeStateDiv = view.getActiveStateDiv();
        if (div2 != div) {
            this.baseBinder.bindView(context, view, div, activeStateDiv);
            if (div2 != null) {
                divStatePath = divStatePath2;
                lqVarD = div2.d();
            } else {
                divStatePath = divStatePath2;
                lqVarD = null;
            }
            bind(view, context, lqVarD2, lqVarD, cVarComponent2, divStatePath);
            divStatePath2 = divStatePath;
        }
        bindState(view, context, lqVarD2, cVarComponent2, div2 != null ? div2.d() : null, cVarComponent1, activeStateDiv, divStatePath2, expressionResolver, id$div_release);
    }
}
