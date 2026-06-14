package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4540sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4540sf f45416a = new C4540sf();

    private C4540sf() {
    }

    public final void a(int i10) {
        a(A5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i10), null);
    }

    public final void b() {
        a(this, A5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, A5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() throws JSONException {
        a(this, A5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(@NotNull String errorReason) throws JSONException {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(A5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(C4540sf c4540sf, A5 a52, Integer num, String str, int i10, Object obj) throws JSONException {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        c4540sf.a(a52, num, str);
    }

    private final void a(A5 a52, Integer num, String str) throws JSONException {
        Bf bf2 = Bf.f40456a;
        JSONObject jSONObjectA = bf2.a(false);
        if (num != null) {
            jSONObjectA.put("errorCode", num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f44107f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        bf2.a(a52, jSONObjectA);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = Bf.f40456a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f44107f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f44107f));
        }
        return null;
    }
}
