package ig;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public interface q extends Flow {

    public static final class a {
        public static /* synthetic */ Flow a(q qVar, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = kotlin.coroutines.e.f93267b;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = gg.a.f72765b;
            }
            return qVar.a(coroutineContext, i10, aVar);
        }
    }

    Flow a(CoroutineContext coroutineContext, int i10, gg.a aVar);
}
