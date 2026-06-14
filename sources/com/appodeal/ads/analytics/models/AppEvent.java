package com.appodeal.ads.analytics.models;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent;", "Lcom/appodeal/ads/analytics/models/Event;", LogConstants.EVENT_PAUSE, LogConstants.EVENT_RESUME, "AdViewAttach", "AdViewDetach", "MemoryWarning", "Lcom/appodeal/ads/analytics/models/AppEvent$AdViewAttach;", "Lcom/appodeal/ads/analytics/models/AppEvent$AdViewDetach;", "Lcom/appodeal/ads/analytics/models/AppEvent$MemoryWarning;", "Lcom/appodeal/ads/analytics/models/AppEvent$Pause;", "Lcom/appodeal/ads/analytics/models/AppEvent$Resume;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppEvent extends Event {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent$AdViewAttach;", "Lcom/appodeal/ads/analytics/models/AppEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdViewAttach implements AppEvent {
        public static final AdViewAttach INSTANCE = new AdViewAttach();
        private static final String name = "app_adview_attach";

        private AdViewAttach() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent$AdViewDetach;", "Lcom/appodeal/ads/analytics/models/AppEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdViewDetach implements AppEvent {
        public static final AdViewDetach INSTANCE = new AdViewDetach();
        private static final String name = "app_adview_detach";

        private AdViewDetach() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent$MemoryWarning;", "Lcom/appodeal/ads/analytics/models/AppEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MemoryWarning implements AppEvent {
        public static final MemoryWarning INSTANCE = new MemoryWarning();
        private static final String name = "app_memory_warning";

        private MemoryWarning() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent$Pause;", "Lcom/appodeal/ads/analytics/models/AppEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pause implements AppEvent {
        public static final Pause INSTANCE = new Pause();
        private static final String name = "app_pause";

        private Pause() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AppEvent$Resume;", "Lcom/appodeal/ads/analytics/models/AppEvent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Resume implements AppEvent {
        public static final Resume INSTANCE = new Resume();
        private static final String name = "app_resume";

        private Resume() {
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return name;
        }
    }
}
