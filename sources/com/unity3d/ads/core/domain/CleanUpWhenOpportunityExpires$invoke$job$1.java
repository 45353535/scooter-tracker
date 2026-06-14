package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {33, 34, 39}, m = "invokeSuspend")
final class CleanUpWhenOpportunityExpires$invoke$job$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {41}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdObject adObject, Continuation continuation) {
            super(2, continuation);
            this.$adObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$adObject, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                this.$adObject.getState().setValue(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                if (adPlayer.destroy(this) == objG) {
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
    CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, Continuation continuation) {
        super(2, continuation);
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (eg.g.g(r7, r1, r6) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.d.b(r7)
            goto L7b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.d.b(r7)
            goto L5a
        L21:
            kotlin.d.b(r7)
            goto L4e
        L25:
            kotlin.d.b(r7)
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getTtl()
            java.lang.Object r7 = r7.getValue()
            kotlin.time.b r7 = (kotlin.time.b) r7
            if (r7 == 0) goto L3b
        L36:
            long r4 = r7.N()
            goto L51
        L3b:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getTtl()
            kotlinx.coroutines.flow.Flow r7 = hg.i.w(r7)
            r6.label = r4
            java.lang.Object r7 = hg.i.x(r7, r6)
            if (r7 != r0) goto L4e
            goto L7a
        L4e:
            kotlin.time.b r7 = (kotlin.time.b) r7
            goto L36
        L51:
            r6.label = r3
            java.lang.Object r7 = eg.k0.b(r4, r6)
            if (r7 != r0) goto L5a
            goto L7a
        L5a:
            com.unity3d.ads.core.data.model.AdObject r7 = r6.$adObject
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.getState()
            java.lang.Object r7 = r7.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r7 == r1) goto L7b
            kotlinx.coroutines.d0 r7 = kotlinx.coroutines.d0.f93604b
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r3 = r6.$adObject
            r4 = 0
            r1.<init>(r3, r4)
            r6.label = r2
            java.lang.Object r7 = eg.g.g(r7, r1, r6)
            if (r7 != r0) goto L7b
        L7a:
            return r0
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
