package com.moloco.sdk.internal.services.bidtoken;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidToken;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.internal.services.n;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f55470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.f f55471c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f55473b;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.services.h.values().length];
            try {
                iArr[com.moloco.sdk.internal.services.h.f55589b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.h.f55590c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.h.f55591d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55472a = iArr;
            int[] iArr2 = new int[j0.values().length];
            try {
                iArr2[j0.f55696b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j0.f55697c.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[j0.f55698d.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f55473b = iArr2;
        }
    }

    public t(i0 deviceInfoService, com.moloco.sdk.internal.services.f screenInfoService) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.f55470b = deviceInfoService;
        this.f55471c = screenInfoService;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.s
    public byte[] a(byte[] bidTokenComponents, byte[] secret) {
        Intrinsics.checkNotNullParameter(bidTokenComponents, "bidTokenComponents");
        Intrinsics.checkNotNullParameter(secret, "secret");
        BidToken$ClientBidToken.a aVarNewBuilder = BidToken$ClientBidToken.newBuilder();
        aVarNewBuilder.a(ByteString.copyFrom(secret));
        aVarNewBuilder.b(ByteString.copyFrom(bidTokenComponents));
        byte[] byteArray = ((BidToken$ClientBidToken) aVarNewBuilder.build()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final long b(long j10) {
        return j10 * ((long) 1000000);
    }

    public final BidToken$ClientBidTokenComponents.AudioInfo.b c(j0 j0Var) {
        int i10 = a.f55473b[j0Var.ordinal()];
        if (i10 == 1) {
            return BidToken$ClientBidTokenComponents.AudioInfo.b.SILENT;
        }
        if (i10 == 2) {
            return BidToken$ClientBidTokenComponents.AudioInfo.b.VIBRATE;
        }
        if (i10 == 3) {
            return BidToken$ClientBidTokenComponents.AudioInfo.b.NORMAL;
        }
        throw new lf.m();
    }

    public final BidToken$ClientBidTokenComponents.Device.b d(com.moloco.sdk.internal.services.h hVar) {
        int i10 = a.f55472a[hVar.ordinal()];
        if (i10 == 1) {
            return BidToken$ClientBidTokenComponents.Device.b.UNKNOWN;
        }
        if (i10 == 2) {
            return BidToken$ClientBidTokenComponents.Device.b.PORTRAIT;
        }
        if (i10 == 3) {
            return BidToken$ClientBidTokenComponents.Device.b.LANDSCAPE;
        }
        throw new lf.m();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.s
    public BidToken$ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k clientSignals, i bidTokenConfig) {
        BidToken$ClientBidTokenComponents.BatteryInfo.a aVar;
        BidToken$ClientBidTokenComponents.NetworkInfo.b bVar;
        Intrinsics.checkNotNullParameter(clientSignals, "clientSignals");
        Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        h0 h0VarB = this.f55470b.b();
        com.moloco.sdk.internal.services.e eVarA = this.f55471c.a();
        BidToken$ClientBidTokenComponents.a aVarNewBuilder = BidToken$ClientBidTokenComponents.newBuilder();
        BidToken$ClientBidTokenComponents.SdkInfo.a aVarNewBuilder2 = BidToken$ClientBidTokenComponents.SdkInfo.newBuilder();
        aVarNewBuilder2.a(clientSignals.k());
        aVarNewBuilder.h((BidToken$ClientBidTokenComponents.SdkInfo) aVarNewBuilder2.build());
        BidToken$ClientBidTokenComponents.MemoryInfo.a aVarNewBuilder3 = BidToken$ClientBidTokenComponents.MemoryInfo.newBuilder();
        Boolean boolA = clientSignals.h().a();
        if (boolA != null) {
            aVarNewBuilder3.a(boolA.booleanValue());
        }
        Long lB = clientSignals.h().b();
        if (lB != null) {
            aVarNewBuilder3.b(lB.longValue());
        }
        Long lC = clientSignals.h().c();
        if (lC != null) {
            aVarNewBuilder3.d(lC.longValue());
        }
        aVarNewBuilder.i((BidToken$ClientBidTokenComponents.MemoryInfo) aVarNewBuilder3.build());
        BidToken$ClientBidTokenComponents.DirInfo.a aVarNewBuilder4 = BidToken$ClientBidTokenComponents.DirInfo.newBuilder();
        Long lA = clientSignals.c().a();
        if (lA != null) {
            aVarNewBuilder4.b(lA.longValue());
        }
        aVarNewBuilder.f((BidToken$ClientBidTokenComponents.DirInfo) aVarNewBuilder4.build());
        BidToken$ClientBidTokenComponents.NetworkInfo.a aVarNewBuilder5 = BidToken$ClientBidTokenComponents.NetworkInfo.newBuilder();
        if (clientSignals.i().a() != null) {
            aVarNewBuilder5.a(clientSignals.i().a().intValue());
        }
        Integer numB = clientSignals.i().b();
        if (numB != null) {
            aVarNewBuilder5.b(numB.intValue());
        }
        Boolean boolC = clientSignals.i().c();
        if (boolC != null) {
            aVarNewBuilder5.c(boolC.booleanValue());
        }
        com.moloco.sdk.internal.services.a aVarD = clientSignals.i().d();
        if (aVarD != null) {
            if (aVarD instanceof a.C0679a) {
                bVar = BidToken$ClientBidTokenComponents.NetworkInfo.b.CELLULAR;
            } else if (Intrinsics.areEqual(aVarD, a.b.f55273a)) {
                bVar = BidToken$ClientBidTokenComponents.NetworkInfo.b.NO_NETWORK;
            } else {
                if (!Intrinsics.areEqual(aVarD, a.c.f55274a)) {
                    throw new lf.m();
                }
                bVar = BidToken$ClientBidTokenComponents.NetworkInfo.b.WIFI;
            }
            aVarNewBuilder5.d(bVar);
        }
        aVarNewBuilder.j((BidToken$ClientBidTokenComponents.NetworkInfo) aVarNewBuilder5.build());
        BidToken$ClientBidTokenComponents.BatteryInfo.b bVarNewBuilder = BidToken$ClientBidTokenComponents.BatteryInfo.newBuilder();
        Integer numB2 = clientSignals.e().b();
        if (numB2 != null) {
            bVarNewBuilder.c(numB2.intValue());
        }
        Integer numA = clientSignals.e().a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            if (iIntValue == 2) {
                aVar = BidToken$ClientBidTokenComponents.BatteryInfo.a.CHARGING;
            } else if (iIntValue == 3) {
                aVar = BidToken$ClientBidTokenComponents.BatteryInfo.a.DISCHARGING;
            } else if (iIntValue == 4) {
                aVar = BidToken$ClientBidTokenComponents.BatteryInfo.a.NOT_CHARGING;
            } else if (iIntValue != 5) {
                aVar = BidToken$ClientBidTokenComponents.BatteryInfo.a.UNKNOWN;
            } else {
                aVar = BidToken$ClientBidTokenComponents.BatteryInfo.a.FULL;
            }
            bVarNewBuilder.a(aVar);
        }
        Boolean boolC2 = clientSignals.e().c();
        if (boolC2 != null) {
            bVarNewBuilder.b(boolC2.booleanValue());
        }
        aVarNewBuilder.d((BidToken$ClientBidTokenComponents.BatteryInfo) bVarNewBuilder.build());
        BidToken$ClientBidTokenComponents.AdvertisingInfo.a aVarNewBuilder6 = BidToken$ClientBidTokenComponents.AdvertisingInfo.newBuilder();
        com.moloco.sdk.internal.services.n nVarB = clientSignals.b();
        if (nVarB instanceof n.a) {
            aVarNewBuilder6.a(false);
            aVarNewBuilder6.b(((n.a) nVarB).a());
        } else if (Intrinsics.areEqual(nVarB, n.b.f55706a)) {
            aVarNewBuilder6.a(true);
        } else {
            throw new lf.m();
        }
        aVarNewBuilder.b((BidToken$ClientBidTokenComponents.AdvertisingInfo) aVarNewBuilder6.build());
        BidToken$ClientBidTokenComponents.Privacy.a aVarNewBuilder7 = BidToken$ClientBidTokenComponents.Privacy.newBuilder();
        Boolean isAgeRestrictedUser = clientSignals.j().getIsAgeRestrictedUser();
        if (isAgeRestrictedUser != null) {
            aVarNewBuilder7.b(isAgeRestrictedUser.booleanValue());
        }
        Boolean isUserConsent = clientSignals.j().getIsUserConsent();
        if (isUserConsent != null) {
            aVarNewBuilder7.c(isUserConsent.booleanValue());
        }
        Boolean isDoNotSell = clientSignals.j().getIsDoNotSell();
        if (isDoNotSell != null) {
            aVarNewBuilder7.a(isDoNotSell.booleanValue());
        }
        String tCFConsent = clientSignals.j().getTCFConsent();
        if (tCFConsent != null) {
            aVarNewBuilder7.d(tCFConsent);
        }
        aVarNewBuilder7.e(clientSignals.j().get_usPrivacy());
        aVarNewBuilder.k((BidToken$ClientBidTokenComponents.Privacy) aVarNewBuilder7.build());
        BidToken$ClientBidTokenComponents.Device.a aVarNewBuilder8 = BidToken$ClientBidTokenComponents.Device.newBuilder();
        aVarNewBuilder8.n(h0VarB.e());
        aVarNewBuilder8.t(h0VarB.j());
        aVarNewBuilder8.p(h0VarB.f());
        aVarNewBuilder8.q(h0VarB.h());
        aVarNewBuilder8.j(h0VarB.d());
        aVarNewBuilder8.b(h0VarB.g());
        aVarNewBuilder8.e(h0VarB.l() ? 5 : 1);
        aVarNewBuilder8.k(1);
        BidToken$ClientBidTokenComponents.Geo.a aVarNewBuilder9 = BidToken$ClientBidTokenComponents.Geo.newBuilder();
        aVarNewBuilder9.a(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
        aVarNewBuilder8.f((BidToken$ClientBidTokenComponents.Geo) aVarNewBuilder9.build());
        aVarNewBuilder8.w(eVarA.f());
        aVarNewBuilder8.g(eVarA.d());
        aVarNewBuilder8.v(eVarA.a());
        aVarNewBuilder8.u(eVarA.b());
        aVarNewBuilder8.s(h0VarB.i());
        if (bidTokenConfig.a()) {
            aVarNewBuilder8.d(b(h0VarB.b()));
        }
        com.moloco.sdk.internal.services.h hVarC = clientSignals.f().c();
        if (hVarC != null) {
            aVarNewBuilder8.r(d(hVarC));
        }
        Boolean boolA2 = this.f55470b.a();
        if (boolA2 != null) {
            aVarNewBuilder8.i(boolA2.booleanValue());
        }
        String strA = clientSignals.f().a();
        if (strA != null) {
            aVarNewBuilder8.l(strA);
        }
        String strB = clientSignals.f().b();
        if (strB != null) {
            aVarNewBuilder8.o(strB);
        }
        aVarNewBuilder8.x(eVarA.g());
        aVarNewBuilder8.y(eVarA.h());
        aVarNewBuilder8.h(h0VarB.c());
        aVarNewBuilder8.a(h0VarB.a());
        aVarNewBuilder.e((BidToken$ClientBidTokenComponents.Device) aVarNewBuilder8.build());
        BidToken$ClientBidTokenComponents.AudioInfo.a aVarNewBuilder10 = BidToken$ClientBidTokenComponents.AudioInfo.newBuilder();
        j0 j0VarB = clientSignals.d().b();
        if (j0VarB != null) {
            aVarNewBuilder10.a(c(j0VarB));
        }
        Integer numA2 = clientSignals.d().a();
        if (numA2 != null) {
            aVarNewBuilder10.b(numA2.intValue());
        }
        aVarNewBuilder.c((BidToken$ClientBidTokenComponents.AudioInfo) aVarNewBuilder10.build());
        BidToken$ClientBidTokenComponents.AccessibilityInfo.a aVarNewBuilder11 = BidToken$ClientBidTokenComponents.AccessibilityInfo.newBuilder();
        Float fC = clientSignals.a().c();
        if (fC != null) {
            aVarNewBuilder11.c(fC.floatValue());
        }
        Boolean boolB = clientSignals.a().b();
        if (boolB != null) {
            aVarNewBuilder11.b(boolB.booleanValue());
        }
        Boolean boolA3 = clientSignals.a().a();
        if (boolA3 != null) {
            aVarNewBuilder11.a(boolA3.booleanValue());
        }
        Boolean boolD = clientSignals.a().d();
        if (boolD != null) {
            aVarNewBuilder11.d(boolD.booleanValue());
        }
        aVarNewBuilder.a((BidToken$ClientBidTokenComponents.AccessibilityInfo) aVarNewBuilder11.build());
        if (clientSignals.g().i()) {
            BidToken$ClientBidTokenComponents.ImpLvlRevData.a aVarNewBuilder12 = BidToken$ClientBidTokenComponents.ImpLvlRevData.newBuilder();
            aVarNewBuilder12.c(clientSignals.g().g());
            aVarNewBuilder12.b(clientSignals.g().c());
            aVarNewBuilder12.d(clientSignals.g().h());
            BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts.a aVarNewBuilder13 = BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts.newBuilder();
            aVarNewBuilder13.a(clientSignals.g().a());
            aVarNewBuilder13.c(clientSignals.g().d());
            aVarNewBuilder13.d(clientSignals.g().e());
            aVarNewBuilder13.b(clientSignals.g().b());
            aVarNewBuilder13.e(clientSignals.g().f());
            aVarNewBuilder12.a((BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts) aVarNewBuilder13.build());
            aVarNewBuilder.g((BidToken$ClientBidTokenComponents.ImpLvlRevData) aVarNewBuilder12.build());
        }
        GeneratedMessageLite generatedMessageLiteBuild = aVarNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (BidToken$ClientBidTokenComponents) generatedMessageLiteBuild;
    }
}
