package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import com.ironsource.C4240b4;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J)\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultParent", "(Landroidx/compose/foundation/relocation/BringIntoViewParent;)V", C4240b4.i.W, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "value", "getValue", "()Landroidx/compose/foundation/relocation/BringIntoViewParent;", "bringChildIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BringIntoViewResponderModifier extends BringIntoViewChildModifier implements ModifierLocalProvider<BringIntoViewParent>, BringIntoViewParent {
    public BringIntoViewResponder responder;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function0<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        final /* synthetic */ Function0<Rect> $parentRect;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {162}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function0<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            int label;
            final /* synthetic */ BringIntoViewResponderModifier this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class C00471 extends y implements Function0<Rect> {
                final /* synthetic */ Function0<Rect> $boundsProvider;
                final /* synthetic */ LayoutCoordinates $childCoordinates;
                final /* synthetic */ BringIntoViewResponderModifier this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00471(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
                    super(0, Intrinsics.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.this$0 = bringIntoViewResponderModifier;
                    this.$childCoordinates = layoutCoordinates;
                    this.$boundsProvider = function0;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Rect invoke() {
                    return BringIntoViewResponderModifier.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bringIntoViewResponderModifier;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    BringIntoViewResponder responder = this.this$0.getResponder();
                    C00471 c00471 = new C00471(this.this$0, this.$childCoordinates, this.$boundsProvider);
                    this.label = 1;
                    if (responder.bringChildIntoView(c00471, this) == objG) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {171}, m = "invokeSuspend")
        static final class C00482 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function0<Rect> $parentRect;
            int label;
            final /* synthetic */ BringIntoViewResponderModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00482(BringIntoViewResponderModifier bringIntoViewResponderModifier, Function0<Rect> function0, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bringIntoViewResponderModifier;
                this.$parentRect = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C00482(this.this$0, this.$parentRect, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    BringIntoViewParent parent = this.this$0.getParent();
                    LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return Unit.f93236a;
                    }
                    Function0<Rect> function0 = this.$parentRect;
                    this.label = 1;
                    if (parent.bringChildIntoView(layoutCoordinates, function0, this) == objG) {
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
                return ((C00482) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Function0<Rect> function02, Continuation continuation) {
            super(2, continuation);
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = function0;
            this.$parentRect = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = BringIntoViewResponderModifier.this.new AnonymousClass2(this.$childCoordinates, this.$boundsProvider, this.$parentRect, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            i.d(coroutineScope, null, null, new AnonymousClass1(BringIntoViewResponderModifier.this, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            return i.d(coroutineScope, null, null, new C00482(BringIntoViewResponderModifier.this, this.$parentRect, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier(@NotNull BringIntoViewParent defaultParent) {
        super(defaultParent);
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringChildIntoView$localRect(BringIntoViewResponderModifier bringIntoViewResponderModifier, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
        Rect rectInvoke;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderModifier.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rectInvoke = function0.invoke()) == null) {
            return null;
        }
        return BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, rectInvoke);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    @Nullable
    public Object bringChildIntoView(@NotNull final LayoutCoordinates layoutCoordinates, @NotNull final Function0<Rect> function0, @NotNull Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new AnonymousClass2(layoutCoordinates, function0, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Rect invoke() {
                Rect rectBringChildIntoView$localRect = BringIntoViewResponderModifier.bringChildIntoView$localRect(this.this$0, layoutCoordinates, function0);
                if (rectBringChildIntoView$localRect != null) {
                    return this.this$0.getResponder().calculateRectForParent(rectBringChildIntoView$localRect);
                }
                return null;
            }
        }, null), continuation);
        return objG == b.g() ? objG : Unit.f93236a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<BringIntoViewParent> getKey() {
        return BringIntoViewKt.getModifierLocalBringIntoViewParent();
    }

    @NotNull
    public final BringIntoViewResponder getResponder() {
        BringIntoViewResponder bringIntoViewResponder = this.responder;
        if (bringIntoViewResponder != null) {
            return bringIntoViewResponder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("responder");
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public BringIntoViewParent getValue() {
        return this;
    }

    public final void setResponder(@NotNull BringIntoViewResponder bringIntoViewResponder) {
        Intrinsics.checkNotNullParameter(bringIntoViewResponder, "<set-?>");
        this.responder = bringIntoViewResponder;
    }
}
