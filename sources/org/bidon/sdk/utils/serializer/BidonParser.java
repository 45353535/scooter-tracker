package org.bidon.sdk.utils.serializer;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.my.target.common.menu.MenuActionType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.ranges.g;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.full.KTypes;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0006\u0012\u0002\b\u00030\rH\u0002J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00050\u0012H\u0002¨\u0006\u0014"}, d2 = {"Lorg/bidon/sdk/utils/serializer/BidonParser;", "", "<init>", "()V", "parse", "T", "Lorg/bidon/sdk/utils/serializer/Serializable;", "data", "", "(Ljava/lang/String;)Lorg/bidon/sdk/utils/serializer/Serializable;", "getParseParams", "", "Lorg/bidon/sdk/utils/serializer/BidonParser$ParseParams;", "Lkotlin/reflect/KClass;", "jsonArrayToList", "jsonArray", "Lorg/json/JSONArray;", "parser", "Lkotlin/Function1;", "ParseParams", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonParser {

    @NotNull
    public static final BidonParser INSTANCE = new BidonParser();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/utils/serializer/BidonParser$ParseParams;", "", "fieldName", "", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/KParameter;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KParameter;)V", "getFieldName", "()Ljava/lang/String;", "getParameter", "()Lkotlin/reflect/KParameter;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ParseParams {

        @NotNull
        private final String fieldName;

        @NotNull
        private final KParameter parameter;

        public ParseParams(@NotNull String fieldName, @NotNull KParameter parameter) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            this.fieldName = fieldName;
            this.parameter = parameter;
        }

        public static /* synthetic */ ParseParams copy$default(ParseParams parseParams, String str, KParameter kParameter, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = parseParams.fieldName;
            }
            if ((i10 & 2) != 0) {
                kParameter = parseParams.parameter;
            }
            return parseParams.copy(str, kParameter);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final KParameter getParameter() {
            return this.parameter;
        }

        @NotNull
        public final ParseParams copy(@NotNull String fieldName, @NotNull KParameter parameter) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            return new ParseParams(fieldName, parameter);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParseParams)) {
                return false;
            }
            ParseParams parseParams = (ParseParams) other;
            return Intrinsics.areEqual(this.fieldName, parseParams.fieldName) && Intrinsics.areEqual(this.parameter, parseParams.parameter);
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final KParameter getParameter() {
            return this.parameter;
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.parameter.hashCode();
        }

        @NotNull
        public String toString() {
            return "ParseParams(fieldName=" + this.fieldName + ", parameter=" + this.parameter + ")";
        }
    }

    private BidonParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ParseParams> getParseParams(KClass<?> kClass) {
        Object next;
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(kClass);
        Intrinsics.checkNotNull(primaryConstructor);
        List<KParameter> parameters = primaryConstructor.getParameters();
        Collection declaredMemberProperties = KClasses.getDeclaredMemberProperties(kClass);
        ArrayList arrayList = new ArrayList();
        Iterator it = declaredMemberProperties.iterator();
        while (it.hasNext()) {
            Field javaField = ReflectJvmMapping.getJavaField((KProperty1) it.next());
            if (javaField != null) {
                arrayList.add(javaField);
            }
        }
        List<KParameter> list = parameters;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (KParameter kParameter : list) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.areEqual(((Field) next).getName(), kParameter.getName())) {
                    break;
                }
            }
            Field field = (Field) next;
            if (field == null || !field.isAnnotationPresent(JsonName.class)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Intrinsics.checkNotNull(field);
            Annotation annotation = field.getAnnotation(JsonName.class);
            Intrinsics.checkNotNull(annotation);
            arrayList2.add(new ParseParams(((JsonName) annotation).key(), kParameter));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> List<T> jsonArrayToList(JSONArray jsonArray, Function1<? super String, ? extends T> parser) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            listCreateListBuilder.add(parser.invoke(jsonArray.get(i10).toString()));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final /* synthetic */ <T extends Serializable> T parse(String data) {
        Object objB;
        Serializable serializable;
        Object objValueOf;
        try {
            Result.Companion companion = Result.f93230c;
            if (data == null) {
                serializable = null;
            } else {
                JSONObject jSONObject = new JSONObject(data);
                Intrinsics.reifiedOperationMarker(4, "T");
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(v0.b(Serializable.class));
                Intrinsics.checkNotNull(primaryConstructor);
                Intrinsics.reifiedOperationMarker(4, "T");
                List<ParseParams> parseParams = getParseParams(v0.b(Serializable.class));
                LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parseParams, 10)), 16));
                for (ParseParams parseParams2 : parseParams) {
                    String string = parseParams2.getParameter().getType().toString();
                    if (Intrinsics.areEqual(string, "kotlin.String")) {
                        objValueOf = jSONObject.getString(parseParams2.getFieldName());
                    } else if (Intrinsics.areEqual(string, "kotlin.Double")) {
                        objValueOf = Double.valueOf(jSONObject.getDouble(parseParams2.getFieldName()));
                    } else if (Intrinsics.areEqual(string, "kotlin.Int")) {
                        objValueOf = Integer.valueOf(jSONObject.getInt(parseParams2.getFieldName()));
                    } else if (Intrinsics.areEqual(string, "kotlin.Float")) {
                        objValueOf = Float.valueOf((float) jSONObject.getDouble(parseParams2.getFieldName()));
                    } else if (Intrinsics.areEqual(string, "kotlin.Boolean")) {
                        objValueOf = Boolean.valueOf(jSONObject.getBoolean(parseParams2.getFieldName()));
                    } else if (StringsKt.a0(string, "kotlin.collections.List", false, 2, null)) {
                        KType type = parseParams2.getParameter().getType().getArguments().get(0).getType();
                        if (type != null && KTypes.isSubtypeOf(type, KClassifiers.getStarProjectedType(v0.b(Serializable.class)))) {
                            JSONArray jSONArray = jSONObject.getJSONArray(parseParams2.getFieldName());
                            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                            jsonArrayToList(jSONArray, new Function1<String, Unit>() { // from class: org.bidon.sdk.utils.serializer.BidonParser$parse$1$args$1$value$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    invoke2(str);
                                    return Unit.f93236a;
                                }
                            });
                        }
                        System.out.println((Object) "it");
                        jSONObject.getJSONArray(parseParams2.getFieldName());
                        objValueOf = Unit.f93236a;
                    } else {
                        System.out.println((Object) ("Type: " + parseParams2.getParameter().getType()));
                        objValueOf = jSONObject.get(parseParams2.getFieldName());
                    }
                    Pair pair = TuplesKt.to(parseParams2.getParameter(), objValueOf);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    System.out.println((Object) (((KParameter) entry.getKey()).getIndex() + ">>> " + entry.getValue() + " -> " + entry.getKey()));
                }
                serializable = (Serializable) primaryConstructor.callBy(linkedHashMap);
            }
            objB = Result.b(serializable);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            thG.printStackTrace();
        }
        return (T) (Result.i(objB) ? null : objB);
    }
}
