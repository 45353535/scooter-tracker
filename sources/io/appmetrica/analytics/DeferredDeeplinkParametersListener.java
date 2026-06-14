package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface DeferredDeeplinkParametersListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink parameters can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain valid deferred deeplink parameters."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f74888a;

        Error(String str) {
            this.f74888a = str;
        }

        public String getDescription() {
            return this.f74888a;
        }
    }

    void onError(@NonNull Error error, @NonNull String str);

    void onParametersLoaded(@NonNull Map<String, String> map);
}
