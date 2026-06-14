package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f74886a;

        Error(String str) {
            this.f74886a = str;
        }

        public String getDescription() {
            return this.f74886a;
        }
    }

    void onDeeplinkLoaded(@NonNull String str);

    void onError(@NonNull Error error, @Nullable String str);
}
