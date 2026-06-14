package p;

import androidx.activity.s;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil.compose.AsyncImagePainter;
import coil.compose.ContentPainterModifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import y.h;
import z.c;
import z.i;
import z.j;
import z.k;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    static final class C1157a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f97960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f97961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o.e f97962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f97963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f97964j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f97965k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Alignment f97966l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ContentScale f97967m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f97968n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ColorFilter f97969o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f97970p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f97971q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f97972r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f97973s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1157a(Object obj, String str, o.e eVar, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, int i11, int i12, int i13) {
            super(2);
            this.f97960f = obj;
            this.f97961g = str;
            this.f97962h = eVar;
            this.f97963i = modifier;
            this.f97964j = function1;
            this.f97965k = function12;
            this.f97966l = alignment;
            this.f97967m = contentScale;
            this.f97968n = f10;
            this.f97969o = colorFilter;
            this.f97970p = i10;
            this.f97971q = i11;
            this.f97972r = i12;
            this.f97973s = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }

        public final void invoke(Composer composer, int i10) {
            a.a(this.f97960f, this.f97961g, this.f97962h, this.f97963i, this.f97964j, this.f97965k, this.f97966l, this.f97967m, this.f97968n, this.f97969o, this.f97970p, composer, this.f97971q | 1, this.f97972r, this.f97973s);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f97974f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.f97974f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f97974f.invoke();
        }
    }

    static final class c implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f97975a = new c();

        /* JADX INFO: renamed from: p.a$c$a, reason: collision with other inner class name */
        static final class C1158a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1158a f97976f = new C1158a();

            C1158a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.f93236a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
            }
        }

        c() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo30measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return MeasureScope.CC.p(measureScope, Constraints.m3921getMinWidthimpl(j10), Constraints.m3920getMinHeightimpl(j10), null, C1158a.f97976f, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    static final class d extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f97977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Painter f97978g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f97979h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Alignment f97980i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ContentScale f97981j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f97982k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ColorFilter f97983l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f97984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10) {
            super(2);
            this.f97977f = modifier;
            this.f97978g = painter;
            this.f97979h = str;
            this.f97980i = alignment;
            this.f97981j = contentScale;
            this.f97982k = f10;
            this.f97983l = colorFilter;
            this.f97984m = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }

        public final void invoke(Composer composer, int i10) {
            a.b(this.f97977f, this.f97978g, this.f97979h, this.f97980i, this.f97981j, this.f97982k, this.f97983l, composer, this.f97984m | 1);
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f97985f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f97985f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Unit.f93236a;
        }

        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.f97985f);
            SemanticsPropertiesKt.m3364setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m3353getImageo7Vup1c());
        }
    }

    public static final void a(Object obj, String str, o.e eVar, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, Composer composer, int i11, int i12, int i13) {
        int iM2071getDefaultFilterQualityfv9h1I;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2030202961);
        Modifier modifier2 = (i13 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1 function1A = (i13 & 16) != 0 ? AsyncImagePainter.INSTANCE.a() : function1;
        Function1 function13 = (i13 & 32) != 0 ? null : function12;
        Alignment center = (i13 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i13 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i13 & 256) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i13 & 512) != 0 ? null : colorFilter;
        if ((i13 & 1024) != 0) {
            i14 = i12 & (-15);
            iM2071getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I();
        } else {
            iM2071getDefaultFilterQualityfv9h1I = i10;
            i14 = i12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i11, i14, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        h hVarF = f(g.d(obj, composerStartRestartGroup, 8), fit, composerStartRestartGroup, 8 | ((i11 >> 18) & 112));
        int i15 = i11 >> 6;
        int i16 = i11 >> 9;
        int i17 = i16 & 57344;
        Function1 function14 = function1A;
        Function1 function15 = function13;
        ContentScale contentScale2 = fit;
        int i18 = iM2071getDefaultFilterQualityfv9h1I;
        AsyncImagePainter asyncImagePainterD = p.b.d(hVarF, eVar, function14, function15, contentScale2, i18, composerStartRestartGroup, ((i14 << 15) & 458752) | (i15 & 7168) | (i15 & 896) | 72 | i17, 0);
        j jVarK = hVarF.K();
        b(jVarK instanceof p.c ? modifier2.then((Modifier) jVarK) : modifier2, asyncImagePainterD, str, center, fit, f11, colorFilter2, composerStartRestartGroup, (i16 & 7168) | ((i11 << 3) & 896) | i17 | (i16 & 458752) | (3670016 & i16));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new C1157a(obj, str, eVar, modifier2, function1A, function13, center, fit, f11, colorFilter2, iM2071getDefaultFilterQualityfv9h1I, i11, i12, i13));
    }

    public static final void b(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            i11 = i10;
            ComposerKt.traceEventStart(10290533, i11, -1, "coil.compose.Content (AsyncImage.kt:154)");
        } else {
            i11 = i10;
        }
        Modifier modifierThen = ClipKt.clipToBounds(d(modifier, str)).then(new ContentPainterModifier(painter, alignment, contentScale, f10, colorFilter));
        c cVar = c.f97975a;
        composerStartRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifierThen);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        composerStartRestartGroup.startReplaceableGroup(1405779621);
        if (!s.a(composerStartRestartGroup.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new b(constructor));
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, cVar, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1255setimpl(composerM1248constructorimpl, modifierMaterialize, companion.getSetModifier());
        composerStartRestartGroup.enableReusing();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(modifier, painter, str, alignment, contentScale, f10, colorFilter, i11));
    }

    private static final Modifier d(Modifier modifier, String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new e(str), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i e(long j10) {
        if (Constraints.m3923isZeroimpl(j10)) {
            return null;
        }
        return new i(Constraints.m3915getHasBoundedWidthimpl(j10) ? z.a.a(Constraints.m3919getMaxWidthimpl(j10)) : c.b.f119121a, Constraints.m3914getHasBoundedHeightimpl(j10) ? z.a.a(Constraints.m3918getMaxHeightimpl(j10)) : c.b.f119121a);
    }

    public static final h f(h hVar, ContentScale contentScale, Composer composer, int i10) {
        j jVarA;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i10, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (hVar.q().m() == null) {
            if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone())) {
                jVarA = k.a(i.f119134d);
            } else {
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new p.c();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                jVarA = (j) objRememberedValue;
            }
            hVar = h.R(hVar, null, 1, null).k(jVarA).a();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return hVar;
    }
}
