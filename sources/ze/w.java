package ze;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface w {

    public static final class a {
        public static void a(w wVar, Function2 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            for (Map.Entry entry : wVar.entries()) {
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String b(w wVar, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            List listA = wVar.a(name);
            if (listA != null) {
                return (String) CollectionsKt.firstOrNull(listA);
            }
            return null;
        }
    }

    List a(String str);

    boolean b();

    void c(Function2 function2);

    Set entries();

    String get(String str);

    boolean isEmpty();

    Set names();
}
