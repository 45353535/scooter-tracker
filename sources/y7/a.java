package y7;

import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static void a(ExpressionSubscriber expressionSubscriber, Disposable disposable) {
        if (disposable == null || disposable == Disposable.NULL) {
            return;
        }
        expressionSubscriber.getSubscriptions().add(disposable);
    }

    public static void b(ExpressionSubscriber expressionSubscriber) {
        Iterator<T> it = expressionSubscriber.getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        expressionSubscriber.getSubscriptions().clear();
    }

    public static void c(ExpressionSubscriber expressionSubscriber) {
        expressionSubscriber.closeAllSubscription();
    }
}
