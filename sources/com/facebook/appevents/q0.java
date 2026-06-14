package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19714c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f19715b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f19716c = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f19717b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(HashMap proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.f19717b = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new q0(this.f19717b);
        }
    }

    public q0() {
        this.f19715b = new HashMap();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f19715b);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final void a(com.facebook.appevents.a accessTokenAppIdPair, List appEvents) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!this.f19715b.containsKey(accessTokenAppIdPair)) {
                this.f19715b.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List list = (List) this.f19715b.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final Set d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Set setEntrySet = this.f19715b.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public q0(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap map = new HashMap();
        this.f19715b = map;
        map.putAll(appEventMap);
    }
}
