package c7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VariableControllerImpl f6521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f6522d;

    public /* synthetic */ c(List list, VariableControllerImpl variableControllerImpl, Function1 function1) {
        this.f6520b = list;
        this.f6521c = variableControllerImpl;
        this.f6522d = function1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        VariableControllerImpl.subscribeToVariablesUndeclared$lambda$10(this.f6520b, this.f6521c, this.f6522d);
    }
}
