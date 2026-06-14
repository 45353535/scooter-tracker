package nd;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface l {
    void clearEvent(TrackEventType trackEventType);

    void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, ae.a aVar2);

    void eventStart(TrackEventType trackEventType);

    void eventStart(TrackEventType trackEventType, j jVar);

    AdExtension.EventConfiguration getEventConfiguration();

    Object getTrackingKey();

    List getTrackingUrls(TrackEventType trackEventType);
}
