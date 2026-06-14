package androidx.collection;

import androidx.collection.MutableSetWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/sequences/j;", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
final class MutableSetWrapper$iterator$1$iterator$1 extends j implements Function2<kotlin.sequences.j, Continuation, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableSetWrapper<E> this$0;
    final /* synthetic */ MutableSetWrapper.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper<E> mutableSetWrapper, MutableSetWrapper.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableSetWrapper;
        this.this$1 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$3
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$2
            androidx.collection.MutableSetWrapper r12 = (androidx.collection.MutableSetWrapper) r12
            java.lang.Object r13 = r0.L$1
            androidx.collection.MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableSetWrapper.AnonymousClass1) r13
            java.lang.Object r14 = r0.L$0
            kotlin.sequences.j r14 = (kotlin.sequences.j) r14
            kotlin.d.b(r22)
            goto La7
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.d.b(r22)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.j r2 = (kotlin.sequences.j) r2
            androidx.collection.MutableSetWrapper<E> r6 = r0.this$0
            androidx.collection.MutableScatterSet r6 = androidx.collection.MutableSetWrapper.access$getParent$p(r6)
            androidx.collection.MutableSetWrapper$iterator$1 r7 = r0.this$1
            androidx.collection.MutableSetWrapper<E> r8 = r0.this$0
            long[] r6 = r6.metadata
            int r9 = r6.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lb8
            r10 = 0
        L4f:
            r11 = r6[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lb3
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r2
            r2 = 0
            r19 = r11
            r11 = r6
            r12 = r8
            r6 = r13
            r13 = r7
            r7 = r19
        L73:
            if (r2 >= r6) goto Laa
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto La7
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.setCurrent(r15)
            androidx.collection.MutableScatterSet r3 = androidx.collection.MutableSetWrapper.access$getParent$p(r12)
            java.lang.Object[] r3 = r3.elements
            r3 = r3[r15]
            r0.L$0 = r14
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r3 = r14.b(r3, r0)
            if (r3 != r1) goto La7
            return r1
        La7:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L73
        Laa:
            if (r6 != r4) goto Lb8
            r2 = r10
            r10 = r9
            r9 = r2
            r6 = r11
            r8 = r12
            r7 = r13
            r2 = r14
        Lb3:
            if (r10 == r9) goto Lb8
            int r10 = r10 + 1
            goto L4f
        Lb8:
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.j jVar, Continuation continuation) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
    }
}
