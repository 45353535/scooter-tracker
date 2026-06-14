package f1;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function1 f71369a = a.f71370f;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71370f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ga invoke(j4 it) {
            JSONObject jSONObject;
            String str = JsonUtils.EMPTY_JSON;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                String string = it.i().getString("config", JsonUtils.EMPTY_JSON);
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e10) {
                eg.i("Error reading config from shared preferences", e10);
                jSONObject = new JSONObject();
            }
            return new ga(jSONObject);
        }
    }
}
