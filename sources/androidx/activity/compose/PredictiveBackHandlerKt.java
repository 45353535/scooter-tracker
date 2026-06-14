package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006.\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/coroutines/Continuation;", "", "", "onBack", "PredictiveBackHandler", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PredictiveBackHandlerKt {

    /* JADX INFO: renamed from: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 $backCallBack;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Ref$ObjectRef $onBackInstance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, boolean z10, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
            super(2, continuation);
            this.$backCallBack = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
            this.$enabled = z10;
            this.$onBackInstance = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$backCallBack, this.$enabled, this.$onBackInstance, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            setEnabled(this.$enabled);
            if (!this.$enabled) {
                OnBackInstance onBackInstance = (OnBackInstance) this.$onBackInstance.f93280b;
                if (onBackInstance != null) {
                    kotlin.coroutines.jvm.internal.b.a(onBackInstance.close());
                }
                this.$onBackInstance.f93280b = null;
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    public static final void PredictiveBackHandler(final boolean z10, @NotNull final Function2<Flow, ? super Continuation, ? extends Object> function2, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i12 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.e.f93267b, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(-1071578855);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OnBackPressedCallback(z10) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackCancelled() {
                        super.handleOnBackCancelled();
                        OnBackInstance onBackInstance = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                        OnBackInstance onBackInstance2 = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance2 == null) {
                            return;
                        }
                        onBackInstance2.setPredictiveBack(false);
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        OnBackInstance onBackInstance = (OnBackInstance) ref$ObjectRef2.f93280b;
                        if (onBackInstance != null && !onBackInstance.getIsPredictiveBack()) {
                            onBackInstance.cancel();
                            ref$ObjectRef2.f93280b = null;
                        }
                        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                        if (ref$ObjectRef3.f93280b == null) {
                            ref$ObjectRef3.f93280b = new OnBackInstance(coroutineScope, false, PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                        }
                        OnBackInstance onBackInstance2 = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance2 != null) {
                            onBackInstance2.close();
                        }
                        OnBackInstance onBackInstance3 = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance3 == null) {
                            return;
                        }
                        onBackInstance3.setPredictiveBack(false);
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackProgressed(@NotNull BackEventCompat backEvent) {
                        super.handleOnBackProgressed(backEvent);
                        OnBackInstance onBackInstance = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance != null) {
                            gg.k.b(onBackInstance.m0sendJP2dKIU(backEvent));
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackStarted(@NotNull BackEventCompat backEvent) {
                        super.handleOnBackStarted(backEvent);
                        OnBackInstance onBackInstance = (OnBackInstance) ref$ObjectRef.f93280b;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                        ref$ObjectRef.f93280b = new OnBackInstance(coroutineScope, true, PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new AnonymousClass1(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z10, ref$ObjectRef, null), composerStartRestartGroup, i12 & 14);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(-1071576336);
            boolean zChanged = composerStartRestartGroup.changed(onBackPressedDispatcher) | composerStartRestartGroup.changed(lifecycleOwner) | composerStartRestartGroup.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        onBackPressedDispatcher.addCallback(lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
                        final PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$12 = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                remove();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.f93236a;
                }

                public final void invoke(@Nullable Composer composer2, int i14) {
                    PredictiveBackHandlerKt.PredictiveBackHandler(z10, function2, composer2, i10 | 1, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Flow, Continuation, Object> PredictiveBackHandler$lambda$0(State<? extends Function2<Flow, ? super Continuation, ? extends Object>> state) {
        return (Function2) state.getValue();
    }
}
