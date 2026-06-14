package com.yandex.div.core;

import android.net.Uri;
import com.taurusx.tax.f.y;
import com.yandex.div.core.images.LoadReference;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0004\b\t\n\u000bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor;", "", "execute", "Lcom/yandex/div/core/images/LoadReference;", "request", "Lcom/yandex/div/core/DivRequestExecutor$Request;", "callback", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "Callback", y.f66058y, "Header", "Request", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivRequestExecutor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final DivRequestExecutor STUB = new DivRequestExecutor$Companion$STUB$1();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Callback;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/DivRequestExecutor;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Header;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Header {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Header(@NotNull String str, @NotNull String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/DivRequestExecutor$Request;", "", "Landroid/net/Uri;", "url", "", "method", "", "Lcom/yandex/div/core/DivRequestExecutor$Header;", "headers", "body", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "getBody", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request {

        @NotNull
        private final String body;

        @Nullable
        private final List<Header> headers;

        @NotNull
        private final String method;

        @NotNull
        private final Uri url;

        public Request(@NotNull Uri uri, @NotNull String str, @Nullable List<Header> list, @NotNull String str2) {
            this.url = uri;
            this.method = str;
            this.headers = list;
            this.body = str2;
        }
    }

    @NotNull
    LoadReference execute(@NotNull Request request, @Nullable Callback callback);
}
