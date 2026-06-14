package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/sequences/j;", "", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "androidx.collection.MutableKeys$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1622}, m = "invokeSuspend")
final class MutableKeys$iterator$1$iterator$1 extends j implements Function2<kotlin.sequences.j, Continuation, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableKeys<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableKeys$iterator$1$iterator$1(MutableKeys<K, V> mutableKeys, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mutableKeys;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        MutableKeys$iterator$1$iterator$1 mutableKeys$iterator$1$iterator$1 = new MutableKeys$iterator$1$iterator$1(this.this$0, continuation);
        mutableKeys$iterator$1$iterator$1.L$0 = obj;
        return mutableKeys$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            kotlin.sequences.j r12 = (kotlin.sequences.j) r12
            kotlin.d.b(r20)
            goto L8f
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            kotlin.d.b(r20)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.j r2 = (kotlin.sequences.j) r2
            androidx.collection.MutableKeys<K, V> r6 = r0.this$0
            androidx.collection.MutableScatterMap r6 = androidx.collection.MutableKeys.access$getParent$p(r6)
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9d
            r8 = r3
        L44:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L98
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = r3
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L66:
            if (r2 >= r6) goto L92
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8f
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.d(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r2
            r0.label = r5
            java.lang.Object r13 = r12.b(r13, r0)
            if (r13 != r1) goto L8f
            return r1
        L8f:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L92:
            if (r6 != r4) goto L9d
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L98:
            if (r8 == r7) goto L9d
            int r8 = r8 + 1
            goto L44
        L9d:
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlin.sequences.j jVar, Continuation continuation) {
        return ((MutableKeys$iterator$1$iterator$1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
    }
}
