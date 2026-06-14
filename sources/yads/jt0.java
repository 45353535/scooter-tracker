package yads;

import android.location.Location;
import android.net.Uri;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.D5;
import com.ironsource.N6;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class jt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9 f112450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl0 f112451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sequence f112452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sequence f112453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f112454e;

    public jt0(ft0 ft0Var) {
        i9 i9Var = new i9();
        this.f112450a = i9Var;
        this.f112451b = new pl0();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        a(mapCreateMapBuilder, "ad_unit_id", ft0Var.c());
        a(mapCreateMapBuilder, "width", ft0Var.p0());
        a(mapCreateMapBuilder, "height", ft0Var.B());
        a(mapCreateMapBuilder, "ad_size_type", ft0Var.a());
        a(mapCreateMapBuilder, "orientation", ft0Var.K());
        a(mapCreateMapBuilder, "ads_count", ft0Var.f());
        a(mapCreateMapBuilder, CommonUrlParts.SCREEN_WIDTH, ft0Var.a0());
        a(mapCreateMapBuilder, CommonUrlParts.SCREEN_HEIGHT, ft0Var.Z());
        a(mapCreateMapBuilder, CommonUrlParts.SCALE_FACTOR, ft0Var.X());
        a(mapCreateMapBuilder, "ad_type", ft0Var.b());
        a(mapCreateMapBuilder, "network_type", ft0Var.H());
        a(mapCreateMapBuilder, N6.Q0, ft0Var.m());
        a(mapCreateMapBuilder, "dnt", ft0Var.z());
        a(mapCreateMapBuilder, "gaid_reset", ft0Var.v());
        a(mapCreateMapBuilder, "huawei_dnt", ft0Var.C());
        a(mapCreateMapBuilder, "image_sizes", ft0Var.D());
        a(mapCreateMapBuilder, "response_ad_format", ft0Var.S());
        a(mapCreateMapBuilder, FirebaseAnalytics.Param.AD_SOURCE, ft0Var.f0());
        a(mapCreateMapBuilder, "debug_uid", ft0Var.s());
        a(mapCreateMapBuilder, "open_bidding_data", ft0Var.I());
        a(mapCreateMapBuilder, "session_random", ft0Var.e0());
        a(mapCreateMapBuilder, D5.M, ft0Var.n());
        a(mapCreateMapBuilder, i9Var.b(), ft0Var.u());
        a(mapCreateMapBuilder, i9Var.f(), ft0Var.L());
        a(mapCreateMapBuilder, i9Var.g(), ft0Var.M());
        a(mapCreateMapBuilder, i9Var.d(), ft0Var.F());
        a(mapCreateMapBuilder, i9Var.e(), ft0Var.G());
        a(mapCreateMapBuilder, i9Var.c(), ft0Var.q0());
        a(mapCreateMapBuilder, CommonUrlParts.LOCALE, ft0Var.E());
        a(mapCreateMapBuilder, "content_language", ft0Var.i());
        List listO = ft0Var.O();
        a(mapCreateMapBuilder, "device_languages", listO != null ? CollectionsKt.joinToString$default(listO, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, null, 62, null) : null);
        a(mapCreateMapBuilder, "app_id", ft0Var.h());
        a(mapCreateMapBuilder, "app_version_code", ft0Var.k());
        a(mapCreateMapBuilder, CommonUrlParts.APP_VERSION, ft0Var.l());
        a(mapCreateMapBuilder, "appmetrica_version", ft0Var.j());
        a(mapCreateMapBuilder, CommonUrlParts.SCREEN_DPI, Integer.valueOf(ft0Var.Y()));
        a(mapCreateMapBuilder, "safe_area_inset_left", Float.valueOf(ft0Var.U()));
        a(mapCreateMapBuilder, "safe_area_inset_top", Float.valueOf(ft0Var.W()));
        a(mapCreateMapBuilder, "safe_area_inset_right", Float.valueOf(ft0Var.V()));
        a(mapCreateMapBuilder, "safe_area_inset_bottom", Float.valueOf(ft0Var.T()));
        a(mapCreateMapBuilder, "cutout_safe_area_inset_top", Float.valueOf(ft0Var.r()));
        a(mapCreateMapBuilder, "cutout_safe_area_inset_bottom", Float.valueOf(ft0Var.q()));
        a(mapCreateMapBuilder, "user_consent", ft0Var.k0());
        a(mapCreateMapBuilder, "gdpr", ft0Var.w());
        a(mapCreateMapBuilder, "gdpr_consent", ft0Var.x());
        a(mapCreateMapBuilder, "cmp_present", Boolean.valueOf(ft0Var.o()));
        a(mapCreateMapBuilder, "parsed_purpose_consents", ft0Var.R());
        a(mapCreateMapBuilder, "parsed_vendor_consents", ft0Var.l0());
        a(mapCreateMapBuilder, "addtl_consent", ft0Var.d());
        a(mapCreateMapBuilder, "bidding_data", ft0Var.A());
        a(mapCreateMapBuilder, "prefetched_mediation_data", ft0Var.Q());
        a(mapCreateMapBuilder, "connected_network_ids", ft0Var.p());
        a(mapCreateMapBuilder, ADJPConstants.KEY_SDK_VERSION, ft0Var.b0());
        a(mapCreateMapBuilder, "sdk_version_name", ft0Var.c0());
        a(mapCreateMapBuilder, "sdk_vendor", "yandex");
        a(mapCreateMapBuilder, "preferred_theme", ft0Var.P());
        a(mapCreateMapBuilder, "device_theme", ft0Var.t());
        a(mapCreateMapBuilder, "age_restricted_user", ft0Var.g());
        a(mapCreateMapBuilder, "view_size_info", ft0Var.m0());
        a(mapCreateMapBuilder, "web_view_available", ft0Var.o0());
        a(mapCreateMapBuilder, "startup_version", ft0Var.h0());
        a(mapCreateMapBuilder, "session-data", ft0Var.d0());
        a(mapCreateMapBuilder, "user-agent", ft0Var.j0());
        a(mapCreateMapBuilder, "stub_reason", ft0Var.i0());
        a(mapCreateMapBuilder, "gms_available", ft0Var.y());
        a(mapCreateMapBuilder, "opt_out", ft0Var.J());
        a(mapCreateMapBuilder, "vpn_enabled", ft0Var.n0());
        a(mapCreateMapBuilder, ft0Var.g0());
        a(mapCreateMapBuilder, ft0Var.N());
        a(mapCreateMapBuilder, ft0Var);
        b(mapCreateMapBuilder, ft0Var);
        this.f112452c = MapsKt.asSequence(MapsKt.build(mapCreateMapBuilder));
        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
        for (Map.Entry entry : ft0Var.e().entrySet()) {
            a(mapCreateMapBuilder2, (String) entry.getKey(), entry.getValue());
        }
        this.f112453d = MapsKt.asSequence(MapsKt.build(mapCreateMapBuilder2));
        this.f112454e = lf.i.a(new it0(this));
    }

    public final void a(Map map, ft0 ft0Var) {
        if (!ft0Var.f110868g || ft0Var.f110866f) {
            a(map, CommonUrlParts.UUID, ft0Var.f110894t);
        }
        if (ft0Var.f110868g) {
            return;
        }
        a(map, "age", ft0Var.f110905y0);
        a(map, "gender", ft0Var.f110907z0);
        a(map, "context_query", ft0Var.T);
        a(map, "context_taglist", ft0Var.U);
        a(map, "google_aid", ft0Var.O);
        a(map, "huawei_oaid", ft0Var.Q);
        a(map, "mauid", ft0Var.f110878l);
        a(map, this.f112450a.a(), ft0Var.f110889q0);
        a(map, "mcc", ft0Var.E);
        a(map, "mnc", ft0Var.F);
        a(map, "cellid", ft0Var.J);
        a(map, "lac", ft0Var.K);
        a(map, X3.f42018b, ft0Var.L);
        a(map, "battery_charge", ft0Var.R);
        a(map, "server_side_client_ip", ft0Var.L0);
        a(map, "ipv6", ft0Var.M0);
    }

    public final void b(Map map, ft0 ft0Var) {
        Location location;
        if (ft0Var.f110856a) {
            return;
        }
        e9 e9Var = ft0Var.I;
        if (e9Var == null || (location = e9Var.f110257f) == null) {
            location = ft0Var.A;
        }
        if (location != null) {
            Object obj = vt2.f117186j;
            if (ut2.a().a()) {
                a(map, N6.f41419s, String.valueOf(location.getLatitude()));
                a(map, "lon", String.valueOf(location.getLongitude()));
                a(map, "location_timestamp", String.valueOf(location.getTime()));
                a(map, "precision", String.valueOf((int) location.getAccuracy()));
            }
        }
    }

    public final String toString() {
        return (String) this.f112454e.getValue();
    }

    public final void a(Map map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public final void a(Map map, String str, Object obj) {
        String strEncode;
        if (obj != null) {
            String strEncode2 = Uri.encode(str);
            if (!this.f112451b.f114699a.contains(str)) {
                strEncode = Uri.encode(obj.toString());
            } else {
                strEncode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            map.put(strEncode2, strEncode);
        }
    }

    public final void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            a(map, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
