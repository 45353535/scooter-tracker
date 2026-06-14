package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.o7;
import com.applovin.impl.q4;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f10584b = new File(k.o().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10585a;

    public static class a implements q4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f10587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f10589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f10590e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j10, long j11) {
            this.f10586a = str;
            this.f10587b = appLovinAdType;
            this.f10588c = z10;
            this.f10589d = j10;
            this.f10590e = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f10590e;
        }

        public long c() {
            return this.f10589d;
        }

        public String d() {
            return this.f10586a + "_" + this.f10587b;
        }

        public String e() {
            return this.f10586a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public AppLovinAdType f() {
            return this.f10587b;
        }

        public boolean g() {
            return this.f10588c;
        }

        public int hashCode() {
            String strE = e();
            int iHashCode = strE == null ? 43 : strE.hashCode();
            AppLovinAdType appLovinAdTypeF = f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeF != null ? appLovinAdTypeF.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j10, long j11) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j10, j11);
        }

        public static a a(JSONObject jSONObject, k kVar) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j10 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j11 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j10, j11);
        }

        @Override // com.applovin.impl.q4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f10586a);
            JsonUtils.putString(jSONObject, "type", this.f10587b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f10588c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f10589d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f10590e);
            return jSONObject;
        }
    }

    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0181c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public c(k kVar) {
        this.f10585a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f10585a.a(x4.Z0)).longValue(), k.n());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f10585a.G().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes("UTF-8")), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th2) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f10585a.D().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final b bVar2) {
        if (b()) {
            this.f10585a.q0().a((i5) new r6(this.f10585a, "persistAd", new Runnable() { // from class: com.applovin.impl.sdk.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10508b.a(bVar, bVar2);
                }
            }), d6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f10584b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(final a aVar, final InterfaceC0181c interfaceC0181c) {
        final File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f10585a.q0().a((i5) new r6(this.f10585a, "retrievePersistedAd", new Runnable() { // from class: com.applovin.impl.sdk.b0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f10579b.a(fileA, interfaceC0181c, aVar);
                }
            }), d6.b.OTHER);
        } else {
            interfaceC0181c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0181c interfaceC0181c, a aVar) throws Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f10585a.G().f(file);
        if (strF == null) {
            interfaceC0181c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f10585a);
            } else {
                bVarA = o7.a(jSONObjectJsonObjectFromJsonString, this.f10585a);
            }
            if (bVarA == null) {
                interfaceC0181c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0181c.a(bVarA, null);
            }
        } catch (Throwable th2) {
            interfaceC0181c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f10585a.D().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f10584b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f10585a.O();
        if (o.a()) {
            this.f10585a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f10585a.g().a(com.applovin.impl.d2.U, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f10585a.O();
        if (o.a()) {
            this.f10585a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = com.applovin.impl.f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f10585a.g().d(com.applovin.impl.d2.V, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f10584b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f10584b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
