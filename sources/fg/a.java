package fg;

import android.os.Looper;
import eg.e1;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {
    @Override // jg.s
    public int a() {
        return 1073741823;
    }

    @Override // jg.s
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // jg.s
    public e1 c(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
