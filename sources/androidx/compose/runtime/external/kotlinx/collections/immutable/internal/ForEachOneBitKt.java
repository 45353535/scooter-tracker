package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"", "Lkotlin/Function2;", "", "body", "forEachOneBit", "(ILkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i10, @NotNull Function2<? super Integer, ? super Integer, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            body.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
