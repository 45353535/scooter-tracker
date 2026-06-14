package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/analytics/ConsentBuilder;", "", "<init>", "()V", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "getAdStorage", "()Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "setAdStorage", "(Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;)V", "analyticsStorage", "getAnalyticsStorage", "setAnalyticsStorage", "adUserData", "getAdUserData", "setAdUserData", "adPersonalization", "getAdPersonalization", "setAdPersonalization", "asMap", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentType;", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FirebaseAnalytics.ConsentStatus f31727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FirebaseAnalytics.ConsentStatus f31728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FirebaseAnalytics.ConsentStatus f31729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FirebaseAnalytics.ConsentStatus f31730d;

    @NotNull
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.f31727a;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.f31728b;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        FirebaseAnalytics.ConsentStatus consentStatus3 = this.f31729c;
        if (consentStatus3 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus3);
        }
        FirebaseAnalytics.ConsentStatus consentStatus4 = this.f31730d;
        if (consentStatus4 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus4);
        }
        return linkedHashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: getAdPersonalization, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getF31730d() {
        return this.f31730d;
    }

    @Nullable
    /* JADX INFO: renamed from: getAdStorage, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getF31727a() {
        return this.f31727a;
    }

    @Nullable
    /* JADX INFO: renamed from: getAdUserData, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getF31729c() {
        return this.f31729c;
    }

    @Nullable
    /* JADX INFO: renamed from: getAnalyticsStorage, reason: from getter */
    public final FirebaseAnalytics.ConsentStatus getF31728b() {
        return this.f31728b;
    }

    public final void setAdPersonalization(@org.jetbrains.annotations.Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f31730d = consentStatus;
    }

    public final void setAdStorage(@org.jetbrains.annotations.Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f31727a = consentStatus;
    }

    public final void setAdUserData(@org.jetbrains.annotations.Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f31729c = consentStatus;
    }

    public final void setAnalyticsStorage(@org.jetbrains.annotations.Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f31728b = consentStatus;
    }
}
