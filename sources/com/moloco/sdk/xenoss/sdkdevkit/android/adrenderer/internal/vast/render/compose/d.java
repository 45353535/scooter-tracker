package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57823r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57824s;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$a, reason: collision with other inner class name */
        public static final class C0756a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57825r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57826s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0756a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Continuation continuation) {
                super(2, continuation);
                this.f57826s = jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0756a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0756a(this.f57826s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f57825r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f57826s.b();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f57824s = jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57824s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57823r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0756a c0756a = new C0756a(this.f57824s, null);
                this.f57823r = 1;
                if (eg.g.g(main, c0756a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57827r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57828s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57829t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f57829t = jVar;
        }

        public static final Unit i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Offset offset, Offset offset2) {
            jVar.j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f57289a.c(offset.getPackedValue()));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f57829t, continuation);
            bVar.f57828s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57827r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f57828s;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar = this.f57829t;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return d.b.i(jVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f57827r = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(pointerInputScope, function2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57830r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57831s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57832t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0 f57833u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f57832t = jVar;
            this.f57833u = function0;
        }

        public static final Unit i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Function0 function0, Offset offset, Offset offset2) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f57289a;
            jVar.j(cVar.c(offset.getPackedValue()));
            if (function0 != null) {
                function0.invoke();
            } else {
                jVar.k(cVar.c(offset.getPackedValue()));
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f57832t, this.f57833u, continuation);
            cVar.f57831s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57830r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f57831s;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar = this.f57832t;
                final Function0 function0 = this.f57833u;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return d.c.i(jVar, function0, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f57830r = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(pointerInputScope, function2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$d, reason: collision with other inner class name */
    public static final class C0757d implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57834a;

        public C0757d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar) {
            this.f57834a = jVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f57834a.y();
        }
    }

    public static final DisposableEffectResult a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new C0757d(jVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j b(State state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) state.getValue();
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j jVar, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(jVar, function0, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final Unit d(j.b bVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        f(bVar, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final void e(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j viewModel, final Function0 function0, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1013674470);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(viewModel) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013674470, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Companion (Companion.kt:30)");
            }
            Unit unit = Unit.f93236a;
            composerStartRestartGroup.startReplaceableGroup(-1879742322);
            boolean zChanged = composerStartRestartGroup.changed(viewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(viewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1879738001);
            boolean zChanged2 = composerStartRestartGroup.changed(viewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.a(viewModel, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVarB = b(SnapshotStateKt.collectAsState(viewModel.K(), null, composerStartRestartGroup, 0, 1));
            if (jVarB instanceof j.a) {
                composerStartRestartGroup.startReplaceableGroup(1857903466);
                composerStartRestartGroup.startReplaceableGroup(-1879727652);
                boolean zChanged3 = composerStartRestartGroup.changed(viewModel);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new b(viewModel, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                p0.b((j.a) jVarB, SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue3), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (jVarB instanceof j.b) {
                composerStartRestartGroup.startReplaceableGroup(1858286099);
                composerStartRestartGroup.startReplaceableGroup(-1879715540);
                boolean zChanged4 = composerStartRestartGroup.changed(viewModel) | composerStartRestartGroup.changed(function0);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new c(viewModel, function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                f((j.b) jVarB, SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue4), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (jVarB != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1879731707);
                    composerStartRestartGroup.endReplaceableGroup();
                    throw new lf.m();
                }
                composerStartRestartGroup.startReplaceableGroup(1858714333);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(viewModel, function0, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void f(final j.b bVar, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(2103037730);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103037730, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionVastResourceImage (Companion.kt:74)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            if (!androidx.activity.s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            r0.b(bVar, null, composerStartRestartGroup, i12 & 14, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.d(bVar, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
