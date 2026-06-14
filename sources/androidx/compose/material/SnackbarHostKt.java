package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import eg.k0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$\"\u0014\u0010&\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010$*D\b\u0002\u0010'\"\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006("}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "(Landroidx/compose/material/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "current", "content", "FadeInFadeOutWithScale", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "animatedOpacity", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "SnackbarFadeInMillis", "I", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$SnackbarHost$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AccessibilityManager $accessibilityManager;
        final /* synthetic */ SnackbarData $currentSnackbarData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation continuation) {
            super(2, continuation);
            this.$currentSnackbarData = snackbarData;
            this.$accessibilityManager = accessibilityManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$currentSnackbarData, this.$accessibilityManager, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                SnackbarData snackbarData = this.$currentSnackbarData;
                if (snackbarData != null) {
                    long millis = SnackbarHostKt.toMillis(snackbarData.getDuration(), this.$currentSnackbarData.getActionLabel() != null, this.$accessibilityManager);
                    this.label = 1;
                    if (k0.a(millis, this) == objG) {
                        return objG;
                    }
                }
                return Unit.f93236a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            this.$currentSnackbarData.dismiss();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedOpacity$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
    static final class C15332 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
        final /* synthetic */ AnimationSpec<Float> $animation;
        final /* synthetic */ Function0<Unit> $onAnimationFinish;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15332(Animatable<Float, AnimationVector1D> animatable, boolean z10, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation continuation) {
            super(2, continuation);
            this.$alpha = animatable;
            this.$visible = z10;
            this.$animation = animationSpec;
            this.$onAnimationFinish = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C15332(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C15332 c15332;
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$alpha;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$visible ? 1.0f : 0.0f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                c15332 = this;
                if (Animatable.animateTo$default(animatable, fC, animationSpec, null, null, c15332, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                c15332 = this;
            }
            c15332.$onAnimationFinish.invoke();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C15332) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SnackbarHostKt$animatedScale$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
    static final class C15341 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AnimationSpec<Float> $animation;
        final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15341(Animatable<Float, AnimationVector1D> animatable, boolean z10, AnimationSpec<Float> animationSpec, Continuation continuation) {
            super(2, continuation);
            this.$scale = animatable;
            this.$visible = z10;
            this.$animation = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C15341(this.$scale, this.$visible, this.$animation, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$scale;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.$visible ? 1.0f : 0.8f);
                AnimationSpec<Float> animationSpec = this.$animation;
                this.label = 1;
                if (Animatable.animateTo$default(animatable, fC, animationSpec, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C15341) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1 A[LOOP:2: B:70:0x01cf->B:71:0x01d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FadeInFadeOutWithScale(final androidx.compose.material.SnackbarData r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@NotNull final SnackbarHostState hostState, @Nullable Modifier modifier, @Nullable Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function32;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(hostState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.INSTANCE.m992getLambda1$material_release();
            }
            Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function33 = function3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData, new AnonymousClass1(currentSnackbarData, (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), composerStartRestartGroup, 64);
            Modifier modifier3 = modifier;
            FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier3, function33, composerStartRestartGroup, i12 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function32 = function33;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt.SnackbarHost.2
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                SnackbarHostKt.SnackbarHost(hostState, modifier2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z10, Function0<Unit> function0, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1016418159);
        if ((i11 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt.animatedOpacity.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            };
        }
        Function0<Unit> function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new C15332(animatable, z10, animationSpec, function02, null), composer, ((i10 >> 3) & 14) | 64);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z10, Composer composer, int i10) {
        composer.startReplaceableGroup(2003504988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new C15341(animatable, z10, animationSpec, null), composer, ((i10 >> 3) & 14) | 64);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final long toMillis(@NotNull SnackbarDuration snackbarDuration, boolean z10, @Nullable AccessibilityManager accessibilityManager) {
        long j10;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new m();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return accessibilityManager == null ? j11 : accessibilityManager.calculateRecommendedTimeoutMillis(j11, true, true, z10);
    }
}
