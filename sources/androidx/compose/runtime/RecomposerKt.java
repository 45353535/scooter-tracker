package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import eg.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001aC\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/coroutines/Continuation;", "", "block", "withRunningRecomposer", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", C4240b4.i.W, "value", "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "RecomposerCompoundHashKey", "I", "ProduceAnotherFrame", "Ljava/lang/Object;", "FramePending", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;

    @NotNull
    private static final Object ProduceAnotherFrame = new Object();

    @NotNull
    private static final Object FramePending = new Object();

    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {68, 70}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function3<CoroutineScope, Recomposer, Continuation, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {67}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Recomposer $recomposer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Recomposer recomposer, Continuation continuation) {
                super(2, continuation);
                this.$recomposer = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.$recomposer, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    if (recomposer.runRecomposeAndApplyChanges(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
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
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation, ? extends Object> function3, Continuation continuation) {
            super(2, continuation);
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Recomposer recomposer;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                recomposer = new Recomposer(coroutineScope.getCoroutineContext());
                i.d(coroutineScope, null, null, new AnonymousClass1(recomposer, null), 3, null);
                Function3<CoroutineScope, Recomposer, Continuation, Object> function3 = this.$block;
                this.L$0 = recomposer;
                this.label = 1;
                obj = function3.invoke(coroutineScope, recomposer, this);
                if (obj != objG) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                kotlin.d.b(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.L$0;
            kotlin.d.b(obj);
            recomposer.close();
            this.L$0 = obj;
            this.label = 2;
            return recomposer.join(this) == objG ? objG : obj;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final <K, V> boolean addMultiValue(@NotNull Map<K, List<V>> map, K k10, V v10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<V> arrayList = map.get(k10);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k10, arrayList);
        }
        return arrayList.add(v10);
    }

    @Nullable
    public static final <K, V> V removeLastMultiValue(@NotNull Map<K, List<V>> map, K k10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v10 = (V) CollectionsKt.removeFirst(list);
        if (list.isEmpty()) {
            map.remove(k10);
        }
        return v10;
    }

    @Nullable
    public static final <R> Object withRunningRecomposer(@NotNull Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation, ? extends Object> function3, @NotNull Continuation continuation) {
        return kotlinx.coroutines.i.g(new AnonymousClass2(function3, null), continuation);
    }
}
