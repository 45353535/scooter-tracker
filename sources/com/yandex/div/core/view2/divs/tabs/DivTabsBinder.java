package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableKt;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k8.as;
import k8.g9;
import k8.hb;
import k8.jp;
import k8.xc;
import k8.y0;
import kf.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001dBy\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!JI\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J7\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b/\u00100J%\u00106\u001a\b\u0012\u0004\u0012\u000201052\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020+*\u0006\u0012\u0002\b\u0003082\u0006\u0010(\u001a\u00020\u00032\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J%\u0010?\u001a\u00020+*\u00020\u00042\u0006\u0010:\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J'\u0010A\u001a\u00020+*\u0006\u0012\u0002\b\u0003082\u0006\u0010:\u001a\u0002092\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010BJ-\u0010D\u001a\u00020+*\u00020\u00042\u0006\u0010:\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010C2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010EJ/\u0010F\u001a\u00020+*\u0006\u0012\u0002\b\u0003082\u0006\u0010:\u001a\u0002092\u0006\u0010>\u001a\u00020C2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bF\u0010GJ#\u0010K\u001a\u00020J*\u00020=2\u0006\u0010I\u001a\u00020H2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ/\u0010P\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bP\u0010QJ-\u0010R\u001a\u00020+*\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010UR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ZR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010[R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\\R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010]R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010^R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010_R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$q;", "Lk8/as;", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lkf/a;", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/internal/viewpool/ViewPool;", "viewPool", "Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "textStyleProvider", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "actionBinder", "Lcom/yandex/div/core/Div2Logger;", "div2Logger", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "visibilityActionTracker", "Lcom/yandex/div/core/downloader/DivPatchCache;", "divPatchCache", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "runtimeVisitor", "Lcom/yandex/div/core/state/TabsStateCache;", "tabsStateCache", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkf/a;Lcom/yandex/div/internal/viewpool/ViewPool;Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/downloader/DivPatchCache;Landroid/content/Context;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;Lcom/yandex/div/core/state/TabsStateCache;)V", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "oldDiv", "div", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "", "bindAdapter", "(Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lk8/as;Lk8/as;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/internal/core/ExpressionSubscriber;)V", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "createAdapter", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/as;Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "", "lastPageNumber", "", "isSwipeEnabled", "", "getDisabledScrollPages", "(IZ)Ljava/util/Set;", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "observeHeight", "(Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;Lk8/as;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/as$e;", "style", "observeStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/as$e;)V", "applyStyle", "(Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/as$e;)V", "Lk8/as$d;", "observeDividerStyle", "(Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/as$d;Lcom/yandex/div/core/view2/BindingContext;)V", "applyDelimiterStyle", "(Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;Lcom/yandex/div/json/expressions/ExpressionResolver;Lk8/as$d;Lcom/yandex/div/core/view2/BindingContext;)V", "Landroid/util/DisplayMetrics;", "metrics", "", "getCornerRadii", "(Lk8/as$e;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)[F", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;", "getTabbedCardLayoutIds", "()Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$TabbedCardConfig;", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lk8/y0$q;Lcom/yandex/div/core/state/DivStatePath;)V", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;Lcom/yandex/div/core/view2/BindingContext;Lk8/as;Lk8/as;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lkf/a;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "Lcom/yandex/div/internal/widget/tabs/TabTextStyleProvider;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/images/DivImageLoader;", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "Lcom/yandex/div/core/downloader/DivPatchCache;", "Landroid/content/Context;", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "Lcom/yandex/div/core/state/TabsStateCache;", "", "oldDivSelectedTab", "Ljava/lang/Long;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTabsBinder extends DivViewBinder<y0.q, as, DivTabsLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final as.e DEFAULT_TAB_TITLE_STYLE = new as.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Context context;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivImageLoader imageLoader;

    @Nullable
    private Long oldDivSelectedTab;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    @NotNull
    private final TabTextStyleProvider textStyleProvider;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder$Companion;", "", "<init>", "()V", "", "DEFAULT_LINE_HEIGHT_COEFFICIENT", "F", "Lk8/as$e;", "DEFAULT_TAB_TITLE_STYLE", "Lk8/as$e;", "", "TAG_TAB_HEADER", "Ljava/lang/String;", "TAG_TAB_ITEM", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[as.e.a.values().length];
            try {
                iArr[as.e.a.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[as.e.a.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[as.e.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivTabsBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull a aVar, @NotNull ViewPool viewPool, @NotNull TabTextStyleProvider tabTextStyleProvider, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull DivImageLoader divImageLoader, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPatchCache divPatchCache, @NotNull Context context, @NotNull DivRuntimeVisitor divRuntimeVisitor, @NotNull TabsStateCache tabsStateCache) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.viewPool = viewPool;
        this.textStyleProvider = tabTextStyleProvider;
        this.actionBinder = divActionBinder;
        this.div2Logger = div2Logger;
        this.imageLoader = divImageLoader;
        this.visibilityActionTracker = divVisibilityActionTracker;
        this.divPatchCache = divPatchCache;
        this.context = context;
        this.runtimeVisitor = divRuntimeVisitor;
        this.tabsStateCache = tabsStateCache;
        viewPool.register("DIV2.TAB_HEADER_VIEW", new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.register("DIV2.TAB_ITEM_VIEW", new ViewFactory() { // from class: o7.a
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivTabsBinder._init_$lambda$0(this.f96358a);
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabItemLayout _init_$lambda$0(DivTabsBinder divTabsBinder) {
        return new TabItemLayout(divTabsBinder.context, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDelimiterStyle(final TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, as.d dVar, BindingContext bindingContext) {
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        xc xcVar = dVar.f86366c;
        final int px = BaseDivViewExtensionsKt.toPx(((Number) xcVar.f92339b.evaluate(expressionResolver)).longValue(), (jp) xcVar.f92338a.evaluate(expressionResolver), displayMetrics);
        xc xcVar2 = dVar.f86364a;
        final int px2 = BaseDivViewExtensionsKt.toPx(((Number) xcVar2.f92339b.evaluate(expressionResolver)).longValue(), (jp) xcVar2.f92338a.evaluate(expressionResolver), displayMetrics);
        DivImageLoader divImageLoader = this.imageLoader;
        String string = ((Uri) dVar.f86365b.evaluate(expressionResolver)).toString();
        final Div2View divView = bindingContext.getDivView();
        bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$applyDelimiterStyle$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                tabTitlesLayoutView.setTabDelimiter(null, 0, 0);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                tabTitlesLayoutView.setTabDelimiter(cachedBitmap.getBitmap(), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                super.onSuccess(pictureDrawable);
                tabTitlesLayoutView.setTabDelimiter(DrawableKt.toBitmap$default(pictureDrawable, 0, 0, null, 7, null), px, px2);
            }
        }), tabTitlesLayoutView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, as.e eVar) {
        BaseIndicatorTabLayout.AnimationType animationType;
        int iIntValue = ((Number) eVar.f86377d.evaluate(expressionResolver)).intValue();
        int iIntValue2 = ((Number) eVar.f86374a.evaluate(expressionResolver)).intValue();
        int iIntValue3 = ((Number) eVar.f86389p.evaluate(expressionResolver)).intValue();
        Expression expression = eVar.f86386m;
        tabTitlesLayoutView.setTabColors(iIntValue, iIntValue2, iIntValue3, expression != null ? ((Number) expression.evaluate(expressionResolver)).intValue() : 0);
        DisplayMetrics displayMetrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        tabTitlesLayoutView.setTabIndicatorCornersRadii(getCornerRadii(eVar, displayMetrics, expressionResolver));
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.dpToPx((Long) eVar.f86390q.evaluate(expressionResolver), displayMetrics));
        int i10 = WhenMappings.$EnumSwitchMapping$0[((as.e.a) eVar.f86379f.evaluate(expressionResolver)).ordinal()];
        if (i10 == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i10 == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i10 != 3) {
                throw new m();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(((Number) eVar.f86378e.evaluate(expressionResolver)).longValue());
        tabTitlesLayoutView.setTabTitleStyle(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DivTabsBinder divTabsBinder, BindingContext bindingContext) {
        divTabsBinder.div2Logger.logTabTitlesScroll(bindingContext.getDivView());
    }

    private final void bindAdapter(final DivStatePath path, final BindingContext bindingContext, DivTabsLayout view, as oldDiv, final as div, final DivBinder divBinder, ExpressionSubscriber subscriber) {
        int i10;
        final DivTabsBinder divTabsBinder;
        final DivTabsLayout divTabsLayout;
        Long l10;
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List list = div.f86342q;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((as.c) it.next(), view.getResources().getDisplayMetrics(), expressionResolver));
        }
        DivTabsAdapter divTabsAdapterTryReuse = DivTabsBinderKt.tryReuse(view.getDivTabsAdapter(), div, expressionResolver);
        if (divTabsAdapterTryReuse != null) {
            divTabsAdapterTryReuse.setBindingContext(bindingContext);
            divTabsAdapterTryReuse.setStatePath(path);
            divTabsAdapterTryReuse.getDivTabsEventManager().setDiv(div);
            divTabsAdapterTryReuse.getActiveStateTracker().setDiv(div);
            if (oldDiv == div) {
                divTabsAdapterTryReuse.notifyStateChanged();
            } else {
                divTabsAdapterTryReuse.setData(new BaseDivTabbedCardUi.Input() { // from class: o7.c
                    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
                    public final List getTabs() {
                        return DivTabsBinder.bindAdapter$lambda$5(arrayList);
                    }
                }, expressionResolver, subscriber);
            }
            divTabsBinder = this;
            divTabsLayout = view;
        } else {
            long jLongValue = ((Number) div.f86350y.evaluate(expressionResolver)).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int i11 = i10;
            divTabsBinder = this;
            bindAdapter$setupNewAdapter(divTabsBinder, bindingContext, div, view, divBinder, path, arrayList, i11);
            divTabsLayout = view;
        }
        DivTabsBinderKt.observeFixedHeightChange(div.f86342q, expressionResolver, subscriber, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Object obj) {
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.notifyStateChanged();
                }
            }
        });
        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                invoke(l11.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j11) {
                PagerController pager;
                int i12;
                this.this$0.oldDivSelectedTab = Long.valueOf(j11);
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter == null || (pager = divTabsAdapter.getPager()) == null) {
                    return;
                }
                long j12 = j11 >> 31;
                if (j12 == 0 || j12 == -1) {
                    i12 = (int) j11;
                } else {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + j11 + "' to Int");
                    }
                    i12 = j11 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                if (pager.getCurrentItemIndex() != i12) {
                    pager.smoothScrollTo(i12);
                }
            }
        };
        subscriber.addSubscription(div.f86335j.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                int currentItemIndex;
                PagerController pager;
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter == null || divTabsAdapter.getIsDynamicHeight() != z10) {
                    DivTabsBinder divTabsBinder2 = this;
                    BindingContext bindingContext2 = bindingContext;
                    as asVar = div;
                    DivTabsLayout divTabsLayout2 = divTabsLayout;
                    DivBinder divBinder2 = divBinder;
                    DivStatePath divStatePath = path;
                    List<DivSimpleTab> list2 = arrayList;
                    DivTabsAdapter divTabsAdapter2 = divTabsLayout2.getDivTabsAdapter();
                    if (divTabsAdapter2 == null || (pager = divTabsAdapter2.getPager()) == null) {
                        long jLongValue2 = ((Number) div.f86350y.evaluate(expressionResolver)).longValue();
                        long j11 = jLongValue2 >> 31;
                        if (j11 == 0 || j11 == -1) {
                            currentItemIndex = (int) jLongValue2;
                        } else {
                            KAssert kAssert2 = KAssert.INSTANCE;
                            if (Assert.isEnabled()) {
                                Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                            }
                            currentItemIndex = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                        }
                    } else {
                        currentItemIndex = pager.getCurrentItemIndex();
                    }
                    DivTabsBinder.bindAdapter$setupNewAdapter(divTabsBinder2, bindingContext2, asVar, divTabsLayout2, divBinder2, divStatePath, list2, currentItemIndex);
                }
            }
        }));
        subscriber.addSubscription(div.f86350y.observe(expressionResolver, function1));
        Div2View divView = bindingContext.getDivView();
        boolean z10 = Intrinsics.areEqual(divView.getPrevDataTag(), DivDataTag.INVALID) || Intrinsics.areEqual(divView.getDataTag(), divView.getPrevDataTag());
        long jLongValue2 = ((Number) div.f86350y.evaluate(expressionResolver)).longValue();
        if (!z10 || (l10 = this.oldDivSelectedTab) == null || l10.longValue() != jLongValue2) {
            function1.invoke(Long.valueOf(jLongValue2));
        }
        subscriber.addSubscription(div.B.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bindAdapter.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z11) {
                DivTabsAdapter divTabsAdapter = divTabsLayout.getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.setDisabledScrollPages(this.getDisabledScrollPages(div.f86342q.size() - 1, z11));
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$lambda$5(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdapter$setupNewAdapter(DivTabsBinder divTabsBinder, BindingContext bindingContext, as asVar, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath, final List<DivSimpleTab> list, int i10) {
        DivTabsAdapter divTabsAdapterCreateAdapter = divTabsBinder.createAdapter(bindingContext, asVar, divTabsLayout, divBinder, divStatePath);
        divTabsAdapterCreateAdapter.setData(new BaseDivTabbedCardUi.Input() { // from class: o7.d
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                return DivTabsBinder.bindAdapter$setupNewAdapter$lambda$4(list);
            }
        }, i10);
        divTabsLayout.setDivTabsAdapter(divTabsAdapterCreateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$setupNewAdapter$lambda$4(List list) {
        return list;
    }

    private final DivTabsAdapter createAdapter(BindingContext bindingContext, as div, DivTabsLayout view, DivBinder divBinder, DivStatePath path) {
        final DivTabsEventManager divTabsEventManager = new DivTabsEventManager(bindingContext, this.actionBinder, this.div2Logger, this.visibilityActionTracker, view, div);
        boolean zBooleanValue = ((Boolean) div.f86335j.evaluate(bindingContext.getExpressionResolver())).booleanValue();
        HeightCalculatorFactory heightCalculatorFactory = zBooleanValue ? new HeightCalculatorFactory() { // from class: o7.e
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        } : new HeightCalculatorFactory() { // from class: o7.f
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        };
        int currentItem = view.getViewPager().getCurrentItem();
        final int currentItem2 = view.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler.INSTANCE.postOnMainThread(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.createAdapter.1
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
                    divTabsEventManager.onPageDisplayed(currentItem2);
                }
            });
        }
        return new DivTabsAdapter(this.viewPool, view, getTabbedCardLayoutIds(), heightCalculatorFactory, zBooleanValue, bindingContext, this.textStyleProvider, this.viewCreator, divBinder, divTabsEventManager, new DivTabsActiveStateTracker(bindingContext, path, this.div2Logger, this.tabsStateCache, this.runtimeVisitor, div), path, this.divPatchCache);
    }

    private final float[] getCornerRadii(as.e eVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5 = eVar.f86380g;
        float cornerRadii$toCornerRadii = expression5 != null ? getCornerRadii$toCornerRadii(expression5, expressionResolver, displayMetrics) : eVar.f86381h == null ? -1.0f : 0.0f;
        g9 g9Var = eVar.f86381h;
        float cornerRadii$toCornerRadii2 = (g9Var == null || (expression4 = g9Var.f87782c) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression4, expressionResolver, displayMetrics);
        g9 g9Var2 = eVar.f86381h;
        float cornerRadii$toCornerRadii3 = (g9Var2 == null || (expression3 = g9Var2.f87783d) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression3, expressionResolver, displayMetrics);
        g9 g9Var3 = eVar.f86381h;
        float cornerRadii$toCornerRadii4 = (g9Var3 == null || (expression2 = g9Var3.f87780a) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression2, expressionResolver, displayMetrics);
        g9 g9Var4 = eVar.f86381h;
        if (g9Var4 != null && (expression = g9Var4.f87781b) != null) {
            cornerRadii$toCornerRadii = getCornerRadii$toCornerRadii(expression, expressionResolver, displayMetrics);
        }
        return new float[]{cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii4, cornerRadii$toCornerRadii4};
    }

    private static final float getCornerRadii$toCornerRadii(Expression<Long> expression, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt.dpToPx(expression.evaluate(expressionResolver), displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> getDisabledScrollPages(int lastPageNumber, boolean isSwipeEnabled) {
        return isSwipeEnabled ? new LinkedHashSet() : CollectionsKt.toMutableSet(new IntRange(0, lastPageNumber));
    }

    private final BaseDivTabbedCardUi.TabbedCardConfig getTabbedCardLayoutIds() {
        return new BaseDivTabbedCardUi.TabbedCardConfig(R$id.base_tabbed_title_container_scroller, R$id.div_tabs_pager_container, R$id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW");
    }

    private final void observeDividerStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final as.d dVar, final BindingContext bindingContext) {
        if (dVar == null) {
            return;
        }
        applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, dVar, bindingContext);
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeDividerStyle$callback$1
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
            public final void invoke2(@Nullable Object obj) {
                this.this$0.applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, dVar, bindingContext);
            }
        };
        dVar.f86366c.f92339b.observe(expressionResolver, function1);
        dVar.f86366c.f92338a.observe(expressionResolver, function1);
        dVar.f86364a.f92339b.observe(expressionResolver, function1);
        dVar.f86364a.f92338a.observe(expressionResolver, function1);
        dVar.f86365b.observe(expressionResolver, function1);
    }

    private final void observeHeight(final TabTitlesLayoutView<?> tabTitlesLayoutView, final as asVar, final ExpressionResolver expressionResolver) {
        hb hbVar;
        Expression expression;
        hb hbVar2;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
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
            public final void invoke2(@Nullable Object obj) {
                as.e eVar = asVar.D;
                if (eVar == null) {
                    eVar = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                hb hbVar3 = eVar.f86393t;
                hb hbVar4 = asVar.E;
                Expression expression5 = eVar.f86392s;
                long jLongValue = (expression5 != null ? ((Number) expression5.evaluate(expressionResolver)).longValue() : (long) (((Number) eVar.f86383j.evaluate(expressionResolver)).floatValue() * 1.3f)) + ((Number) hbVar3.f88005f.evaluate(expressionResolver)).longValue() + ((Number) hbVar3.f88000a.evaluate(expressionResolver)).longValue() + ((Number) hbVar4.f88005f.evaluate(expressionResolver)).longValue() + ((Number) hbVar4.f88000a.evaluate(expressionResolver)).longValue();
                tabTitlesLayoutView.getLayoutParams().height = BaseDivViewExtensionsKt.spToPx(Long.valueOf(jLongValue), tabTitlesLayoutView.getResources().getDisplayMetrics());
            }
        };
        Disposable disposableObserve = null;
        function1.invoke(null);
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(tabTitlesLayoutView);
        as.e eVar = asVar.D;
        expressionSubscriber.addSubscription((eVar == null || (expression4 = eVar.f86392s) == null) ? null : expression4.observe(expressionResolver, function1));
        as.e eVar2 = asVar.D;
        expressionSubscriber.addSubscription((eVar2 == null || (expression3 = eVar2.f86383j) == null) ? null : expression3.observe(expressionResolver, function1));
        as.e eVar3 = asVar.D;
        expressionSubscriber.addSubscription((eVar3 == null || (hbVar2 = eVar3.f86393t) == null || (expression2 = hbVar2.f88005f) == null) ? null : expression2.observe(expressionResolver, function1));
        as.e eVar4 = asVar.D;
        if (eVar4 != null && (hbVar = eVar4.f86393t) != null && (expression = hbVar.f88000a) != null) {
            disposableObserve = expression.observe(expressionResolver, function1);
        }
        expressionSubscriber.addSubscription(disposableObserve);
        expressionSubscriber.addSubscription(asVar.E.f88005f.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(asVar.E.f88000a.observe(expressionResolver, function1));
    }

    private final void observeStyle(final DivTabsLayout divTabsLayout, final ExpressionResolver expressionResolver, final as.e eVar) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        g9 g9Var;
        Expression expression4;
        g9 g9Var2;
        Expression expression5;
        g9 g9Var3;
        Expression expression6;
        g9 g9Var4;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        applyStyle(divTabsLayout.getTitleLayout(), expressionResolver, eVar == null ? DEFAULT_TAB_TITLE_STYLE : eVar);
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$callback$1
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
            public final void invoke2(@Nullable Object obj) {
                DivTabsBinder divTabsBinder = this.this$0;
                TabTitlesLayoutView<?> titleLayout = divTabsLayout.getTitleLayout();
                ExpressionResolver expressionResolver2 = expressionResolver;
                as.e eVar2 = eVar;
                if (eVar2 == null) {
                    eVar2 = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
                }
                divTabsBinder.applyStyle(titleLayout, expressionResolver2, eVar2);
            }
        };
        if (eVar != null && (expression12 = eVar.f86377d) != null) {
            expression12.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression11 = eVar.f86374a) != null) {
            expression11.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression10 = eVar.f86389p) != null) {
            expression10.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression9 = eVar.f86386m) != null) {
            expression9.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression8 = eVar.f86380g) != null) {
            expression8.observe(expressionResolver, function1);
        }
        if (eVar != null && (g9Var4 = eVar.f86381h) != null && (expression7 = g9Var4.f87782c) != null) {
            expression7.observe(expressionResolver, function1);
        }
        if (eVar != null && (g9Var3 = eVar.f86381h) != null && (expression6 = g9Var3.f87783d) != null) {
            expression6.observe(expressionResolver, function1);
        }
        if (eVar != null && (g9Var2 = eVar.f86381h) != null && (expression5 = g9Var2.f87781b) != null) {
            expression5.observe(expressionResolver, function1);
        }
        if (eVar != null && (g9Var = eVar.f86381h) != null && (expression4 = g9Var.f87780a) != null) {
            expression4.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression3 = eVar.f86390q) != null) {
            expression3.observe(expressionResolver, function1);
        }
        if (eVar != null && (expression2 = eVar.f86379f) != null) {
            expression2.observe(expressionResolver, function1);
        }
        if (eVar == null || (expression = eVar.f86378e) == null) {
            return;
        }
        expression.observe(expressionResolver, function1);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivTabsLayout view, @NotNull y0.q div, @NotNull DivStatePath path) {
        y0.q qVarApplyPatch;
        y0.q div2 = view.getDiv();
        if (div2 == div) {
            DivTabsAdapter divTabsAdapter = view.getDivTabsAdapter();
            if (divTabsAdapter != null && (qVarApplyPatch = divTabsAdapter.applyPatch(context.getExpressionResolver(), div)) != null) {
                view.setDiv(qVarApplyPatch);
                return;
            }
        } else {
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.d(), div2 != null ? div2.d() : null);
        }
        bindAdapter(path, context, view, div2 != null ? div2.d() : null, div.d(), (DivBinder) this.divBinder.get(), view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivTabsLayout divTabsLayout, @NotNull final BindingContext bindingContext, @NotNull final as asVar, @Nullable as asVar2) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divTabsLayout.setClipToPadding(false);
        Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bind$applyPaddings$1
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
            public final void invoke2(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(divTabsLayout.getTitleLayout(), asVar.E, expressionResolver);
            }
        };
        function1.invoke(null);
        divTabsLayout.addSubscription(asVar.E.f88002c.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(asVar.E.f88003d.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(asVar.E.f88005f.observe(expressionResolver, function1));
        divTabsLayout.addSubscription(asVar.E.f88000a.observe(expressionResolver, function1));
        observeHeight(divTabsLayout.getTitleLayout(), asVar, expressionResolver);
        observeStyle(divTabsLayout, expressionResolver, asVar.D);
        observeDividerStyle(divTabsLayout, expressionResolver, asVar.C, bindingContext);
        divTabsLayout.getPagerLayout().setClipToPadding(false);
        DivTabsBinderKt.observe(asVar.A, expressionResolver, divTabsLayout, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.1
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
            public final void invoke2(@Nullable Object obj) {
                BaseDivViewExtensionsKt.applyMargins(divTabsLayout.getDivider(), asVar.A, expressionResolver);
            }
        });
        divTabsLayout.addSubscription(asVar.f86351z.observeAndGet(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(int i10) {
                divTabsLayout.getDivider().setBackgroundColor(i10);
            }
        }));
        divTabsLayout.addSubscription(asVar.f86339n.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                divTabsLayout.getDivider().setVisibility(z10 ? 0 : 8);
            }
        }));
        divTabsLayout.getTitleLayout().setOnScrollChangedListener(new TabTitlesLayoutView.OnScrollChangedListener() { // from class: o7.b
            @Override // com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.OnScrollChangedListener
            public final void onScrolled() {
                DivTabsBinder.bind$lambda$2(this.f96359a, bindingContext);
            }
        });
        divTabsLayout.getTitleLayout().setFocusTracker(bindingContext.getDivView().getInputFocusTracker());
        divTabsLayout.addSubscription(asVar.f86346u.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder.bind.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                divTabsLayout.getViewPager().setOnInterceptTouchEventListener(z10 ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
    }
}
