package f1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k2 implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70227a = new ArrayList();

    @Override // f1.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f70227a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((o) it.next()).a(response);
        }
        return response;
    }
}
