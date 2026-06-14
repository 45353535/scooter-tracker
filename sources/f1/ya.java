package f1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface ya {

    public static final class a {
        public static String a(ya yaVar, JSONObject receiver, String error, String response) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                receiver.put("error", error);
                receiver.put("response", response);
            } catch (Exception e10) {
                eg.i("Cannot create error json for the event", e10);
            }
            String string = receiver.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    void a(yd ydVar, Function1 function1);
}
