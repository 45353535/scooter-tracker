package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class W5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<W5> CREATOR = new V5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    protected String f76614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected String f76615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f76619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f76620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f76621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f76622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f76623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC5218ka f76624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC5442t9 f76625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f76626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f76627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f76628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f76629p;

    public W5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f76619f == null) {
            this.f76619f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f76619f;
    }

    public final void c(@Nullable Bundle bundle) {
        this.f76626m = bundle;
    }

    public final long d() {
        return this.f76622i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f76623j;
    }

    @Nullable
    public final String f() {
        return this.f76616c;
    }

    @NonNull
    public final EnumC5218ka g() {
        return this.f76624k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f76620g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f76618e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f76629p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f76614a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f76617d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f76615b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f76615b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.f76628o;
    }

    @Nullable
    public final Bundle i() {
        return this.f76626m;
    }

    @Nullable
    public final String j() {
        return this.f76621h;
    }

    @Nullable
    public final EnumC5442t9 k() {
        return this.f76625l;
    }

    public final boolean l() {
        return this.f76614a == null;
    }

    public final boolean m() {
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        return -1 == this.f76617d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i10) {
        this.f76620g = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i10) {
        this.f76618e = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f76629p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f76614a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i10) {
        this.f76617d = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f76615b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.f76615b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f76614a;
        String str2 = EnumC5168ib.a(this.f76617d).f77428b;
        String strSubstring = this.f76615b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, strSubstring);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f76614a);
        bundle.putString("CounterReport.Value", this.f76615b);
        bundle.putInt("CounterReport.Type", this.f76617d);
        bundle.putInt("CounterReport.CustomType", this.f76618e);
        bundle.putInt("CounterReport.TRUNCATED", this.f76620g);
        bundle.putString("CounterReport.ProfileID", this.f76621h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f76624k.f77603a);
        Bundle bundle2 = this.f76626m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f76616c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f76619f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f76622i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f76623j);
        EnumC5442t9 enumC5442t9 = this.f76625l;
        if (enumC5442t9 != null) {
            bundle.putInt("CounterReport.Source", enumC5442t9.f78288a);
        }
        Boolean bool = this.f76627n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f76628o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f76629p));
        parcel.writeBundle(bundle);
    }

    public W5(@Nullable String str, int i10) {
        this("", str, i10);
    }

    @NonNull
    public static W5 e(@NonNull W5 w52) {
        return a(w52, EnumC5168ib.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(@Nullable String str) {
        this.f76616c = str;
    }

    public void c(@Nullable String str) {
        this.f76621h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public W5(@Nullable String str, @Nullable String str2, int i10) {
        this(str, str2, i10, new SystemTimeProvider());
    }

    public final void a(long j10) {
        this.f76622i = j10;
    }

    public final void b(long j10) {
        this.f76623j = j10;
    }

    @Nullable
    public final Boolean c() {
        return this.f76627n;
    }

    @VisibleForTesting
    public W5(@Nullable String str, @Nullable String str2, int i10, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f76624k = EnumC5218ka.UNKNOWN;
        this.f76629p = new HashMap();
        this.f76614a = str2;
        this.f76617d = i10;
        this.f76615b = str;
        this.f76622i = systemTimeProvider.elapsedRealtime();
        this.f76623j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static W5 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                W5 w52 = (W5) bundle.getParcelable("CounterReport.Object");
                if (w52 != null) {
                    return w52;
                }
            } catch (Throwable unused) {
                return new W5("", 0);
            }
        }
        return new W5("", 0);
    }

    @NonNull
    public static W5 c(@NonNull W5 w52) {
        return a(w52, EnumC5168ib.EVENT_TYPE_INIT);
    }

    @NonNull
    public static W5 d(@NonNull W5 w52) {
        W5 w53 = new W5("", 0);
        w53.f76623j = w52.f76623j;
        w53.f76622i = w52.f76622i;
        w53.f76619f = w52.f76619f;
        w53.f76616c = w52.f76616c;
        w53.f76626m = w52.f76626m;
        w53.f76629p = w52.f76629p;
        w53.f76621h = w52.f76621h;
        return w53;
    }

    public final void a(@NonNull EnumC5218ka enumC5218ka) {
        this.f76624k = enumC5218ka;
    }

    public final void a(@Nullable EnumC5442t9 enumC5442t9) {
        this.f76625l = enumC5442t9;
    }

    public final void a(@Nullable Boolean bool) {
        this.f76627n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.f76628o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static W5 b(@NonNull W5 w52) {
        return a(w52, EnumC5168ib.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static W5 a(W5 w52, EnumC5168ib enumC5168ib) {
        W5 w5D = d(w52);
        w5D.f76617d = enumC5168ib.f77427a;
        return w5D;
    }

    @NonNull
    public static W5 a(@NonNull W5 w52) {
        return a(w52, EnumC5168ib.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static W5 a(@NonNull W5 w52, @NonNull T9 t92) {
        W5 w5A = a(w52, EnumC5168ib.EVENT_TYPE_START);
        w5A.setValueBytes(MessageNano.toByteArray(new C5517w9().fromModel(new C5492v9((String) t92.f76495b.a()))));
        w5A.f76623j = w52.f76623j;
        w5A.f76622i = w52.f76622i;
        return w5A;
    }

    @NonNull
    public static W5 a(@NonNull W5 w52, @NonNull Collection<PermissionState> collection, @Nullable F2 f22, @NonNull C5236l2 c5236l2, @NonNull List<String> list) {
        String string;
        String str;
        W5 w5D = d(w52);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (f22 != null) {
                jSONObject.put("background_restricted", f22.f75757b);
                E2 e22 = f22.f75756a;
                c5236l2.getClass();
                if (e22 != null) {
                    switch (e22) {
                        case EXEMPTED:
                            str = "EXEMPTED";
                            break;
                        case ACTIVE:
                            str = "ACTIVE";
                            break;
                        case WORKING_SET:
                            str = "WORKING_SET";
                            break;
                        case FREQUENT:
                            str = "FREQUENT";
                            break;
                        case RARE:
                            str = "RARE";
                            break;
                        case RESTRICTED:
                            str = "RESTRICTED";
                            break;
                        case UNKNOWN:
                            str = "UNKNOWN";
                            break;
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w5D.f76617d = 12288;
        w5D.setValue(string);
        return w5D;
    }

    @NonNull
    public static W5 a(@NonNull W5 w52, @Nullable String str) {
        W5 w5D = d(w52);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w5D.f76617d = 12289;
        w5D.setValue(str);
        return w5D;
    }

    @NonNull
    public static W5 a() {
        W5 w52 = new W5("", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = 16384;
        return w52;
    }

    @NonNull
    public static W5 a(@NonNull String str) {
        W5 w52 = new W5("", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = 12320;
        w52.f76615b = str;
        w52.f76625l = EnumC5442t9.JS;
        return w52;
    }
}
