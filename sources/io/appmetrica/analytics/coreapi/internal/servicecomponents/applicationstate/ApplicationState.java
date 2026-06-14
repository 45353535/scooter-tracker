package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.H2;

/* JADX INFO: loaded from: classes12.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(H2.f75840g),
    VISIBLE("visible");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f75204a;

    ApplicationState(String str) {
        this.f75204a = str;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f75204a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f75204a;
    }
}
