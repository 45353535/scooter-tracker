package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8357a;

    public m(JSONObject jSONObject) {
        this.f8357a = jSONObject;
    }

    Integer a() {
        String string = JsonUtils.getString(this.f8357a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f8357a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    Boolean c() {
        return JsonUtils.getBoolean(this.f8357a, "geolocation_enabled", null);
    }

    Boolean d() {
        return JsonUtils.getBoolean(this.f8357a, "allow_content_access", null);
    }

    Boolean e() {
        return JsonUtils.getBoolean(this.f8357a, "allow_file_access", null);
    }

    Boolean f() {
        return JsonUtils.getBoolean(this.f8357a, "allow_file_access_from_file_urls", null);
    }

    Boolean g() {
        return JsonUtils.getBoolean(this.f8357a, "allow_universal_access_from_file_urls", null);
    }

    Boolean h() {
        return JsonUtils.getBoolean(this.f8357a, "display_zoom_controls", null);
    }

    Boolean i() {
        return JsonUtils.getBoolean(this.f8357a, "load_with_overview_mode", null);
    }

    Boolean j() {
        return JsonUtils.getBoolean(this.f8357a, "need_initial_focus", null);
    }

    Boolean k() {
        return JsonUtils.getBoolean(this.f8357a, "offscreen_pre_raster", null);
    }

    Boolean l() {
        return JsonUtils.getBoolean(this.f8357a, "save_form_data", null);
    }

    Boolean m() {
        return JsonUtils.getBoolean(this.f8357a, "algorithmic_darkening_allowed", null);
    }

    Boolean n() {
        return JsonUtils.getBoolean(this.f8357a, "block_network_image", null);
    }

    Boolean o() {
        return JsonUtils.getBoolean(this.f8357a, "loads_images_automatically", null);
    }

    Boolean p() {
        return JsonUtils.getBoolean(this.f8357a, "use_built_in_zoom_controls", null);
    }

    Boolean q() {
        return JsonUtils.getBoolean(this.f8357a, "use_wide_view_port", null);
    }
}
