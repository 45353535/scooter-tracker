package se;

import cf.GMTDate;
import kotlinx.coroutines.CoroutineScope;
import ve.b0;
import ve.c0;
import ve.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements w, CoroutineScope {
    public abstract io.ktor.utils.io.e a();

    public abstract GMTDate b();

    public abstract GMTDate c();

    public abstract c0 d();

    public abstract b0 e();

    public abstract je.b p();

    public String toString() {
        return "HttpResponse[" + e.d(this).getUrl() + ", " + d() + ']';
    }
}
