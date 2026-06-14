package zg;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.l;
import wg.m;
import zg.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z.a f119437a = new z.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z.a f119438b = new z.a();

    private static final Map b(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b bVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(bVar, serialDescriptor);
        n(serialDescriptor, bVar);
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List listG = serialDescriptor.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof kotlinx.serialization.json.y) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.y yVar = (kotlinx.serialization.json.y) CollectionsKt.singleOrNull((List) arrayList);
            if (yVar != null && (strArrNames = yVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, serialDescriptor, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = serialDescriptor.f(i10).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, serialDescriptor, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    private static final void c(Map map, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2 = Intrinsics.areEqual(serialDescriptor.getKind(), l.b.f108007a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new h0("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.f(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.f(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean d(kotlinx.serialization.json.b bVar, SerialDescriptor serialDescriptor) {
        return bVar.e().h() && Intrinsics.areEqual(serialDescriptor.getKind(), l.b.f108007a);
    }

    public static final Map e(final kotlinx.serialization.json.b bVar, final SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) kotlinx.serialization.json.f0.a(bVar).b(descriptor, f119437a, new Function0() { // from class: zg.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.f(descriptor, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b bVar) {
        return b(serialDescriptor, bVar);
    }

    public static final z.a g() {
        return f119437a;
    }

    public static final String h(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json, int i10) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        n(serialDescriptor, json);
        return serialDescriptor.f(i10);
    }

    public static final int i(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json, String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (d(json, serialDescriptor)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return l(serialDescriptor, json, lowerCase);
        }
        n(serialDescriptor, json);
        int iC = serialDescriptor.c(name);
        return (iC == -3 && json.e().o()) ? l(serialDescriptor, json, name) : iC;
    }

    public static final int j(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int i10 = i(serialDescriptor, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new ug.m(serialDescriptor.h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(serialDescriptor, bVar, str, str2);
    }

    private static final int l(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b bVar, String str) {
        Integer num = (Integer) e(bVar, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.e().k()) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof kotlinx.serialization.json.t) {
                return true;
            }
        }
        return false;
    }

    public static final kotlinx.serialization.json.z n(SerialDescriptor serialDescriptor, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(serialDescriptor.getKind(), m.a.f108008a)) {
            json.e().l();
        }
        return null;
    }
}
