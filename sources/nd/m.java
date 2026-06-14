package nd;

import androidx.annotation.NonNull;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements l {

    @NonNull
    private final Object trackingKey;

    public m() {
        this(UUID.randomUUID());
    }

    @Override // nd.l
    public /* synthetic */ void eventStart(TrackEventType trackEventType) {
        k.a(this, trackEventType);
    }

    @Override // nd.l
    public AdExtension.EventConfiguration getEventConfiguration() {
        return null;
    }

    @Override // nd.l
    @NonNull
    public Object getTrackingKey() {
        return this.trackingKey;
    }

    @Override // nd.l
    public List getTrackingUrls(TrackEventType trackEventType) {
        return null;
    }

    public m(Object obj) {
        this.trackingKey = obj;
    }
}
