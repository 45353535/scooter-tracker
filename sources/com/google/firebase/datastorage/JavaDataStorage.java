package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.internal.protos.Sdk;
import eg.h;
import hg.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.v0;
import kotlin.properties.d;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R%\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120**\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00100¨\u00061"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Landroidx/datastore/preferences/core/Preferences$Key;", C4240b4.i.W, "defaultValue", "getSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "value", "Landroidx/datastore/preferences/core/Preferences;", "putSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Landroidx/datastore/preferences/core/MutablePreferences;", "", "transform", "editSync", "(Lkotlin/jvm/functions/Function1;)Landroidx/datastore/preferences/core/Preferences;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/ThreadLocal;", "editLock", "Landroidx/datastore/core/DataStore;", "d", "Lkotlin/properties/d;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore", "Landroidx/datastore/core/DataStore;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f32720f = {v0.k(new p0(JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal editLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DataStore dataStore;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", l = {124}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32726r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f32728t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Preferences.Key key, Continuation continuation) {
            super(2, continuation);
            this.f32728t = key;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return JavaDataStorage.this.new AnonymousClass1(this.f32728t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f32726r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow data = JavaDataStorage.this.dataStore.getData();
                this.f32726r = 1;
                obj = i.z(data, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Preferences preferences = (Preferences) obj;
            return kotlin.coroutines.jvm.internal.b.a(preferences != null ? preferences.contains(this.f32728t) : false);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
    static final class C35571 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32729r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f32731t;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        static final class C03591 extends k implements Function2<MutablePreferences, Continuation, Object> {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f32732r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f32733s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f32734t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03591(Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f32734t = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C03591 c03591 = new C03591(this.f32734t, continuation);
                c03591.f32733s = obj;
                return c03591;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((C03591) create(mutablePreferences, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f32732r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f32734t.invoke((MutablePreferences) this.f32733s);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35571(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f32731t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return JavaDataStorage.this.new C35571(this.f32731t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f32729r;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    if (Intrinsics.areEqual(JavaDataStorage.this.editLock.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    JavaDataStorage.this.editLock.set(kotlin.coroutines.jvm.internal.b.a(true));
                    DataStore dataStore = JavaDataStorage.this.dataStore;
                    C03591 c03591 = new C03591(this.f32731t, null);
                    this.f32729r = 1;
                    obj = PreferencesKt.edit(dataStore, c03591, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return (Preferences) obj;
            } finally {
                JavaDataStorage.this.editLock.set(kotlin.coroutines.jvm.internal.b.a(false));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35571) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    static final class C35581 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32735r;

        C35581(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return JavaDataStorage.this.new C35581(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map<Preferences.Key<?>, Object> mapAsMap;
            Object objG = pf.b.g();
            int i10 = this.f32735r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow data = JavaDataStorage.this.dataStore.getData();
                this.f32735r = 1;
                obj = i.z(data, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (mapAsMap = preferences.asMap()) == null) ? MapsKt.emptyMap() : mapAsMap;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35581) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    static final class C35591 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32737r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f32739t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f32740u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35591(Preferences.Key key, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f32739t = key;
            this.f32740u = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return JavaDataStorage.this.new C35591(this.f32739t, this.f32740u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objG = pf.b.g();
            int i10 = this.f32737r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow data = JavaDataStorage.this.dataStore.getData();
                this.f32737r = 1;
                obj = i.z(data, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (obj2 = preferences.get(this.f32739t)) == null) ? this.f32740u : obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35591) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    static final class C35601 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f32741r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f32743t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f32744u;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        static final class C03601 extends k implements Function2<MutablePreferences, Continuation, Object> {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f32745r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f32746s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Preferences.Key f32747t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Object f32748u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03601(Preferences.Key key, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f32747t = key;
                this.f32748u = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C03601 c03601 = new C03601(this.f32747t, this.f32748u, continuation);
                c03601.f32746s = obj;
                return c03601;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((C03601) create(mutablePreferences, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f32745r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                ((MutablePreferences) this.f32746s).set(this.f32747t, this.f32748u);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35601(Preferences.Key key, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f32743t = key;
            this.f32744u = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return JavaDataStorage.this.new C35601(this.f32743t, this.f32744u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f32741r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            DataStore dataStore = JavaDataStorage.this.dataStore;
            C03601 c03601 = new C03601(this.f32743t, this.f32744u, null);
            this.f32741r = 1;
            Object objEdit = PreferencesKt.edit(dataStore, c03601, this);
            return objEdit == objG ? objG : objEdit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35601) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public JavaDataStorage(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal();
        this.dataStore = PreferenceDataStoreDelegateKt.preferencesDataStore$default(name, new ReplaceFileCorruptionHandler(new Function1() { // from class: com.google.firebase.datastorage.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JavaDataStorage.c(this.f32749b, (CorruptionException) obj);
            }
        }), new Function1() { // from class: com.google.firebase.datastorage.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JavaDataStorage.d(this.f32750b, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = e(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences c(JavaDataStorage javaDataStorage, CorruptionException ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(v0.b(JavaDataStorage.class).getSimpleName(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), ex);
        return PreferencesFactory.createEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(JavaDataStorage javaDataStorage, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(it, javaDataStorage.name, null, 4, null));
    }

    private final DataStore e(Context context) {
        return (DataStore) this.dataStore.getValue(context, f32720f[0]);
    }

    public final <T> boolean contains(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) h.b(null, new AnonymousClass1(key, null), 1, null)).booleanValue();
    }

    @NotNull
    public final Preferences editSync(@NotNull Function1<? super MutablePreferences, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (Preferences) h.b(null, new C35571(transform, null), 1, null);
    }

    @NotNull
    public final Map<Preferences.Key<?>, Object> getAllSync() {
        return (Map) h.b(null, new C35581(null), 1, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(@NotNull Preferences.Key<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) h.b(null, new C35591(key, defaultValue, null), 1, null);
    }

    @NotNull
    public final <T> Preferences putSync(@NotNull Preferences.Key<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Preferences) h.b(null, new C35601(key, value, null), 1, null);
    }
}
