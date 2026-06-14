package org.bidon.sdk.config.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.config.AdapterInstanceCreator;
import org.bidon.sdk.config.DefaultAdapters;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¨\u0006\u0011"}, d2 = {"Lorg/bidon/sdk/config/impl/AdapterInstanceCreatorImpl;", "Lorg/bidon/sdk/config/AdapterInstanceCreator;", "<init>", "()V", "createAvailableAdapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "useDefaultAdapters", "", "adapterClasses", "", "", "obtainServiceClass", "Ljava/lang/Class;", "requiredClass", "getAdapterInstance", "clazz", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdapterInstanceCreatorImpl implements AdapterInstanceCreator {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createAvailableAdapters$lambda$3(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final Adapter getAdapterInstance(Class<Adapter> clazz) {
        try {
            Adapter adapterNewInstance = clazz.newInstance();
            Intrinsics.checkNotNull(adapterNewInstance, "null cannot be cast to non-null type org.bidon.sdk.adapter.Adapter");
            return adapterNewInstance;
        } catch (Exception e10) {
            LogExtKt.logError("AdapterInstanceCreator", "Error while creating instance of " + clazz, e10);
            return null;
        }
    }

    private final Class<Adapter> obtainServiceClass(String requiredClass) {
        try {
            Class cls = Class.forName(requiredClass, false, AdapterInstanceCreatorImpl.class.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<org.bidon.sdk.adapter.Adapter>");
            return cls;
        } catch (Exception e10) {
            LogExtKt.logError("AdapterInstanceCreator", "Adapter class not found: " + requiredClass, e10);
            return null;
        }
    }

    @Override // org.bidon.sdk.config.AdapterInstanceCreator
    @NotNull
    public List<Adapter> createAvailableAdapters(boolean useDefaultAdapters, @NotNull Set<String> adapterClasses) {
        Intrinsics.checkNotNullParameter(adapterClasses, "adapterClasses");
        DefaultAdapters[] defaultAdaptersArrValues = DefaultAdapters.values();
        List arrayList = new ArrayList(defaultAdaptersArrValues.length);
        for (DefaultAdapters defaultAdapters : defaultAdaptersArrValues) {
            arrayList.add(defaultAdapters.getClassPath());
        }
        if (!useDefaultAdapters) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        Set setPlus = SetsKt.plus((Set) adapterClasses, (Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = setPlus.iterator();
        while (it.hasNext()) {
            Class<Adapter> clsObtainServiceClass = obtainServiceClass((String) it.next());
            if (clsObtainServiceClass != null) {
                arrayList2.add(clsObtainServiceClass);
            }
        }
        LogExtKt.logInfo("AdapterInstanceCreator", "Available adapters classes: " + CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new Function1() { // from class: org.bidon.sdk.config.impl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdapterInstanceCreatorImpl.createAvailableAdapters$lambda$3((Class) obj);
            }
        }, 31, null));
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Adapter adapterInstance = getAdapterInstance((Class) it2.next());
            if (adapterInstance != null) {
                arrayList3.add(adapterInstance);
            }
        }
        return arrayList3;
    }
}
