package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Session;
import j$.util.Objects;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
final class w5 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82011a;

        static {
            int[] iArr = new int[AdsType.values().length];
            f82011a = iArr;
            try {
                iArr[AdsType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82011a[AdsType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82011a[AdsType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82011a[AdsType.Native.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    w5() {
    }

    public static /* synthetic */ void d(Session.Context.Builder builder, Object obj) {
        if (obj instanceof Boolean) {
            builder.setIap(BoolValue.of(((Boolean) obj).booleanValue()));
        }
    }

    private ContextualData.Builder i(AdsType adsType, String str, Map map) {
        try {
            final ContextualData.Builder mediatorName = ContextualData.newBuilder().setMediatorName(str);
            io.bidmachine.core.h.F(adsType, new Executable() { // from class: io.bidmachine.p5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    mediatorName.setPlacement(((AdsType) obj).getName());
                }
            });
            ContextualData.ImpressionData.Builder builderJ = j(map);
            Objects.requireNonNull(mediatorName);
            io.bidmachine.core.h.F(builderJ, new Executable() { // from class: io.bidmachine.q5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    mediatorName.setData((ContextualData.ImpressionData.Builder) obj);
                }
            });
            return mediatorName;
        } catch (Throwable unused) {
            return null;
        }
    }

    private ContextualData.ImpressionData.Builder j(Map map) {
        try {
            final ContextualData.ImpressionData.Builder builderNewBuilder = ContextualData.ImpressionData.newBuilder();
            Integer numK = io.bidmachine.core.h.k(map.get("imimd"), null);
            Objects.requireNonNull(builderNewBuilder);
            io.bidmachine.core.h.F(numK, new Executable() { // from class: io.bidmachine.r5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImimd(((Integer) obj).intValue());
                }
            });
            io.bidmachine.core.h.F(io.bidmachine.core.h.k(map.get("imd"), null), new Executable() { // from class: io.bidmachine.s5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImd(((Integer) obj).intValue());
                }
            });
            io.bidmachine.core.h.F(io.bidmachine.core.h.j(map.get("imwp"), null), new Executable() { // from class: io.bidmachine.t5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImwp(((Float) obj).floatValue());
                }
            });
            io.bidmachine.core.h.F(io.bidmachine.core.h.j(map.get("wp"), null), new Executable() { // from class: io.bidmachine.u5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setWp(((Float) obj).floatValue());
                }
            });
            io.bidmachine.core.h.F(map.get("imagency"), new Executable() { // from class: io.bidmachine.v5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImagency(obj.toString());
                }
            });
            io.bidmachine.core.h.F(map.get("agency"), new Executable() { // from class: io.bidmachine.k5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setAgency(obj.toString());
                }
            });
            io.bidmachine.core.h.F(map.get("imcurl"), new Executable() { // from class: io.bidmachine.l5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setImcurl(obj.toString());
                }
            });
            io.bidmachine.core.h.F(map.get("clcurl"), new Executable() { // from class: io.bidmachine.m5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    builderNewBuilder.setClcurl(obj.toString());
                }
            });
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Session.Builder k(Context context, AdsType adsType) {
        try {
            final Session.Builder sessionId = Session.newBuilder().setSessionId(SessionManager.get().getSessionId());
            Session.Context.Builder builderL = l(context, adsType);
            Objects.requireNonNull(sessionId);
            io.bidmachine.core.h.F(builderL, new Executable() { // from class: io.bidmachine.j5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    sessionId.setContext((Session.Context.Builder) obj);
                }
            });
            return sessionId;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Session.Context.Builder l(Context context, AdsType adsType) {
        try {
            Date date = new Date(n2.C(context));
            SessionManager sessionManager = SessionManager.get();
            final Session.Context.Builder retention = Session.Context.newBuilder().setSessionduration(sessionManager.getSessionDurationSec()).setLastSessionDuration(sessionManager.getLastSessionDurationSec()).setSc(SessionManager.get().getSessionCount()).setRetention(fe.a.c(date, new Date(io.bidmachine.core.c.a())));
            for (Map.Entry<String, Map<String, Object>> entry : BidMachineAnalytics.getImpData(m(adsType)).entrySet()) {
                Map<String, Object> value = entry.getValue();
                if (!value.isEmpty()) {
                    ContextualData.Builder builderI = i(adsType, entry.getKey(), value);
                    Objects.requireNonNull(retention);
                    io.bidmachine.core.h.F(builderI, new Executable() { // from class: io.bidmachine.n5
                        @Override // io.bidmachine.Executable
                        public final void execute(Object obj) {
                            retention.addData((ContextualData.Builder) obj);
                        }
                    });
                }
            }
            io.bidmachine.core.h.F(BidMachineAnalytics.getProperty("iap"), new Executable() { // from class: io.bidmachine.o5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    w5.d(retention, obj);
                }
            });
            return retention;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int m(AdsType adsType) {
        if (adsType == null) {
            return 0;
        }
        int i10 = a.f82011a[adsType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 0;
                    }
                }
            }
        }
        return i11;
    }

    void g(Context context, Context.User.Builder builder, AdsType adsType) {
        Session.Builder builderK = k(context, adsType);
        if (builderK != null) {
            builder.addExtProto(Any.pack(builderK.build()));
        }
    }

    void h(android.content.Context context, RequestTokenPayload.Builder builder, AdsType adsType) {
        Session.Builder builderK = k(context, adsType);
        if (builderK != null) {
            builder.setSession(builderK);
        }
    }
}
