package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClientInfo f24253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f24254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f24256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QosTier f24257g;

    static final class Builder extends LogRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f24259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ClientInfo f24260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f24261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f24263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private QosTier f24264g;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        LogRequest.Builder a(Integer num) {
            this.f24261d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        LogRequest.Builder b(String str) {
            this.f24262e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest build() {
            String str = "";
            if (this.f24258a == null) {
                str = " requestTimeMs";
            }
            if (this.f24259b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.f24258a.longValue(), this.f24259b.longValue(), this.f24260c, this.f24261d, this.f24262e, this.f24263f, this.f24264g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setClientInfo(@Nullable ClientInfo clientInfo) {
            this.f24260c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setLogEvents(@Nullable List<LogEvent> list) {
            this.f24263f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setQosTier(@Nullable QosTier qosTier) {
            this.f24264g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestTimeMs(long j10) {
            this.f24258a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestUptimeMs(long j10) {
            this.f24259b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List list;
        QosTier qosTier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogRequest) {
            LogRequest logRequest = (LogRequest) obj;
            if (this.f24251a == logRequest.getRequestTimeMs() && this.f24252b == logRequest.getRequestUptimeMs() && ((clientInfo = this.f24253c) != null ? clientInfo.equals(logRequest.getClientInfo()) : logRequest.getClientInfo() == null) && ((num = this.f24254d) != null ? num.equals(logRequest.getLogSource()) : logRequest.getLogSource() == null) && ((str = this.f24255e) != null ? str.equals(logRequest.getLogSourceName()) : logRequest.getLogSourceName() == null) && ((list = this.f24256f) != null ? list.equals(logRequest.getLogEvents()) : logRequest.getLogEvents() == null) && ((qosTier = this.f24257g) != null ? qosTier.equals(logRequest.getQosTier()) : logRequest.getQosTier() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public ClientInfo getClientInfo() {
        return this.f24253c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    @Encodable.Field(name = "logEvent")
    public List<LogEvent> getLogEvents() {
        return this.f24256f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public Integer getLogSource() {
        return this.f24254d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public String getLogSourceName() {
        return this.f24255e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public QosTier getQosTier() {
        return this.f24257g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestTimeMs() {
        return this.f24251a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestUptimeMs() {
        return this.f24252b;
    }

    public int hashCode() {
        long j10 = this.f24251a;
        long j11 = this.f24252b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        ClientInfo clientInfo = this.f24253c;
        int iHashCode = (i10 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f24254d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24255e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f24256f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f24257g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f24251a + ", requestUptimeMs=" + this.f24252b + ", clientInfo=" + this.f24253c + ", logSource=" + this.f24254d + ", logSourceName=" + this.f24255e + ", logEvents=" + this.f24256f + ", qosTier=" + this.f24257g + "}";
    }

    private AutoValue_LogRequest(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f24251a = j10;
        this.f24252b = j11;
        this.f24253c = clientInfo;
        this.f24254d = num;
        this.f24255e = str;
        this.f24256f = list;
        this.f24257g = qosTier;
    }
}
