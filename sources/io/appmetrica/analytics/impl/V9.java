package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class V9 extends X9 {
    @Override // io.appmetrica.analytics.impl.X9
    @TargetApi(24)
    public final Y9 b(@NonNull FeatureInfo featureInfo) {
        return new Y9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
