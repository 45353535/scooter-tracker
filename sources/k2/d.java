package k2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f85957d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f85958e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f85961c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k10 = jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                    String v10 = jSONObjectOptJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k10, "k");
                    if (k10.length() != 0) {
                        Set setA = d.a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        List listSplit$default = StringsKt.split$default(k10, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                        Intrinsics.checkNotNullExpressionValue(v10, "v");
                        setA.add(new d(key, listSplit$default, v10, null));
                    }
                }
            }
        }

        public final Set b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (e3.a.d(d.class)) {
            return null;
        }
        try {
            return f85958e;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    public final List b() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f85961c);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return this.f85959a;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return this.f85960b;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private d(String str, List list, String str2) {
        this.f85959a = str;
        this.f85960b = str2;
        this.f85961c = list;
    }
}
