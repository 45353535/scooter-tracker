package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a{\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a{\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aB\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aB\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'\u001a\u009d\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u001a2\u0016\b\n\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u001f\b\u0004\u00102\u001a\u0019\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0002\b1H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u00103\u001aµ\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u001a2\"\b\n\u0010.\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u0001042\u001c\b\u0006\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u001a2%\b\u0004\u00102\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b1H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u009d\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u001a2\u0016\b\n\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u001f\b\u0004\u00102\u001a\u0019\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0002\b1H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u00108\u001aµ\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010(*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u001a2\"\b\n\u0010.\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u0001042\u001c\b\u0006\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u001a2%\b\u0004\u00102\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b1H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00109\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "gridSize", "slotCount", "spacing", "calculateCellsCrossAxisSizeImpl", "(III)Ljava/util/List;", "T", FirebaseAnalytics.Param.ITEMS, "", C4240b4.i.W, "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
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
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407562193, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:456)");
            }
            this.$itemContent.invoke(items, this.$items[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass2 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.$key.invoke((T) this.$items.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, List<? extends T> list) {
            super(2);
            this.$span = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m542boximpl(m565invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m565invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, (T) this.$items.get(i10)).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.$contentType.invoke((T) this.$items.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)");
            }
            this.$itemContent.invoke(items, (T) this.$items.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @NotNull
        public final Object invoke(int i10) {
            return this.$key.invoke(this.$items[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, T[] tArr) {
            super(2);
            this.$span = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m542boximpl(m566invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m566invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, this.$items[i10]).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass9 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @Nullable
        public final Object invoke(int i10) {
            return this.$contentType.invoke(this.$items[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C146210 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146210(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
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
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911455938, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:489)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i10), this.$items[i10], composer, Integer.valueOf(i12 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14632 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14632(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i10) {
            return this.$key.invoke(Integer.valueOf(i10), (T) this.$items.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14643 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14643(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, List<? extends T> list) {
            super(2);
            this.$span = function3;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m542boximpl(m567invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m567invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), (T) this.$items.get(i10)).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14654 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14654(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i10) {
            return this.$contentType.invoke(Integer.valueOf(i10), (T) this.$items.get(i10));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14665 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14665(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i10, @Nullable Composer composer, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i11 & 14) == 0) {
                i12 = (composer.changed(items) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if ((i12 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:423)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i10), (T) this.$items.get(i10), composer, Integer.valueOf(i12 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14687 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14687(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @NotNull
        public final Object invoke(int i10) {
            return this.$key.invoke(Integer.valueOf(i10), this.$items[i10]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14698 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14698(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, T[] tArr) {
            super(2);
            this.$span = function3;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m542boximpl(m568invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
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
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m568invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), this.$items[i10]).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14709 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14709(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
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
        @Nullable
        public final Object invoke(int i10) {
            return this.$contentType.invoke(Integer.valueOf(i10), this.$items[i10]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyHorizontalGrid(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.GridCells r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.grid.LazyGridState r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r27, boolean r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyVerticalGrid(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.grid.GridCells r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.grid.LazyGridState r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r27, boolean r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C14632(function2, items) : null, function3 != null ? new C14643(function3, items) : null, new C14654(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C14665(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C14632(function2, items) : null, function3 != null ? new C14643(function3, items) : null, new C14654(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C14665(itemContent, items)));
    }

    @Composable
    private static final Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i10) {
        composer.startReplaceableGroup(-1355301804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355301804, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ List<Integer> invoke(Density density, Constraints constraints) {
                    return m569invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m569invoke0kLqBqw(@NotNull Density density, long j10) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3919getMaxWidthimpl(j10) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m3919getMaxWidthimpl(j10) - density.mo302roundToPx0680j_4(Dp.m3951constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, layoutDirection) + PaddingKt.calculateEndPadding(paddingValues, layoutDirection))), density.mo302roundToPx0680j_4(horizontal.getSpacing())));
                    int size = mutableList.size();
                    for (int i11 = 1; i11 < size; i11++) {
                        mutableList.set(i11, Integer.valueOf(mutableList.get(i11).intValue() + mutableList.get(i11 - 1).intValue()));
                    }
                    return mutableList;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, List<Integer>> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @Composable
    private static final Function2<Density, Constraints, List<Integer>> rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i10) {
        composer.startReplaceableGroup(239683573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239683573, i10, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:180)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ List<Integer> invoke(Density density, Constraints constraints) {
                    return m570invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m570invoke0kLqBqw(@NotNull Density density, long j10) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3918getMaxHeightimpl(j10) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
                    }
                    List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m3918getMaxHeightimpl(j10) - density.mo302roundToPx0680j_4(Dp.m3951constructorimpl(paddingValues.getTop() + paddingValues.getBottom())), density.mo302roundToPx0680j_4(vertical.getSpacing())));
                    int size = mutableList.size();
                    for (int i11 = 1; i11 < size; i11++) {
                        mutableList.set(i11, Integer.valueOf(mutableList.get(i11).intValue() + mutableList.get(i11 - 1).intValue()));
                    }
                    return mutableList;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, List<Integer>> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C14687(function2, items) : null, function3 != null ? new C14698(function3, items) : null, new C14709(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C146210(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            function3 = null;
        }
        if ((i10 & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                @Nullable
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C14687(function2, items) : null, function3 != null ? new C14698(function3, items) : null, new C14709(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C146210(itemContent, items)));
    }
}
