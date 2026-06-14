package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import mg.e;

/* JADX INFO: loaded from: classes3.dex */
public interface Mutex {

    public static final class a {
        public static /* synthetic */ Object a(Mutex mutex, Object obj, Continuation continuation, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return mutex.lock(obj, continuation);
        }

        public static /* synthetic */ boolean b(Mutex mutex, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ void c(Mutex mutex, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }
    }

    e getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, Continuation continuation);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
