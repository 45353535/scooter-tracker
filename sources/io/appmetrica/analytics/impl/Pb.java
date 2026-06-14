package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Pb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Qb.a(configuration) : CollectionsKt.listOf(Le.a(configuration.locale));
    }
}
