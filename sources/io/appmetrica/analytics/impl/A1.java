package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public interface A1 {
    /* synthetic */ void a(Intent intent);

    /* synthetic */ void a(Intent intent, int i10);

    /* synthetic */ void a(Intent intent, int i10, int i11);

    void a(@NonNull InterfaceC5584z1 interfaceC5584z1);

    /* synthetic */ void b(Intent intent);

    /* synthetic */ void c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(@NonNull Bundle bundle);

    void reportData(int i10, Bundle bundle);

    void resumeUserSession(@NonNull Bundle bundle);
}
