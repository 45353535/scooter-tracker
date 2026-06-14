package com.appodeal.ads.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.uc;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class EventsTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static EventsTracker f14953c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f14954a = new EnumMap(AdType.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14955b = new HashMap();

    @Deprecated
    public enum EventType {
        Impression
    }

    public interface EventsListener {
        void onImpressionStored(@NonNull AdType adType, @Nullable String str);
    }

    public static EventsTracker get() {
        EventsTracker eventsTracker;
        EventsTracker eventsTracker2 = f14953c;
        if (eventsTracker2 != null) {
            return eventsTracker2;
        }
        synchronized (EventsTracker.class) {
            try {
                eventsTracker = f14953c;
                if (eventsTracker == null) {
                    eventsTracker = new EventsTracker();
                    f14953c = eventsTracker;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eventsTracker;
    }

    public final void a(AdType adType, uc ucVar, EventType eventType) {
        e eVar;
        if (this.f14954a.containsKey(adType)) {
            eVar = (e) this.f14954a.get(adType);
        } else {
            eVar = new e();
            this.f14954a.put(adType, eVar);
        }
        AtomicInteger atomicInteger = (AtomicInteger) eVar.f15016a.get(eventType);
        if (atomicInteger == null) {
            eVar.f15016a.put(eventType, new AtomicInteger(1));
        } else {
            atomicInteger.incrementAndGet();
        }
        String name = ucVar != null ? ucVar.f14936b.getName() : null;
        if (eventType == EventType.Impression) {
            Iterator it = this.f14955b.values().iterator();
            while (it.hasNext()) {
                ((EventsListener) it.next()).onImpressionStored(adType, name);
            }
        }
    }

    public int getEventCount(@NonNull EventType eventType, @Nullable AdType... adTypeArr) {
        e eVar;
        if (adTypeArr == null) {
            return 0;
        }
        int i10 = 0;
        for (AdType adType : adTypeArr) {
            if (this.f14954a.containsKey(adType)) {
                eVar = (e) this.f14954a.get(adType);
            } else {
                eVar = new e();
                this.f14954a.put(adType, eVar);
            }
            AtomicInteger atomicInteger = (AtomicInteger) eVar.f15016a.get(eventType);
            i10 += atomicInteger != null ? atomicInteger.get() : 0;
        }
        return i10;
    }

    public void subscribeEventsListener(String str, EventsListener eventsListener) {
        this.f14955b.put(str, eventsListener);
    }

    public void unsubscribeEventsListener(String str) {
        this.f14955b.remove(str);
    }
}
