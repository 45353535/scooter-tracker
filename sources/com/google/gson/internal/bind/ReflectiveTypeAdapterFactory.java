package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConstructorConstructor f33646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FieldNamingStrategy f33647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Excluder f33648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f33649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f33650f;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FieldsData f33659a;

        Adapter(FieldsData fieldsData) {
            this.f33659a = fieldsData;
        }

        abstract Object a();

        abstract Object b(Object obj);

        abstract void c(Object obj, JsonReader jsonReader, BoundField boundField);

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Object objA = a();
            Map<String, BoundField> map = this.f33659a.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        c(objA, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return (T) b(objA);
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.f33659a.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().c(jsonWriter, t10);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            }
        }
    }

    static abstract class BoundField {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f33660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f33661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f33662c;

        protected BoundField(String str, Field field) {
            this.f33660a = str;
            this.f33661b = field;
            this.f33662c = field.getName();
        }

        abstract void a(JsonReader jsonReader, int i10, Object[] objArr);

        abstract void b(JsonReader jsonReader, Object obj);

        abstract void c(JsonWriter jsonWriter, Object obj);
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ObjectConstructor f33663b;

        FieldReflectionAdapter(ObjectConstructor objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.f33663b = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object a() {
            return this.f33663b.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object b(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void c(Object obj, JsonReader jsonReader, BoundField boundField) {
            boundField.b(jsonReader, obj);
        }
    }

    private static class FieldsData {
        public static final FieldsData EMPTY = new FieldsData(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        public final Map<String, BoundField> deserializedFields;
        public final List<BoundField> serializedFields;

        public FieldsData(Map<String, BoundField> map, List<BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map f33664e = f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor f33665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f33666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f33667d;

        RecordAdapter(Class cls, FieldsData fieldsData, boolean z10) {
            super(fieldsData);
            this.f33667d = new HashMap();
            Constructor canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.f33665b = canonicalRecordConstructor;
            if (z10) {
                ReflectiveTypeAdapterFactory.b(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i10 = 0; i10 < recordComponentNames.length; i10++) {
                this.f33667d.put(recordComponentNames[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f33665b.getParameterTypes();
            this.f33666c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f33666c[i11] = f33664e.get(parameterTypes[i11]);
            }
        }

        private static Map f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.f33666c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object b(Object[] objArr) {
            try {
                return this.f33665b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f33665b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f33665b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.f33665b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, JsonReader jsonReader, BoundField boundField) {
            Integer num = (Integer) this.f33667d.get(boundField.f33662c);
            if (num != null) {
                boundField.a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.constructorToString(this.f33665b) + "' for field with name '" + boundField.f33662c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.f33646b = constructorConstructor;
        this.f33647c = fieldNamingStrategy;
        this.f33648d = excluder;
        this.f33649e = jsonAdapterAnnotationTypeAdapterFactory;
        this.f33650f = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (ReflectionAccessFilterHelper.canAccess(accessibleObject, obj)) {
            return;
        }
        throw new JsonIOException(ReflectionHelper.getAccessibleObjectDescription(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private BoundField c(Gson gson, Field field, final Method method, String str, TypeToken typeToken, boolean z10, final boolean z11) {
        boolean z12;
        final TypeAdapter typeAdapterRuntimeTypeWrapper;
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z13 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = false;
            z13 = true;
        } else {
            z12 = false;
        }
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter typeAdapterC = jsonAdapter != null ? this.f33649e.c(this.f33646b, gson, typeToken, jsonAdapter, false) : null;
        boolean z14 = typeAdapterC == null ? z12 : true;
        if (typeAdapterC == null) {
            typeAdapterC = gson.getAdapter(typeToken);
        }
        final TypeAdapter typeAdapter = typeAdapterC;
        if (z10) {
            typeAdapterRuntimeTypeWrapper = z14 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, typeToken.getType());
        } else {
            typeAdapterRuntimeTypeWrapper = typeAdapter;
        }
        return new BoundField(str, field) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.2
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void a(JsonReader jsonReader, int i10, Object[] objArr) throws IOException {
                Object obj = typeAdapter.read2(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i10] = obj;
                    return;
                }
                throw new JsonParseException("null is not allowed as value for record component '" + this.f33662c + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void b(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
                Object obj2 = typeAdapter.read2(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z11) {
                    ReflectiveTypeAdapterFactory.b(obj, this.f33661b);
                } else if (z13) {
                    throw new JsonIOException("Cannot set value of 'static final' " + ReflectionHelper.getAccessibleObjectDescription(this.f33661b, false));
                }
                this.f33661b.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
                Object objInvoke;
                if (z11) {
                    Method method2 = method;
                    if (method2 == null) {
                        ReflectiveTypeAdapterFactory.b(obj, this.f33661b);
                    } else {
                        ReflectiveTypeAdapterFactory.b(obj, method2);
                    }
                }
                Method method3 = method;
                if (method3 != null) {
                    try {
                        objInvoke = method3.invoke(obj, null);
                    } catch (InvocationTargetException e10) {
                        throw new JsonIOException("Accessor " + ReflectionHelper.getAccessibleObjectDescription(method, false) + " threw exception", e10.getCause());
                    }
                } else {
                    objInvoke = this.f33661b.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.f33660a);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, objInvoke);
            }
        };
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData e(com.google.gson.Gson r20, com.google.gson.reflect.TypeToken r21, java.lang.Class r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.e(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData");
    }

    private List f(Field field) {
        String strTranslateName;
        List<String> listAlternateNames;
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            strTranslateName = this.f33647c.translateName(field);
            listAlternateNames = this.f33647c.alternateNames(field);
        } else {
            String strValue = serializedName.value();
            List<String> listAsList = Arrays.asList(serializedName.alternate());
            strTranslateName = strValue;
            listAlternateNames = listAsList;
        }
        if (listAlternateNames.isEmpty()) {
            return Collections.singletonList(strTranslateName);
        }
        ArrayList arrayList = new ArrayList(listAlternateNames.size() + 1);
        arrayList.add(strTranslateName);
        arrayList.addAll(listAlternateNames);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f33648d.excludeField(field, z10);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                /* JADX INFO: renamed from: read */
                public T read2(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t10) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f33650f, rawType);
        if (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            boolean z10 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, e(gson, typeToken, rawType, z10, true), z10) : new FieldReflectionAdapter(this.f33646b.get(typeToken, true), e(gson, typeToken, rawType, z10, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
