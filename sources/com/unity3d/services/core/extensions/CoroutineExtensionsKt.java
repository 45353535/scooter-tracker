package com.unity3d.services.core.extensions;

import com.ironsource.C4240b4;
import eg.i;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001e\b\u0004\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a.\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\"5\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"deferreds", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "memoize", "T", C4240b4.i.W, "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExtensionsKt {

    @NotNull
    private static final LinkedHashMap<Object, Deferred> deferreds = new CoroutineExtensionsKt$deferreds$1();

    @NotNull
    private static final Mutex mutex = f.b(false, 1, null);

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @e(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Continuation, Object> $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
            super(2, continuation);
            this.$key = obj;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Mutex mutex;
            Function1<Continuation, Object> function1;
            Object obj2;
            Object objG = b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    d.b(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    function1 = this.$action;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = function1;
                    this.label = 1;
                    if (mutex.lock(null, this) != objG) {
                        obj2 = obj3;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    return obj;
                }
                function1 = (Function1) this.L$3;
                obj2 = this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                d.b(obj);
                LinkedHashMap<Object, Deferred> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred deferredB = deferreds.get(obj2);
                if (deferredB == null) {
                    deferredB = i.b(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredB);
                }
                Deferred deferred = deferredB;
                mutex.unlock(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objAwait = deferred.await(this);
                return objAwait == objG ? objG : objAwait;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Mutex mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            Function1<Continuation, Object> function1 = this.$action;
            z.c(0);
            mutex.lock(null, this);
            z.c(1);
            try {
                LinkedHashMap<Object, Deferred> deferreds = CoroutineExtensionsKt.getDeferreds();
                Deferred deferredB = deferreds.get(obj2);
                if (deferredB == null) {
                    deferredB = i.b(coroutineScope, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                    deferreds.put(obj2, deferredB);
                }
                Deferred deferred = deferredB;
                mutex.unlock(null);
                z.c(0);
                Object objAwait = deferred.await(this);
                z.c(1);
                return objAwait;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @NotNull
    public static final LinkedHashMap<Object, Deferred> getDeferreds() {
        return deferreds;
    }

    @NotNull
    public static final Mutex getMutex() {
        return mutex;
    }

    @Nullable
    public static final <T> Object memoize(@NotNull Object obj, @NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Continuation continuation) {
        return kotlinx.coroutines.i.g(new AnonymousClass2(obj, function1, null), continuation);
    }

    private static final <T> Object memoize$$forInline(Object obj, Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(obj, function1, null);
        z.c(0);
        Object objG = kotlinx.coroutines.i.g(anonymousClass2, continuation);
        z.c(1);
        return objG;
    }

    @NotNull
    public static final <R> Object runReturnSuspendCatching(@NotNull Function0<? extends R> block) {
        Object objB;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.j(objB)) {
            return Result.b(objB);
        }
        Throwable thG = Result.g(objB);
        return thG != null ? Result.b(d.a(thG)) : objB;
    }

    @NotNull
    public static final <R> Object runSuspendCatching(@NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.f93230c;
            return Result.b(block.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(d.a(th2));
        }
    }
}
