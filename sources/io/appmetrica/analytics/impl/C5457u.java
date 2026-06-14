package io.appmetrica.analytics.impl;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5457u implements InterfaceC5507w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78314a = "yandex";

    @Nullable
    public final String a() {
        try {
            return new JSONArray((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f78314a), (Iterable) C5186j4.l().m().f77208d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
