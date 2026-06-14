package sg.bigo.ads.common.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.o.f;

/* JADX INFO: loaded from: classes4.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f102598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f102599d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f102602e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f102601b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue<IBinder> f102600a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.f102602e = context;
    }

    public static e a(Context context) {
        if (f102598c == null) {
            synchronized (e.class) {
                try {
                    if (f102598c == null) {
                        f102598c = new e(context);
                    }
                } finally {
                }
            }
        }
        return f102598c;
    }

    private void b() {
        try {
            synchronized (f102599d) {
                this.f102600a.clear();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }

    public final f a(long j10, TimeUnit timeUnit) {
        try {
            IBinder iBinderPoll = this.f102600a.poll(j10, timeUnit);
            if (iBinderPoll == null) {
                return null;
            }
            a(iBinderPoll);
            return f.a.a(iBinderPoll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f102601b) {
            try {
                this.f102601b = false;
                b();
                this.f102602e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (f102599d) {
                this.f102600a.clear();
                this.f102600a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }
}
