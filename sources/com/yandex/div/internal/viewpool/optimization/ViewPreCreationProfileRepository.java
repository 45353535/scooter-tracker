package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import eg.g;
import eg.o0;
import hg.i;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.h0;
import kotlinx.serialization.json.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "defaultProfile", "<init>", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "", "id", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", y.f66058y, "ViewPreCreationProfileSerializer", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewPreCreationProfileRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = new WeakHashMap<>();

    @NotNull
    private final Context context;

    @NotNull
    private final ViewPreCreationProfile defaultProfile;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$Companion;", "", "()V", "STORE_PATH", "", "TAG", "stores", "Ljava/util/WeakHashMap;", "Landroidx/datastore/core/DataStore;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getStores", "()Ljava/util/WeakHashMap;", "getStoreForId", "Landroid/content/Context;", "id", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DataStore<ViewPreCreationProfile> getStoreForId(@NotNull final Context context, @NotNull final String str) {
            WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = getStores();
            DataStore<ViewPreCreationProfile> dataStoreCreate$default = stores.get(str);
            if (dataStoreCreate$default == null) {
                dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new Function0<File>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final File invoke() {
                        File filesDir = context.getFilesDir();
                        String str2 = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        return new File(filesDir, str2);
                    }
                }, 14, null);
                stores.put(str, dataStoreCreate$default);
            }
            return dataStoreCreate$default;
        }

        @NotNull
        public final WeakHashMap<String, DataStore<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/b;", "defaultValue", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getDefaultValue", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ViewPreCreationProfileSerializer implements Serializer<ViewPreCreationProfile> {

        @Nullable
        private static final ViewPreCreationProfile defaultValue = null;

        @NotNull
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();

        @NotNull
        private static final b json = v.b(null, new Function1<e, Unit>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
                invoke2(eVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull e eVar) {
                eVar.d(false);
            }
        }, 1, null);

        private ViewPreCreationProfileSerializer() {
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
            Object objB;
            try {
                Result.Companion companion = Result.f93230c;
                b bVar = json;
                objB = Result.b((ViewPreCreationProfile) h0.a(bVar, ug.v.b(bVar.a(), v0.h(ViewPreCreationProfile.class)), inputStream));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thG);
            }
            if (Result.i(objB)) {
                return null;
            }
            return objB;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.datastore.core.Serializer
        @Nullable
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public Object writeTo(@Nullable ViewPreCreationProfile viewPreCreationProfile, @NotNull OutputStream outputStream, @NotNull Continuation continuation) {
            Object objB;
            try {
                Result.Companion companion = Result.f93230c;
                b bVar = json;
                h0.b(bVar, ug.v.b(bVar.a(), v0.h(ViewPreCreationProfile.class)), viewPreCreationProfile, outputStream);
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thG);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = ViewPreCreationProfileRepository.this.new AnonymousClass2(this.$id, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objB;
            Object objX;
            Object objG = pf.b.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    d.b(obj);
                    ViewPreCreationProfileRepository viewPreCreationProfileRepository = ViewPreCreationProfileRepository.this;
                    String str = this.$id;
                    Result.Companion companion = Result.f93230c;
                    Flow data = ViewPreCreationProfileRepository.Companion.getStoreForId(viewPreCreationProfileRepository.context, str).getData();
                    this.label = 1;
                    objX = i.x(data, this);
                    if (objX == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.b(obj);
                    objX = obj;
                }
                objB = Result.b((ViewPreCreationProfile) objX);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thG);
            }
            if (Result.i(objB)) {
                objB = null;
            }
            ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) objB;
            return viewPreCreationProfile == null ? ViewPreCreationProfile.copy$default(ViewPreCreationProfileRepository.this.defaultProfile, this.$id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null) : viewPreCreationProfile;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public ViewPreCreationProfileRepository(@NotNull Context context, @NotNull ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    static /* synthetic */ Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, Continuation continuation) {
        return g.g(o0.b(), viewPreCreationProfileRepository.new AnonymousClass2(str, null), continuation);
    }

    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation continuation) {
        return get$suspendImpl(this, str, continuation);
    }
}
