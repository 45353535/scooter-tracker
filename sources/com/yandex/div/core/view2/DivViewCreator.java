package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import eg.h;
import java.util.Iterator;
import k8.u8;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0011\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR*\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/internal/core/DivVisitor;", "Landroid/view/View;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/internal/viewpool/ViewPool;", "viewPool", "Lcom/yandex/div/core/view2/DivValidator;", "validator", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "viewPreCreationProfile", "Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "repository", "<init>", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPool;Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;)V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "create", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "data", "defaultVisit", "Lk8/y0$m;", "visit", "(Lk8/y0$m;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "Lk8/y0$g;", "(Lk8/y0$g;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "Landroid/content/Context;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "Lcom/yandex/div/core/view2/DivValidator;", "value", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getViewPreCreationProfile", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "setViewPreCreationProfile", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivViewCreator extends DivVisitor<View> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};

    @NotNull
    private final Context context;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private ViewPreCreationProfile viewPreCreationProfile;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/DivViewCreator$Companion;", "", "<init>", "()V", "Lk8/y0;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "getTag", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/String;", "TAG_CUSTOM", "Ljava/lang/String;", "TAG_GALLERY", "TAG_GIF_IMAGE", "TAG_GRID", "TAG_IMAGE", "TAG_INDICATOR", "TAG_INPUT", "TAG_LINEAR_CONTAINER", "TAG_OVERLAP_CONTAINER", "TAG_PAGER", "TAG_SELECT", "TAG_SLIDER", "TAG_STATE", "TAG_SWITCH", "TAG_TABS", "TAG_TEXT", "TAG_VIDEO", "TAG_WRAP_CONTAINER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(y0 y0Var, ExpressionResolver expressionResolver) {
            if (y0Var instanceof y0.c) {
                y0.c cVar = (y0.c) y0Var;
                return DivUtilKt.isWrapContainer(cVar.d(), expressionResolver) ? "DIV2.WRAP_CONTAINER_VIEW" : cVar.d().I.evaluate(expressionResolver) == u8.d.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
            if (y0Var instanceof y0.d) {
                return "DIV2.CUSTOM";
            }
            if (y0Var instanceof y0.e) {
                return "DIV2.GALLERY_VIEW";
            }
            if (y0Var instanceof y0.f) {
                return "DIV2.IMAGE_GIF_VIEW";
            }
            if (y0Var instanceof y0.g) {
                return "DIV2.GRID_VIEW";
            }
            if (y0Var instanceof y0.h) {
                return "DIV2.IMAGE_VIEW";
            }
            if (y0Var instanceof y0.i) {
                return "DIV2.INDICATOR";
            }
            if (y0Var instanceof y0.j) {
                return "DIV2.INPUT";
            }
            if (y0Var instanceof y0.k) {
                return "DIV2.PAGER_VIEW";
            }
            if (y0Var instanceof y0.l) {
                return "DIV2.SELECT";
            }
            if (y0Var instanceof y0.n) {
                return "DIV2.SLIDER";
            }
            if (y0Var instanceof y0.p) {
                return "DIV2.SWITCH";
            }
            if (y0Var instanceof y0.o) {
                return "DIV2.STATE";
            }
            if (y0Var instanceof y0.q) {
                return "DIV2.TAB_VIEW";
            }
            if (y0Var instanceof y0.r) {
                return "DIV2.TEXT_VIEW";
            }
            if (y0Var instanceof y0.s) {
                return "DIV2.VIDEO";
            }
            if (y0Var instanceof y0.m) {
                return "";
            }
            throw new m();
        }

        private Companion() {
        }
    }

    public DivViewCreator(@NotNull Context context, @NotNull ViewPool viewPool, @NotNull DivValidator divValidator, @NotNull ViewPreCreationProfile viewPreCreationProfile, @NotNull ViewPreCreationProfileRepository viewPreCreationProfileRepository) {
        ViewPreCreationProfile viewPreCreationProfile2;
        this.context = context;
        this.viewPool = viewPool;
        this.validator = divValidator;
        String id2 = viewPreCreationProfile.getId();
        if (id2 != null && (viewPreCreationProfile2 = (ViewPreCreationProfile) h.b(null, new DivViewCreator$viewPreCreationProfile$1$1(viewPreCreationProfileRepository, id2, null), 1, null)) != null) {
            viewPreCreationProfile = viewPreCreationProfile2;
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register("DIV2.TEXT_VIEW", new ViewFactory() { // from class: l7.c
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.j(this.f94058a);
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register("DIV2.IMAGE_VIEW", new ViewFactory() { // from class: l7.t
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.a(this.f94075a);
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register("DIV2.IMAGE_GIF_VIEW", new ViewFactory() { // from class: l7.d
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.q(this.f94059a);
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register("DIV2.OVERLAP_CONTAINER_VIEW", new ViewFactory() { // from class: l7.e
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.f(this.f94060a);
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register("DIV2.LINEAR_CONTAINER_VIEW", new ViewFactory() { // from class: l7.f
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.p(this.f94061a);
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register("DIV2.WRAP_CONTAINER_VIEW", new ViewFactory() { // from class: l7.g
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.r(this.f94062a);
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register("DIV2.GRID_VIEW", new ViewFactory() { // from class: l7.h
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.k(this.f94063a);
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register("DIV2.GALLERY_VIEW", new ViewFactory() { // from class: l7.i
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.i(this.f94064a);
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register("DIV2.PAGER_VIEW", new ViewFactory() { // from class: l7.j
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.b(this.f94065a);
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register("DIV2.TAB_VIEW", new ViewFactory() { // from class: l7.k
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.g(this.f94066a);
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register("DIV2.STATE", new ViewFactory() { // from class: l7.l
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.l(this.f94067a);
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register("DIV2.CUSTOM", new ViewFactory() { // from class: l7.m
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.c(this.f94068a);
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register("DIV2.INDICATOR", new ViewFactory() { // from class: l7.n
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.h(this.f94069a);
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register("DIV2.SLIDER", new ViewFactory() { // from class: l7.o
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.n(this.f94070a);
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register("DIV2.INPUT", new ViewFactory() { // from class: l7.p
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.e(this.f94071a);
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register("DIV2.SELECT", new ViewFactory() { // from class: l7.q
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.m(this.f94072a);
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register("DIV2.VIDEO", new ViewFactory() { // from class: l7.r
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.d(this.f94073a);
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register("DIV2.SWITCH", new ViewFactory() { // from class: l7.s
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.o(this.f94074a);
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    public static DivImageView a(DivViewCreator divViewCreator) {
        return new DivImageView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivPagerView b(DivViewCreator divViewCreator) {
        return new DivPagerView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivCustomWrapper c(DivViewCreator divViewCreator) {
        return new DivCustomWrapper(divViewCreator.context, null, 0, 6, null);
    }

    public static DivVideoView d(DivViewCreator divViewCreator) {
        return new DivVideoView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivInputView e(DivViewCreator divViewCreator) {
        return new DivInputView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivFrameLayout f(DivViewCreator divViewCreator) {
        return new DivFrameLayout(divViewCreator.context, null, 0, 6, null);
    }

    public static DivTabsLayout g(DivViewCreator divViewCreator) {
        return new DivTabsLayout(divViewCreator.context, null, 2, 0 == true ? 1 : 0);
    }

    public static DivPagerIndicatorView h(DivViewCreator divViewCreator) {
        return new DivPagerIndicatorView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivRecyclerView i(DivViewCreator divViewCreator) {
        return new DivRecyclerView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivLineHeightTextView j(DivViewCreator divViewCreator) {
        return new DivLineHeightTextView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivGridLayout k(DivViewCreator divViewCreator) {
        return new DivGridLayout(divViewCreator.context, null, 0, 6, null);
    }

    public static DivStateLayout l(DivViewCreator divViewCreator) {
        return new DivStateLayout(divViewCreator.context, null, 0, 6, null);
    }

    public static DivSelectView m(DivViewCreator divViewCreator) {
        return new DivSelectView(divViewCreator.context);
    }

    public static DivSliderView n(DivViewCreator divViewCreator) {
        return new DivSliderView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivSwitchView o(DivViewCreator divViewCreator) {
        return new DivSwitchView(divViewCreator.context);
    }

    public static DivLinearLayout p(DivViewCreator divViewCreator) {
        return new DivLinearLayout(divViewCreator.context, null, 0, 6, null);
    }

    public static DivGifImageView q(DivViewCreator divViewCreator) {
        return new DivGifImageView(divViewCreator.context, null, 0, 6, null);
    }

    public static DivWrapLayout r(DivViewCreator divViewCreator) {
        return new DivWrapLayout(divViewCreator.context);
    }

    @NotNull
    public View create(@NotNull y0 div, @NotNull ExpressionResolver resolver) {
        if (!this.validator.validate(div, resolver)) {
            return new Space(this.context);
        }
        View viewVisit = visit(div, resolver);
        viewVisit.setBackground(NoOpDrawable.INSTANCE);
        return viewVisit;
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View defaultVisit(@NotNull y0 data, @NotNull ExpressionResolver resolver) {
        return this.viewPool.obtain(INSTANCE.getTag(data, resolver));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull y0.m data, @NotNull ExpressionResolver resolver) {
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull y0.g data, @NotNull ExpressionResolver resolver) {
        View viewDefaultVisit = defaultVisit((y0) data, resolver);
        Intrinsics.checkNotNull(viewDefaultVisit, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewDefaultVisit;
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.d()).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((y0) it.next(), resolver));
        }
        return viewGroup;
    }
}
