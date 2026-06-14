package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Div2View f68104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TriggerExecutor$tryTriggerActionsAfterBind$observer$1 f68105c;

    public /* synthetic */ a(Div2View div2View, TriggerExecutor$tryTriggerActionsAfterBind$observer$1 triggerExecutor$tryTriggerActionsAfterBind$observer$1) {
        this.f68104b = div2View;
        this.f68105c = triggerExecutor$tryTriggerActionsAfterBind$observer$1;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f68104b.removePersistentDivDataObserver$div_release(this.f68105c);
    }
}
