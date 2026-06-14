package f1;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f69985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg f69986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f69987c;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69988f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject(it);
        }
    }

    public h2(SharedPreferences sharedPreferences, jg trackingBodyBuilder, Function1 jsonFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(trackingBodyBuilder, "trackingBodyBuilder");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f69985a = sharedPreferences;
        this.f69986b = trackingBodyBuilder;
        this.f69987c = jsonFactory;
    }

    public final String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(com.taurusx.tax.w.s.s.I) + jSONObject.getLong("event_timestamp");
    }

    public final List b() {
        try {
            List list = CollectionsKt.toList(this.f69985a.getAll().values());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object objInvoke = this.f69987c.invoke(String.valueOf(it.next()));
                this.f69985a.edit().clear().apply();
                arrayList.add((JSONObject) objInvoke);
            }
            return arrayList;
        } catch (Exception e10) {
            eg.e("loadEventsAsJsonList error " + e10, null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    public final List c(List events, fb environmentData) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) this.f69987c.invoke(this.f69986b.a((y0) it.next(), environmentData)));
            }
            return arrayList;
        } catch (Exception e10) {
            eg.e("cacheEventToTrackingRequestBody error " + e10, null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    public final void d(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            eg.e("clearEventFromStorage: " + event.k().getValue(), null, 2, null);
            this.f69985a.edit().remove(event.k().getValue()).apply();
        } catch (Exception e10) {
            eg.e("clearEventFromStorage error " + e10, null, 2, null);
        }
    }

    public final void e(y0 event, fb environmentData) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            eg.e("forcePersistEvent: " + event.k().getValue(), null, 2, null);
            this.f69985a.edit().putString(event.k().getValue(), this.f69986b.a(event, environmentData)).apply();
        } catch (Exception e10) {
            eg.e("forcePersistEvent error " + e10, null, 2, null);
        }
    }

    public final void f(y0 event, fb environmentData, int i10) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        if (this.f69985a.getAll().size() > i10) {
            eg.e("Persistence limit reached. Drop old events!", null, 2, null);
            this.f69985a.edit().clear().apply();
        }
        try {
            this.f69985a.edit().putString(h(event), this.f69986b.a(event, environmentData)).apply();
        } catch (Exception e10) {
            eg.e("cacheEventToTrackingRequestBodyAndSave error " + e10, null, 2, null);
        }
    }

    public final void g(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            for (JSONObject jSONObject : vd.a(jsonArray)) {
                this.f69985a.edit().putString(a(jSONObject), jSONObject.toString()).apply();
            }
        } catch (Exception e10) {
            eg.e("cacheEventToTrackingRequestBodyAndSave error " + e10, null, 2, null);
        }
    }

    public final String h(y0 y0Var) {
        return y0Var.k().getValue() + y0Var.n();
    }

    public /* synthetic */ h2(SharedPreferences sharedPreferences, jg jgVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, jgVar, (i10 & 4) != 0 ? a.f69988f : function1);
    }
}
