package com.my.target.common.models;

import androidx.annotation.NonNull;
import com.my.target.t5;

/* JADX INFO: loaded from: classes11.dex */
public final class AudioData extends t5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59430e;

    public AudioData(String str) {
        super(str);
    }

    @NonNull
    public static AudioData newAudioData(@NonNull String str) {
        return new AudioData(str);
    }

    public int getBitrate() {
        return this.f59430e;
    }

    public void setBitrate(int i10) {
        this.f59430e = i10;
    }
}
