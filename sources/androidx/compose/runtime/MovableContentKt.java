package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00062\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\b\u001aO\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\f\u001aa\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001as\u0010\u0004\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0012\u001a=\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00132\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\b\u001aO\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00062\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\f\u001aa\u0010\u0014\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\u000f\u001as\u0010\u0014\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n\"\u0004\b\u0003\u0010\r2)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "movableContentOf", "(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "P", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function3;", "P1", "P2", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function4;", "P3", "Lkotlin/Function3;", "(Lkotlin/jvm/functions/Function5;)Lkotlin/jvm/functions/Function5;", "P4", "Lkotlin/Function4;", "(Lkotlin/jvm/functions/Function6;)Lkotlin/jvm/functions/Function6;", "R", "movableContentWithReceiverOf", "", "movableContentKey", "I", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    @NotNull
    public static final Function2<Composer, Integer, Unit> movableContentOf(@NotNull final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new Function3<Unit, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit, Composer composer, Integer num) {
                invoke(unit, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Unit it, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i10 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1079330685, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                content.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:38)");
                }
                composer.insertMovableContent(movableContent, Unit.f93236a);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> Function3<R, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull final Function3<? super R, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new Function3<R, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(R r10, @Nullable Composer composer, int i10) {
                if ((i10 & 14) == 0) {
                    i10 |= composer.changed(r10) ? 4 : 2;
                }
                if ((i10 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                content.invoke(r10, composer, Integer.valueOf(i10 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new Function3<R, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(R r10, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
                }
                composer.insertMovableContent(movableContent, r10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P> Function3<P, Composer, Integer, Unit> movableContentOf(@NotNull Function3<? super P, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(content);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new Function3<P, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(P p10, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
                }
                composer.insertMovableContent(movableContent, p10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P> Function4<R, P, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull final Function4<? super R, ? super P, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new Function3<Pair<? extends R, ? extends P>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends R, ? extends P> it, @Nullable Composer composer, int i10) {
                int i11;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(it) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                content.invoke(it.getFirst(), it.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new Function4<R, P, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(R r10, P p10, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p10) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:198)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(r10, p10));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2> Function4<P1, P2, Composer, Integer, Unit> movableContentOf(@NotNull final Function4<? super P1, ? super P2, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new Function3<Pair<? extends P1, ? extends P2>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends P1, ? extends P2> it, @Nullable Composer composer, int i10) {
                int i11;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(it) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                content.invoke(it.getFirst(), it.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new Function4<P1, P2, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(p12, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2> Function5<R, P1, P2, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull final Function5<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> it, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1322148760, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:224)");
                }
                content.invoke(it.getFirst().getFirst(), it.getFirst().getSecond(), it.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new Function5<R, P1, P2, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p12) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p22) ? 256 : 128;
                }
                if ((i11 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:227)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(r10, p12), p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3> Function5<P1, P2, P3, Composer, Integer, Unit> movableContentOf(@NotNull final Function5<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-284417101, true, new Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3> it, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-284417101, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:114)");
                }
                content.invoke(it.getFirst().getFirst(), it.getFirst().getSecond(), it.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new Function5<P1, P2, P3, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p32) ? 256 : 128;
                }
                if ((i11 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:117)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(p12, p22), p32));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2, P3> Function6<R, P1, P2, P3, Composer, Integer, Unit> movableContentWithReceiverOf(@NotNull final Function6<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(838586922, true, new Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>> it, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(838586922, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:253)");
                }
                content.invoke(it.getFirst().getFirst(), it.getFirst().getSecond(), it.getSecond().getFirst(), it.getSecond().getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new Function6<R, P1, P2, P3, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, P3 p32, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p12) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p22) ? 256 : 128;
                }
                if ((i10 & 7168) == 0) {
                    i11 |= composer.changed(p32) ? 2048 : 1024;
                }
                if ((i11 & 46811) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:256)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(r10, p12), TuplesKt.to(p22, p32)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3, P4> Function6<P1, P2, P3, P4, Composer, Integer, Unit> movableContentOf(@NotNull final Function6<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1876318581, true, new Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(@NotNull Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>> it, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1876318581, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:143)");
                }
                content.invoke(it.getFirst().getFirst(), it.getFirst().getSecond(), it.getSecond().getFirst(), it.getSecond().getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new Function6<P1, P2, P3, P4, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return Unit.f93236a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, P4 p42, @Nullable Composer composer, int i10) {
                int i11;
                if ((i10 & 14) == 0) {
                    i11 = (composer.changed(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    i11 |= composer.changed(p22) ? 32 : 16;
                }
                if ((i10 & 896) == 0) {
                    i11 |= composer.changed(p32) ? 256 : 128;
                }
                if ((i10 & 7168) == 0) {
                    i11 |= composer.changed(p42) ? 2048 : 1024;
                }
                if ((i11 & 46811) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:146)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(p12, p22), TuplesKt.to(p32, p42)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
