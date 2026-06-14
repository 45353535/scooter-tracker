package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4965af extends Fd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5043df f76815d = new C5043df("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C5043df f76816e = new C5043df("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5043df f76817f = new C5043df("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5043df f76818g = new C5043df("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5043df f76819h = new C5043df("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5043df f76820i = new C5043df("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5043df f76821j = new C5043df("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5043df f76822k = new C5043df("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5043df f76823l = new C5043df("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5043df f76824m = new C5043df("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5043df f76825n = new C5043df("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5043df f76826o = new C5043df("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5043df f76827p = new C5043df("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5043df f76828q = new C5043df(IronSourceConstants.TYPE_GAID, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5043df f76829r = new C5043df("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5043df f76830s = new C5043df("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5043df f76831t = new C5043df("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5043df f76832u = new C5043df("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5043df f76833v = new C5043df("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5043df f76834w = new C5043df("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5043df f76835x = new C5043df("APPMETRICA_CLIENT_CONFIG", null);

    public C4965af(Oa oa2) {
        super(oa2);
    }

    public final boolean a(boolean z10) {
        return this.f76970a.getBoolean(f76831t.f77017b, z10);
    }

    public final long b(long j10) {
        return this.f76970a.getLong(f76821j.f77016a, j10);
    }

    @NonNull
    public final C4965af c(@Nullable IdentifiersResult identifiersResult) {
        return a(f76823l.f77017b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f76818g.f77017b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f76819h.f77017b);
    }

    @NonNull
    public final C4965af f(@Nullable IdentifiersResult identifiersResult) {
        return a(f76828q.f77017b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f76823l.f77017b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f76817f.f77017b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f76816e.f77017b);
    }

    @NonNull
    public final C5012ca k() {
        String string = this.f76970a.getString(f76834w.f77017b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C5012ca(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C5012ca(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f76828q.f77017b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f76829r.f77017b);
    }

    @NonNull
    public final long n() {
        return this.f76970a.getLong(f76827p.f77017b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f76822k.f77017b);
    }

    @Nullable
    public final ScreenInfo p() {
        return AbstractC5295nb.e(this.f76970a.getString(f76832u.f77017b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f76815d.f77017b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f76830s.f77017b);
    }

    public final boolean s() {
        return this.f76970a.getBoolean(f76825n.f77017b, false);
    }

    public final boolean t() {
        return this.f76970a.getBoolean(f76833v.f77017b, false);
    }

    public final C4965af u() {
        return (C4965af) b(f76825n.f77017b, true);
    }

    public final void v() {
        b(f76833v.f77017b, true);
    }

    public final List<String> g() {
        String string = this.f76970a.getString(f76820i.f77017b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC5295nb.b(string);
    }

    public final long a(long j10) {
        return this.f76970a.getLong(f76826o.f77017b, j10);
    }

    @NonNull
    public final C4965af b(@Nullable IdentifiersResult identifiersResult) {
        return a(f76819h.f77017b, identifiersResult);
    }

    public final C4965af c(long j10) {
        return (C4965af) b(f76826o.f77017b, j10);
    }

    @NonNull
    public final C4965af d(@Nullable IdentifiersResult identifiersResult) {
        return a(f76817f.f77017b, identifiersResult);
    }

    @NonNull
    public final C4965af e(@Nullable IdentifiersResult identifiersResult) {
        return a(f76816e.f77017b, identifiersResult);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.f76970a.getString(f76835x.f77017b, null);
        if (string == null) {
            return null;
        }
        return new O3().a(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f76970a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
        } else {
            identifiersResult = null;
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    public final C4965af i(@Nullable IdentifiersResult identifiersResult) {
        return a(f76815d.f77017b, identifiersResult);
    }

    @NonNull
    public final C4965af j(@Nullable IdentifiersResult identifiersResult) {
        return a(f76830s.f77017b, identifiersResult);
    }

    @NonNull
    public final C4965af g(@Nullable IdentifiersResult identifiersResult) {
        return a(f76829r.f77017b, identifiersResult);
    }

    @NonNull
    public final C4965af a(@Nullable IdentifiersResult identifiersResult) {
        return a(f76818g.f77017b, identifiersResult);
    }

    public final C4965af b(boolean z10) {
        return (C4965af) b(f76831t.f77017b, z10);
    }

    @NonNull
    public final C4965af d(long j10) {
        return (C4965af) b(f76827p.f77017b, j10);
    }

    public final C4965af e(long j10) {
        return (C4965af) b(f76821j.f77017b, j10);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.f76970a.getString(f76824m.f77017b, str);
    }

    public final C4965af j(@Nullable String str) {
        return (C4965af) b(f76824m.f77017b, str);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    @NonNull
    public final String f(@NonNull String str) {
        return new C5043df(str, null).f77017b;
    }

    public final C4965af a(List<String> list) {
        return (C4965af) b(f76820i.f77017b, no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final C4965af h(@Nullable IdentifiersResult identifiersResult) {
        return a(f76822k.f77017b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C4965af g(@NonNull String str) {
        return (C4965af) d(new C5043df(str, null).f77017b);
    }

    @NonNull
    public final C4965af a(@NonNull C5012ca c5012ca) {
        String str = f76834w.f77017b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c5012ca.f76960a).put("STATUS", c5012ca.f76961b.getValue()).putOpt("ERROR_EXPLANATION", c5012ca.f76962c);
        } catch (Throwable unused) {
        }
        return (C4965af) b(str, jSONObject.toString());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        b(f76832u.f77017b, AbstractC5295nb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f76835x.f77017b, appMetricaConfig.toJson());
    }

    public final C4965af a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", identifiersResult.f78675id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
