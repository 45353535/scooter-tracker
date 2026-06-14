package io.bidmachine;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes12.dex */
public class UrlProvider {

    @NonNull
    private static final String PATH_AUCTION = "auction";

    @NonNull
    private static final String PATH_INIT = "init";

    @NonNull
    private static final String PATH_RTB = "rtb";

    @NonNull
    private static final String PATH_V3 = "v3";

    @Nullable
    private static String auctionUrlFromInit;

    @Nullable
    private static String auctionUrlFromSuccessRequest;

    @NonNull
    private static final String DEF_BASE_URL = "https://api.bidmachine.io";

    @NonNull
    private static final String[] DEF_BASE_URLS = {DEF_BASE_URL, "https://x.everestop.io", "https://x.blueduckredapple.com", "https://x.thecatmachine.com"};

    @NonNull
    private static final Queue<String> INIT_URL_QUEUE = new ConcurrentLinkedQueue();

    @NonNull
    private static final Queue<String> AUCTION_URL_QUEUE = new ConcurrentLinkedQueue();

    class a extends ConcurrentLinkedQueue {
        a() {
            add(UrlProvider.auctionUrlFromInit);
        }
    }

    class b extends ConcurrentLinkedQueue {
        b() {
            add(UrlProvider.auctionUrlFromSuccessRequest);
        }
    }

    static {
        setupUrls();
    }

    @NonNull
    private static String createAuctionUrl(@NonNull Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath(PATH_RTB).appendPath(PATH_V3).toString();
    }

    @NonNull
    private static String createInitUrl(@NonNull Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath("init").toString();
    }

    @NonNull
    static Queue<String> getAuctionUrlQueue() {
        return !TextUtils.isEmpty(auctionUrlFromInit) ? new a() : !TextUtils.isEmpty(auctionUrlFromSuccessRequest) ? new b() : new ConcurrentLinkedQueue(AUCTION_URL_QUEUE);
    }

    @NonNull
    static Queue<String> getInitUrlQueue() {
        return new ConcurrentLinkedQueue(INIT_URL_QUEUE);
    }

    @VisibleForTesting
    static void reset() {
        setupUrls();
        auctionUrlFromInit = null;
        auctionUrlFromSuccessRequest = null;
    }

    static void setAuctionUrl(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = AUCTION_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    static synchronized void setAuctionUrlFromInit(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromInit = str;
    }

    static void setAuctionUrlFromSuccessRequest(@NonNull String str) {
        if (auctionUrlFromSuccessRequest != null || TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromSuccessRequest = str;
    }

    static void setEndpoint(@NonNull final String str) {
        if (!io.bidmachine.core.h.M(str)) {
            io.bidmachine.core.a.e(new ce.b() { // from class: io.bidmachine.c6
                @Override // ce.b
                public final Object get() {
                    return String.format("Endpoint has an invalid format - %s", str);
                }
            });
        } else {
            if (j2.e().B()) {
                io.bidmachine.core.a.g("Can't change endpoint url after initialization");
                return;
            }
            Uri uri = Uri.parse(str);
            setInitUrl(createInitUrl(uri));
            setAuctionUrl(createAuctionUrl(uri));
        }
    }

    static void setInitUrl(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = INIT_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    private static void setupAuctionUrls(@NonNull Collection<String> collection, @NonNull String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createAuctionUrl(Uri.parse(str)));
        }
    }

    private static void setupInitUrls(@NonNull Collection<String> collection, @NonNull String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createInitUrl(Uri.parse(str)));
        }
    }

    @VisibleForTesting
    static void setupUrls() {
        Queue<String> queue = INIT_URL_QUEUE;
        String[] strArr = DEF_BASE_URLS;
        setupInitUrls(queue, strArr);
        setupAuctionUrls(AUCTION_URL_QUEUE, strArr);
    }
}
