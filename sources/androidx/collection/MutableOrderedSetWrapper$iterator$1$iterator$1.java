package androidx.collection;

import androidx.collection.MutableOrderedSetWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/sequences/j;", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends j implements Function2<kotlin.sequences.j, Continuation, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        int i10;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        long[] jArr;
        kotlin.sequences.j jVar;
        Object objG = pf.b.g();
        int i11 = this.label;
        if (i11 == 0) {
            d.b(obj);
            kotlin.sequences.j jVar2 = (kotlin.sequences.j) this.L$0;
            MutableOrderedScatterSet mutableOrderedScatterSet = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper.AnonymousClass1 anonymousClass12 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = mutableOrderedScatterSet.nodes;
            i10 = mutableOrderedScatterSet.tail;
            anonymousClass1 = anonymousClass12;
            jArr = jArr2;
            jVar = jVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            anonymousClass1 = (MutableOrderedSetWrapper.AnonymousClass1) this.L$1;
            jVar = (kotlin.sequences.j) this.L$0;
            d.b(obj);
        }
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            anonymousClass1.setCurrent(i10);
            Object obj2 = mutableOrderedSetWrapper.parent.elements[i10];
            this.L$0 = jVar;
            this.L$1 = anonymousClass1;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            this.I$0 = i12;
            this.label = 1;
            if (jVar.b(obj2, this) == objG) {
                return objG;
            }
            i10 = i12;
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.j jVar, Continuation continuation) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
    }
}
