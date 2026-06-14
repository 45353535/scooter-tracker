package com.google.firebase.heartbeatinfo;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32804b;

    AutoValue_HeartBeatResult(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f32803a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f32804b = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeartBeatResult) {
            HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
            if (this.f32803a.equals(heartBeatResult.getUserAgent()) && this.f32804b.equals(heartBeatResult.getUsedDates())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.f32804b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.f32803a;
    }

    public int hashCode() {
        return ((this.f32803a.hashCode() ^ 1000003) * 1000003) ^ this.f32804b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f32803a + ", usedDates=" + this.f32804b + "}";
    }
}
