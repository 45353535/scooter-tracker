package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32968c;

    public FirebaseRemoteConfigFetchThrottledException(long j10) {
        this("Fetch was throttled.", j10);
    }

    public long getThrottleEndTimeMillis() {
        return this.f32968c;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j10) {
        super(str);
        this.f32968c = j10;
    }
}
