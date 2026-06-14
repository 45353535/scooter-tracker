package net.pubnative.lite.sdk.vpaid.helpers;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleTimer extends CountDownTimer {
    private final Listener mListener;

    public interface Listener {
        void onFinish();

        void onTick(long j10);
    }

    public SimpleTimer(long j10, Listener listener) {
        super(j10, 60000L);
        this.mListener = listener;
    }

    @Override // net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer
    public void onFinish() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onFinish();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer
    public void onTick(long j10) {
        this.mListener.onTick(j10);
    }

    public void pauseTimer() {
        pause();
    }

    public void resumeTimer() {
        resume();
    }

    public SimpleTimer(long j10, Listener listener, long j11) {
        super(j10, j11);
        this.mListener = listener;
    }
}
