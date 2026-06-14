package com.yandex.div.core.util;

import com.android.billingclient.api.BillingClient;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y7.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/util/ExpressionSubscriberImpl;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "()V", BillingClient.FeatureType.SUBSCRIPTIONS, "", "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExpressionSubscriberImpl implements ExpressionSubscriber {

    @NotNull
    private final List<Disposable> subscriptions = new ArrayList();

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void addSubscription(Disposable disposable) {
        a.a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public /* synthetic */ void closeAllSubscription() {
        a.b(this);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.yandex.div.core.view2.Releasable
    public /* synthetic */ void release() {
        a.c(this);
    }
}
