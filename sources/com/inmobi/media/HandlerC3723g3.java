package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerC3723g3 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38608a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3723g3(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    public final void a(S2 s22) {
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = s22.f37685b;
        b(s22);
        C4121w3.a(s22, "RETRY_EXHAUSTED");
        eg.h.b(null, new C3671e3(s22, null), 1, null);
        C4121w3.f39821f.remove(s22);
        if (C4121w3.f39821f.isEmpty()) {
            eg.h.b(null, new C3697f3(this, null), 1, null);
        }
    }

    public final void b(S2 s22) {
        int iIndexOf = CollectionsKt.indexOf((List<? extends S2>) C4121w3.f39821f, s22);
        if (-1 != iIndexOf) {
            S2 s23 = (S2) C4121w3.f39821f.get(iIndexOf == C4121w3.f39821f.size() + (-1) ? 0 : iIndexOf + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = s23.f37688e ? 3 : 2;
            messageObtain.obj = s23;
            long pingInterval = C4121w3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - s23.f37690g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (C4121w3.f39823h.get()) {
            try {
                int i10 = msg.what;
                int i11 = 3;
                if (i10 == 1) {
                    if (C4121w3.e()) {
                        AdConfig.ImaiConfig imaiConfigC = C4121w3.c();
                        W2 w22 = (W2) C4121w3.f39817b.getValue();
                        List list = (List) eg.h.b(null, new Z2(w22, imaiConfigC, null), 1, null);
                        C4121w3.f39821f = list;
                        if (list.isEmpty()) {
                            eg.h.b(null, new C3568a3(w22, this, imaiConfigC, null), 1, null);
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        for (S2 s22 : C4121w3.f39821f) {
                            C4121w3 c4121w3 = C4121w3.f39816a;
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            String str = s22.f37685b;
                        }
                        S2 s23 = (S2) C4121w3.f39821f.get(0);
                        Message messageObtain = Message.obtain();
                        if (!s23.f37688e) {
                            i11 = 2;
                        }
                        messageObtain.what = i11;
                        messageObtain.obj = s23;
                        long jCurrentTimeMillis = System.currentTimeMillis() - s23.f37690g;
                        if (jCurrentTimeMillis < imaiConfigC.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain, ((long) (imaiConfigC.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain);
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (Re.a() != null) {
                        C4121w3.f39822g.set(false);
                        C4121w3.g();
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig imaiConfigC2 = C4121w3.c();
                    if (!(obj instanceof S2)) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((S2) obj).f37689f != 0) {
                        S2 s24 = (S2) obj;
                        long pingCacheExpiry = imaiConfigC2.getPingCacheExpiry();
                        s24.getClass();
                        if (System.currentTimeMillis() - s24.f37691h <= pingCacheExpiry * ((long) 1000)) {
                            if ((imaiConfigC2.getMaxRetries() - ((S2) obj).f37689f) + 1 == 0) {
                                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                                String str2 = ((S2) obj).f37685b;
                            } else {
                                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                                String str3 = ((S2) obj).f37685b;
                            }
                            eg.h.b(null, new C3594b3((S2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((S2) obj);
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        Unit unit = Unit.f93236a;
                        return;
                    }
                    Object obj2 = msg.obj;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    S2 click = (S2) obj2;
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    String str4 = click.f37685b;
                    LinkedHashMap linkedHashMap = C4121w3.f39825j;
                    C3565a0 c3565a0 = (C3565a0) linkedHashMap.get(Integer.valueOf(click.f37684a));
                    if (c3565a0 != null) {
                        Intrinsics.checkNotNullParameter(click, "click");
                        c3565a0.f38138a.a(c3565a0.f38139b);
                    }
                    linkedHashMap.remove(Integer.valueOf(click.f37684a));
                    eg.h.b(null, new C3646d3(click, this, null), 1, null);
                    return;
                }
                if (Re.a() != null) {
                    C4121w3.f39822g.set(false);
                    C4121w3.g();
                    return;
                }
                Object obj3 = msg.obj;
                AdConfig.ImaiConfig imaiConfigC3 = C4121w3.c();
                if (!(obj3 instanceof S2)) {
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    return;
                }
                if (((S2) obj3).f37689f != 0) {
                    S2 s25 = (S2) obj3;
                    long pingCacheExpiry2 = imaiConfigC3.getPingCacheExpiry();
                    s25.getClass();
                    if (System.currentTimeMillis() - s25.f37691h <= pingCacheExpiry2 * ((long) 1000)) {
                        if ((imaiConfigC3.getMaxRetries() - ((S2) obj3).f37689f) + 1 == 0) {
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            String str5 = ((S2) obj3).f37685b;
                        } else {
                            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                            String str6 = ((S2) obj3).f37685b;
                        }
                        new C3773i3(new C3620c3(this)).a((S2) obj3);
                        Unit unit2 = Unit.f93236a;
                        return;
                    }
                }
                a((S2) obj3);
            } catch (Exception e10) {
                C4121w3 c4121w32 = C4121w3.f39816a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                e10.getMessage();
            }
        }
    }
}
