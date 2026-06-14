package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;

/* JADX INFO: loaded from: classes7.dex */
@Module
public abstract class TimeModule {
    static Clock a() {
        return new WallTimeClock();
    }

    static Clock b() {
        return new UptimeClock();
    }
}
