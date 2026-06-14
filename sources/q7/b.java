package q7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrorModel f98751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f98752c;

    public /* synthetic */ b(ErrorModel errorModel, Function1 function1) {
        this.f98751b = errorModel;
        this.f98752c = function1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        ErrorModel.observeAndGet$lambda$0(this.f98751b, this.f98752c);
    }
}
