package y;

import android.view.View;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f108331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Deferred f108332b;

    public r(View view, Deferred deferred) {
        this.f108331a = view;
        this.f108332b = deferred;
    }

    public void a(Deferred deferred) {
        this.f108332b = deferred;
    }
}
