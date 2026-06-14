package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f116833a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f116834b = MapsKt.mapOf(TuplesKt.to(16, "ActivityInfo.CONFIG_KEYBOARD"), TuplesKt.to(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), TuplesKt.to(128, "ActivityInfo.CONFIG_ORIENTATION"), TuplesKt.to(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), TuplesKt.to(512, "ActivityInfo.CONFIG_UI_MODE"), TuplesKt.to(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), TuplesKt.to(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        Map map = f116834b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = str;
            }
            arrayList.add(obj);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next) != null) {
                obj = next;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        String str3 = String.format(f116833a, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        throw new fa1(str3, str3);
    }
}
