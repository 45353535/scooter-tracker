package com.unity3d.ads.adplayer;

import eg.i;
import eg.p;
import eg.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\u00020\u000b2\u001e\b\u0002\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/adplayer/Invocation;", "", "", "location", "", "parameters", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "handler", "", "handle", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "[Ljava/lang/Object;", "getParameters", "()[Ljava/lang/Object;", "Leg/p;", "_isHandled", "Leg/p;", "completableDeferred", "Lkotlinx/coroutines/Deferred;", "isHandled", "()Lkotlinx/coroutines/Deferred;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Invocation {

    @NotNull
    private final p _isHandled;

    @NotNull
    private final p completableDeferred;

    @NotNull
    private final String location;

    @NotNull
    private final Object[] parameters;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function1<Continuation, Object> {
        int label;

        AnonymousClass2(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@NotNull Continuation continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super Continuation, ? extends Object> function1, Invocation invocation, Continuation continuation) {
            super(2, continuation);
            this.$handler = function1;
            this.this$0 = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass3(this.$handler, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    d.b(obj);
                    Function1<Continuation, Object> function1 = this.$handler;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                }
                this.this$0.completableDeferred.s(obj);
            } catch (Throwable th2) {
                this.this$0.completableDeferred.d(th2);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public Invocation(@NotNull String location, @NotNull Object[] parameters) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = r.c(null, 1, null);
        this.completableDeferred = r.c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object handle$default(Invocation invocation, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new AnonymousClass2(null);
        }
        return invocation.handle(function1, continuation);
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final Object[] getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Object getResult(@NotNull Continuation continuation) {
        return this.completableDeferred.await(continuation);
    }

    @Nullable
    public final Object handle(@NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Continuation continuation) {
        p pVar = this._isHandled;
        Unit unit = Unit.f93236a;
        pVar.s(unit);
        i.d(kotlinx.coroutines.i.a(continuation.getContext()), null, null, new AnonymousClass3(function1, this, null), 3, null);
        return unit;
    }

    @NotNull
    public final Deferred isHandled() {
        return this._isHandled;
    }
}
