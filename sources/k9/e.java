package k9;

import android.content.Context;
import io.bidmachine.BidMachineSharedPreferenceKt;
import io.bidmachine.SessionManagerKtWrapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f93045b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f93046a;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f93047f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final zd.a invoke() {
            zd.a aVarA = zd.a.f119343e.a("3.5.0");
            if (aVarA != null) {
                return aVarA;
            }
            io.bidmachine.core.a.g("Unexpected version parsing error: 3.5.0");
            return new zd.a(0, 0, 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final f e(Context context, SessionManagerKtWrapper sessionManagerKtWrapper) {
        zd.a aVarH;
        zd.a aVar = (zd.a) this.f93046a.invoke();
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        List historyVersionMilestoneList = bidMachineSharedPreferenceKt.getHistoryVersionMilestoneList(context);
        f currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        Object next = null;
        zd.a aVarH2 = currentVersionMilestone != null ? currentVersionMilestone.h() : null;
        if (Intrinsics.areEqual(aVar, aVarH2)) {
            return currentVersionMilestone;
        }
        long sessionStartTime = sessionManagerKtWrapper.getSessionStartTime();
        zd.a aVar2 = aVarH2;
        f fVar = new f(aVar, 0, sessionStartTime, sessionStartTime, 0L, 0L);
        List mutableList = CollectionsKt.toMutableList((Collection) historyVersionMilestoneList);
        if (currentVersionMilestone != null) {
            mutableList.add(f.b(currentVersionMilestone, null, 0, 0L, 0L, 0L, currentVersionMilestone.c(), 15, null));
        }
        bidMachineSharedPreferenceKt.setHistoryVersionMilestoneList(context, mutableList);
        if (aVar2 == null) {
            h(context, sessionStartTime);
            return fVar;
        }
        if (aVar.compareTo(aVar2) < 0) {
            f(aVar2, aVar);
            return fVar;
        }
        Iterator it = historyVersionMilestoneList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                zd.a aVarH3 = ((f) next).h();
                do {
                    Object next2 = it.next();
                    zd.a aVarH4 = ((f) next2).h();
                    if (aVarH3.compareTo(aVarH4) < 0) {
                        next = next2;
                        aVarH3 = aVarH4;
                    }
                } while (it.hasNext());
            }
        }
        f fVar2 = (f) next;
        if (fVar2 == null || (aVarH = fVar2.h()) == null) {
            aVarH = aVar2;
        }
        m(aVar2, aVar, aVarH);
        return fVar;
    }

    private final void f(final zd.a aVar, final zd.a aVar2) {
        io.bidmachine.core.a.l("VersionManager", new ce.b() { // from class: k9.c
            @Override // ce.b
            public final Object get() {
                return e.g(aVar, aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(zd.a from, zd.a to) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(to, "$to");
        return "Downgrade detected: " + from + " -> " + to;
    }

    private final void h(Context context, long j10) {
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        if (bidMachineSharedPreferenceKt.hasBMIFV(context)) {
            io.bidmachine.core.a.c("VersionManager", "Migration from old version detected");
        } else {
            io.bidmachine.core.a.c("VersionManager", "Install detected");
            bidMachineSharedPreferenceKt.setSdkInstallTime(context, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(f fVar) {
        return "Pause session, milestone updated:\n" + fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(f fVar) {
        return "New session, milestone updated:\n" + fVar;
    }

    private final void m(final zd.a aVar, final zd.a aVar2, final zd.a aVar3) {
        io.bidmachine.core.a.b("VersionManager", new ce.b() { // from class: k9.d
            @Override // ce.b
            public final Object get() {
                return e.n(aVar, aVar2, aVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(zd.a from, zd.a to, zd.a aVar) {
        Intrinsics.checkNotNullParameter(from, "$from");
        Intrinsics.checkNotNullParameter(to, "$to");
        return "Upgrade detected: " + from + " -> " + to + ", last max version: " + aVar;
    }

    public final void i(Context context, SessionManagerKtWrapper sessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        f currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        final f fVarB = currentVersionMilestone != null ? f.b(currentVersionMilestone, null, 0, 0L, 0L, sessionManager.getSessionDurationMs(), 0L, 47, null) : null;
        bidMachineSharedPreferenceKt.setCurrentVersionMilestone(context, fVarB);
        io.bidmachine.core.a.b("VersionManager", new ce.b() { // from class: k9.b
            @Override // ce.b
            public final Object get() {
                return e.j(fVarB);
            }
        });
    }

    public final void k(Context context, SessionManagerKtWrapper sessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        f fVarE = e(context, sessionManager);
        final f fVarB = fVarE != null ? f.b(fVarE, null, fVarE.g() + 1, 0L, sessionManager.getSessionStartTime(), sessionManager.getSessionDurationMs(), fVarE.c(), 5, null) : null;
        BidMachineSharedPreferenceKt.INSTANCE.setCurrentVersionMilestone(context, fVarB);
        io.bidmachine.core.a.b("VersionManager", new ce.b() { // from class: k9.a
            @Override // ce.b
            public final Object get() {
                return e.l(fVarB);
            }
        });
    }

    public e(Function0 currentVersionProvider) {
        Intrinsics.checkNotNullParameter(currentVersionProvider, "currentVersionProvider");
        this.f93046a = currentVersionProvider;
    }

    public /* synthetic */ e(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.f93047f : function0);
    }
}
