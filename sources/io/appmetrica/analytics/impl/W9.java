package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class W9 extends X9 {
    @Override // io.appmetrica.analytics.impl.X9
    public final Y9 b(@NonNull FeatureInfo featureInfo) {
        return new Y9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
