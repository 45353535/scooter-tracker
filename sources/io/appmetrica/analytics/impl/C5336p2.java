package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5336p2 implements InterfaceC5354pk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f77952a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f77953b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f77954c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f77955d = new CopyOnWriteArraySet();

    public final void a(int i10) {
        this.f77952a.remove(Integer.valueOf(i10));
        a();
    }

    public final void b(int i10) {
        this.f77953b.add(Integer.valueOf(i10));
        this.f77952a.remove(Integer.valueOf(i10));
        a();
    }

    public final void c(int i10) {
        this.f77952a.add(Integer.valueOf(i10));
        this.f77953b.remove(Integer.valueOf(i10));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f77954c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354pk
    public final void onDestroy() {
        if (this.f77954c == ApplicationState.VISIBLE) {
            this.f77954c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f77955d.add(applicationStateObserver);
        }
        return this.f77954c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f77952a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f77953b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f77954c != applicationState) {
            this.f77954c = applicationState;
            Iterator it = this.f77955d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f77954c);
            }
        }
    }
}
