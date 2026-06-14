package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ClientMetrics {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ClientMetrics f24409e = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeWindow f24410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GlobalMetrics f24412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24413d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TimeWindow f24414a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f24415b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GlobalMetrics f24416c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24417d = "";

        Builder() {
        }

        public Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics) {
            this.f24415b.add(logSourceMetrics);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.f24414a, DesugarCollections.unmodifiableList(this.f24415b), this.f24416c, this.f24417d);
        }

        public Builder setAppNamespace(String str) {
            this.f24417d = str;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics globalMetrics) {
            this.f24416c = globalMetrics;
            return this;
        }

        public Builder setLogSourceMetricsList(List<LogSourceMetrics> list) {
            this.f24415b = list;
            return this;
        }

        public Builder setWindow(TimeWindow timeWindow) {
            this.f24414a = timeWindow;
            return this;
        }
    }

    ClientMetrics(TimeWindow timeWindow, List list, GlobalMetrics globalMetrics, String str) {
        this.f24410a = timeWindow;
        this.f24411b = list;
        this.f24412c = globalMetrics;
        this.f24413d = str;
    }

    public static ClientMetrics getDefaultInstance() {
        return f24409e;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.f24413d;
    }

    @Encodable.Ignore
    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics globalMetrics = this.f24412c;
        return globalMetrics == null ? GlobalMetrics.getDefaultInstance() : globalMetrics;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.f24412c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<LogSourceMetrics> getLogSourceMetricsList() {
        return this.f24411b;
    }

    @Encodable.Ignore
    public TimeWindow getWindow() {
        TimeWindow timeWindow = this.f24410a;
        return timeWindow == null ? TimeWindow.getDefaultInstance() : timeWindow;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public TimeWindow getWindowInternal() {
        return this.f24410a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
