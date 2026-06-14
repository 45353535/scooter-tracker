package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseRemoteConfigSettings f33117c;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f33118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FirebaseRemoteConfigSettings f33120c;

        Builder a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.f33120c = firebaseRemoteConfigSettings;
            return this;
        }

        Builder b(int i10) {
            this.f33119b = i10;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.f33118a, this.f33119b, this.f33120c);
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j10) {
            this.f33118a = j10;
            return this;
        }

        private Builder() {
        }
    }

    static Builder a() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.f33117c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.f33115a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.f33116b;
    }

    private FirebaseRemoteConfigInfoImpl(long j10, int i10, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f33115a = j10;
        this.f33116b = i10;
        this.f33117c = firebaseRemoteConfigSettings;
    }
}
