package q9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import q9.q;

/* JADX INFO: loaded from: classes12.dex */
final class h0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f98790b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f98791a;

    private static final class b implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f98792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h0 f98793b;

        private b() {
        }

        private void a() {
            this.f98792a = null;
            this.f98793b = null;
            h0.d(this);
        }

        public boolean b(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) q9.a.e(this.f98792a));
            a();
            return zSendMessageAtFrontOfQueue;
        }

        public b c(Message message, h0 h0Var) {
            this.f98792a = message;
            this.f98793b = h0Var;
            return this;
        }

        @Override // q9.q.a
        public void sendToTarget() {
            ((Message) q9.a.e(this.f98792a)).sendToTarget();
            a();
        }
    }

    public h0(Handler handler) {
        this.f98791a = handler;
    }

    private static b c() {
        b bVar;
        List list = f98790b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(b bVar) {
        List list = f98790b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q9.q
    public boolean a(q.a aVar) {
        return ((b) aVar).b(this.f98791a);
    }

    @Override // q9.q
    public Looper getLooper() {
        return this.f98791a.getLooper();
    }

    @Override // q9.q
    public boolean hasMessages(int i10) {
        q9.a.a(i10 != 0);
        return this.f98791a.hasMessages(i10);
    }

    @Override // q9.q
    public q.a obtainMessage(int i10) {
        return c().c(this.f98791a.obtainMessage(i10), this);
    }

    @Override // q9.q
    public boolean post(Runnable runnable) {
        return this.f98791a.post(runnable);
    }

    @Override // q9.q
    public void removeCallbacksAndMessages(Object obj) {
        this.f98791a.removeCallbacksAndMessages(obj);
    }

    @Override // q9.q
    public void removeMessages(int i10) {
        q9.a.a(i10 != 0);
        this.f98791a.removeMessages(i10);
    }

    @Override // q9.q
    public boolean sendEmptyMessage(int i10) {
        return this.f98791a.sendEmptyMessage(i10);
    }

    @Override // q9.q
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f98791a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // q9.q
    public q.a obtainMessage(int i10, Object obj) {
        return c().c(this.f98791a.obtainMessage(i10, obj), this);
    }

    @Override // q9.q
    public q.a obtainMessage(int i10, int i11, int i12) {
        return c().c(this.f98791a.obtainMessage(i10, i11, i12), this);
    }

    @Override // q9.q
    public q.a obtainMessage(int i10, int i11, int i12, Object obj) {
        return c().c(this.f98791a.obtainMessage(i10, i11, i12, obj), this);
    }
}
