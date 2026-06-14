package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class TransportRuntime implements TransportInternal {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile TransportRuntimeComponent f24370e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f24371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f24372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Scheduler f24373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uploader f24374d;

    TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f24371a = clock;
        this.f24372b = clock2;
        this.f24373c = scheduler;
        this.f24374d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    private EventInternal a(SendRequest sendRequest) {
        EventInternal.Builder code = EventInternal.builder().setEventMillis(this.f24371a.getTime()).setUptimeMillis(this.f24372b.getTime()).setTransportName(sendRequest.getTransportName()).setEncodedPayload(new EncodedPayload(sendRequest.getEncoding(), sendRequest.getPayload())).setCode(sendRequest.a().getCode());
        if (sendRequest.a().getProductData() != null && sendRequest.a().getProductData().getProductId() != null) {
            code.setProductId(sendRequest.a().getProductData().getProductId());
        }
        if (sendRequest.a().getEventContext() != null) {
            EventContext eventContext = sendRequest.a().getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        return code.build();
    }

    private static Set b(Destination destination) {
        return destination instanceof EncodedDestination ? DesugarCollections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings()) : Collections.singleton(Encoding.of("proto"));
    }

    public static TransportRuntime getInstance() {
        TransportRuntimeComponent transportRuntimeComponent = f24370e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.n();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f24370e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f24370e == null) {
                        f24370e = DaggerTransportRuntimeComponent.builder().setApplicationContext(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.f24374d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new TransportFactoryImpl(b(null), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f24373c.schedule(sendRequest.getTransportContext().withPriority(sendRequest.a().getPriority()), a(sendRequest), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        return new TransportFactoryImpl(b(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}
