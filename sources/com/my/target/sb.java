package com.my.target;

import android.content.Context;
import com.my.target.common.models.VideoData;
import com.my.target.u5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f60817a;

    public class a implements u5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VideoData f60818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f60819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p5 f60820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f60821d;

        public a(VideoData videoData, CountDownLatch countDownLatch, p5 p5Var, String str) {
            this.f60818a = videoData;
            this.f60819b = countDownLatch;
            this.f60820c = p5Var;
            this.f60821d = str;
        }

        @Override // com.my.target.u5.a
        public void a(String str) {
            this.f60818a.a(str);
            this.f60819b.countDown();
        }

        @Override // com.my.target.u5.a
        public void a() {
            this.f60818a.a(null);
            this.f60819b.countDown();
            this.f60820c.f60519b.c(0, 4001, "videoUrl=" + this.f60821d);
        }
    }

    public sb(List list) {
        this.f60817a = list;
    }

    public static sb a(VideoData videoData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p5(videoData, h0.f59787e));
        return a(arrayList);
    }

    public static sb a(List list) {
        return new sb(list);
    }

    public void a(Context context) {
        if (f0.a()) {
            gb.b("VideoLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.f60817a.size());
        for (p5 p5Var : this.f60817a) {
            VideoData videoData = (VideoData) p5Var.f60518a;
            String url = videoData.getUrl();
            rb.a().b(url, new a(videoData, countDownLatch, p5Var, url), context);
        }
        try {
            countDownLatch.await();
            gb.a("VideoLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            gb.a("VideoLoaderUtils: awaiting media files load failed");
        }
    }
}
