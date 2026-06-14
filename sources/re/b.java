package re;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import ve.f1;
import ve.w;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends w, CoroutineScope {

    public static final class a {
        public static CoroutineContext a(b bVar) {
            return bVar.p().getCoroutineContext();
        }
    }

    ze.b getAttributes();

    CoroutineContext getCoroutineContext();

    z getMethod();

    f1 getUrl();

    je.b p();
}
