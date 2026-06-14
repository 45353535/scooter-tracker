package nd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends m {

    @NonNull
    private final f sessionTracker;

    public h(f fVar) {
        this(UUID.randomUUID(), fVar);
    }

    public void clear() {
        this.sessionTracker.b(this);
    }

    @Override // nd.l
    public void clearEvent(@NonNull TrackEventType trackEventType) {
        this.sessionTracker.d(this, trackEventType);
    }

    @Override // nd.l
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable a aVar, @Nullable ae.a aVar2) {
        this.sessionTracker.c(this, trackEventType, adsType, aVar2, aVar);
    }

    @Override // nd.l
    public void eventStart(@NonNull TrackEventType trackEventType, @Nullable j jVar) {
        this.sessionTracker.a(this, trackEventType, jVar);
    }

    public h(Object obj, f fVar) {
        super(obj);
        this.sessionTracker = fVar;
    }
}
