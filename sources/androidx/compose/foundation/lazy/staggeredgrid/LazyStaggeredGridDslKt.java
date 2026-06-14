package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a<\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0081\u0001\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a<\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00182\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u0094\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u0016\b\u0006\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b)\u00102\u001a¬\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00182\u001c\b\u0006\u0010,\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00182%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b5\u00106\u001a\u0094\u0001\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0016\b\n\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\u0016\b\u0006\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00112\u0016\b\n\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00112\u001f\b\u0004\u00101\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b)\u00108\u001a¬\u0001\u00105\u001a\u00020\u0013\"\u0004\b\u0000\u0010'*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u0000072\u001c\b\n\u0010+\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*\u0018\u00010\u00182\u001c\b\u0006\u0010,\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010*0\u00182\u001c\b\n\u0010.\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-\u0018\u00010\u00182%\b\u0004\u00101\u001a\u001f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001304¢\u0006\u0002\b0H\u0087\bø\u0001\u0002¢\u0006\u0004\b5\u00109\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "content", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalStaggeredGrid", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "T", "", FirebaseAnalytics.Param.ITEMS, "", C4240b4.i.W, "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyStaggeredGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(2101296000, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:391)");
            }
            this.$itemContent.invoke(items, this.$items[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(-886456479, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:311)");
            }
            this.$itemContent.invoke(items, (T) this.$items.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> function1, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C147510 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C147510(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(-804487775, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:431)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i10), this.$items[i10], composer, Integer.valueOf(i12 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14763 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14763(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14775 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14775(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.f93236a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i10, @Nullable Composer composer, int i11) {
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
                ComposerKt.traceEventStart(284833944, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:351)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i10), (T) this.$items.get(i10), composer, Integer.valueOf(i12 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C14798 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14798(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m624LazyHorizontalStaggeredGridcJHQLPU(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r29, boolean r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r31, float r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m624LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m625LazyVerticalStaggeredGridzadm560(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r26, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r29, boolean r30, float r31, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r32, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m625LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function12, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function1 function1, Function1 contentType, Function1 function12, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function22, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C14763(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C14775(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function2 function2, Function2 contentType, Function2 function22, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
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
        if ((i10 & 8) != 0) {
            function22 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C14763(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C14775(itemContent, items)));
    }

    @Composable
    private static final Function2<Density, Constraints, int[]> rememberColumnWidthSums(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i10) {
        composer.startReplaceableGroup(1426908594);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1426908594, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:88)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<Density, Constraints, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ int[] invoke(Density density, Constraints constraints) {
                    return m626invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final int[] m626invoke0kLqBqw(@NotNull Density density, long j10) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3919getMaxWidthimpl(j10) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> listCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, Constraints.m3919getMaxWidthimpl(j10) - density.mo302roundToPx0680j_4(Dp.m3951constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, layoutDirection) + PaddingKt.calculateEndPadding(paddingValues, layoutDirection))), density.mo302roundToPx0680j_4(horizontal.getSpacing()));
                    int size = listCalculateCrossAxisCellSizes.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = listCalculateCrossAxisCellSizes.get(i11).intValue();
                    }
                    int size2 = listCalculateCrossAxisCellSizes.size();
                    for (int i12 = 1; i12 < size2; i12++) {
                        iArr[i12] = iArr[i12] + iArr[i12 - 1];
                    }
                    return iArr;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, int[]> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @Composable
    private static final Function2<Density, Constraints, int[]> rememberRowHeightSums(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i10) {
        composer.startReplaceableGroup(-1665208491);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665208491, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:173)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<Density, Constraints, int[]>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ int[] invoke(Density density, Constraints constraints) {
                    return m627invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final int[] m627invoke0kLqBqw(@NotNull Density density, long j10) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3918getMaxHeightimpl(j10) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    List<Integer> listCalculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, Constraints.m3918getMaxHeightimpl(j10) - density.mo302roundToPx0680j_4(Dp.m3951constructorimpl(paddingValues.getTop() + paddingValues.getBottom())), density.mo302roundToPx0680j_4(vertical.getSpacing()));
                    int size = listCalculateCrossAxisCellSizes.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = listCalculateCrossAxisCellSizes.get(i11).intValue();
                    }
                    int size2 = listCalculateCrossAxisCellSizes.size();
                    for (int i12 = 1; i12 < size2; i12++) {
                        iArr[i12] = iArr[i12] + iArr[i12 - 1];
                    }
                    return iArr;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, int[]> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function12, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function22, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C14798(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C147510(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function1 function1, Function1 contentType, Function1 function12, Function4 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function2 function2, Function2 contentType, Function2 function22, Function5 itemContent, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
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
        if ((i10 & 8) != 0) {
            function22 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C14798(contentType, items), function22 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function22, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C147510(itemContent, items)));
    }
}
