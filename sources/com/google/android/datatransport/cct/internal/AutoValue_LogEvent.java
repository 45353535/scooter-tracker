package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f24234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComplianceData f24235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f24237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f24239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final NetworkConnectionInfo f24240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExperimentIds f24241i;

    static final class Builder extends LogEvent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f24242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f24243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ComplianceData f24244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f24245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f24246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f24247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f24248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private NetworkConnectionInfo f24249h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ExperimentIds f24250i;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        LogEvent.Builder a(byte[] bArr) {
            this.f24246e = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        LogEvent.Builder b(String str) {
            this.f24247f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent build() {
            String str = "";
            if (this.f24242a == null) {
                str = " eventTimeMs";
            }
            if (this.f24245d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f24248g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.f24242a.longValue(), this.f24243b, this.f24244c, this.f24245d.longValue(), this.f24246e, this.f24247f, this.f24248g.longValue(), this.f24249h, this.f24250i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setComplianceData(@Nullable ComplianceData complianceData) {
            this.f24244c = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventCode(@Nullable Integer num) {
            this.f24243b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventTimeMs(long j10) {
            this.f24242a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventUptimeMs(long j10) {
            this.f24245d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setExperimentIds(@Nullable ExperimentIds experimentIds) {
            this.f24250i = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f24249h = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setTimezoneOffsetSeconds(long j10) {
            this.f24248g = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        ComplianceData complianceData;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        ExperimentIds experimentIds;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEvent) {
            LogEvent logEvent = (LogEvent) obj;
            if (this.f24233a == logEvent.getEventTimeMs() && ((num = this.f24234b) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && ((complianceData = this.f24235c) != null ? complianceData.equals(logEvent.getComplianceData()) : logEvent.getComplianceData() == null) && this.f24236d == logEvent.getEventUptimeMs()) {
                if (Arrays.equals(this.f24237e, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f24237e : logEvent.getSourceExtension()) && ((str = this.f24238f) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.f24239g == logEvent.getTimezoneOffsetSeconds() && ((networkConnectionInfo = this.f24240h) != null ? networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo()) : logEvent.getNetworkConnectionInfo() == null) && ((experimentIds = this.f24241i) != null ? experimentIds.equals(logEvent.getExperimentIds()) : logEvent.getExperimentIds() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public ComplianceData getComplianceData() {
        return this.f24235c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public Integer getEventCode() {
        return this.f24234b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.f24233a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.f24236d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public ExperimentIds getExperimentIds() {
        return this.f24241i;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.f24240h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public byte[] getSourceExtension() {
        return this.f24237e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public String getSourceExtensionJsonProto3() {
        return this.f24238f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.f24239g;
    }

    public int hashCode() {
        long j10 = this.f24233a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f24234b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.f24235c;
        int iHashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j11 = this.f24236d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f24237e)) * 1000003;
        String str = this.f24238f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f24239g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f24240h;
        int iHashCode5 = (i11 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.f24241i;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f24233a + ", eventCode=" + this.f24234b + ", complianceData=" + this.f24235c + ", eventUptimeMs=" + this.f24236d + ", sourceExtension=" + Arrays.toString(this.f24237e) + ", sourceExtensionJsonProto3=" + this.f24238f + ", timezoneOffsetSeconds=" + this.f24239g + ", networkConnectionInfo=" + this.f24240h + ", experimentIds=" + this.f24241i + "}";
    }

    private AutoValue_LogEvent(long j10, Integer num, ComplianceData complianceData, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f24233a = j10;
        this.f24234b = num;
        this.f24235c = complianceData;
        this.f24236d = j11;
        this.f24237e = bArr;
        this.f24238f = str;
        this.f24239g = j12;
        this.f24240h = networkConnectionInfo;
        this.f24241i = experimentIds;
    }
}
