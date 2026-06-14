package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBUserInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Gender f62418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f62424h = DesugarCollections.synchronizedMap(new HashMap());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f62426a;

        Gender(String str) {
            this.f62426a = str;
        }

        public String getValue() {
            return this.f62426a;
        }
    }

    public void addDataProvider(@NonNull POBDataProvider pOBDataProvider) {
        if (pOBDataProvider == null || POBUtils.isNullOrEmpty(pOBDataProvider.getName()) || pOBDataProvider.getSegments().isEmpty()) {
            POBLog.warn("POBUserInfo", "%s is null or required fields are not available", "Data Provider");
            return;
        }
        String name = pOBDataProvider.getName();
        if (this.f62424h.containsKey(name)) {
            POBLog.warn("POBUserInfo", "%s with duplicate %s not allowed", "Data Provider", "provider name");
        } else {
            this.f62424h.put(name, pOBDataProvider);
        }
    }

    public int getBirthYear() {
        return this.f62417a;
    }

    @Nullable
    public String getCity() {
        return this.f62419c;
    }

    @Nullable
    public POBDataProvider getDataProvider(@NonNull String str) {
        return (POBDataProvider) this.f62424h.get(str);
    }

    @NonNull
    public List<POBDataProvider> getDataProviders() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f62424h.entrySet()) {
            if (entry != null) {
                arrayList.add((POBDataProvider) entry.getValue());
            }
        }
        return arrayList;
    }

    @Nullable
    public Gender getGender() {
        return this.f62418b;
    }

    @Nullable
    public String getKeywords() {
        return this.f62423g;
    }

    @Nullable
    public String getMetro() {
        return this.f62420d;
    }

    @Nullable
    public String getRegion() {
        return this.f62422f;
    }

    @Nullable
    public String getZip() {
        return this.f62421e;
    }

    public void removeAllDataProviders() {
        this.f62424h.clear();
    }

    @Nullable
    public POBDataProvider removeDataProvider(@NonNull String str) {
        return (POBDataProvider) this.f62424h.remove(str);
    }

    public void setBirthYear(int i10) {
        if (i10 > 0) {
            this.f62417a = i10;
        }
    }

    public void setCity(@NonNull String str) {
        this.f62419c = str;
    }

    public void setGender(@NonNull Gender gender) {
        this.f62418b = gender;
    }

    public void setKeywords(String str) {
        this.f62423g = str;
    }

    public void setMetro(@NonNull String str) {
        this.f62420d = str;
    }

    public void setRegion(@NonNull String str) {
        this.f62422f = str;
    }

    public void setZip(@NonNull String str) {
        this.f62421e = str;
    }
}
