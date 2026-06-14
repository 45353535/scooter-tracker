package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a+\u0010\u0003\u001a\u00020\u00012\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ReportDrawn", "", "(Landroidx/compose/runtime/Composer;I)V", "ReportDrawnAfter", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReportDrawnWhen", "predicate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@Nullable Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(new Function0<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            }, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.f93236a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    ReportDrawnKt.ReportDrawn(composer2, i10 | 1);
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull final Function1<? super Continuation, ? extends Object> function1, @Nullable Composer composer, final int i10) {
        int i11;
        FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
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

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            ReportDrawnKt.ReportDrawnAfter(function1, composer2, i10 | 1);
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-100805929);
            boolean zChanged = composerStartRestartGroup.changed(fullyDrawnReporter) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(function1, fullyDrawnReporter, (Function2) objRememberedValue, composerStartRestartGroup, i11 & 14);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnAfter.2
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

                public final void invoke(@Nullable Composer composer2, int i12) {
                    ReportDrawnKt.ReportDrawnAfter(function1, composer2, i10 | 1);
                }
            });
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@NotNull final Function0<Boolean> function0, @Nullable Composer composer, final int i10) {
        int i11;
        final FullyDrawnReporter fullyDrawnReporter;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.f93236a;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            ReportDrawnKt.ReportDrawnWhen(function0, composer2, i10 | 1);
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-537074000);
            boolean zChanged = composerStartRestartGroup.changed(fullyDrawnReporter) | composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, function0);
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                reportDrawnComposition.removeReporter();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(fullyDrawnReporter, function0, (Function1) objRememberedValue, composerStartRestartGroup, (i11 << 3) & 112);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.f93236a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    ReportDrawnKt.ReportDrawnWhen(function0, composer2, i10 | 1);
                }
            });
        }
    }
}
