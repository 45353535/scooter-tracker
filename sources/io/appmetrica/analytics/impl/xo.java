package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xo extends SimpleThreadSafeToggle implements ApplicationStateObserver {
    public xo() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            a(C5468ua.k().e().registerStickyObserver(this));
            Unit unit = Unit.f93236a;
        }
    }

    public final void a(ApplicationState applicationState) {
        updateState(applicationState == ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(@NotNull ApplicationState applicationState) {
        a(applicationState);
    }
}
