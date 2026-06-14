package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes12.dex */
public final class PlatformData {

    @Nullable
    private static volatile PlatformData instance;

    @NonNull
    private final Context context;

    @Nullable
    final String kotlinVersion = getKotlinVersion();

    @Nullable
    private Integer minSdkVersion;

    private PlatformData(@NonNull Context context) {
        this.context = context.getApplicationContext();
    }

    @NonNull
    public static PlatformData get(@NonNull Context context) {
        PlatformData platformData;
        PlatformData platformData2 = instance;
        if (platformData2 != null) {
            return platformData2;
        }
        synchronized (PlatformData.class) {
            try {
                platformData = instance;
                if (platformData == null) {
                    platformData = new PlatformData(context);
                    instance = platformData;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformData;
    }

    @Nullable
    private String getKotlinVersion() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    @RequiresApi(api = 24)
    private Integer getMinSdkVersionFromApplicationInfo(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    private Integer getMinSdkVersionFromManifest(@NonNull Context context) {
        Integer numValueOf = null;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = xmlResourceParserOpenXmlResourceParser.getEventType(); eventType != 1; eventType = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (eventType == 2) {
                        if ("uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= xmlResourceParserOpenXmlResourceParser.getAttributeCount()) {
                                    break;
                                }
                                if ("minSdkVersion".equals(xmlResourceParserOpenXmlResourceParser.getAttributeName(i10))) {
                                    numValueOf = Integer.valueOf(Integer.parseInt(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10)));
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
                xmlResourceParserOpenXmlResourceParser.close();
                return numValueOf;
            } finally {
            }
        } catch (Exception unused) {
            return numValueOf;
        }
    }

    @Nullable
    Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.minSdkVersion = getMinSdkVersionFromApplicationInfo(this.context);
        }
        if (this.minSdkVersion == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }
}
