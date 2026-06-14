package r2;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.core.os.g;
import androidx.privacysandbox.ads.adservices.customaudience.q;
import androidx.privacysandbox.ads.adservices.customaudience.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.s;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f99213a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99214b = "Fledge: " + e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f99215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f99216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static CustomAudienceManager f99217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p2.a f99218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f99219g;

    public static final class a implements OutcomeReceiver {
        a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e(e.b(), error.toString());
            p2.a aVarA = e.a();
            if (aVarA == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                aVarA = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            Unit unit = Unit.f93236a;
            aVarA.b("gps_pa_failed", bundle);
        }

        public void onResult(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.i(e.b(), "Successfully joined custom audience");
            p2.a aVarA = e.a();
            if (aVarA == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                aVarA = null;
            }
            aVarA.b("gps_pa_succeed", null);
        }
    }

    private e() {
    }

    public static final /* synthetic */ p2.a a() {
        if (e3.a.d(e.class)) {
            return null;
        }
        try {
            return f99218f;
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        if (e3.a.d(e.class)) {
            return null;
        }
        try {
            return f99214b;
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return null;
        }
    }

    public static final void c() {
        String string;
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            f99216d = true;
            Context contextM = s.m();
            f99218f = new p2.a(contextM);
            f99219g = "https://www." + s.u() + "/privacy_sandbox/pa/logic";
            p2.a aVar = null;
            try {
                try {
                    CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextM);
                    f99217e = customAudienceManager;
                    if (customAudienceManager != null) {
                        f99215c = true;
                    }
                    string = null;
                } catch (Error e10) {
                    string = e10.toString();
                    Log.w(f99214b, "Failed to get CustomAudienceManager: " + e10);
                }
            } catch (Exception e11) {
                string = e11.toString();
                Log.w(f99214b, "Failed to get CustomAudienceManager: " + e11);
            }
            if (f99215c) {
                return;
            }
            p2.a aVar2 = f99218f;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                aVar = aVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.f93236a;
            aVar.b("gps_pa_failed", bundle);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    private final void f(String str, String str2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            String strG = g(str, str2);
            if (strG == null) {
                return;
            }
            p2.a aVar = null;
            try {
                OutcomeReceiver outcomeReceiverA = g.a(new a());
                r2.a.a();
                AdData.Builder builderA = androidx.privacysandbox.ads.adservices.common.g.a();
                StringBuilder sb2 = new StringBuilder();
                String str3 = f99219g;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str3 = null;
                }
                sb2.append(str3);
                sb2.append("/ad");
                Uri uri = Uri.parse(sb2.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
                AdData adDataBuild = builderA.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …\n                .build()");
                b.a();
                TrustedBiddingData.Builder builderA2 = q.a();
                StringBuilder sb3 = new StringBuilder();
                String str4 = f99219g;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str4 = null;
                }
                sb3.append(str4);
                sb3.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb3.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.parse(this)");
                TrustedBiddingData trustedBiddingDataBuild = builderA2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(CollectionsKt.listOf("")).build();
                Intrinsics.checkNotNullExpressionValue(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                c.a();
                CustomAudience.Builder buyer = androidx.privacysandbox.ads.adservices.customaudience.s.a().setName(strG).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb4 = new StringBuilder();
                String str5 = f99219g;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str5 = null;
                }
                sb4.append(str5);
                sb4.append("?daily&app_id=");
                sb4.append(str);
                Uri uri3 = Uri.parse(sb4.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri3, "Uri.parse(this)");
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb5 = new StringBuilder();
                String str6 = f99219g;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str6 = null;
                }
                sb5.append(str6);
                sb5.append("?bidding");
                Uri uri4 = Uri.parse(sb5.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri4, "Uri.parse(this)");
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(JsonUtils.EMPTY_JSON)).setAds(CollectionsKt.listOf(adDataBuild)).build();
                Intrinsics.checkNotNullExpressionValue(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                d.a();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = r.a().setCustomAudience(customAudienceBuild).build();
                Intrinsics.checkNotNullExpressionValue(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager = f99217e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiverA);
                }
            } catch (Error e10) {
                Log.w(f99214b, "Failed to join Custom Audience: " + e10);
                p2.a aVar2 = f99218f;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e10.toString());
                Unit unit = Unit.f93236a;
                aVar.b("gps_pa_failed", bundle);
            } catch (Exception e11) {
                Log.w(f99214b, "Failed to join Custom Audience: " + e11);
                p2.a aVar3 = f99218f;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e11.toString());
                Unit unit2 = Unit.f93236a;
                aVar.b("gps_pa_failed", bundle2);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final String g(String str, String str2) {
        if (!e3.a.d(this) && str != null && str2 != null) {
            try {
                if (!Intrinsics.areEqual(str2, "_removed_") && !StringsKt.g0(str2, "gps", false, 2, null)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
                return null;
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
        return null;
    }

    public final void d(String str, com.facebook.appevents.d dVar) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (!f99216d) {
                c();
            }
            if (f99215c) {
                String string = null;
                if (dVar != null) {
                    try {
                        JSONObject jSONObjectH = dVar.h();
                        if (jSONObjectH != null) {
                            string = jSONObjectH.getString("_eventName");
                        }
                    } catch (JSONException unused) {
                        Log.w(f99214b, "Failed to get event name from event.");
                    }
                }
                f(str, string);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void e(String str, String str2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (!f99216d) {
                c();
            }
            if (f99215c) {
                f(str, str2);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
