package l7;

import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.SightActionIsEnabledObserver;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements Disposable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SightActionIsEnabledObserver f94078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f94079c;

    public /* synthetic */ w(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        this.f94078b = sightActionIsEnabledObserver;
        this.f94079c = view;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(this.f94078b, this.f94079c);
    }
}
