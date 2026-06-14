package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import lf.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"use", "R", "T", "Landroidx/datastore/core/Closeable;", "block", "Lkotlin/Function1;", "(Landroidx/datastore/core/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(@NotNull T t10, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            z.b(1);
            try {
                t10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                throw th;
            }
            z.a(1);
            return rInvoke;
        } catch (Throwable th3) {
            z.b(1);
            try {
                t10.close();
            } catch (Throwable th4) {
                c.a(th3, th4);
            }
            throw th3;
        }
    }
}
