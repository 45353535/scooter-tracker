package androidx.datastore.core;

import gg.v;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgg/v;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
final class MulticastFileObserver$Companion$observe$1 extends k implements Function2<v, Continuation, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(File file, Continuation continuation) {
        super(2, continuation);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull v vVar, @Nullable Continuation continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (gg.t.b(r3, r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r7)
            goto L66
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            eg.p0 r1 = (eg.p0) r1
            java.lang.Object r3 = r6.L$0
            gg.v r3 = (gg.v) r3
            kotlin.d.b(r7)
            goto L53
        L26:
            kotlin.d.b(r7)
            java.lang.Object r7 = r6.L$0
            gg.v r7 = (gg.v) r7
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1 r1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            java.io.File r4 = r6.$file
            r1.<init>()
            androidx.datastore.core.MulticastFileObserver$Companion r4 = androidx.datastore.core.MulticastFileObserver.INSTANCE
            java.io.File r5 = r6.$file
            java.io.File r5 = r5.getParentFile()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            eg.p0 r1 = androidx.datastore.core.MulticastFileObserver.Companion.access$observe(r4, r5, r1)
            kotlin.Unit r4 = kotlin.Unit.f93236a
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r7.w(r4, r6)
            if (r3 != r0) goto L52
            goto L65
        L52:
            r3 = r7
        L53:
            androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1 r7 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1$1
            r7.<init>()
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = gg.t.b(r3, r7, r6)
            if (r7 != r0) goto L66
        L65:
            return r0
        L66:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
