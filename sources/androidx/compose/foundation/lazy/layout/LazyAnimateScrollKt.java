package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a%\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", FirebaseAnalytics.Param.INDEX, "", "scrollOffset", "(Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m3951constructorimpl(2500);
    private static final float BoundDistance = Dp.m3951constructorimpl(1500);
    private static final float MinimumDistance = Dp.m3951constructorimpl(50);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 233}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<ScrollScope, Continuation, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10, LazyAnimateScrollScope lazyAnimateScrollScope, int i11, Continuation continuation) {
            super(2, continuation);
            this.$index = i10;
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$scrollOffset = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z10, LazyAnimateScrollScope lazyAnimateScrollScope, int i10, int i11) {
            if (z10) {
                if (lazyAnimateScrollScope.getFirstVisibleItemIndex() > i10) {
                    return true;
                }
                return lazyAnimateScrollScope.getFirstVisibleItemIndex() == i10 && lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() > i11;
            }
            if (lazyAnimateScrollScope.getFirstVisibleItemIndex() < i10) {
                return true;
            }
            return lazyAnimateScrollScope.getFirstVisibleItemIndex() == i10 && lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() < i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[Catch: ItemFoundInScroll -> 0x00fe, TryCatch #3 {ItemFoundInScroll -> 0x00fe, blocks: (B:27:0x00d1, B:29:0x00d5, B:31:0x00dd, B:33:0x00ef, B:43:0x010c, B:47:0x0149), top: B:94:0x00d1 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: ItemFoundInScroll -> 0x00fe, TryCatch #3 {ItemFoundInScroll -> 0x00fe, blocks: (B:27:0x00d1, B:29:0x00d5, B:31:0x00dd, B:33:0x00ef, B:43:0x010c, B:47:0x0149), top: B:94:0x00d1 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0197 -> B:90:0x019e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 588
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public static final Object animateScrollToItem(@NotNull LazyAnimateScrollScope lazyAnimateScrollScope, int i10, int i11, @NotNull Continuation continuation) {
        Object objScroll = lazyAnimateScrollScope.scroll(new AnonymousClass2(i10, lazyAnimateScrollScope, i11, null), continuation);
        return objScroll == pf.b.g() ? objScroll : Unit.f93236a;
    }

    private static final void debugLog(Function0<String> function0) {
    }
}
