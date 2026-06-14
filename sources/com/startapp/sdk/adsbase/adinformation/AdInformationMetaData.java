package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class AdInformationMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AdInformationMetaData f63962a = new AdInformationMetaData();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f63963b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;

    @TypeInfo(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.createAdInformationConfig();
    private String adInformationMetadataUpdateVersion = "5.2.4";

    @VisibleForTesting
    public AdInformationMetaData() {
    }

    public static AdInformationMetaData c() {
        return f63962a;
    }

    public final AdInformationConfig a() {
        return this.AdInformation;
    }

    public final String b() {
        return this.AdInformation.getEulaUrl();
    }

    public final String d() {
        return this.AdInformation.getPrivacyIconImageUrl();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
            if (vi.a((Object) this.AdInformation, (Object) adInformationMetaData.AdInformation) && vi.a((Object) this.adInformationMetadataUpdateVersion, (Object) adInformationMetaData.adInformationMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) g7.c(context, "StartappAdInfoMetadata");
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean zA = vi.a((Serializable) adInformationMetaData, (Serializable) adInformationMetaData2);
            if ("5.2.4".equals(adInformationMetaData.adInformationMetadataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f64610e);
                g9Var.f64553d = "metadata_null";
                g9Var.a();
            }
            adInformationMetaData.AdInformation.initTransientFields();
            f63962a = adInformationMetaData;
        } else {
            f63962a = adInformationMetaData2;
        }
        f63962a.AdInformation.initImageResourceConfigBitmaps(context);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f63963b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "5.2.4";
            f63962a = adInformationMetaData;
            AdInformationConfig.setDefaultValues(f63962a.AdInformation);
            f63962a.AdInformation.initImageResourceConfigBitmaps(context);
            g7.a(context, "StartappAdInfoMetadata", adInformationMetaData);
        }
    }
}
