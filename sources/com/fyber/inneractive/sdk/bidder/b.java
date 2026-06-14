package com.fyber.inneractive.sdk.bidder;

import android.adservices.topics.EncryptedTopic;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f20172h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f20173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f20174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f20176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f20177e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20178f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20179g = new Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.f20174b = cVar;
        d dVar = new d(cVar);
        this.f20175c = dVar;
        this.f20173a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.f20318x.f20513d = this;
        if (iAConfigManager.f20315u.f20484b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.f20319y;
            s1Var.b();
            if (!s1Var.f23906d.get()) {
                s1Var.c();
            }
            dVar.f20182b = iAConfigManager.f20319y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.N) != null) {
            try {
                aVar.f20329c.add(this);
            } catch (Throwable th2) {
                IAlog.a("failed to add network observer", th2, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.f20176d = fVar;
        fVar.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final byte[] a() {
        JSONArray jSONArrayA;
        int i10;
        int i11;
        r0 r0Var;
        l0 l0Var;
        String str;
        int i12 = 3;
        int i13 = 4;
        k kVar = this.f20173a;
        kVar.f23575b = (z0) kVar.f23575b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.f20173a;
        this.f20175c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA = h.a(POBCoreNativeConstants.NATIVE_DEFAULT_VERSION);
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.f23575b).setVersion(nullableStringA);
        if (this.f20177e.get() != null) {
            this.f20175c.a();
        }
        k kVar3 = this.f20173a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA2 = h.a(this.f20175c.f20182b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setUserAgent(nullableStringA2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA3 = h.a(this.f20175c.f20183c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setSdkVersion(nullableStringA3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA4 = h.a(this.f20175c.f20184d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setBundleID(nullableStringA4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA5 = h.a(this.f20175c.f20185e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceModel(nullableStringA5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA6 = h.a(this.f20175c.f20186f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setAppVersion(nullableStringA6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA7 = h.a("Android");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceOS(nullableStringA7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A = h.a(Build.VERSION.SDK_INT);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceApi(nullableUInt32A);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA8 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setOsVersion(nullableStringA8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA9 = h.a(this.f20175c.f20187g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceLanguage(nullableStringA9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA10 = h.a(this.f20175c.f20188h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setCountryCode(nullableStringA10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA11 = h.a(this.f20175c.f20189i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setCarrierName(nullableStringA11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA12 = h.a(this.f20175c.f20190j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setMobileCountryCode(nullableStringA12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA13 = h.a(this.f20175c.f20191k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setMobileNetworkCode(nullableStringA13);
        Long l10 = this.f20175c.f20192l;
        x xVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l10 != null) {
            int iIntValue = l10.intValue();
            xVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.f23575b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA14 = h.a(iAConfigManager.D.f20358g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setUserID(nullableStringA14);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A2 = h.a(this.f20175c.f20193m);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceWidth(nullableUInt32A2);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A3 = h.a(this.f20175c.f20194n);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setDeviceHeight(nullableUInt32A3);
        q qVar = this.f20175c.f20195o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA15 = h.a(this.f20175c.f20196p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setInputLanguages(nullableStringA15);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA16 = h.a(this.f20175c.H);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setMediationType(nullableStringA16);
        this.f20175c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f21084p;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA17 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setOdt(nullableStringA17);
        Integer numA = com.fyber.inneractive.sdk.serverapi.b.a();
        z zVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numA != null) {
            int iIntValue2 = numA.intValue();
            zVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.f23575b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f23575b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            k kVar4 = this.f20173a;
            if (gVar.f20355d == null) {
                gVar.f20356e = gVar.h();
            }
            if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
                str = null;
            } else {
                str = gVar.f20355d;
                if (str == null) {
                    str = gVar.f20356e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA18 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f23575b).setGdprString(nullableStringA18);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA = h.a(gVar.d());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f23575b).setGdprConsent(nullableBoolA);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA19 = h.a(com.fyber.inneractive.sdk.util.o.f23888a == null ? null : gVar.f20359h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f23575b).setCcpaString(nullableStringA19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA2 = h.a(com.fyber.inneractive.sdk.util.o.f23888a == null ? null : gVar.f20360i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f23575b).setLgpdConsent(nullableBoolA2);
            Boolean bool = gVar.f20361j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.f20173a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA3 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.f23575b).setCoppaApplies(nullableBoolA3);
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar6 = this.f20173a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f20500a.f20508b;
            boolean z10 = vVar != null ? vVar.f20505b : false;
            kVar6.c();
            ((TokenParametersOuterClass$TokenParameters) kVar6.f23575b).setDnt(z10);
        }
        k kVar7 = this.f20173a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA20 = h.a(this.f20175c.f20197q);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setNetwork(nullableStringA20);
        d0 d0Var = this.f20175c.f20198r;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setSecureContent(d0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA4 = h.a(this.f20175c.B);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setBatteryCharging(nullableBoolA4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA5 = h.a(this.f20175c.f20199s);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setHeadsetPlugged(nullableBoolA5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA6 = h.a(this.f20175c.f20200t);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setBluetoothPlugged(nullableBoolA6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA7 = h.a(this.f20175c.f20201u);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setLowPowerMode(nullableBoolA7);
        boolean z11 = this.f20175c.f20202v;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setDarkMode(z11);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA8 = h.a(this.f20175c.f20203w);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setAirplaneMode(nullableBoolA8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA9 = h.a(this.f20175c.f20204x);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setDndMode(nullableBoolA9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA10 = h.a(this.f20175c.f20205y);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setIsRingMuted(nullableBoolA10);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A4 = h.a(this.f20175c.f20206z);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setSessionDuration(nullableUInt32A4);
        String str2 = this.f20175c.C;
        z zVarNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int i14 = Integer.parseInt(str2);
            zVarNewBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.f23575b).setData(i14);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.a();
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setBatteryLevel(nullableUInt322);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA11 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f20318x.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setPriorSkip(nullableBoolA11);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A5 = h.a(this.f20175c.D);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setUserAge(nullableUInt32A5);
        InneractiveUserConfig.Gender gender = this.f20175c.E;
        n0 n0Var = gender == InneractiveUserConfig.Gender.FEMALE ? n0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? n0.MALE : n0.UNKNOWN;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setUserGender(n0Var);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA21 = h.a(this.f20175c.G);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setZipCode(nullableStringA21);
        boolean z12 = this.f20175c.F;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setMuteAudio(z12);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA12 = h.a(this.f20175c.L);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f23575b).setMediaMuted(nullableBoolA12);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f20500a.f20508b;
        if (vVar2 != null ? vVar2.f20506c : false) {
            k kVar8 = this.f20173a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA22 = h.a(this.f20175c.A);
            kVar8.c();
            ((TokenParametersOuterClass$TokenParameters) kVar8.f23575b).setAmazonId(nullableStringA22);
        } else {
            k kVar9 = this.f20173a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA23 = h.a(this.f20175c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.f23575b).setAaid(nullableStringA23);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i15 = 0;
        while (i15 < length) {
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i15];
            if (unitDisplayType.isDeprecated()) {
                i10 = i12;
                i11 = i13;
            } else {
                int[] iArr = g.f20208a;
                int i16 = iArr[unitDisplayType.ordinal()];
                l0 l0Var2 = i16 != 1 ? i16 != 2 ? i16 != i12 ? i16 != i13 ? i16 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE : l0.MRECT : l0.REWARDED : l0.INTERSTITIAL : l0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f23773a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                String strA = iAConfigManager2.f20318x.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strA) && strA.contains(StringUtils.COMMA)) {
                    strA = strA.split(StringUtils.COMMA)[0];
                }
                if (!TextUtils.isEmpty(strA)) {
                    k kVar10 = this.f20173a;
                    r rVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f23575b).setAdomain(strA);
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f23575b).setType(l0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.a();
                    kVar10.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar10.f23575b).addLastAdomains(lastAdomain);
                }
                String strA2 = iAConfigManager2.f20318x.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strA2)) {
                    k kVar11 = this.f20173a;
                    t tVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f23575b).setLastBundle(strA2);
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f23575b).setType(l0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.a();
                    kVar11.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar11.f23575b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.f20318x.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar12 = this.f20173a;
                    int i17 = iArr[unitDisplayType.ordinal()];
                    if (i17 == 1) {
                        i10 = 3;
                        i11 = 4;
                        l0Var = l0.BANNER;
                    } else if (i17 != 2) {
                        i10 = 3;
                        if (i17 != 3) {
                            i11 = 4;
                            l0Var = i17 != 4 ? i17 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE : l0.MRECT;
                        } else {
                            i11 = 4;
                            l0Var = l0.REWARDED;
                        }
                    } else {
                        i10 = 3;
                        i11 = 4;
                        l0Var = l0.INTERSTITIAL;
                    }
                    kVar12.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar12.f23575b).addPriorClicks(l0Var);
                } else {
                    i10 = 3;
                    i11 = 4;
                }
                a("display", unitDisplayType, l0Var2);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, l0Var2);
                    String strA3 = iAConfigManager2.f20318x.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strA3)) {
                        k kVar13 = this.f20173a;
                        a0 a0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strA3.getClass();
                        int i18 = -1;
                        switch (strA3.hashCode()) {
                            case 49:
                                if (strA3.equals("1")) {
                                    i18 = 0;
                                }
                                break;
                            case 50:
                                if (strA3.equals("2")) {
                                    i18 = 1;
                                }
                                break;
                            case 51:
                                if (strA3.equals("3")) {
                                    i18 = 2;
                                }
                                break;
                            case 52:
                                if (strA3.equals(Protocol.VAST_1_0_WRAPPER)) {
                                    i18 = i10;
                                }
                                break;
                            case 53:
                                if (strA3.equals("5")) {
                                    i18 = i11;
                                }
                                break;
                        }
                        switch (i18) {
                            case 0:
                                r0Var = r0.CTABUTTON;
                                break;
                            case 1:
                                r0Var = r0.COMPANION;
                                break;
                            case 2:
                                r0Var = r0.VIDEOVIEW;
                                break;
                            case 3:
                                r0Var = r0.APPINFO;
                                break;
                            case 4:
                                r0Var = r0.STOREPROMO;
                                break;
                            default:
                                r0Var = r0.NOCLICK;
                                break;
                        }
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f23575b).setClickType(r0Var);
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f23575b).setType(l0Var2);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.a();
                        kVar13.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar13.f23575b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i15++;
            i12 = i10;
            i13 = i11;
        }
        com.fyber.inneractive.sdk.serverapi.c cVar = this.f20174b;
        cVar.getClass();
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        cVar.f23777a = rVarA;
        rVarA.a(false, "");
        com.fyber.inneractive.sdk.config.global.r rVar = this.f20174b.f23777a;
        if (rVar != null) {
            jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f20398b, true);
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        } else {
            jSONArrayA = null;
        }
        if (jSONArrayA != null) {
            for (int i19 = 0; i19 < jSONArrayA.length(); i19++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i19);
                if (jSONObjectOptJSONObject != null) {
                    n nVarNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    nVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f23575b).setIdentifier(strOptString);
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    nVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f23575b).setVariant(strOptString2);
                    k kVar14 = this.f20173a;
                    TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.a();
                    kVar14.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar14.f23575b).addAbExperiments(experiment);
                }
            }
        }
        k kVar15 = this.f20173a;
        int i20 = com.fyber.inneractive.sdk.config.k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.number");
        z zVarNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(property)) {
            int i21 = Integer.parseInt(property);
            zVarNewBuilder3.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.f23575b).setData(i21);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.a();
        kVar15.c();
        ((TokenParametersOuterClass$TokenParameters) kVar15.f23575b).setPortal(nullableUInt323);
        k kVar16 = this.f20173a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA24 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
        kVar16.c();
        ((TokenParametersOuterClass$TokenParameters) kVar16.f23575b).setMockResponseId(nullableStringA24);
        k kVar17 = this.f20173a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA25 = h.a(this.f20175c.I);
        kVar17.c();
        ((TokenParametersOuterClass$TokenParameters) kVar17.f23575b).setIgniteVersion(nullableStringA25);
        k kVar18 = this.f20173a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA26 = h.a(this.f20175c.J);
        kVar18.c();
        ((TokenParametersOuterClass$TokenParameters) kVar18.f23575b).setIgnitePackageName(nullableStringA26);
        if (this.f20175c.K) {
            k kVar19 = this.f20173a;
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA13 = h.a(Boolean.TRUE);
            kVar19.c();
            ((TokenParametersOuterClass$TokenParameters) kVar19.f23575b).setChildMode(nullableBoolA13);
        }
        ArrayList arrayList = this.f20175c.M;
        if (IAConfigManager.c() && arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EncryptedTopic encryptedTopicA = m3.a.a(it.next());
                l lVarNewBuilder = TokenParametersOuterClass$TokenParameters.EncryptedTopic.newBuilder();
                byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
                com.fyber.inneractive.sdk.protobuf.q qVar2 = com.fyber.inneractive.sdk.protobuf.s.f23563b;
                int length2 = encryptedTopic.length;
                com.fyber.inneractive.sdk.protobuf.s.a(0, length2, encryptedTopic.length);
                com.fyber.inneractive.sdk.protobuf.o oVar = com.fyber.inneractive.sdk.protobuf.s.f23564c;
                com.fyber.inneractive.sdk.protobuf.q qVar3 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encryptedTopic, 0, length2));
                lVarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f23575b).setEncryptedTopic(qVar3);
                String keyIdentifier = encryptedTopicA.getKeyIdentifier();
                lVarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f23575b).setKeyIdentifier(keyIdentifier);
                byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
                int length3 = encapsulatedKey.length;
                com.fyber.inneractive.sdk.protobuf.s.a(0, length3, encapsulatedKey.length);
                com.fyber.inneractive.sdk.protobuf.q qVar4 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encapsulatedKey, 0, length3));
                lVarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f23575b).setEncapsulatedKey(qVar4);
                TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic2 = (TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.a();
                k kVar20 = this.f20173a;
                kVar20.c();
                ((TokenParametersOuterClass$TokenParameters) kVar20.f23575b).addEncryptedTopics(encryptedTopic2);
            }
        }
        ArrayList arrayList2 = this.f20175c.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it2.next());
                TokenParametersOuterClass$TokenParameters.Topic.newBuilder();
                throw null;
            }
        }
        return ((TokenParametersOuterClass$TokenParameters) this.f20173a.a()).toByteArray();
    }

    public final void b() {
        if (this.f20178f.compareAndSet(false, true)) {
            try {
                this.f20177e.set(Base64.encodeToString(a(), 2));
            } catch (Throwable th2) {
                IAlog.b("Failed to generate token with error: %s", th2.getMessage());
            }
            this.f20178f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f23888a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z10 = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f20175c.f20204x;
        if (bool == null || bool.booleanValue() != z10) {
            this.f20175c.f20204x = Boolean.valueOf(z10);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new a(this));
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.z0 z0Var) {
        if (TextUtils.equals(this.f20175c.f20197q, z0Var.b())) {
            return;
        }
        this.f20175c.f20197q = z0Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, l0 l0Var) {
        ArrayList<com.fyber.inneractive.sdk.cache.session.g> arrayList;
        int i10;
        j0 j0Var;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.f20318x.f20510a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f20238b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i10 = Integer.parseInt(iAConfigManager.f20315u.f20484b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i10 = 5;
            }
            int i11 = i10 >= 0 ? i10 : 5;
            if (i11 > 0 && arrayList != null && arrayList.size() >= i11) {
                if (str.equals("video")) {
                    j0Var = j0.VIDEO;
                } else if (!str.equals("display")) {
                    j0Var = j0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    j0Var = j0.DISPLAY;
                }
                o0 o0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f23575b).setSubType(j0Var);
                int i12 = 0;
                for (com.fyber.inneractive.sdk.cache.session.g gVar : arrayList) {
                    e0 e0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i13 = gVar.f20244b;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f23575b).setClicks(i13);
                    int i14 = gVar.f20243a;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f23575b).setImpressions(i14);
                    if (str.equals("video") || l0Var.equals(l0.REWARDED)) {
                        int i15 = gVar.f20245c;
                        e0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f23575b).setCompletions(i15);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.a();
                    o0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f23575b).addSessionDataItems(sessionData);
                    i12++;
                    if (i12 >= i11) {
                        break;
                    }
                }
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f23575b).setType(l0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f20173a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.f23575b).addUserSessions(userSession);
        }
    }
}
