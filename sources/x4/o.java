package x4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
public class o extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f108136a;

    public interface a {
        void m();
    }

    public o(Looper looper) {
        super(looper);
    }

    public void a(a aVar) {
        this.f108136a = aVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        this.f108136a.m();
    }
}
