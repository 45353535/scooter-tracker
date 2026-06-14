package com.applovin.impl.sdk;

import android.graphics.Color;
import androidx.annotation.Nullable;
import com.applovin.impl.e4;
import com.applovin.impl.f4;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AppLovinAdBase implements e4 {

    @Nullable
    protected final JSONObject adObject;
    private final long createdAtMillis;

    @Nullable
    protected final JSONObject fullResponse;
    protected final k sdk;

    @Nullable
    protected final h5 synchronizedAdObject;

    @Nullable
    protected final h5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.synchronizedAdObject = new h5(jSONObject);
            this.synchronizedFullResponse = new h5(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    protected boolean containsKeyForAdObject(String str) {
        boolean zHas;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ f4 getAdEventTracker();

    public abstract long getAdIdNumber();

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean zBooleanValue;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            zBooleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z10) {
        boolean zBooleanValue;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, Boolean.valueOf(z10)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            zBooleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z10)).booleanValue();
        }
        return zBooleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    protected int getColorFromAdObject(String str, int i10) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i10;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    protected float getFloatFromAdObject(String str, float f10) {
        float f11;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, f10);
        }
        synchronized (this.adObjectLock) {
            f11 = JsonUtils.getFloat(this.adObject, str, f10);
        }
        return f11;
    }

    protected int getIntFromAdObject(String str, int i10) {
        int i11;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, i10);
        }
        synchronized (this.adObjectLock) {
            i11 = JsonUtils.getInt(this.adObject, str, i10);
        }
        return i11;
    }

    protected List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(String str, long j10) {
        long j11;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.adObjectLock) {
            j11 = JsonUtils.getLong(this.adObject, str, j10);
        }
        return j11;
    }

    protected long getLongFromFullResponse(String str, long j10) {
        long j11;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, j10);
        }
        synchronized (this.fullResponseLock) {
            j11 = JsonUtils.getLong(this.fullResponse, str, j10);
        }
        return j11;
    }

    @Override // com.applovin.impl.e4
    @Nullable
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public k getSdk() {
        return this.sdk;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected String getStringFromFullResponse(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    protected List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
