package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"lazyLayoutSemantics", "Landroidx/compose/ui/Modifier;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "", "reverseScrolling", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutSemanticsKt {
    @Composable
    @NotNull
    public static final Modifier lazyLayoutSemantics(@NotNull Modifier modifier, @NotNull final LazyLayoutItemProvider itemProvider, @NotNull final LazyLayoutSemanticState state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        composer.startReplaceableGroup(290103779);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290103779, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:39)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {itemProvider, state, orientation, Boolean.valueOf(z10)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zChanged |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            final boolean z12 = orientation == Orientation.Vertical;
            final Function1<Object, Integer> function1 = new Function1<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull Object needle) {
                    Intrinsics.checkNotNullParameter(needle, "needle");
                    int itemCount = itemProvider.getItemCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= itemCount) {
                            i12 = -1;
                            break;
                        }
                        if (Intrinsics.areEqual(itemProvider.getKey(i12), needle)) {
                            break;
                        }
                        i12++;
                    }
                    return Integer.valueOf(i12);
                }
            };
            final ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(state.getCurrentPosition());
                }
            }, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(state.getCanScrollForward() ? itemProvider.getItemCount() + 1.0f : state.getCurrentPosition());
                }
            }, z11);
            final Function2<Float, Float, Boolean> function2 = z10 ? new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {96}, m = "invokeSuspend")
                static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ float $delta;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LazyLayoutSemanticState lazyLayoutSemanticState, float f10, Continuation continuation) {
                        super(2, continuation);
                        this.$state = lazyLayoutSemanticState;
                        this.$delta = f10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$state, this.$delta, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            float f10 = this.$delta;
                            this.label = 1;
                            if (lazyLayoutSemanticState.animateScrollBy(f10, this) == objG) {
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
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                    return invoke(f10.floatValue(), f11.floatValue());
                }

                @NotNull
                public final Boolean invoke(float f10, float f11) {
                    if (z12) {
                        f10 = f11;
                    }
                    i.d(coroutineScope, null, null, new AnonymousClass1(state, f10, null), 3, null);
                    return Boolean.TRUE;
                }
            } : null;
            final Function1<Integer, Boolean> function12 = z10 ? new Function1<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1

                /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {112}, m = "invokeSuspend")
                static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ int $index;
                    final /* synthetic */ LazyLayoutSemanticState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(LazyLayoutSemanticState lazyLayoutSemanticState, int i10, Continuation continuation) {
                        super(2, continuation);
                        this.$state = lazyLayoutSemanticState;
                        this.$index = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass2(this.$state, this.$index, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object objG = pf.b.g();
                        int i10 = this.label;
                        if (i10 == 0) {
                            d.b(obj);
                            LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                            int i11 = this.$index;
                            this.label = 1;
                            if (lazyLayoutSemanticState.scrollToItem(i11, this) == objG) {
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
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @NotNull
                public final Boolean invoke(int i12) {
                    boolean z13 = i12 >= 0 && i12 < itemProvider.getItemCount();
                    LazyLayoutItemProvider lazyLayoutItemProvider = itemProvider;
                    if (z13) {
                        i.d(coroutineScope, null, null, new AnonymousClass2(state, i12, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i12 + ", it is out of bounds [0, " + lazyLayoutItemProvider.getItemCount() + ')').toString());
                }
            } : null;
            final CollectionInfo collectionInfo = state.collectionInfo();
            objRememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.indexForKey(semantics, function1);
                    if (z12) {
                        SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                    } else {
                        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                    }
                    Function2<Float, Float, Boolean> function22 = function2;
                    if (function22 != null) {
                        SemanticsPropertiesKt.scrollBy$default(semantics, null, function22, 1, null);
                    }
                    Function1<Integer, Boolean> function13 = function12;
                    if (function13 != null) {
                        SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function13, 1, null);
                    }
                    SemanticsPropertiesKt.setCollectionInfo(semantics, collectionInfo);
                }
            }, 1, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
