package c7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.variables.VariableController;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static List a(VariableController variableController) {
        return CollectionsKt.emptyList();
    }

    public static /* synthetic */ Disposable b(VariableController variableController, List list, boolean z10, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return variableController.subscribeToVariablesChange(list, z10, function1);
    }
}
