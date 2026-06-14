package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements KClass, q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f93320c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f93321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f93322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f93323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap f93324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f93325h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f93326b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) r.f93324g.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) r.f93324g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) r.f93325h.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) r.f93325h.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNull(simpleName);
                String strH1 = StringsKt.h1(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strH1 != null) {
                    return strH1;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.g1(simpleName, '$', null, 2, null);
            }
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.h1(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = r.f93321d;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return b1.o(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = xf.a.c(xf.a.e(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        int i10 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        for (Object obj : listListOf) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f93321d = MapsKt.toMap(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        f93322e = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f93323f = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            sb2.append(StringsKt.k1(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair pair = TuplesKt.to(sb2.toString(), str + ".Companion");
            map3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry entry : f93321d.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f93324g = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.checkNotNull(str2);
            linkedHashMap.put(key, StringsKt.k1(str2, '.', null, 2, null));
        }
        f93325h = linkedHashMap;
    }

    public r(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f93326b = jClass;
    }

    private final Void d() {
        throw new xf.b();
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(Object obj) {
        return (obj instanceof r) && Intrinsics.areEqual(xf.a.c(this), xf.a.c((KClass) obj));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public Collection getConstructors() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.jvm.internal.q
    public Class getJClass() {
        return this.f93326b;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public Collection getMembers() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public Collection getNestedClasses() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public Object getObjectInstance() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public String getQualifiedName() {
        return f93320c.a(getJClass());
    }

    @Override // kotlin.reflect.KClass
    public List getSealedSubclasses() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public String getSimpleName() {
        return f93320c.b(getJClass());
    }

    @Override // kotlin.reflect.KClass
    public List getSupertypes() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public List getTypeParameters() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public KVisibility getVisibility() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return xf.a.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(Object obj) {
        return f93320c.c(obj, getJClass());
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        d();
        throw new lf.g();
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        d();
        throw new lf.g();
    }

    public String toString() {
        return getJClass() + " (Kotlin reflection is not available)";
    }
}
