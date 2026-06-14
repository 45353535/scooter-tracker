package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f40457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final HashSet<String> f40458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f40459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f40460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f40461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40463g;

    public C1(@NotNull JSONObject applicationCrashReporterSettings) throws JSONException {
        Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f40457a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> listB = C4365ia.b(applicationCrashReporterSettings.optJSONArray(E1.f40660b));
        this.f40458b = listB != null ? CollectionsKt.toHashSet(listB) : null;
        String strOptString = applicationCrashReporterSettings.optString(E1.f40661c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f40459c = strOptString;
        String strOptString2 = applicationCrashReporterSettings.optString(E1.f40662d);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f40460d = strOptString2;
        this.f40461e = applicationCrashReporterSettings.optBoolean(E1.f40663e, false);
        this.f40462f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f40463g = applicationCrashReporterSettings.optBoolean(E1.f40665g, false);
    }

    public final int a() {
        return this.f40462f;
    }

    @Nullable
    public final HashSet<String> b() {
        return this.f40458b;
    }

    @NotNull
    public final String c() {
        return this.f40460d;
    }

    @NotNull
    public final String d() {
        return this.f40459c;
    }

    public final boolean e() {
        return this.f40461e;
    }

    public final boolean f() {
        return this.f40457a;
    }

    public final boolean g() {
        return this.f40463g;
    }
}
