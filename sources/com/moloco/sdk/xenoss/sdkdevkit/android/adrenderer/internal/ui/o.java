package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o {

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BoxScope f57157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f57158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function10 f57159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f57160e;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0735a extends kotlin.jvm.internal.y implements Function0 {
            public C0735a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).x();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {
            public b(Object obj) {
                super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC0780a.c p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).m(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.AbstractC0780a.c) obj);
                return Unit.f93236a;
            }
        }

        public a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Function10 function10, boolean z10) {
            this.f57157b = boxScope;
            this.f57158c = iVar;
            this.f57159d = function10;
            this.f57160e = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(504986716, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton.<anonymous>.<anonymous> (AdGoNextButton.kt:47)");
            }
            BoxScope boxScope = this.f57157b;
            StateFlow stateFlowL = this.f57158c.l();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.f57158c;
            composer.startReplaceableGroup(328179957);
            boolean zChanged = composer.changed(iVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C0735a(iVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar2 = this.f57158c;
            composer.startReplaceableGroup(328181678);
            boolean zChanged2 = composer.changed(iVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(iVar2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            o.f(boxScope, stateFlowL, function0, (Function1) ((KFunction) objRememberedValue2), this.f57159d, this.f57160e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57161r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ State f57162s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ MutableState f57163t;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState f57164b;

            public a(MutableState mutableState) {
                this.f57164b = mutableState;
            }

            public final Object a(int i10, Continuation continuation) {
                o.g(this.f57164b, i10);
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b, reason: collision with other inner class name */
        public static final class C0736b implements Flow {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow f57165b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b$a */
            public static final class a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f57166b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b$a$a, reason: collision with other inner class name */
                public static final class C0737a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public /* synthetic */ Object f57167r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public int f57168s;

                    public C0737a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57167r = obj;
                        this.f57168s |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f57166b = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.b.C0736b.a.C0737a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.b.C0736b.a.C0737a) r0
                        int r1 = r0.f57168s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f57168s = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f57167r
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.f57168s
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f57166b
                        r2 = r5
                        java.lang.Number r2 = (java.lang.Number) r2
                        int r2 = r2.intValue()
                        if (r2 <= 0) goto L48
                        r0.f57168s = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o.b.C0736b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C0736b(Flow flow) {
                this.f57165b = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f57165b.collect(new a(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(State state, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f57162s = state;
            this.f57163t = mutableState;
        }

        public static final int c(State state) {
            d.a aVarB = o.b(state);
            d.a.b bVar = aVarB instanceof d.a.b ? (d.a.b) aVarB : null;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f57162s, this.f57163t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57161r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final State state = this.f57162s;
                Flow flowU = hg.i.U(new C0736b(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(o.b.c(state));
                    }
                })), 1);
                a aVar = new a(this.f57163t);
                this.f57161r = 1;
                if (flowU.collect(aVar, this) == objG) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final d.a b(State state) {
        return (d.a) state.getValue();
    }

    public static final Unit c(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, i.a aVar, Function10 function10, Function10 function102, int i10, Composer composer, int i11) {
        e(boxScope, iVar, aVar, function10, function102, composer, i10 | 1);
        return Unit.f93236a;
    }

    public static final Unit d(BoxScope boxScope, StateFlow stateFlow, Function0 function0, Function1 function1, Function10 function10, boolean z10, int i10, Composer composer, int i11) {
        f(boxScope, stateFlow, function0, function1, function10, z10, composer, i10 | 1);
        return Unit.f93236a;
    }

    public static final void e(final BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final i.a aVar, final Function10 function10, final Function10 function102, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1217166503);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(adViewModel) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(function10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(function102) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217166503, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton (AdGoNextButton.kt:27)");
            }
            Function10 function103 = null;
            Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.a()) : null;
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                function103 = function102;
            } else if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                function103 = function10;
            } else if (boolValueOf != null) {
                throw new lf.m();
            }
            boolean z10 = aVar instanceof i.a.C0751a;
            boolean z11 = (z10 || (aVar instanceof i.a.b) || !(aVar instanceof i.a.c)) ? false : true;
            if (function103 != null) {
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 504986716, true, new a(boxScope, adViewModel, function103, z11));
                if (z10) {
                    composerStartRestartGroup.startReplaceableGroup(-1024214432);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (aVar instanceof i.a.b) {
                    composerStartRestartGroup.startReplaceableGroup(-1024212640);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (aVar instanceof i.a.c) {
                    composerStartRestartGroup.startReplaceableGroup(-1024210752);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1685727487);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.c(boxScope, adViewModel, aVar, function10, function102, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void f(final BoxScope boxScope, final StateFlow stateFlow, final Function0 function0, final Function1 function1, final Function10 function10, final boolean z10, Composer composer, final int i10) {
        BoxScope boxScope2;
        int i11;
        Function0 function02;
        Function1 function12;
        Function10 function102;
        Composer composerStartRestartGroup = composer.startRestartGroup(12332512);
        if ((i10 & 6) == 0) {
            boxScope2 = boxScope;
            i11 = (composerStartRestartGroup.changed(boxScope2) ? 4 : 2) | i10;
        } else {
            boxScope2 = boxScope;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(stateFlow) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            function02 = function0;
            i11 |= composerStartRestartGroup.changed(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i10 & 3072) == 0) {
            function12 = function1;
            i11 |= composerStartRestartGroup.changed(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i10 & 24576) == 0) {
            function102 = function10;
            i11 |= composerStartRestartGroup.changed(function102) ? 16384 : 8192;
        } else {
            function102 = function10;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(12332512, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GoNextButton (AdGoNextButton.kt:76)");
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(stateFlow, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i11 >> 3) & 14, 7);
            composerStartRestartGroup.startReplaceableGroup(-2101091474);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit = Unit.f93236a;
            composerStartRestartGroup.startReplaceableGroup(-2101089382);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b(stateCollectAsStateWithLifecycle, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            int iC = lf.t.c(a(mutableState));
            d.a aVarB = b(stateCollectAsStateWithLifecycle);
            d.a.b bVar = aVarB instanceof d.a.b ? (d.a.b) aVarB : null;
            int iC2 = lf.t.c(bVar != null ? bVar.a() : 0);
            Boolean boolValueOf = Boolean.valueOf(b(stateCollectAsStateWithLifecycle) instanceof d.a.C0768a);
            Boolean boolValueOf2 = Boolean.valueOf(!(b(stateCollectAsStateWithLifecycle) instanceof d.a.c));
            Boolean boolValueOf3 = Boolean.valueOf(z10);
            lf.t tVarA = lf.t.a(iC);
            lf.t tVarA2 = lf.t.a(iC2);
            int i12 = i11 << 3;
            function102.invoke(boxScope2, boolValueOf, boolValueOf2, function02, function12, boolValueOf3, tVarA, tVarA2, composerStartRestartGroup, Integer.valueOf((i11 & 14) | (i12 & 7168) | (i12 & 57344) | (458752 & i11) | ((i11 << 12) & 234881024)));
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.d(boxScope, stateFlow, function0, function1, function10, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void g(MutableState mutableState, int i10) {
        mutableState.setValue(Integer.valueOf(i10));
    }
}
