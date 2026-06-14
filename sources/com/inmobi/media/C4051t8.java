package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4051t8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4101v8 f39580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4051t8(C4101v8 c4101v8, Continuation continuation) {
        super(2, continuation);
        this.f39580b = c4101v8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4051t8 c4051t8 = new C4051t8(this.f39580b, continuation);
        c4051t8.f39579a = obj;
        return c4051t8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4051t8 c4051t8 = new C4051t8(this.f39580b, (Continuation) obj2);
        c4051t8.f39579a = (Rl) obj;
        return c4051t8.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        pf.b.g();
        kotlin.d.b(obj);
        Rl mediaEvent = (Rl) this.f39579a;
        this.f39580b.a(mediaEvent);
        C3887mi c3887mi = this.f39580b.f39746b;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C3651d8) {
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = ((C3651d8) mediaEvent).f38431a;
                Map mapA = c3887mi.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoUrls", htmlVideoPlayerRequest.getVideoFiles());
                jSONObject.put("autoplay", htmlVideoPlayerRequest.getConfig().getAutoplay());
                jSONObject.put("muted", htmlVideoPlayerRequest.getConfig().getMuted());
                mapA.put("payload", jSONObject.toString());
                Wj wj = Wj.f37959a;
                Wj.b("VideoLoadStarted", mapA, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C3728g8) {
                C3728g8 c3728g8 = (C3728g8) mediaEvent;
                Map mapA2 = c3887mi.a();
                Long latency = c3728g8.f38620a.getLatency();
                mapA2.put("latency", Long.valueOf(latency != null ? latency.longValue() : -1L));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("videoUrl", c3728g8.f38620a.getVideoUrl());
                jSONObject2.put("cacheProgress", c3728g8.f38621b);
                mapA2.put("payload", jSONObject2.toString());
                Wj wj2 = Wj.f37959a;
                Wj.b("VideoLoadSuccess", mapA2, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C3842kn) {
                Map mapA3 = c3887mi.a();
                Wj wj3 = Wj.f37959a;
                Wj.b("VideoStart", mapA3, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C4165xm) {
                Map mapA4 = c3887mi.a();
                Wj wj4 = Wj.f37959a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C3792in) {
                Map mapA5 = c3887mi.a();
                Wj wj5 = Wj.f37959a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C4016rn) {
                Map mapA6 = c3887mi.a();
                Wj wj6 = Wj.f37959a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof Pl) {
                Map mapA7 = c3887mi.a();
                Wj wj7 = Wj.f37959a;
                Wj.b("VideoComplete", mapA7, EnumC3585ak.f38215a);
            } else if (mediaEvent instanceof C3599b8) {
                C3599b8 c3599b8 = (C3599b8) mediaEvent;
                Map mapA8 = c3887mi.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("videoUrls", c3599b8.f38252a.getVideoFiles());
                mapA8.put("payload", jSONObject3.toString());
                mapA8.put("errorCode", Short.valueOf(c3599b8.f38253b));
                Wj wj8 = Wj.f37959a;
                Wj.b("VideoLoadFailure", mapA8, EnumC3585ak.f38215a);
            }
        }
        return Unit.f93236a;
    }
}
