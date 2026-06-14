package yads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class jy0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f112507a = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f112507a.put(iBinder);
        } catch (InterruptedException unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f112507a.clear();
        } catch (UnsupportedOperationException unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
