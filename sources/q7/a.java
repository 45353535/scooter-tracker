package q7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ErrorCollector f98749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f98750c;

    public /* synthetic */ a(ErrorCollector errorCollector, Function2 function2) {
        this.f98749b = errorCollector;
        this.f98750c = function2;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        ErrorCollector.observeAndGet$lambda$1(this.f98749b, this.f98750c);
    }
}
