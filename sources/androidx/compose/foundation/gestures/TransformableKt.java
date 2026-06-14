package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.appsflyer.AppsFlyerProperties;
import gg.g;
import gg.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "panZoomLock", "Lgg/g;", "Landroidx/compose/foundation/gestures/TransformEvent;", AppsFlyerProperties.CHANNEL, "", "detectZoom", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lgg/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransformableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {134, 136}, m = "detectZoom")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if (r0 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d9 -> B:25:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r27, androidx.compose.runtime.State<java.lang.Boolean> r28, gg.g r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, gg.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier, @NotNull final TransformableState state, final boolean z10, final boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("transformable");
                inspectorInfo.getProperties().set("state", state);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.TransformableKt.transformable.2

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", f = "Transformable.kt", l = {72, 75}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ g $channel;
                final /* synthetic */ TransformableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1", f = "Transformable.kt", l = {80}, m = "invokeSuspend")
                static final class C00371 extends k implements Function2<TransformScope, Continuation, Object> {
                    final /* synthetic */ g $channel;
                    final /* synthetic */ Ref$ObjectRef $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00371(Ref$ObjectRef ref$ObjectRef, g gVar, Continuation continuation) {
                        super(2, continuation);
                        this.$event = ref$ObjectRef;
                        this.$channel = gVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        C00371 c00371 = new C00371(this.$event, this.$channel, continuation);
                        c00371.L$0 = obj;
                        return c00371;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
                        return ((C00371) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                        /*
                            r6 = this;
                            java.lang.Object r0 = pf.b.g()
                            int r1 = r6.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r6.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                            kotlin.d.b(r7)
                            goto L59
                        L17:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1f:
                            kotlin.d.b(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                            r3 = r7
                        L27:
                            kotlin.jvm.internal.Ref$ObjectRef r7 = r6.$event
                            java.lang.Object r7 = r7.f93280b
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                            if (r1 != 0) goto L5c
                            boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                            if (r1 == 0) goto L36
                            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                            goto L37
                        L36:
                            r7 = 0
                        L37:
                            if (r7 == 0) goto L48
                            float r1 = r7.getZoomChange()
                            long r4 = r7.getPanChange()
                            float r7 = r7.getRotationChange()
                            r3.mo244transformByd4ec7I(r1, r4, r7)
                        L48:
                            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.$event
                            gg.g r7 = r6.$channel
                            r6.L$0 = r3
                            r6.L$1 = r1
                            r6.label = r2
                            java.lang.Object r7 = r7.k(r6)
                            if (r7 != r0) goto L59
                            return r0
                        L59:
                            r1.f93280b = r7
                            goto L27
                        L5c:
                            kotlin.Unit r7 = kotlin.Unit.f93236a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.AnonymousClass2.AnonymousClass1.C00371.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(g gVar, TransformableState transformableState, Continuation continuation) {
                    super(2, continuation);
                    this.$channel = gVar;
                    this.$state = transformableState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channel, this.$state, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
                
                    if (r10.transform(r1, r6, r9) == r0) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0078 -> B:13:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = pf.b.g()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        kotlin.d.b(r10)     // Catch: java.util.concurrent.CancellationException -> L15
                    L15:
                        r10 = r1
                        goto L36
                    L17:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1f:
                        java.lang.Object r1 = r9.L$2
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                        java.lang.Object r4 = r9.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                        java.lang.Object r5 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                        kotlin.d.b(r10)
                        goto L55
                    L2f:
                        kotlin.d.b(r10)
                        java.lang.Object r10 = r9.L$0
                        kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                    L36:
                        boolean r1 = kotlinx.coroutines.i.i(r10)
                        if (r1 == 0) goto L7a
                        kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                        r1.<init>()
                        gg.g r4 = r9.$channel
                        r9.L$0 = r10
                        r9.L$1 = r1
                        r9.L$2 = r1
                        r9.label = r3
                        java.lang.Object r4 = r4.k(r9)
                        if (r4 != r0) goto L52
                        goto L77
                    L52:
                        r5 = r10
                        r10 = r4
                        r4 = r1
                    L55:
                        r1.f93280b = r10
                        java.lang.Object r10 = r4.f93280b
                        boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                        if (r10 == 0) goto L78
                        androidx.compose.foundation.gestures.TransformableState r10 = r9.$state     // Catch: java.util.concurrent.CancellationException -> L78
                        androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L78
                        androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r6 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch: java.util.concurrent.CancellationException -> L78
                        gg.g r7 = r9.$channel     // Catch: java.util.concurrent.CancellationException -> L78
                        r8 = 0
                        r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L78
                        r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L78
                        r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L78
                        r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L78
                        r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L78
                        java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L78
                        if (r10 != r0) goto L78
                    L77:
                        return r0
                    L78:
                        r10 = r5
                        goto L36
                    L7a:
                        kotlin.Unit r10 = kotlin.Unit.f93236a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1509335853);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1509335853, i10, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z10), composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = j.b(Integer.MAX_VALUE, null, null, 6, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                g gVar = (g) objRememberedValue;
                composer.startReplaceableGroup(-2015617726);
                if (z11) {
                    TransformableState transformableState = state;
                    EffectsKt.LaunchedEffect(transformableState, new AnonymousClass1(gVar, transformableState, null), composer, 64);
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new TransformableKt$transformable$2$block$1$1(stateRememberUpdatedState, gVar, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = z11 ? SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, Unit.f93236a, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue2) : Modifier.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }
        });
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return transformable(modifier, transformableState, z10, z11);
    }
}
