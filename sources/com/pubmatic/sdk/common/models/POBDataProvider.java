package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f62368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f62369e;

    public POBDataProvider(@NonNull String str) {
        this(str, null);
    }

    public void addSegment(@NonNull POBSegment pOBSegment) {
        if (pOBSegment == null || POBUtils.isNullOrEmpty(pOBSegment.getSegId())) {
            POBLog.warn("POBDataProvider", "%s is null or required fields are not available", "segments");
            return;
        }
        String segId = pOBSegment.getSegId();
        if (this.f62368d.containsKey(segId)) {
            POBLog.warn("POBDataProvider", "%s with duplicate %s not allowed", "segments", "id");
        } else {
            this.f62368d.put(segId, pOBSegment);
        }
    }

    @Nullable
    public JSONObject getExt() {
        return this.f62369e;
    }

    @Nullable
    public String getId() {
        return this.f62365a;
    }

    @NonNull
    public String getName() {
        return this.f62366b;
    }

    public int getSegTax() {
        return this.f62367c;
    }

    @Nullable
    public POBSegment getSegment(@NonNull String str) {
        return (POBSegment) this.f62368d.get(str);
    }

    @NonNull
    public Map<String, POBSegment> getSegments() {
        return this.f62368d;
    }

    public void removeAllSegments() {
        this.f62368d.clear();
    }

    @Nullable
    public POBSegment removeSegment(@NonNull String str) {
        return (POBSegment) this.f62368d.remove(str);
    }

    public void setExt(@NonNull JSONObject jSONObject) {
        this.f62369e = jSONObject;
    }

    public void setSegTax(int i10) {
        this.f62367c = i10;
    }

    public POBDataProvider(@NonNull String str, @Nullable String str2) {
        this.f62365a = str2;
        this.f62366b = str;
        this.f62367c = 0;
        this.f62368d = DesugarCollections.synchronizedMap(new HashMap());
    }
}
