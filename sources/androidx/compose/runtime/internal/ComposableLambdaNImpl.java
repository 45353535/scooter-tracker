package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z0;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0013\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", C4240b4.i.W, "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableLambdaNImpl implements ComposableLambdaN {

    @Nullable
    private Object _block;
    private final int arity;
    private final int key;

    @Nullable
    private RecomposeScope scope;

    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i10, boolean z10, int i11) {
        this.key = i10;
        this.tracked = z10;
        this.arity = i11;
    }

    private final int realParamCount(int params) {
        int i10 = params - 2;
        for (int i11 = 1; i11 * 10 < i10; i11++) {
            i10--;
        }
        return i10;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ComposableLambdaKt.replacableWith(list.get(i10), recomposeScope)) {
                list.set(i10, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.w
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN
    @Nullable
    public Object invoke(@NotNull final Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        final int iRealParamCount = realParamCount(args.length);
        Object obj = args[iRealParamCount];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt.slice(args, g.v(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        z0 z0Var = new z0(2);
        z0Var.b(array);
        z0Var.a(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((FunctionN) obj3).invoke(z0Var.d(new Object[z0Var.c()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.f93236a;
                }

                public final void invoke(@NotNull Composer nc2, int i10) {
                    Intrinsics.checkNotNullParameter(nc2, "nc");
                    Object[] array2 = ArraysKt.slice(args, g.v(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = args[iRealParamCount + 1];
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr = args;
                    Object[] array3 = ArraysKt.slice(objArr, g.v(iRealParamCount + 2, objArr.length)).toArray(new Object[0]);
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    z0 z0Var2 = new z0(4);
                    z0Var2.b(array2);
                    z0Var2.a(nc2);
                    z0Var2.a(Integer.valueOf(iIntValue2 | 1));
                    z0Var2.b(array3);
                    composableLambdaNImpl.invoke(z0Var2.d(new Object[z0Var2.c()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(@NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (Intrinsics.areEqual(block, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = (FunctionN) block;
        if (z10) {
            return;
        }
        trackWrite();
    }
}
