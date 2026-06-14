package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.taurusx.tax.f.y;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "transportFactoryProvider", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Lcom/google/firebase/sessions/SessionEvent;", "value", "", "b", "(Lcom/google/firebase/sessions/SessionEvent;)[B", "sessionEvent", "", s.z.f67719y, "(Lcom/google/firebase/sessions/SessionEvent;)V", "a", "Lcom/google/firebase/inject/Provider;", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Provider transportFactoryProvider;

    public EventGDTLogger(@NotNull Provider<TransportFactory> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] b(SessionEvent value) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(value);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        Log.d(FirebaseSessions.TAG, "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((TransportFactory) this.transportFactoryProvider.get()).getTransport("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, Encoding.of("json"), new Transformer() { // from class: com.google.firebase.sessions.a
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return this.f33417a.b((SessionEvent) obj);
            }
        }).send(Event.ofData(sessionEvent));
    }
}
