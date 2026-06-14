package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f32480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32482i;

    static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f32483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f32486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f32487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f32488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f32490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f32491i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f32492j;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String str;
            String str2;
            String str3;
            if (this.f32492j == 63 && (str = this.f32484b) != null && (str2 = this.f32490h) != null && (str3 = this.f32491i) != null) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f32483a, str, this.f32485c, this.f32486d, this.f32487e, this.f32488f, this.f32489g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f32492j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f32484b == null) {
                sb2.append(" model");
            }
            if ((this.f32492j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f32492j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f32492j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f32492j & Ascii.DLE) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f32492j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f32490h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f32491i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i10) {
            this.f32483a = i10;
            this.f32492j = (byte) (this.f32492j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i10) {
            this.f32485c = i10;
            this.f32492j = (byte) (this.f32492j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j10) {
            this.f32487e = j10;
            this.f32492j = (byte) (this.f32492j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f32490h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f32484b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f32491i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j10) {
            this.f32486d = j10;
            this.f32492j = (byte) (this.f32492j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z10) {
            this.f32488f = z10;
            this.f32492j = (byte) (this.f32492j | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i10) {
            this.f32489g = i10;
            this.f32492j = (byte) (this.f32492j | 32);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Device) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            if (this.f32474a == device.getArch() && this.f32475b.equals(device.getModel()) && this.f32476c == device.getCores() && this.f32477d == device.getRam() && this.f32478e == device.getDiskSpace() && this.f32479f == device.isSimulator() && this.f32480g == device.getState() && this.f32481h.equals(device.getManufacturer()) && this.f32482i.equals(device.getModelClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public int getArch() {
        return this.f32474a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.f32476c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.f32478e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getManufacturer() {
        return this.f32481h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModel() {
        return this.f32475b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModelClass() {
        return this.f32482i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.f32477d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.f32480g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f32474a ^ 1000003) * 1000003) ^ this.f32475b.hashCode()) * 1000003) ^ this.f32476c) * 1000003;
        long j10 = this.f32477d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f32478e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f32479f ? 1231 : 1237)) * 1000003) ^ this.f32480g) * 1000003) ^ this.f32481h.hashCode()) * 1000003) ^ this.f32482i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.f32479f;
    }

    public String toString() {
        return "Device{arch=" + this.f32474a + ", model=" + this.f32475b + ", cores=" + this.f32476c + ", ram=" + this.f32477d + ", diskSpace=" + this.f32478e + ", simulator=" + this.f32479f + ", state=" + this.f32480g + ", manufacturer=" + this.f32481h + ", modelClass=" + this.f32482i + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Device(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f32474a = i10;
        this.f32475b = str;
        this.f32476c = i11;
        this.f32477d = j10;
        this.f32478e = j11;
        this.f32479f = z10;
        this.f32480g = i12;
        this.f32481h = str2;
        this.f32482i = str3;
    }
}
