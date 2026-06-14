package q9;

import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public interface q {

    public interface a {
        void sendToTarget();
    }

    boolean a(a aVar);

    Looper getLooper();

    boolean hasMessages(int i10);

    a obtainMessage(int i10);

    a obtainMessage(int i10, int i11, int i12);

    a obtainMessage(int i10, int i11, int i12, Object obj);

    a obtainMessage(int i10, Object obj);

    boolean post(Runnable runnable);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);
}
