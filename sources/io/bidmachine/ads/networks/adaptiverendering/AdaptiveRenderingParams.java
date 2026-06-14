package io.bidmachine.ads.networks.adaptiverendering;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.explorestack.protobuf.t1;
import com.ironsource.C4329g8;
import id.a1;
import id.b0;
import id.b1;
import id.c;
import id.c0;
import id.c1;
import id.d;
import id.d0;
import id.e0;
import id.e1;
import id.f1;
import id.g0;
import id.g1;
import id.h0;
import id.i0;
import id.i1;
import id.j0;
import id.j1;
import id.k0;
import id.k1;
import id.l0;
import id.m0;
import id.n0;
import id.o0;
import id.p0;
import id.r0;
import id.s0;
import id.t0;
import id.v0;
import id.x0;
import id.y0;
import id.z;
import io.appmetrica.analytics.impl.H2;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J)\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u0004\u0018\u00010.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0$H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b4\u00105J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b;\u0010<J%\u0010B\u001a\u0004\u0018\u00010A2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bB\u0010CJ%\u0010G\u001a\u0004\u0018\u00010F2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bG\u0010HJ\u0019\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IH\u0007¢\u0006\u0004\bL\u0010MJ\u0019\u0010Q\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bQ\u0010RJ'\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010$2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010$H\u0007¢\u0006\u0004\bV\u0010WJ\u001b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0007¢\u0006\u0004\b[\u0010\\J\u001b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010^\u001a\u0004\u0018\u00010]H\u0007¢\u0006\u0004\b`\u0010aR\u0019\u0010b\u001a\u0004\u0018\u00010:8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingParams;", "Lod/o;", "Lod/k;", "unifiedMediationParams", "<init>", "(Lod/k;)V", "Lio/bidmachine/protobuf/rendering/Rendering$Background;", H2.f75840g, "Lid/k;", "createBackground", "(Lio/bidmachine/protobuf/rendering/Rendering$Background;)Lid/k;", "Lio/bidmachine/protobuf/rendering/Rendering$Color;", "color", "Lid/v;", "createColor", "(Lio/bidmachine/protobuf/rendering/Rendering$Color;)Lid/v;", "Lio/bidmachine/protobuf/rendering/Rendering$Color$Gradient;", "gradient", "Lid/g0;", "createGradient", "(Lio/bidmachine/protobuf/rendering/Rendering$Color$Gradient;)Lid/g0;", "Lio/bidmachine/protobuf/rendering/Rendering$Image;", "image", "Lid/m0;", "createImage", "(Lio/bidmachine/protobuf/rendering/Rendering$Image;)Lid/m0;", "Lio/bidmachine/protobuf/rendering/Rendering$Resource;", com.taurusx.tax.g.n.f66163g, "Lid/a1;", "createResource", "(Lio/bidmachine/protobuf/rendering/Rendering$Resource;)Lid/a1;", "Lio/bidmachine/protobuf/rendering/Rendering$Placeholder;", "placeholder", "Lid/x0;", "createPlaceholder", "(Lio/bidmachine/protobuf/rendering/Rendering$Placeholder;)Lid/x0;", "", "Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation;", "adaptiveAnimationList", "", "Lid/f;", "Lid/h;", "createAnimationMap", "(Ljava/util/List;)Ljava/util/Map;", "Lio/bidmachine/protobuf/rendering/RenderingFeature;", "featureList", "Lid/s;", "createBrokenCreativeDetectorParams", "(Ljava/util/List;)Lid/s;", "Lod/c;", "callback", "", "isValid", "(Lod/c;)Z", "Lio/bidmachine/protobuf/rendering/Rendering;", "rendering", "Lid/j1;", C4329g8.f43174s, "Lid/c;", "createAdParams", "(Lio/bidmachine/protobuf/rendering/Rendering;Lid/j1;)Lid/c;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase;", TypedValues.CycleType.S_WAVE_PHASE, "Lhd/g;", "measurerFactory", "Lid/d;", "createAdPhaseParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase;Lhd/g;)Lid/d;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent;", "viewComponent", "Lid/a;", "createAdElementParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent;Lhd/g;)Lid/a;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout;", "layout", "Lid/z;", "createElementLayoutParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout;)Lid/z;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Appearance;", "appearance", "Lid/j;", "createAppearanceParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Appearance;)Lid/j;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Measurer;", "measurerList", "Lid/p0;", "createMeasurerParamsList", "(Ljava/util/List;)Ljava/util/List;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event;", "event", "Lid/b0;", "createEventParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event;)Lid/b0;", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task;", "task", "Lid/c0;", "createEventTaskParams", "(Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task;)Lid/c0;", "adParams", "Lid/c;", "getAdParams", "()Lid/c;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingParams extends od.o {

    @Nullable
    private final id.c adParams;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveRenderingParams(@NotNull od.k unifiedMediationParams) {
        super(unifiedMediationParams);
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Object objP = unifiedMediationParams.p("rendering_configuration");
        if (!(objP instanceof Rendering)) {
            this.adParams = null;
            return;
        }
        j1.a aVar = new j1.a();
        Float fC = unifiedMediationParams.c("viewability_pixel_threshold");
        if (fC != null) {
            aVar.d(fC.floatValue());
        }
        Boolean boolR = unifiedMediationParams.r("viewability_ignore_window_focus");
        if (boolR != null) {
            aVar.c(boolR.booleanValue());
        }
        Boolean boolR2 = unifiedMediationParams.r("viewability_ignore_overlap");
        if (boolR2 != null) {
            aVar.b(boolR2.booleanValue());
        }
        this.adParams = createAdParams((Rendering) objP, aVar.a());
    }

    private final Map<id.f, id.h> createAnimationMap(List<Rendering.AdaptiveAnimation> adaptiveAnimationList) {
        id.h hVar;
        HashMap map = new HashMap();
        for (Rendering.AdaptiveAnimation adaptiveAnimation : adaptiveAnimationList) {
            id.f fVarA = id.f.f74481c.a(adaptiveAnimation.getEvent());
            if (fVarA != null) {
                Rendering.AdaptiveAnimation.Style style = adaptiveAnimation.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "it.style");
                if (style.hasFade()) {
                    Rendering.AdaptiveAnimation.FadeAnimationOption fade = style.getFade();
                    Intrinsics.checkNotNullExpressionValue(fade, "style.fade");
                    Rendering.AdaptiveAnimation.Timing timing = fade.getTiming();
                    Intrinsics.checkNotNullExpressionValue(timing, "fadeAnimationOption.timing");
                    hVar = new id.h(fVarA, id.i.Fade, id.g.f74501c.a(timing.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing), null);
                } else if (style.hasSlide()) {
                    Rendering.AdaptiveAnimation.SlideAnimationOption slide = style.getSlide();
                    Intrinsics.checkNotNullExpressionValue(slide, "style.slide");
                    Rendering.AdaptiveAnimation.Timing timing2 = slide.getTiming();
                    Intrinsics.checkNotNullExpressionValue(timing2, "slideAnimationOption.timing");
                    hVar = new id.h(fVarA, id.i.Slide, id.g.f74501c.a(timing2.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing2), id.e.f74450c.a(slide.getDirection()));
                }
                map.put(fVarA, hVar);
            }
        }
        return map;
    }

    private final id.k createBackground(Rendering.Background background) {
        id.l n0Var = null;
        if (background == null || background == Rendering.Background.getDefaultInstance()) {
            return null;
        }
        if (background.hasColor()) {
            id.v vVarCreateColor = createColor(background.getColor());
            if (vVarCreateColor != null) {
                n0Var = new id.w(vVarCreateColor);
            } else {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.a
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createBackground$lambda$18();
                    }
                });
            }
        } else if (background.hasImage()) {
            m0 m0VarCreateImage = createImage(background.getImage());
            if (m0VarCreateImage != null) {
                n0Var = new n0(m0VarCreateImage);
            } else {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.j
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createBackground$lambda$19();
                    }
                });
            }
        } else {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.k
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createBackground$lambda$20();
                }
            });
        }
        return new id.k((float) background.getOpacity(), n0Var, createPlaceholder(background.getPlaceholder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$18() {
        return "BackgroundSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$19() {
        return "BackgroundSource don't found. Can't create Image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$20() {
        return "BackgroundSource don't found. Set one of: color, gradient";
    }

    private final id.s createBrokenCreativeDetectorParams(List<RenderingFeature> featureList) {
        Object next;
        RenderingFeature.BrokenCreativeDetector brokenCreativeDetector;
        if (featureList.isEmpty()) {
            return null;
        }
        Iterator<T> it = featureList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RenderingFeature renderingFeature = (RenderingFeature) next;
            if (renderingFeature.hasBrokenCreativeDetector() && renderingFeature.getBrokenCreativeDetector().hasConfiguration()) {
                break;
            }
        }
        RenderingFeature renderingFeature2 = (RenderingFeature) next;
        RenderingFeature.BrokenCreativeDetector.Configuration configuration = (renderingFeature2 == null || (brokenCreativeDetector = renderingFeature2.getBrokenCreativeDetector()) == null) ? null : brokenCreativeDetector.getConfiguration();
        if (configuration == null) {
            return null;
        }
        List<RenderingFeature.BrokenCreativeDetector.Algorithm> algorithmsList = configuration.getAlgorithmsList();
        Intrinsics.checkNotNullExpressionValue(algorithmsList, "brokenCreativeDetectorConfiguration.algorithmsList");
        ArrayList arrayList = new ArrayList();
        for (RenderingFeature.BrokenCreativeDetector.Algorithm algorithm : algorithmsList) {
            id.r rVarA = id.r.f74606c.a(algorithm.getName());
            id.p pVar = rVarA == null ? null : new id.p(rVarA, (float) algorithm.getThreshold(), (float) algorithm.getWeight());
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        if (arrayList.isEmpty()) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.c
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$38();
                }
            });
            return null;
        }
        if (arrayList.size() != algorithmsList.size()) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.d
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$39();
                }
            });
        }
        long timeout = (long) configuration.getTimeout();
        double downscaleFactor = configuration.getDownscaleFactor();
        boolean errorOnly = configuration.getErrorOnly();
        boolean allowDuplicate = configuration.getAllowDuplicate();
        g1 g1VarA = g1.f74511c.a(configuration.getStopAfter());
        if (g1VarA == null) {
            g1VarA = g1.AnyCreative;
        }
        return new id.s(timeout, downscaleFactor, errorOnly, allowDuplicate, g1VarA, configuration.getWeightThreshold(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$38() {
        return "BrokenCreativeDetector algorithms is empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$39() {
        return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
    }

    private final id.v createColor(Rendering.Color color) {
        Pair pair;
        if (color == null || color == Rendering.Color.getDefaultInstance()) {
            return null;
        }
        if (color.hasContextColor()) {
            Integer numU = f0.u(color.getContextColor());
            if (numU == null) {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.e
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$21();
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new t0(numU.intValue()), Boolean.TRUE);
        } else if (color.hasContextGradient()) {
            g0 g0VarCreateGradient = createGradient(color.getContextGradient());
            if (g0VarCreateGradient == null) {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.f
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$22();
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new h0(g0VarCreateGradient), Boolean.TRUE);
        } else if (color.hasColor()) {
            Integer numU2 = f0.u(color.getColor());
            if (numU2 == null) {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.g
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$23();
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new t0(numU2.intValue()), Boolean.FALSE);
        } else if (color.hasGradient()) {
            g0 g0VarCreateGradient2 = createGradient(color.getGradient());
            if (g0VarCreateGradient2 == null) {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.h
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$24();
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new h0(g0VarCreateGradient2), Boolean.FALSE);
        } else {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.i
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createColor$lambda$25();
                }
            });
            pair = TuplesKt.to(null, Boolean.FALSE);
        }
        id.y yVar = (id.y) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        if (yVar == null) {
            return null;
        }
        return new id.v(yVar, zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$21() {
        return "ColorSource don't found. Can't parse context color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$22() {
        return "ColorSource don't found. Can't create context gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$23() {
        return "ColorSource don't found. Can't parse color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$24() {
        return "ColorSource don't found. Can't create Gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$25() {
        return "ColorSource don't found. Set one of: color, gradient, context_color, context_gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createElementLayoutParams$lambda$17$lambda$16(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported SourceAnchor - " + anchor;
    }

    private final g0 createGradient(Rendering.Color.Gradient gradient) {
        if (gradient == null || gradient == Rendering.Color.Gradient.getDefaultInstance()) {
            return null;
        }
        final String type = gradient.getType();
        Intrinsics.checkNotNullExpressionValue(type, "gradient.type");
        j0 j0VarA = j0.f74558c.a(type);
        if (j0VarA == null) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.m
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$26(type);
                }
            });
            return null;
        }
        final String direction = gradient.getDirection();
        Intrinsics.checkNotNullExpressionValue(direction, "gradient.direction");
        i0 i0VarA = i0.f74531c.a(direction);
        if (i0VarA == null) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.n
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$27(direction);
                }
            });
            return null;
        }
        t1 colorsList = gradient.getColorsList();
        Intrinsics.checkNotNullExpressionValue(colorsList, "gradient.colorsList");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = colorsList.iterator();
        while (it.hasNext()) {
            Integer numU = f0.u((String) it.next());
            if (numU != null) {
                arrayList.add(numU);
            }
        }
        if (arrayList.isEmpty()) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.o
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$29();
                }
            });
            return null;
        }
        if (arrayList.size() != colorsList.size()) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.p
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$30();
                }
            });
        }
        return new g0(j0VarA, i0VarA, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$26(String type) {
        Intrinsics.checkNotNullParameter(type, "$type");
        return "Incorrect gradient type parameter - " + type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$27(String direction) {
        Intrinsics.checkNotNullParameter(direction, "$direction");
        return "Incorrect gradient direction parameter - " + direction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$29() {
        return "Failed to parse all colors. Check if colors are specified correctly.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$30() {
        return "Not all colors were parsed, check if the colors are specified correctly";
    }

    private final m0 createImage(Rendering.Image image) {
        a1 a1VarCreateResource;
        if (image == null || image == Rendering.Image.getDefaultInstance() || (a1VarCreateResource = createResource(image.getResource())) == null) {
            return null;
        }
        c1 scaleType = AdaptiveRenderingParamsKt.toScaleType(image.getScale());
        if (scaleType == null) {
            scaleType = c1.None;
        }
        return new m0(scaleType, a1VarCreateResource);
    }

    private final x0 createPlaceholder(Rendering.Placeholder placeholder) {
        y0 o0Var;
        if (placeholder == null || placeholder == Rendering.Placeholder.getDefaultInstance()) {
            return null;
        }
        if (placeholder.hasName()) {
            String name = placeholder.getName();
            Intrinsics.checkNotNullExpressionValue(name, "placeholder.name");
            o0Var = new s0(name);
        } else if (placeholder.hasColor()) {
            id.v vVarCreateColor = createColor(placeholder.getColor());
            if (vVarCreateColor == null) {
                return null;
            }
            o0Var = new id.x(vVarCreateColor);
        } else if (placeholder.hasImage()) {
            m0 m0VarCreateImage = createImage(placeholder.getImage());
            if (m0VarCreateImage == null) {
                return null;
            }
            o0Var = new o0(m0VarCreateImage);
        } else {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.b
                @Override // ce.b
                public final Object get() {
                    return AdaptiveRenderingParams.createPlaceholder$lambda$33();
                }
            });
            o0Var = null;
        }
        if (o0Var == null) {
            return null;
        }
        return new x0(o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createPlaceholder$lambda$33() {
        return "PlaceholderSource don't found. Set one of: name, color, gradient";
    }

    private final a1 createResource(Rendering.Resource resource) {
        b1 k1Var;
        if (resource == null || resource == Rendering.Resource.getDefaultInstance()) {
            return null;
        }
        if (resource.hasBase64()) {
            String base64 = resource.getBase64();
            Intrinsics.checkNotNullExpressionValue(base64, "resource.base64");
            k1Var = new id.n(base64);
        } else if (resource.hasUrls()) {
            t1 urlsList = resource.getUrls().getUrlsList();
            Intrinsics.checkNotNullExpressionValue(urlsList, "resource.urls.urlsList");
            k1Var = new i1(urlsList);
        } else if (resource.hasUrl()) {
            String url = resource.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "resource.url");
            k1Var = new i1(url);
        } else {
            if (resource.hasPayload()) {
                Rendering.Resource.Payload payload = resource.getPayload();
                Intrinsics.checkNotNullExpressionValue(payload, "resource.payload");
                if (payload.hasHtml()) {
                    String html = payload.getHtml();
                    Intrinsics.checkNotNullExpressionValue(html, "payload.html");
                    k1Var = new l0(html);
                } else if (payload.hasXml()) {
                    String xml = payload.getXml();
                    Intrinsics.checkNotNullExpressionValue(xml, "payload.xml");
                    k1Var = new k1(xml);
                } else {
                    io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.q
                        @Override // ce.b
                        public final Object get() {
                            return AdaptiveRenderingParams.createResource$lambda$31();
                        }
                    });
                }
            } else {
                io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.r
                    @Override // ce.b
                    public final Object get() {
                        return AdaptiveRenderingParams.createResource$lambda$32();
                    }
                });
            }
            k1Var = null;
        }
        if (k1Var == null) {
            return null;
        }
        return new a1(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$31() {
        return "ResourceSource don't found. Set one of: html, xml";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$32() {
        return "ResourceSource don't found. Set one of: base64, url, payload";
    }

    @VisibleForTesting
    @Nullable
    public final id.a createAdElementParams(@Nullable Rendering.Phase.ViewComponent viewComponent, @Nullable hd.g measurerFactory) {
        id.b adElementType;
        if (viewComponent == null || viewComponent == Rendering.Phase.ViewComponent.getDefaultInstance() || (adElementType = AdaptiveRenderingParamsKt.toAdElementType(viewComponent.getType())) == null) {
            return null;
        }
        String it = viewComponent.getText();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        String str = it.length() > 0 ? it : null;
        String name = viewComponent.getName();
        Intrinsics.checkNotNullExpressionValue(name, "viewComponent.name");
        a1 a1VarCreateResource = createResource(viewComponent.getResource());
        String source = viewComponent.getSource();
        String placeholder = viewComponent.getPlaceholder();
        id.z zVarCreateElementLayoutParams = createElementLayoutParams(viewComponent.getLayout());
        id.j jVarCreateAppearanceParams = createAppearanceParams(viewComponent.getAppearance());
        Map<String, String> customParamsMap = viewComponent.getCustomParamsMap();
        Intrinsics.checkNotNullExpressionValue(customParamsMap, "viewComponent.customParamsMap");
        List<Rendering.AdaptiveAnimation> animationsList = viewComponent.getAppearance().getAnimationsList();
        Intrinsics.checkNotNullExpressionValue(animationsList, "viewComponent.appearance.animationsList");
        Map<id.f, id.h> mapCreateAnimationMap = createAnimationMap(animationsList);
        List<p0> listCreateMeasurerParamsList = createMeasurerParamsList(viewComponent.getMeasurersList());
        List<RenderingFeature> featuresList = viewComponent.getFeaturesList();
        Intrinsics.checkNotNullExpressionValue(featuresList, "viewComponent.featuresList");
        return new id.a(adElementType, name, a1VarCreateResource, source, placeholder, str, zVarCreateElementLayoutParams, jVarCreateAppearanceParams, customParamsMap, mapCreateAnimationMap, measurerFactory, listCreateMeasurerParamsList, createBrokenCreativeDetectorParams(featuresList));
    }

    @VisibleForTesting
    @NotNull
    public final id.c createAdParams(@NotNull Rendering rendering, @NotNull j1 visibilityParams) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        AdMeasurerFactory adMeasurerFactory = new AdMeasurerFactory();
        c.a aVarE = new c.a().f(AdaptiveRenderingParamsKt.toOrientation(rendering.getOrientation())).c(createBackground(rendering.getBackground())).h(visibilityParams).e(rendering.getCustomParamsMap());
        id.u cacheType = AdaptiveRenderingParamsKt.toCacheType(rendering.getCacheType());
        if (cacheType != null) {
            aVarE.d(cacheType);
        }
        List<Rendering.Phase> phasesList = rendering.getPhasesList();
        Intrinsics.checkNotNullExpressionValue(phasesList, "rendering.phasesList");
        List<Rendering.Phase> mutableList = CollectionsKt.toMutableList((Collection) phasesList);
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new Comparator() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$createAdParams$lambda$5$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d(Integer.valueOf(((Rendering.Phase) t10).getSequence()), Integer.valueOf(((Rendering.Phase) t11).getSequence()));
                }
            });
        }
        for (Rendering.Phase phase : mutableList) {
            id.d dVarCreateAdPhaseParams = createAdPhaseParams(phase, adMeasurerFactory);
            if (dVarCreateAdPhaseParams != null) {
                if (phase.getSequence() == -1) {
                    aVarE.g(dVarCreateAdPhaseParams);
                } else {
                    aVarE.a(dVarCreateAdPhaseParams);
                }
            }
        }
        return aVarE.b();
    }

    @VisibleForTesting
    @Nullable
    public final id.d createAdPhaseParams(@Nullable Rendering.Phase phase, @Nullable hd.g measurerFactory) {
        if (phase == null || phase == Rendering.Phase.getDefaultInstance()) {
            return null;
        }
        d.a aVarG = new d.a(phase.getSequence()).g(createBackground(phase.getBackground()));
        List<Rendering.AdaptiveAnimation> animationsList = phase.getAnimationsList();
        Intrinsics.checkNotNullExpressionValue(animationsList, "phase.animationsList");
        d.a aVarF = aVarG.f(MapsKt.toMutableMap(createAnimationMap(animationsList)));
        t1 stateGroupsList = phase.getStateGroupsList();
        Intrinsics.checkNotNullExpressionValue(stateGroupsList, "phase.stateGroupsList");
        d.a aVarI = aVarF.j(CollectionsKt.toMutableList((Collection) stateGroupsList)).i(phase.getCustomParamsMap());
        Integer numU = f0.u(phase.getBackgroundColor());
        if (numU != null) {
            aVarI.h(numU.intValue());
        }
        List<Rendering.Phase.ViewComponent> adsList = phase.getAdsList();
        Intrinsics.checkNotNullExpressionValue(adsList, "phase.adsList");
        Iterator<T> it = adsList.iterator();
        while (it.hasNext()) {
            id.a aVarCreateAdElementParams = createAdElementParams((Rendering.Phase.ViewComponent) it.next(), measurerFactory);
            if (aVarCreateAdElementParams != null) {
                aVarI.a(aVarCreateAdElementParams);
            }
        }
        List<Rendering.Phase.ViewComponent> controlsList = phase.getControlsList();
        Intrinsics.checkNotNullExpressionValue(controlsList, "phase.controlsList");
        Iterator<T> it2 = controlsList.iterator();
        while (it2.hasNext()) {
            id.a aVarCreateAdElementParams2 = createAdElementParams((Rendering.Phase.ViewComponent) it2.next(), measurerFactory);
            if (aVarCreateAdElementParams2 != null) {
                aVarI.b(aVarCreateAdElementParams2);
            }
        }
        List<Rendering.Phase.Event> eventsList = phase.getEventsList();
        Intrinsics.checkNotNullExpressionValue(eventsList, "phase.eventsList");
        Iterator<T> it3 = eventsList.iterator();
        while (it3.hasNext()) {
            b0 b0VarCreateEventParams = createEventParams((Rendering.Phase.Event) it3.next());
            if (b0VarCreateEventParams != null) {
                aVarI.c(b0VarCreateEventParams);
            }
        }
        List<Rendering.Phase.MethodComponent> methodsList = phase.getMethodsList();
        Intrinsics.checkNotNullExpressionValue(methodsList, "phase.methodsList");
        Iterator<T> it4 = methodsList.iterator();
        while (it4.hasNext()) {
            String name = ((Rendering.Phase.MethodComponent) it4.next()).getName();
            Intrinsics.checkNotNullExpressionValue(name, "methodComponent.name");
            aVarI.d(new r0(name));
        }
        return aVarI.e();
    }

    @VisibleForTesting
    @NotNull
    public final id.j createAppearanceParams(@Nullable Rendering.Phase.ViewComponent.Appearance appearance) {
        if (appearance == null || appearance == Rendering.Phase.ViewComponent.Appearance.getDefaultInstance()) {
            return new id.j(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        id.k kVarCreateBackground = createBackground(appearance.getBackground());
        Integer numU = f0.u(appearance.getBackgroundColor());
        Boolean boolValueOf = Boolean.valueOf(appearance.getVisible());
        Boolean boolValueOf2 = Boolean.valueOf(appearance.getClickable());
        Float fValueOf = Float.valueOf((float) appearance.getOpacity());
        Float fValueOf2 = Float.valueOf((float) appearance.getFontSize());
        id.f0 f0VarA = id.f0.f74486d.a(appearance.getFontStyle());
        Boolean boolValueOf3 = Boolean.valueOf(appearance.getOutlined());
        Float fValueOf3 = Float.valueOf((float) appearance.getStrokeWidth());
        Integer numU2 = f0.u(appearance.getStrokeColor());
        Integer numU3 = f0.u(appearance.getFillColor());
        Integer numU4 = f0.u(appearance.getShadowColor());
        v0 v0VarA = v0.f74641e.a(appearance.getPadding());
        Float fValueOf4 = Float.valueOf((float) appearance.getCornerRadius());
        Integer numValueOf = Integer.valueOf(appearance.getTextNumberOfLines());
        Float fValueOf5 = Float.valueOf((float) appearance.getTextLineSpacing());
        k0 k0VarA = k0.f74574d.a(appearance.getTextAlignment());
        if (k0VarA == null) {
            k0VarA = k0.Center;
        }
        return new id.j(kVarCreateBackground, numU, boolValueOf, boolValueOf2, fValueOf, fValueOf2, f0VarA, boolValueOf3, fValueOf3, numU2, numU3, numU4, v0VarA, fValueOf4, numValueOf, fValueOf5, k0VarA);
    }

    @VisibleForTesting
    @NotNull
    public final id.z createElementLayoutParams(@Nullable Rendering.Phase.ViewComponent.Layout layout) {
        z.a aVar = new z.a();
        if (layout == null) {
            return aVar.a();
        }
        List<Rendering.Phase.ViewComponent.Layout.Constraint> constraintsList = layout.getConstraintsList();
        Intrinsics.checkNotNullExpressionValue(constraintsList, "layout.constraintsList");
        for (Rendering.Phase.ViewComponent.Layout.Constraint constraint : constraintsList) {
            final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor sourceAnchor = constraint.getSourceAnchor();
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor targetAnchor = constraint.getTargetAnchor();
            String target = constraint.getTarget();
            Intrinsics.checkNotNullExpressionValue(target, "constraint.target");
            float value = (float) constraint.getValue();
            switch (sourceAnchor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceAnchor.ordinal()]) {
                case 1:
                    aVar.n(value);
                    aVar.o((float) constraint.getMultiplier());
                    break;
                case 2:
                    aVar.c(value);
                    aVar.d((float) constraint.getMultiplier());
                    break;
                case 3:
                    f1 sideType = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType != null) {
                        aVar.e(new e1(sideType, target));
                    }
                    aVar.g(value);
                    break;
                case 4:
                    f1 sideType2 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType2 != null) {
                        aVar.k(new e1(sideType2, target));
                    }
                    aVar.i(value);
                    break;
                case 5:
                    f1 sideType3 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType3 != null) {
                        aVar.j(new e1(sideType3, target));
                    }
                    aVar.h(value);
                    break;
                case 6:
                    f1 sideType4 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType4 != null) {
                        aVar.b(new e1(sideType4, target));
                    }
                    aVar.f(value);
                    break;
                case 7:
                    aVar.l(value);
                    break;
                case 8:
                    aVar.m(value);
                    break;
                default:
                    io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.ads.networks.adaptiverendering.l
                        @Override // ce.b
                        public final Object get() {
                            return AdaptiveRenderingParams.createElementLayoutParams$lambda$17$lambda$16(sourceAnchor);
                        }
                    });
                    break;
            }
        }
        return aVar.a();
    }

    @VisibleForTesting
    @Nullable
    public final b0 createEventParams(@Nullable Rendering.Phase.Event event) {
        e0 eventType;
        if (event == null || event == Rendering.Phase.Event.getDefaultInstance() || (eventType = AdaptiveRenderingParamsKt.toEventType(event.getName())) == null) {
            return null;
        }
        List<Rendering.Phase.Event.Task> tasksList = event.getTasksList();
        Intrinsics.checkNotNullExpressionValue(tasksList, "event.tasksList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tasksList.iterator();
        while (it.hasNext()) {
            c0 c0VarCreateEventTaskParams = createEventTaskParams((Rendering.Phase.Event.Task) it.next());
            if (c0VarCreateEventTaskParams != null) {
                arrayList.add(c0VarCreateEventTaskParams);
            }
        }
        String source = event.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "event.source");
        return new b0(eventType, source, arrayList);
    }

    @VisibleForTesting
    @Nullable
    public final c0 createEventTaskParams(@Nullable Rendering.Phase.Event.Task task) {
        d0 eventTaskType;
        if (task == null || task == Rendering.Phase.Event.Task.getDefaultInstance() || (eventTaskType = AdaptiveRenderingParamsKt.toEventTaskType(task.getName())) == null) {
            return null;
        }
        String target = task.getTarget();
        Intrinsics.checkNotNullExpressionValue(target, "task.target");
        String value = task.getValue();
        t1 stateGroupsList = task.getStateGroupsList();
        Intrinsics.checkNotNullExpressionValue(stateGroupsList, "task.stateGroupsList");
        return new c0(eventTaskType, target, value, CollectionsKt.toList(stateGroupsList));
    }

    @VisibleForTesting
    @Nullable
    public final List<p0> createMeasurerParamsList(@Nullable List<Rendering.Phase.ViewComponent.Measurer> measurerList) {
        List<Rendering.Phase.ViewComponent.Measurer> list = measurerList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<Rendering.Phase.ViewComponent.Measurer> list2 = measurerList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Rendering.Phase.ViewComponent.Measurer measurer : list2) {
            String name = measurer.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            arrayList.add(new p0(name, measurer.getParametersMap()));
        }
        return arrayList;
    }

    @Nullable
    public final id.c getAdParams() {
        return this.adParams;
    }

    public boolean isValid(@NotNull od.c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.adParams != null) {
            return true;
        }
        callback.onAdLoadFailed(ae.a.k("rendering_configuration"));
        return false;
    }
}
