package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f32585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32590f;

    static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f32591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f32593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f32594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f32595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f32596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f32597g;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device build() {
            if (this.f32597g == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f32591a, this.f32592b, this.f32593c, this.f32594d, this.f32595e, this.f32596f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32597g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f32597g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f32597g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f32597g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f32597g & Ascii.DLE) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d10) {
            this.f32591a = d10;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i10) {
            this.f32592b = i10;
            this.f32597g = (byte) (this.f32597g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j10) {
            this.f32596f = j10;
            this.f32597g = (byte) (this.f32597g | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i10) {
            this.f32594d = i10;
            this.f32597g = (byte) (this.f32597g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z10) {
            this.f32593c = z10;
            this.f32597g = (byte) (this.f32597g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j10) {
            this.f32595e = j10;
            this.f32597g = (byte) (this.f32597g | 8);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Device) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            Double d10 = this.f32585a;
            if (d10 != null ? d10.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
                if (this.f32586b == device.getBatteryVelocity() && this.f32587c == device.isProximityOn() && this.f32588d == device.getOrientation() && this.f32589e == device.getRamUsed() && this.f32590f == device.getDiskUsed()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    @Nullable
    public Double getBatteryLevel() {
        return this.f32585a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.f32586b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.f32590f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.f32588d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.f32589e;
    }

    public int hashCode() {
        Double d10 = this.f32585a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f32586b) * 1000003) ^ (this.f32587c ? 1231 : 1237)) * 1000003) ^ this.f32588d) * 1000003;
        long j10 = this.f32589e;
        long j11 = this.f32590f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.f32587c;
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f32585a + ", batteryVelocity=" + this.f32586b + ", proximityOn=" + this.f32587c + ", orientation=" + this.f32588d + ", ramUsed=" + this.f32589e + ", diskUsed=" + this.f32590f + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f32585a = d10;
        this.f32586b = i10;
        this.f32587c = z10;
        this.f32588d = i11;
        this.f32589e = j10;
        this.f32590f = j11;
    }
}
