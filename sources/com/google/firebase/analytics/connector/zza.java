package com.google.firebase.analytics.connector;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class zza implements EventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ zza f31758a = new zza();

    private /* synthetic */ zza() {
    }

    @Override // com.google.firebase.events.EventHandler
    public final /* synthetic */ void handle(Event event) {
        AnalyticsConnectorImpl.a(event);
    }
}
