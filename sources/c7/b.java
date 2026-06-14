package c7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VariableControllerImpl f6517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f6519d;

    public /* synthetic */ b(VariableControllerImpl variableControllerImpl, String str, Function1 function1) {
        this.f6517b = variableControllerImpl;
        this.f6518c = str;
        this.f6519d = function1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f6517b.removeChangeObserver(this.f6518c, this.f6519d);
    }
}
