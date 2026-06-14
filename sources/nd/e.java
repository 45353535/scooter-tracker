package nd;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.b;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.protobuf.sdk.Error;

/* JADX INFO: loaded from: classes3.dex */
public class e implements b {

    @Nullable
    private AdExtension.EventConfiguration defaultEventConfiguration;

    public e() {
        this(null);
    }

    private static Error.Data g(ae.a aVar) {
        return Error.Data.newBuilder().setCode(aVar.e()).setDescription(aVar.g()).build();
    }

    private static boolean h(AdExtension.EventConfiguration eventConfiguration, final int i10, long j10, long j11, AdsType adsType, String str, Double d10, Struct struct, final ae.a aVar) {
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(i10))) {
                    String url = eventConfiguration.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return false;
                    }
                    if (aVar == null) {
                        io.bidmachine.core.a.a(new ce.b() { // from class: nd.c
                            @Override // ce.b
                            public final Object get() {
                                return String.format("Sending event to server - %s", Integer.valueOf(i10));
                            }
                        });
                    } else {
                        io.bidmachine.core.a.a(new ce.b() { // from class: nd.d
                            @Override // ce.b
                            public final Object get() {
                                return String.format("Sending error event to server - %s, error - %s", Integer.valueOf(i10), aVar);
                            }
                        });
                    }
                    SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(i10).setContext(eventConfiguration.getContext()).setStartTime(ae.f.p(j10)).setFinishTime(ae.f.p(j11));
                    if (adsType != null) {
                        finishTime.setAdType(StringValue.newBuilder().setValue(adsType.getName()).build());
                    }
                    if (!TextUtils.isEmpty(str)) {
                        finishTime.setNetwork(StringValue.newBuilder().setValue(str).build());
                    }
                    if (d10 != null) {
                        finishTime.setPrice(d10.doubleValue());
                    }
                    if (struct != null) {
                        finishTime.setCustomParams(struct);
                    }
                    if (aVar != null) {
                        Error.Builder error = Error.newBuilder().setError(g(aVar));
                        ae.a aVarF = aVar.f();
                        if (aVarF != null) {
                            error.setReason(g(aVarF));
                        }
                        finishTime.setError(error);
                    }
                    new ApiRequest.Builder().url(url).setMethod(b.e.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                    return true;
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
        return false;
    }

    public void setDefaultEventConfiguration(@Nullable AdExtension.EventConfiguration eventConfiguration) {
        if (eventConfiguration != null && eventConfiguration.equals(AdExtension.EventConfiguration.getDefaultInstance())) {
            eventConfiguration = null;
        }
        this.defaultEventConfiguration = eventConfiguration;
    }

    @Override // nd.b
    public void trackEvent(@NonNull l lVar, @NonNull TrackEventType trackEventType, @Nullable j jVar, @Nullable AdsType adsType, @Nullable ae.a aVar, @Nullable a aVar2) {
        long jCurrentTimeMillis;
        long jB;
        String strC;
        Double d10;
        Struct structB;
        if (aVar == null || aVar.j()) {
            if (jVar != null) {
                jCurrentTimeMillis = jVar.c();
                jB = jVar.b();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                jB = jCurrentTimeMillis;
            }
            if (aVar2 != null) {
                strC = aVar2.c();
                d10 = aVar2.d();
                structB = aVar2.b();
            } else {
                strC = null;
                d10 = null;
                structB = null;
            }
            int actionValue = trackEventType.getActionValue();
            if (h(lVar.getEventConfiguration(), actionValue, jCurrentTimeMillis, jB, adsType, strC, d10, structB, aVar)) {
                return;
            }
            h(this.defaultEventConfiguration, actionValue, jCurrentTimeMillis, jB, adsType, strC, d10, structB, aVar);
        }
    }

    public e(AdExtension.EventConfiguration eventConfiguration) {
        setDefaultEventConfiguration(eventConfiguration);
    }
}
