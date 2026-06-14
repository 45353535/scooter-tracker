package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BuiltinSpecialProperties {

    @NotNull
    private static final Set<FqName> GETTER_FQ_NAMES;

    @NotNull
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    @NotNull
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;

    @NotNull
    private static final Set<FqName> SPECIAL_FQ_NAMES;

    @NotNull
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        Pair pair = TuplesKt.to(BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "name"), StandardNames.NAME);
        Pair pair2 = TuplesKt.to(BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, MediationMetaData.KEY_ORDINAL), Name.identifier(MediationMetaData.KEY_ORDINAL));
        Pair pair3 = TuplesKt.to(BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.collection, "size"), Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        Map<FqName, Name> mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(BuiltinSpecialPropertiesKt.child(fqName, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.childSafe(StandardNames.FqNames.charSequence, SessionDescription.ATTR_LENGTH), Name.identifier(SessionDescription.ATTR_LENGTH)), TuplesKt.to(BuiltinSpecialPropertiesKt.child(fqName, UserMetadata.KEYDATA_FILENAME), Name.identifier("keySet")), TuplesKt.to(BuiltinSpecialPropertiesKt.child(fqName, "values"), Name.identifier("values")), TuplesKt.to(BuiltinSpecialPropertiesKt.child(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES), Name.identifier("entrySet")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            Name name = (Name) pair4.getSecond();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair4.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Map<FqName, Name> map = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(entry3.getKey().parent().toUnsafe());
            Intrinsics.checkNotNull(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        GETTER_FQ_NAMES = linkedHashSet;
        Set<FqName> setKeySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.toSet(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name1);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}
