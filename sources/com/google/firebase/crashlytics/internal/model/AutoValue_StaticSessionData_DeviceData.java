package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f32641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32643i;

    AutoValue_StaticSessionData_DeviceData(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f32635a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f32636b = str;
        this.f32637c = i11;
        this.f32638d = j10;
        this.f32639e = j11;
        this.f32640f = z10;
        this.f32641g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f32642h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f32643i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.f32635a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.f32637c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.f32639e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            if (this.f32635a == deviceData.arch() && this.f32636b.equals(deviceData.model()) && this.f32637c == deviceData.availableProcessors() && this.f32638d == deviceData.totalRam() && this.f32639e == deviceData.diskSpace() && this.f32640f == deviceData.isEmulator() && this.f32641g == deviceData.state() && this.f32642h.equals(deviceData.manufacturer()) && this.f32643i.equals(deviceData.modelClass())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f32635a ^ 1000003) * 1000003) ^ this.f32636b.hashCode()) * 1000003) ^ this.f32637c) * 1000003;
        long j10 = this.f32638d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f32639e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f32640f ? 1231 : 1237)) * 1000003) ^ this.f32641g) * 1000003) ^ this.f32642h.hashCode()) * 1000003) ^ this.f32643i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.f32640f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.f32642h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.f32636b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.f32643i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.f32641g;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f32635a + ", model=" + this.f32636b + ", availableProcessors=" + this.f32637c + ", totalRam=" + this.f32638d + ", diskSpace=" + this.f32639e + ", isEmulator=" + this.f32640f + ", state=" + this.f32641g + ", manufacturer=" + this.f32642h + ", modelClass=" + this.f32643i + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.f32638d;
    }
}
