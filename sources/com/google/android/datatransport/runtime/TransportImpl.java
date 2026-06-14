package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* JADX INFO: loaded from: classes7.dex */
final class TransportImpl<T> implements Transport<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TransportContext f24365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Encoding f24367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Transformer f24368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TransportInternal f24369e;

    TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportInternal transportInternal) {
        this.f24365a = transportContext;
        this.f24366b = str;
        this.f24367c = encoding;
        this.f24368d = transformer;
        this.f24369e = transportInternal;
    }

    public static /* synthetic */ void a(Exception exc) {
    }

    TransportContext b() {
        return this.f24365a;
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        this.f24369e.send(SendRequest.builder().setTransportContext(this.f24365a).b(event).setTransportName(this.f24366b).c(this.f24368d).a(this.f24367c).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event<T> event) {
        schedule(event, new TransportScheduleCallback() { // from class: com.google.android.datatransport.runtime.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                TransportImpl.a(exc);
            }
        });
    }
}
