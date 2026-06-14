package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y f11499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f11500f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f11501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11504d;

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.f11501a = bundle;
            this.f11504d = null;
            throw th;
        }
        try {
            try {
                String str = applicationInfo.processName;
                this.f11501a = bundle;
                this.f11504d = str;
            } catch (Throwable th3) {
                th = th3;
                this.f11501a = bundle;
                this.f11504d = null;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to get meta data.", e);
            this.f11501a = bundle;
            this.f11504d = null;
        }
        boolean z10 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f11502b = iIntValue;
                            this.f11503c = z10;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f11502b = iIntValue;
            this.f11503c = zBooleanValue;
        } catch (Throwable th5) {
            th = th5;
            iIntValue = 0;
        }
    }

    public static y a(Context context) {
        y yVar;
        synchronized (f11500f) {
            try {
                if (f11499e == null) {
                    f11499e = new y(context);
                }
                yVar = f11499e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f11501a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f11501a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f11504d;
    }
}
