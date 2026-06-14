package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            static final class HandlerAndListener {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new HandlerAndListener(handler, eventListener));
            }

            public void bandwidthSample(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.released) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        handlerAndListener.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                handlerAndListener.listener.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void removeListener(EventListener eventListener) {
                for (HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.listener == eventListener) {
                        handlerAndListener.release();
                        this.listeners.remove(handlerAndListener);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
