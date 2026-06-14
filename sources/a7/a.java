package a7;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpressionResolverImpl f4137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f4139d;

    public /* synthetic */ a(ExpressionResolverImpl expressionResolverImpl, String str, Function0 function0) {
        this.f4137b = expressionResolverImpl;
        this.f4138c = str;
        this.f4139d = function0;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        ExpressionResolverImpl.subscribeToExpression$lambda$7(this.f4137b, this.f4138c, this.f4139d);
    }
}
