package kotlinx.coroutines;

import eg.h1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends h1 {

    public static final class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function1 f93603b;

        public a(Function1 function1) {
            this.f93603b = function1;
        }

        @Override // kotlinx.coroutines.d
        public void a(Throwable th2) {
            this.f93603b.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + eg.h0.a(this.f93603b) + '@' + eg.h0.b(this) + ']';
        }
    }

    void a(Throwable th2);
}
