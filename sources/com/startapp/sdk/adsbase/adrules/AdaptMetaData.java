package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class AdaptMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final transient AdaptMetaData f64009a = new AdaptMetaData();

    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "5.2.4";

    private AdaptMetaData() {
    }

    public static AdaptMetaData b() {
        return f64009a;
    }

    public final AdRules a() {
        return this.adRules;
    }
}
