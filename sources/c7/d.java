package c7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VariableControllerImpl f6525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f6526e;

    public /* synthetic */ d(List list, List list2, VariableControllerImpl variableControllerImpl, Function1 function1) {
        this.f6523b = list;
        this.f6524c = list2;
        this.f6525d = variableControllerImpl;
        this.f6526e = function1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        VariableControllerImpl.subscribeToVariablesChange$lambda$5(this.f6523b, this.f6524c, this.f6525d, this.f6526e);
    }
}
