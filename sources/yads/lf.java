package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f113080a = lf.i.a(jf.f112331b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f113081b = lf.i.a(kf.f112698b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        List listC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = StringsKt.F0(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String string = StringsKt.v1((String) it.next()).toString();
            MatchResult matchResultC = Regex.c((Regex) f113081b.getValue(), string, 0, 2, null);
            String str2 = (matchResultC == null || (listC = matchResultC.c()) == null) ? null : (String) CollectionsKt.getOrNull(listC, 1);
            if (str2 != null) {
                thread = new Thread("[ExitInfo] " + str2);
                linkedHashMap.put(thread, new ArrayList());
            } else if (StringsKt.a0(string, "at ", false, 2, null) && thread != null) {
                MatchResult matchResultC2 = Regex.c((Regex) f113080a.getValue(), string, 0, 2, null);
                if (matchResultC2 == null) {
                    stackTraceElement = null;
                    if (stackTraceElement == null && (list = (List) linkedHashMap.get(thread)) != null) {
                        list.add(stackTraceElement);
                    }
                } else {
                    MatchResult.b bVarA = matchResultC2.a();
                    String str3 = (String) bVarA.a().c().get(1);
                    String str4 = (String) bVarA.a().c().get(2);
                    String str5 = (String) bVarA.a().c().get(3);
                    String strQ1 = StringsKt.q1(str3, '.', "");
                    String strK1 = StringsKt.k1(str3, '.', null, 2, null);
                    try {
                        Integer intOrNull = StringsKt.toIntOrNull(str5);
                        stackTraceElement = new StackTraceElement(strQ1, strK1, str4, intOrNull != null ? intOrNull.intValue() : -1);
                    } catch (Throwable unused) {
                        stackTraceElement = null;
                    }
                    if (stackTraceElement == null) {
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
