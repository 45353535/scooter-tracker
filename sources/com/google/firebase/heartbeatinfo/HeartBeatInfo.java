package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f32813b;

        HeartBeat(int i10) {
            this.f32813b = i10;
        }

        public int getCode() {
            return this.f32813b;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);
}
