package androidx.room;

import hg.l0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u001c\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0086@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/room/ObservedTableVersions;", "", "size", "", "<init>", "(I)V", "versions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "increment", "", "tableIds", "", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObservedTableVersions {

    @NotNull
    private final MutableStateFlow versions;

    /* JADX INFO: renamed from: androidx.room.ObservedTableVersions$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {638}, m = "collect")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i10) {
        this.versions = l0.a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.ObservedTableVersions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.ObservedTableVersions$collect$1 r0 = (androidx.room.ObservedTableVersions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.ObservedTableVersions$collect$1 r0 = new androidx.room.ObservedTableVersions$collect$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.d.b(r6)
            goto L3f
        L31:
            kotlin.d.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.versions
            r0.label = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            lf.g r5 = new lf.g
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void increment(@NotNull Set<Integer> tableIds) {
        Object value;
        int[] iArr;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.versions;
        do {
            value = mutableStateFlow.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!mutableStateFlow.b(value, iArr));
    }
}
