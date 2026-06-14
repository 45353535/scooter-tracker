package com.unity3d.ads.core.data.datasource;

import com.google.common.net.HttpHeaders;
import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import eg.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import uf.i;
import vh.f;
import vh.j0;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;Lcom/unity3d/services/core/network/core/HttpClient;)V", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", "Ljava/io/File;", V5.c.f41892b, "", "url", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidRemoteCacheDataSource implements CacheDataSource {

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    @NotNull
    private final HttpClient httpClient;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", l = {51}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ File $cachePath;
        final /* synthetic */ String $fileName;
        final /* synthetic */ Integer $priority;
        final /* synthetic */ String $url;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AndroidRemoteCacheDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, Continuation continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = androidRemoteCacheDataSource;
            this.$cachePath = file;
            this.$fileName = str2;
            this.$priority = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            File fileInvoke;
            long length;
            File fileInvoke2;
            long j10;
            Object objExecute;
            String strW1;
            Object objB;
            Object objB2;
            f fVarC;
            String str;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String str2 = this.$url;
                if (str2 == null || str2.length() == 0) {
                    return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
                }
                fileInvoke = this.this$0.createFile.invoke(this.$cachePath, this.$fileName + ".part");
                if (!fileInvoke.exists()) {
                    fileInvoke.createNewFile();
                }
                length = fileInvoke.length();
                fileInvoke2 = this.this$0.createFile.invoke(this.$cachePath, this.$fileName + ".etag");
                File file = fileInvoke2.exists() ? fileInvoke2 : null;
                String strM = file != null ? i.m(file, null, 1, null) : null;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                if (length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    j10 = 0;
                    sb2.append("bytes=");
                    sb2.append(length);
                    sb2.append('-');
                    mapCreateMapBuilder.put("Range", CollectionsKt.listOf(sb2.toString()));
                } else {
                    j10 = 0;
                }
                if (strM != null) {
                    mapCreateMapBuilder.put(HttpHeaders.IF_RANGE, CollectionsKt.listOf('\"' + strM + '\"'));
                }
                Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                Integer num = this.$priority;
                HttpRequest httpRequest = new HttpRequest(this.$url, null, null, null, mapBuild, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
                HttpClient httpClient = this.this$0.httpClient;
                this.L$0 = coroutineScope;
                this.L$1 = fileInvoke;
                this.L$2 = fileInvoke2;
                this.J$0 = length;
                this.label = 1;
                objExecute = httpClient.execute(httpRequest, true, this);
                if (objExecute == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.J$0;
                fileInvoke2 = (File) this.L$2;
                fileInvoke = (File) this.L$1;
                d.b(obj);
                length = j11;
                j10 = 0;
                objExecute = obj;
            }
            HttpResponse httpResponse = (HttpResponse) objExecute;
            if (!HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            List<String> list = httpResponse.getHeaders().get("ETag");
            if (list == null || (str = (String) CollectionsKt.firstOrNull((List) list)) == null || (strW1 = StringsKt.w1(str, '\"')) == null) {
                strW1 = "";
            }
            if (strW1.length() <= 0) {
                strW1 = null;
            }
            if (strW1 != null) {
                i.p(fileInvoke2, strW1, null, 2, null);
            }
            if (length > j10 && httpResponse.getStatusCode() == 200) {
                fileInvoke.delete();
                fileInvoke.createNewFile();
            }
            Object body = httpResponse.getBody();
            InputStream inputStream = body instanceof InputStream ? (InputStream) body : null;
            if (inputStream == null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
            }
            t0 t0Var = new t0();
            try {
                Result.Companion companion = Result.f93230c;
                try {
                    byte[] bArr = new byte[8192];
                    j0 j0VarA = x.a(fileInvoke);
                    try {
                        fVarC = x.c(j0VarA);
                    } finally {
                    }
                    while (true) {
                        try {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                break;
                            }
                            fVarC.write(bArr, 0, i11);
                            fVarC.flush();
                            t0Var.f93331b += i11;
                        } finally {
                        }
                    }
                    Unit unit = Unit.f93236a;
                    c.a(fVarC, null);
                    c.a(j0VarA, null);
                    c.a(inputStream, null);
                    objB = Result.b(Unit.f93236a);
                } finally {
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, thG);
            }
            if (httpResponse.getStatusCode() != 206 ? httpResponse.getContentSize() == -1 ? fileInvoke.length() <= j10 : fileInvoke.length() != httpResponse.getContentSize() : fileInvoke.length() != httpResponse.getContentSize() + length) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
            }
            File file2 = new File(this.$cachePath, this.$fileName);
            try {
                if (file2.exists() && !file2.delete()) {
                    throw new IllegalStateException("Final file exists and could not be deleted before overwriting");
                }
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.f93230c;
                objB2 = Result.b(d.a(th3));
            }
            if (!fileInvoke.renameTo(file2)) {
                throw new IllegalStateException("Could not rename temporary file to final file");
            }
            if (fileInvoke2.exists() && !fileInvoke2.delete()) {
                throw new IllegalStateException("Could not delete Etag file after successful download");
            }
            objB2 = Result.b(Unit.f93236a);
            Throwable thG2 = Result.g(objB2);
            if (thG2 != null) {
                return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, thG2);
            }
            String str3 = this.$url;
            String str4 = this.$fileName;
            String strInvoke = this.this$0.getFileExtensionFromUrl.invoke(this.$url);
            String str5 = strInvoke == null ? "" : strInvoke;
            long j12 = t0Var.f93331b;
            String protocol = httpResponse.getProtocol();
            Integer num2 = this.$priority;
            return new CacheResult.Success(new CachedFile(str3, str4, file2, str5, j12, protocol, num2 != null ? num2.intValue() : Integer.MAX_VALUE), CacheSource.REMOTE);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidRemoteCacheDataSource(@NotNull CoroutineDispatcher ioDispatcher, @NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @Nullable
    public Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, @NotNull Continuation continuation) {
        return g.g(this.ioDispatcher, new AnonymousClass2(str2, this, file, str, num, null), continuation);
    }
}
