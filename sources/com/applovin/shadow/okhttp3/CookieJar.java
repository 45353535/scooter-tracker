package com.applovin.shadow.okhttp3;

import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/CookieJar;", "", "loadForRequest", "", "Lcom/applovin/shadow/okhttp3/Cookie;", "url", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "saveFromResponse", "", "cookies", y.f66058y, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CookieJar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcom/applovin/shadow/okhttp3/CookieJar$Companion;", "", "()V", "NO_COOKIES", "Lcom/applovin/shadow/okhttp3/CookieJar;", "NoCookies", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/CookieJar$Companion$NoCookies;", "Lcom/applovin/shadow/okhttp3/CookieJar;", "()V", "loadForRequest", "", "Lcom/applovin/shadow/okhttp3/Cookie;", "url", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "saveFromResponse", "", "cookies", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class NoCookies implements CookieJar {
            @Override // com.applovin.shadow.okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // com.applovin.shadow.okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    @NotNull
    List<Cookie> loadForRequest(@NotNull HttpUrl url);

    void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies);
}
