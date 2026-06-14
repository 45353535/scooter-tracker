package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AbtExperimentInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f31711g = {RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final DateFormat f31712h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f31716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31718f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f31713a = str;
        this.f31714b = str2;
        this.f31715c = str3;
        this.f31716d = date;
        this.f31717e = j10;
        this.f31718f = j11;
    }

    static AbtExperimentInfo a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.triggerEventName;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.name, String.valueOf(conditionalUserProperty.value), str, new Date(conditionalUserProperty.creationTimestamp), conditionalUserProperty.triggerTimeout, conditionalUserProperty.timeToLive);
    }

    static AbtExperimentInfo b(Map map) throws AbtException {
        i(map);
        try {
            return new AbtExperimentInfo((String) map.get(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f31712h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    static void h(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        i(abtExperimentInfo.g());
    }

    private static void i(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f31711g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f31713a;
    }

    long d() {
        return this.f31716d.getTime();
    }

    String e() {
        return this.f31714b;
    }

    AnalyticsConnector.ConditionalUserProperty f(String str) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = str;
        conditionalUserProperty.creationTimestamp = d();
        conditionalUserProperty.name = this.f31713a;
        conditionalUserProperty.value = this.f31714b;
        conditionalUserProperty.triggerEventName = TextUtils.isEmpty(this.f31715c) ? null : this.f31715c;
        conditionalUserProperty.triggerTimeout = this.f31717e;
        conditionalUserProperty.timeToLive = this.f31718f;
        return conditionalUserProperty;
    }

    Map g() {
        HashMap map = new HashMap();
        map.put(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, this.f31713a);
        map.put("variantId", this.f31714b);
        map.put("triggerEvent", this.f31715c);
        map.put("experimentStartTime", f31712h.format(this.f31716d));
        map.put("triggerTimeoutMillis", Long.toString(this.f31717e));
        map.put("timeToLiveMillis", Long.toString(this.f31718f));
        return map;
    }
}
