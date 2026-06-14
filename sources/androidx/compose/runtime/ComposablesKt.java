package androidx.compose.runtime;

import androidx.activity.s;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001aB\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\n\u001aL\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\f\u001aF\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000f\u001aD\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a0\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a0\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a_\u0010\"\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a_\u0010$\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010#\u001an\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010%\u001an\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u008f\u0001\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010(\u001a\u008f\u0001\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010(\u001a\u000f\u0010)\u001a\u00020\u0014H\u0001¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-\"\u0011\u00101\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u0010:\u001a\u0002068G¢\u0006\f\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108\"\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", C4240b4.i.W, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "content", "ReusableContent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "ReusableContentHost", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", ExifInterface.LONGITUDE_EAST, "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "update", "ComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "()V", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(final Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        composer.startReplaceableGroup(1886828752);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt.ComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(final Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        composer.startReplaceableGroup(1405779621);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt.ReusableComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void ReusableContent(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(207, obj);
        content.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReusableGroup(207, Boolean.valueOf(z10));
        boolean zChanged = composer.changed(z10);
        if (z10) {
            content.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final Composer getCurrentComposer(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i10, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new n("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    @NotNull
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-43352356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i10, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(@NotNull Object[] keys, @NotNull Function2<? super Composer, ? super Integer, ? extends T> block, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(-11941951);
        T tInvoke = block.invoke(composer, Integer.valueOf((i10 >> 3) & 14));
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = calculation.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1165786124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionContextBuildContext;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = calculation.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-548224868);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        content.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-692256719);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        content.invoke(composer, Integer.valueOf((i10 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = calculation.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> skippableUpdate, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(skippableUpdate, "skippableUpdate");
        Intrinsics.checkNotNullParameter(content, "content");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        skippableUpdate.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> factory, Function1<? super Updater<T>, Unit> update, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> skippableUpdate, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(skippableUpdate, "skippableUpdate");
        Intrinsics.checkNotNullParameter(content, "content");
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, ExifInterface.LONGITUDE_EAST);
        if (!s.a(applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(factory);
        } else {
            composer.useNode();
        }
        update.invoke(Updater.m1247boximpl(Updater.m1248constructorimpl(composer)));
        skippableUpdate.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composer)), composer, Integer.valueOf((i10 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        content.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(@NotNull Object[] keys, @NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : keys) {
            zChanged |= composer.changed(obj);
        }
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = calculation.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@NotNull Function0<? extends T> calculation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        composer.startReplaceableGroup(-492369756);
        T tInvoke = (T) composer.rememberedValue();
        if (tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = calculation.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }
}
