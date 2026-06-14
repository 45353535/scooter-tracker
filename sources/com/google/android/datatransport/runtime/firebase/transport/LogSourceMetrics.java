package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class LogSourceMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LogSourceMetrics f24428c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24430b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24431a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f24432b = new ArrayList();

        Builder() {
        }

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.f24432b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.f24431a, DesugarCollections.unmodifiableList(this.f24432b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.f24432b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.f24431a = str;
            return this;
        }
    }

    LogSourceMetrics(String str, List list) {
        this.f24429a = str;
        this.f24430b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return f24428c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.f24430b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.f24429a;
    }
}
