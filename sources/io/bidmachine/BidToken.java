package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.ExpirationHandler;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class BidToken implements ExpirationHandler.Listener {

    @NonNull
    private final AdRequest<?, ?, ?> adRequest;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final ExpirationListener<BidToken> expirationListener;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    private final String f79135id = UUID.randomUUID().toString();

    private static class b implements ExpirationHandler.TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(ee.b bVar) {
            BidTokenTaskManager.cancel(bVar);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(ee.b bVar, long j10) {
            BidTokenTaskManager.schedule(bVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    BidToken(@NonNull AdRequest<?, ?, ?> adRequest, int i10, @NonNull ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i10), this, new b());
        this.expirationListener = expirationListener;
    }

    void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    @NonNull
    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public String getId() {
        return this.f79135id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    void startExpiration() {
        this.expirationHandler.start();
    }

    void stopExpiration() {
        this.expirationHandler.stop();
    }
}
