package f1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qc {
    public static final void a(se seVar, Function1 isSuccess, Function2 isError) {
        Intrinsics.checkNotNullParameter(seVar, "<this>");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Intrinsics.checkNotNullParameter(isError, "isError");
        if (seVar.b() == null) {
            isSuccess.invoke(seVar);
        } else {
            isError.invoke(seVar, seVar.b());
        }
    }
}
