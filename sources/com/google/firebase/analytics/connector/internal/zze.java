package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class zze implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f31750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AnalyticsConnector.AnalyticsConnectorListener f31751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppMeasurementSdk f31752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzd f31753d;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f31751b = analyticsConnectorListener;
        this.f31752c = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.f31753d = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.f31750a = new HashSet();
    }

    final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener a() {
        return this.f31751b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f31751b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
        Set set2 = this.f31750a;
        set2.clear();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i10 = zzc.zza;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (iCodePointAt2 == 95 || Character.isLetterOrDigit(iCodePointAt2)) {
                            iCharCount += Character.charCount(iCodePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int iCodePointAt3 = str.codePointAt(0);
                        if (Character.isLetter(iCodePointAt3)) {
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt3);
                            while (true) {
                                if (iCharCount2 >= length2) {
                                    String strZzb = zzjm.zzb(str);
                                    if (strZzb != null) {
                                        str = strZzb;
                                    }
                                    Preconditions.checkNotNull(str);
                                    hashSet.add(str);
                                } else {
                                    int iCodePointAt4 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt4 == 95 || Character.isLetterOrDigit(iCodePointAt4)) {
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.f31750a.clear();
    }
}
