package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J)\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020)2\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020)2\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "connection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", C4240b4.i.W, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "parent", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;)V", "parent$delegate", "Landroidx/compose/runtime/MutableState;", "value", "getValue", "onModifierLocalsUpdated", "", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NestedScrollModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<NestedScrollModifierLocal>, NestedScrollConnection {

    @NotNull
    private final NestedScrollConnection connection;

    @NotNull
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: parent$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState parent;

    public NestedScrollModifierLocal(@NotNull NestedScrollDispatcher dispatcher, @NotNull NestedScrollConnection connection) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.dispatcher = dispatcher;
        this.connection = connection;
        dispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineScope invoke() {
                return NestedScrollModifierLocal.this.getNestedCoroutineScope();
            }
        });
        this.parent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope nestedCoroutineScope;
        NestedScrollModifierLocal parent = getParent();
        if (parent != null && (nestedCoroutineScope = parent.getNestedCoroutineScope()) != null) {
            return nestedCoroutineScope;
        }
        CoroutineScope originNestedScrollScope = this.dispatcher.getOriginNestedScrollScope();
        if (originNestedScrollScope != null) {
            return originNestedScrollScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NestedScrollModifierLocal getParent() {
        return (NestedScrollModifierLocal) this.parent.getValue();
    }

    private final void setParent(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.parent.setValue(nestedScrollModifierLocal);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return b.d(this, obj, function2);
    }

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.getModifierLocalNestedScroll();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        setParent((NestedScrollModifierLocal) scope.getCurrent(NestedScrollModifierLocalKt.getModifierLocalNestedScroll()));
        this.dispatcher.setParent$ui_release(getParent());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo314onPostFlingRZ2iAVY(long r11, long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.J$0
            kotlin.d.b(r15)
            goto L80
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.J$1
            long r11 = r6.J$0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r1
            kotlin.d.b(r15)
            goto L5d
        L44:
            kotlin.d.b(r15)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r10.connection
            r6.L$0 = r10
            r6.J$0 = r11
            r6.J$1 = r13
            r6.label = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo314onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L5a
            goto L7e
        L5a:
            r1 = r10
            r11 = r2
            r13 = r4
        L5d:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r8 = r15.getPackedValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r1 = r1.getParent()
            if (r1 == 0) goto L88
            long r2 = androidx.compose.ui.unit.Velocity.m4180plusAH228Gc(r11, r8)
            long r4 = androidx.compose.ui.unit.Velocity.m4179minusAH228Gc(r13, r8)
            r11 = 0
            r6.L$0 = r11
            r6.J$0 = r8
            r6.label = r7
            java.lang.Object r15 = r1.mo314onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r11 = r8
        L80:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r13 = r15.getPackedValue()
            r8 = r11
            goto L8e
        L88:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r13 = r11.m4187getZero9UxMQ8M()
        L8e:
            long r11 = androidx.compose.ui.unit.Velocity.m4180plusAH228Gc(r8, r13)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m4167boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.mo314onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo315onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jMo315onPostScrollDzOQY0M = this.connection.mo315onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollModifierLocal parent = getParent();
        return Offset.m1376plusMKHz9U(jMo315onPostScrollDzOQY0M, parent != null ? parent.mo315onPostScrollDzOQY0M(Offset.m1376plusMKHz9U(consumed, jMo315onPostScrollDzOQY0M), Offset.m1375minusMKHz9U(available, jMo315onPostScrollDzOQY0M), source) : Offset.INSTANCE.m1387getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo316onPreFlingQWom1Mo(long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.J$0
            kotlin.d.b(r11)
            goto L7d
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r2
            kotlin.d.b(r11)
            goto L57
        L40:
            kotlin.d.b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r11 = r8.getParent()
            if (r11 == 0) goto L61
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo316onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L56
            goto L7c
        L56:
            r2 = r8
        L57:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r4 = r11.getPackedValue()
        L5d:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L69
        L61:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r4 = r11.m4187getZero9UxMQ8M()
            r2 = r8
            goto L5d
        L69:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.connection
            long r4 = androidx.compose.ui.unit.Velocity.m4179minusAH228Gc(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo316onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7d
        L7c:
            return r1
        L7d:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r0 = r11.getPackedValue()
            long r9 = androidx.compose.ui.unit.Velocity.m4180plusAH228Gc(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.ui.unit.Velocity.m4167boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.mo316onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo317onPreScrollOzD1aCk(long available, int source) {
        NestedScrollModifierLocal parent = getParent();
        long jMo317onPreScrollOzD1aCk = parent != null ? parent.mo317onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m1387getZeroF1C5BW0();
        return Offset.m1376plusMKHz9U(jMo317onPreScrollOzD1aCk, this.connection.mo317onPreScrollOzD1aCk(Offset.m1375minusMKHz9U(available, jMo317onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
