package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/j;", "Landroid/view/View;", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.j implements Function2<kotlin.sequences.j, Continuation, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1.d(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r5)
            goto L4f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            kotlin.sequences.j r1 = (kotlin.sequences.j) r1
            kotlin.d.b(r5)
            goto L37
        L22:
            kotlin.d.b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            kotlin.sequences.j r1 = (kotlin.sequences.j) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L37
            goto L4e
        L37:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.Sequence r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull kotlin.sequences.j jVar, @Nullable Continuation continuation) {
        return ((ViewKt$allViews$1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
    }
}
