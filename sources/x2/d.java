package x2;

import android.os.Bundle;
import com.facebook.internal.i;
import com.facebook.internal.m;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import x2.e;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f108089a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f108090b = e.class.getSimpleName();

    private d() {
    }

    public static final Bundle a(e.a eventType, String applicationId, List appEvents) {
        if (e3.a.d(d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (e.a.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayB = f108089a.b(appEvents, applicationId);
            if (jSONArrayB.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayB.toString());
            return bundle;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    private final JSONArray b(List list, String str) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<com.facebook.appevents.d> mutableList = CollectionsKt.toMutableList((Collection) list);
            o2.a.d(mutableList);
            boolean zC = c(str);
            for (com.facebook.appevents.d dVar : mutableList) {
                if (!dVar.m() || (dVar.m() && zC)) {
                    jSONArray.put(dVar.j());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            i iVarU = m.u(str, false);
            if (iVarU != null) {
                return iVarU.w();
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }
}
