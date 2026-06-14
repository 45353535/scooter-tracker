package com.vungle.ads.internal.session;

import android.content.Context;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u0002H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0082\b¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170 J\u0016\u0010#\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", JsonStorageKeyNames.SESSION_ID_KEY, "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", C4240b4.i.f42616b, "Ljava/io/File;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", C4240b4.i.f42650s, "", "unclosedAdList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "addUnclosedAd", "", "ad", "decodeJson", "T", "jsonString", "(Ljava/lang/String;)Ljava/lang/Object;", "readUnclosedAdFromFile", "", "removeUnclosedAd", "retrieveUnclosedAd", "writeUnclosedAdToFile", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnclosedAdDetector {

    @NotNull
    private static final String FILENAME = "unclosed_ad";

    @NotNull
    private final Context context;

    @NotNull
    private final Executors executors;

    @NotNull
    private File file;

    @NotNull
    private final PathProvider pathProvider;
    private boolean ready;

    @NotNull
    private final String sessionId;

    @NotNull
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;

    @NotNull
    private static final kotlinx.serialization.json.b json = v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            invoke2(eVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull e Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    public UnclosedAdDetector(@NotNull Context context, @NotNull String sessionId, @NotNull Executors executors, @NotNull PathProvider pathProvider) {
        Object objB;
        boolean zJ;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zJ = true;
        } else {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thG.getMessage());
            }
            zJ = Result.j(objB);
        }
        this.ready = zJ;
    }

    private final /* synthetic */ <T> T decodeJson(String jsonString) {
        kotlinx.serialization.json.b bVar = json;
        ah.b bVarA = bVar.a();
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer kSerializerB = ug.v.b(bVarA, null);
        Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) bVar.c(kSerializerB, jsonString);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? CollectionsKt.emptyList() : (List) new FutureResult(this.executors.getIO_EXECUTOR().submit(new Callable() { // from class: com.vungle.ads.internal.session.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m7555readUnclosedAdFromFile$lambda4(this.f68064b);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m7555readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                kotlinx.serialization.json.b bVar = json;
                KSerializer kSerializerB = ug.v.b(bVar.a(), v0.p(List.class, KTypeProjection.INSTANCE.invariant(v0.o(UnclosedAd.class))));
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) bVar.c(kSerializerB, string);
            }
            return new ArrayList();
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m7556retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> unclosedAdList) {
        if (this.ready) {
            try {
                kotlinx.serialization.json.b bVar = json;
                KSerializer kSerializerB = ug.v.b(bVar.a(), v0.p(List.class, KTypeProjection.INSTANCE.invariant(v0.o(UnclosedAd.class))));
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strB = bVar.b(kSerializerB, unclosedAdList);
                this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnclosedAdDetector.m7557writeUnclosedAdToFile$lambda5(this.f68066b, strB);
                    }
                });
            } catch (Throwable th2) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m7557writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(@NotNull UnclosedAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        if (this.ready) {
            ad2.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Executors getExecutors() {
        return this.executors;
    }

    @NotNull
    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(@NotNull UnclosedAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        if (this.ready && this.unclosedAdList.contains(ad2)) {
            this.unclosedAdList.remove(ad2);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m7556retrieveUnclosedAd$lambda3(this.f68065b);
            }
        });
        return arrayList;
    }
}
